package com.alipay.sdk.p010m.p039o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p010m.p012a0.C0084b;
import com.alipay.sdk.p010m.p033l.C0161a;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p057x.C0237a;
import com.alipay.sdk.p010m.p058y.C0241d;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Random;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import p067l.C24420;
import p067l.C5633;
import p067l.C7470;

/* JADX INFO: renamed from: com.alipay.sdk.m.o.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0181c {

    /* JADX INFO: renamed from: d */
    public static final String f853d = "virtualImeiAndImsi";

    /* JADX INFO: renamed from: e */
    public static final String f854e = "virtual_imei";

    /* JADX INFO: renamed from: f */
    public static final String f855f = "virtual_imsi";

    /* JADX INFO: renamed from: g */
    public static volatile C0181c f856g;

    /* JADX INFO: renamed from: a */
    public String f857a;

    /* JADX INFO: renamed from: b */
    public String f858b = "sdk-and-lite";

    /* JADX INFO: renamed from: c */
    public String f859c;

    public C0181c() {
        String strM725a = C0161a.m725a();
        if (C0161a.m727b()) {
            return;
        }
        this.f858b += '_' + strM725a;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0181c m880a() {
        if (f856g == null) {
            f856g = new C0181c();
        }
        return f856g;
    }

    /* JADX INFO: renamed from: b */
    public static String m883b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder sbM17248 = C7470.m17248(hexString);
        sbM17248.append(random.nextInt(OpenAuthTask.f239OK) + 1000);
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m885d() {
        return "-1;-1";
    }

    /* JADX INFO: renamed from: e */
    public static String m886e() {
        return "1";
    }

    /* JADX INFO: renamed from: f */
    public static String m887f() {
        Context contextM1125b = C0234b.m1121c().m1125b();
        SharedPreferences sharedPreferences = contextM1125b.getSharedPreferences(f853d, 0);
        String string = sharedPreferences.getString(f854e, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM883b = TextUtils.isEmpty(C0237a.m1142a(contextM1125b).m1151f()) ? m883b() : C0241d.m1180b(contextM1125b).m1184b();
        sharedPreferences.edit().putString(f854e, strM883b).apply();
        return strM883b;
    }

    /* JADX INFO: renamed from: g */
    public static String m888g() {
        String strM1185c;
        Context contextM1125b = C0234b.m1121c().m1125b();
        SharedPreferences sharedPreferences = contextM1125b.getSharedPreferences(f853d, 0);
        String string = sharedPreferences.getString(f855f, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(C0237a.m1142a(contextM1125b).m1151f())) {
            String strM1126d = C0234b.m1121c().m1126d();
            strM1185c = (TextUtils.isEmpty(strM1126d) || strM1126d.length() < 18) ? m883b() : strM1126d.substring(3, 18);
        } else {
            strM1185c = C0241d.m1180b(contextM1125b).m1185c();
        }
        sharedPreferences.edit().putString(f855f, strM1185c).apply();
        return strM1185c;
    }

    /* JADX INFO: renamed from: h */
    public static String m889h() {
        return ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
    }

    /* JADX INFO: renamed from: i */
    public static String m890i() {
        return "-1";
    }

    /* JADX INFO: renamed from: c */
    public String m892c() {
        return this.f859c;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m882a(String str) {
        C0244g.m1201b(C0170a.f659B, "setRsaPublicKey");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(C0234b.m1121c().m1125b()).edit().putString(C0171b.f696i, str).apply();
        C0170a.f668g = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m884b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb.append(packageName);
            sb.append(C0249l.f1196b);
            sb.append(packageInfo.versionCode);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m881a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    /* JADX INFO: renamed from: a */
    public String m891a(C0233a c0233a, C0237a c0237a, boolean z) {
        Context contextM1125b = C0234b.m1121c().m1125b();
        C0241d c0241dM1180b = C0241d.m1180b(contextM1125b);
        if (TextUtils.isEmpty(this.f857a)) {
            String strM1293f = C0254q.m1293f();
            String strM1290e = C0254q.m1290e();
            String strM1282c = C0254q.m1282c(contextM1125b);
            String strM1291e = C0254q.m1291e(contextM1125b);
            String strM1294f = C0254q.m1294f(contextM1125b);
            String strM881a = m881a(contextM1125b);
            StringBuilder sbM12525 = C5633.m12525("Msp/15.8.40 (", strM1293f, C0249l.f1196b, strM1290e, C0249l.f1196b);
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, strM1282c, C0249l.f1196b, strM1291e, C0249l.f1196b);
            this.f857a = C24420.m53894(sbM12525, strM1294f, C0249l.f1196b, strM881a);
        }
        String strM1208c = C0241d.m1182d(contextM1125b).m1208c();
        String strM1275b = C0254q.m1275b(contextM1125b);
        String strM886e = m886e();
        String strM1185c = c0241dM1180b.m1185c();
        String strM1184b = c0241dM1180b.m1184b();
        String strM888g = m888g();
        String strM887f = m887f();
        if (c0237a != null) {
            this.f859c = c0237a.m1150e();
        }
        String strReplace = Build.MANUFACTURER.replace(C0249l.f1196b, " ");
        String strReplace2 = Build.MODEL.replace(C0249l.f1196b, " ");
        boolean zM1122e = C0234b.m1122e();
        String strM1186d = c0241dM1180b.m1186d();
        String strM890i = m890i();
        String strM889h = m889h();
        StringBuilder sb = new StringBuilder();
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, this.f857a, C0249l.f1196b, strM1208c, C0249l.f1196b);
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strM1275b, C0249l.f1196b, strM886e, C0249l.f1196b);
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strM1185c, C0249l.f1196b, strM1184b, C0249l.f1196b);
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, this.f859c, C0249l.f1196b, strReplace, C0249l.f1196b);
        sb.append(strReplace2);
        sb.append(C0249l.f1196b);
        sb.append(zM1122e);
        sb.append(C0249l.f1196b);
        sb.append(strM1186d);
        sb.append(C0249l.f1196b);
        sb.append(m885d());
        sb.append(C0249l.f1196b);
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, this.f858b, C0249l.f1196b, strM888g, C0249l.f1196b);
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strM887f, C0249l.f1196b, strM890i, C0249l.f1196b);
        sb.append(strM889h);
        if (c0237a != null) {
            String strM450a = C0084b.m450a(c0233a, contextM1125b, C0237a.m1142a(contextM1125b).m1151f(), C0084b.m452c(c0233a, contextM1125b));
            if (!TextUtils.isEmpty(strM450a)) {
                sb.append(";;;");
                sb.append(strM450a);
            }
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
