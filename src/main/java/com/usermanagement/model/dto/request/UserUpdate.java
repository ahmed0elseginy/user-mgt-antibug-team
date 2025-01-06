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
 * UserUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-06T20:29:17.437296100+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class UserUpdate {

  private Integer id;

  private String userName;

  private String password;

  private String email;

  private String mobileNumber;

  private String role;

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

  public UserUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserUpdate(Integer id) {
    this.id = id;
  }

  public UserUpdate id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the user
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The unique ID of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserUpdate userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The username of the user
   * @return userName
   */
  @Pattern(regexp = "^[A-Za-z]+$|^[A-Za-z]+\\d+$") 
  @Schema(name = "userName", description = "The username of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserUpdate password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password for the user
   * @return password
   */
  @Pattern(regexp = "^[A-Za-z]+\\d{2}$") @Size(min = 5, max = 10) 
  @Schema(name = "password", description = "The password for the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserUpdate email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", description = "The email address of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdate mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * The mobile number of the user
   * @return mobileNumber
   */
  @Pattern(regexp = "^\\d{11}$") 
  @Schema(name = "mobileNumber", description = "The mobile number of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserUpdate role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role assigned to the user
   * @return role
   */
  @Pattern(regexp = "[A-Za-z]+$") 
  @Schema(name = "role", description = "The role assigned to the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserUpdate status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the user account
   * @return status
   */
  
  @Schema(name = "status", description = "The status of the user account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserUpdate userUpdate = (UserUpdate) o;
    return Objects.equals(this.id, userUpdate.id) &&
        Objects.equals(this.userName, userUpdate.userName) &&
        Objects.equals(this.password, userUpdate.password) &&
        Objects.equals(this.email, userUpdate.email) &&
        Objects.equals(this.mobileNumber, userUpdate.mobileNumber) &&
        Objects.equals(this.role, userUpdate.role) &&
        Objects.equals(this.status, userUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, password, email, mobileNumber, role, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

