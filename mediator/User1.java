package mediator;

public class User1 extends Participant {
	
	private String name;

	public User1(ApnaChatRoom chat) {
		super(chat);
	}

	@Override
	public void sendMsg(String msg) {
		getChat().showMsg(msg, this);
	}

	@Override
	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
