package test.master;

import lejos.robotics.subsumption.Behavior;

public class DriveForward  implements Behavior {
   private boolean suppressed = false;
   ModelMaster m;
   
   public DriveForward(ModelMaster m){
	   this.m=m;
   }
   
   public boolean takeControl() {
      return true;
   }

   public void suppress() {
      suppressed = true;
   }

   public void action() {
     suppressed = false;
     m.lm.forward();
     m.rm.forward();
     while( !suppressed )
        Thread.yield();
   }
}
