package mediator;

public class User2 extends Participant {

	private String name;

	public User2(ApnaChatRoom chat) {
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
