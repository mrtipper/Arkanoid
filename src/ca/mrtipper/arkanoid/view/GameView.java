package ca.mrtipper.arkanoid.view;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {
	private static final String TAG = GameView.class.getSimpleName();
	
	public GameView(Context context) {
		super(context);
		
		SurfaceHolder holder = getHolder();
		holder.addCallback(this);
	}

	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		Log.d(TAG, "Surface changed.");
		
	}

	public void surfaceCreated(SurfaceHolder holder) {
		Log.d(TAG, "Surface created.");		
	}

	public void surfaceDestroyed(SurfaceHolder holder) {
		Log.d(TAG, "Surface destoryed.");		
	}
}
