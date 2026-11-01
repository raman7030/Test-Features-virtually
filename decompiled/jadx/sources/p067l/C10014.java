package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.webkit.CookieSyncManager;
import com.alipay.sdk.p010m.p052u0.C0227c;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۠۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10014 extends AbstractC24961 {

    /* JADX INFO: renamed from: ۢ */
    public static String f27716 = null;

    /* JADX INFO: renamed from: ᩷ */
    public static String f27717 = "libwbsafeedit";

    /* JADX INFO: renamed from: ۜ */
    public WeakReference f27718;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC6386 f27719;

    /* JADX INFO: renamed from: ᩻ */
    public String f27720;

    /* JADX WARN: Code duplicated, block: B:101:0x0353  */
    /* JADX WARN: Code duplicated, block: B:102:0x037d  */
    /* JADX WARN: Code duplicated, block: B:110:0x043f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0447  */
    /* JADX WARN: Code duplicated, block: B:117:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0202  */
    /* JADX WARN: Code duplicated, block: B:60:0x0209  */
    /* JADX WARN: Code duplicated, block: B:63:0x0210  */
    /* JADX WARN: Code duplicated, block: B:66:0x0217  */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0247 A[Catch: Exception -> 0x0266, TRY_LEAVE, TryCatch #4 {Exception -> 0x0266, blocks: (B:75:0x0243, B:76:0x0247), top: B:129:0x023d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0328  */
    /* JADX WARN: Code duplicated, block: B:98:0x032f  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x0353, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX INFO: renamed from: ֫ */
    public final int m23344(Activity activity, InterfaceC6386 interfaceC6386) {
        C22755 c22755;
        ?? r2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        InterfaceC6386 c3308;
        Bundle bundleM54854;
        String str7;
        boolean z;
        String str8;
        String str9;
        String str10;
        Intent intent;
        ?? r3;
        Bundle bundleM54855;
        String str11;
        String str12;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        ?? r4;
        ?? r5;
        String strM34486;
        ?? r6;
        byte[] bArr;
        double dSqrt;
        String str13 = "openSDK_LOG.AuthAgent";
        if (C20468.m46166()) {
            C11060.m25469("openSDK_LOG.AuthAgent", "permission not granted");
            interfaceC6386.mo5757(new C21139(-6, "用户未授权，暂时无法使用QQ登录及分享等功能", "用户未授权，暂时无法使用QQ登录及分享等功能"));
            return -1;
        }
        this.f27720 = "get_simple_userinfo";
        this.f27718 = new WeakReference(activity);
        this.f27719 = interfaceC6386;
        Object[] objArr = new Object[2];
        Intent intent2 = activity.getIntent();
        boolean z2 = intent2 != null && intent2.getBooleanExtra("KEY_FORCE_QR_LOGIN", false);
        String str14 = "101492915";
        boolean zM53972 = C24470.m53965(activity, "101492915").m53972("C_LoginWeb");
        C11060.m25469("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin=" + z2 + ", toWebLogin=" + zM53972);
        String str15 = "pf";
        String str16 = "5";
        String str17 = "client_id";
        C22755 c22756 = this.f79699;
        if (z2 || zM53972) {
            c22755 = c22756;
            str17 = "client_id";
            r2 = "openSDK_LOG.SystemUtils";
            str = "openmobile_android";
            str2 = "-";
            str3 = "-android-";
            str4 = "desktop_m_qq-";
            str15 = "pf";
            str16 = str16;
            str5 = "openSDK_LOG.AuthAgent";
        } else {
            C11060.m25469("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
            Intent intent3 = new Intent();
            c22755 = c22756;
            intent3.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
            byte[] bArrDigest = null;
            if (C9718.m22697(C24158.m53410(), intent3)) {
                str13 = "openSDK_LOG.AuthAgent";
                str14 = "101492915";
                str8 = "openSDK_LOG.SystemUtils";
                str = "openmobile_android";
                str9 = "-";
                str3 = "-android-";
                str10 = "desktop_m_qq-";
                intent = intent3;
            } else {
                intent3.setClassName("com.tencent.tim", "com.tencent.open.agent.AgentActivity");
                if (C9718.m22697(C24158.m53410(), intent3)) {
                    str13 = "openSDK_LOG.AuthAgent";
                    str14 = "101492915";
                    str8 = "openSDK_LOG.SystemUtils";
                    str = "openmobile_android";
                    str9 = "-";
                    str3 = "-android-";
                    str10 = "desktop_m_qq-";
                } else {
                    try {
                        DisplayMetrics displayMetrics = C24158.m53410().getResources().getDisplayMetrics();
                        str8 = "openSDK_LOG.SystemUtils";
                        try {
                            float f = displayMetrics.widthPixels / displayMetrics.xdpi;
                            float f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
                            str = "openmobile_android";
                            str9 = "-";
                            double d = f;
                            str3 = "-android-";
                            str10 = "desktop_m_qq-";
                            try {
                                str13 = "openSDK_LOG.AuthAgent";
                                str14 = "101492915";
                                try {
                                    dSqrt = Math.sqrt(Math.pow(d, 2.0d) + Math.pow(f2, 2.0d));
                                } catch (Throwable unused) {
                                    dSqrt = 0.0d;
                                }
                            } catch (Throwable unused2) {
                                str13 = "openSDK_LOG.AuthAgent";
                                str14 = "101492915";
                            }
                        } catch (Throwable unused3) {
                            str = "openmobile_android";
                            str9 = "-";
                            str3 = "-android-";
                            str10 = "desktop_m_qq-";
                            dSqrt = 0.0d;
                            if (dSqrt > 6.5d) {
                                intent3.setClassName("com.tencent.minihd.qq", "com.tencent.open.agent.AgentActivity");
                                if (C9718.m22697(C24158.m53410(), intent3)) {
                                    intent = intent3;
                                }
                                if (intent != null) {
                                    bundleM54855 = m54854();
                                    bundleM54855.putString("scope", this.f27720);
                                    str14 = str14;
                                    bundleM54855.putString("client_id", str14);
                                    if (AbstractC24961.f79698) {
                                        str12 = str10;
                                        StringBuilder sb = new StringBuilder(str12);
                                        sb.append(AbstractC24961.f79696);
                                        sb.append(str3);
                                        sb.append(AbstractC24961.f79697);
                                        str11 = str9;
                                        sb.append(str11);
                                        sb.append(AbstractC24961.f79695);
                                        bundleM54855.putString("pf", sb.toString());
                                    } else {
                                        str11 = str9;
                                        str12 = str10;
                                        bundleM54855.putString("pf", str);
                                    }
                                    bundleM54855.putString("need_pay", "1");
                                    bundleM54855.putString("oauth_app_name", C9718.m22693(C24158.m53410()));
                                    intent.putExtra("key_action", "action_login");
                                    intent.putExtra("key_params", bundleM54855);
                                    intent.putExtra(C0227c.f1027d, str14);
                                    string = bundleM54855.getString("status_os");
                                    string2 = bundleM54855.getString("status_machine");
                                    string3 = bundleM54855.getString("status_version");
                                    string4 = bundleM54855.getString("sdkv");
                                    str2 = str11;
                                    string5 = bundleM54855.getString("client_id");
                                    string6 = bundleM54855.getString("need_pay");
                                    string7 = bundleM54855.getString("pf");
                                    str4 = str12;
                                    StringBuilder sbM12525 = C5633.m12525("os=", string, ", machine=", string2, ", version=");
                                    ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, string3, ", sdkv=", string4, ", appId=");
                                    ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, string5, ", needPay=", string6, ", pf=");
                                    sbM12525.append(string7);
                                    str5 = str13;
                                    C11060.m25464(str5, sbM12525.toString());
                                    StringBuilder sb2 = new StringBuilder();
                                    if (string == null) {
                                        string = "";
                                    }
                                    sb2.append(string);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    sb2.append(string2);
                                    if (string3 == null) {
                                        string3 = "";
                                    }
                                    sb2.append(string3);
                                    if (string4 == null) {
                                        string4 = "";
                                    }
                                    sb2.append(string4);
                                    if (string5 == null) {
                                        string5 = "";
                                    }
                                    sb2.append(string5);
                                    if (string6 == null) {
                                        string6 = "";
                                    }
                                    sb2.append(string6);
                                    if (string7 == null) {
                                        string7 = "";
                                    }
                                    sb2.append(string7);
                                    String string8 = sb2.toString();
                                    try {
                                        MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                                        messageDigest.update(string8.getBytes());
                                        bArrDigest = messageDigest.digest();
                                        r4 = messageDigest;
                                    } catch (Exception e) {
                                        try {
                                            C11060.m25465("DESUtils", "encryptSha", e);
                                            r4 = "DESUtils";
                                        } catch (Exception e2) {
                                            e = e2;
                                            r4 = str8;
                                            C11060.m25465(r4, "getEncryptPkgName", e);
                                            r6 = r4;
                                            strM34486 = "";
                                            r5 = r6;
                                            bundleM54855.putString("ppsts", strM34486);
                                            this.f27719 = new C7332(this, this.f27719);
                                            C10880.m25064().m25068(this.f27719);
                                            C11060.m25464(str5, "startAssitActivity activity");
                                            AbstractC24961.m54853(activity, intent);
                                            C11060.m25469(str5, "startActionActivity() -- end, found activity for loginIntent");
                                            C9538 c9538M22234 = C9538.m22234();
                                            SystemClock.elapsedRealtime();
                                            c9538M22234.getClass();
                                            objArr[0] = "0";
                                            objArr[1] = 1;
                                            C11060.m25469(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                            C9538 c9538M22235 = C9538.m22234();
                                            String strM50933 = c22755.m50933();
                                            String str18 = (String) objArr[0];
                                            c9538M22235.getClass();
                                            C9538.m22236(strM50933, str14, str16, str18);
                                            return ((Integer) objArr[1]).intValue();
                                        }
                                    }
                                    bArr = bArrDigest;
                                    try {
                                        if (bArr == null) {
                                            String str19 = str8;
                                            C11060.m25467(str19, "getEncryptPkgName shaBytes==null !!!!!!");
                                            r6 = str19;
                                            strM34486 = "";
                                            r5 = r6;
                                        } else {
                                            r5 = str8;
                                            byte[] bArr2 = new byte[8];
                                            System.arraycopy(bArr, 5, bArr2, 0, 8);
                                            byte[] bArr3 = new byte[16];
                                            System.arraycopy(bArr, 8, bArr3, 0, 16);
                                            strM34486 = C15082.m34486(activity.getPackageName(), bArr2, C15082.m34487(bArr3));
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        C11060.m25465(r4, "getEncryptPkgName", e);
                                        r6 = r4;
                                    }
                                    bundleM54855.putString("ppsts", strM34486);
                                    try {
                                        this.f27719 = new C7332(this, this.f27719);
                                        C10880.m25064().m25068(this.f27719);
                                        C11060.m25464(str5, "startAssitActivity activity");
                                        AbstractC24961.m54853(activity, intent);
                                        C11060.m25469(str5, "startActionActivity() -- end, found activity for loginIntent");
                                        C9538 c9538M22236 = C9538.m22234();
                                        SystemClock.elapsedRealtime();
                                        c9538M22236.getClass();
                                        objArr[0] = "0";
                                        objArr[1] = 1;
                                        C11060.m25469(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                        C9538 c9538M22237 = C9538.m22234();
                                        String strM50934 = c22755.m50933();
                                        String str110 = (String) objArr[0];
                                        c9538M22237.getClass();
                                        C9538.m22236(strM50934, str14, str16, str110);
                                        return ((Integer) objArr[1]).intValue();
                                    } catch (Exception e4) {
                                        C11060.m25465(str5, "startActionActivity() exception", e4);
                                        r3 = r5;
                                    }
                                } else {
                                    str4 = str10;
                                    str5 = str13;
                                    str14 = str14;
                                    r3 = str8;
                                    str2 = str9;
                                }
                                C9538 c9538M22238 = C9538.m22234();
                                SystemClock.elapsedRealtime();
                                c9538M22238.getClass();
                                C11060.m25469(str5, "startActionActivity() -- end, no target activity for loginIntent");
                                r2 = r3;
                                C9538 c9538M22239 = C9538.m22234();
                                String strM50935 = c22755.m50933();
                                c9538M22239.getClass();
                                C9538.m22236(strM50935, str14, str16, "1");
                                C11060.m25470(str5, "doLogin startActivity fail show dialog.");
                                str6 = this.f27720;
                                if (str6 != null) {
                                    this.f27719 = new C7332(this, this.f27719);
                                } else {
                                    this.f27719 = new C7332(this, this.f27719);
                                }
                                c3308 = this.f27719;
                                CookieSyncManager.createInstance(C24158.m53410());
                                bundleM54854 = m54854();
                                bundleM54854.putString("scope", this.f27720);
                                bundleM54854.putString(str17, str14);
                                if (AbstractC24961.f79698) {
                                    bundleM54854.putString(str15, str4 + AbstractC24961.f79696 + str3 + AbstractC24961.f79697 + str2 + AbstractC24961.f79695);
                                } else {
                                    bundleM54854.putString(str15, str);
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(System.currentTimeMillis() / 1000);
                                String strM44998 = "";
                                sb3.append(strM44998);
                                String string9 = sb3.toString();
                                Context contextM53410 = C24158.m53410();
                                int i = C9718.f26845;
                                C11060.m25471(r2, "OpenUi, getSignValidString");
                                String packageName = contextM53410.getPackageName();
                                Signature[] signatureArr = contextM53410.getPackageManager().getPackageInfo(packageName, 64).signatures;
                                MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                                messageDigest2.update(signatureArr[0].toByteArray());
                                String strM44999 = C19797.m44998(messageDigest2.digest());
                                messageDigest2.reset();
                                C11060.m25471(r2, "-->sign: " + strM44999);
                                messageDigest2.update(C19797.m45009(packageName + "_" + strM44999 + "_" + string9 + strM44998));
                                strM44998 = C19797.m44998(messageDigest2.digest());
                                messageDigest2.reset();
                                StringBuilder sb4 = new StringBuilder("-->signEncryped: ");
                                sb4.append(strM44998);
                                C11060.m25471(r2, sb4.toString());
                                bundleM54854.putString("sign", strM44998);
                                bundleM54854.putString("time", string9);
                                bundleM54854.putString("display", "mobile");
                                str7 = this.f27720;
                                if (str7 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                bundleM54854.putString("response_type", "token");
                                bundleM54854.putString("redirect_uri", "auth://tauth.qq.com/");
                                bundleM54854.putString("cancel_display", "1");
                                bundleM54854.putString("switch", "1");
                                bundleM54854.putString("compat_v", "1");
                                C11060.m25469(str5, "OpenUI, showDialog addLoginAccount: ");
                                bundleM54854.putString("show_download_ui", Boolean.toString(true));
                                C11060.m25469(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                                String str20 = C15752.m35817().m35818(C24158.m53410(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C23130.m51585(bundleM54854);
                                if (!z) {
                                    c3308 = new C3308(this, C24158.m53410(), c3308);
                                }
                                C11060.m25464(str5, "OpenUi, showDialog TDialog");
                                C18455.m42012(new RunnableC4650(this, str20, c3308));
                                C11060.m25469(str5, "OpenUi, showDialog -- end");
                                return 2;
                            }
                            intent = null;
                            if (intent != null) {
                                bundleM54855 = m54854();
                                bundleM54855.putString("scope", this.f27720);
                                str14 = str14;
                                bundleM54855.putString("client_id", str14);
                                if (AbstractC24961.f79698) {
                                    str12 = str10;
                                    StringBuilder sb5 = new StringBuilder(str12);
                                    sb5.append(AbstractC24961.f79696);
                                    sb5.append(str3);
                                    sb5.append(AbstractC24961.f79697);
                                    str11 = str9;
                                    sb5.append(str11);
                                    sb5.append(AbstractC24961.f79695);
                                    bundleM54855.putString("pf", sb5.toString());
                                } else {
                                    str11 = str9;
                                    str12 = str10;
                                    bundleM54855.putString("pf", str);
                                }
                                bundleM54855.putString("need_pay", "1");
                                bundleM54855.putString("oauth_app_name", C9718.m22693(C24158.m53410()));
                                intent.putExtra("key_action", "action_login");
                                intent.putExtra("key_params", bundleM54855);
                                intent.putExtra(C0227c.f1027d, str14);
                                string = bundleM54855.getString("status_os");
                                string2 = bundleM54855.getString("status_machine");
                                string3 = bundleM54855.getString("status_version");
                                string4 = bundleM54855.getString("sdkv");
                                str2 = str11;
                                string5 = bundleM54855.getString("client_id");
                                string6 = bundleM54855.getString("need_pay");
                                string7 = bundleM54855.getString("pf");
                                str4 = str12;
                                StringBuilder sbM12526 = C5633.m12525("os=", string, ", machine=", string2, ", version=");
                                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12526, string3, ", sdkv=", string4, ", appId=");
                                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12526, string5, ", needPay=", string6, ", pf=");
                                sbM12526.append(string7);
                                str5 = str13;
                                C11060.m25464(str5, sbM12526.toString());
                                StringBuilder sb6 = new StringBuilder();
                                if (string == null) {
                                    string = "";
                                }
                                sb6.append(string);
                                if (string2 == null) {
                                    string2 = "";
                                }
                                sb6.append(string2);
                                if (string3 == null) {
                                    string3 = "";
                                }
                                sb6.append(string3);
                                if (string4 == null) {
                                    string4 = "";
                                }
                                sb6.append(string4);
                                if (string5 == null) {
                                    string5 = "";
                                }
                                sb6.append(string5);
                                if (string6 == null) {
                                    string6 = "";
                                }
                                sb6.append(string6);
                                if (string7 == null) {
                                    string7 = "";
                                }
                                sb6.append(string7);
                                String string10 = sb6.toString();
                                MessageDigest messageDigest3 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                                messageDigest3.update(string10.getBytes());
                                bArrDigest = messageDigest3.digest();
                                r4 = messageDigest3;
                                bArr = bArrDigest;
                                if (bArr == null) {
                                    String str111 = str8;
                                    C11060.m25467(str111, "getEncryptPkgName shaBytes==null !!!!!!");
                                    r6 = str111;
                                    strM34486 = "";
                                    r5 = r6;
                                } else {
                                    r5 = str8;
                                    byte[] bArr4 = new byte[8];
                                    System.arraycopy(bArr, 5, bArr4, 0, 8);
                                    byte[] bArr5 = new byte[16];
                                    System.arraycopy(bArr, 8, bArr5, 0, 16);
                                    strM34486 = C15082.m34486(activity.getPackageName(), bArr4, C15082.m34487(bArr5));
                                }
                                bundleM54855.putString("ppsts", strM34486);
                                this.f27719 = new C7332(this, this.f27719);
                                C10880.m25064().m25068(this.f27719);
                                C11060.m25464(str5, "startAssitActivity activity");
                                AbstractC24961.m54853(activity, intent);
                                C11060.m25469(str5, "startActionActivity() -- end, found activity for loginIntent");
                                C9538 c9538M222310 = C9538.m22234();
                                SystemClock.elapsedRealtime();
                                c9538M222310.getClass();
                                objArr[0] = "0";
                                objArr[1] = 1;
                                C11060.m25469(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                C9538 c9538M222311 = C9538.m22234();
                                String strM50936 = c22755.m50933();
                                String str112 = (String) objArr[0];
                                c9538M222311.getClass();
                                C9538.m22236(strM50936, str14, str16, str112);
                                return ((Integer) objArr[1]).intValue();
                            }
                            str4 = str10;
                            str5 = str13;
                            str14 = str14;
                            r3 = str8;
                            str2 = str9;
                            C9538 c9538M222312 = C9538.m22234();
                            SystemClock.elapsedRealtime();
                            c9538M222312.getClass();
                            C11060.m25469(str5, "startActionActivity() -- end, no target activity for loginIntent");
                            r2 = r3;
                            C9538 c9538M222313 = C9538.m22234();
                            String strM50937 = c22755.m50933();
                            c9538M222313.getClass();
                            C9538.m22236(strM50937, str14, str16, "1");
                            C11060.m25470(str5, "doLogin startActivity fail show dialog.");
                            str6 = this.f27720;
                            if (str6 != null) {
                                this.f27719 = new C7332(this, this.f27719);
                            } else {
                                this.f27719 = new C7332(this, this.f27719);
                            }
                            c3308 = this.f27719;
                            CookieSyncManager.createInstance(C24158.m53410());
                            bundleM54854 = m54854();
                            bundleM54854.putString("scope", this.f27720);
                            bundleM54854.putString(str17, str14);
                            if (AbstractC24961.f79698) {
                                bundleM54854.putString(str15, str4 + AbstractC24961.f79696 + str3 + AbstractC24961.f79697 + str2 + AbstractC24961.f79695);
                            } else {
                                bundleM54854.putString(str15, str);
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(System.currentTimeMillis() / 1000);
                            String strM449910 = "";
                            sb7.append(strM449910);
                            String string11 = sb7.toString();
                            Context contextM53411 = C24158.m53410();
                            int i2 = C9718.f26845;
                            C11060.m25471(r2, "OpenUi, getSignValidString");
                            String packageName2 = contextM53411.getPackageName();
                            Signature[] signatureArr2 = contextM53411.getPackageManager().getPackageInfo(packageName2, 64).signatures;
                            MessageDigest messageDigest4 = MessageDigest.getInstance("MD5");
                            messageDigest4.update(signatureArr2[0].toByteArray());
                            String strM449911 = C19797.m44998(messageDigest4.digest());
                            messageDigest4.reset();
                            C11060.m25471(r2, "-->sign: " + strM449911);
                            messageDigest4.update(C19797.m45009(packageName2 + "_" + strM449911 + "_" + string11 + strM449910));
                            strM449910 = C19797.m44998(messageDigest4.digest());
                            messageDigest4.reset();
                            StringBuilder sb8 = new StringBuilder("-->signEncryped: ");
                            sb8.append(strM449910);
                            C11060.m25471(r2, sb8.toString());
                            bundleM54854.putString("sign", strM449910);
                            bundleM54854.putString("time", string11);
                            bundleM54854.putString("display", "mobile");
                            str7 = this.f27720;
                            if (str7 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            bundleM54854.putString("response_type", "token");
                            bundleM54854.putString("redirect_uri", "auth://tauth.qq.com/");
                            bundleM54854.putString("cancel_display", "1");
                            bundleM54854.putString("switch", "1");
                            bundleM54854.putString("compat_v", "1");
                            C11060.m25469(str5, "OpenUI, showDialog addLoginAccount: ");
                            bundleM54854.putString("show_download_ui", Boolean.toString(true));
                            C11060.m25469(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                            String str21 = C15752.m35817().m35818(C24158.m53410(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C23130.m51585(bundleM54854);
                            if (!z) {
                                c3308 = new C3308(this, C24158.m53410(), c3308);
                            }
                            C11060.m25464(str5, "OpenUi, showDialog TDialog");
                            C18455.m42012(new RunnableC4650(this, str21, c3308));
                            C11060.m25469(str5, "OpenUi, showDialog -- end");
                            return 2;
                        }
                    } catch (Throwable unused4) {
                        str8 = "openSDK_LOG.SystemUtils";
                    }
                    if (dSqrt > 6.5d) {
                        intent3.setClassName("com.tencent.minihd.qq", "com.tencent.open.agent.AgentActivity");
                        if (C9718.m22697(C24158.m53410(), intent3)) {
                        }
                    }
                    intent = null;
                }
                intent = intent3;
            }
            if (intent != null) {
                bundleM54855 = m54854();
                bundleM54855.putString("scope", this.f27720);
                str14 = str14;
                bundleM54855.putString("client_id", str14);
                if (AbstractC24961.f79698) {
                    str12 = str10;
                    StringBuilder sb9 = new StringBuilder(str12);
                    sb9.append(AbstractC24961.f79696);
                    sb9.append(str3);
                    sb9.append(AbstractC24961.f79697);
                    str11 = str9;
                    sb9.append(str11);
                    sb9.append(AbstractC24961.f79695);
                    bundleM54855.putString("pf", sb9.toString());
                } else {
                    str11 = str9;
                    str12 = str10;
                    bundleM54855.putString("pf", str);
                }
                bundleM54855.putString("need_pay", "1");
                bundleM54855.putString("oauth_app_name", C9718.m22693(C24158.m53410()));
                intent.putExtra("key_action", "action_login");
                intent.putExtra("key_params", bundleM54855);
                intent.putExtra(C0227c.f1027d, str14);
                string = bundleM54855.getString("status_os");
                string2 = bundleM54855.getString("status_machine");
                string3 = bundleM54855.getString("status_version");
                string4 = bundleM54855.getString("sdkv");
                str2 = str11;
                string5 = bundleM54855.getString("client_id");
                string6 = bundleM54855.getString("need_pay");
                string7 = bundleM54855.getString("pf");
                str4 = str12;
                StringBuilder sbM12527 = C5633.m12525("os=", string, ", machine=", string2, ", version=");
                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12527, string3, ", sdkv=", string4, ", appId=");
                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12527, string5, ", needPay=", string6, ", pf=");
                sbM12527.append(string7);
                str5 = str13;
                C11060.m25464(str5, sbM12527.toString());
                StringBuilder sb10 = new StringBuilder();
                if (string == null) {
                    string = "";
                }
                sb10.append(string);
                if (string2 == null) {
                    string2 = "";
                }
                sb10.append(string2);
                if (string3 == null) {
                    string3 = "";
                }
                sb10.append(string3);
                if (string4 == null) {
                    string4 = "";
                }
                sb10.append(string4);
                if (string5 == null) {
                    string5 = "";
                }
                sb10.append(string5);
                if (string6 == null) {
                    string6 = "";
                }
                sb10.append(string6);
                if (string7 == null) {
                    string7 = "";
                }
                sb10.append(string7);
                String string12 = sb10.toString();
                MessageDigest messageDigest5 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                messageDigest5.update(string12.getBytes());
                bArrDigest = messageDigest5.digest();
                r4 = messageDigest5;
                bArr = bArrDigest;
                if (bArr == null) {
                    String str113 = str8;
                    C11060.m25467(str113, "getEncryptPkgName shaBytes==null !!!!!!");
                    r6 = str113;
                    strM34486 = "";
                    r5 = r6;
                } else {
                    r5 = str8;
                    byte[] bArr6 = new byte[8];
                    System.arraycopy(bArr, 5, bArr6, 0, 8);
                    byte[] bArr7 = new byte[16];
                    System.arraycopy(bArr, 8, bArr7, 0, 16);
                    strM34486 = C15082.m34486(activity.getPackageName(), bArr6, C15082.m34487(bArr7));
                }
                bundleM54855.putString("ppsts", strM34486);
                this.f27719 = new C7332(this, this.f27719);
                C10880.m25064().m25068(this.f27719);
                C11060.m25464(str5, "startAssitActivity activity");
                AbstractC24961.m54853(activity, intent);
                C11060.m25469(str5, "startActionActivity() -- end, found activity for loginIntent");
                C9538 c9538M222314 = C9538.m22234();
                SystemClock.elapsedRealtime();
                c9538M222314.getClass();
                objArr[0] = "0";
                objArr[1] = 1;
                C11060.m25469(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                C9538 c9538M222315 = C9538.m22234();
                String strM50938 = c22755.m50933();
                String str114 = (String) objArr[0];
                c9538M222315.getClass();
                C9538.m22236(strM50938, str14, str16, str114);
                return ((Integer) objArr[1]).intValue();
            }
            str4 = str10;
            str5 = str13;
            str14 = str14;
            r3 = str8;
            str2 = str9;
            C9538 c9538M222316 = C9538.m22234();
            SystemClock.elapsedRealtime();
            c9538M222316.getClass();
            C11060.m25469(str5, "startActionActivity() -- end, no target activity for loginIntent");
            r2 = r3;
        }
        C9538 c9538M222317 = C9538.m22234();
        String strM50939 = c22755.m50933();
        c9538M222317.getClass();
        C9538.m22236(strM50939, str14, str16, "1");
        C11060.m25470(str5, "doLogin startActivity fail show dialog.");
        str6 = this.f27720;
        if (str6 != null || !str6.contains("server_side")) {
            this.f27719 = new C7332(this, this.f27719);
        }
        c3308 = this.f27719;
        CookieSyncManager.createInstance(C24158.m53410());
        bundleM54854 = m54854();
        bundleM54854.putString("scope", this.f27720);
        bundleM54854.putString(str17, str14);
        if (AbstractC24961.f79698) {
            bundleM54854.putString(str15, str4 + AbstractC24961.f79696 + str3 + AbstractC24961.f79697 + str2 + AbstractC24961.f79695);
        } else {
            bundleM54854.putString(str15, str);
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(System.currentTimeMillis() / 1000);
        String strM449912 = "";
        sb11.append(strM449912);
        String string13 = sb11.toString();
        Context contextM53412 = C24158.m53410();
        int i3 = C9718.f26845;
        C11060.m25471(r2, "OpenUi, getSignValidString");
        try {
            String packageName3 = contextM53412.getPackageName();
            Signature[] signatureArr3 = contextM53412.getPackageManager().getPackageInfo(packageName3, 64).signatures;
            MessageDigest messageDigest6 = MessageDigest.getInstance("MD5");
            messageDigest6.update(signatureArr3[0].toByteArray());
            String strM449913 = C19797.m44998(messageDigest6.digest());
            messageDigest6.reset();
            C11060.m25471(r2, "-->sign: " + strM449913);
            messageDigest6.update(C19797.m45009(packageName3 + "_" + strM449913 + "_" + string13 + strM449912));
            strM449912 = C19797.m44998(messageDigest6.digest());
            messageDigest6.reset();
            StringBuilder sb12 = new StringBuilder("-->signEncryped: ");
            sb12.append(strM449912);
            C11060.m25471(r2, sb12.toString());
        } catch (Exception e5) {
            C11060.m25465(r2, "OpenUi, getSignValidString error", e5);
        }
        bundleM54854.putString("sign", strM449912);
        bundleM54854.putString("time", string13);
        bundleM54854.putString("display", "mobile");
        str7 = this.f27720;
        if (str7 == null && str7.contains("server_side")) {
            z = true;
        } else {
            z = false;
        }
        bundleM54854.putString("response_type", "token");
        bundleM54854.putString("redirect_uri", "auth://tauth.qq.com/");
        bundleM54854.putString("cancel_display", "1");
        bundleM54854.putString("switch", "1");
        bundleM54854.putString("compat_v", "1");
        C11060.m25469(str5, "OpenUI, showDialog addLoginAccount: ");
        bundleM54854.putString("show_download_ui", Boolean.toString(true));
        C11060.m25469(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
        String str22 = C15752.m35817().m35818(C24158.m53410(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C23130.m51585(bundleM54854);
        if (!z) {
            c3308 = new C3308(this, C24158.m53410(), c3308);
        }
        C11060.m25464(str5, "OpenUi, showDialog TDialog");
        C18455.m42012(new RunnableC4650(this, str22, c3308));
        C11060.m25469(str5, "OpenUi, showDialog -- end");
        return 2;
    }

    static {
        f27716 = C17588.m40053("libwbsafeedit", ".so");
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            f27717 = "libwbsafeedit";
            f27716 = C17588.m40053("libwbsafeedit", ".so");
            C11060.m25469("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            f27717 = "libwbsafeedit_64";
            f27716 = C17588.m40053("libwbsafeedit_64", ".so");
            C11060.m25469("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        } else if (str.equalsIgnoreCase("x86")) {
            f27717 = "libwbsafeedit_x86";
            f27716 = C17588.m40053("libwbsafeedit_x86", ".so");
            C11060.m25469("openSDK_LOG.AuthAgent", "is x86 architecture");
        } else if (str.equalsIgnoreCase("x86_64")) {
            f27717 = "libwbsafeedit_x86_64";
            f27716 = C17588.m40053("libwbsafeedit_x86_64", ".so");
            C11060.m25469("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        } else {
            f27717 = "libwbsafeedit";
            f27716 = C17588.m40053("libwbsafeedit", ".so");
            C11060.m25469("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23345() {
        this.f27719 = null;
    }
}
