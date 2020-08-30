package commandsimpleremoteWL;


// A functional interface is an interface that has just one abstract method (aside from the methods of Object), and thus represents a single function contract.
// Functional Interface는 (Object 클래스의 메서드를 제외하고) 단 하나의 추상 메서드만을 가진 인터페이스를 의미하며, 그런 이유로 단 하나의 기능적 계약을 표상하게 된다.

@FunctionalInterface 
public interface Command {
	public void execute();
	// public void undo();
}
