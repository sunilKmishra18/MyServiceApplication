package myserviceapplication.example.com.myserviceapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by M1027054 on 5/9/2016.
 */
public class MyService extends Service {
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
