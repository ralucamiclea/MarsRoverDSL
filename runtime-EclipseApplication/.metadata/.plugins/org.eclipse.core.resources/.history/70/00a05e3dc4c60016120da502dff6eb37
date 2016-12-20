package test.slave;
import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;

public class MainSlave {

	public static void main(String[] args) {
		BTConnector connector = new BTConnector();
	 	NXTConnection connection = connector.waitForConnection(60000,NXTConnection.RAW);
		ReadSensors rs = new ReadSensors(connection);
	}
}
