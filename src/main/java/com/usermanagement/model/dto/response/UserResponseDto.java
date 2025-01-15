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
 * UserResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-15T14:10:38.099806100+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class UserResponseDto {

  private Integer id;

  private String userName;

  private String email;

  private String fullName;

  private String mobileNumber;

  private String role;

  private String gender;

  private String status;

  public UserResponseDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the user
   * @return id
   */
  
  @Schema(name = "id", example = "1", description = "The unique ID of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserResponseDto userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The username of the user
   * @return userName
   */
  
  @Schema(name = "userName", example = "JohnDoe", description = "The username of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserResponseDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "john.doe@example.com", description = "The email address of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResponseDto fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The full name of the user
   * @return fullName
   */
  
  @Schema(name = "fullName", example = "John Doe", description = "The full name of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserResponseDto mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * The mobile number of the user
   * @return mobileNumber
   */
  
  @Schema(name = "mobileNumber", example = "01234567890", description = "The mobile number of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserResponseDto role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the user
   * @return role
   */
  
  @Schema(name = "role", example = "USER", description = "The role of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserResponseDto gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The gender of the user
   * @return gender
   */
  
  @Schema(name = "gender", example = "MALE", description = "The gender of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UserResponseDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The account status of the user
   * @return status
   */
  
  @Schema(name = "status", example = "ACTIVE", description = "The account status of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserResponseDto userResponseDto = (UserResponseDto) o;
    return Objects.equals(this.id, userResponseDto.id) &&
        Objects.equals(this.userName, userResponseDto.userName) &&
        Objects.equals(this.email, userResponseDto.email) &&
        Objects.equals(this.fullName, userResponseDto.fullName) &&
        Objects.equals(this.mobileNumber, userResponseDto.mobileNumber) &&
        Objects.equals(this.role, userResponseDto.role) &&
        Objects.equals(this.gender, userResponseDto.gender) &&
        Objects.equals(this.status, userResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, email, fullName, mobileNumber, role, gender, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

