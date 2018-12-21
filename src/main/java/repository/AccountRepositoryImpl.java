package repository;

import model.Account;
import model.Status;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl  implements AccountRepository {

    @Override
    public String add(Account account) {
        return null;
    }

    @Override
    public String update(Status status) {
        return null;
    }

    @Override
    public Account get(String id) {
        return null;
    }

    @Override
    public Account get(int mobilePhone) {
        return null;
    }
}
