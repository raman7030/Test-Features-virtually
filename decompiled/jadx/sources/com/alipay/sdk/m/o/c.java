package com.alipay.sdk.m.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.y.d;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Random;
import l.C23202;
import l.C3435;
import l.C5368;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final String d = "virtualImeiAndImsi";
    public static final String e = "virtual_imei";
    public static final String f = "virtual_imsi";
    public static volatile c g;
    public String a;
    public String b = "sdk-and-lite";
    public String c;

    public c() {
        String strA = com.alipay.sdk.m.l.a.a();
        if (com.alipay.sdk.m.l.a.b()) {
            return;
        }
        this.b += '_' + strA;
    }

    public static synchronized c a() {
        if (g == null) {
            g = new c();
        }
        return g;
    }

    public static String b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder sbM15339 = C5368.m15339(hexString);
        sbM15339.append(random.nextInt(OpenAuthTask.OK) + 1000);
        return sbM15339.toString();
    }

    public static String d() {
        return "-1;-1";
    }

    public static String e() {
        return "1";
    }

    public static String f() {
        Context contextB = com.alipay.sdk.m.w.b.c().b();
        SharedPreferences sharedPreferences = contextB.getSharedPreferences(d, 0);
        String string = sharedPreferences.getString(e, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strB = TextUtils.isEmpty(com.alipay.sdk.m.x.a.a(contextB).f()) ? b() : d.b(contextB).b();
        sharedPreferences.edit().putString(e, strB).apply();
        return strB;
    }

    public static String g() {
        String strC;
        Context contextB = com.alipay.sdk.m.w.b.c().b();
        SharedPreferences sharedPreferences = contextB.getSharedPreferences(d, 0);
        String string = sharedPreferences.getString(f, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(com.alipay.sdk.m.x.a.a(contextB).f())) {
            String strD = com.alipay.sdk.m.w.b.c().d();
            strC = (TextUtils.isEmpty(strD) || strD.length() < 18) ? b() : strD.substring(3, 18);
        } else {
            strC = d.b(contextB).c();
        }
        sharedPreferences.edit().putString(f, strC).apply();
        return strC;
    }

    public static String h() {
        return ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
    }

    public static String i() {
        return "-1";
    }

    public String c() {
        return this.c;
    }

    public static synchronized void a(String str) {
        g.b(com.alipay.sdk.m.n.a.B, "setRsaPublicKey");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(com.alipay.sdk.m.w.b.c().b()).edit().putString(com.alipay.sdk.m.n.b.i, str).apply();
        com.alipay.sdk.m.n.a.g = str;
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb.append(packageName);
            sb.append(l.b);
            sb.append(packageInfo.versionCode);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public String a(com.alipay.sdk.m.w.a aVar, com.alipay.sdk.m.x.a aVar2, boolean z) {
        Context contextB = com.alipay.sdk.m.w.b.c().b();
        d dVarB = d.b(contextB);
        if (TextUtils.isEmpty(this.a)) {
            String strF = q.f();
            String strE = q.e();
            String strC = q.c(contextB);
            String strE2 = q.e(contextB);
            String strF2 = q.f(contextB);
            String strA = a(contextB);
            StringBuilder sbM10501 = C3435.m10501("Msp/15.8.40 (", strF, l.b, strE, l.b);
            ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10501, strC, l.b, strE2, l.b);
            this.a = C23202.m51498(sbM10501, strF2, l.b, strA);
        }
        String strC2 = d.d(contextB).c();
        String strB = q.b(contextB);
        String strE3 = e();
        String strC3 = dVarB.c();
        String strB2 = dVarB.b();
        String strG = g();
        String strF3 = f();
        if (aVar2 != null) {
            this.c = aVar2.e();
        }
        String strReplace = Build.MANUFACTURER.replace(l.b, " ");
        String strReplace2 = Build.MODEL.replace(l.b, " ");
        boolean zE = com.alipay.sdk.m.w.b.e();
        String strD = dVarB.d();
        String strI = i();
        String strH = h();
        StringBuilder sb = new StringBuilder();
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, this.a, l.b, strC2, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strB, l.b, strE3, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strC3, l.b, strB2, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, this.c, l.b, strReplace, l.b);
        sb.append(strReplace2);
        sb.append(l.b);
        sb.append(zE);
        sb.append(l.b);
        sb.append(strD);
        sb.append(l.b);
        sb.append(d());
        sb.append(l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, this.b, l.b, strG, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strF3, l.b, strI, l.b);
        sb.append(strH);
        if (aVar2 != null) {
            String strA2 = com.alipay.sdk.m.a0.b.a(aVar, contextB, com.alipay.sdk.m.x.a.a(contextB).f(), com.alipay.sdk.m.a0.b.c(aVar, contextB));
            if (!TextUtils.isEmpty(strA2)) {
                sb.append(";;;");
                sb.append(strA2);
            }
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
