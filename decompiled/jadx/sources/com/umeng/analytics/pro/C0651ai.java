package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ai */
/* JADX INFO: compiled from: FBLP */
/* JADX INFO: loaded from: classes.dex */
public class C0651ai implements InterfaceC0730z {
    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        a aVar = new a();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return InterfaceC0669b.a.m2317a(aVar.m2139a()).mo2314a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.ai$a */
    /* JADX INFO: compiled from: FBLP */
    public final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public boolean f2242a;

        /* JADX INFO: renamed from: b */
        public final LinkedBlockingQueue f2243b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f2243b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public IBinder m2139a() {
            if (this.f2242a) {
                throw new IllegalStateException();
            }
            this.f2242a = true;
            return (IBinder) this.f2243b.poll(5L, TimeUnit.SECONDS);
        }

        public a() {
            this.f2242a = false;
            this.f2243b = new LinkedBlockingQueue();
        }
    }
}
