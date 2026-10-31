package l;

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
import com.alipay.sdk.m.m.b;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.o;
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
public final class C18338 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f56991 = "";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f56992 = "";

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m42734(String str) {
        String[] strArr;
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split(a.p)) {
                    int iIndexOf = str2.indexOf("=");
                    if (iIndexOf == -1) {
                        strArr = new String[]{str2};
                    } else {
                        strArr = new String[]{str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1)};
                    }
                    if (strArr.length == 2) {
                        bundle.putString(C2912.decode(strArr[0]), C2912.decode(strArr[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m42737(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split(a.p)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    try {
                        strArrSplit[0] = C2912.decode(strArrSplit[0]);
                        strArrSplit[1] = C2912.decode(strArrSplit[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    } catch (JSONException e) {
                        C9145.m23516("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m42741(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleM42734 = m42734(url.getQuery());
            bundleM42734.putAll(m42734(url.getRef()));
            return bundleM42734;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42745(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectM42737 = m42737((JSONObject) null, url.getQuery());
            m42737(jSONObjectM42737, url.getRef());
            return jSONObjectM42737;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42748(String str) {
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
            str = "{online:" + str.charAt(str.length() - 2) + l.d;
        }
        return new JSONObject(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m42746(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (C7733.m20709(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strM42736 = m42736(messageDigest.digest());
                    messageDigest.reset();
                    if (strM42736.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e) {
                    C9145.m23516("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42740(Context context, String str) {
        boolean zM42746;
        try {
            zM42746 = m42746(context);
            try {
                if (zM42746) {
                    m42738(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    m42738(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (zM42746) {
                    try {
                        try {
                            try {
                                m42738(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                                return true;
                            } catch (Exception unused2) {
                                return false;
                            }
                        } catch (Exception unused3) {
                            m42738(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused4) {
                        m42738(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    }
                }
                try {
                    try {
                        m42738(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    } catch (Exception unused5) {
                        return false;
                    }
                } catch (Exception unused6) {
                    m42738(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            zM42746 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42738(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42736(byte[] bArr) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42739(Context context) {
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
                C9145.m23514("openSDK_LOG.Util", "checkSelfPermission exception", e);
            }
        }
        NetworkInfo[] allNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.Util", "Util.isNetWorkAvailable getConnectivity has exception", th);
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
                C9145.m23514("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e2);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m42735(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString(b.D0, str5);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        bundle.putString("platform", "1");
        bundle.putString(o.c, str6);
        return bundle;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42743(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            f56992 = str2;
            f56991 = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f56992;
            str3.substring(str3.lastIndexOf(46) + 1, f56992.length());
        } catch (PackageManager.NameNotFoundException e) {
            C9145.m23516("openSDK_LOG.Util", "getPackageInfo has exception: " + e.getMessage());
        } catch (Exception e2) {
            C9145.m23516("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42742(Context context) {
        if (context == null) {
            return "";
        }
        m42743(context, "com.tencent.mobileqq");
        return f56992;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m42744(Context context, String str) {
        if (context == null) {
            return "";
        }
        m42743(context, str);
        return f56991;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m42747(String str) {
        try {
            return str.getBytes(a.D);
        } catch (UnsupportedEncodingException e) {
            C9145.m23514("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e);
            return new byte[0];
        }
    }
}
