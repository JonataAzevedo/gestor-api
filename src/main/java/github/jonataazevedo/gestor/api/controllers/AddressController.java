package github.jonataazevedo.gestor.api.controllers;

import github.jonataazevedo.gestor.api.model.entities.Address;
import github.jonataazevedo.gestor.api.model.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/person/{id}")
    public ResponseEntity<Address> findAddressPersonId(@PathVariable Integer id){
        Optional<Address> address = addressService.findByPersonId(id);
        if (address.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(address.get(), HttpStatus.OK);
    }
}
