package practice.structural._chain_of_responsibility;

/**
 * Created by Gra_m on 2022 05 26
 */

public class TowerTwo extends DefenderHQ {
	private int limit;

	public TowerTwo(int limit){
		super("Destroyer of odds below " + limit);
		this.limit = limit;
	}

	@Override
	public boolean canStopEnemy(Enemy enemy) {
		int enemyProblem = enemy.getProblem();
		return enemyProblem % 2 == 1 && enemyProblem < limit;
	}

	@Override
	public String toString() {
		return "TowerTwo{" +
				"name='" + super.getName() + '\'' +
				'}';
	}
}
