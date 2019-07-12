package np.edu.nast.portfoliotracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import np.edu.nast.portfoliotracker.entities.Login;
import np.edu.nast.portfoliotracker.repository.LoginRepository;

@Controller
public class LoginController {
	@Autowired
	private LoginRepository loginRepository;
	@GetMapping("/login")
	public String login(){
		Login login=new Login();
		login.setEmail("dipendra.bistrr@gmail.com");
		login.setPassword("dipen123");
		loginRepository.save(login);
		return "Login Success";
	}

}
