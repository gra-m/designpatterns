package practice.structural._chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gra_m on 2022 05 26
 */

public class TowerThree extends DefenderHQ{
	private List<Integer> chancesToSolve = new ArrayList<>();
	private int resourceLimit;

	public TowerThree(int resourceLimit) {
		super("Resource limit == number of randomly generated chances to solve 0-9 problem");
		this.resourceLimit = resourceLimit;
		populateChancesToSolve();
	}

	private void populateChancesToSolve() {
		for (int i = 0; i < resourceLimit; i++)
			chancesToSolve.add(newRandomInt());
	}

	private Integer newRandomInt() {
		return (int) (Math.random() * 10);
	}

	@Override
	public boolean canStopEnemy(Enemy enemy) {
		return chancesToSolve.contains(enemy.getProblem());
	}
}
