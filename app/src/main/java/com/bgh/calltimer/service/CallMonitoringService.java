package com.bgh.calltimer.service;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by BastinGomez on 2015-06-21.
 *
 * Monitoring service for minutes usage
 */
public class CallMonitoringService extends IntentService{

    public CallMonitoringService(String name){
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
