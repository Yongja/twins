package com.jcf.system.rest;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("Persons")
public class PersonList {
	private List<Person> personList;

	   public PersonList() {
	      personList = new ArrayList<Person>();
	   }

	   public void add(Person person) {
	      personList.add(person);
	   }
	
}
