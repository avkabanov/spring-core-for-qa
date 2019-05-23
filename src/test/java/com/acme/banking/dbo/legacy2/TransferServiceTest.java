package com.acme.banking.dbo.legacy2;

import org.junit.Test;
import org.mockito.Mockito;

import com.acme.banking.dbo.legacy2.domain.Account;
import com.acme.banking.dbo.legacy2.service.TransferService;

/**
 * @author Алексей
 * @date 20.05.2019
 */
public class TransferServiceTest {

    @Test
    public void shouldUpdateAccountWhenTransfer() {
        TransferService sut = new TransferService();
        Account from = Mockito.mock(Account.class);
        Account to = Mockito.mock(Account.class);
        
        sut.transfer(from, to, 500);
        
    }
    
    
}
