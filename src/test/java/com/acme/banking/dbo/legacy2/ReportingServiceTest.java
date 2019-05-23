package com.acme.banking.dbo.legacy2;

import javax.persistence.EntityNotFoundException;

import org.junit.Test;
import org.mockito.Mockito;

import com.acme.banking.dbo.legacy2.dao.AccountRepository;
import com.acme.banking.dbo.legacy2.service.ReportingService;
import com.acme.banking.dbo.legacy2.service.SimpleReportingService;

/**
 * @author Алексей
 * @date 20.05.2019
 */
public class ReportingServiceTest {

    @Test(expected = EntityNotFoundException.class)
    public void shouldThrowExceptionWhenIdNotFound() {
        AccountRepository accountRepository = Mockito.mock(AccountRepository.class);
        Mockito.when(accountRepository.findById(1L))
                .thenThrow(new EntityNotFoundException());

        ReportingService reportingService = new SimpleReportingService(accountRepository);
        reportingService.reportForAccount(1L);
    }
}
