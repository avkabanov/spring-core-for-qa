package com.acme.banking.dbo.legacy2;

import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acme.banking.dbo.legacy2.dao.AccountRepository;
import com.acme.banking.dbo.legacy2.domain.CheckingAccount;
import com.acme.banking.dbo.legacy2.domain.SavingAccount;
import com.acme.banking.dbo.legacy2.service.ReportingService;
import com.acme.banking.dbo.legacy2.service.TransferService;

/**
 * @author Алексей
 * @date 17.05.2019
 */
public class Main {

    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "us");
        
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "my_conf/spring-context.xml")) {
            TransferService transferService = context.getBean(TransferService.class);
            AccountRepository accountRepository = context.getBean(AccountRepository.class);
            ReportingService reportingService = context.getBean(ReportingService.class);
            Logger logger = context.getBean(Logger.class);
            
            SavingAccount first = new SavingAccount(1, 100);
            accountRepository.add(first);
            CheckingAccount second = new CheckingAccount(2, 10);
            accountRepository.add(second);

            logger.info(reportingService.reportForAccount(1));
            logger.info(reportingService.reportForAccount(2));

            transferService.transfer(first, second, 10);

            logger.info(reportingService.reportForAccount(1));
            logger.info(reportingService.reportForAccount(2));
        }
    }
}
