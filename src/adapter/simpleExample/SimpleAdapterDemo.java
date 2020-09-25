package adapter.simpleExample;

public class SimpleAdapterDemo {

	public static void main(String[] args) {
		USPlugConnector usPlug = null;
		
		UKElectricalSocket ukSocket = new UKElectricalSocket();
		UKPlugConnector adapter = new UStoUKAdapter(usPlug);
		
		ukSocket.plugIn(adapter);
	}

}
