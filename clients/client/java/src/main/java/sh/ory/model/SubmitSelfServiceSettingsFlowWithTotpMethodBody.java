/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.32
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

/**
 * SubmitSelfServiceSettingsFlowWithTotpMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T12:05:02.327264571Z[Etc/UTC]")
public class SubmitSelfServiceSettingsFlowWithTotpMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TOTP_CODE = "totp_code";
  @SerializedName(SERIALIZED_NAME_TOTP_CODE)
  private String totpCode;

  public static final String SERIALIZED_NAME_TOTP_UNLINK = "totp_unlink";
  @SerializedName(SERIALIZED_NAME_TOTP_UNLINK)
  private Boolean totpUnlink;

  public SubmitSelfServiceSettingsFlowWithTotpMethodBody() { 
  }

  public SubmitSelfServiceSettingsFlowWithTotpMethodBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * CSRFToken is the anti-CSRF token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSRFToken is the anti-CSRF token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceSettingsFlowWithTotpMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to \&quot;totp\&quot; when trying to add, update, or remove a totp pairing.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method  Should be set to \"totp\" when trying to add, update, or remove a totp pairing.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceSettingsFlowWithTotpMethodBody totpCode(String totpCode) {
    
    this.totpCode = totpCode;
    return this;
  }

   /**
   * ValidationTOTP must contain a valid TOTP based on the
   * @return totpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ValidationTOTP must contain a valid TOTP based on the")

  public String getTotpCode() {
    return totpCode;
  }


  public void setTotpCode(String totpCode) {
    this.totpCode = totpCode;
  }


  public SubmitSelfServiceSettingsFlowWithTotpMethodBody totpUnlink(Boolean totpUnlink) {
    
    this.totpUnlink = totpUnlink;
    return this;
  }

   /**
   * UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.
   * @return totpUnlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.")

  public Boolean getTotpUnlink() {
    return totpUnlink;
  }


  public void setTotpUnlink(Boolean totpUnlink) {
    this.totpUnlink = totpUnlink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceSettingsFlowWithTotpMethodBody submitSelfServiceSettingsFlowWithTotpMethodBody = (SubmitSelfServiceSettingsFlowWithTotpMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceSettingsFlowWithTotpMethodBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceSettingsFlowWithTotpMethodBody.method) &&
        Objects.equals(this.totpCode, submitSelfServiceSettingsFlowWithTotpMethodBody.totpCode) &&
        Objects.equals(this.totpUnlink, submitSelfServiceSettingsFlowWithTotpMethodBody.totpUnlink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, totpCode, totpUnlink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceSettingsFlowWithTotpMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    totpCode: ").append(toIndentedString(totpCode)).append("\n");
    sb.append("    totpUnlink: ").append(toIndentedString(totpUnlink)).append("\n");
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

}

