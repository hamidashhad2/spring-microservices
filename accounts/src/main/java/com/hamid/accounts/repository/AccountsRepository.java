package com.hamid.accounts.repository;

import com.hamid.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts getByCustomerId(int id);
}
