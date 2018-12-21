package controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import model.Account;
import model.AccountOwner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.AccountService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @ApiOperation(value = "Создание нового счета", notes = "Создание нового счета")
    @PostMapping("/create")
    String createUserAccount(@Valid @RequestBody AccountOwner owner) {
        return null;
    }

    @ApiOperation(value = "Получение информации о счете по номеру счета", notes = "Получение информации о счете по номеру счета")
    @GetMapping("/account")
    Account getAccountByAccountId(String accountId) {
        return null;
    }


//    Account getAccountByPhoneNumber(int mobilePhone);
//    String closeAccount(String accoundId, String description);
//    int getAccountBalance(String accountId);
}
