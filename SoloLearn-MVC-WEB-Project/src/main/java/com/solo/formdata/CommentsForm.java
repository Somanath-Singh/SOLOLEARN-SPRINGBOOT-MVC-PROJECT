package com.solo.formdata;

import java.time.LocalDateTime;

import com.solo.entity.Posts;
import com.solo.entity.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentsForm {

	private int cid;

	@NotBlank(message = "About field must be required ! ! ")
	@Size(min = 20, max = 3000, message = "min 20 and max 3000 characters are allowed ! ! ")
	private String answer;

	private LocalDateTime cdate;

	private Posts posts;

	private User user;

}
