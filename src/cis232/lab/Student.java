package cis232.lab;

public class Student implements Comparable<Student>{  
	String name;
	int points;
	
	public Student(String name, int points){
		this.name = name;
		this.points = points;
	}
	
	public void addPoint(){
		points++;
	}
	
	public String toString(){
		return name;
	}
	
	public String toCsvString(){
		return String.format("%s,%d", name, points);
	}
	
	public int getPoints(){
		return points;
	}

	@Override
	public int compareTo(Student other) {
		if(points < other.points){
			return 1;
		}else if( points > other.points){
			return -1;
		}else{
			return 0;
		}
		
	}
}
