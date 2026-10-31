package com.alipay.sdk.m.w0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static String e = "OpenDeviceId library";
    public static boolean f;
    public com.alipay.sdk.m.v0.a b;
    public ServiceConnection c;
    public Context a = null;
    public InterfaceC0029b d = null;

    /* JADX INFO: compiled from: N673 */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.b = com.alipay.sdk.m.v0.a.AbstractBinderC0026a.a(iBinder);
            if (b.this.d != null) {
                b.this.d.a("Deviceid Service Connected", b.this);
            }
            b.this.b("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.b = null;
            b.this.b("Service onServiceDisconnected");
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.w0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: N673 */
    public interface InterfaceC0029b {
        void a(Object obj, b bVar);
    }

    public final void a(String str) {
    }

    public String b() {
        if (this.a == null) {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            com.alipay.sdk.m.v0.a aVar = this.b;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        } catch (RemoteException unused) {
            a("getOAID error, RemoteException!");
            return null;
        }
    }

    public final void b(String str) {
    }

    public String c() {
        if (this.a == null) {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            com.alipay.sdk.m.v0.a aVar = this.b;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        } catch (RemoteException unused) {
            a("getUDID error, RemoteException!");
            return null;
        } catch (Exception unused2) {
            a("getUDID error, Exception!");
            return null;
        }
    }

    public String d() {
        Context context = this.a;
        if (context == null) {
            b("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        String packageName = context.getPackageName();
        b("liufeng, getVAID package：" + packageName);
        if (packageName == null || packageName.equals("")) {
            b("input package is null!");
            return null;
        }
        try {
            com.alipay.sdk.m.v0.a aVar = this.b;
            if (aVar != null) {
                return aVar.b(packageName);
            }
            return null;
        } catch (RemoteException unused) {
            a("getVAID error, RemoteException!");
            return null;
        }
    }

    public boolean e() {
        try {
            if (this.b == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.b.c();
        } catch (RemoteException unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    public void f() {
        try {
            this.a.unbindService(this.c);
            b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            a("unBind Service exception");
        }
        this.b = null;
    }

    public int a(Context context, InterfaceC0029b interfaceC0029b) {
        if (context != null) {
            this.a = context;
            this.d = interfaceC0029b;
            this.c = new a();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.a.bindService(intent, this.c, 1)) {
                b("bindService Successful!");
                return 1;
            }
            b("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }

    public String a() {
        Context context = this.a;
        if (context != null) {
            String packageName = context.getPackageName();
            b("liufeng, getAAID package：" + packageName);
            String strA = null;
            if (packageName != null && !packageName.equals("")) {
                try {
                    com.alipay.sdk.m.v0.a aVar = this.b;
                    return (aVar == null || !(((strA = aVar.a(packageName)) == null || "".equals(strA)) && this.b.c(packageName))) ? strA : this.b.a(packageName);
                } catch (RemoteException unused) {
                    a("getAAID error, RemoteException!");
                    return strA;
                }
            }
            b("input package is null!");
            return null;
        }
        b("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public void a(boolean z) {
        f = z;
    }
}
