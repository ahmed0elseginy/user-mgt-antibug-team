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
 * UserCreateDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-12T02:19:04.823758700+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class UserCreateDto {

  private String userName;

  private String password;

  private String email;

  private String fullName;

  private String mobileNumber;

  private String role;

  private String gender;

  private String status;

  public UserCreateDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserCreateDto(String userName, String password, String email, String fullName, String mobileNumber, String role, String gender, String status) {
    this.userName = userName;
    this.password = password;
    this.email = email;
    this.fullName = fullName;
    this.mobileNumber = mobileNumber;
    this.role = role;
    this.gender = gender;
    this.status = status;
  }

  public UserCreateDto userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The username of the user
   * @return userName
   */
  @NotNull @Pattern(regexp = "^[A-Za-z]+$|^[A-Za-z]+\\d+$") 
  @Schema(name = "userName", example = "JohnDoe", description = "The username of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserCreateDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password for the user
   * @return password
   */
  @NotNull @Pattern(regexp = "^[A-Za-z]+\\d{2}$") @Size(min = 5, max = 10) 
  @Schema(name = "password", example = "John12", description = "The password for the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserCreateDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "john.doe@example.com", description = "The email address of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserCreateDto fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The full name of the user
   * @return fullName
   */
  @NotNull 
  @Schema(name = "fullName", example = "John Doe", description = "The full name of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserCreateDto mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * The mobile number of the user
   * @return mobileNumber
   */
  @NotNull @Pattern(regexp = "^\\d{11}$") 
  @Schema(name = "mobileNumber", example = "01234567890", description = "The mobile number of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserCreateDto role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role assigned to the user
   * @return role
   */
  @NotNull 
  @Schema(name = "role", example = "USER", description = "The role assigned to the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserCreateDto gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The gender of the user
   * @return gender
   */
  @NotNull 
  @Schema(name = "gender", example = "MALE", description = "The gender of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UserCreateDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the user account
   * @return status
   */
  @NotNull 
  @Schema(name = "status", example = "ACTIVE", description = "The status of the user account", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UserCreateDto userCreateDto = (UserCreateDto) o;
    return Objects.equals(this.userName, userCreateDto.userName) &&
        Objects.equals(this.password, userCreateDto.password) &&
        Objects.equals(this.email, userCreateDto.email) &&
        Objects.equals(this.fullName, userCreateDto.fullName) &&
        Objects.equals(this.mobileNumber, userCreateDto.mobileNumber) &&
        Objects.equals(this.role, userCreateDto.role) &&
        Objects.equals(this.gender, userCreateDto.gender) &&
        Objects.equals(this.status, userCreateDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, email, fullName, mobileNumber, role, gender, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateDto {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

