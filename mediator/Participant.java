package mediator;

public abstract class Participant {

	private ApnaChatRoom chat;

	public Participant(ApnaChatRoom chat) {
		this.chat = chat;
	}

	public ApnaChatRoom getChat() {
		return chat;
	}

	public void setChat(ApnaChatRoom chat) {
		this.chat = chat;
	}

	public abstract void sendMsg(String msg);

	public abstract void setname(String name);

	public abstract String getName();
}
