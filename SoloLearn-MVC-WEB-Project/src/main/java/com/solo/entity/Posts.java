package com.solo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "POSTS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Posts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;

	private String title;

	private String content;

	private String code;

	private String category;

	private String pic;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime pdate;

	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;

}
