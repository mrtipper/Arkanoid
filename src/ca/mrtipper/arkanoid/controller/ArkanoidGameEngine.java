package ca.mrtipper.arkanoid.controller;

import android.app.Activity;
import android.util.Log;
import ca.mrtipper.arkanoid.R;

public class ArkanoidGameEngine implements GameEngine, GameLoopObserver {
	private static final String TAG = ArkanoidGameEngine.class.getSimpleName();
	private Activity activity;
	private GameLoopThread game_loop_thread;
	
	public ArkanoidGameEngine(Activity activity) {
		this.activity = activity;
	}
	
	public void Initialize() {
		Log.d(TAG, "Initializing...");
		game_loop_thread = new GameLoopThread(this);

		activity.setContentView(R.layout.main);
		//activity.setContentView(new GameView(activity));
        //Log.d(TAG, "GameView added");
	}

	public void Start() {
		game_loop_thread = new GameLoopThread(this);
		game_loop_thread.setRunning(true);
		game_loop_thread.start();		
	}

	public void Stop() {
		boolean retry = true;
		game_loop_thread.setRunning(false);
		while (retry) {
			try {
				game_loop_thread.join();
				retry = false;
			} catch (InterruptedException e) {
			}
		}
	}

	public void Destroy() {
		// TODO Auto-generated method stub
		
	}

	public void update(float delta_time) {
		Log.d(TAG, "Update!");		
	}

	public void render() {
		// TODO Auto-generated method stub
		
	}
}
