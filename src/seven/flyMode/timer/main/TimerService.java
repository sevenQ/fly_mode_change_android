package seven.flyMode.timer.main;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TimerService extends IntentService{
	
	private static final String TAG = " TimerService ";
	
	public TimerService() {
		super("TimerService constructor");
	}
	
	public TimerService(String name) {
		super(name);
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		
	}
	
	public static class TimerBroadcast extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
			
		}
		
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

}
