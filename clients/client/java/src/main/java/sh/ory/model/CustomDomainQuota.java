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
 * Custom Domain Quota
 */
@ApiModel(description = "Custom Domain Quota")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-20T11:12:06.451982883Z[Etc/UTC]")
public class CustomDomainQuota {
  public static final String SERIALIZED_NAME_AVAILABLE_DOMAINS = "available_domains";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_DOMAINS)
  private Long availableDomains;

  public static final String SERIALIZED_NAME_CAN_USE = "can_use";
  @SerializedName(SERIALIZED_NAME_CAN_USE)
  private Boolean canUse;

  public static final String SERIALIZED_NAME_USED_DOMAINS = "used_domains";
  @SerializedName(SERIALIZED_NAME_USED_DOMAINS)
  private Long usedDomains;

  public CustomDomainQuota() {
  }

  public CustomDomainQuota availableDomains(Long availableDomains) {
    
    this.availableDomains = availableDomains;
    return this;
  }

   /**
   * Get availableDomains
   * @return availableDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAvailableDomains() {
    return availableDomains;
  }


  public void setAvailableDomains(Long availableDomains) {
    this.availableDomains = availableDomains;
  }


  public CustomDomainQuota canUse(Boolean canUse) {
    
    this.canUse = canUse;
    return this;
  }

   /**
   * Get canUse
   * @return canUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanUse() {
    return canUse;
  }


  public void setCanUse(Boolean canUse) {
    this.canUse = canUse;
  }


  public CustomDomainQuota usedDomains(Long usedDomains) {
    
    this.usedDomains = usedDomains;
    return this;
  }

   /**
   * Get usedDomains
   * @return usedDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDomains() {
    return usedDomains;
  }


  public void setUsedDomains(Long usedDomains) {
    this.usedDomains = usedDomains;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDomainQuota customDomainQuota = (CustomDomainQuota) o;
    return Objects.equals(this.availableDomains, customDomainQuota.availableDomains) &&
        Objects.equals(this.canUse, customDomainQuota.canUse) &&
        Objects.equals(this.usedDomains, customDomainQuota.usedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableDomains, canUse, usedDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDomainQuota {\n");
    sb.append("    availableDomains: ").append(toIndentedString(availableDomains)).append("\n");
    sb.append("    canUse: ").append(toIndentedString(canUse)).append("\n");
    sb.append("    usedDomains: ").append(toIndentedString(usedDomains)).append("\n");
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
    openapiFields.add("available_domains");
    openapiFields.add("can_use");
    openapiFields.add("used_domains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomDomainQuota
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomDomainQuota.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomDomainQuota is not found in the empty JSON string", CustomDomainQuota.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomDomainQuota.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomDomainQuota` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomDomainQuota.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomDomainQuota' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomDomainQuota> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomDomainQuota.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomDomainQuota>() {
           @Override
           public void write(JsonWriter out, CustomDomainQuota value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomDomainQuota read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomDomainQuota given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomDomainQuota
  * @throws IOException if the JSON string is invalid with respect to CustomDomainQuota
  */
  public static CustomDomainQuota fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomDomainQuota.class);
  }

 /**
  * Convert an instance of CustomDomainQuota to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

