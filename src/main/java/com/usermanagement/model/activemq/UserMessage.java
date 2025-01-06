package com.usermanagement.model.activemq;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMessage implements Serializable {

    private String source;
    private String message;

}
