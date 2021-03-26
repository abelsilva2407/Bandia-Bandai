package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {

    public Cliente() { }

    public Cliente(String name, String Email, String Password) {
        this.Name = name;
        this.Email = Email;
        this.Password = Password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int UserID;

    @NotBlank(message = "Enter a name")
    public String Name;

    @NotBlank(message = "Enter an email")
    public String Email;

    @NotBlank(message = "Enter a password")
    public String Password;

    public String RFC;

    public long CreditCardNum;

    public Address BillingAdd;
}
