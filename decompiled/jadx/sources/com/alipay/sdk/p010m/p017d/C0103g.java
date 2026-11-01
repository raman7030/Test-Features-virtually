package com.alipay.sdk.p010m.p017d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import com.alipay.sdk.p010m.p042p0.InterfaceC0189a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.g */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0103g implements InterfaceC0089b {

    /* JADX INFO: renamed from: com.alipay.sdk.m.d.g$b */
    /* JADX INFO: compiled from: N673 */
    public final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public boolean f452a;

        /* JADX INFO: renamed from: b */
        public final LinkedBlockingQueue f453b;

        public b() {
            this.f452a = false;
            this.f453b = new LinkedBlockingQueue();
        }

        /* JADX INFO: renamed from: a */
        public IBinder m561a() {
            if (this.f452a) {
                throw new IllegalStateException();
            }
            this.f452a = true;
            return (IBinder) this.f453b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f453b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
        b bVar = new b();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, bVar, 1)) {
            try {
                return InterfaceC0189a.a.m917a(bVar.m561a()).mo914a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }
}
