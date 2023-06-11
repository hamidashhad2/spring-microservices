package com.hamid.loans.controller;

import com.hamid.loans.model.Customer;
import com.hamid.loans.model.Loans;
import com.hamid.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/myLoans")
    public List<Loans> getLoansDetail(@RequestBody Customer customer) {
        List<Loans> loansList = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
        if (loansList != null && loansList.size() > 1) {
            return loansList;
        }
        return null;
    }
}
