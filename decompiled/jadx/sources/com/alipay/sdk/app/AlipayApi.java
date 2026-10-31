package com.alipay.sdk.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.alipay.sdk.app.debug.AlipayDebugOptions;
import com.alipay.sdk.m.w.b;
import com.alipay.sdk.m.y.g;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class AlipayApi {
    public static final String a = "com.eg.android.AlipayGphone";
    public static final String b = "com.eg.android.AlipayGphone.CashierSDKRegister";
    public static final String c = "appId";
    public static ServiceConnection d;
    public static boolean e;
    public static WeakReference f;
    public static AlipayDebugOptions g;

    /* JADX INFO: compiled from: N673 */
    public class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            AlipayApi.e = false;
            AlipayApi.d = null;
            g.d(com.alipay.sdk.m.n.a.B, "AlipayApi registerApp onBindingDied");
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            AlipayApi.e = true;
            g.d(com.alipay.sdk.m.n.a.B, "AlipayApi registerApp onNullBinding");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g.d(com.alipay.sdk.m.n.a.B, "AlipayApi registerApp onServiceConnected");
            AlipayApi.e = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AlipayApi.e = false;
            AlipayApi.d = null;
            g.d(com.alipay.sdk.m.n.a.B, "AlipayApi registerApp onServiceDisconnected");
        }
    }

    public static void registerApp(Context context, String str) {
        if (context == null) {
            return;
        }
        b.c().a(context);
        boolean zC = com.alipay.sdk.m.o.b.i().c(null);
        StringBuilder sb = new StringBuilder("AlipayApi registerApp appId: ");
        sb.append(str);
        sb.append(" isSupportRegisterApp:");
        sb.append(!zC);
        sb.append(" registerAppServiceConnectSuccess:");
        sb.append(e);
        g.d(com.alipay.sdk.m.n.a.B, sb.toString());
        if (zC) {
            return;
        }
        boolean zE = com.alipay.sdk.m.o.b.i().e(null);
        g.d(com.alipay.sdk.m.n.a.B, "AlipayApi registerApp isFetchConfigWhenRegisterApp: " + zE);
        if (zE) {
            PayTask.fetchSdkConfig(context);
        }
        if (e) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage("com.eg.android.AlipayGphone");
        intent.setAction(b);
        Bundle bundle = new Bundle();
        bundle.putString(c, str);
        intent.putExtras(bundle);
        a aVar = new a();
        d = aVar;
        try {
            g.d(com.alipay.sdk.m.n.a.B, "AlipayApi registerApp bindServiceResult:" + context.bindService(intent, aVar, 1));
        } catch (Throwable th) {
            g.a(th);
        }
        f = new WeakReference(context);
    }

    public static void setAlipayDebugOptions(AlipayDebugOptions alipayDebugOptions) {
        g = alipayDebugOptions;
    }
}
