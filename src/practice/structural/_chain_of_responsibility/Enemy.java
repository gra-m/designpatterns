package practice.structural._chain_of_responsibility;

/**
 * Created by Gra_m on 2022 05 26
 */

public class Enemy {
	int problem;

	public Enemy(int problem) {
		this.problem = problem;
	}


	public int getProblem() {
		return this.problem;
	}

	@Override
	public String toString() {
		return "Enemy{" +
				"problem=" + problem +
				'}';
	}
}
