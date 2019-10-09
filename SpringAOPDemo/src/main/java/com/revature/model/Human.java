package com.revature.model;

public class Human extends Animal {

	private String gitHubUsername;

	@Override
	public String toString() {
		return "Human [speed=" + speed + ", isHungry=" + isHungry + ", gitHub=" + gitHubUsername + "]";
	}

	public String getGitHubUsername() {
		return gitHubUsername;
	}

	public void setGitHubUsername(String gitHubUsername) {
		this.gitHubUsername = gitHubUsername;
	}

}
