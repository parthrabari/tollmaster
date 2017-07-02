package com.gaia.tollmaster.dao.service;

import com.gaia.tollmaster.dao.repos.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Parth on 02/07/2017.
 */
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

}
