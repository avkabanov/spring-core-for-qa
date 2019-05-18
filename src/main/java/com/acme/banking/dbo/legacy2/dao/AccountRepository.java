package com.acme.banking.dbo.legacy2.dao;

import com.acme.banking.dbo.legacy2.domain.Account;

public interface AccountRepository {

    Account findById(long id);

    void add(Account account);
}
