package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
	

		@Autowired
		 
		public Service ser;
		
		@GetMapping("/add")
	    public Optional<UserModel>  readbyid(@PathVariable("id")int id)
	    {
	   	 return ser.getUserModelbyId(id);
	    }
		@PostMapping("/id")
	    public UserModel create(@RequestBody UserModel id)
	    {
	   	 return ser.adduser(id);
	    }
		 @PutMapping("/id")
	     public UserModel update(@RequestBody UserModel id)
	     {
	    	 return ser.update(id);
	     }
	          @DeleteMapping("/delet")
	     public String delete(@PathVariable("id")int id)
	     {
	    	 ser.delete(id);
	    	 return "Deletion was successful";
	     }

	}


}
