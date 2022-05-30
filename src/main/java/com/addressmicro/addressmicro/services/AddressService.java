package com.addressmicro.addressmicro.services;

import java.util.List;
import com.addressmicro.addressmicro.module.Address;

public interface AddressService {
    
    public List<Address> getAddressOfUser(Long userId);

}
