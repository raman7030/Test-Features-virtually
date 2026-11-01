package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ab */
/* JADX INFO: compiled from: UAPE */
/* JADX INFO: loaded from: classes.dex */
public class C0644ab implements InterfaceC0730z {

    /* JADX INFO: renamed from: a */
    public static final String f2219a = "Coolpad";

    /* JADX INFO: renamed from: b */
    public static final String f2220b = "com.coolpad.deviceidsupport";

    /* JADX INFO: renamed from: c */
    public static final String f2221c = "com.coolpad.deviceidsupport.DeviceIdService";

    /* JADX INFO: renamed from: d */
    public static InterfaceC0642a f2222d;

    /* JADX INFO: renamed from: f */
    public CountDownLatch f2224f;

    /* JADX INFO: renamed from: g */
    public Context f2225g;

    /* JADX INFO: renamed from: e */
    public String f2223e = "";

    /* JADX INFO: renamed from: h */
    public final ServiceConnection f2226h = new ServiceConnection() { // from class: com.umeng.analytics.pro.ab.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                InterfaceC0642a unused = C0644ab.f2222d = InterfaceC0642a.a.m2119a(iBinder);
                C0644ab.this.f2223e = C0644ab.f2222d.mo2115b(C0644ab.this.f2225g.getPackageName());
                String unused2 = C0644ab.this.f2223e;
            } catch (RemoteException | NullPointerException e) {
                e.getMessage();
            }
            C0644ab.this.f2224f.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InterfaceC0642a unused = C0644ab.f2222d = null;
        }
    };

    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        if (context == null) {
            return null;
        }
        this.f2225g = context.getApplicationContext();
        this.f2224f = new CountDownLatch(1);
        try {
            m2128b(context);
            this.f2224f.await(500L, TimeUnit.MILLISECONDS);
            return this.f2223e;
        } catch (InterruptedException e) {
            e.getMessage();
            return null;
        } finally {
            m2130c(context);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2128b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(f2220b, f2221c));
            context.bindService(intent, this.f2226h, 1);
        } catch (Throwable th) {
            th.getMessage();
            this.f2224f.countDown();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2130c(Context context) {
        try {
            context.unbindService(this.f2226h);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
