/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2. API v2 is currently in Preview. Additional documentation for this API can be found in the [API Preview Docs](https://github.com/CircleCI-Public/api-preview-docs/tree/master/docs). Breaking changes to the API will be announced in the [Breaking Changes log](https://github.com/CircleCI-Public/api-preview-docs/blob/master/docs/breaking.md). API V1 [remains accessible here](https://circleci.com/docs/api/v1/)
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
 * Info about a status of the parallel run.
 */
@ApiModel(description = "Info about a status of the parallel run.")

public class JobDetailsParallelRuns {
  public static final String JSON_PROPERTY_INDEX = "index";
  @JsonProperty(JSON_PROPERTY_INDEX)
  private Long index;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private String status;

  public JobDetailsParallelRuns index(Long index) {
    this.index = index;
    return this;
  }

   /**
   * Index of the parallel run.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the parallel run.")
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public JobDetailsParallelRuns status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the parallel run.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the parallel run.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailsParallelRuns jobDetailsParallelRuns = (JobDetailsParallelRuns) o;
    return Objects.equals(this.index, jobDetailsParallelRuns.index) &&
        Objects.equals(this.status, jobDetailsParallelRuns.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailsParallelRuns {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

