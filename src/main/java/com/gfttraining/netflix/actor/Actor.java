package com.gfttraining.netflix.actor;

public class Actor{
	private Integer id;
    private String name;

    public Actor() {
		super();
	}

	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
