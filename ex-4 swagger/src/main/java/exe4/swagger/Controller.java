package exe4.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/cafe")
public class Controller {
  
	
	private static List<Coffee> cafe = new ArrayList<Coffee>();
	
	@GetMapping
	public List<Coffee> getCoffee(){
		return cafe;
		
	}
	
	@PostMapping
	public Coffee addMovies(@RequestBody Coffee cafes) {
		cafe.add(cafes);
		return cafes;
	}
    
}
