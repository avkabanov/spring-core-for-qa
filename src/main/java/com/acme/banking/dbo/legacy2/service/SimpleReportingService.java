package com.acme.banking.dbo.legacy2.service;

import com.acme.banking.dbo.legacy2.dao.AccountRepository;

/**
 * @author Алексей
 * @date 17.05.2019
 */
public class SimpleReportingService implements ReportingService {

    private AccountRepository accountRepository;

    public SimpleReportingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public String reportForAccount(long id) {
        com.acme.banking.dbo.legacy2.domain.Account account = accountRepository.findById(id);
        String commonReportString = "## " + account.getId() + " " + account.getAmount();

        return commonReportString;
       /* if (account.type == AccountType.SAVING) {
            return commonReportString + " S";
        } else {
            return commonReportString + " C " + account.amount;
        }*/
    }
}
