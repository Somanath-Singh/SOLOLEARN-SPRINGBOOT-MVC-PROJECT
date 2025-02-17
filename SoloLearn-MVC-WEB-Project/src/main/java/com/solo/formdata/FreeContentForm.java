package com.solo.formdata;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FreeContentForm {

	private int id;

	@NotBlank(message = "Title field must be required ! ! ")
	@Size(min = 2, max = 30, message = "min 2 and max 20 characters are allowed ! ! ")
	private String title;

	@NotBlank(message = "Content field must be required ! ! ")
	@Size(min = 10, max = 150, message = "min 20 and max 3000 characters are allowed ! ! ")
	private String content;

	@NotNull
	private String pic;

	private LocalDateTime date;

	@NotNull
	private String name1;

	@NotBlank(message = "you should provide the link 1 ! ! ")
	@NotNull
	private String link1;

	@NotNull
	private String name2;

	@NotBlank(message = "you should provide the link 2 ! ! ")
	@NotNull
	private String link2;

	@NotNull
	private String name3;

	@NotBlank(message = "you should provide the link 3 ! ! ")
	@NotNull
	private String link3;

}

