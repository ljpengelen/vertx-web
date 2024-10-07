package io.vertx.ext.web.client;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.ext.web.client.CachingWebClientOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.client.CachingWebClientOptions} original class using Vert.x codegen.
 */
public class CachingWebClientOptionsConverter {

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CachingWebClientOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "enableVaryCaching":
          if (member.getValue() instanceof Boolean) {
            obj.setEnableVaryCaching((Boolean)member.getValue());
          }
          break;
        case "cachedStatusCodes":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<java.lang.Integer> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof Number)
                list.add(((Number)item).intValue());
            });
            obj.setCachedStatusCodes(list);
          }
          break;
        case "cachedMethods":
          if (member.getValue() instanceof JsonArray) {
            java.util.LinkedHashSet<io.vertx.core.http.HttpMethod> list =  new java.util.LinkedHashSet<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof String)
                list.add(new io.vertx.core.http.HttpMethod((java.lang.String)item));
            });
            obj.setCachedMethods(list);
          }
          break;
        case "varyCachingEnabled":
          break;
      }
    }
  }

   static void toJson(CachingWebClientOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(CachingWebClientOptions obj, java.util.Map<String, Object> json) {
    if (obj.getCachedStatusCodes() != null) {
      JsonArray array = new JsonArray();
      obj.getCachedStatusCodes().forEach(item -> array.add(item));
      json.put("cachedStatusCodes", array);
    }
    if (obj.getCachedMethods() != null) {
      JsonArray array = new JsonArray();
      obj.getCachedMethods().forEach(item -> array.add(item.toJson()));
      json.put("cachedMethods", array);
    }
    json.put("varyCachingEnabled", obj.isVaryCachingEnabled());
  }
}
