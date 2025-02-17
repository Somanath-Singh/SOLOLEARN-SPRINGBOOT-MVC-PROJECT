package com.solo.formdata;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostsForm {

	private int pid;

	@NotBlank(message = "Title field must be required ! ! ")
	@Size(min = 5, max = 40, message = "min 5 and max 40 characters are allowed ! ! ")
	private String title;

	@NotBlank(message = "Content field must be required ! ! ")
	@Size(min = 20, max = 3000, message = "min 20 and max 3000 characters are allowed ! ! ")
	private String content;

	private String code;

	private String category;
	
	private LocalDateTime pdate;

	@NotNull
	private String pic;



}
