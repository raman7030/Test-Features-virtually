package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p010m.p033l.C0161a;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.C0708d;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p067l.ConcurrentMapC12768;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class OpenAuthTask {
    public static final int Duplex = 5000;
    public static final int NOT_INSTALLED = 4001;

    /* JADX INFO: renamed from: OK */
    public static final int f239OK = 9000;
    public static final int SYS_ERR = 4000;

    /* JADX INFO: renamed from: e */
    public static final Map f240e = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: f */
    public static long f241f = -1;

    /* JADX INFO: renamed from: g */
    public static final int f242g = 122;

    /* JADX INFO: renamed from: b */
    public final Activity f244b;

    /* JADX INFO: renamed from: c */
    public Callback f245c;

    /* JADX INFO: renamed from: a */
    public volatile boolean f243a = false;

    /* JADX INFO: renamed from: d */
    public final Handler f246d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: N673 */
    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        public String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    /* JADX INFO: compiled from: N673 */
    public interface Callback {
        void onResult(int i, String str, Bundle bundle);
    }

    /* JADX INFO: renamed from: com.alipay.sdk.app.OpenAuthTask$a */
    /* JADX INFO: compiled from: N673 */
    public /* synthetic */ class C0072a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f247a;

        static {
            int[] iArr = new int[BizType.values().length];
            f247a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f247a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f247a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.app.OpenAuthTask$b */
    /* JADX INFO: compiled from: N673 */
    public final class RunnableC0073b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f248a;

        /* JADX INFO: renamed from: b */
        public final String f249b;

        /* JADX INFO: renamed from: c */
        public final Bundle f250c;

        public /* synthetic */ RunnableC0073b(OpenAuthTask openAuthTask, int i, String str, Bundle bundle, C0072a c0072a) {
            this(i, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenAuthTask.this.f245c != null) {
                OpenAuthTask.this.f245c.onResult(this.f248a, this.f249b, this.f250c);
            }
        }

        public RunnableC0073b(int i, String str, Bundle bundle) {
            this.f248a = i;
            this.f249b = str;
            this.f250c = bundle;
        }
    }

    public OpenAuthTask(Activity activity) {
        this.f244b = activity;
        C0234b.m1121c().m1124a(activity);
    }

    public void execute(String str, BizType bizType, Map map, Callback callback, boolean z) {
        C0233a c0233a = new C0233a(this.f244b, String.valueOf(map), "oa-" + bizType);
        this.f245c = callback;
        if (m408a(c0233a, str, bizType, map, z)) {
            C0167a.m754b(this.f244b, c0233a, "", c0233a.f1098d);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m408a(C0233a c0233a, String str, BizType bizType, Map map, boolean z) {
        PackageInfo packageInfo;
        String strM406a;
        if (this.f243a) {
            this.f246d.post(new RunnableC0073b(this, SYS_ERR, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f243a = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f241f <= C0240c.f1145a) {
            this.f246d.post(new RunnableC0073b(this, Duplex, "3s 内重复支付", null, null));
            return true;
        }
        f241f = jElapsedRealtime;
        C0161a.m726a("");
        String strM1253a = C0254q.m1253a(32);
        HashMap map2 = new HashMap(map);
        map2.put("mqpPkgName", this.f244b.getPackageName());
        map2.put("mqpScene", "sdk");
        List listM862m = C0180b.m829i().m862m();
        if (!C0180b.m829i().f825g || listM862m == null) {
            listM862m = C0161a.f547d;
        }
        C0254q.c cVarM1251a = C0254q.m1251a(c0233a, this.f244b, listM862m);
        if (cVarM1251a == null || cVarM1251a.m1304a(c0233a) || cVarM1251a.m1303a() || (packageInfo = cVarM1251a.f1224a) == null || packageInfo.versionCode < 122) {
            if (!z) {
                this.f246d.post(new RunnableC0073b(this, NOT_INSTALLED, "支付宝未安装或签名错误", null, null));
                return true;
            }
            map2.put("mqpScheme", String.valueOf(str));
            map2.put("mqpNotifyName", strM1253a);
            map2.put("mqpScene", "landing");
            String strM407a = m407a(bizType, map2);
            Intent intent = new Intent(this.f244b, (Class<?>) H5OpenAuthActivity.class);
            intent.putExtra("url", "https://render.alipay.com/p/s/i?scheme=" + Uri.encode(strM407a));
            C0233a.a.m1119a(c0233a, intent);
            this.f244b.startActivity(intent);
            return false;
        }
        try {
            try {
                HashMap mapM1091a = C0233a.m1091a(c0233a);
                mapM1091a.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                map2.put("mqpLoc", new JSONObject(mapM1091a).toString());
            } catch (Throwable th) {
                C0167a.m751a(c0233a, C0168b.f618l, "OpenAuthLocEx", th);
            }
            String strM407a2 = m407a(bizType, map2);
            f240e.put(strM1253a, this.f245c);
            try {
                strM406a = m406a(jElapsedRealtime, strM1253a, bizType, strM407a2);
            } catch (JSONException e) {
                C0167a.m751a(c0233a, C0168b.f618l, C0168b.f629q0, e);
                strM406a = null;
            }
            if (TextUtils.isEmpty(strM406a)) {
                this.f246d.post(new RunnableC0073b(this, SYS_ERR, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter(AlipayApi.f219c, "20001129").appendQueryParameter("payload", strM406a).build());
            intent2.addFlags(268435456);
            intent2.setPackage(cVarM1251a.f1224a.packageName);
            try {
                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f604Y, "" + jElapsedRealtime);
                C0233a.a.m1120a(c0233a, strM1253a);
                this.f244b.startActivity(intent2);
            } catch (Throwable th2) {
                C0167a.m751a(c0233a, C0168b.f618l, "StartWalletEx", th2);
            }
            return false;
        } catch (Throwable unused) {
            this.f246d.post(new RunnableC0073b(this, SYS_ERR, "业务参数错误", null, null));
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m407a(BizType bizType, Map map) {
        if (bizType != null) {
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter(AlipayApi.f219c, bizType.appId);
            if (C0072a.f247a[bizType.ordinal()] == 1) {
                builderAppendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
            }
            for (Map.Entry entry : map.entrySet()) {
                builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return builderAppendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    /* JADX INFO: renamed from: a */
    public final String m406a(long j, String str, BizType bizType, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsConfig.RTD_START_TIME, String.valueOf(j));
        jSONObject.put(C0708d.f2642aw, str);
        jSONObject.put("package", this.f244b.getPackageName());
        if (bizType != null) {
            jSONObject.put(AlipayApi.f219c, bizType.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.40");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName(C0233a.f1077D)), 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m405a(String str, int i, String str2, Bundle bundle) {
        Callback callback = (Callback) f240e.remove(str);
        if (callback != null) {
            try {
                callback.onResult(i, str2, bundle);
            } catch (Throwable th) {
                C0244g.m1199a(th);
            }
        }
    }
}
