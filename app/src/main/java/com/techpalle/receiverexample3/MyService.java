package com.techpalle.receiverexample3;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle b =intent.getExtras();
        String name = b.getString("name");
        Toast.makeText(MyService.this, "Name is... "+name, Toast.LENGTH_SHORT).show();
        // trigger OR start BroadCast receiver USE intent and sendBroadCast
        Intent intent1 = new Intent();
        intent1.setAction("WORK_DONE");
        sendBroadcast(intent1);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
