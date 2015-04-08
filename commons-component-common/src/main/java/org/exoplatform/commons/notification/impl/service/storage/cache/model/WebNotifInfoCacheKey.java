/*
 * Copyright (C) 2003-2014 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.exoplatform.commons.notification.impl.service.storage.cache.model;

import java.io.Serializable;

import org.exoplatform.commons.notification.impl.service.storage.cache.CacheKey;

public class WebNotifInfoCacheKey implements CacheKey, Serializable {
  private static final long serialVersionUID = 1L;
  private String id;

  private WebNotifInfoCacheKey(String id) {
    this.id = id;
  }
  
  public static WebNotifInfoCacheKey key(String id) {
    return new WebNotifInfoCacheKey(id);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    return  31 * ((id == null) ? 0 : id.hashCode());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof WebNotifInfoCacheKey))
      return false;
    WebNotifInfoCacheKey that = (WebNotifInfoCacheKey) obj;
    if (id != null ? !id.equals(that.id) : that.id != null)
      return false;

    return true;
  }

}
