/*
 * Create and Update Commercial Projects
 * This service enables you to create and  update commercial projects in a SAP  S/4HANA Cloud system. For example, you  can use this service to create a customer  or internal project based on an  opportunity or a quotation. 
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk._cpd_sc_proj_engmt_create_upd_srv.model.CPDSCPROJENGMTCREATEUPDSRVDemand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ModifiedDemand
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-15T05:42:19.472Z")
public class ModifiedDemand {
  @SerializedName("d")
  private CPDSCPROJENGMTCREATEUPDSRVDemand d = null;

  public ModifiedDemand d(CPDSCPROJENGMTCREATEUPDSRVDemand d) {
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @ApiModelProperty(example = "null", value = "")
  public CPDSCPROJENGMTCREATEUPDSRVDemand getD() {
    return d;
  }

  public void setD(CPDSCPROJENGMTCREATEUPDSRVDemand d) {
    this.d = d;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifiedDemand modifiedDemand = (ModifiedDemand) o;
    return Objects.equals(this.d, modifiedDemand.d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifiedDemand {\n");
    
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
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

