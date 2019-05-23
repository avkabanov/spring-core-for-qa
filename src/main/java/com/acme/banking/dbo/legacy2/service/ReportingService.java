package com.acme.banking.dbo.legacy2.service;


// 1. Lifecycle 
// 1.1 Scope: singleton VS prototype
// 1.2 Init: eager VS lazy

// 2. DI
// 2.1 Where: type + id

// 3. Aspect
// 3.1 Authentication + Authorization 
// 3.2 Transaction      @Transactional
// 3.3 Retry            @Retry

// 4. Boot Modules

public interface ReportingService {
    String reportForAccount(long id);
}

