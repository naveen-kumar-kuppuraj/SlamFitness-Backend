package com.SpringBoot.SlamFitness.MembersRepository;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.SpringBoot.SlamFitness.Entity.Members;

@SpringBootTest
public class MembersRepositoryTest {
	@Autowired
	
	private MembersRepository mr;
	
	@Test
	void predefinedInsert()
	{
		
		Members ab=new Members();
		ab.setId(2);
		ab.setName("ben");
		ab.setMobile("9854673003");
		ab.setEmail("venve@gmail.com");
		ab.setMessage("hello");
		mr.save(ab);
	}

	@Test
	void predefinedread()
	{
		Optional<Members>ac=mr.findById(1);
		System.out.println(ac);
	}
	
	@Test
	void predefinedupdate()
	{
		Members ad=new Members();
		ad.setId(1);
		ad.setName("kumar");
		ad.setMobile("9850023");
		ad.setEmail("kene@gmail.com");
		ad.setMessage("bye");
		mr.save(ad);
	}
	@Test
	void predefineddelete()
	{
		mr.deleteById(2);
	
	}

}
