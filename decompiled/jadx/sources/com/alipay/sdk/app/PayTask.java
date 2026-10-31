package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.R;
import com.alipay.sdk.app.debug.AlipayDebugOptions;
import com.alipay.sdk.m.u.h;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.k;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.m;
import com.alipay.sdk.m.y.o;
import com.alipay.sdk.m.y.p;
import com.alipay.sdk.m.y.q;
import com.alipay.sdk.util.H5PayResultModel;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import l.C16014;
import l.C20094;
import l.C2912;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class PayTask {
    public static final Object h = k.class;
    public static long i;
    public Activity a;
    public com.alipay.sdk.m.c0.a b;
    public final String c = "wappaygw.alipay.com/service/rest.htm";
    public final String d = "mclient.alipay.com/service/rest.htm";
    public final String e = "mclient.alipay.com/home/exterfaceAssign.htm";
    public final String f = "mclient.alipay.com/cashier/mobilepay.htm";
    public Map g = new HashMap();

    /* JADX INFO: compiled from: N673 */
    public class b implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ H5PayCallback c;

        public b(String str, boolean z, H5PayCallback h5PayCallback) {
            this.a = str;
            this.b = z;
            this.c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            H5PayResultModel h5PayResultModelH5Pay = PayTask.this.h5Pay(new com.alipay.sdk.m.w.a(PayTask.this.a, this.a, "payInterceptorWithUrl"), this.a, this.b);
            g.d(com.alipay.sdk.m.n.a.B, "inc finished: " + h5PayResultModelH5Pay.getResultCode());
            this.c.onPayResult(h5PayResultModelH5Pay);
        }
    }

    /* JADX INFO: compiled from: N673 */
    public class c implements k.f {
        public c() {
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void b() {
        }
    }

    /* JADX INFO: compiled from: N673 */
    public class d implements Runnable {
        public final /* synthetic */ com.alipay.sdk.m.w.a a;
        public final /* synthetic */ String b;

        public d(com.alipay.sdk.m.w.a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PayTask.this.b(this.a, this.b);
        }
    }

    /* JADX INFO: compiled from: N673 */
    public class e {
        public String a;
        public String b;
        public String c;
        public String d;

        public e() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.d;
        }

        public void a(String str) {
            this.c = str;
        }

        public void b(String str) {
            this.a = str;
        }

        public void c(String str) {
            this.b = str;
        }

        public void d(String str) {
            this.d = str;
        }
    }

    public PayTask(Activity activity) {
        this.a = activity;
        com.alipay.sdk.m.w.b.c().a(this.a);
        this.b = new com.alipay.sdk.m.c0.a(activity, this.a.getString(R.string.alipay_standard_sdk_loading_go_pay));
    }

    public final void b(com.alipay.sdk.m.w.a aVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString(com.alipay.sdk.m.x.a.j);
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            com.alipay.sdk.m.x.a.a(com.alipay.sdk.m.w.b.c().b()).a(strOptString, strOptString2);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.P, th);
        }
    }

    public final void c(com.alipay.sdk.m.w.a aVar, String str) {
        if (aVar.a() && com.alipay.sdk.m.o.b.i().i(aVar)) {
            new Thread(new d(aVar, str)).start();
        }
    }

    public void dismissLoading() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
            this.b = null;
        }
    }

    public synchronized String fetchTradeToken() {
        return l.a(new com.alipay.sdk.m.w.a(this.a, "", "fetchTradeToken"), this.a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.40";
    }

    public synchronized H5PayResultModel h5Pay(com.alipay.sdk.m.w.a aVar, String str, boolean z) {
        H5PayResultModel h5PayResultModel;
        h5PayResultModel = new H5PayResultModel();
        try {
            String[] strArrSplit = a(aVar, str, z).split(l.b);
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    map.put(strSubstring, a(str2, strSubstring));
                }
            }
            if (map.containsKey(o.a)) {
                h5PayResultModel.setResultCode((String) map.get(o.a));
            }
            h5PayResultModel.setReturnUrl(a(str, map));
            if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
                com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.n0, "");
            }
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.o0, th);
            g.a(th);
        }
        return h5PayResultModel;
    }

    public synchronized String pay(String str, boolean z) {
        if (com.alipay.sdk.m.y.c.a()) {
            return com.alipay.sdk.m.l.b.b();
        }
        return a(new com.alipay.sdk.m.w.a(this.a, str, "pay"), str, z);
    }

    public synchronized Map payV2(String str, boolean z) {
        String strA;
        com.alipay.sdk.m.w.a aVar;
        if (com.alipay.sdk.m.y.c.a()) {
            strA = com.alipay.sdk.m.l.b.b();
            aVar = null;
        } else {
            com.alipay.sdk.m.w.a aVar2 = new com.alipay.sdk.m.w.a(this.a, str, "payV2");
            strA = a(aVar2, str, z);
            aVar = aVar2;
        }
        return o.a(aVar, strA);
    }

    public void showLoading() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            com.alipay.sdk.m.w.b.c().a(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - i < com.alipay.sdk.m.o.b.i().e()) {
                return false;
            }
            i = jElapsedRealtime;
            com.alipay.sdk.m.o.b.i().a(com.alipay.sdk.m.w.a.f(), context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e2) {
            g.a(e2);
            return false;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0338 A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x035a A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:134:? A[ADDED_TO_REGION, Catch: all -> 0x0379, REMOVE, SYNTHETIC, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x011b A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0125 A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x017b A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x019d A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f0 A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01fa A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0250 A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0272 A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02d8 A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02e2 A[Catch: all -> 0x0379, TryCatch #5 {, blocks: (B:4:0x0015, B:6:0x002e, B:7:0x0031, B:9:0x0043, B:11:0x0057, B:12:0x005b, B:14:0x007c, B:16:0x0084, B:17:0x0087, B:19:0x008b, B:21:0x0093, B:22:0x00a0, B:24:0x00a8, B:28:0x00e8, B:30:0x00f2, B:37:0x0118, B:38:0x011b, B:40:0x0125, B:41:0x0133, B:43:0x017b, B:44:0x0188, B:46:0x019d, B:48:0x01a3, B:81:0x0287, B:52:0x01b0, B:82:0x0290, B:56:0x01bd, B:58:0x01c7, B:65:0x01ed, B:66:0x01f0, B:68:0x01fa, B:69:0x0208, B:71:0x0250, B:72:0x025d, B:74:0x0272, B:76:0x0278, B:80:0x0284, B:87:0x02a5, B:89:0x02af, B:96:0x02d5, B:97:0x02d8, B:99:0x02e2, B:100:0x02f0, B:102:0x0338, B:103:0x0345, B:105:0x035a, B:107:0x0360, B:112:0x036f, B:111:0x036c, B:113:0x0378, B:13:0x0077, B:77:0x027d, B:55:0x01b6, B:91:0x02bb, B:93:0x02cc, B:27:0x00b9, B:32:0x00fe, B:34:0x010f, B:108:0x0365, B:60:0x01d3, B:62:0x01e4, B:49:0x01a8), top: B:127:0x0015, inners: #0, #1, #2, #3, #4, #6, #7, #8 }] */
    public final synchronized String a(com.alipay.sdk.m.w.a aVar, String str, boolean z) {
        String strA;
        AlipayDebugOptions alipayDebugOptions;
        AlipayDebugOptions alipayDebugOptions2;
        JSONObject jSONObject;
        AlipayDebugOptions alipayDebugOptions3;
        String strSubstring = str;
        synchronized (this) {
            com.alipay.sdk.m.o.b.i().c(aVar);
            com.alipay.sdk.m.o.b.i().e(aVar);
            com.alipay.sdk.m.o.b.i().g(aVar);
            boolean z2 = AlipayApi.e;
            if (z) {
                showLoading();
            }
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "isDebugApp", "false");
            if (strSubstring.contains("payment_inst=")) {
                String strSubstring2 = strSubstring.substring(strSubstring.indexOf("payment_inst=") + 13);
                int iIndexOf = strSubstring2.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring2 = strSubstring2.substring(0, iIndexOf);
                }
                com.alipay.sdk.m.l.a.a(strSubstring2.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                com.alipay.sdk.m.l.a.a("");
            }
            if (strSubstring.contains(com.alipay.sdk.m.n.a.x)) {
                com.alipay.sdk.m.n.a.y = true;
            }
            if (com.alipay.sdk.m.n.a.y) {
                if (strSubstring.startsWith(com.alipay.sdk.m.n.a.z)) {
                    strSubstring = strSubstring.substring(strSubstring.indexOf(com.alipay.sdk.m.n.a.z) + 53);
                } else if (strSubstring.startsWith(com.alipay.sdk.m.n.a.A)) {
                    strSubstring = strSubstring.substring(strSubstring.indexOf(com.alipay.sdk.m.n.a.A) + 52);
                }
            }
            String str2 = strSubstring;
            strA = "";
            try {
                g.d(com.alipay.sdk.m.n.a.B, "pay prepared: " + str2);
                strA = a(str2, aVar);
                g.d(com.alipay.sdk.m.n.a.B, "pay raw result: " + strA);
                l.a(aVar, this.a.getApplicationContext(), strA);
                if (!com.alipay.sdk.m.o.b.i().a(aVar)) {
                    String strB = o.b(strA, o.d);
                    if (!TextUtils.isEmpty(strB)) {
                        try {
                            String strOptString = new JSONObject(strB).optString(com.alipay.sdk.m.w.a.E);
                            if (!TextUtils.isEmpty(strOptString)) {
                                m.b(aVar, this.a, com.alipay.sdk.m.w.a.H, strOptString);
                                if (com.alipay.sdk.m.o.b.i().h(null)) {
                                    com.alipay.sdk.m.r.b.e().a();
                                    com.alipay.sdk.m.r.b.e().d();
                                }
                                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                                if (!com.alipay.sdk.m.o.b.i().t()) {
                                    com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                a(aVar);
                                com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                                alipayDebugOptions3 = AlipayApi.g;
                                if (alipayDebugOptions3 != null && alipayDebugOptions3.getAlipayPayLifeCycle() != null) {
                                    jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("isHitPreHeatApp", z2);
                                    } catch (Throwable th) {
                                        g.a(th);
                                    }
                                    AlipayApi.g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                                }
                            } else {
                                if (com.alipay.sdk.m.o.b.i().h(null)) {
                                    com.alipay.sdk.m.r.b.e().a();
                                    com.alipay.sdk.m.r.b.e().d();
                                }
                                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                                if (!com.alipay.sdk.m.o.b.i().t()) {
                                    com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                a(aVar);
                                com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                                alipayDebugOptions3 = AlipayApi.g;
                                if (alipayDebugOptions3 != null) {
                                    jSONObject = new JSONObject();
                                    jSONObject.put("isHitPreHeatApp", z2);
                                    AlipayApi.g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                                }
                            }
                        } catch (Throwable th2) {
                            g.a(th2);
                        }
                    } else {
                        if (com.alipay.sdk.m.o.b.i().h(null)) {
                            com.alipay.sdk.m.r.b.e().a();
                            com.alipay.sdk.m.r.b.e().d();
                        }
                        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                        if (!com.alipay.sdk.m.o.b.i().t()) {
                            com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        a(aVar);
                        com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                        alipayDebugOptions3 = AlipayApi.g;
                        if (alipayDebugOptions3 != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("isHitPreHeatApp", z2);
                            AlipayApi.g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                        }
                    }
                } else {
                    if (com.alipay.sdk.m.o.b.i().h(null)) {
                        com.alipay.sdk.m.r.b.e().a();
                        com.alipay.sdk.m.r.b.e().d();
                    }
                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                    if (!com.alipay.sdk.m.o.b.i().t()) {
                        com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    a(aVar);
                    com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                    alipayDebugOptions3 = AlipayApi.g;
                    if (alipayDebugOptions3 != null) {
                        jSONObject = new JSONObject();
                        jSONObject.put("isHitPreHeatApp", z2);
                        AlipayApi.g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                    }
                }
            } catch (Throwable th3) {
                try {
                    strA = com.alipay.sdk.m.l.b.a();
                    g.a(th3);
                    if (!com.alipay.sdk.m.o.b.i().a(aVar)) {
                        String strB2 = o.b(strA, o.d);
                        if (!TextUtils.isEmpty(strB2)) {
                            try {
                                String strOptString2 = new JSONObject(strB2).optString(com.alipay.sdk.m.w.a.E);
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    m.b(aVar, this.a, com.alipay.sdk.m.w.a.H, strOptString2);
                                    if (com.alipay.sdk.m.o.b.i().h(null)) {
                                        com.alipay.sdk.m.r.b.e().a();
                                        com.alipay.sdk.m.r.b.e().d();
                                    }
                                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                                    if (!com.alipay.sdk.m.o.b.i().t()) {
                                        com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    a(aVar);
                                    com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                                    alipayDebugOptions2 = AlipayApi.g;
                                    if (alipayDebugOptions2 != null && alipayDebugOptions2.getAlipayPayLifeCycle() != null) {
                                        jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("isHitPreHeatApp", z2);
                                        } catch (Throwable th4) {
                                            g.a(th4);
                                        }
                                    }
                                } else {
                                    if (com.alipay.sdk.m.o.b.i().h(null)) {
                                        com.alipay.sdk.m.r.b.e().a();
                                        com.alipay.sdk.m.r.b.e().d();
                                    }
                                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                                    if (!com.alipay.sdk.m.o.b.i().t()) {
                                        com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    a(aVar);
                                    com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                                    alipayDebugOptions2 = AlipayApi.g;
                                    if (alipayDebugOptions2 != null) {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("isHitPreHeatApp", z2);
                                    }
                                }
                            } catch (Throwable th5) {
                                g.a(th5);
                            }
                        } else {
                            if (com.alipay.sdk.m.o.b.i().h(null)) {
                                com.alipay.sdk.m.r.b.e().a();
                                com.alipay.sdk.m.r.b.e().d();
                            }
                            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                            if (!com.alipay.sdk.m.o.b.i().t()) {
                                com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                            }
                            dismissLoading();
                            a(aVar);
                            com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                            alipayDebugOptions2 = AlipayApi.g;
                            if (alipayDebugOptions2 != null) {
                                jSONObject = new JSONObject();
                                jSONObject.put("isHitPreHeatApp", z2);
                            }
                        }
                    } else {
                        if (com.alipay.sdk.m.o.b.i().h(null)) {
                            com.alipay.sdk.m.r.b.e().a();
                            com.alipay.sdk.m.r.b.e().d();
                        }
                        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                        if (!com.alipay.sdk.m.o.b.i().t()) {
                            com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        a(aVar);
                        com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                        alipayDebugOptions2 = AlipayApi.g;
                        if (alipayDebugOptions2 != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("isHitPreHeatApp", z2);
                        }
                    }
                } catch (Throwable th6) {
                    if (!com.alipay.sdk.m.o.b.i().a(aVar)) {
                        String strB3 = o.b(strA, o.d);
                        if (!TextUtils.isEmpty(strB3)) {
                            try {
                                String strOptString3 = new JSONObject(strB3).optString(com.alipay.sdk.m.w.a.E);
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    m.b(aVar, this.a, com.alipay.sdk.m.w.a.H, strOptString3);
                                    if (com.alipay.sdk.m.o.b.i().h(null)) {
                                        com.alipay.sdk.m.r.b.e().a();
                                        com.alipay.sdk.m.r.b.e().d();
                                    }
                                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                                    if (!com.alipay.sdk.m.o.b.i().t()) {
                                        com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    a(aVar);
                                    com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                                    alipayDebugOptions = AlipayApi.g;
                                    if (alipayDebugOptions == null && alipayDebugOptions.getAlipayPayLifeCycle() != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put("isHitPreHeatApp", z2);
                                        } catch (Throwable th7) {
                                            g.a(th7);
                                        }
                                        AlipayApi.g.getAlipayPayLifeCycle().onPayEnd(jSONObject2);
                                        throw th6;
                                    }
                                    throw th6;
                                }
                                if (com.alipay.sdk.m.o.b.i().h(null)) {
                                    com.alipay.sdk.m.r.b.e().a();
                                    com.alipay.sdk.m.r.b.e().d();
                                }
                                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                                if (!com.alipay.sdk.m.o.b.i().t()) {
                                    com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                a(aVar);
                                com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                                alipayDebugOptions = AlipayApi.g;
                                if (alipayDebugOptions == null) {
                                    throw th6;
                                }
                                throw th6;
                            } catch (Throwable th8) {
                                g.a(th8);
                            }
                        } else {
                            if (com.alipay.sdk.m.o.b.i().h(null)) {
                                com.alipay.sdk.m.r.b.e().a();
                                com.alipay.sdk.m.r.b.e().d();
                            }
                            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                            if (!com.alipay.sdk.m.o.b.i().t()) {
                                com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                            }
                            dismissLoading();
                            a(aVar);
                            com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                            alipayDebugOptions = AlipayApi.g;
                            if (alipayDebugOptions == null) {
                                throw th6;
                            }
                            throw th6;
                        }
                    } else {
                        if (com.alipay.sdk.m.o.b.i().h(null)) {
                            com.alipay.sdk.m.r.b.e().a();
                            com.alipay.sdk.m.r.b.e().d();
                        }
                        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, "" + SystemClock.elapsedRealtime());
                        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                        if (!com.alipay.sdk.m.o.b.i().t()) {
                            com.alipay.sdk.m.o.b.i().a(aVar, this.a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        a(aVar);
                        com.alipay.sdk.m.m.a.b(this.a.getApplicationContext(), aVar, str2, aVar.d);
                        alipayDebugOptions = AlipayApi.g;
                        if (alipayDebugOptions == null) {
                            throw th6;
                        }
                        throw th6;
                    }
                }
            }
            g.d(com.alipay.sdk.m.n.a.B, "pay returning: " + strA);
        }
        return strA;
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
            g.d(com.alipay.sdk.m.n.a.B, "intercepted: " + strFetchOrderInfoFromH5PayUrl);
            new Thread(new b(strFetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public final void b(com.alipay.sdk.m.w.a aVar, String str) {
        g.b(com.alipay.sdk.m.n.a.B, "requestPreheatPay");
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "requestPreheatStart", aVar.g());
        try {
            g.b(com.alipay.sdk.m.n.a.B, "requestPreheatPay respData:" + new h().a(aVar, this.a.getApplicationContext(), str).c());
        } catch (Throwable th) {
            g.a(th);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "requestPreheatError", th);
        }
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "requestPreheatEnd", aVar.g());
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + q.a("<request_token>", "</request_token>", (String) q.b(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.a) + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + q.a("<request_token>", "</request_token>", (String) q.b(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.a) + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", a(this.a));
                    return com.alipay.sdk.m.w.a.I + jSONObject.toString();
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strA = q.a("?", "", str);
                    if (!TextUtils.isEmpty(strA)) {
                        Map mapB = q.b(strA);
                        StringBuilder sb = new StringBuilder();
                        if (a(false, true, com.alipay.sdk.m.m.b.B0, sb, mapB, com.alipay.sdk.m.m.b.B0, "alipay_trade_no")) {
                            a(true, false, "pay_phase_id", sb, mapB, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str2 = (String) mapB.get("app_name");
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty((CharSequence) mapB.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty((CharSequence) mapB.get("sid")) || !TextUtils.isEmpty((CharSequence) mapB.get("s_id")))) {
                                str2 = "tb";
                            }
                            sb.append("&app_name=\"" + str2 + "\"");
                            if (!a(true, true, "extern_token", sb, mapB, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            a(true, false, "appenv", sb, mapB, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            e eVar = new e();
                            eVar.b((String) mapB.get("return_url"));
                            eVar.c((String) mapB.get("show_url"));
                            eVar.a((String) mapB.get("pay_order_id"));
                            String str3 = sb.toString() + "&bizcontext=\"" + a(this.a) + "\"";
                            this.g.put(str3, eVar);
                            return str3;
                        }
                    }
                }
                if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.isSandBox() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (com.alipay.sdk.m.o.b.i().j() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                        Uri uri = Uri.parse(strTrim);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        String queryParameter3 = uri.getQueryParameter("pay_order_id");
                        String strA2 = a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strA3 = a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String strA4 = a(uri.getQueryParameter("app_name"), !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "", !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? "tb" : "", !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? "tb" : "");
                        String strA5 = a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                        String strA6 = a(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strA2) && !TextUtils.isEmpty(strA4) && !TextUtils.isEmpty(strA5)) {
                            String str4 = "trade_no=\"" + strA2 + "\"&pay_phase_id=\"" + strA3 + "\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"" + strA4 + "\"&extern_token=\"" + strA5 + "\"&appenv=\"" + strA6 + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.a) + "\"";
                            e eVar2 = new e();
                            eVar2.b(queryParameter);
                            eVar2.c(queryParameter2);
                            eVar2.a(queryParameter3);
                            eVar2.d(strA2);
                            this.g.put(str4, eVar2);
                            return str4;
                        }
                    }
                }
                String strA7 = a(this.a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("bizcontext", strA7);
                return com.alipay.sdk.m.w.a.I + jSONObject2.toString();
            }
        } catch (Throwable th) {
            g.a(th);
        }
        return "";
    }

    public final void a(com.alipay.sdk.m.w.a aVar) {
        WeakReference weakReference;
        if (com.alipay.sdk.m.o.b.i().c(null)) {
            return;
        }
        g.d(com.alipay.sdk.m.n.a.B, "unbindRegisterAppService registerAppServiceConnectSuccess=" + AlipayApi.e);
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "registerApp", "unbindServiceStart");
        if (AlipayApi.d != null && AlipayApi.e && (weakReference = AlipayApi.f) != null && weakReference.get() != null) {
            try {
                ((Context) AlipayApi.f.get()).unbindService(AlipayApi.d);
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "registerApp", "unbindServiceEnd");
            } catch (Throwable th) {
                g.a(th);
                com.alipay.sdk.m.m.a.a(aVar, "wr", "registerAppUnbindServiceError", th);
            }
        }
        AlipayApi.f = null;
        AlipayApi.e = false;
        AlipayApi.d = null;
    }

    public static String a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e2) {
                e = e2;
                g.a(e);
                str2 = "";
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", com.alipay.sdk.m.n.a.h);
            jSONObject.put(com.alipay.sdk.m.w.a.u, "and_lite");
            jSONObject.put(com.alipay.sdk.m.w.a.v, "h.a.3.8.40");
            jSONObject.put(com.alipay.sdk.m.w.a.w, str2);
            jSONObject.put(com.alipay.sdk.m.w.a.y, str);
            jSONObject.put(com.alipay.sdk.m.w.a.z, System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            g.a(th);
            return "";
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public final boolean a(boolean z, boolean z2, String str, StringBuilder sb, Map map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i2];
            if (!TextUtils.isEmpty((CharSequence) map.get(str3))) {
                str2 = (String) map.get(str3);
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        }
        if (!z) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str, "=\"", str2, "\"");
            return true;
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, com.alipay.sdk.m.w.a.p, str, "=\"", str2);
        sb.append("\"");
        return true;
    }

    public final String a(String str, Map map) {
        boolean zEquals = "9000".equals(map.get(o.a));
        String str2 = (String) map.get(o.c);
        e eVar = (e) this.g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return (String) map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strA = a(q.a("&callBackUrl=\"", "\"", str2), q.a("&call_back_url=\"", "\"", str2), q.a(com.alipay.sdk.m.n.a.v, "\"", str2), C2912.decode(q.a(com.alipay.sdk.m.n.a.w, com.alipay.sdk.m.w.a.p, str2), "utf-8"), C2912.decode(q.a("&callBackUrl=", com.alipay.sdk.m.w.a.p, str2), "utf-8"), q.a("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        if (eVar != null) {
            String strB = zEquals ? eVar.b() : eVar.c();
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
        }
        return eVar != null ? com.alipay.sdk.m.o.b.i().s() : "";
    }

    public final String a(String str, String str2) {
        String strM37867 = C16014.m37867(str2, "={");
        return str.substring(strM37867.length() + str.indexOf(strM37867), str.lastIndexOf(l.d));
    }

    public final k.f a() {
        return new c();
    }

    public final String a(String str, com.alipay.sdk.m.w.a aVar) {
        String strA = aVar.a(str);
        g.b(com.alipay.sdk.m.n.a.B, "payResult orderInfo=" + strA);
        if (strA.contains("paymethod=\"expressGateway\"")) {
            return a(aVar, strA);
        }
        List listM = com.alipay.sdk.m.o.b.i().m();
        if (!com.alipay.sdk.m.o.b.i().g || listM == null) {
            listM = com.alipay.sdk.m.l.a.d;
        }
        if (q.a(aVar, (Context) this.a, listM, true)) {
            k kVar = new k(this.a, aVar, a());
            g.d(com.alipay.sdk.m.n.a.B, "pay inner started: ".concat(strA));
            c(aVar, strA);
            String strA2 = kVar.a(strA, false);
            if (!TextUtils.isEmpty(strA2)) {
                if (strA2.contains("resultStatus={" + com.alipay.sdk.m.l.c.ACTIVITY_NOT_START_EXIT.c() + l.d)) {
                    q.a("alipaySdk", com.alipay.sdk.m.n.b.q, this.a, aVar);
                    strA2 = kVar.a(strA, true);
                }
            }
            g.d(com.alipay.sdk.m.n.a.B, "pay inner raw result: " + strA2);
            kVar.a();
            boolean zY = com.alipay.sdk.m.o.b.i().y();
            if (!TextUtils.equals(strA2, k.j) && !TextUtils.equals(strA2, k.k) && (!zY || !aVar.i())) {
                if (TextUtils.isEmpty(strA2)) {
                    return com.alipay.sdk.m.l.b.a();
                }
                if (!strA2.contains(PayResultActivity.b)) {
                    return strA2;
                }
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.k0);
                return a(aVar, strA, listM, strA2, this.a);
            }
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.i0);
            return a(aVar, strA);
        }
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.j0);
        return a(aVar, strA);
    }

    public static String a(com.alipay.sdk.m.w.a aVar, String str, List list, String str2, Activity activity) {
        q.c cVarA = q.a(aVar, activity, list);
        if (cVarA == null || cVarA.a(aVar) || cVarA.a() || !TextUtils.equals(cVarA.a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        g.b(com.alipay.sdk.m.n.a.B, "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap map = PayResultActivity.c;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f, str);
        intent.putExtra(PayResultActivity.g, activity.getPackageName());
        intent.putExtra(PayResultActivity.e, strValueOf);
        com.alipay.sdk.m.w.a.C0028a.a(aVar, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                g.b(com.alipay.sdk.m.n.a.B, "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                g.b(com.alipay.sdk.m.n.a.B, "PayTask interrupted");
                return com.alipay.sdk.m.l.b.a();
            }
        }
        String str3 = PayResultActivity.b.b;
        g.b(com.alipay.sdk.m.n.a.B, "PayTask ret: " + str3);
        return str3;
    }

    public final String a(com.alipay.sdk.m.w.a aVar, String str) {
        com.alipay.sdk.m.t.b bVarA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        showLoading();
        com.alipay.sdk.m.l.c cVarA = null;
        try {
            try {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "h5CashierRequest");
                if (com.alipay.sdk.m.o.b.i().h(aVar)) {
                    com.alipay.sdk.m.r.b.e().a(aVar);
                    bVarA = new com.alipay.sdk.m.u.d().a(aVar, this.a.getApplicationContext(), str, p.a());
                } else {
                    bVarA = new com.alipay.sdk.m.u.g().a(aVar, this.a.getApplicationContext(), str);
                }
                JSONObject jSONObjectC = bVarA.c();
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "h5CashierResponse");
                String strOptString = jSONObjectC.optString("end_code", null);
                JSONObject jSONObjectOptJSONObject3 = (!com.alipay.sdk.m.o.b.i().h(null) || (jSONObjectOptJSONObject = jSONObjectC.optJSONObject(com.alipay.sdk.m.t.e.m)) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(com.alipay.sdk.m.n.c.c)) == null) ? null : jSONObjectOptJSONObject2.optJSONObject(com.alipay.sdk.m.n.c.d);
                if (jSONObjectOptJSONObject3 == null) {
                    jSONObjectOptJSONObject3 = jSONObjectC.optJSONObject(com.alipay.sdk.m.n.c.c).optJSONObject(com.alipay.sdk.m.n.c.d);
                }
                List listA = com.alipay.sdk.m.v.b.a(jSONObjectOptJSONObject3);
                for (int i2 = 0; i2 < listA.size(); i2++) {
                    if (((com.alipay.sdk.m.v.b) listA.get(i2)).a() == com.alipay.sdk.m.v.a.Update) {
                        com.alipay.sdk.m.v.b.a((com.alipay.sdk.m.v.b) listA.get(i2));
                    }
                }
                b(aVar, jSONObjectC);
                dismissLoading();
                com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
                for (int i3 = 0; i3 < listA.size(); i3++) {
                    com.alipay.sdk.m.v.b bVar = (com.alipay.sdk.m.v.b) listA.get(i3);
                    if (bVar.a() == com.alipay.sdk.m.v.a.WapPay) {
                        String strA = a(aVar, bVar);
                        dismissLoading();
                        com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
                        return strA;
                    }
                    if (bVar.a() == com.alipay.sdk.m.v.a.OpenWeb) {
                        String strA2 = a(aVar, bVar, strOptString);
                        dismissLoading();
                        com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
                        return strA2;
                    }
                    if (com.alipay.sdk.m.o.b.i().h(null) && bVar.a() == com.alipay.sdk.m.v.a.LocalWebPay) {
                        String strA3 = a(aVar, jSONObjectC);
                        dismissLoading();
                        com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
                        return strA3;
                    }
                }
                dismissLoading();
                com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
            } catch (Throwable th) {
                dismissLoading();
                com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
                throw th;
            }
        } catch (IOException e2) {
            cVarA = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.NETWORK_ERROR.c());
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.k, e2);
            dismissLoading();
            com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
        } catch (Throwable th2) {
            g.a(th2);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.B, th2);
            dismissLoading();
            com.alipay.sdk.m.m.a.a(this.a, aVar, str, aVar.d);
        }
        if (cVarA == null) {
            cVarA = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.FAILED.c());
        }
        return com.alipay.sdk.m.l.b.a(cVarA.c(), cVarA.b(), "");
    }

    public final String a(com.alipay.sdk.m.w.a aVar, JSONObject jSONObject) {
        g.b(com.alipay.sdk.m.n.a.B, "processLocalWebPay");
        com.alipay.sdk.m.l.b.a(false);
        com.alipay.sdk.m.l.b.a((String) null);
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.alipay.sdk.m.t.e.m).optJSONObject("local_web_pay_data");
            String strOptString = jSONObjectOptJSONObject.optString("h5_cashier_url");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("h5_local_data");
            String strOptString2 = jSONObjectOptJSONObject2.optString("sha256", "");
            String strOptString3 = jSONObjectOptJSONObject2.optString("source_url", "");
            String strOptString4 = jSONObjectOptJSONObject2.optString("update_strategy");
            com.alipay.sdk.m.r.b.e().a(new com.alipay.sdk.m.r.a(strOptString2, strOptString3, strOptString4));
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "h5LocalDataUpdateStrategy", strOptString4);
            intent.putExtra("url", strOptString);
            intent.putExtra("version", com.alipay.sdk.m.c0.c.c);
            intent.putExtra("cashierBizData", jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putBoolean("backisexit", com.alipay.sdk.m.o.b.i().d(aVar));
            intent.putExtras(bundle);
            com.alipay.sdk.m.w.a.C0028a.a(aVar, intent);
            this.a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e2) {
                    g.a(e2);
                    return com.alipay.sdk.m.l.b.a();
                }
            }
            String strD = com.alipay.sdk.m.l.b.d();
            return TextUtils.isEmpty(strD) ? com.alipay.sdk.m.l.b.a() : strD;
        } catch (Throwable th) {
            g.a(th);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "processLocalWebPay", th);
            return com.alipay.sdk.m.l.b.a();
        }
    }

    public final String a(com.alipay.sdk.m.w.a aVar, com.alipay.sdk.m.v.b bVar, String str) {
        boolean zC;
        String strD;
        String[] strArrC = bVar.c();
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectH = q.h(new String(com.alipay.sdk.m.p.a.a(strArrC[2])));
            intent.putExtra("url", strArrC[0]);
            intent.putExtra("title", strArrC[1]);
            intent.putExtra("version", com.alipay.sdk.m.c0.c.d);
            intent.putExtra(com.alipay.sdk.m.t.e.s, jSONObjectH.optString(com.alipay.sdk.m.t.e.s, "POST"));
            com.alipay.sdk.m.l.b.a(false);
            com.alipay.sdk.m.l.b.a((String) null);
            com.alipay.sdk.m.w.a.C0028a.a(aVar, intent);
            this.a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                    zC = com.alipay.sdk.m.l.b.c();
                    strD = com.alipay.sdk.m.l.b.d();
                    com.alipay.sdk.m.l.b.a(false);
                    com.alipay.sdk.m.l.b.a((String) null);
                } catch (InterruptedException e2) {
                    g.a(e2);
                    return com.alipay.sdk.m.l.b.a();
                }
            }
            String strA = "";
            if (zC) {
                try {
                    List listA = com.alipay.sdk.m.v.b.a(q.h(new String(com.alipay.sdk.m.p.a.a(strD))));
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        com.alipay.sdk.m.v.b bVar2 = (com.alipay.sdk.m.v.b) listA.get(i2);
                        if (bVar2.a() == com.alipay.sdk.m.v.a.SetResult) {
                            String[] strArrC2 = bVar2.c();
                            strA = com.alipay.sdk.m.l.b.a(Integer.valueOf(strArrC2[1]).intValue(), strArrC2[0], q.e(aVar, strArrC2[2]));
                            break;
                        }
                    }
                } catch (Throwable th) {
                    g.a(th);
                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.B, th, strD);
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            try {
                return com.alipay.sdk.m.l.b.a(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.B, th2, C20094.m46315("endCode: ", str));
                return com.alipay.sdk.m.l.b.a(8000, "", "");
            }
        } catch (Throwable th3) {
            g.a(th3);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.B, th3, Arrays.toString(strArrC));
            return com.alipay.sdk.m.l.b.a();
        }
    }

    public final String a(com.alipay.sdk.m.w.a aVar, com.alipay.sdk.m.v.b bVar) {
        com.alipay.sdk.m.l.b.a(false);
        com.alipay.sdk.m.l.b.a((String) null);
        String[] strArrC = bVar.c();
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrC[0]);
        if (strArrC.length == 2) {
            bundle.putString("cookie", strArrC[1]);
        }
        intent.putExtras(bundle);
        com.alipay.sdk.m.w.a.C0028a.a(aVar, intent);
        this.a.startActivity(intent);
        Object obj = h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e2) {
                g.a(e2);
                return com.alipay.sdk.m.l.b.a();
            }
        }
        String strD = com.alipay.sdk.m.l.b.d();
        return TextUtils.isEmpty(strD) ? com.alipay.sdk.m.l.b.a() : strD;
    }
}
