/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2. API v2 is currently in Preview. Additional documentation for this API can be found in the [API Preview Docs](https://github.com/CircleCI-Public/api-preview-docs/tree/master/docs). Breaking changes to the API will be announced in the [Breaking Changes log](https://github.com/CircleCI-Public/api-preview-docs/blob/master/docs/breaking.md).
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
import com.circleci.client.v2.model.PipelineListResponseTriggerActor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * A summary of the trigger.
 */
@ApiModel(description = "A summary of the trigger.")

public class PipelineListResponseTrigger {
  /**
   * The type of trigger.
   */
  public enum TypeEnum {
    EXPLICIT("explicit"),
    
    API("api"),
    
    WEBHOOK("webhook");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_RECEIVED_AT = "received_at";
  @JsonProperty(JSON_PROPERTY_RECEIVED_AT)
  private OffsetDateTime receivedAt;

  public static final String JSON_PROPERTY_ACTOR = "actor";
  @JsonProperty(JSON_PROPERTY_ACTOR)
  private PipelineListResponseTriggerActor actor = null;

  public PipelineListResponseTrigger type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of trigger.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of trigger.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PipelineListResponseTrigger receivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * The date and time the trigger was received.
   * @return receivedAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the trigger was received.")
  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }

  public PipelineListResponseTrigger actor(PipelineListResponseTriggerActor actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/
  @ApiModelProperty(required = true, value = "")
  public PipelineListResponseTriggerActor getActor() {
    return actor;
  }

  public void setActor(PipelineListResponseTriggerActor actor) {
    this.actor = actor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineListResponseTrigger pipelineListResponseTrigger = (PipelineListResponseTrigger) o;
    return Objects.equals(this.type, pipelineListResponseTrigger.type) &&
        Objects.equals(this.receivedAt, pipelineListResponseTrigger.receivedAt) &&
        Objects.equals(this.actor, pipelineListResponseTrigger.actor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, receivedAt, actor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineListResponseTrigger {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
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
