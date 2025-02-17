package com.solo.formdata;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

	private int uid;

	@NotBlank(message = "Name field must be required ! ! ")
	@Size(min = 2, max = 20, message = "min 2 and max 20 characters are allowed ! ! ")
	private String name;

	@NotBlank(message = "Email field must be required ! ! ")
	@Email
	private String email;

	
	@NotNull
	@Size(min = 8, max = 200)
	private String password;

	@NotBlank(message = "Profession field must be required ! ! ")
	private String profession;

	@NotBlank(message = "About field must be required ! ! ")
	@Size(min = 20, max = 300, message = "min 20 and max 300 characters are allowed ! ! ")
	private String about;

	private boolean enabled;

}
