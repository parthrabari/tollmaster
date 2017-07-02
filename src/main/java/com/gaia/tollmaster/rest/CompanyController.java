package com.gaia.tollmaster.rest;

import com.gaia.tollmaster.dao.models.Company;
import com.gaia.tollmaster.dao.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * Created by Parth on 02/07/2017.
 */

@RestController
public class CompanyController {

    private CompanyService companyService;

    @Autowired
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company/{name}")
    public Company getCompDetails(@PathVariable String name){
        return companyService.getCompanyDetails(name);
    }

    @PostMapping("/company/add")
    public ResponseEntity<Void> addCompany(@RequestBody Company company){
        Company companySaved = companyService.addCompany(company);

        String newComp = companySaved.getName();

        final URI location = ServletUriComponentsBuilder.
                            fromCurrentServletMapping().path("/company/{newComp}").build()
                            .expand(companySaved.getName()).toUri();

        final HttpHeaders headers = new HttpHeaders();
        headers.setLocation(location);
        headers.setAccessControlAllowOrigin("*");

        final ResponseEntity<Void> entity = new ResponseEntity<Void>(headers, HttpStatus.CREATED);

        return entity;
    }

    @DeleteMapping("company/delete/{name}")
    public ResponseEntity<Void> deleteCompany(@PathVariable String name){

        companyService.deleteCompany(name);

        ResponseEntity<Void> entity = new ResponseEntity<Void>(HttpStatus.ACCEPTED);

        return entity;
    }




}
