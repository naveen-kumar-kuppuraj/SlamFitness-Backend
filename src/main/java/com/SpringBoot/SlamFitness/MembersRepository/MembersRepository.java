package com.SpringBoot.SlamFitness.MembersRepository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.SpringBoot.SlamFitness.Entity.Members;

import jakarta.transaction.Transactional;

public interface MembersRepository extends JpaRepository<Members, Integer> {
	
	@Transactional
	@Modifying
	@Query(value="insert into Members values(?,?,?,?,?)",nativeQuery=true)
	int insertstudent(int id, String name,String mobile,String email,String message);
	

	@Transactional
	@Modifying
	@Query(value="update Members set name=? where id=?",nativeQuery=true)
	int updatestudent(String name,int id);
	
	
	@Transactional
	@Modifying
	@Query(value="delete from Members where id=?",nativeQuery=true)
	int deleteById(int id);
	
	@Query(value="select * from Members where id=?",nativeQuery=true)
	Optional<Members> selectById(int id);

}
