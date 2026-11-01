package com.alipay.sdk.p010m.p035m;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p012a0.C0084b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p057x.C0237a;
import com.alipay.sdk.p010m.p058y.C0241d;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.motion.MotionUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;
import p067l.C10965;
import p067l.C17588;
import p067l.C24104;
import p067l.C5633;

/* JADX INFO: renamed from: com.alipay.sdk.m.m.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0168b {

    /* JADX INFO: renamed from: A */
    public static final String f576A = "SSLDenied";

    /* JADX INFO: renamed from: A0 */
    public static final String f577A0 = "out_trade_no";

    /* JADX INFO: renamed from: B */
    public static final String f578B = "H5PayDataAnalysisError";

    /* JADX INFO: renamed from: B0 */
    public static final String f579B0 = "trade_no";

    /* JADX INFO: renamed from: C */
    public static final String f580C = "H5AuthDataAnalysisError";

    /* JADX INFO: renamed from: C0 */
    public static final String f581C0 = "biz_content";

    /* JADX INFO: renamed from: D */
    public static final String f582D = "PublicKeyUnmatch";

    /* JADX INFO: renamed from: D0 */
    public static final String f583D0 = "app_id";

    /* JADX INFO: renamed from: E */
    public static final String f584E = "ClientBindFailed";

    /* JADX INFO: renamed from: F */
    public static final String f585F = "TriDesEncryptError";

    /* JADX INFO: renamed from: G */
    public static final String f586G = "TriDesDecryptError";

    /* JADX INFO: renamed from: H */
    public static final String f587H = "ClientBindException";

    /* JADX INFO: renamed from: I */
    public static final String f588I = "SaveTradeTokenError";

    /* JADX INFO: renamed from: J */
    public static final String f589J = "ClientBindServiceFailed";

    /* JADX INFO: renamed from: K */
    public static final String f590K = "TryStartServiceEx";

    /* JADX INFO: renamed from: L */
    public static final String f591L = "BindWaitTimeoutEx";

    /* JADX INFO: renamed from: M */
    public static final String f592M = "CheckClientExistEx";

    /* JADX INFO: renamed from: N */
    public static final String f593N = "CheckClientSignEx";

    /* JADX INFO: renamed from: O */
    public static final String f594O = "GetInstalledAppEx";

    /* JADX INFO: renamed from: P */
    public static final String f595P = "ParserTidClientKeyEx";

    /* JADX INFO: renamed from: Q */
    public static final String f596Q = "PgApiInvoke";

    /* JADX INFO: renamed from: R */
    public static final String f597R = "PgBindStarting";

    /* JADX INFO: renamed from: S */
    public static final String f598S = "PgBinded";

    /* JADX INFO: renamed from: T */
    public static final String f599T = "PgBindEnd";

    /* JADX INFO: renamed from: U */
    public static final String f600U = "PgBindPay";

    /* JADX INFO: renamed from: V */
    public static final String f601V = "PgReturn";

    /* JADX INFO: renamed from: W */
    public static final String f602W = "PgReturnV";

    /* JADX INFO: renamed from: X */
    public static final String f603X = "PgWltVer";

    /* JADX INFO: renamed from: Y */
    public static final String f604Y = "PgOpenStarting";

    /* JADX INFO: renamed from: Z */
    public static final String f605Z = "ErrIntentEx";

    /* JADX INFO: renamed from: a0 */
    public static final String f606a0 = "ErrActNull";

    /* JADX INFO: renamed from: b0 */
    public static final String f607b0 = "ErrActEx";

    /* JADX INFO: renamed from: c0 */
    public static final String f608c0 = "ErrActNull2";

    /* JADX INFO: renamed from: d0 */
    public static final String f609d0 = "ErrActEx2";

    /* JADX INFO: renamed from: e0 */
    public static final String f610e0 = "ErrActNotCreated";

    /* JADX INFO: renamed from: f0 */
    public static final String f611f0 = "GetInstalledAppEx";

    /* JADX INFO: renamed from: g0 */
    public static final String f612g0 = "StartLaunchAppTransEx";

    /* JADX INFO: renamed from: h0 */
    public static final String f613h0 = "CheckLaunchAppExistEx";

    /* JADX INFO: renamed from: i0 */
    public static final String f614i0 = "LogBindCalledH5";

    /* JADX INFO: renamed from: j0 */
    public static final String f615j0 = "LogCalledH5";

    /* JADX INFO: renamed from: k */
    public static final String f616k = "net";

    /* JADX INFO: renamed from: k0 */
    public static final String f617k0 = "LogHkLoginByIntent";

    /* JADX INFO: renamed from: l */
    public static final String f618l = "biz";

    /* JADX INFO: renamed from: l0 */
    public static final String f619l0 = "SchemePayWrongHashEx";

    /* JADX INFO: renamed from: m */
    public static final String f620m = "cp";

    /* JADX INFO: renamed from: m0 */
    public static final String f621m0 = "LogAppFetchConfigTimeout";

    /* JADX INFO: renamed from: n */
    public static final String f622n = "auth";

    /* JADX INFO: renamed from: n0 */
    public static final String f623n0 = "H5CbUrlEmpty";

    /* JADX INFO: renamed from: o */
    public static final String f624o = "third";

    /* JADX INFO: renamed from: o0 */
    public static final String f625o0 = "H5CbEx";

    /* JADX INFO: renamed from: p */
    public static final String f626p = "wlt";

    /* JADX INFO: renamed from: p0 */
    public static final String f627p0 = "StartActivityEx";

    /* JADX INFO: renamed from: q */
    public static final String f628q = "FormatResultEx";

    /* JADX INFO: renamed from: q0 */
    public static final String f629q0 = "JSONEx";

    /* JADX INFO: renamed from: r */
    public static final String f630r = "GetApdidEx";

    /* JADX INFO: renamed from: r0 */
    public static final String f631r0 = "ParseBundleSerializableError";

    /* JADX INFO: renamed from: s */
    public static final String f632s = "GetApdidNull";

    /* JADX INFO: renamed from: s0 */
    public static final String f633s0 = "ParseSchemeQueryError";

    /* JADX INFO: renamed from: t */
    public static final String f634t = "GetApdidTimeout";

    /* JADX INFO: renamed from: t0 */
    public static final String f635t0 = "TbChk";

    /* JADX INFO: renamed from: u */
    public static final String f636u = "GetUtdidEx";

    /* JADX INFO: renamed from: u0 */
    public static final String f637u0 = "TbStart";

    /* JADX INFO: renamed from: v */
    public static final String f638v = "GetPackageInfoEx";

    /* JADX INFO: renamed from: v0 */
    public static final String f639v0 = "TbCancel";

    /* JADX INFO: renamed from: w */
    public static final String f640w = "NotIncludeSignatures";

    /* JADX INFO: renamed from: w0 */
    public static final String f641w0 = "TbUnknown";

    /* JADX INFO: renamed from: x */
    public static final String f642x = "GetPublicKeyFromSignEx";

    /* JADX INFO: renamed from: x0 */
    public static final String f643x0 = "TbOk";

    /* JADX INFO: renamed from: y */
    public static final String f644y = "webError";

    /* JADX INFO: renamed from: y0 */
    public static final String f645y0 = "TbActFail";

    /* JADX INFO: renamed from: z */
    public static final String f646z = "SSLError";

    /* JADX INFO: renamed from: z0 */
    public static final String f647z0 = "partner";

    /* JADX INFO: renamed from: a */
    public String f648a;

    /* JADX INFO: renamed from: b */
    public String f649b;

    /* JADX INFO: renamed from: c */
    public String f650c;

    /* JADX INFO: renamed from: d */
    public String f651d;

    /* JADX INFO: renamed from: e */
    public String f652e;

    /* JADX INFO: renamed from: f */
    public String f653f;

    /* JADX INFO: renamed from: g */
    public String f654g;

    /* JADX INFO: renamed from: h */
    public String f655h = "";

    /* JADX INFO: renamed from: i */
    public String f656i = "";

    /* JADX INFO: renamed from: j */
    public String f657j;

    public C0168b(Context context, boolean z) {
        context = context != null ? context.getApplicationContext() : context;
        this.f648a = m776b();
        this.f650c = m772a(context);
        this.f651d = m771a(z ? 0L : C0167a.f.m769a(context));
        this.f652e = m770a();
        this.f653f = m777b(context);
        this.f654g = "-";
        this.f657j = "-";
    }

    /* JADX INFO: renamed from: e */
    public static String m781e() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m784a(String str, String str2, Throwable th) {
        m789d(str, str2, m775a(th));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m786b(String str, String str2, String str3) {
        if (C0180b.m829i().m854g(null)) {
            C0244g.m1203d(C0170a.f659B, "event " + str + " " + str2 + " " + str3);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f655h)) {
                sb.append("^");
            }
            sb.append(TextUtils.isEmpty(str) ? "-" : m778b(str));
            sb.append(",");
            sb.append(m778b(str2));
            sb.append(",");
            sb.append(m778b(str3));
            sb.append(",-,-,-,-,-,-,-,-,-,-,");
            sb.append(m779c());
            this.f655h += ((Object) sb);
        } else {
            C0244g.m1203d(C0170a.f659B, "event " + str + " " + str2 + " " + str3);
            String str4 = TextUtils.isEmpty(this.f655h) ? "" : "^";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            String strM778b = TextUtils.isEmpty(str) ? "-" : m778b(str);
            sb2.append(strM778b + "," + m778b(str2) + "," + m778b(str3) + ",-,-,-,-,-,-,-,-,-,-," + m778b(m779c()));
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f655h);
            sb3.append(string);
            this.f655h = sb3.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m787c(String str, String str2, String str3) {
        m789d(str, str2, str3);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m790d() {
        return TextUtils.isEmpty(this.f656i);
    }

    /* JADX INFO: renamed from: c */
    public static String m779c() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m789d(String str, String str2, String str3) {
        C0244g.m1202c(C0170a.f659B, "err " + str + " " + str2 + " " + str3);
        String str4 = TextUtils.isEmpty(this.f656i) ? "" : "^";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        String strM778b = TextUtils.isEmpty(str3) ? "-" : m778b(str3);
        sb.append(str + "," + str2 + "," + strM778b + "," + m778b(m779c()));
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f656i);
        sb2.append(string);
        this.f656i = sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m780c(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    /* JADX INFO: renamed from: a */
    public void m785a(String str, String str2, Throwable th, String str3) {
        m789d(str, str2, C24104.m53357(str3, ": ", m775a(th)));
    }

    /* JADX INFO: renamed from: a */
    public void m783a(String str, String str2, String str3) {
        m786b("", str, C24104.m53357(str2, "|", str3));
    }

    /* JADX INFO: renamed from: a */
    public void m782a(String str, String str2) {
        m786b("", str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static String m775a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public String m788d(String str) {
        String strM774a = m774a(str);
        this.f649b = strM774a;
        String str2 = this.f648a;
        String str3 = this.f650c;
        String str4 = this.f651d;
        String str5 = this.f652e;
        String str6 = this.f653f;
        String str7 = this.f654g;
        String strM780c = m780c(this.f655h);
        String strM780c2 = m780c(this.f656i);
        String str8 = this.f657j;
        StringBuilder sbM12525 = C5633.m12525("[(", str2, "),(", strM774a, "),(");
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, str3, "),(", str4, "),(");
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, str5, "),(", str6, "),(");
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, str7, "),(", strM780c, "),(");
        sbM12525.append(strM780c2);
        sbM12525.append("),(");
        sbM12525.append(str8);
        sbM12525.append(")]");
        return sbM12525.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m774a(String str) {
        String str2;
        String string;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split(C0233a.f1084p);
        String strReplace = null;
        if (strArrSplit != null) {
            string = null;
            String strReplace2 = null;
            for (String str3 : strArrSplit) {
                String[] strArrSplit2 = str3.split("=");
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase(f647z0)) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(f577A0)) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(f579B0)) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(f581C0)) {
                        try {
                            JSONObject jSONObject = new JSONObject(C0254q.m1292e(C0233a.m1094f(), strArrSplit2[1]));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString(f577A0);
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase(f583D0) && TextUtils.isEmpty(strReplace)) {
                        strReplace = strArrSplit2[1];
                    }
                }
            }
            str2 = strReplace;
            strReplace = strReplace2;
        } else {
            str2 = null;
            string = null;
        }
        return m778b(strReplace) + "," + m778b(string) + ",-," + m778b(str2) + ",-,-,-";
    }

    /* JADX INFO: renamed from: b */
    public static String m778b(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace(MotionUtils.EASING_TYPE_FORMAT_START, "（").replace(MotionUtils.EASING_TYPE_FORMAT_END, "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    /* JADX INFO: renamed from: b */
    public static String m776b() {
        return C24104.m53357(m781e(), ",", new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    /* JADX INFO: renamed from: b */
    public static String m777b(Context context) {
        String strM778b = m778b(C0241d.m1181c(context));
        String strM778b2 = m778b(Build.VERSION.RELEASE);
        String strM778b3 = m778b(Build.MODEL);
        String strM778b4 = m778b(C0241d.m1182d(context).m1208c());
        String strM778b5 = m778b(C0084b.m451b(null, context));
        StringBuilder sb = new StringBuilder();
        sb.append(strM778b);
        sb.append(",android,");
        sb.append(strM778b2);
        sb.append(",");
        sb.append(strM778b3);
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, ",-,0,", strM778b4, ",gw,", strM778b5);
        sb.append(",-");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m772a(Context context) {
        String str;
        String str2 = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str2 = packageInfo.versionName + "|" + m773a(packageInfo);
                } catch (Throwable unused) {
                }
                str = str2;
                str2 = packageName;
            } catch (Throwable unused2) {
                str = "-";
            }
        } else {
            str = "-";
        }
        return m778b(str2) + "," + m778b(str) + ",-,-,-";
    }

    /* JADX INFO: renamed from: a */
    public static String m773a(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String strSubstring;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    String strM1257a = C0254q.m1257a((C0233a) null, signature.toByteArray());
                    strSubstring = TextUtils.isEmpty(strM1257a) ? "?" : C0254q.m1298g(strM1257a).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb.append("-");
                sb.append(strSubstring);
            }
            return sb.toString();
        } catch (Throwable unused2) {
            return "?";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m771a(long j) {
        String strM778b = m778b("15.8.40");
        String strM778b2 = m778b("h.a.3.8.40");
        return C10965.m25286(C5633.m12525("android,3,", strM778b, ",", strM778b2, ",com.alipay.mcpay,5.0,-,"), C17588.m40051(j, "~"), ",-");
    }

    /* JADX INFO: renamed from: a */
    public static String m770a() {
        return m778b(C0237a.m1142a(C0234b.m1121c().m1125b()).m1151f()) + "," + m778b(C0234b.m1121c().m1126d()) + ",-,-,-";
    }
}
