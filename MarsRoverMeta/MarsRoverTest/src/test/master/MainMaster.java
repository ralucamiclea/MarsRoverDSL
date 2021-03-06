	package test.master;
	
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	public class MainMaster {
	
	public static void main(String[] args) {
		
	ModelMaster m = new ModelMaster();
	//Goals g = new Goals();
	GetMessageMaster t = new GetMessageMaster(m);
	t.start();
		
	//behaviors in this expedition
	Behavior AvoidEdge = new AvoidEdge(m);
	Behavior AvoidCollision = new AvoidCollision(m);
	Behavior FindBlue = new FindBlue(m);
	Behavior DriveForward = new DriveForward(m);
	//mission "AvoidStuff"
	Behavior [] bArrayAvoidStuff = {
		DriveForward
		, AvoidEdge
		, AvoidCollision
	};
	Arbitrator arbyAvoidStuff = new Arbitrator(bArrayAvoidStuff);
	arbyAvoidStuff.go();
	
	}
}
