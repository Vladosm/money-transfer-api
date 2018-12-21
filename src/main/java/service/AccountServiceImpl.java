package service;

import lombok.extern.slf4j.Slf4j;
import model.Account;
import org.springframework.stereotype.Service;

import java.security.acl.Owner;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Override
    public String createAccount(Owner owner) {
        return null;
    }

    @Override
    public Account getAccountByAccountId(String accountId) {
        return null;
    }

    @Override
    public String closeAccount(String accoundId, String description) {
        return null;
    }
}
