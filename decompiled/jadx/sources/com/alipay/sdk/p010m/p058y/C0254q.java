package com.alipay.sdk.p010m.p058y;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.p010m.p029j.C0149a;
import com.alipay.sdk.p010m.p029j.C0152d;
import com.alipay.sdk.p010m.p029j.C0154f;
import com.alipay.sdk.p010m.p033l.C0161a;
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p033l.EnumC0163c;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.json.JSONObject;
import p067l.C17588;
import p067l.C20865;
import p067l.C21466;
import p067l.C5136;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.q */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0254q {

    /* JADX INFO: renamed from: a */
    public static final String f1211a = "com.alipay.android.app";

    /* JADX INFO: renamed from: b */
    public static final String f1212b = "com.eg.android.AlipayGphone";

    /* JADX INFO: renamed from: c */
    public static final String f1213c = "hk.alipay.wallet";

    /* JADX INFO: renamed from: d */
    public static final String f1214d = "hk.alipay.walletRC";

    /* JADX INFO: renamed from: e */
    public static final String f1215e = "com.eg.android.AlipayGphoneRC";

    /* JADX INFO: renamed from: f */
    public static final int f1216f = 99;

    /* JADX INFO: renamed from: h */
    public static final int f1218h = 125;

    /* JADX INFO: renamed from: i */
    public static final int f1219i = 460;

    /* JADX INFO: renamed from: g */
    public static final String[] f1217g = {"10.1.5.1013151", "10.1.5.1013148"};

    /* JADX INFO: renamed from: j */
    public static final char[] f1220j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.q$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f1221a;

        public a(Activity activity) {
            this.f1221a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1221a.finish();
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.q$b */
    /* JADX INFO: compiled from: N673 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f1222a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ConditionVariable f1223b;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.f1222a = runnable;
            this.f1223b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1222a.run();
            } finally {
                this.f1223b.open();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1259a(String str, String str2) {
        return C17588.m40053(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static String m1260a(String str, String str2, String str3) {
        try {
            int iIndexOf = str3.indexOf(str) + str.length();
            if (iIndexOf <= str.length()) {
                return "";
            }
            int iIndexOf2 = !TextUtils.isEmpty(str2) ? str3.indexOf(str2, iIndexOf) : 0;
            return iIndexOf2 < 1 ? str3.substring(iIndexOf) : str3.substring(iIndexOf, iIndexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1274b() {
        if (EnvUtils.isSandBox()) {
            return TextUtils.equals("hk.alipay.wallet", ((C0180b.b) C0161a.f547d.get(0)).f850a) ? f1214d : f1215e;
        }
        try {
            return ((C0180b.b) C0161a.f547d.get(0)).f850a;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1275b(Context context) {
        return "-1;-1";
    }

    /* JADX INFO: renamed from: c */
    public static String m1284c(String str) {
        return (EnvUtils.isSandBox() && TextUtils.equals(str, f1215e)) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    /* JADX INFO: renamed from: d */
    public static int m1285d(String str) {
        for (int i = 0; i < 64; i++) {
            if (str.equals(String.valueOf(f1220j[i]))) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static String m1292e(C0233a c0233a, String str) {
        try {
            return C5136.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f578B, e);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m1293f() {
        return "Android " + Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: g */
    public static String m1297g(Context context) {
        String strM1293f = m1293f();
        String strM1290e = m1290e();
        String strM1282c = m1282c(context);
        String strM1294f = m1294f(context);
        StringBuilder sb = new StringBuilder();
        if (C0180b.m829i().m871v()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, " (", strM1293f, C0249l.f1196b, strM1290e);
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, C0249l.f1196b, strM1282c, ";;", strM1294f);
            sb.append(")(sdk android)");
            return sb.toString();
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, " (", strM1293f, C0249l.f1196b, strM1290e);
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, C0249l.f1196b, strM1282c, ";;", strM1294f);
        sb.append(";15.8.40)(sdk android)");
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m1299h(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m1294f(Context context) {
        DisplayMetrics displayMetricsM1286d = m1286d(context);
        return displayMetricsM1286d.widthPixels + "*" + displayMetricsM1286d.heightPixels;
    }

    /* JADX INFO: renamed from: d */
    public static String m1287d() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(line);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m1302i(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getAuthority() + uri.getPath();
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return "-";
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1301h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f1211a, 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m1290e() {
        String strM1287d = m1287d();
        int iIndexOf = strM1287d.indexOf("-");
        if (iIndexOf != -1) {
            strM1287d = strM1287d.substring(0, iIndexOf);
        }
        int iIndexOf2 = strM1287d.indexOf("\n");
        if (iIndexOf2 != -1) {
            strM1287d = strM1287d.substring(0, iIndexOf2);
        }
        return C21466.m48631("Linux ", strM1287d);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1300h() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* JADX INFO: renamed from: c */
    public static String m1282c(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1295f(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.q$c */
    /* JADX INFO: compiled from: N673 */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final PackageInfo f1224a;

        /* JADX INFO: renamed from: b */
        public final int f1225b;

        /* JADX INFO: renamed from: c */
        public final String f1226c;

        public c(PackageInfo packageInfo, int i, String str) {
            this.f1224a = packageInfo;
            this.f1225b = i;
            this.f1226c = str;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1304a(C0233a c0233a) {
            Signature[] signatureArr = this.f1224a.signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String strM1257a = C0254q.m1257a(c0233a, signature.toByteArray());
                    if (strM1257a != null && !TextUtils.equals(strM1257a, this.f1226c)) {
                        C0167a.m755b(c0233a, C0168b.f618l, C0168b.f582D, C20865.m47154("Got ", strM1257a, ", expected ", this.f1226c));
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1303a() {
            return this.f1224a.versionCode < this.f1225b;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1283c(C0233a c0233a, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            C0167a.m755b(c0233a, C0168b.f618l, "rflex", e.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Map m1279b(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split(C0233a.f1084p)) {
            int iIndexOf = str2.indexOf("=", 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), C5136.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static String m1257a(C0233a c0233a, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e) {
            C0167a.m751a(c0233a, C0168b.f622n, C0168b.f642x, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m1281c() {
        try {
            String lowerCase = Build.BRAND.toLowerCase();
            String lowerCase2 = Build.MANUFACTURER.toLowerCase();
            if (m1272a("huawei", lowerCase, lowerCase2)) {
                return 1;
            }
            if (m1272a("oppo", lowerCase, lowerCase2)) {
                return 2;
            }
            if (m1272a("vivo", lowerCase, lowerCase2)) {
                return 4;
            }
            if (m1272a("lenovo", lowerCase, lowerCase2)) {
                return 8;
            }
            if (m1272a("xiaomi", lowerCase, lowerCase2)) {
                return 16;
            }
            return m1272a("oneplus", lowerCase, lowerCase2) ? 32 : 0;
        } catch (Exception unused) {
            return 61440;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m1291e(Context context) {
        String strM1243b = C0253p.m1243b(context);
        return strM1243b.substring(0, strM1243b.indexOf("://"));
    }

    /* JADX INFO: renamed from: e */
    public static int m1289e(String str) {
        try {
            String strM860k = C0180b.m829i().m860k();
            if (TextUtils.isEmpty(strM860k)) {
                return 0;
            }
            return (m1277b(strM860k, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Map m1278b(C0233a c0233a, String str) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split(C0233a.f1084p)) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), m1292e(c0233a, str2.substring(iIndexOf2 + 1)));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static c m1251a(C0233a c0233a, Context context, List list) {
        c cVarM1250a;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0180b.b bVar = (C0180b.b) it.next();
            if (bVar != null && (cVarM1250a = m1250a(c0233a, context, bVar.f850a, bVar.f851b, bVar.f852c)) != null && !cVarM1250a.m1304a(c0233a) && !cVarM1250a.m1303a()) {
                return cVarM1250a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m1298g(String str) {
        return m1261a(str, true);
    }

    /* JADX INFO: renamed from: g */
    public static int m1296g() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return -200;
        }
    }

    /* JADX INFO: renamed from: a */
    public static c m1250a(C0233a c0233a, Context context, String str, int i, String str2) {
        PackageInfo packageInfoM1248a;
        if (EnvUtils.isSandBox()) {
            if ("com.eg.android.AlipayGphone".equals(str)) {
                str = f1215e;
            } else if ("hk.alipay.wallet".equals(str)) {
                str = f1214d;
            }
        }
        try {
            packageInfoM1248a = m1248a(context, str);
        } catch (Throwable th) {
            C0167a.m755b(c0233a, C0168b.f622n, C0168b.f638v, th.getMessage());
            packageInfoM1248a = null;
        }
        if (m1269a(c0233a, packageInfoM1248a)) {
            return m1249a(packageInfoM1248a, i, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m1276b(C0233a c0233a, Context context) {
        return m1256a(c0233a, context, context.getPackageName());
    }

    /* JADX INFO: renamed from: b */
    public static int m1273b(int i) {
        return i / 100000;
    }

    /* JADX INFO: renamed from: b */
    public static String m1277b(String str, String str2) {
        String string = Settings.Secure.getString(((Application) C0234b.m1121c().m1125b()).getContentResolver(), str);
        return string != null ? string : str2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1280b(C0233a c0233a) {
        if (c0233a == null || TextUtils.isEmpty(c0233a.f1101g)) {
            return false;
        }
        return c0233a.f1101g.toLowerCase().contains(C0168b.f622n);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1269a(C0233a c0233a, PackageInfo packageInfo) {
        String str;
        boolean z = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                str = "";
                z = true;
            }
        }
        if (!z) {
            C0167a.m755b(c0233a, C0168b.f622n, C0168b.f640w, str);
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public static DisplayMetrics m1286d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1288d(C0233a c0233a, String str) {
        try {
            int iM1289e = m1289e(str);
            C0167a.m750a(c0233a, C0168b.f618l, "bindExt", "" + iM1289e);
            return C0180b.m829i().m866q() && (iM1289e & 2) == 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static PackageInfo m1248a(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    /* JADX INFO: renamed from: a */
    public static c m1249a(PackageInfo packageInfo, int i, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i, str);
    }

    /* JADX INFO: renamed from: a */
    public static long m1245a(String str) {
        return m1246a(str, 6);
    }

    /* JADX INFO: renamed from: a */
    public static long m1246a(String str, int i) {
        int iPow = (int) Math.pow(2.0d, i);
        int length = str.length();
        long j = 0;
        int i2 = 0;
        int i3 = length;
        while (i2 < length) {
            int i4 = i2 + 1;
            j += ((long) Integer.parseInt(String.valueOf(m1285d(str.substring(i2, i4))))) * ((long) Math.pow(iPow, i3 - 1));
            i3--;
            i2 = i4;
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public static int m1244a() {
        String strM1126d = C0234b.m1121c().m1126d();
        if (TextUtils.isEmpty(strM1126d)) {
            return -1;
        }
        String strReplaceAll = strM1126d.replaceAll("=", "");
        if (strReplaceAll.length() >= 5) {
            strReplaceAll = strReplaceAll.substring(0, 5);
        }
        int iM1245a = (int) (m1245a(strReplaceAll) % 10000);
        return iM1245a < 0 ? iM1245a * (-1) : iM1245a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1268a(C0233a c0233a, Context context, List list, boolean z) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0180b.b bVar = (C0180b.b) it.next();
                if (bVar != null) {
                    String str = bVar.f850a;
                    if (EnvUtils.isSandBox()) {
                        if ("com.eg.android.AlipayGphone".equals(str)) {
                            str = f1215e;
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = f1214d;
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z) {
                                return true;
                            }
                            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f603X, packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f613h0, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1267a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f1217g;
            return TextUtils.equals(str, strArr[0]) || TextUtils.equals(str, strArr[1]);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1253a(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1271a(C0233a c0233a, String str, Activity activity) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith(C0170a.f676o.toLowerCase()) && !str.toLowerCase().startsWith(C0170a.f677p.toLowerCase())) {
            if (!TextUtils.equals(str, C0170a.f679r) && !TextUtils.equals(str, m1259a(C0170a.f680s, C0170a.f681t))) {
                if (!str.startsWith(C0170a.f678q)) {
                    return false;
                }
                try {
                    String strSubstring2 = str.substring(str.indexOf(C0170a.f678q) + 24);
                    int i = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf(C0170a.f682u) + 10));
                    if (i != EnumC0163c.SUCCEEDED.m741c() && i != EnumC0163c.PAY_WAITTING.m741c()) {
                        EnumC0163c enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.FAILED.m741c());
                        C0162b.m730a(C0162b.m729a(enumC0163cM736a.m741c(), enumC0163cM736a.m739b(), ""));
                    } else {
                        if (C0170a.f686y) {
                            StringBuilder sb = new StringBuilder();
                            String strDecode = C5136.decode(str);
                            String strDecode2 = C5136.decode(strDecode);
                            String str2 = strDecode2.substring(strDecode2.indexOf(C0170a.f678q) + 24, strDecode2.lastIndexOf(C0170a.f682u)).split(C0170a.f684w)[0];
                            int iIndexOf = strDecode.indexOf(C0170a.f684w) + 12;
                            sb.append(str2);
                            sb.append(C0170a.f684w);
                            sb.append(strDecode.substring(iIndexOf, strDecode.indexOf(C0233a.f1084p, iIndexOf)));
                            sb.append(strDecode.substring(strDecode.indexOf(C0233a.f1084p, iIndexOf)));
                            strSubstring = sb.toString();
                        } else {
                            String strDecode3 = C5136.decode(str);
                            strSubstring = strDecode3.substring(strDecode3.indexOf(C0170a.f678q) + 24, strDecode3.lastIndexOf(C0170a.f682u));
                        }
                        EnumC0163c enumC0163cM736a2 = EnumC0163c.m736a(i);
                        C0162b.m730a(C0162b.m729a(enumC0163cM736a2.m741c(), enumC0163cM736a2.m739b(), strSubstring));
                    }
                } catch (Exception unused) {
                    C0162b.m730a(C0162b.m735e());
                }
                activity.runOnUiThread(new a(activity));
                return true;
            }
            C0162b.m730a(C0162b.m728a());
            activity.finish();
            return true;
        }
        try {
            c cVarM1251a = m1251a(c0233a, activity, C0161a.f547d);
            if (cVarM1251a != null && !cVarM1251a.m1303a() && !cVarM1251a.m1304a(c0233a)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", C0170a.f676o);
                }
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m1256a(C0233a c0233a, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f638v, th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1261a(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (z && bArrDigest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(bArrDigest, 0, bArr, 0, 16);
                return m1262a(bArr);
            }
            return m1262a(bArrDigest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1262a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 & 240) >> 4, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static ActivityInfo m1247a(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1254a(C0233a c0233a) {
        return m1283c(c0233a, "ro.build.fingerprint");
    }

    /* JADX INFO: renamed from: a */
    public static Object m1252a(WeakReference weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1270a(C0233a c0233a, String str) {
        try {
            String host = new URL(str).getHost();
            return host.endsWith(C0170a.f660C) || host.endsWith(C0170a.f661D);
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, "ckUrlErr", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m1264a(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static Map m1263a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, jSONObject.optString(next));
                } catch (Throwable th) {
                    C0244g.m1199a(th);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1272a(Object obj, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return obj == null;
        }
        for (Object obj2 : objArr) {
            if ((obj == null && obj2 == null) || (obj != null && obj.equals(obj2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1266a(long j, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            if (j <= 0) {
                conditionVariable.block();
                return true;
            }
            return conditionVariable.block(j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1255a(C0233a c0233a, Context context) {
        try {
            String strM1228a = C0250m.m1228a(c0233a, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(strM1228a)) {
                return strM1228a;
            }
            try {
                C0250m.m1231b(c0233a, context, "alipay_cashier_ap_fi", C0149a.m716a("FU", System.currentTimeMillis(), new C0152d(), (short) 0, new C0154f()).m694a());
                String strM1228a2 = C0250m.m1228a(c0233a, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(strM1228a2)) {
                    return strM1228a2;
                }
                C0167a.m755b(c0233a, C0168b.f618l, "e_regen_empty", "");
                return "";
            } catch (Exception e) {
                C0167a.m755b(c0233a, C0168b.f618l, "e_gen", e.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e2) {
            C0167a.m751a(c0233a, C0168b.f618l, "e_gen_err", e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1265a(String str, String str2, Context context, C0233a c0233a) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || m1280b(c0233a) || !C0180b.m829i().m873x()) {
            return;
        }
        try {
            Intent intent = new Intent(C0171b.f699l);
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            C0167a.m750a(c0233a, C0168b.f618l, "AppNotify", str + "|" + str2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1258a(File file) throws NoSuchAlgorithmException, IOException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
