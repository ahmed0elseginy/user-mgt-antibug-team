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
 * UserUpdatePasswordDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-13T01:57:03.575975400+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class UserUpdatePasswordDto {

  private String oldPassword;

  private String newPassword;

  public UserUpdatePasswordDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserUpdatePasswordDto(String oldPassword, String newPassword) {
    this.oldPassword = oldPassword;
    this.newPassword = newPassword;
  }

  public UserUpdatePasswordDto oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  /**
   * The old password for the user
   * @return oldPassword
   */
  @NotNull 
  @Schema(name = "oldPassword", example = "John12", description = "The old password for the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("oldPassword")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public UserUpdatePasswordDto newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * Get newPassword
   * @return newPassword
   */
  @NotNull @Pattern(regexp = "^\\w+\\d{2}$") @Size(min = 5, max = 10) 
  @Schema(name = "newPassword", example = "Johnsd12", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UserUpdatePasswordDto userUpdatePasswordDto = (UserUpdatePasswordDto) o;
    return Objects.equals(this.oldPassword, userUpdatePasswordDto.oldPassword) &&
        Objects.equals(this.newPassword, userUpdatePasswordDto.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdatePasswordDto {\n");
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

