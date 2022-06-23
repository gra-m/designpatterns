package practice.structural._chain_of_responsibility;

/**
 * Created by Gra_m on 2022 05 26
 *
 * https://dev.to/takaakit/uml-diagram-for-gof-design-pattern-examples-in-java-5fe5#chain-of-responsibility
 *
 * The HQ of the tower defence game, behaviours are known, I like abstract class version, this is an exercise in coding
 * from memory original code derived from Takaaki Teshima found on DEV social media/github.
 */

public abstract class DefenderHQ {
	private String name;
	private DefenderHQ next;

	public DefenderHQ(String name) {
		this.name = name;
		this.next = null;
	}

	protected String getName() {
		return this.name;
	}

	public DefenderHQ setNextInChain(DefenderHQ nextDefender){
		this.next = nextDefender;
		return nextDefender;
	}

	public abstract boolean canStopEnemy(Enemy enemy);

	//Defence engine: canStopEnemy? -> next != null -> canStopEnemy? || admit defeat
	public void tryToStopEnemy(Enemy enemy) {
		if(canStopEnemy(enemy))
			stoppedEnemy(enemy);
		else if(this.next != null)
			next.tryToStopEnemy(enemy);
		else
			failedToStopEnemy(enemy);
	}


	// Communications
	private void stoppedEnemy(Enemy enemy){
		System.out.println("Enemy: " + enemy +  "stopped by: " + this.name);
	}

	private void failedToStopEnemy(Enemy enemy) {
		System.out.println("Enemy: " + enemy + "could not be stopped by current defence chain");
	}
}
