package com.usermanagement.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserUpdateDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-15T02:59:16.236649300+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class UserUpdateDto {

  private String userName;

  private String email;

  private String mobileNumber;

  private String role;

  private String password;

  private String status;

  public UserUpdateDto userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The username of the user
   * @return userName
   */
  @Pattern(regexp = "^[A-Za-z][A-Za-z0-9]*$") 
  @Schema(name = "userName", example = "JohnDoeUpdated", description = "The username of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserUpdateDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "john.updated@example.com", description = "The email address of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdateDto mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * The mobile number of the user
   * @return mobileNumber
   */
  @Pattern(regexp = "^\\d{11}$") 
  @Schema(name = "mobileNumber", example = "01234567891", description = "The mobile number of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserUpdateDto role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role assigned to the user
   * @return role
   */
  
  @Schema(name = "role", example = "ADMIN", description = "The role assigned to the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserUpdateDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @Pattern(regexp = "^\\w+\\d{2}$") @Size(min = 5, max = 10) 
  @Schema(name = "password", example = "John12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserUpdateDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the user account
   * @return status
   */
  @Pattern(regexp = "^(ACTIVE|INACTIVE)$") 
  @Schema(name = "status", example = "INACTIVE", description = "The status of the user account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateDto userUpdateDto = (UserUpdateDto) o;
    return Objects.equals(this.userName, userUpdateDto.userName) &&
        Objects.equals(this.email, userUpdateDto.email) &&
        Objects.equals(this.mobileNumber, userUpdateDto.mobileNumber) &&
        Objects.equals(this.role, userUpdateDto.role) &&
        Objects.equals(this.password, userUpdateDto.password) &&
        Objects.equals(this.status, userUpdateDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, email, mobileNumber, role, password, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateDto {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

