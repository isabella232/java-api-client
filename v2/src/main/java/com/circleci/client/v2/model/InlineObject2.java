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
 * InlineObject2
 */

public class InlineObject2 {
  public static final String JSON_PROPERTY_CONTINUATION_KEY = "continuation-key";
  @JsonProperty(JSON_PROPERTY_CONTINUATION_KEY)
  private String continuationKey;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  private String _configuration;

  public InlineObject2 continuationKey(String continuationKey) {
    this.continuationKey = continuationKey;
    return this;
  }

   /**
   * A pipeline continuation key.
   * @return continuationKey
  **/
  @ApiModelProperty(required = true, value = "A pipeline continuation key.")
  public String getContinuationKey() {
    return continuationKey;
  }

  public void setContinuationKey(String continuationKey) {
    this.continuationKey = continuationKey;
  }

  public InlineObject2 _configuration(String _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * A configuration string for the pipeline.
   * @return _configuration
  **/
  @ApiModelProperty(required = true, value = "A configuration string for the pipeline.")
  public String getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.continuationKey, inlineObject2.continuationKey) &&
        Objects.equals(this._configuration, inlineObject2._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continuationKey, _configuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    sb.append("    continuationKey: ").append(toIndentedString(continuationKey)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

