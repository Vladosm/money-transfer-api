package service;

import model.Account;
import model.AccountOwner;

public interface AccountService {

    String createAccount(AccountOwner owner);
    Account getAccountByAccountId(String accountId);
    String closeAccount(String accoundId, String description);
}
