package np.edu.nast.portfoliotracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bankAccount")
public class BankAccountController {
	@GetMapping("/addBankAccount")
	private String addBankAccount(){
		return "Bank Account is Added";
	}

}
