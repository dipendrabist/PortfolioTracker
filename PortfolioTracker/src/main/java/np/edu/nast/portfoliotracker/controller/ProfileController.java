package np.edu.nast.portfoliotracker.controller;

import java.util.List;
import java.util.Optional;


import javax.validation.Valid;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import np.edu.nast.portfoliotracker.entities.Profile;
import np.edu.nast.portfoliotracker.repository.ProfileRepository;

//import np.edu.nast.portfoliotracker.entities.Profile;

@Controller
public class ProfileController {

	
	@GetMapping("/addprofile")
	private String addProfile(@RequestParam (name="name", required=false, defaultValue="Dipendra")String fisrtName, Model model){
		model.addAttribute("name", fisrtName);
		return "signup";
		
	}

}
