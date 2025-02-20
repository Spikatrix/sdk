/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.3
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * TokenPaginationHeaders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-20T11:12:06.451982883Z[Etc/UTC]")
public class TokenPaginationHeaders {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_X_TOTAL_COUNT = "x-total-count";
  @SerializedName(SERIALIZED_NAME_X_TOTAL_COUNT)
  private String xTotalCount;

  public TokenPaginationHeaders() {
  }

  public TokenPaginationHeaders link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public TokenPaginationHeaders xTotalCount(String xTotalCount) {
    
    this.xTotalCount = xTotalCount;
    return this;
  }

   /**
   * The total number of clients.  in: header
   * @return xTotalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of clients.  in: header")

  public String getxTotalCount() {
    return xTotalCount;
  }


  public void setxTotalCount(String xTotalCount) {
    this.xTotalCount = xTotalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPaginationHeaders tokenPaginationHeaders = (TokenPaginationHeaders) o;
    return Objects.equals(this.link, tokenPaginationHeaders.link) &&
        Objects.equals(this.xTotalCount, tokenPaginationHeaders.xTotalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, xTotalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPaginationHeaders {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    xTotalCount: ").append(toIndentedString(xTotalCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("link");
    openapiFields.add("x-total-count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenPaginationHeaders
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenPaginationHeaders.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenPaginationHeaders is not found in the empty JSON string", TokenPaginationHeaders.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokenPaginationHeaders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenPaginationHeaders` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("x-total-count") != null && !jsonObj.get("x-total-count").isJsonNull()) && !jsonObj.get("x-total-count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x-total-count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x-total-count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenPaginationHeaders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenPaginationHeaders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenPaginationHeaders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenPaginationHeaders.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenPaginationHeaders>() {
           @Override
           public void write(JsonWriter out, TokenPaginationHeaders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenPaginationHeaders read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenPaginationHeaders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenPaginationHeaders
  * @throws IOException if the JSON string is invalid with respect to TokenPaginationHeaders
  */
  public static TokenPaginationHeaders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenPaginationHeaders.class);
  }

 /**
  * Convert an instance of TokenPaginationHeaders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

