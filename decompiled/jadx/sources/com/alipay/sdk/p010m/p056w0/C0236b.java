package com.alipay.sdk.p010m.p056w0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.alipay.sdk.p010m.p054v0.InterfaceC0232a;

/* JADX INFO: renamed from: com.alipay.sdk.m.w0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0236b {

    /* JADX INFO: renamed from: e */
    public static String f1120e = "OpenDeviceId library";

    /* JADX INFO: renamed from: f */
    public static boolean f1121f;

    /* JADX INFO: renamed from: b */
    public InterfaceC0232a f1123b;

    /* JADX INFO: renamed from: c */
    public ServiceConnection f1124c;

    /* JADX INFO: renamed from: a */
    public Context f1122a = null;

    /* JADX INFO: renamed from: d */
    public b f1125d = null;

    /* JADX INFO: renamed from: com.alipay.sdk.m.w0.b$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0236b.this.f1123b = InterfaceC0232a.a.m1089a(iBinder);
            if (C0236b.this.f1125d != null) {
                C0236b.this.f1125d.m1140a("Deviceid Service Connected", C0236b.this);
            }
            C0236b.this.m1135b("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0236b.this.f1123b = null;
            C0236b.this.m1135b("Service onServiceDisconnected");
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.w0.b$b */
    /* JADX INFO: compiled from: N673 */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m1140a(Object obj, C0236b c0236b);
    }

    /* JADX INFO: renamed from: a */
    public final void m1132a(String str) {
    }

    /* JADX INFO: renamed from: b */
    public String m1134b() {
        if (this.f1122a == null) {
            m1132a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            InterfaceC0232a interfaceC0232a = this.f1123b;
            if (interfaceC0232a != null) {
                return interfaceC0232a.mo1083a();
            }
            return null;
        } catch (RemoteException unused) {
            m1132a("getOAID error, RemoteException!");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1135b(String str) {
    }

    /* JADX INFO: renamed from: c */
    public String m1136c() {
        if (this.f1122a == null) {
            m1132a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            InterfaceC0232a interfaceC0232a = this.f1123b;
            if (interfaceC0232a != null) {
                return interfaceC0232a.mo1085b();
            }
            return null;
        } catch (RemoteException unused) {
            m1132a("getUDID error, RemoteException!");
            return null;
        } catch (Exception unused2) {
            m1132a("getUDID error, Exception!");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m1137d() {
        Context context = this.f1122a;
        if (context == null) {
            m1135b("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        String packageName = context.getPackageName();
        m1135b("liufeng, getVAID package：" + packageName);
        if (packageName == null || packageName.equals("")) {
            m1135b("input package is null!");
            return null;
        }
        try {
            InterfaceC0232a interfaceC0232a = this.f1123b;
            if (interfaceC0232a != null) {
                return interfaceC0232a.mo1086b(packageName);
            }
            return null;
        } catch (RemoteException unused) {
            m1132a("getVAID error, RemoteException!");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m1138e() {
        try {
            if (this.f1123b == null) {
                return false;
            }
            m1135b("Device support opendeviceid");
            return this.f1123b.mo1087c();
        } catch (RemoteException unused) {
            m1132a("isSupport error, RemoteException!");
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1139f() {
        try {
            this.f1122a.unbindService(this.f1124c);
            m1135b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            m1132a("unBind Service exception");
        }
        this.f1123b = null;
    }

    /* JADX INFO: renamed from: a */
    public int m1130a(Context context, b bVar) {
        if (context != null) {
            this.f1122a = context;
            this.f1125d = bVar;
            this.f1124c = new a();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.f1122a.bindService(intent, this.f1124c, 1)) {
                m1135b("bindService Successful!");
                return 1;
            }
            m1135b("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }

    /* JADX INFO: renamed from: a */
    public String m1131a() {
        Context context = this.f1122a;
        if (context != null) {
            String packageName = context.getPackageName();
            m1135b("liufeng, getAAID package：" + packageName);
            String strMo1084a = null;
            if (packageName != null && !packageName.equals("")) {
                try {
                    InterfaceC0232a interfaceC0232a = this.f1123b;
                    return (interfaceC0232a == null || !(((strMo1084a = interfaceC0232a.mo1084a(packageName)) == null || "".equals(strMo1084a)) && this.f1123b.mo1088c(packageName))) ? strMo1084a : this.f1123b.mo1084a(packageName);
                } catch (RemoteException unused) {
                    m1132a("getAAID error, RemoteException!");
                    return strMo1084a;
                }
            }
            m1135b("input package is null!");
            return null;
        }
        m1135b("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* JADX INFO: renamed from: a */
    public void m1133a(boolean z) {
        f1121f = z;
    }
}
