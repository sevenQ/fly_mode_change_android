package seven.flyMode.timer.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;

public class Main extends Activity {
	private static final String TAG = " Main ";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
      /*  int flag =  Settings.System.getInt(getContentResolver(), Settings.System.AIRPLANE_MODE_ON, 5);
        LogHelper.d(TAG+" flag "+flag);
        
        Settings.System.putInt(getContentResolver(), Settings.System.AIRPLANE_MODE_ON, 1);
        
        Intent intent = new Intent(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        intent.putExtra("state", true);
        sendBroadcast(intent);*/
       // Intent startServiceIntent = new Intent(this,TimerService.class);
        //startService(startServiceIntent);
        LogHelper.d(TAG + SystemClock.elapsedRealtime());
    
    }
}