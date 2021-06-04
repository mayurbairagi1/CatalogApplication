package com.inn.catalogapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	@Column(name="id",columnDefinition="Integer")
	private Integer id;

	@Column(name="name")
	private String name;
	
	@OneToOne
	@JoinColumn(name="category_attribute_id")
	private CategoryAttribute categoryAttribute;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryAttribute getCategoryAttribute() {
		return categoryAttribute;
	}

	public void setCategoryAttribute(CategoryAttribute categoryAttribute) {
		this.categoryAttribute = categoryAttribute;
	}



}
