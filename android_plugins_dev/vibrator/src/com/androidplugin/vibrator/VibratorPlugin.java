package com.androidplugin.vibrator;

import android.app.Activity;
import android.app.Service;
import android.os.Vibrator; 
import android.util.Log;

public class VibratorPlugin 
{	
	private Activity mActivity;
	private Vibrator mVibrator;
	
	public VibratorPlugin(Activity currentActivity)
	{
		Log.i("VibratorPlugin", "Constructor called with currentActivity = " + currentActivity);
		mActivity = currentActivity;
		mVibrator = (Vibrator)mActivity.getApplication().getSystemService(Service.VIBRATOR_SERVICE); 
	}
	
	/**
	 * ��ʼ��
	 * @param milliseconds
	 */
	public void shake(long milliseconds)
	{
		Log.i("VibratorPlugin", "shake milliseconds= " + milliseconds);
		mVibrator.vibrate(milliseconds);
	}
	
	/**
	 * ֹͣ��
	 */
	public void stopShake()
	{
		Log.i("VibratorPlugin", "stop shake");
		mVibrator.cancel();
	}
}
