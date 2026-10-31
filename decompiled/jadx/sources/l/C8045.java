package l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.webkit.CookieSyncManager;
import com.alipay.sdk.m.u0.c;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۠۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8045 extends AbstractC23772 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String f24802 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f24803 = "libwbsafeedit";

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public WeakReference f24804;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC4227 f24805;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f24806;

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21377(Activity activity, InterfaceC4227 interfaceC4227) {
        C21451 c21451;
        ?? r2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        InterfaceC4227 c0989;
        Bundle bundleM52445;
        String str7;
        boolean z;
        String str8;
        String str9;
        String str10;
        Intent intent;
        ?? r3;
        Bundle bundleM52446;
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
        String strM32385;
        ?? r6;
        byte[] bArr;
        double dSqrt;
        String str13 = "openSDK_LOG.AuthAgent";
        if (C19044.m43897()) {
            C9145.m23518("openSDK_LOG.AuthAgent", "permission not granted");
            interfaceC4227.mo3454(new C19750(-6, "用户未授权，暂时无法使用QQ登录及分享等功能", "用户未授权，暂时无法使用QQ登录及分享等功能"));
            return -1;
        }
        this.f24806 = "get_simple_userinfo";
        this.f24804 = new WeakReference(activity);
        this.f24805 = interfaceC4227;
        Object[] objArr = new Object[2];
        Intent intent2 = activity.getIntent();
        boolean z2 = intent2 != null && intent2.getBooleanExtra("KEY_FORCE_QR_LOGIN", false);
        String str14 = "101492915";
        boolean zM51576 = C23255.m51569(activity, "101492915").m51576("C_LoginWeb");
        C9145.m23518("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin=" + z2 + ", toWebLogin=" + zM51576);
        String str15 = "pf";
        String str16 = "5";
        String str17 = "client_id";
        C21451 c21452 = this.f76946;
        if (z2 || zM51576) {
            c21451 = c21452;
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
            C9145.m23518("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
            Intent intent3 = new Intent();
            c21451 = c21452;
            intent3.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
            byte[] bArrDigest = null;
            if (C7733.m20717(C22927.m51019(), intent3)) {
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
                if (C7733.m20717(C22927.m51019(), intent3)) {
                    str13 = "openSDK_LOG.AuthAgent";
                    str14 = "101492915";
                    str8 = "openSDK_LOG.SystemUtils";
                    str = "openmobile_android";
                    str9 = "-";
                    str3 = "-android-";
                    str10 = "desktop_m_qq-";
                } else {
                    try {
                        DisplayMetrics displayMetrics = C22927.m51019().getResources().getDisplayMetrics();
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
                                if (C7733.m20717(C22927.m51019(), intent3)) {
                                    intent = intent3;
                                }
                                if (intent != null) {
                                    bundleM52446 = m52445();
                                    bundleM52446.putString("scope", this.f24806);
                                    str14 = str14;
                                    bundleM52446.putString("client_id", str14);
                                    if (AbstractC23772.f76945) {
                                        str12 = str10;
                                        StringBuilder sb = new StringBuilder(str12);
                                        sb.append(AbstractC23772.f76943);
                                        sb.append(str3);
                                        sb.append(AbstractC23772.f76944);
                                        str11 = str9;
                                        sb.append(str11);
                                        sb.append(AbstractC23772.f76942);
                                        bundleM52446.putString("pf", sb.toString());
                                    } else {
                                        str11 = str9;
                                        str12 = str10;
                                        bundleM52446.putString("pf", str);
                                    }
                                    bundleM52446.putString("need_pay", "1");
                                    bundleM52446.putString("oauth_app_name", C7733.m20713(C22927.m51019()));
                                    intent.putExtra("key_action", "action_login");
                                    intent.putExtra("key_params", bundleM52446);
                                    intent.putExtra(c.d, str14);
                                    string = bundleM52446.getString("status_os");
                                    string2 = bundleM52446.getString("status_machine");
                                    string3 = bundleM52446.getString("status_version");
                                    string4 = bundleM52446.getString("sdkv");
                                    str2 = str11;
                                    string5 = bundleM52446.getString("client_id");
                                    string6 = bundleM52446.getString("need_pay");
                                    string7 = bundleM52446.getString("pf");
                                    str4 = str12;
                                    StringBuilder sbM10501 = C3435.m10501("os=", string, ", machine=", string2, ", version=");
                                    ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10501, string3, ", sdkv=", string4, ", appId=");
                                    ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10501, string5, ", needPay=", string6, ", pf=");
                                    sbM10501.append(string7);
                                    str5 = str13;
                                    C9145.m23513(str5, sbM10501.toString());
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
                                            C9145.m23514("DESUtils", "encryptSha", e);
                                            r4 = "DESUtils";
                                        } catch (Exception e2) {
                                            e = e2;
                                            r4 = str8;
                                            C9145.m23514(r4, "getEncryptPkgName", e);
                                            r6 = r4;
                                            strM32385 = "";
                                            r5 = r6;
                                            bundleM52446.putString("ppsts", strM32385);
                                            this.f24805 = new C5223(this, this.f24805);
                                            C8956.m23090().m23094(this.f24805);
                                            C9145.m23513(str5, "startAssitActivity activity");
                                            AbstractC23772.m52444(activity, intent);
                                            C9145.m23518(str5, "startActionActivity() -- end, found activity for loginIntent");
                                            C7544 c7544M20258 = C7544.m20258();
                                            SystemClock.elapsedRealtime();
                                            c7544M20258.getClass();
                                            objArr[0] = "0";
                                            objArr[1] = 1;
                                            C9145.m23518(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                            C7544 c7544M20259 = C7544.m20258();
                                            String strM48596 = c21451.m48596();
                                            String str18 = (String) objArr[0];
                                            c7544M20259.getClass();
                                            C7544.m20260(strM48596, str14, str16, str18);
                                            return ((Integer) objArr[1]).intValue();
                                        }
                                    }
                                    bArr = bArrDigest;
                                    try {
                                        if (bArr == null) {
                                            String str19 = str8;
                                            C9145.m23516(str19, "getEncryptPkgName shaBytes==null !!!!!!");
                                            r6 = str19;
                                            strM32385 = "";
                                            r5 = r6;
                                        } else {
                                            r5 = str8;
                                            byte[] bArr2 = new byte[8];
                                            System.arraycopy(bArr, 5, bArr2, 0, 8);
                                            byte[] bArr3 = new byte[16];
                                            System.arraycopy(bArr, 8, bArr3, 0, 16);
                                            strM32385 = C13377.m32385(activity.getPackageName(), bArr2, C13377.m32386(bArr3));
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        C9145.m23514(r4, "getEncryptPkgName", e);
                                        r6 = r4;
                                    }
                                    bundleM52446.putString("ppsts", strM32385);
                                    try {
                                        this.f24805 = new C5223(this, this.f24805);
                                        C8956.m23090().m23094(this.f24805);
                                        C9145.m23513(str5, "startAssitActivity activity");
                                        AbstractC23772.m52444(activity, intent);
                                        C9145.m23518(str5, "startActionActivity() -- end, found activity for loginIntent");
                                        C7544 c7544M202510 = C7544.m20258();
                                        SystemClock.elapsedRealtime();
                                        c7544M202510.getClass();
                                        objArr[0] = "0";
                                        objArr[1] = 1;
                                        C9145.m23518(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                        C7544 c7544M202511 = C7544.m20258();
                                        String strM48597 = c21451.m48596();
                                        String str110 = (String) objArr[0];
                                        c7544M202511.getClass();
                                        C7544.m20260(strM48597, str14, str16, str110);
                                        return ((Integer) objArr[1]).intValue();
                                    } catch (Exception e4) {
                                        C9145.m23514(str5, "startActionActivity() exception", e4);
                                        r3 = r5;
                                    }
                                } else {
                                    str4 = str10;
                                    str5 = str13;
                                    str14 = str14;
                                    r3 = str8;
                                    str2 = str9;
                                }
                                C7544 c7544M202512 = C7544.m20258();
                                SystemClock.elapsedRealtime();
                                c7544M202512.getClass();
                                C9145.m23518(str5, "startActionActivity() -- end, no target activity for loginIntent");
                                r2 = r3;
                                C7544 c7544M202513 = C7544.m20258();
                                String strM48598 = c21451.m48596();
                                c7544M202513.getClass();
                                C7544.m20260(strM48598, str14, str16, "1");
                                C9145.m23519(str5, "doLogin startActivity fail show dialog.");
                                str6 = this.f24806;
                                if (str6 != null) {
                                    this.f24805 = new C5223(this, this.f24805);
                                } else {
                                    this.f24805 = new C5223(this, this.f24805);
                                }
                                c0989 = this.f24805;
                                CookieSyncManager.createInstance(C22927.m51019());
                                bundleM52445 = m52445();
                                bundleM52445.putString("scope", this.f24806);
                                bundleM52445.putString(str17, str14);
                                if (AbstractC23772.f76945) {
                                    bundleM52445.putString(str15, str4 + AbstractC23772.f76943 + str3 + AbstractC23772.f76944 + str2 + AbstractC23772.f76942);
                                } else {
                                    bundleM52445.putString(str15, str);
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(System.currentTimeMillis() / 1000);
                                String strM42736 = "";
                                sb3.append(strM42736);
                                String string9 = sb3.toString();
                                Context contextM51019 = C22927.m51019();
                                int i = C7733.f23932;
                                C9145.m23520(r2, "OpenUi, getSignValidString");
                                String packageName = contextM51019.getPackageName();
                                Signature[] signatureArr = contextM51019.getPackageManager().getPackageInfo(packageName, 64).signatures;
                                MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                                messageDigest2.update(signatureArr[0].toByteArray());
                                String strM42737 = C18338.m42736(messageDigest2.digest());
                                messageDigest2.reset();
                                C9145.m23520(r2, "-->sign: " + strM42737);
                                messageDigest2.update(C18338.m42747(packageName + "_" + strM42737 + "_" + string9 + strM42736));
                                strM42736 = C18338.m42736(messageDigest2.digest());
                                messageDigest2.reset();
                                StringBuilder sb4 = new StringBuilder("-->signEncryped: ");
                                sb4.append(strM42736);
                                C9145.m23520(r2, sb4.toString());
                                bundleM52445.putString("sign", strM42736);
                                bundleM52445.putString("time", string9);
                                bundleM52445.putString("display", "mobile");
                                str7 = this.f24806;
                                if (str7 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                bundleM52445.putString("response_type", "token");
                                bundleM52445.putString("redirect_uri", "auth://tauth.qq.com/");
                                bundleM52445.putString("cancel_display", "1");
                                bundleM52445.putString("switch", "1");
                                bundleM52445.putString("compat_v", "1");
                                C9145.m23518(str5, "OpenUI, showDialog addLoginAccount: ");
                                bundleM52445.putString("show_download_ui", Boolean.toString(true));
                                C9145.m23518(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                                String str20 = C14082.m33692().m33693(C22927.m51019(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C21845.m49234(bundleM52445);
                                if (!z) {
                                    c0989 = new C0989(this, C22927.m51019(), c0989);
                                }
                                C9145.m23513(str5, "OpenUi, showDialog TDialog");
                                C16926.m39771(new RunnableC2401(this, str20, c0989));
                                C9145.m23518(str5, "OpenUi, showDialog -- end");
                                return 2;
                            }
                            intent = null;
                            if (intent != null) {
                                bundleM52446 = m52445();
                                bundleM52446.putString("scope", this.f24806);
                                str14 = str14;
                                bundleM52446.putString("client_id", str14);
                                if (AbstractC23772.f76945) {
                                    str12 = str10;
                                    StringBuilder sb5 = new StringBuilder(str12);
                                    sb5.append(AbstractC23772.f76943);
                                    sb5.append(str3);
                                    sb5.append(AbstractC23772.f76944);
                                    str11 = str9;
                                    sb5.append(str11);
                                    sb5.append(AbstractC23772.f76942);
                                    bundleM52446.putString("pf", sb5.toString());
                                } else {
                                    str11 = str9;
                                    str12 = str10;
                                    bundleM52446.putString("pf", str);
                                }
                                bundleM52446.putString("need_pay", "1");
                                bundleM52446.putString("oauth_app_name", C7733.m20713(C22927.m51019()));
                                intent.putExtra("key_action", "action_login");
                                intent.putExtra("key_params", bundleM52446);
                                intent.putExtra(c.d, str14);
                                string = bundleM52446.getString("status_os");
                                string2 = bundleM52446.getString("status_machine");
                                string3 = bundleM52446.getString("status_version");
                                string4 = bundleM52446.getString("sdkv");
                                str2 = str11;
                                string5 = bundleM52446.getString("client_id");
                                string6 = bundleM52446.getString("need_pay");
                                string7 = bundleM52446.getString("pf");
                                str4 = str12;
                                StringBuilder sbM10502 = C3435.m10501("os=", string, ", machine=", string2, ", version=");
                                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10502, string3, ", sdkv=", string4, ", appId=");
                                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10502, string5, ", needPay=", string6, ", pf=");
                                sbM10502.append(string7);
                                str5 = str13;
                                C9145.m23513(str5, sbM10502.toString());
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
                                    C9145.m23516(str111, "getEncryptPkgName shaBytes==null !!!!!!");
                                    r6 = str111;
                                    strM32385 = "";
                                    r5 = r6;
                                } else {
                                    r5 = str8;
                                    byte[] bArr4 = new byte[8];
                                    System.arraycopy(bArr, 5, bArr4, 0, 8);
                                    byte[] bArr5 = new byte[16];
                                    System.arraycopy(bArr, 8, bArr5, 0, 16);
                                    strM32385 = C13377.m32385(activity.getPackageName(), bArr4, C13377.m32386(bArr5));
                                }
                                bundleM52446.putString("ppsts", strM32385);
                                this.f24805 = new C5223(this, this.f24805);
                                C8956.m23090().m23094(this.f24805);
                                C9145.m23513(str5, "startAssitActivity activity");
                                AbstractC23772.m52444(activity, intent);
                                C9145.m23518(str5, "startActionActivity() -- end, found activity for loginIntent");
                                C7544 c7544M202514 = C7544.m20258();
                                SystemClock.elapsedRealtime();
                                c7544M202514.getClass();
                                objArr[0] = "0";
                                objArr[1] = 1;
                                C9145.m23518(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                                C7544 c7544M202515 = C7544.m20258();
                                String strM48599 = c21451.m48596();
                                String str112 = (String) objArr[0];
                                c7544M202515.getClass();
                                C7544.m20260(strM48599, str14, str16, str112);
                                return ((Integer) objArr[1]).intValue();
                            }
                            str4 = str10;
                            str5 = str13;
                            str14 = str14;
                            r3 = str8;
                            str2 = str9;
                            C7544 c7544M202516 = C7544.m20258();
                            SystemClock.elapsedRealtime();
                            c7544M202516.getClass();
                            C9145.m23518(str5, "startActionActivity() -- end, no target activity for loginIntent");
                            r2 = r3;
                            C7544 c7544M202517 = C7544.m20258();
                            String strM485910 = c21451.m48596();
                            c7544M202517.getClass();
                            C7544.m20260(strM485910, str14, str16, "1");
                            C9145.m23519(str5, "doLogin startActivity fail show dialog.");
                            str6 = this.f24806;
                            if (str6 != null) {
                                this.f24805 = new C5223(this, this.f24805);
                            } else {
                                this.f24805 = new C5223(this, this.f24805);
                            }
                            c0989 = this.f24805;
                            CookieSyncManager.createInstance(C22927.m51019());
                            bundleM52445 = m52445();
                            bundleM52445.putString("scope", this.f24806);
                            bundleM52445.putString(str17, str14);
                            if (AbstractC23772.f76945) {
                                bundleM52445.putString(str15, str4 + AbstractC23772.f76943 + str3 + AbstractC23772.f76944 + str2 + AbstractC23772.f76942);
                            } else {
                                bundleM52445.putString(str15, str);
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(System.currentTimeMillis() / 1000);
                            String strM42738 = "";
                            sb7.append(strM42738);
                            String string11 = sb7.toString();
                            Context contextM510110 = C22927.m51019();
                            int i2 = C7733.f23932;
                            C9145.m23520(r2, "OpenUi, getSignValidString");
                            String packageName2 = contextM510110.getPackageName();
                            Signature[] signatureArr2 = contextM510110.getPackageManager().getPackageInfo(packageName2, 64).signatures;
                            MessageDigest messageDigest4 = MessageDigest.getInstance("MD5");
                            messageDigest4.update(signatureArr2[0].toByteArray());
                            String strM42739 = C18338.m42736(messageDigest4.digest());
                            messageDigest4.reset();
                            C9145.m23520(r2, "-->sign: " + strM42739);
                            messageDigest4.update(C18338.m42747(packageName2 + "_" + strM42739 + "_" + string11 + strM42738));
                            strM42738 = C18338.m42736(messageDigest4.digest());
                            messageDigest4.reset();
                            StringBuilder sb8 = new StringBuilder("-->signEncryped: ");
                            sb8.append(strM42738);
                            C9145.m23520(r2, sb8.toString());
                            bundleM52445.putString("sign", strM42738);
                            bundleM52445.putString("time", string11);
                            bundleM52445.putString("display", "mobile");
                            str7 = this.f24806;
                            if (str7 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            bundleM52445.putString("response_type", "token");
                            bundleM52445.putString("redirect_uri", "auth://tauth.qq.com/");
                            bundleM52445.putString("cancel_display", "1");
                            bundleM52445.putString("switch", "1");
                            bundleM52445.putString("compat_v", "1");
                            C9145.m23518(str5, "OpenUI, showDialog addLoginAccount: ");
                            bundleM52445.putString("show_download_ui", Boolean.toString(true));
                            C9145.m23518(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
                            String str21 = C14082.m33692().m33693(C22927.m51019(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C21845.m49234(bundleM52445);
                            if (!z) {
                                c0989 = new C0989(this, C22927.m51019(), c0989);
                            }
                            C9145.m23513(str5, "OpenUi, showDialog TDialog");
                            C16926.m39771(new RunnableC2401(this, str21, c0989));
                            C9145.m23518(str5, "OpenUi, showDialog -- end");
                            return 2;
                        }
                    } catch (Throwable unused4) {
                        str8 = "openSDK_LOG.SystemUtils";
                    }
                    if (dSqrt > 6.5d) {
                        intent3.setClassName("com.tencent.minihd.qq", "com.tencent.open.agent.AgentActivity");
                        if (C7733.m20717(C22927.m51019(), intent3)) {
                        }
                    }
                    intent = null;
                }
                intent = intent3;
            }
            if (intent != null) {
                bundleM52446 = m52445();
                bundleM52446.putString("scope", this.f24806);
                str14 = str14;
                bundleM52446.putString("client_id", str14);
                if (AbstractC23772.f76945) {
                    str12 = str10;
                    StringBuilder sb9 = new StringBuilder(str12);
                    sb9.append(AbstractC23772.f76943);
                    sb9.append(str3);
                    sb9.append(AbstractC23772.f76944);
                    str11 = str9;
                    sb9.append(str11);
                    sb9.append(AbstractC23772.f76942);
                    bundleM52446.putString("pf", sb9.toString());
                } else {
                    str11 = str9;
                    str12 = str10;
                    bundleM52446.putString("pf", str);
                }
                bundleM52446.putString("need_pay", "1");
                bundleM52446.putString("oauth_app_name", C7733.m20713(C22927.m51019()));
                intent.putExtra("key_action", "action_login");
                intent.putExtra("key_params", bundleM52446);
                intent.putExtra(c.d, str14);
                string = bundleM52446.getString("status_os");
                string2 = bundleM52446.getString("status_machine");
                string3 = bundleM52446.getString("status_version");
                string4 = bundleM52446.getString("sdkv");
                str2 = str11;
                string5 = bundleM52446.getString("client_id");
                string6 = bundleM52446.getString("need_pay");
                string7 = bundleM52446.getString("pf");
                str4 = str12;
                StringBuilder sbM10503 = C3435.m10501("os=", string, ", machine=", string2, ", version=");
                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10503, string3, ", sdkv=", string4, ", appId=");
                ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10503, string5, ", needPay=", string6, ", pf=");
                sbM10503.append(string7);
                str5 = str13;
                C9145.m23513(str5, sbM10503.toString());
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
                    C9145.m23516(str113, "getEncryptPkgName shaBytes==null !!!!!!");
                    r6 = str113;
                    strM32385 = "";
                    r5 = r6;
                } else {
                    r5 = str8;
                    byte[] bArr6 = new byte[8];
                    System.arraycopy(bArr, 5, bArr6, 0, 8);
                    byte[] bArr7 = new byte[16];
                    System.arraycopy(bArr, 8, bArr7, 0, 16);
                    strM32385 = C13377.m32385(activity.getPackageName(), bArr6, C13377.m32386(bArr7));
                }
                bundleM52446.putString("ppsts", strM32385);
                this.f24805 = new C5223(this, this.f24805);
                C8956.m23090().m23094(this.f24805);
                C9145.m23513(str5, "startAssitActivity activity");
                AbstractC23772.m52444(activity, intent);
                C9145.m23518(str5, "startActionActivity() -- end, found activity for loginIntent");
                C7544 c7544M202518 = C7544.m20258();
                SystemClock.elapsedRealtime();
                c7544M202518.getClass();
                objArr[0] = "0";
                objArr[1] = 1;
                C9145.m23518(str5, "OpenUi, showUi, return Constants.UI_ACTIVITY");
                C7544 c7544M202519 = C7544.m20258();
                String strM485911 = c21451.m48596();
                String str114 = (String) objArr[0];
                c7544M202519.getClass();
                C7544.m20260(strM485911, str14, str16, str114);
                return ((Integer) objArr[1]).intValue();
            }
            str4 = str10;
            str5 = str13;
            str14 = str14;
            r3 = str8;
            str2 = str9;
            C7544 c7544M2025110 = C7544.m20258();
            SystemClock.elapsedRealtime();
            c7544M2025110.getClass();
            C9145.m23518(str5, "startActionActivity() -- end, no target activity for loginIntent");
            r2 = r3;
        }
        C7544 c7544M2025111 = C7544.m20258();
        String strM485912 = c21451.m48596();
        c7544M2025111.getClass();
        C7544.m20260(strM485912, str14, str16, "1");
        C9145.m23519(str5, "doLogin startActivity fail show dialog.");
        str6 = this.f24806;
        if (str6 != null || !str6.contains("server_side")) {
            this.f24805 = new C5223(this, this.f24805);
        }
        c0989 = this.f24805;
        CookieSyncManager.createInstance(C22927.m51019());
        bundleM52445 = m52445();
        bundleM52445.putString("scope", this.f24806);
        bundleM52445.putString(str17, str14);
        if (AbstractC23772.f76945) {
            bundleM52445.putString(str15, str4 + AbstractC23772.f76943 + str3 + AbstractC23772.f76944 + str2 + AbstractC23772.f76942);
        } else {
            bundleM52445.putString(str15, str);
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(System.currentTimeMillis() / 1000);
        String strM427310 = "";
        sb11.append(strM427310);
        String string13 = sb11.toString();
        Context contextM510111 = C22927.m51019();
        int i3 = C7733.f23932;
        C9145.m23520(r2, "OpenUi, getSignValidString");
        try {
            String packageName3 = contextM510111.getPackageName();
            Signature[] signatureArr3 = contextM510111.getPackageManager().getPackageInfo(packageName3, 64).signatures;
            MessageDigest messageDigest6 = MessageDigest.getInstance("MD5");
            messageDigest6.update(signatureArr3[0].toByteArray());
            String strM427311 = C18338.m42736(messageDigest6.digest());
            messageDigest6.reset();
            C9145.m23520(r2, "-->sign: " + strM427311);
            messageDigest6.update(C18338.m42747(packageName3 + "_" + strM427311 + "_" + string13 + strM427310));
            strM427310 = C18338.m42736(messageDigest6.digest());
            messageDigest6.reset();
            StringBuilder sb12 = new StringBuilder("-->signEncryped: ");
            sb12.append(strM427310);
            C9145.m23520(r2, sb12.toString());
        } catch (Exception e5) {
            C9145.m23514(r2, "OpenUi, getSignValidString error", e5);
        }
        bundleM52445.putString("sign", strM427310);
        bundleM52445.putString("time", string13);
        bundleM52445.putString("display", "mobile");
        str7 = this.f24806;
        if (str7 == null && str7.contains("server_side")) {
            z = true;
        } else {
            z = false;
        }
        bundleM52445.putString("response_type", "token");
        bundleM52445.putString("redirect_uri", "auth://tauth.qq.com/");
        bundleM52445.putString("cancel_display", "1");
        bundleM52445.putString("switch", "1");
        bundleM52445.putString("compat_v", "1");
        C9145.m23518(str5, "OpenUI, showDialog addLoginAccount: ");
        bundleM52445.putString("show_download_ui", Boolean.toString(true));
        C9145.m23518(str5, "OpenUi, showDialog -- start, isShowDownloadUi=true");
        String str22 = C14082.m33692().m33693(C22927.m51019(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + C21845.m49234(bundleM52445);
        if (!z) {
            c0989 = new C0989(this, C22927.m51019(), c0989);
        }
        C9145.m23513(str5, "OpenUi, showDialog TDialog");
        C16926.m39771(new RunnableC2401(this, str22, c0989));
        C9145.m23518(str5, "OpenUi, showDialog -- end");
        return 2;
    }

    static {
        f24802 = C16014.m37867("libwbsafeedit", ".so");
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            f24803 = "libwbsafeedit";
            f24802 = C16014.m37867("libwbsafeedit", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            f24803 = "libwbsafeedit_64";
            f24802 = C16014.m37867("libwbsafeedit_64", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        } else if (str.equalsIgnoreCase("x86")) {
            f24803 = "libwbsafeedit_x86";
            f24802 = C16014.m37867("libwbsafeedit_x86", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is x86 architecture");
        } else if (str.equalsIgnoreCase("x86_64")) {
            f24803 = "libwbsafeedit_x86_64";
            f24802 = C16014.m37867("libwbsafeedit_x86_64", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        } else {
            f24803 = "libwbsafeedit";
            f24802 = C16014.m37867("libwbsafeedit", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21378() {
        this.f24805 = null;
    }
}
