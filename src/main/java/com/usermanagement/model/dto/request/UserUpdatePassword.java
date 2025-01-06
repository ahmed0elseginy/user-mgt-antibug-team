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
 * UserUpdatePassword
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-06T20:29:17.437296100+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class UserUpdatePassword {

  private String oldPassword;

  private String newPassword;

  public UserUpdatePassword() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserUpdatePassword(String oldPassword, String newPassword) {
    this.oldPassword = oldPassword;
    this.newPassword = newPassword;
  }

  public UserUpdatePassword oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  /**
   * The password for the user
   * @return oldPassword
   */
  @NotNull @Pattern(regexp = "^[A-Za-z]+\\d{2}$") @Size(min = 5, max = 10) 
  @Schema(name = "oldPassword", description = "The password for the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("oldPassword")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public UserUpdatePassword newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * The New Password Of The User
   * @return newPassword
   */
  @NotNull @Pattern(regexp = "^[A-Za-z]+\\d{2}$") @Size(min = 5, max = 10) 
  @Schema(name = "newPassword", description = "The New Password Of The User", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newPassword")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdatePassword userUpdatePassword = (UserUpdatePassword) o;
    return Objects.equals(this.oldPassword, userUpdatePassword.oldPassword) &&
        Objects.equals(this.newPassword, userUpdatePassword.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdatePassword {\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

