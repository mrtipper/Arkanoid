package ca.mrtipper.arkanoid.controller;

public interface GameLoopObserver {
	public void update(float delta_time);
	public void render();
}
