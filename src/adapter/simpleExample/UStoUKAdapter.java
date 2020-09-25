package adapter.simpleExample;

public class UStoUKAdapter implements USPlugConnector {

	private UKPlugConnector plug;
	
	public UStoUKAdapter(USPlugConnector plug) {
		this.plug = this.plug;
	}
	
	@Override
	public void giveElectricity() {
		plug.giveElectricity();
	}

}
