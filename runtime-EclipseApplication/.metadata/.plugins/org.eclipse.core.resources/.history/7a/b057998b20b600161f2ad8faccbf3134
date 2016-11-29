	package assignment;
	
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	public class Main {
	
	public static void main(String[] args) {
	Model m = new Model();
	
	Behavior [] bArrayFindLakes;
	
	Behavior AvoidEdge = new AvoidEdge(m);
	bArrayFindLakes.add(AvoidEdge);
	
	Behavior AvoidCollision = new AvoidCollision(m);
	bArrayFindLakes.add(AvoidCollision);
	
	Arbitrator arbyFindLakes = new Arbitrator(bArrayFindLakes);
	arbyFindLakes.go();
	
	Behavior [] bArrayFollowLine;
	
	Behavior AvoidEdge = new AvoidEdge(m);
	bArrayFollowLine.add(AvoidEdge);
	
	Behavior AvoidCollision = new AvoidCollision(m);
	bArrayFollowLine.add(AvoidCollision);
	
	Arbitrator arbyFollowLine = new Arbitrator(bArrayFollowLine);
	arbyFollowLine.go();
	
	}
}
	
