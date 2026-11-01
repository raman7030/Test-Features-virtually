package com.alipay.sdk.p010m.p058y;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.p010m.p033l.C0161a;
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p033l.EnumC0163c;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p067l.C14536;
import p067l.C24104;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.k */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0248k {

    /* JADX INFO: renamed from: i */
    public static final String f1175i = "sp_bind_failed";

    /* JADX INFO: renamed from: j */
    public static final String f1176j = "failed";

    /* JADX INFO: renamed from: k */
    public static final String f1177k = "scheme_failed";

    /* JADX INFO: renamed from: a */
    public Activity f1178a;

    /* JADX INFO: renamed from: b */
    public volatile IAlixPay f1179b;

    /* JADX INFO: renamed from: d */
    public boolean f1181d;

    /* JADX INFO: renamed from: e */
    public f f1182e;

    /* JADX INFO: renamed from: f */
    public final C0233a f1183f;

    /* JADX INFO: renamed from: c */
    public final Object f1180c = IAlixPay.class;

    /* JADX INFO: renamed from: g */
    public boolean f1184g = false;

    /* JADX INFO: renamed from: h */
    public String f1185h = null;

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.k$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements APayEntranceActivity.InterfaceC0068a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f1186a;

        public a(Object obj) {
            this.f1186a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.InterfaceC0068a
        /* JADX INFO: renamed from: a */
        public void mo388a(String str) {
            C0248k.this.f1185h = str;
            synchronized (this.f1186a) {
                try {
                    this.f1186a.notify();
                } catch (Throwable th) {
                    C0167a.m751a(C0248k.this.f1183f, C0168b.f618l, "BSAResultEx", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.k$b */
    /* JADX INFO: compiled from: N673 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ APayEntranceActivity.InterfaceC0068a f1188a;

        public b(APayEntranceActivity.InterfaceC0068a interfaceC0068a) {
            this.f1188a = interfaceC0068a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0248k.this.f1183f == null || C0248k.this.f1183f.m1114h()) {
                return;
            }
            C0167a.m755b(C0248k.this.f1183f, C0168b.f618l, C0168b.f610e0, "");
            if (C0180b.m829i().m874y()) {
                C0248k.this.f1183f.m1104b(true);
                this.f1188a.mo388a(C0162b.m728a());
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.k$c */
    /* JADX INFO: compiled from: N673 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Intent f1190a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f1191b;

        public c(Intent intent, Object obj) {
            this.f1190a = intent;
            this.f1191b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C0248k.this.f1178a != null) {
                    C0248k.this.f1178a.startActivity(this.f1190a);
                    return;
                }
                C0167a.m755b(C0248k.this.f1183f, C0168b.f618l, C0168b.f608c0, "");
                Context contextM1101b = C0248k.this.f1183f.m1101b();
                if (contextM1101b != null) {
                    contextM1101b.startActivity(this.f1190a);
                }
            } catch (Throwable th) {
                C0167a.m751a(C0248k.this.f1183f, C0168b.f618l, C0168b.f609d0, th);
                C0254q.m1265a("alipaySdk", C0171b.f704q, C0248k.this.f1178a, C0248k.this.f1183f);
                synchronized (this.f1191b) {
                    try {
                        C0248k.this.f1185h = C0248k.f1177k;
                        this.f1191b.notify();
                    } catch (Throwable th2) {
                        C0167a.m751a(C0248k.this.f1183f, C0168b.f618l, "BSAResultEx", th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.k$d */
    /* JADX INFO: compiled from: N673 */
    public class d extends IRemoteServiceCallback.Stub {
        public d() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) {
            C0167a.m750a(C0248k.this.f1183f, C0168b.f626p, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (C0248k.this.f1182e != null) {
                    C0248k.this.f1182e.mo398a();
                }
                if (C0248k.this.f1183f != null) {
                    C0248k.this.f1183f.m1107c(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                C0167a.m751a(C0248k.this.f1183f, C0168b.f618l, C0168b.f605Z, e);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                C0167a.m750a(C0248k.this.f1183f, C0168b.f618l, "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (C0248k.this.f1178a == null) {
                    C0167a.m755b(C0248k.this.f1183f, C0168b.f618l, C0168b.f606a0, "");
                    Context contextM1101b = C0248k.this.f1183f.m1101b();
                    if (contextM1101b != null) {
                        contextM1101b.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C0248k.this.f1178a.startActivity(intent);
                C0167a.m750a(C0248k.this.f1183f, C0168b.f618l, "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th) {
                C0167a.m751a(C0248k.this.f1183f, C0168b.f618l, C0168b.f607b0, th);
                throw th;
            }
        }

        public /* synthetic */ d(C0248k c0248k, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.k$e */
    /* JADX INFO: compiled from: N673 */
    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0167a.m749a(C0248k.this.f1183f, C0168b.f618l, "srvCon");
            synchronized (C0248k.this.f1180c) {
                C0248k.this.f1179b = IAlixPay.Stub.asInterface(iBinder);
                C0248k.this.f1180c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0167a.m749a(C0248k.this.f1183f, C0168b.f618l, "srvDis");
            C0248k.this.f1179b = null;
        }

        public /* synthetic */ e(C0248k c0248k, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.k$f */
    /* JADX INFO: compiled from: N673 */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo398a();

        /* JADX INFO: renamed from: b */
        void mo399b();
    }

    public C0248k(Activity activity, C0233a c0233a, f fVar) {
        this.f1178a = activity;
        this.f1183f = c0233a;
        this.f1182e = fVar;
        C0244g.m1203d(C0170a.f659B, "alipaySdk");
    }

    /* JADX INFO: renamed from: a */
    public String m1221a(String str, boolean z) {
        Throwable th;
        C0254q.c cVarM1251a;
        String strM1274b = "";
        PackageInfo packageInfo = null;
        try {
            List listM862m = C0180b.m829i().m862m();
            if (!C0180b.m829i().f825g || listM862m == null) {
                listM862m = C0161a.f547d;
            }
            cVarM1251a = C0254q.m1251a(this.f1183f, this.f1178a, listM862m);
            if (cVarM1251a != null) {
                try {
                    if (cVarM1251a.m1304a(this.f1183f) || cVarM1251a.m1303a() || C0254q.m1267a(cVarM1251a.f1224a)) {
                        return f1176j;
                    }
                    PackageInfo packageInfo2 = cVarM1251a.f1224a;
                    if (packageInfo2 != null && !"com.eg.android.AlipayGphone".equals(packageInfo2.packageName)) {
                        strM1274b = cVarM1251a.f1224a.packageName;
                    } else {
                        strM1274b = C0254q.m1274b();
                    }
                    PackageInfo packageInfo3 = cVarM1251a.f1224a;
                    packageInfo = packageInfo3 != null ? packageInfo3 : null;
                    String strM847d = C0180b.m829i().m847d();
                    if (strM847d != null && strM847d.length() > 0) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strM847d).optJSONObject(strM1274b);
                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    int i = Integer.parseInt(next);
                                    if (packageInfo != null && packageInfo.versionCode >= i) {
                                        try {
                                            boolean zM841a = C0180b.m829i().m841a(this.f1178a, Integer.parseInt(jSONObjectOptJSONObject.getString(next)));
                                            this.f1184g = zM841a;
                                            if (zM841a) {
                                                break;
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C0167a.m751a(this.f1183f, C0168b.f618l, C0168b.f593N, th);
                }
                boolean zM1280b = C0254q.m1280b(this.f1183f);
                if ((z || this.f1184g) && !zM1280b && m1213a(strM1274b, this.f1178a, this.f1183f)) {
                    return m1219a(str, strM1274b, packageInfo);
                }
                return m1220a(str, strM1274b, packageInfo, cVarM1251a);
            }
            return f1176j;
        } catch (Throwable th3) {
            th = th3;
            cVarM1251a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1223a(C0254q.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.f1224a) == null) {
            return;
        }
        if (!C0180b.m829i().m844b(this.f1183f)) {
            C0233a c0233a = this.f1183f;
            String strM1228a = C0250m.m1228a(c0233a, c0233a.m1101b(), f1175i, "false");
            C0244g.m1203d(C0170a.f659B, "get SP_BIND_FAILED: " + strM1228a);
            if (TextUtils.isEmpty(strM1228a) || TextUtils.equals(strM1228a, "false")) {
                return;
            }
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f1178a.startActivity(intent);
        } catch (Throwable th) {
            C0167a.m751a(this.f1183f, C0168b.f618l, C0168b.f612g0, th);
        }
        Thread.sleep(200L);
    }

    /* JADX INFO: renamed from: a */
    public final String m1219a(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        C0244g.m1203d(C0170a.f659B, "pay payInvokeAct");
        C0167a.m750a(this.f1183f, C0168b.f618l, C0168b.f603X, C24104.m53357(str2, "|", str3));
        Activity activity = this.f1178a;
        C0233a c0233a = this.f1183f;
        C0167a.m748a(activity, c0233a, str, c0233a.f1098d);
        return m1218a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m1220a(String str, String str2, PackageInfo packageInfo, C0254q.c cVar) {
        String str3;
        Activity activity;
        boolean zContains = false;
        int i = packageInfo != null ? packageInfo.versionCode : 0;
        C0244g.m1203d(C0170a.f659B, "pay bind or scheme");
        C0233a c0233a = this.f1183f;
        if (c0233a != null && !TextUtils.isEmpty(c0233a.f1101g)) {
            zContains = this.f1183f.f1101g.toLowerCase().contains(C0168b.f622n);
        }
        if (!zContains && C0254q.m1288d(this.f1183f, str2)) {
            if (cVar != null) {
                try {
                    if (C0180b.m829i().m832C()) {
                        m1223a(cVar);
                    }
                } catch (Throwable unused) {
                }
            }
            C0167a.m749a(this.f1183f, C0168b.f618l, "BindSkipByL");
            str3 = f1176j;
        } else {
            if (cVar != null) {
                try {
                    if (!C0180b.m829i().m867r()) {
                        m1223a(cVar);
                    }
                } catch (Throwable unused2) {
                }
            }
            Pair pairM1217a = m1217a(str, str2, this.f1183f);
            str3 = (String) pairM1217a.first;
            try {
                if (f1176j.equals(str3) && ((Boolean) pairM1217a.second).booleanValue() && C0180b.m829i().m865p()) {
                    C0167a.m749a(this.f1183f, C0168b.f618l, "BindRetry");
                    str3 = (String) m1217a(str, str2, this.f1183f).first;
                }
            } catch (Throwable th) {
                C0167a.m751a(this.f1183f, C0168b.f618l, "BindRetryEx", th);
            }
        }
        C0244g.m1203d(C0170a.f659B, "pay bind result: " + str3);
        Activity activity2 = this.f1178a;
        C0233a c0233a2 = this.f1183f;
        C0167a.m748a(activity2, c0233a2, str, c0233a2.f1098d);
        if (f1176j.equals(str3)) {
            if (!C0180b.m829i().m844b(this.f1183f)) {
                C0244g.m1203d(C0170a.f659B, "save SP_BIND_FAILED: true");
                C0233a c0233a3 = this.f1183f;
                C0250m.m1231b(c0233a3, c0233a3.m1101b(), f1175i, "true");
            }
            if (!"com.eg.android.AlipayGphone".equals(str2)) {
                C0167a.m750a(this.f1183f, C0168b.f618l, "BSPNotStartByAlipay", str2 + "|" + i);
                return str3;
            }
            if (i >= 460 && !zContains && (activity = this.f1178a) != null && m1213a(str2, activity, this.f1183f)) {
                return m1219a(str, str2, packageInfo);
            }
        }
        return str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Pair m1217a(String str, String str2, C0233a c0233a) {
        int i;
        e eVar;
        IRemoteServiceCallback dVar;
        Activity activity;
        int version;
        String strM728a;
        Activity activity2;
        Activity activity3;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(C0254q.m1284c(str2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbM33191 = C14536.m33191("", "|", jElapsedRealtime);
        sbM33191.append(str != null ? str.length() : 0);
        C0167a.m750a(c0233a, C0168b.f618l, C0168b.f597R, sbM33191.toString());
        C0167a.m748a(this.f1178a, c0233a, str, c0233a.f1098d);
        try {
            try {
                if (C0180b.m829i().m855h()) {
                    C0167a.m750a(c0233a, C0168b.f618l, "stSrv", "skipped");
                } else {
                    ComponentName componentNameStartService = this.f1178a.getApplication().startService(intent);
                    C0167a.m750a(c0233a, C0168b.f618l, "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : "null");
                }
            } catch (Throwable th) {
                C0167a.m751a(c0233a, C0168b.f618l, C0168b.f589J, th);
                C0254q.m1265a("alipaySdk", C0171b.f701n, this.f1178a, this.f1183f);
                return new Pair(f1176j, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f590K, th2);
        }
        if (C0180b.m829i().m845c()) {
            C0167a.m750a(c0233a, C0168b.f618l, "bindFlg", "imp");
            i = 65;
        } else {
            i = 1;
        }
        boolean zM843b = C0180b.m829i().m843b();
        if (Build.VERSION.SDK_INT >= 34 && zM843b) {
            i |= 512;
            C0167a.m750a(c0233a, C0168b.f618l, "bindFlg", "allow");
        }
        a aVar = null;
        e eVar2 = new e(this, aVar);
        if (!this.f1178a.getApplicationContext().bindService(intent, eVar2, i)) {
            throw new Throwable("bindService fail");
        }
        synchronized (this.f1180c) {
            if (this.f1179b == null) {
                try {
                    this.f1180c.wait(C0180b.m829i().m861l());
                } catch (InterruptedException e2) {
                    C0167a.m751a(c0233a, C0168b.f618l, C0168b.f591L, e2);
                }
            }
        }
        IAlixPay iAlixPay = this.f1179b;
        try {
            if (iAlixPay == null) {
                C0167a.m755b(c0233a, C0168b.f618l, C0168b.f584E, "");
                C0254q.m1265a("alipaySdk", C0171b.f702o, this.f1178a, this.f1183f);
                Pair pair = new Pair(f1176j, Boolean.TRUE);
                try {
                    this.f1178a.getApplicationContext().unbindService(eVar2);
                } catch (Throwable th3) {
                    C0244g.m1199a(th3);
                }
                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f599T, "" + SystemClock.elapsedRealtime());
                C0167a.m748a(this.f1178a, c0233a, str, c0233a.f1098d);
                this.f1179b = null;
                if (this.f1181d && (activity4 = this.f1178a) != null) {
                    activity4.setRequestedOrientation(0);
                    this.f1181d = false;
                }
                return pair;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f598S, "" + jElapsedRealtime2);
            f fVar = this.f1182e;
            if (fVar != null) {
                fVar.mo399b();
            }
            if (this.f1178a.getRequestedOrientation() == 0) {
                this.f1178a.setRequestedOrientation(1);
                this.f1181d = true;
            }
            try {
                version = iAlixPay.getVersion();
            } catch (Throwable th4) {
                C0244g.m1199a(th4);
                version = 0;
            }
            dVar = new d(this, aVar);
            try {
                if (version >= 3) {
                    iAlixPay.registerCallback03(dVar, str, null);
                } else {
                    iAlixPay.registerCallback(dVar);
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                try {
                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f600U, "" + jElapsedRealtime3);
                    if (version >= 3) {
                        iAlixPay.r03(C0168b.f618l, "bind_pay", null);
                    }
                    try {
                        if (version >= 2) {
                            Map mapM1091a = C0233a.m1091a(c0233a);
                            mapM1091a.put("ts_bind", String.valueOf(jElapsedRealtime));
                            mapM1091a.put("ts_bend", String.valueOf(jElapsedRealtime2));
                            mapM1091a.put("ts_pay", String.valueOf(jElapsedRealtime3));
                            strM728a = iAlixPay.pay02(str, mapM1091a);
                        } else {
                            strM728a = iAlixPay.Pay(str);
                        }
                        eVar = eVar2;
                    } catch (Throwable th5) {
                        C0233a c0233a2 = this.f1183f;
                        if (c0233a2 != null && !c0233a2.m1116j()) {
                            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f587H, th5);
                            C0254q.m1265a("alipaySdk", C0171b.f703p, this.f1178a, this.f1183f);
                            if (C0180b.m829i().m872w()) {
                                Pair pair2 = new Pair(f1176j, Boolean.FALSE);
                                try {
                                    iAlixPay.unregisterCallback(dVar);
                                } catch (Throwable th6) {
                                    C0244g.m1199a(th6);
                                }
                                try {
                                    this.f1178a.getApplicationContext().unbindService(eVar2);
                                } catch (Throwable th7) {
                                    C0244g.m1199a(th7);
                                }
                                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f599T, "" + SystemClock.elapsedRealtime());
                                C0167a.m748a(this.f1178a, c0233a, str, c0233a.f1098d);
                                this.f1179b = null;
                                if (this.f1181d && (activity2 = this.f1178a) != null) {
                                    activity2.setRequestedOrientation(0);
                                    this.f1181d = false;
                                }
                                return pair2;
                            }
                        }
                        eVar = eVar2;
                        try {
                            strM728a = C0162b.m728a();
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                    String str3 = strM728a;
                    try {
                        iAlixPay.unregisterCallback(dVar);
                    } catch (Throwable th9) {
                        C0244g.m1199a(th9);
                    }
                    try {
                        this.f1178a.getApplicationContext().unbindService(eVar);
                    } catch (Throwable th10) {
                        C0244g.m1199a(th10);
                    }
                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f599T, "" + SystemClock.elapsedRealtime());
                    C0167a.m748a(this.f1178a, c0233a, str, c0233a.f1098d);
                    this.f1179b = null;
                    if (this.f1181d && (activity3 = this.f1178a) != null) {
                        activity3.setRequestedOrientation(0);
                        this.f1181d = false;
                    }
                    return new Pair(str3, Boolean.FALSE);
                } catch (Throwable th11) {
                    th = th11;
                    eVar = eVar2;
                }
            } catch (Throwable th12) {
                th = th12;
                eVar = eVar2;
            }
        } catch (Throwable th13) {
            th = th13;
            eVar = eVar2;
            dVar = null;
        }
        try {
            C0167a.m752a(c0233a, C0168b.f618l, C0168b.f584E, th, "in_bind");
            return new Pair(f1176j, Boolean.TRUE);
        } finally {
            if (dVar != null) {
                try {
                    iAlixPay.unregisterCallback(dVar);
                } catch (Throwable th14) {
                    C0244g.m1199a(th14);
                }
            }
            try {
                this.f1178a.getApplicationContext().unbindService(eVar);
            } catch (Throwable th15) {
                C0244g.m1199a(th15);
            }
            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f599T, "" + SystemClock.elapsedRealtime());
            C0167a.m748a(this.f1178a, c0233a, str, c0233a.f1098d);
            this.f1179b = null;
            if (this.f1181d && (activity = this.f1178a) != null) {
                activity.setRequestedOrientation(0);
                this.f1181d = 0 == true ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final String m1218a(String str, String str2) {
        JSONObject jSONObject;
        String str3;
        Object obj = new Object();
        String strM1253a = C0254q.m1253a(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0167a.m750a(this.f1183f, C0168b.f618l, "BSAStart", strM1253a + "|" + jElapsedRealtime);
        C0233a.a.m1120a(this.f1183f, strM1253a);
        a aVar = new a(obj);
        APayEntranceActivity.f213h.put(strM1253a, aVar);
        try {
            HashMap mapM1091a = C0233a.m1091a(this.f1183f);
            mapM1091a.put("ts_intent", String.valueOf(jElapsedRealtime));
            jSONObject = new JSONObject(mapM1091a);
        } catch (Throwable th) {
            try {
                C0167a.m751a(this.f1183f, C0168b.f618l, "BSALocEx", th);
                jSONObject = null;
            } catch (InterruptedException e2) {
                C0167a.m751a(this.f1183f, C0168b.f618l, "BSAWaiting", e2);
                EnumC0163c enumC0163c = EnumC0163c.PAY_WAITTING;
                return C0162b.m729a(enumC0163c.m741c(), enumC0163c.m739b(), "");
            } catch (Throwable th2) {
                C0167a.m751a(this.f1183f, C0168b.f618l, "BSAEx", th2);
                C0254q.m1265a("alipaySdk", C0171b.f704q, this.f1178a, this.f1183f);
                return f1177k;
            }
        }
        Intent intent = new Intent(this.f1178a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra(APayEntranceActivity.f209d, str);
        intent.putExtra(APayEntranceActivity.f210e, str2);
        intent.putExtra(APayEntranceActivity.f211f, strM1253a);
        if (jSONObject != null) {
            intent.putExtra(APayEntranceActivity.f212g, jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(aVar), C0180b.m829i().m861l());
        Activity activity = this.f1178a;
        C0233a c0233a = this.f1183f;
        C0167a.m748a(activity, c0233a, str, c0233a.f1098d);
        if (C0180b.m829i().m831B()) {
            new Handler(Looper.getMainLooper()).post(new c(intent, obj));
        } else {
            try {
                Activity activity2 = this.f1178a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    C0167a.m755b(this.f1183f, C0168b.f618l, C0168b.f606a0, "");
                    Context contextM1101b = this.f1183f.m1101b();
                    if (contextM1101b != null) {
                        contextM1101b.startActivity(intent);
                    }
                }
            } catch (Throwable th3) {
                C0167a.m751a(this.f1183f, C0168b.f618l, C0168b.f607b0, th3);
                throw th3;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str4 = this.f1185h;
        try {
            str3 = (String) C0252o.m1237a(this.f1183f, str4).get(C0252o.f1206a);
            if (str3 == null) {
                str3 = "null";
            }
        } catch (Throwable th4) {
            str3 = "unknown";
            C0167a.m751a(this.f1183f, C0168b.f618l, "BSAStatEx", th4);
        }
        C0167a.m749a(this.f1183f, C0168b.f618l, "BSADone-" + str3);
        if (!TextUtils.isEmpty(str4)) {
            return str4;
        }
        C0167a.m749a(this.f1183f, C0168b.f618l, "BSAEmpty");
        return f1177k;
    }

    /* JADX INFO: renamed from: a */
    public void m1222a() {
        this.f1178a = null;
        this.f1182e = null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1213a(String str, Context context, C0233a c0233a) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            C0167a.m749a(c0233a, C0168b.f618l, "BSADetectFail");
            return false;
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, "BSADetectFail", th);
            return false;
        }
    }
}
