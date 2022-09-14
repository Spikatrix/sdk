/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.42
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
import sh.ory.model.SubmitSelfServiceRecoveryFlowWithLinkMethodBody;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import sh.ory.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T14:39:53.752230157Z[Etc/UTC]")
public class SubmitSelfServiceRecoveryFlowBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SubmitSelfServiceRecoveryFlowBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubmitSelfServiceRecoveryFlowBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SubmitSelfServiceRecoveryFlowBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SubmitSelfServiceRecoveryFlowWithLinkMethodBody> adapterSubmitSelfServiceRecoveryFlowWithLinkMethodBody = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceRecoveryFlowWithLinkMethodBody.class));

            return (TypeAdapter<T>) new TypeAdapter<SubmitSelfServiceRecoveryFlowBody>() {
                @Override
                public void write(JsonWriter out, SubmitSelfServiceRecoveryFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SubmitSelfServiceRecoveryFlowWithLinkMethodBody`
                    if (value.getActualInstance() instanceof SubmitSelfServiceRecoveryFlowWithLinkMethodBody) {
                        JsonObject obj = adapterSubmitSelfServiceRecoveryFlowWithLinkMethodBody.toJsonTree((SubmitSelfServiceRecoveryFlowWithLinkMethodBody)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: SubmitSelfServiceRecoveryFlowWithLinkMethodBody");
                }

                @Override
                public SubmitSelfServiceRecoveryFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SubmitSelfServiceRecoveryFlowWithLinkMethodBody
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmitSelfServiceRecoveryFlowWithLinkMethodBody.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmitSelfServiceRecoveryFlowWithLinkMethodBody;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmitSelfServiceRecoveryFlowWithLinkMethodBody'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmitSelfServiceRecoveryFlowWithLinkMethodBody failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmitSelfServiceRecoveryFlowWithLinkMethodBody'", e);
                    }

                    if (match == 1) {
                        SubmitSelfServiceRecoveryFlowBody ret = new SubmitSelfServiceRecoveryFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SubmitSelfServiceRecoveryFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SubmitSelfServiceRecoveryFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public SubmitSelfServiceRecoveryFlowBody(SubmitSelfServiceRecoveryFlowWithLinkMethodBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SubmitSelfServiceRecoveryFlowWithLinkMethodBody", new GenericType<SubmitSelfServiceRecoveryFlowWithLinkMethodBody>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SubmitSelfServiceRecoveryFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SubmitSelfServiceRecoveryFlowWithLinkMethodBody
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SubmitSelfServiceRecoveryFlowWithLinkMethodBody) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SubmitSelfServiceRecoveryFlowWithLinkMethodBody");
    }

    /**
     * Get the actual instance, which can be the following:
     * SubmitSelfServiceRecoveryFlowWithLinkMethodBody
     *
     * @return The actual instance (SubmitSelfServiceRecoveryFlowWithLinkMethodBody)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmitSelfServiceRecoveryFlowWithLinkMethodBody`. If the actual instance is not `SubmitSelfServiceRecoveryFlowWithLinkMethodBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmitSelfServiceRecoveryFlowWithLinkMethodBody`
     * @throws ClassCastException if the instance is not `SubmitSelfServiceRecoveryFlowWithLinkMethodBody`
     */
    public SubmitSelfServiceRecoveryFlowWithLinkMethodBody getSubmitSelfServiceRecoveryFlowWithLinkMethodBody() throws ClassCastException {
        return (SubmitSelfServiceRecoveryFlowWithLinkMethodBody)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitSelfServiceRecoveryFlowBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with SubmitSelfServiceRecoveryFlowWithLinkMethodBody
    try {
      SubmitSelfServiceRecoveryFlowWithLinkMethodBody.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmitSelfServiceRecoveryFlowWithLinkMethodBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for SubmitSelfServiceRecoveryFlowBody with oneOf schemas: SubmitSelfServiceRecoveryFlowWithLinkMethodBody. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SubmitSelfServiceRecoveryFlowBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitSelfServiceRecoveryFlowBody
  * @throws IOException if the JSON string is invalid with respect to SubmitSelfServiceRecoveryFlowBody
  */
  public static SubmitSelfServiceRecoveryFlowBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitSelfServiceRecoveryFlowBody.class);
  }

 /**
  * Convert an instance of SubmitSelfServiceRecoveryFlowBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

