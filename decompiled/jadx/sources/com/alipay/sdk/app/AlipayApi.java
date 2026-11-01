package com.alipay.sdk.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.alipay.sdk.app.debug.AlipayDebugOptions;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class AlipayApi {

    /* JADX INFO: renamed from: a */
    public static final String f217a = "com.eg.android.AlipayGphone";

    /* JADX INFO: renamed from: b */
    public static final String f218b = "com.eg.android.AlipayGphone.CashierSDKRegister";

    /* JADX INFO: renamed from: c */
    public static final String f219c = "appId";

    /* JADX INFO: renamed from: d */
    public static ServiceConnection f220d;

    /* JADX INFO: renamed from: e */
    public static boolean f221e;

    /* JADX INFO: renamed from: f */
    public static WeakReference f222f;

    /* JADX INFO: renamed from: g */
    public static AlipayDebugOptions f223g;

    /* JADX INFO: renamed from: com.alipay.sdk.app.AlipayApi$a */
    /* JADX INFO: compiled from: N673 */
    public class ServiceConnectionC0069a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            AlipayApi.f221e = false;
            AlipayApi.f220d = null;
            C0244g.m1203d(C0170a.f659B, "AlipayApi registerApp onBindingDied");
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            AlipayApi.f221e = true;
            C0244g.m1203d(C0170a.f659B, "AlipayApi registerApp onNullBinding");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0244g.m1203d(C0170a.f659B, "AlipayApi registerApp onServiceConnected");
            AlipayApi.f221e = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AlipayApi.f221e = false;
            AlipayApi.f220d = null;
            C0244g.m1203d(C0170a.f659B, "AlipayApi registerApp onServiceDisconnected");
        }
    }

    public static void registerApp(Context context, String str) {
        if (context == null) {
            return;
        }
        C0234b.m1121c().m1124a(context);
        boolean zM846c = C0180b.m829i().m846c(null);
        StringBuilder sb = new StringBuilder("AlipayApi registerApp appId: ");
        sb.append(str);
        sb.append(" isSupportRegisterApp:");
        sb.append(!zM846c);
        sb.append(" registerAppServiceConnectSuccess:");
        sb.append(f221e);
        C0244g.m1203d(C0170a.f659B, sb.toString());
        if (zM846c) {
            return;
        }
        boolean zM850e = C0180b.m829i().m850e(null);
        C0244g.m1203d(C0170a.f659B, "AlipayApi registerApp isFetchConfigWhenRegisterApp: " + zM850e);
        if (zM850e) {
            PayTask.fetchSdkConfig(context);
        }
        if (f221e) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage("com.eg.android.AlipayGphone");
        intent.setAction(f218b);
        Bundle bundle = new Bundle();
        bundle.putString(f219c, str);
        intent.putExtras(bundle);
        ServiceConnectionC0069a serviceConnectionC0069a = new ServiceConnectionC0069a();
        f220d = serviceConnectionC0069a;
        try {
            C0244g.m1203d(C0170a.f659B, "AlipayApi registerApp bindServiceResult:" + context.bindService(intent, serviceConnectionC0069a, 1));
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
        f222f = new WeakReference(context);
    }

    public static void setAlipayDebugOptions(AlipayDebugOptions alipayDebugOptions) {
        f223g = alipayDebugOptions;
    }
}
