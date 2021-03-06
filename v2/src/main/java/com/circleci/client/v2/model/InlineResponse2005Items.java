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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * InlineResponse2005Items
 */

public class InlineResponse2005Items {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private UUID id;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STOPPED_AT = "stopped_at";
  @JsonProperty(JSON_PROPERTY_STOPPED_AT)
  private OffsetDateTime stoppedAt;

  /**
   * Job status.
   */
  public enum StatusEnum {
    SUCCESS("success"),
    
    NOT_RUN("not_run"),
    
    FAILED("failed"),
    
    CANCELED("canceled"),
    
    UNAUTHORIZED("unauthorized");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private StatusEnum status;

  public static final String JSON_PROPERTY_CREDITS_USED = "credits_used";
  @JsonProperty(JSON_PROPERTY_CREDITS_USED)
  private Long creditsUsed;

  public InlineResponse2005Items id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the job.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the job.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public InlineResponse2005Items startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * The date and time the job started.
   * @return startedAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the job started.")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public InlineResponse2005Items stoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
    return this;
  }

   /**
   * The time when the job stopped.
   * @return stoppedAt
  **/
  @ApiModelProperty(required = true, value = "The time when the job stopped.")
  public OffsetDateTime getStoppedAt() {
    return stoppedAt;
  }

  public void setStoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
  }

  public InlineResponse2005Items status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Job status.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Job status.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InlineResponse2005Items creditsUsed(Long creditsUsed) {
    this.creditsUsed = creditsUsed;
    return this;
  }

   /**
   * The number of credits used during execution. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting.
   * minimum: 0
   * @return creditsUsed
  **/
  @ApiModelProperty(required = true, value = "The number of credits used during execution. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting.")
  public Long getCreditsUsed() {
    return creditsUsed;
  }

  public void setCreditsUsed(Long creditsUsed) {
    this.creditsUsed = creditsUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005Items inlineResponse2005Items = (InlineResponse2005Items) o;
    return Objects.equals(this.id, inlineResponse2005Items.id) &&
        Objects.equals(this.startedAt, inlineResponse2005Items.startedAt) &&
        Objects.equals(this.stoppedAt, inlineResponse2005Items.stoppedAt) &&
        Objects.equals(this.status, inlineResponse2005Items.status) &&
        Objects.equals(this.creditsUsed, inlineResponse2005Items.creditsUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startedAt, stoppedAt, status, creditsUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005Items {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    stoppedAt: ").append(toIndentedString(stoppedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creditsUsed: ").append(toIndentedString(creditsUsed)).append("\n");
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

