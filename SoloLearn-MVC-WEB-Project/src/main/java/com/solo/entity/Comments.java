package com.solo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
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
@Table(name = "COMMENTS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(length = 3000)
	private String answer;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime cdate;

	@ManyToOne
	@JoinColumn(name = "pid")
	private Posts posts;

	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;

}
