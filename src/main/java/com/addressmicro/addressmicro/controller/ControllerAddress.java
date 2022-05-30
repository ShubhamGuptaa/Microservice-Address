package com.addressmicro.addressmicro.controller;

import java.util.List;
import com.addressmicro.addressmicro.module.Address;
import com.addressmicro.addressmicro.services.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/address")

public class ControllerAddress {

    @Autowired
    private AddressService addressService;


    @RequestMapping("/user/{userId}")
    public List<Address> getAddress(@PathVariable("userId") Long userId) {
        return this.addressService.getAddressOfUser(userId);
    }


    

}
