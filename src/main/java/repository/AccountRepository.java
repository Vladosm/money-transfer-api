package repository;

import model.Account;
import model.Status;

public interface AccountRepository {

    String add(Account account);
    String update(Status status);
    Account get(String id);
    Account get(int mobilePhone);
}
