package net.cuscatlan.sfcjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.cuscatlan.sfcjokesapp.service.JokeService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 7, 2020
 *
 */

@Controller
public class JokeController {
	
	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String createJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "views/chucknorris";
		
	}

}
