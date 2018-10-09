package service;

import model.Account;

public interface TransferService {

    Account getAccount(int account);
    void transfer(int from, int to, int amount);
}
