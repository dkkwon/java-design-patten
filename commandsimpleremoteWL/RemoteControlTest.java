package commandsimpleremoteWL;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();

		// 어떻게 가능하지? Java8 Functional Interface?
		remote.setCommand(light::on);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::up);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::lightOff);
		remote.buttonWasPressed();
    }

}
