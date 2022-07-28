package com.gfttraining.netflix.actor;

public class Actor{
	private Integer id;
    private String name;

    public Actor() {
		super();
	}
    
	public Actor(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
