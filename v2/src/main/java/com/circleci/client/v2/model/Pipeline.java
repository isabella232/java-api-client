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
import com.circleci.client.v2.model.PipelineListResponseErrors;
import com.circleci.client.v2.model.PipelineListResponseTrigger;
import com.circleci.client.v2.model.PipelineListResponseVcs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A pipeline response.
 */
@ApiModel(description = "A pipeline response.")

public class Pipeline {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private UUID id;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @JsonProperty(JSON_PROPERTY_ERRORS)
  private List<PipelineListResponseErrors> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_PROJECT_SLUG = "project_slug";
  @JsonProperty(JSON_PROPERTY_PROJECT_SLUG)
  private String projectSlug;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_NUMBER = "number";
  @JsonProperty(JSON_PROPERTY_NUMBER)
  private Long number;

  /**
   * The current state of the pipeline.
   */
  public enum StateEnum {
    CREATED("created"),
    
    ERRORED("errored"),
    
    SETUP_PENDING("setup-pending"),
    
    SETUP("setup"),
    
    PENDING("pending");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  @JsonProperty(JSON_PROPERTY_STATE)
  private StateEnum state;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  private PipelineListResponseTrigger trigger = null;

  public static final String JSON_PROPERTY_VCS = "vcs";
  @JsonProperty(JSON_PROPERTY_VCS)
  private PipelineListResponseVcs vcs = null;

  public Pipeline id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the pipeline.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the pipeline.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Pipeline errors(List<PipelineListResponseErrors> errors) {
    this.errors = errors;
    return this;
  }

  public Pipeline addErrorsItem(PipelineListResponseErrors errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A sequence of errors that have occurred within the pipeline.
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "A sequence of errors that have occurred within the pipeline.")
  public List<PipelineListResponseErrors> getErrors() {
    return errors;
  }

  public void setErrors(List<PipelineListResponseErrors> errors) {
    this.errors = errors;
  }

  public Pipeline projectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
    return this;
  }

   /**
   * The project-slug for the pipeline.
   * @return projectSlug
  **/
  @ApiModelProperty(example = "gh/CircleCI-Public/api-preview-docs", required = true, value = "The project-slug for the pipeline.")
  public String getProjectSlug() {
    return projectSlug;
  }

  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }

  public Pipeline updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time the pipeline was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the pipeline was last updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Pipeline number(Long number) {
    this.number = number;
    return this;
  }

   /**
   * The number of the pipeline.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The number of the pipeline.")
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public Pipeline state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of the pipeline.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The current state of the pipeline.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Pipeline createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the pipeline was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the pipeline was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Pipeline trigger(PipelineListResponseTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @ApiModelProperty(required = true, value = "")
  public PipelineListResponseTrigger getTrigger() {
    return trigger;
  }

  public void setTrigger(PipelineListResponseTrigger trigger) {
    this.trigger = trigger;
  }

  public Pipeline vcs(PipelineListResponseVcs vcs) {
    this.vcs = vcs;
    return this;
  }

   /**
   * Get vcs
   * @return vcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PipelineListResponseVcs getVcs() {
    return vcs;
  }

  public void setVcs(PipelineListResponseVcs vcs) {
    this.vcs = vcs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pipeline pipeline = (Pipeline) o;
    return Objects.equals(this.id, pipeline.id) &&
        Objects.equals(this.errors, pipeline.errors) &&
        Objects.equals(this.projectSlug, pipeline.projectSlug) &&
        Objects.equals(this.updatedAt, pipeline.updatedAt) &&
        Objects.equals(this.number, pipeline.number) &&
        Objects.equals(this.state, pipeline.state) &&
        Objects.equals(this.createdAt, pipeline.createdAt) &&
        Objects.equals(this.trigger, pipeline.trigger) &&
        Objects.equals(this.vcs, pipeline.vcs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, errors, projectSlug, updatedAt, number, state, createdAt, trigger, vcs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    vcs: ").append(toIndentedString(vcs)).append("\n");
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

