/*
 * IOTest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.iot.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.example.iot.io.swagger.client.model.IotAppIOPoint;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * IotAppInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-19T17:32:14.018607400+04:00[Europe/Samara]")
public class IotAppInfo {
  @SerializedName("serverName")
  private String serverName = null;

  @SerializedName("ioPoints")
  private List<IotAppIOPoint> ioPoints = null;

  public IotAppInfo serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @Schema(description = "")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public IotAppInfo ioPoints(List<IotAppIOPoint> ioPoints) {
    this.ioPoints = ioPoints;
    return this;
  }

  public IotAppInfo addIoPointsItem(IotAppIOPoint ioPointsItem) {
    if (this.ioPoints == null) {
      this.ioPoints = new ArrayList<IotAppIOPoint>();
    }
    this.ioPoints.add(ioPointsItem);
    return this;
  }

   /**
   * Get ioPoints
   * @return ioPoints
  **/
  @Schema(description = "")
  public List<IotAppIOPoint> getIoPoints() {
    return ioPoints;
  }

  public void setIoPoints(List<IotAppIOPoint> ioPoints) {
    this.ioPoints = ioPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IotAppInfo iotAppInfo = (IotAppInfo) o;
    return Objects.equals(this.serverName, iotAppInfo.serverName) &&
        Objects.equals(this.ioPoints, iotAppInfo.ioPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, ioPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IotAppInfo {\n");
    
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    ioPoints: ").append(toIndentedString(ioPoints)).append("\n");
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
