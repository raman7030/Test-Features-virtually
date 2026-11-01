package com.alipay.sdk.p010m.p013b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p011a.InterfaceC0082a;
import com.alipay.sdk.p010m.p058y.C0240c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.alipay.sdk.m.b.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0086b {

    /* JADX INFO: renamed from: a */
    public InterfaceC0082a f309a = null;

    /* JADX INFO: renamed from: b */
    public String f310b = null;

    /* JADX INFO: renamed from: c */
    public String f311c = null;

    /* JADX INFO: renamed from: d */
    public final Object f312d = new Object();

    /* JADX INFO: renamed from: e */
    public ServiceConnection f313e = new a();

    /* JADX INFO: renamed from: com.alipay.sdk.m.b.b$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0086b.this.f309a = InterfaceC0082a.a.m441a(iBinder);
            synchronized (C0086b.this.f312d) {
                C0086b.this.f312d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0086b.this.f309a = null;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.b.b$b */
    /* JADX INFO: compiled from: N673 */
    public class b {

        /* JADX INFO: renamed from: a */
        public static final C0086b f315a = new C0086b(null);
    }

    public /* synthetic */ C0086b(a aVar) {
    }

    /* JADX INFO: renamed from: a */
    public boolean m462a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
            }
            return packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m463b(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f310b)) {
            this.f310b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f311c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f310b, 64).signatures;
            } catch (PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : bArrDigest) {
                            sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException unused2) {
                }
            }
            this.f311c = string;
        }
        String strM442a = ((InterfaceC0082a.a.C2407a) this.f309a).m442a(this.f310b, this.f311c, str);
        return TextUtils.isEmpty(strM442a) ? "" : strM442a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m461a(Context context, String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f309a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f313e, 1)) {
                    synchronized (this.f312d) {
                        try {
                            this.f312d.wait(C0240c.f1145a);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                if (this.f309a == null) {
                    return "";
                }
                try {
                    return m463b(context, str);
                } catch (RemoteException unused2) {
                    return "";
                }
            }
            try {
                return m463b(context, str);
            } catch (RemoteException unused3) {
                return "";
            }
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }
}
