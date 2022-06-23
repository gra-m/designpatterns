package practice.structural._chain_of_responsibility;

/**
 * Created by Gra_m on 2022 05 26
 */

public class TowerOne extends DefenderHQ{

	public TowerOne(){
		super("Solver of even problems");
	}

	@Override
	public boolean canStopEnemy(Enemy enemy) {
		return enemy.getProblem() % 2 == 0;
	}

	@Override
	public String toString() {
		return "TowerOne{" +
				"name='" + this.getName() + '\'' +
				'}';
	}
}
