package com.solo.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.solo.entity.User;
import com.solo.repo.IUserRepo;

@Service
public class AdminDataLoad {
	
	@Autowired
	private IUserRepo adminRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public void loadAdmin()
	{
		
		System.out.println("repo "+adminRepo);
		User admin = User.builder().name("Admin#Somanath@Singh")
									 .email("somanathsingh247@gmail.com")
									 .password(passwordEncoder.encode("Singh@1234"))
									 .gender("Male")
									 .about("Full Stack Java Developer .")
									 .profile("admin.jpg")
									 .role("ROLE_ADMIN")
									 .enabled(true)
									 .verifiedEmail(true)
									 .verificationCode(null)
									 .build();
		
		User savedAdmin=adminRepo.findByEmail(admin.getEmail());
		User result = null;
		
		//if admin not present then register the admin details 
		if(savedAdmin == null)
		{
			result = adminRepo.save(admin);
		}
		
		if(result == null)
		{
			System.out.println("Please check your database connection properly ..");
		}
		
		
	}

}
