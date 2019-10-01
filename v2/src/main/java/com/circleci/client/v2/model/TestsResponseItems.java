/*
 * CircleCI API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
 * TestsResponseItems
 */

public class TestsResponseItems {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  private String message;

  public static final String JSON_PROPERTY_FILE = "file";
  @JsonProperty(JSON_PROPERTY_FILE)
  private String file;

  public static final String JSON_PROPERTY_RESULT = "result";
  @JsonProperty(JSON_PROPERTY_RESULT)
  private String result;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_CLASSNAME = "classname";
  @JsonProperty(JSON_PROPERTY_CLASSNAME)
  private String classname;

  public TestsResponseItems message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The failure message associated with the test.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "The failure message associated with the test.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TestsResponseItems file(String file) {
    this.file = file;
    return this;
  }

   /**
   * The file in which the test is defined.
   * @return file
  **/
  @ApiModelProperty(required = true, value = "The file in which the test is defined.")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public TestsResponseItems result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Indication of whether the test succeeded.
   * @return result
  **/
  @ApiModelProperty(required = true, value = "Indication of whether the test succeeded.")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public TestsResponseItems name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the test.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the test.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestsResponseItems classname(String classname) {
    this.classname = classname;
    return this;
  }

   /**
   * The programmatic location of the test.
   * @return classname
  **/
  @ApiModelProperty(required = true, value = "The programmatic location of the test.")
  public String getClassname() {
    return classname;
  }

  public void setClassname(String classname) {
    this.classname = classname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestsResponseItems testsResponseItems = (TestsResponseItems) o;
    return Objects.equals(this.message, testsResponseItems.message) &&
        Objects.equals(this.file, testsResponseItems.file) &&
        Objects.equals(this.result, testsResponseItems.result) &&
        Objects.equals(this.name, testsResponseItems.name) &&
        Objects.equals(this.classname, testsResponseItems.classname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, file, result, name, classname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsResponseItems {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classname: ").append(toIndentedString(classname)).append("\n");
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

