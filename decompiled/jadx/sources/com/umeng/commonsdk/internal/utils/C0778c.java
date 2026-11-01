package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C0771a;
import com.umeng.commonsdk.internal.C0772b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.c */
/* JADX INFO: compiled from: X47Z */
/* JADX INFO: loaded from: classes.dex */
public class C0778c {

    /* JADX INFO: renamed from: a */
    public static final String f3272a = "BatteryUtils";

    /* JADX INFO: renamed from: b */
    public static boolean f3273b;

    /* JADX INFO: renamed from: c */
    public static Context f3274c;

    /* JADX INFO: renamed from: d */
    public BroadcastReceiver f3275d;

    /* JADX INFO: renamed from: b */
    public synchronized void m2850b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f3274c.registerReceiver(this.f3275d, intentFilter);
            f3273b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f3274c, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m2851c() {
        try {
            f3274c.unregisterReceiver(this.f3275d);
            f3273b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f3274c, th);
        }
    }

    public C0778c() {
        this.f3275d = new BroadcastReceiver() { // from class: com.umeng.commonsdk.internal.utils.c.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "ACTION_BATTERY_CHANGED：battery info cc.");
                        int i = 0;
                        int intExtra = intent.getIntExtra("level", 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra(C0172c.f705a, 0);
                        int i2 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 == 2) {
                                i2 = 1;
                            } else if (intExtra4 == 4) {
                                i2 = 0;
                            } else if (intExtra4 == 5) {
                                i2 = 2;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 == 1) {
                            i = 1;
                        } else if (intExtra5 == 2) {
                            i = 2;
                        }
                        C0777b c0777b = new C0777b();
                        c0777b.f3266a = intExtra;
                        c0777b.f3267b = intExtra2;
                        c0777b.f3269d = i2;
                        c0777b.f3268c = intExtra3;
                        c0777b.f3270e = i;
                        c0777b.f3271f = System.currentTimeMillis();
                        UMWorkDispatch.sendEvent(context, C0771a.f3223h, C0772b.m2790a(C0778c.f3274c).m2791a(), c0777b);
                        C0778c.this.m2851c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(C0778c.f3274c, th);
                }
            }
        };
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.c$a */
    /* JADX INFO: compiled from: X47Z */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0778c f3277a = new C0778c();
    }

    /* JADX INFO: renamed from: a */
    public static C0778c m2847a(Context context) {
        if (f3274c == null && context != null) {
            f3274c = context.getApplicationContext();
        }
        return a.f3277a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m2849a() {
        return f3273b;
    }
}
