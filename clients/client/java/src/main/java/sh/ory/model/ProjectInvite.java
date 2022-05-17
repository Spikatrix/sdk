/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.177
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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ProjectInvite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T09:01:35.464247310Z[Etc/UTC]")
public class ProjectInvite {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INVITEE_EMAIL = "invitee_email";
  @SerializedName(SERIALIZED_NAME_INVITEE_EMAIL)
  private String inviteeEmail;

  public static final String SERIALIZED_NAME_INVITEE_ID = "invitee_id";
  @SerializedName(SERIALIZED_NAME_INVITEE_ID)
  private String inviteeId;

  public static final String SERIALIZED_NAME_OWNER_EMAIL = "owner_email";
  @SerializedName(SERIALIZED_NAME_OWNER_EMAIL)
  private String ownerEmail;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private UUID ownerId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ProjectInvite() { 
  }

  
  public ProjectInvite(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Project's Revision Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public ProjectInvite id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ProjectInvite inviteeEmail(String inviteeEmail) {
    
    this.inviteeEmail = inviteeEmail;
    return this;
  }

   /**
   * The invitee&#39;s email
   * @return inviteeEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The invitee's email")

  public String getInviteeEmail() {
    return inviteeEmail;
  }


  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }


  public ProjectInvite inviteeId(String inviteeId) {
    
    this.inviteeId = inviteeId;
    return this;
  }

   /**
   * Get inviteeId
   * @return inviteeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInviteeId() {
    return inviteeId;
  }


  public void setInviteeId(String inviteeId) {
    this.inviteeId = inviteeId;
  }


  public ProjectInvite ownerEmail(String ownerEmail) {
    
    this.ownerEmail = ownerEmail;
    return this;
  }

   /**
   * The invite owner&#39;s email Usually the project&#39;s owner email
   * @return ownerEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The invite owner's email Usually the project's owner email")

  public String getOwnerEmail() {
    return ownerEmail;
  }


  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }


  public ProjectInvite ownerId(UUID ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }


  public ProjectInvite projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public ProjectInvite status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The invite&#39;s status Keeps track of the invites status such as pending, accepted, declined, expired
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The invite's status Keeps track of the invites status such as pending, accepted, declined, expired")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


   /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Last Time Project's Revision was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInvite projectInvite = (ProjectInvite) o;
    return Objects.equals(this.createdAt, projectInvite.createdAt) &&
        Objects.equals(this.id, projectInvite.id) &&
        Objects.equals(this.inviteeEmail, projectInvite.inviteeEmail) &&
        Objects.equals(this.inviteeId, projectInvite.inviteeId) &&
        Objects.equals(this.ownerEmail, projectInvite.ownerEmail) &&
        Objects.equals(this.ownerId, projectInvite.ownerId) &&
        Objects.equals(this.projectId, projectInvite.projectId) &&
        Objects.equals(this.status, projectInvite.status) &&
        Objects.equals(this.updatedAt, projectInvite.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, inviteeEmail, inviteeId, ownerEmail, ownerId, projectId, status, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInvite {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteeEmail: ").append(toIndentedString(inviteeEmail)).append("\n");
    sb.append("    inviteeId: ").append(toIndentedString(inviteeId)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

