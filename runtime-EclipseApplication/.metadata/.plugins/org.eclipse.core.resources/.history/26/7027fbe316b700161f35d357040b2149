import lejos.remote.nxt.BTConnector;
import lejos.remote.nxt.NXTConnection;

public class Main {

	public static void main(String[] args) {
		BTConnector connector = new BTConnector();
	 	NXTConnection connection = connector.waitForConnection(60000,NXTConnection.RAW);
		Model m = new Model();
		GetMessage gm = new GetMessage(connection,m);
		gm.start();
		ReadSensors rs = new ReadSensors(connection,m);
	}
