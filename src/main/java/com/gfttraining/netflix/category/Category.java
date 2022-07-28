package com.gfttraining.netflix.category;

public class Category{
	
	private Integer id;
    private String name;

    public Category() {
		super();
	}

	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
