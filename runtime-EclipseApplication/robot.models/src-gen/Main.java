	package assignment;
	
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	public class Main {
	
	public static void main(String[] args) {
		
	Model m = new Model();
	
	//behaviors in this expedition
	Behavior AvoidEdge = new AvoidEdge(m);
	Behavior AvoidCollision = new AvoidCollision(m);
	
	//mission "FindLakes"
	Behavior [] bArrayFindLakes;
	bArrayFindLakes.add(AvoidEdge);
	bArrayFindLakes.add(AvoidCollision);
	Arbitrator arbyFindLakes = new Arbitrator(bArrayFindLakes);
	arbyFindLakes.go();
	
	//mission "FollowLine"
	Behavior [] bArrayFollowLine;
	bArrayFollowLine.add(AvoidEdge);
	bArrayFollowLine.add(FindBlue);
	Arbitrator arbyFollowLine = new Arbitrator(bArrayFollowLine);
	arbyFollowLine.go();
	
	}
}
	
