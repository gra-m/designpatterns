package practice.structural._chain_of_responsibility;

/**
 * Created by Gra_m on 2022 05 26
 */

public class Example {
	public static void main(String[] args) {

		DefenderHQ firstTower = new TowerOne();
		DefenderHQ secondTower = new TowerTwo(4);
		DefenderHQ thirdTower = new TowerThree(200);

		firstTower.setNextInChain(secondTower).setNextInChain(thirdTower);

		for(int i = 0; i < 10; i++)
			firstTower.tryToStopEnemy(new Enemy(i));
	}
}
