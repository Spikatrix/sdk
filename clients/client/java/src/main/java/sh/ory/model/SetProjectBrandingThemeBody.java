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
import sh.ory.model.ProjectBrandingColors;

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
 * Set Project Branding Theme Request Parameters
 */
@ApiModel(description = "Set Project Branding Theme Request Parameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-20T11:12:06.451982883Z[Etc/UTC]")
public class SetProjectBrandingThemeBody {
  public static final String SERIALIZED_NAME_LOGO_TYPE = "logo_type";
  @SerializedName(SERIALIZED_NAME_LOGO_TYPE)
  private String logoType;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private ProjectBrandingColors theme;

  public SetProjectBrandingThemeBody() {
  }

  public SetProjectBrandingThemeBody logoType(String logoType) {
    
    this.logoType = logoType;
    return this;
  }

   /**
   * Logo type
   * @return logoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Logo type")

  public String getLogoType() {
    return logoType;
  }


  public void setLogoType(String logoType) {
    this.logoType = logoType;
  }


  public SetProjectBrandingThemeBody logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Logo URL
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Logo URL")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public SetProjectBrandingThemeBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Branding name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Branding name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SetProjectBrandingThemeBody theme(ProjectBrandingColors theme) {
    
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectBrandingColors getTheme() {
    return theme;
  }


  public void setTheme(ProjectBrandingColors theme) {
    this.theme = theme;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetProjectBrandingThemeBody setProjectBrandingThemeBody = (SetProjectBrandingThemeBody) o;
    return Objects.equals(this.logoType, setProjectBrandingThemeBody.logoType) &&
        Objects.equals(this.logoUrl, setProjectBrandingThemeBody.logoUrl) &&
        Objects.equals(this.name, setProjectBrandingThemeBody.name) &&
        Objects.equals(this.theme, setProjectBrandingThemeBody.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoType, logoUrl, name, theme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetProjectBrandingThemeBody {\n");
    sb.append("    logoType: ").append(toIndentedString(logoType)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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
    openapiFields.add("logo_type");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("theme");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetProjectBrandingThemeBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SetProjectBrandingThemeBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetProjectBrandingThemeBody is not found in the empty JSON string", SetProjectBrandingThemeBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetProjectBrandingThemeBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetProjectBrandingThemeBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("logo_type") != null && !jsonObj.get("logo_type").isJsonNull()) && !jsonObj.get("logo_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_type").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `theme`
      if (jsonObj.get("theme") != null && !jsonObj.get("theme").isJsonNull()) {
        ProjectBrandingColors.validateJsonObject(jsonObj.getAsJsonObject("theme"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetProjectBrandingThemeBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetProjectBrandingThemeBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetProjectBrandingThemeBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetProjectBrandingThemeBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SetProjectBrandingThemeBody>() {
           @Override
           public void write(JsonWriter out, SetProjectBrandingThemeBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetProjectBrandingThemeBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetProjectBrandingThemeBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetProjectBrandingThemeBody
  * @throws IOException if the JSON string is invalid with respect to SetProjectBrandingThemeBody
  */
  public static SetProjectBrandingThemeBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetProjectBrandingThemeBody.class);
  }

 /**
  * Convert an instance of SetProjectBrandingThemeBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

