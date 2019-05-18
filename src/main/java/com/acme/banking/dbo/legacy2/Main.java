package com.acme.banking.dbo.legacy2;

import com.acme.banking.dbo.legacy2.dao.AccountRepository;
import com.acme.banking.dbo.legacy2.dao.InMemoryAccountRepository;
import com.acme.banking.dbo.legacy2.domain.CheckingAccount;
import com.acme.banking.dbo.legacy2.domain.SavingAccount;
import com.acme.banking.dbo.legacy2.service.ReportingService;
import com.acme.banking.dbo.legacy2.service.SimpleReportingService;
import com.acme.banking.dbo.legacy2.service.TransferService;

/**
 * @author Алексей
 * @date 17.05.2019
 */
public class Main {

    public static void main(String[] args) {

        AccountRepository accountRepository = new InMemoryAccountRepository();

        SavingAccount first = new SavingAccount(1, 100);
        accountRepository.add(first);
        CheckingAccount second = new CheckingAccount(2, 10);
        accountRepository.add(second);
        
        ReportingService reportingService = new SimpleReportingService(accountRepository);
        System.out.println(reportingService.reportForAccount(1));
        System.out.println(reportingService.reportForAccount(2));

        TransferService.transfer(first, second, 10);

        System.out.println(reportingService.reportForAccount(1));
        System.out.println(reportingService.reportForAccount(2));





    }
}
