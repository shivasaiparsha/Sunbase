package com.example.SunBase.Dtos.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddCustomerDto {


   private String username;
   private String password;
   private String email;
   private String role;
   private String firstname;
   private String lastname;
   private String street;
   private String address;
   private String city;
   private String state;
   private String  phone;
   private String zipcode;

}
