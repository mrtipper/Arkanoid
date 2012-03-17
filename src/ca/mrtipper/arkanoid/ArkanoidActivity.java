package ca.mrtipper.arkanoid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import ca.mrtipper.arkanoid.controller.ArkanoidGameEngine;

public class ArkanoidActivity extends Activity {
	private static final String TAG = ArkanoidActivity.class.getSimpleName();
	private ArkanoidGameEngine game_engine = new ArkanoidGameEngine(this);

	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d(TAG, "Creating...");
		super.onCreate(savedInstanceState);
		game_engine = new ArkanoidGameEngine(this);
		game_engine.Initialize();
        //setContentView(R.layout.main);
        //new GameLoopController()
        //setContentView();
        //Log.d(TAG, "GameView added");
    }
    
    @Override
    protected void onStart() {
    	Log.d(TAG, "Starting...");
    	super.onStart();
    	game_engine.Start();
    }
    
    @Override
    protected void onRestart() {
    	Log.d(TAG, "Restarting...");
    	super.onRestart(); 
    }

    @Override
    protected void onResume() {
    	Log.d(TAG, "Resuming...");
    	super.onResume();	
    }

    @Override
    protected void onPause() {
    	Log.d(TAG, "Pausing...");
    	super.onPause();
    }
    
    @Override
    protected void onStop() {
    	Log.d(TAG, "Stopping...");
    	super.onStop();
    	game_engine.Stop();
    }
    
    @Override
    protected void onDestroy() {
    	Log.d(TAG, "Destroying...");
    	super.onDestroy();
    	game_engine.Destroy();
    }
}