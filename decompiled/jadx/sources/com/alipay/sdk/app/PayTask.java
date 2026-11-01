package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.C0067R;
import com.alipay.sdk.app.debug.AlipayDebugOptions;
import com.alipay.sdk.p010m.p016c0.AbstractC0093c;
import com.alipay.sdk.p010m.p016c0.C0091a;
import com.alipay.sdk.p010m.p033l.C0161a;
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p033l.EnumC0163c;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p045r.C0198a;
import com.alipay.sdk.p010m.p045r.C0199b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p049t.C0210b;
import com.alipay.sdk.p010m.p051u.C0220d;
import com.alipay.sdk.p010m.p051u.C0223g;
import com.alipay.sdk.p010m.p051u.C0224h;
import com.alipay.sdk.p010m.p053v.C0231b;
import com.alipay.sdk.p010m.p053v.EnumC0230a;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p057x.C0237a;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0248k;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0250m;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.alipay.sdk.p010m.p058y.C0253p;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.alipay.sdk.util.H5PayResultModel;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;
import p067l.C17588;
import p067l.C21466;
import p067l.C5136;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class PayTask {

    /* JADX INFO: renamed from: h */
    public static final Object f264h = C0248k.class;

    /* JADX INFO: renamed from: i */
    public static long f265i;

    /* JADX INFO: renamed from: a */
    public Activity f266a;

    /* JADX INFO: renamed from: b */
    public C0091a f267b;

    /* JADX INFO: renamed from: c */
    public final String f268c = "wappaygw.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: d */
    public final String f269d = "mclient.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: e */
    public final String f270e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* JADX INFO: renamed from: f */
    public final String f271f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* JADX INFO: renamed from: g */
    public Map f272g = new HashMap();

    /* JADX INFO: renamed from: com.alipay.sdk.app.PayTask$b */
    /* JADX INFO: compiled from: N673 */
    public class RunnableC0077b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f273a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f274b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ H5PayCallback f275c;

        public RunnableC0077b(String str, boolean z, H5PayCallback h5PayCallback) {
            this.f273a = str;
            this.f274b = z;
            this.f275c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            H5PayResultModel h5PayResultModelH5Pay = PayTask.this.h5Pay(new C0233a(PayTask.this.f266a, this.f273a, "payInterceptorWithUrl"), this.f273a, this.f274b);
            C0244g.m1203d(C0170a.f659B, "inc finished: " + h5PayResultModelH5Pay.getResultCode());
            this.f275c.onPayResult(h5PayResultModelH5Pay);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.app.PayTask$c */
    /* JADX INFO: compiled from: N673 */
    public class C0078c implements C0248k.f {
        public C0078c() {
        }

        @Override // com.alipay.sdk.p010m.p058y.C0248k.f
        /* JADX INFO: renamed from: a */
        public void mo398a() {
            PayTask.this.dismissLoading();
        }

        @Override // com.alipay.sdk.p010m.p058y.C0248k.f
        /* JADX INFO: renamed from: b */
        public void mo399b() {
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.app.PayTask$d */
    /* JADX INFO: compiled from: N673 */
    public class RunnableC0079d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0233a f278a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f279b;

        public RunnableC0079d(C0233a c0233a, String str) {
            this.f278a = c0233a;
            this.f279b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PayTask.this.m430b(this.f278a, this.f279b);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.app.PayTask$e */
    /* JADX INFO: compiled from: N673 */
    public class C0080e {

        /* JADX INFO: renamed from: a */
        public String f281a;

        /* JADX INFO: renamed from: b */
        public String f282b;

        /* JADX INFO: renamed from: c */
        public String f283c;

        /* JADX INFO: renamed from: d */
        public String f284d;

        public C0080e() {
            this.f281a = "";
            this.f282b = "";
            this.f283c = "";
            this.f284d = "";
        }

        /* JADX INFO: renamed from: a */
        public String m433a() {
            return this.f283c;
        }

        /* JADX INFO: renamed from: b */
        public String m435b() {
            return this.f281a;
        }

        /* JADX INFO: renamed from: c */
        public String m437c() {
            return this.f282b;
        }

        /* JADX INFO: renamed from: d */
        public String m439d() {
            return this.f284d;
        }

        /* JADX INFO: renamed from: a */
        public void m434a(String str) {
            this.f283c = str;
        }

        /* JADX INFO: renamed from: b */
        public void m436b(String str) {
            this.f281a = str;
        }

        /* JADX INFO: renamed from: c */
        public void m438c(String str) {
            this.f282b = str;
        }

        /* JADX INFO: renamed from: d */
        public void m440d(String str) {
            this.f284d = str;
        }
    }

    public PayTask(Activity activity) {
        this.f266a = activity;
        C0234b.m1121c().m1124a(this.f266a);
        this.f267b = new C0091a(activity, this.f266a.getString(C0067R.string.alipay_standard_sdk_loading_go_pay));
    }

    /* JADX INFO: renamed from: b */
    public final void m431b(C0233a c0233a, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString(C0237a.f1130j);
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            C0237a.m1142a(C0234b.m1121c().m1125b()).m1143a(strOptString, strOptString2);
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f595P, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m432c(C0233a c0233a, String str) {
        if (c0233a.m1100a() && C0180b.m829i().m857i(c0233a)) {
            new Thread(new RunnableC0079d(c0233a, str)).start();
        }
    }

    public void dismissLoading() {
        C0091a c0091a = this.f267b;
        if (c0091a != null) {
            c0091a.m488a();
            this.f267b = null;
        }
    }

    public synchronized String fetchTradeToken() {
        return C0249l.m1224a(new C0233a(this.f266a, "", "fetchTradeToken"), this.f266a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.40";
    }

    public synchronized H5PayResultModel h5Pay(C0233a c0233a, String str, boolean z) {
        H5PayResultModel h5PayResultModel;
        h5PayResultModel = new H5PayResultModel();
        try {
            String[] strArrSplit = m423a(c0233a, str, z).split(C0249l.f1196b);
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    map.put(strSubstring, m426a(str2, strSubstring));
                }
            }
            if (map.containsKey(C0252o.f1206a)) {
                h5PayResultModel.setResultCode((String) map.get(C0252o.f1206a));
            }
            h5PayResultModel.setReturnUrl(m427a(str, map));
            if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
                C0167a.m755b(c0233a, C0168b.f618l, C0168b.f623n0, "");
            }
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f625o0, th);
            C0244g.m1199a(th);
        }
        return h5PayResultModel;
    }

    public synchronized String pay(String str, boolean z) {
        if (C0240c.m1178a()) {
            return C0162b.m732b();
        }
        return m423a(new C0233a(this.f266a, str, "pay"), str, z);
    }

    public synchronized Map payV2(String str, boolean z) {
        String strM423a;
        C0233a c0233a;
        if (C0240c.m1178a()) {
            strM423a = C0162b.m732b();
            c0233a = null;
        } else {
            C0233a c0233a2 = new C0233a(this.f266a, str, "payV2");
            strM423a = m423a(c0233a2, str, z);
            c0233a = c0233a2;
        }
        return C0252o.m1237a(c0233a, strM423a);
    }

    public void showLoading() {
        C0091a c0091a = this.f267b;
        if (c0091a != null) {
            c0091a.m493d();
        }
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            C0234b.m1121c().m1124a(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - f265i < C0180b.m829i().m849e()) {
                return false;
            }
            f265i = jElapsedRealtime;
            C0180b.m829i().m835a(C0233a.m1094f(), context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e) {
            C0244g.m1199a(e);
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
    /* JADX INFO: renamed from: a */
    public final synchronized String m423a(C0233a c0233a, String str, boolean z) {
        String strM728a;
        AlipayDebugOptions alipayDebugOptions;
        AlipayDebugOptions alipayDebugOptions2;
        JSONObject jSONObject;
        AlipayDebugOptions alipayDebugOptions3;
        String strSubstring = str;
        synchronized (this) {
            C0180b.m829i().m846c(c0233a);
            C0180b.m829i().m850e(c0233a);
            C0180b.m829i().m854g(c0233a);
            boolean z2 = AlipayApi.f221e;
            if (z) {
                showLoading();
            }
            C0167a.m750a(c0233a, C0168b.f618l, "isDebugApp", "false");
            if (strSubstring.contains("payment_inst=")) {
                String strSubstring2 = strSubstring.substring(strSubstring.indexOf("payment_inst=") + 13);
                int iIndexOf = strSubstring2.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring2 = strSubstring2.substring(0, iIndexOf);
                }
                C0161a.m726a(strSubstring2.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                C0161a.m726a("");
            }
            if (strSubstring.contains(C0170a.f685x)) {
                C0170a.f686y = true;
            }
            if (C0170a.f686y) {
                if (strSubstring.startsWith(C0170a.f687z)) {
                    strSubstring = strSubstring.substring(strSubstring.indexOf(C0170a.f687z) + 53);
                } else if (strSubstring.startsWith(C0170a.f658A)) {
                    strSubstring = strSubstring.substring(strSubstring.indexOf(C0170a.f658A) + 52);
                }
            }
            String str2 = strSubstring;
            strM728a = "";
            try {
                C0244g.m1203d(C0170a.f659B, "pay prepared: " + str2);
                strM728a = m425a(str2, c0233a);
                C0244g.m1203d(C0170a.f659B, "pay raw result: " + strM728a);
                C0249l.m1226a(c0233a, this.f266a.getApplicationContext(), strM728a);
                if (!C0180b.m829i().m842a(c0233a)) {
                    String strM1239b = C0252o.m1239b(strM728a, C0252o.f1209d);
                    if (!TextUtils.isEmpty(strM1239b)) {
                        try {
                            String strOptString = new JSONObject(strM1239b).optString(C0233a.f1078E);
                            if (!TextUtils.isEmpty(strOptString)) {
                                C0250m.m1231b(c0233a, this.f266a, C0233a.f1081H, strOptString);
                                if (C0180b.m829i().m856h(null)) {
                                    C0199b.m956e().m958a();
                                    C0199b.m956e().m965d();
                                }
                                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                                if (!C0180b.m829i().m869t()) {
                                    C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                m428a(c0233a);
                                C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                                alipayDebugOptions3 = AlipayApi.f223g;
                                if (alipayDebugOptions3 != null && alipayDebugOptions3.getAlipayPayLifeCycle() != null) {
                                    jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("isHitPreHeatApp", z2);
                                    } catch (Throwable th) {
                                        C0244g.m1199a(th);
                                    }
                                    AlipayApi.f223g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                                }
                            } else {
                                if (C0180b.m829i().m856h(null)) {
                                    C0199b.m956e().m958a();
                                    C0199b.m956e().m965d();
                                }
                                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                                if (!C0180b.m829i().m869t()) {
                                    C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                m428a(c0233a);
                                C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                                alipayDebugOptions3 = AlipayApi.f223g;
                                if (alipayDebugOptions3 != null) {
                                    jSONObject = new JSONObject();
                                    jSONObject.put("isHitPreHeatApp", z2);
                                    AlipayApi.f223g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                                }
                            }
                        } catch (Throwable th2) {
                            C0244g.m1199a(th2);
                        }
                    } else {
                        if (C0180b.m829i().m856h(null)) {
                            C0199b.m956e().m958a();
                            C0199b.m956e().m965d();
                        }
                        C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                        C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                        if (!C0180b.m829i().m869t()) {
                            C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        m428a(c0233a);
                        C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                        alipayDebugOptions3 = AlipayApi.f223g;
                        if (alipayDebugOptions3 != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("isHitPreHeatApp", z2);
                            AlipayApi.f223g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                        }
                    }
                } else {
                    if (C0180b.m829i().m856h(null)) {
                        C0199b.m956e().m958a();
                        C0199b.m956e().m965d();
                    }
                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                    if (!C0180b.m829i().m869t()) {
                        C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    m428a(c0233a);
                    C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                    alipayDebugOptions3 = AlipayApi.f223g;
                    if (alipayDebugOptions3 != null) {
                        jSONObject = new JSONObject();
                        jSONObject.put("isHitPreHeatApp", z2);
                        AlipayApi.f223g.getAlipayPayLifeCycle().onPayEnd(jSONObject);
                    }
                }
            } catch (Throwable th3) {
                try {
                    strM728a = C0162b.m728a();
                    C0244g.m1199a(th3);
                    if (!C0180b.m829i().m842a(c0233a)) {
                        String strM1239b2 = C0252o.m1239b(strM728a, C0252o.f1209d);
                        if (!TextUtils.isEmpty(strM1239b2)) {
                            try {
                                String strOptString2 = new JSONObject(strM1239b2).optString(C0233a.f1078E);
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    C0250m.m1231b(c0233a, this.f266a, C0233a.f1081H, strOptString2);
                                    if (C0180b.m829i().m856h(null)) {
                                        C0199b.m956e().m958a();
                                        C0199b.m956e().m965d();
                                    }
                                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                                    if (!C0180b.m829i().m869t()) {
                                        C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    m428a(c0233a);
                                    C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                                    alipayDebugOptions2 = AlipayApi.f223g;
                                    if (alipayDebugOptions2 != null && alipayDebugOptions2.getAlipayPayLifeCycle() != null) {
                                        jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("isHitPreHeatApp", z2);
                                        } catch (Throwable th4) {
                                            C0244g.m1199a(th4);
                                        }
                                    }
                                } else {
                                    if (C0180b.m829i().m856h(null)) {
                                        C0199b.m956e().m958a();
                                        C0199b.m956e().m965d();
                                    }
                                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                                    if (!C0180b.m829i().m869t()) {
                                        C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    m428a(c0233a);
                                    C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                                    alipayDebugOptions2 = AlipayApi.f223g;
                                    if (alipayDebugOptions2 != null) {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("isHitPreHeatApp", z2);
                                    }
                                }
                            } catch (Throwable th5) {
                                C0244g.m1199a(th5);
                            }
                        } else {
                            if (C0180b.m829i().m856h(null)) {
                                C0199b.m956e().m958a();
                                C0199b.m956e().m965d();
                            }
                            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                            if (!C0180b.m829i().m869t()) {
                                C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                            }
                            dismissLoading();
                            m428a(c0233a);
                            C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                            alipayDebugOptions2 = AlipayApi.f223g;
                            if (alipayDebugOptions2 != null) {
                                jSONObject = new JSONObject();
                                jSONObject.put("isHitPreHeatApp", z2);
                            }
                        }
                    } else {
                        if (C0180b.m829i().m856h(null)) {
                            C0199b.m956e().m958a();
                            C0199b.m956e().m965d();
                        }
                        C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                        C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                        if (!C0180b.m829i().m869t()) {
                            C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        m428a(c0233a);
                        C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                        alipayDebugOptions2 = AlipayApi.f223g;
                        if (alipayDebugOptions2 != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("isHitPreHeatApp", z2);
                        }
                    }
                } catch (Throwable th6) {
                    if (!C0180b.m829i().m842a(c0233a)) {
                        String strM1239b3 = C0252o.m1239b(strM728a, C0252o.f1209d);
                        if (!TextUtils.isEmpty(strM1239b3)) {
                            try {
                                String strOptString3 = new JSONObject(strM1239b3).optString(C0233a.f1078E);
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    C0250m.m1231b(c0233a, this.f266a, C0233a.f1081H, strOptString3);
                                    if (C0180b.m829i().m856h(null)) {
                                        C0199b.m956e().m958a();
                                        C0199b.m956e().m965d();
                                    }
                                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                                    if (!C0180b.m829i().m869t()) {
                                        C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    m428a(c0233a);
                                    C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                                    alipayDebugOptions = AlipayApi.f223g;
                                    if (alipayDebugOptions == null && alipayDebugOptions.getAlipayPayLifeCycle() != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put("isHitPreHeatApp", z2);
                                        } catch (Throwable th7) {
                                            C0244g.m1199a(th7);
                                        }
                                        AlipayApi.f223g.getAlipayPayLifeCycle().onPayEnd(jSONObject2);
                                        throw th6;
                                    }
                                    throw th6;
                                }
                                if (C0180b.m829i().m856h(null)) {
                                    C0199b.m956e().m958a();
                                    C0199b.m956e().m965d();
                                }
                                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                                C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                                if (!C0180b.m829i().m869t()) {
                                    C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                m428a(c0233a);
                                C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                                alipayDebugOptions = AlipayApi.f223g;
                                if (alipayDebugOptions == null) {
                                    throw th6;
                                }
                                throw th6;
                            } catch (Throwable th8) {
                                C0244g.m1199a(th8);
                            }
                        } else {
                            if (C0180b.m829i().m856h(null)) {
                                C0199b.m956e().m958a();
                                C0199b.m956e().m965d();
                            }
                            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                            if (!C0180b.m829i().m869t()) {
                                C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                            }
                            dismissLoading();
                            m428a(c0233a);
                            C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                            alipayDebugOptions = AlipayApi.f223g;
                            if (alipayDebugOptions == null) {
                                throw th6;
                            }
                            throw th6;
                        }
                    } else {
                        if (C0180b.m829i().m856h(null)) {
                            C0199b.m956e().m958a();
                            C0199b.m956e().m965d();
                        }
                        C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                        C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                        if (!C0180b.m829i().m869t()) {
                            C0180b.m829i().m835a(c0233a, this.f266a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        m428a(c0233a);
                        C0167a.m754b(this.f266a.getApplicationContext(), c0233a, str2, c0233a.f1098d);
                        alipayDebugOptions = AlipayApi.f223g;
                        if (alipayDebugOptions == null) {
                            throw th6;
                        }
                        throw th6;
                    }
                }
            }
            C0244g.m1203d(C0170a.f659B, "pay returning: " + strM728a);
        }
        return strM728a;
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
            C0244g.m1203d(C0170a.f659B, "intercepted: " + strFetchOrderInfoFromH5PayUrl);
            new Thread(new RunnableC0077b(strFetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    /* JADX INFO: renamed from: b */
    public final void m430b(C0233a c0233a, String str) {
        C0244g.m1201b(C0170a.f659B, "requestPreheatPay");
        C0167a.m750a(c0233a, C0168b.f618l, "requestPreheatStart", c0233a.m1113g());
        try {
            C0244g.m1201b(C0170a.f659B, "requestPreheatPay respData:" + new C0224h().mo1038a(c0233a, this.f266a.getApplicationContext(), str).m1022c());
        } catch (Throwable th) {
            C0244g.m1199a(th);
            C0167a.m751a(c0233a, C0168b.f618l, "requestPreheatError", th);
        }
        C0167a.m750a(c0233a, C0168b.f618l, "requestPreheatEnd", c0233a.m1113g());
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + C0254q.m1260a("<request_token>", "</request_token>", (String) C0254q.m1279b(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m415a(this.f266a) + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + C0254q.m1260a("<request_token>", "</request_token>", (String) C0254q.m1279b(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m415a(this.f266a) + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", m415a(this.f266a));
                    return C0233a.f1082I + jSONObject.toString();
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strM1260a = C0254q.m1260a("?", "", str);
                    if (!TextUtils.isEmpty(strM1260a)) {
                        Map mapM1279b = C0254q.m1279b(strM1260a);
                        StringBuilder sb = new StringBuilder();
                        if (m429a(false, true, C0168b.f579B0, sb, mapM1279b, C0168b.f579B0, "alipay_trade_no")) {
                            m429a(true, false, "pay_phase_id", sb, mapM1279b, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str2 = (String) mapM1279b.get("app_name");
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty((CharSequence) mapM1279b.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty((CharSequence) mapM1279b.get("sid")) || !TextUtils.isEmpty((CharSequence) mapM1279b.get("s_id")))) {
                                str2 = "tb";
                            }
                            sb.append("&app_name=\"" + str2 + "\"");
                            if (!m429a(true, true, "extern_token", sb, mapM1279b, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            m429a(true, false, "appenv", sb, mapM1279b, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            C0080e c0080e = new C0080e();
                            c0080e.m436b((String) mapM1279b.get("return_url"));
                            c0080e.m438c((String) mapM1279b.get("show_url"));
                            c0080e.m434a((String) mapM1279b.get("pay_order_id"));
                            String str3 = sb.toString() + "&bizcontext=\"" + m415a(this.f266a) + "\"";
                            this.f272g.put(str3, c0080e);
                            return str3;
                        }
                    }
                }
                if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.isSandBox() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (C0180b.m829i().m859j() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                        Uri uri = Uri.parse(strTrim);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        String queryParameter3 = uri.getQueryParameter("pay_order_id");
                        String strM417a = m417a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strM417a2 = m417a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String strM417a3 = m417a(uri.getQueryParameter("app_name"), !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "", !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? "tb" : "", !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? "tb" : "");
                        String strM417a4 = m417a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                        String strM417a5 = m417a(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strM417a) && !TextUtils.isEmpty(strM417a3) && !TextUtils.isEmpty(strM417a4)) {
                            String str4 = "trade_no=\"" + strM417a + "\"&pay_phase_id=\"" + strM417a2 + "\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"" + strM417a3 + "\"&extern_token=\"" + strM417a4 + "\"&appenv=\"" + strM417a5 + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m415a(this.f266a) + "\"";
                            C0080e c0080e2 = new C0080e();
                            c0080e2.m436b(queryParameter);
                            c0080e2.m438c(queryParameter2);
                            c0080e2.m434a(queryParameter3);
                            c0080e2.m440d(strM417a);
                            this.f272g.put(str4, c0080e2);
                            return str4;
                        }
                    }
                }
                String strM415a = m415a(this.f266a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("bizcontext", strM415a);
                return C0233a.f1082I + jSONObject2.toString();
            }
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public final void m428a(C0233a c0233a) {
        WeakReference weakReference;
        if (C0180b.m829i().m846c(null)) {
            return;
        }
        C0244g.m1203d(C0170a.f659B, "unbindRegisterAppService registerAppServiceConnectSuccess=" + AlipayApi.f221e);
        C0167a.m750a(c0233a, C0168b.f618l, "registerApp", "unbindServiceStart");
        if (AlipayApi.f220d != null && AlipayApi.f221e && (weakReference = AlipayApi.f222f) != null && weakReference.get() != null) {
            try {
                ((Context) AlipayApi.f222f.get()).unbindService(AlipayApi.f220d);
                C0167a.m750a(c0233a, C0168b.f618l, "registerApp", "unbindServiceEnd");
            } catch (Throwable th) {
                C0244g.m1199a(th);
                C0167a.m751a(c0233a, "wr", "registerAppUnbindServiceError", th);
            }
        }
        AlipayApi.f222f = null;
        AlipayApi.f221e = false;
        AlipayApi.f220d = null;
    }

    /* JADX INFO: renamed from: a */
    public static String m415a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e) {
                e = e;
                C0244g.m1199a(e);
                str2 = "";
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", C0170a.f669h);
            jSONObject.put(C0233a.f1089u, "and_lite");
            jSONObject.put(C0233a.f1090v, "h.a.3.8.40");
            jSONObject.put(C0233a.f1091w, str2);
            jSONObject.put(C0233a.f1093y, str);
            jSONObject.put(C0233a.f1094z, System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m417a(String... strArr) {
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

    /* JADX INFO: renamed from: a */
    public final boolean m429a(boolean z, boolean z2, String str, StringBuilder sb, Map map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i];
            if (!TextUtils.isEmpty((CharSequence) map.get(str3))) {
                str2 = (String) map.get(str3);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        }
        if (!z) {
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, str, "=\"", str2, "\"");
            return true;
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, C0233a.f1084p, str, "=\"", str2);
        sb.append("\"");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final String m427a(String str, Map map) {
        boolean zEquals = "9000".equals(map.get(C0252o.f1206a));
        String str2 = (String) map.get(C0252o.f1208c);
        C0080e c0080e = (C0080e) this.f272g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return (String) map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strM417a = m417a(C0254q.m1260a("&callBackUrl=\"", "\"", str2), C0254q.m1260a("&call_back_url=\"", "\"", str2), C0254q.m1260a(C0170a.f683v, "\"", str2), C5136.decode(C0254q.m1260a(C0170a.f684w, C0233a.f1084p, str2), "utf-8"), C5136.decode(C0254q.m1260a("&callBackUrl=", C0233a.f1084p, str2), "utf-8"), C0254q.m1260a("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strM417a)) {
                return strM417a;
            }
        }
        if (c0080e != null) {
            String strM435b = zEquals ? c0080e.m435b() : c0080e.m437c();
            if (!TextUtils.isEmpty(strM435b)) {
                return strM435b;
            }
        }
        return c0080e != null ? C0180b.m829i().m868s() : "";
    }

    /* JADX INFO: renamed from: a */
    public final String m426a(String str, String str2) {
        String strM40053 = C17588.m40053(str2, "={");
        return str.substring(strM40053.length() + str.indexOf(strM40053), str.lastIndexOf(C0249l.f1198d));
    }

    /* JADX INFO: renamed from: a */
    public final C0248k.f m419a() {
        return new C0078c();
    }

    /* JADX INFO: renamed from: a */
    public final String m425a(String str, C0233a c0233a) {
        String strM1095a = c0233a.m1095a(str);
        C0244g.m1201b(C0170a.f659B, "payResult orderInfo=" + strM1095a);
        if (strM1095a.contains("paymethod=\"expressGateway\"")) {
            return m422a(c0233a, strM1095a);
        }
        List listM862m = C0180b.m829i().m862m();
        if (!C0180b.m829i().f825g || listM862m == null) {
            listM862m = C0161a.f547d;
        }
        if (C0254q.m1268a(c0233a, (Context) this.f266a, listM862m, true)) {
            C0248k c0248k = new C0248k(this.f266a, c0233a, m419a());
            C0244g.m1203d(C0170a.f659B, "pay inner started: ".concat(strM1095a));
            m432c(c0233a, strM1095a);
            String strM1221a = c0248k.m1221a(strM1095a, false);
            if (!TextUtils.isEmpty(strM1221a)) {
                if (strM1221a.contains("resultStatus={" + EnumC0163c.ACTIVITY_NOT_START_EXIT.m741c() + C0249l.f1198d)) {
                    C0254q.m1265a("alipaySdk", C0171b.f704q, this.f266a, c0233a);
                    strM1221a = c0248k.m1221a(strM1095a, true);
                }
            }
            C0244g.m1203d(C0170a.f659B, "pay inner raw result: " + strM1221a);
            c0248k.m1222a();
            boolean zM874y = C0180b.m829i().m874y();
            if (!TextUtils.equals(strM1221a, C0248k.f1176j) && !TextUtils.equals(strM1221a, C0248k.f1177k) && (!zM874y || !c0233a.m1115i())) {
                if (TextUtils.isEmpty(strM1221a)) {
                    return C0162b.m728a();
                }
                if (!strM1221a.contains(PayResultActivity.f252b)) {
                    return strM1221a;
                }
                C0167a.m749a(c0233a, C0168b.f618l, C0168b.f617k0);
                return m416a(c0233a, strM1095a, listM862m, strM1221a, this.f266a);
            }
            C0167a.m749a(c0233a, C0168b.f618l, C0168b.f614i0);
            return m422a(c0233a, strM1095a);
        }
        C0167a.m749a(c0233a, C0168b.f618l, C0168b.f615j0);
        return m422a(c0233a, strM1095a);
    }

    /* JADX INFO: renamed from: a */
    public static String m416a(C0233a c0233a, String str, List list, String str2, Activity activity) {
        C0254q.c cVarM1251a = C0254q.m1251a(c0233a, activity, list);
        if (cVarM1251a == null || cVarM1251a.m1304a(c0233a) || cVarM1251a.m1303a() || !TextUtils.equals(cVarM1251a.f1224a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        C0244g.m1201b(C0170a.f659B, "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap map = PayResultActivity.f253c;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f256f, str);
        intent.putExtra(PayResultActivity.f257g, activity.getPackageName());
        intent.putExtra(PayResultActivity.f255e, strValueOf);
        C0233a.a.m1119a(c0233a, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                C0244g.m1201b(C0170a.f659B, "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                C0244g.m1201b(C0170a.f659B, "PayTask interrupted");
                return C0162b.m728a();
            }
        }
        String str3 = PayResultActivity.C0075b.f263b;
        C0244g.m1201b(C0170a.f659B, "PayTask ret: " + str3);
        return str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m422a(C0233a c0233a, String str) {
        C0210b c0210bMo1038a;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        showLoading();
        EnumC0163c enumC0163cM736a = null;
        try {
            try {
                C0167a.m749a(c0233a, C0168b.f618l, "h5CashierRequest");
                if (C0180b.m829i().m856h(c0233a)) {
                    C0199b.m956e().m960a(c0233a);
                    c0210bMo1038a = new C0220d().m1039a(c0233a, this.f266a.getApplicationContext(), str, C0253p.m1241a());
                } else {
                    c0210bMo1038a = new C0223g().mo1038a(c0233a, this.f266a.getApplicationContext(), str);
                }
                JSONObject jSONObjectM1022c = c0210bMo1038a.m1022c();
                C0167a.m749a(c0233a, C0168b.f618l, "h5CashierResponse");
                String strOptString = jSONObjectM1022c.optString("end_code", null);
                JSONObject jSONObjectOptJSONObject3 = (!C0180b.m829i().m856h(null) || (jSONObjectOptJSONObject = jSONObjectM1022c.optJSONObject(AbstractC0213e.f989m)) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0172c.f707c)) == null) ? null : jSONObjectOptJSONObject2.optJSONObject(C0172c.f708d);
                if (jSONObjectOptJSONObject3 == null) {
                    jSONObjectOptJSONObject3 = jSONObjectM1022c.optJSONObject(C0172c.f707c).optJSONObject(C0172c.f708d);
                }
                List listM1076a = C0231b.m1076a(jSONObjectOptJSONObject3);
                for (int i = 0; i < listM1076a.size(); i++) {
                    if (((C0231b) listM1076a.get(i)).m1080a() == EnumC0230a.Update) {
                        C0231b.m1077a((C0231b) listM1076a.get(i));
                    }
                }
                m431b(c0233a, jSONObjectM1022c);
                dismissLoading();
                C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
                for (int i2 = 0; i2 < listM1076a.size(); i2++) {
                    C0231b c0231b = (C0231b) listM1076a.get(i2);
                    if (c0231b.m1080a() == EnumC0230a.WapPay) {
                        String strM420a = m420a(c0233a, c0231b);
                        dismissLoading();
                        C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
                        return strM420a;
                    }
                    if (c0231b.m1080a() == EnumC0230a.OpenWeb) {
                        String strM421a = m421a(c0233a, c0231b, strOptString);
                        dismissLoading();
                        C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
                        return strM421a;
                    }
                    if (C0180b.m829i().m856h(null) && c0231b.m1080a() == EnumC0230a.LocalWebPay) {
                        String strM424a = m424a(c0233a, jSONObjectM1022c);
                        dismissLoading();
                        C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
                        return strM424a;
                    }
                }
                dismissLoading();
                C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
            } catch (Throwable th) {
                dismissLoading();
                C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
                throw th;
            }
        } catch (IOException e) {
            enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.NETWORK_ERROR.m741c());
            C0167a.m753a(c0233a, C0168b.f616k, e);
            dismissLoading();
            C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
        } catch (Throwable th2) {
            C0244g.m1199a(th2);
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f578B, th2);
            dismissLoading();
            C0167a.m748a(this.f266a, c0233a, str, c0233a.f1098d);
        }
        if (enumC0163cM736a == null) {
            enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.FAILED.m741c());
        }
        return C0162b.m729a(enumC0163cM736a.m741c(), enumC0163cM736a.m739b(), "");
    }

    /* JADX INFO: renamed from: a */
    public final String m424a(C0233a c0233a, JSONObject jSONObject) {
        C0244g.m1201b(C0170a.f659B, "processLocalWebPay");
        C0162b.m731a(false);
        C0162b.m730a((String) null);
        Intent intent = new Intent(this.f266a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(AbstractC0213e.f989m).optJSONObject("local_web_pay_data");
            String strOptString = jSONObjectOptJSONObject.optString("h5_cashier_url");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("h5_local_data");
            String strOptString2 = jSONObjectOptJSONObject2.optString("sha256", "");
            String strOptString3 = jSONObjectOptJSONObject2.optString("source_url", "");
            String strOptString4 = jSONObjectOptJSONObject2.optString("update_strategy");
            C0199b.m956e().m959a(new C0198a(strOptString2, strOptString3, strOptString4));
            C0167a.m750a(c0233a, C0168b.f618l, "h5LocalDataUpdateStrategy", strOptString4);
            intent.putExtra("url", strOptString);
            intent.putExtra("version", AbstractC0093c.f363c);
            intent.putExtra("cashierBizData", jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putBoolean("backisexit", C0180b.m829i().m848d(c0233a));
            intent.putExtras(bundle);
            C0233a.a.m1119a(c0233a, intent);
            this.f266a.startActivity(intent);
            Object obj = f264h;
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    C0244g.m1199a(e);
                    return C0162b.m728a();
                }
            }
            String strM734d = C0162b.m734d();
            return TextUtils.isEmpty(strM734d) ? C0162b.m728a() : strM734d;
        } catch (Throwable th) {
            C0244g.m1199a(th);
            C0167a.m751a(c0233a, C0168b.f618l, "processLocalWebPay", th);
            return C0162b.m728a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m421a(C0233a c0233a, C0231b c0231b, String str) {
        boolean zM733c;
        String strM734d;
        String[] strArrM1082c = c0231b.m1082c();
        Intent intent = new Intent(this.f266a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectM1299h = C0254q.m1299h(new String(C0184a.m902a(strArrM1082c[2])));
            intent.putExtra("url", strArrM1082c[0]);
            intent.putExtra("title", strArrM1082c[1]);
            intent.putExtra("version", AbstractC0093c.f364d);
            intent.putExtra(AbstractC0213e.f995s, jSONObjectM1299h.optString(AbstractC0213e.f995s, "POST"));
            C0162b.m731a(false);
            C0162b.m730a((String) null);
            C0233a.a.m1119a(c0233a, intent);
            this.f266a.startActivity(intent);
            Object obj = f264h;
            synchronized (obj) {
                try {
                    obj.wait();
                    zM733c = C0162b.m733c();
                    strM734d = C0162b.m734d();
                    C0162b.m731a(false);
                    C0162b.m730a((String) null);
                } catch (InterruptedException e) {
                    C0244g.m1199a(e);
                    return C0162b.m728a();
                }
            }
            String strM729a = "";
            if (zM733c) {
                try {
                    List listM1076a = C0231b.m1076a(C0254q.m1299h(new String(C0184a.m902a(strM734d))));
                    for (int i = 0; i < listM1076a.size(); i++) {
                        C0231b c0231b2 = (C0231b) listM1076a.get(i);
                        if (c0231b2.m1080a() == EnumC0230a.SetResult) {
                            String[] strArrM1082c2 = c0231b2.m1082c();
                            strM729a = C0162b.m729a(Integer.valueOf(strArrM1082c2[1]).intValue(), strArrM1082c2[0], C0254q.m1292e(c0233a, strArrM1082c2[2]));
                            break;
                        }
                    }
                } catch (Throwable th) {
                    C0244g.m1199a(th);
                    C0167a.m752a(c0233a, C0168b.f618l, C0168b.f578B, th, strM734d);
                }
            }
            if (!TextUtils.isEmpty(strM729a)) {
                return strM729a;
            }
            try {
                return C0162b.m729a(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                C0167a.m752a(c0233a, C0168b.f618l, C0168b.f578B, th2, C21466.m48631("endCode: ", str));
                return C0162b.m729a(8000, "", "");
            }
        } catch (Throwable th3) {
            C0244g.m1199a(th3);
            C0167a.m752a(c0233a, C0168b.f618l, C0168b.f578B, th3, Arrays.toString(strArrM1082c));
            return C0162b.m728a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m420a(C0233a c0233a, C0231b c0231b) {
        C0162b.m731a(false);
        C0162b.m730a((String) null);
        String[] strArrM1082c = c0231b.m1082c();
        Intent intent = new Intent(this.f266a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrM1082c[0]);
        if (strArrM1082c.length == 2) {
            bundle.putString("cookie", strArrM1082c[1]);
        }
        intent.putExtras(bundle);
        C0233a.a.m1119a(c0233a, intent);
        this.f266a.startActivity(intent);
        Object obj = f264h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                C0244g.m1199a(e);
                return C0162b.m728a();
            }
        }
        String strM734d = C0162b.m734d();
        return TextUtils.isEmpty(strM734d) ? C0162b.m728a() : strM734d;
    }
}
