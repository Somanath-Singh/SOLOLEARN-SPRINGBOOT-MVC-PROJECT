package com.solo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FREECONTENT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreeContent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String title;

	private String content;

	private String pic;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime date;

	private String name1;

	private String link1;

	private String name2;
	
	private String link2;

	private String name3;

	private String link3;

}
