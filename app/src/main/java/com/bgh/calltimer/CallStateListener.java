package com.bgh.calltimer;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * @author BastinGomez
 * @since 2015-06-21
 *
 * Listener for phone's incoming and outgoing calls.
 */
public class CallStateListener extends PhoneStateListener {
    @Override
    public void onCallStateChanged(int state, String phoneNumber){
        String callStateStr = "Unknown";

        switch (state){
            case TelephonyManager.CALL_STATE_OFFHOOK:
                callStateStr = "offhook";
                break;
            case TelephonyManager.CALL_STATE_RINGING:
                callStateStr = "ringing. incoming number is: " + phoneNumber;
                break;
            case TelephonyManager.CALL_STATE_IDLE:
                callStateStr = "idle";
                break;
            default:
                break;
        }

        System.out.print(callStateStr);
    }
}
