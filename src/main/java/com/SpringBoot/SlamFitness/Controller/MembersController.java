package com.SpringBoot.SlamFitness.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.SlamFitness.Entity.Members;
import com.SpringBoot.SlamFitness.MembersRepository.MembersRepository;

@RequestMapping("/MembersController")
@RestController
@CrossOrigin("*")

public class MembersController {
	@Autowired
	
	private MembersRepository mr;
	
	@PostMapping("/Insert")
	ResponseEntity<Members>predefinedcreate(@RequestBody Members m)
	{
		Members ab=new Members();
		ab.setId(m.getId());
		ab.setName(m.getName());
		ab.setMobile(m.getMobile());
		ab.setEmail(m.getEmail());
		ab.setMessage(m.getMessage());
		mr.save(ab);
		
		return new ResponseEntity<Members>(ab,HttpStatus.OK);
	}
 
	@GetMapping("/Read/{sno}")
	public ResponseEntity<Members> predefinedselect(@PathVariable("sno") int id) {
	    Optional<Members> member = mr.findById(id);

	    if (member.isPresent()) {
	        return new ResponseEntity<>(member.get(), HttpStatus.OK);  
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}


	@PutMapping("/Update")
	ResponseEntity<Members>predefinedupdate(@RequestBody Members m)
	{
		Members ad=new Members();
		ad.setId(m.getId());
		ad.setName(m.getName());
		ad.setMobile(m.getMobile());
		ad.setEmail(m.getEmail());
		ad.setMessage(m.getMessage());
		mr.save(ad);
		
		return new ResponseEntity<Members>(ad,HttpStatus.OK);
	}
	
	@DeleteMapping("/Delete")
	 ResponseEntity<Members> preDefinedDelete(@RequestBody Members m)
	{
		int ab= mr.deleteById(m.getId());
		System.out.println(ab);
		
		
	
	   return new ResponseEntity<Members>(HttpStatus.OK);
	}


}
