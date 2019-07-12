package np.edu.nast.portfoliotracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/transaction")
public class TransactionController {
	@GetMapping("/addTransaction")
	private String addTransaction(){
		return "Transaction added";
	}

}
