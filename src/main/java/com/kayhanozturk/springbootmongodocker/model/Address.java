package com.kayhanozturk.springbootmongodocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String postCode;
}
