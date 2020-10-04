package me.inglad.br.fight.gameclasses;

public class FightEvent {
	public enum State {
		WAITING,
		STARTED,
		FIGHTING,
		INTERLUDE,
		SHOWING_WINNER
	}
	private State currentState;
	float award;
	
	int amountOfPlayers;
	int maxAmountOfPlayer;
	
	
	public FightEvent(int maxAmountOfPlayer) {
		this.maxAmountOfPlayer = maxAmountOfPlayer;
		amountOfPlayers = 0;
		currentState = State.WAITING;
	}
	
}
