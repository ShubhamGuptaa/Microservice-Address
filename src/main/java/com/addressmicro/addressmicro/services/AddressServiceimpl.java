package com.addressmicro.addressmicro.services;


// import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collectors;

import com.addressmicro.addressmicro.module.Address;

// @Service
// public class AddressServiceimpl implements AddressService  {

//     // List<Address> list = new ArrayList<Address>(); 
//     // Address a1 = new Address(302020,"India","Jaipur","Mansarovar",1311L );
//     // list.add(a1);

//     List<Address> list = List.of(
//         new Address(302020, "India","Jaipur","Mansarovar", 1311L)
       
// );

        

// @Override
//     public List<Address> getAddressOfUser(Long userId) {
//         return list.stream().filter(address -> address.getUserId().equals(userId)).collect(Collectors.toList());
//     }
// }





import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceimpl implements AddressService {

    //fake list of contacts

    List<Address> list = List.of(
            new Address(302020, "India","Jaipur","Mansarovar", 1311L)
           
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}

