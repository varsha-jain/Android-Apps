package com.android.sim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class reciever extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		if("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())){
		
		Intent si=new Intent(context,sim.class);
		si.setAction("com.android.sim");
		context.startService(si);
		
	}
	}
}
