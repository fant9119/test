package com.test;

public class ClassThatUsesSomeDateClass {

	private ClassThatCalculatesSomeDate classThatCalculatesSomeDate;

	public ClassThatUsesSomeDateClass() {
		this.classThatCalculatesSomeDate = new ClassThatCalculatesSomeDate(4);
	}
}
