package by.k19.controllers;

import by.k19.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountsController {
    private final AccountDAO accountDAO;

    @Autowired
    public AccountsController(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }
}
