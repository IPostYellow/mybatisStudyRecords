package com.hj.pojo;

public class User {
    private String name;

//    public User(){
//        System.out.println("User无参构造");
//    }
    public User(String name){
        this.name=name;
        System.out.println("User有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }
}
