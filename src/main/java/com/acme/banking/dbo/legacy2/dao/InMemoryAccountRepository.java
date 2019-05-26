package com.acme.banking.dbo.legacy2.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.acme.banking.dbo.legacy2.domain.Account;

/**
 * @author Алексей
 * @date 17.05.2019
 */
@Component
public class InMemoryAccountRepository implements AccountRepository {
    
    private Map<Long, Account> accounts = new HashMap<>();
    
    @Override
    public Account findById(long id) {
        return accounts.get(id);
    }
    
    @Override
    public void add(Account account) {
        accounts.put(account.getId(), account);
    }
}
