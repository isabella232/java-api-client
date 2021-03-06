/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circleci.client.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The user who triggered the Pipeline.
 */
@ApiModel(description = "The user who triggered the Pipeline.")

public class PipelineListResponseTriggerActor {
  public static final String JSON_PROPERTY_LOGIN = "login";
  @JsonProperty(JSON_PROPERTY_LOGIN)
  private String login;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatar_url";
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  private String avatarUrl;

  public PipelineListResponseTriggerActor login(String login) {
    this.login = login;
    return this;
  }

   /**
   * The login information for the user on the VCS.
   * @return login
  **/
  @ApiModelProperty(required = true, value = "The login information for the user on the VCS.")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public PipelineListResponseTriggerActor avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * URL to the user&#39;s avatar on the VCS
   * @return avatarUrl
  **/
  @ApiModelProperty(required = true, value = "URL to the user's avatar on the VCS")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineListResponseTriggerActor pipelineListResponseTriggerActor = (PipelineListResponseTriggerActor) o;
    return Objects.equals(this.login, pipelineListResponseTriggerActor.login) &&
        Objects.equals(this.avatarUrl, pipelineListResponseTriggerActor.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, avatarUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineListResponseTriggerActor {\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

