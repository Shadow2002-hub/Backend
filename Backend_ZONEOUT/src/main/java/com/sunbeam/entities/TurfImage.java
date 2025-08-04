package com.sunbeam.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TurfImage {
	@Column(name = "image_url")
	private String imageurl;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "turf_id", nullable = false)
	private Turf turf;
	
}
 