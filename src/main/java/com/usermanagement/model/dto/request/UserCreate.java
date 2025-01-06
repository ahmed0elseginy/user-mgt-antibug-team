package com.usermanagement.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserCreate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-06T20:29:17.437296100+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class UserCreate {

  private String userName;

  private String password;

  private String email;

  private String fullName;

  private String mobileNumber;

  private String role;

  /**
   * The gender of the user
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private GenderEnum gender;

  /**
   * The status of the user account
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

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

  private StatusEnum status;

  public UserCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserCreate(String userName, String password, String email, String fullName, String mobileNumber, String role, GenderEnum gender, StatusEnum status) {
    this.userName = userName;
    this.password = password;
    this.email = email;
    this.fullName = fullName;
    this.mobileNumber = mobileNumber;
    this.role = role;
    this.gender = gender;
    this.status = status;
  }

  public UserCreate userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The username of the user
   * @return userName
   */
  @NotNull @Pattern(regexp = "^[A-Za-z]+$|^[A-Za-z]+\\d+$") 
  @Schema(name = "userName", description = "The username of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserCreate password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password for the user
   * @return password
   */
  @NotNull @Pattern(regexp = "^[A-Za-z]+\\d{2}$") @Size(min = 5, max = 10) 
  @Schema(name = "password", description = "The password for the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserCreate email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", description = "The email address of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserCreate fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The full name of the user
   * @return fullName
   */
  @NotNull @Pattern(regexp = "[A-Za-z]+$") 
  @Schema(name = "fullName", description = "The full name of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserCreate mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * The mobile number of the user
   * @return mobileNumber
   */
  @NotNull @Pattern(regexp = "^\\d{11}$") 
  @Schema(name = "mobileNumber", description = "The mobile number of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserCreate role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role assigned to the user
   * @return role
   */
  @NotNull @Pattern(regexp = "[A-Za-z]+$") 
  @Schema(name = "role", description = "The role assigned to the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserCreate gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The gender of the user
   * @return gender
   */
  @NotNull 
  @Schema(name = "gender", description = "The gender of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public UserCreate status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the user account
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "The status of the user account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    UserCreate userCreate = (UserCreate) o;
    return Objects.equals(this.userName, userCreate.userName) &&
        Objects.equals(this.password, userCreate.password) &&
        Objects.equals(this.email, userCreate.email) &&
        Objects.equals(this.fullName, userCreate.fullName) &&
        Objects.equals(this.mobileNumber, userCreate.mobileNumber) &&
        Objects.equals(this.role, userCreate.role) &&
        Objects.equals(this.gender, userCreate.gender) &&
        Objects.equals(this.status, userCreate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, email, fullName, mobileNumber, role, gender, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreate {\n");
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

