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
import com.alipay.sdk.m.y.c;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.d;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.ConcurrentMapC10942;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class OpenAuthTask {
    public static final int Duplex = 5000;
    public static final int NOT_INSTALLED = 4001;
    public static final int OK = 9000;
    public static final int SYS_ERR = 4000;
    public static final Map e = new ConcurrentMapC10942();
    public static long f = -1;
    public static final int g = 122;
    public final Activity b;
    public Callback c;
    public volatile boolean a = false;
    public final Handler d = new Handler(Looper.getMainLooper());

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

    /* JADX INFO: compiled from: N673 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BizType.values().length];
            a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: N673 */
    public final class b implements Runnable {
        public final int a;
        public final String b;
        public final Bundle c;

        public /* synthetic */ b(OpenAuthTask openAuthTask, int i, String str, Bundle bundle, a aVar) {
            this(i, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenAuthTask.this.c != null) {
                OpenAuthTask.this.c.onResult(this.a, this.b, this.c);
            }
        }

        public b(int i, String str, Bundle bundle) {
            this.a = i;
            this.b = str;
            this.c = bundle;
        }
    }

    public OpenAuthTask(Activity activity) {
        this.b = activity;
        com.alipay.sdk.m.w.b.c().a(activity);
    }

    public void execute(String str, BizType bizType, Map map, Callback callback, boolean z) {
        com.alipay.sdk.m.w.a aVar = new com.alipay.sdk.m.w.a(this.b, String.valueOf(map), "oa-" + bizType);
        this.c = callback;
        if (a(aVar, str, bizType, map, z)) {
            com.alipay.sdk.m.m.a.b(this.b, aVar, "", aVar.d);
        }
    }

    public final boolean a(com.alipay.sdk.m.w.a aVar, String str, BizType bizType, Map map, boolean z) {
        PackageInfo packageInfo;
        String strA;
        if (this.a) {
            this.d.post(new b(this, SYS_ERR, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.a = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f <= c.a) {
            this.d.post(new b(this, Duplex, "3s 内重复支付", null, null));
            return true;
        }
        f = jElapsedRealtime;
        com.alipay.sdk.m.l.a.a("");
        String strA2 = q.a(32);
        HashMap map2 = new HashMap(map);
        map2.put("mqpPkgName", this.b.getPackageName());
        map2.put("mqpScene", "sdk");
        List listM = com.alipay.sdk.m.o.b.i().m();
        if (!com.alipay.sdk.m.o.b.i().g || listM == null) {
            listM = com.alipay.sdk.m.l.a.d;
        }
        q.c cVarA = q.a(aVar, this.b, listM);
        if (cVarA == null || cVarA.a(aVar) || cVarA.a() || (packageInfo = cVarA.a) == null || packageInfo.versionCode < 122) {
            if (!z) {
                this.d.post(new b(this, NOT_INSTALLED, "支付宝未安装或签名错误", null, null));
                return true;
            }
            map2.put("mqpScheme", String.valueOf(str));
            map2.put("mqpNotifyName", strA2);
            map2.put("mqpScene", "landing");
            String strA3 = a(bizType, map2);
            Intent intent = new Intent(this.b, (Class<?>) H5OpenAuthActivity.class);
            intent.putExtra("url", "https://render.alipay.com/p/s/i?scheme=" + Uri.encode(strA3));
            com.alipay.sdk.m.w.a.C0028a.a(aVar, intent);
            this.b.startActivity(intent);
            return false;
        }
        try {
            try {
                HashMap mapA = com.alipay.sdk.m.w.a.a(aVar);
                mapA.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                map2.put("mqpLoc", new JSONObject(mapA).toString());
            } catch (Throwable th) {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "OpenAuthLocEx", th);
            }
            String strA4 = a(bizType, map2);
            e.put(strA2, this.c);
            try {
                strA = a(jElapsedRealtime, strA2, bizType, strA4);
            } catch (JSONException e2) {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.q0, e2);
                strA = null;
            }
            if (TextUtils.isEmpty(strA)) {
                this.d.post(new b(this, SYS_ERR, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter(AlipayApi.c, "20001129").appendQueryParameter("payload", strA).build());
            intent2.addFlags(268435456);
            intent2.setPackage(cVarA.a.packageName);
            try {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.Y, "" + jElapsedRealtime);
                com.alipay.sdk.m.w.a.C0028a.a(aVar, strA2);
                this.b.startActivity(intent2);
            } catch (Throwable th2) {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "StartWalletEx", th2);
            }
            return false;
        } catch (Throwable unused) {
            this.d.post(new b(this, SYS_ERR, "业务参数错误", null, null));
            return true;
        }
    }

    public final String a(BizType bizType, Map map) {
        if (bizType != null) {
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter(AlipayApi.c, bizType.appId);
            if (a.a[bizType.ordinal()] == 1) {
                builderAppendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
            }
            for (Map.Entry entry : map.entrySet()) {
                builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return builderAppendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    public final String a(long j, String str, BizType bizType, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsConfig.RTD_START_TIME, String.valueOf(j));
        jSONObject.put(d.aw, str);
        jSONObject.put("package", this.b.getPackageName());
        if (bizType != null) {
            jSONObject.put(AlipayApi.c, bizType.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.40");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName(com.alipay.sdk.m.w.a.D)), 2);
    }

    public static void a(String str, int i, String str2, Bundle bundle) {
        Callback callback = (Callback) e.remove(str);
        if (callback != null) {
            try {
                callback.onResult(i, str2, bundle);
            } catch (Throwable th) {
                g.a(th);
            }
        }
    }
}
