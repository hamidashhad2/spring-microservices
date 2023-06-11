package com.hamid.accounts.controller;

import com.hamid.accounts.model.Accounts;
import com.hamid.accounts.model.Customer;
import com.hamid.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/getAccount")
    public Accounts getAccountsDetail(@RequestBody  Customer customer) {
        Accounts accounts = accountsRepository.getByCustomerId(customer.getCustomerId());
        if(accounts != null) {
            return accounts;
        }
        return null;
    }
}
