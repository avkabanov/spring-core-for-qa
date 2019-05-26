package com.acme.banking.dbo.legacy2.dao;

import org.springframework.stereotype.Component;

import com.acme.banking.dbo.legacy2.domain.Account;

/**
 * @author Алексей
 * @date 24.05.2019
 */
@Component
public class FileAccountRepository implements AccountRepository {
    @Override
    public Account findById(long id) {
        return null;
    }

    @Override
    public void add(Account account) {

    }
}
