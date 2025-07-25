package com.mile1.bean;
	public class Student {
	    private String name;
	    private int[] marks;
	    private String grade;

	    public Student() {}

	    public Student(String name, int[] marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public int[] getMarks() { return marks; }
	    public void setMarks(int[] marks) { this.marks = marks; }

	    public String getGrade() { return grade; }
	    public void setGrade(String grade) { this.grade = grade; }

		public int[] getMarks1() {
			// TODO Auto-generated method stub
			return null;
		}
	}


