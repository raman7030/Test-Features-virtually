package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0252o;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19797 {

    /* JADX INFO: renamed from: ֫ */
    public static String f60209 = "";

    /* JADX INFO: renamed from: ۧ */
    public static String f60210 = "";

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m44996(String str) {
        String[] strArr;
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split(C0233a.f1084p)) {
                    int iIndexOf = str2.indexOf("=");
                    if (iIndexOf == -1) {
                        strArr = new String[]{str2};
                    } else {
                        strArr = new String[]{str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1)};
                    }
                    if (strArr.length == 2) {
                        bundle.putString(C5136.decode(strArr[0]), C5136.decode(strArr[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m44999(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split(C0233a.f1084p)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    try {
                        strArrSplit[0] = C5136.decode(strArrSplit[0]);
                        strArrSplit[1] = C5136.decode(strArrSplit[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    } catch (JSONException e) {
                        C11060.m25467("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bundle m45003(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleM44996 = m44996(url.getQuery());
            bundleM44996.putAll(m44996(url.getRef()));
            return bundleM44996;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m45007(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectM44999 = m44999((JSONObject) null, url.getQuery());
            m44999(jSONObjectM44999, url.getRef());
            return jSONObjectM44999;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONObject m45010(String str) {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + C0249l.f1198d;
        }
        return new JSONObject(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m45008(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (C9718.m22689(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strM44998 = m44998(messageDigest.digest());
                    messageDigest.reset();
                    if (strM44998.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e) {
                    C11060.m25467("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45002(Context context, String str) {
        boolean zM45008;
        try {
            zM45008 = m45008(context);
            try {
                if (zM45008) {
                    m45000(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    m45000(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (zM45008) {
                    try {
                        try {
                            try {
                                m45000(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                                return true;
                            } catch (Exception unused2) {
                                return false;
                            }
                        } catch (Exception unused3) {
                            m45000(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused4) {
                        m45000(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    }
                }
                try {
                    try {
                        m45000(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    } catch (Exception unused5) {
                        return false;
                    }
                } catch (Exception unused6) {
                    m45000(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            zM45008 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45000(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m44998(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String string = Integer.toString(b & 255, 16);
            if (string.length() == 1) {
                string = "0".concat(string);
            }
            sb.append(string);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0084 A[LOOP:0: B:52:0x0079->B:56:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0083 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m45001(Context context) {
        ConnectivityManager connectivityManager;
        int i;
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return true;
                }
            } catch (Exception e) {
                C11060.m25465("openSDK_LOG.Util", "checkSelfPermission exception", e);
            }
        }
        NetworkInfo[] allNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.Util", "Util.isNetWorkAvailable getConnectivity has exception", th);
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3))) ? false : true;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e2) {
                C11060.m25465("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e2);
                if (allNetworkInfo != null && allNetworkInfo.length != 0) {
                    for (NetworkInfo networkInfo : allNetworkInfo) {
                        if (networkInfo.isConnectedOrConnecting()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        } catch (Throwable unused) {
            allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                while (i < r6) {
                    if (networkInfo.isConnectedOrConnecting()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m44997(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString(C0168b.f583D0, str5);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        bundle.putString("platform", "1");
        bundle.putString(C0252o.f1208c, str6);
        return bundle;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45005(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            f60210 = str2;
            f60209 = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f60210;
            str3.substring(str3.lastIndexOf(46) + 1, f60210.length());
        } catch (PackageManager.NameNotFoundException e) {
            C11060.m25467("openSDK_LOG.Util", "getPackageInfo has exception: " + e.getMessage());
        } catch (Exception e2) {
            C11060.m25467("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m45004(Context context) {
        if (context == null) {
            return "";
        }
        m45005(context, "com.tencent.mobileqq");
        return f60210;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m45006(Context context, String str) {
        if (context == null) {
            return "";
        }
        m45005(context, str);
        return f60209;
    }

    /* JADX INFO: renamed from: ܿ */
    public static byte[] m45009(String str) {
        try {
            return str.getBytes(C0233a.f1077D);
        } catch (UnsupportedEncodingException e) {
            C11060.m25465("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e);
            return new byte[0];
        }
    }
}
