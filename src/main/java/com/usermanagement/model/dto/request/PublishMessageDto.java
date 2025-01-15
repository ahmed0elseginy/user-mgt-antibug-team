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
 * PublishMessageDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-15T14:10:38.099806100+02:00[Africa/Cairo]", comments = "Generator version: 7.10.0")
public class PublishMessageDto {

  private String source;

  private String message;

  public PublishMessageDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PublishMessageDto(String source, String message) {
    this.source = source;
    this.message = message;
  }

  public PublishMessageDto source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source of the message
   * @return source
   */
  @NotNull 
  @Schema(name = "source", example = "Admin", description = "The source of the message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public PublishMessageDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message content
   * @return message
   */
  @NotNull 
  @Schema(name = "message", example = "This is a test message.", description = "The message content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishMessageDto publishMessageDto = (PublishMessageDto) o;
    return Objects.equals(this.source, publishMessageDto.source) &&
        Objects.equals(this.message, publishMessageDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishMessageDto {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

