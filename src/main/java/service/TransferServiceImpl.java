package service;

import exception.NotEnoughMoney;
import model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TransferServiceImpl implements TransferService {

    private static final int MAX_ACCOUNT = 10;
    private static final int INITIAL_BALANCE = 1000;

    private List<Account> accounts = new ArrayList<>();
    private Lock accountLock = new ReentrantLock();

    public TransferServiceImpl() {
        for (int i = 0; i < MAX_ACCOUNT; i++) {
            accounts.add(new Account(INITIAL_BALANCE));
        }
    }

    @Override
    public Account getAccount(int accountNum) {
        return accounts.get(accountNum);
    }

    @Override
    public void transfer(int from, int to, int amount) {
        accountLock.lock();
        try {
            if (getAccount(from).getBalance() < amount) {
                throw new NotEnoughMoney("Not enough money on account number " + from);
            }
                getAccount(from).setBalance(getAccount(from).getBalance() - amount);
                getAccount(to).setBalance(getAccount(to).getBalance() + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            accountLock.unlock();
        }
    }
}
