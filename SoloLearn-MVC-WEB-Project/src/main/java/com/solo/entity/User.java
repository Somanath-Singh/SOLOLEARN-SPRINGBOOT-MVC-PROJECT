package com.solo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	private String name;

	@Column(unique = true)
	private String email;

	@Column(length = 300)
	private String password;

	private String profession;

	private String gender;

	private String about;

	private String profile;

	private String verified_img;

	private String adminVerify;

	private String role;

	private boolean enabled;

	private boolean verifiedEmail;

	private String verificationCode;

}
