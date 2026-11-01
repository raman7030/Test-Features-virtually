package com.alipay.sdk.p010m.p014b0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p041p.C0187d;
import com.alipay.sdk.p010m.p043q.C0190a;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0247j;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.b0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0087a {

    /* JADX INFO: renamed from: e */
    public static final String f316e = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    /* JADX INFO: renamed from: f */
    public static final String f317f = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: g */
    public static final String f318g = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkzi87lcyX1t/OSjlmjmj\nUFTAb0Y0wPZ79j10sjVrDtV+lMZXz/hOalITFyXRpmS8g8I1H3AlhihQQsierIFa\nQj5omUsXhzvNO+4DorkMJ14n1o1sfL0iOLTrzydghuUpyspj0M8v5bJTBbLv8DGM\nreKtJ8sbIYC5aj8pAdxn+YTnZ4Rhp/pNRbmIAlxs4Btu3whJt/RTfEASgsDRaTgO\nr9Rlj2YDiyEM4T3d0LsLjNed7B0Ogulzj6OzvHj+foIyb+YEEn6C5F9r+uNY2l2i\nYlHfaizd1HKfISrcAseJu6lGKRP0I3mv538Twqg1u0DFV6waQ9gwgOhq4ORCiNpd\nIQIDAQAB";

    /* JADX INFO: renamed from: a */
    public WeakReference f319a;

    /* JADX INFO: renamed from: b */
    public WeakReference f320b;

    /* JADX INFO: renamed from: c */
    public WeakReference f321c;

    /* JADX INFO: renamed from: d */
    public String f322d = C0247j.a.f1171a;

    /* JADX INFO: renamed from: com.alipay.sdk.m.b0.a$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WebView f323a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f324b;

        /* JADX INFO: renamed from: com.alipay.sdk.m.b0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: N673 */
        public class C2408a implements ValueCallback {
            public C2408a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        public a(WebView webView, String str) {
            this.f323a = webView;
            this.f324b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f323a.evaluateJavascript(this.f324b, new C2408a());
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.b0.a$b */
    /* JADX INFO: compiled from: N673 */
    public class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ConnectivityManager f327a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f328b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f329c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Map f330d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f331e;

        /* JADX INFO: renamed from: com.alipay.sdk.m.b0.a$b$a */
        /* JADX INFO: compiled from: N673 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ConnectivityManager.NetworkCallback f333a;

            public a(ConnectivityManager.NetworkCallback networkCallback) {
                this.f333a = networkCallback;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f327a.unregisterNetworkCallback(this.f333a);
            }
        }

        public b(ConnectivityManager connectivityManager, String str, String str2, Map map, String str3) {
            this.f327a = connectivityManager;
            this.f328b = str;
            this.f329c = str2;
            this.f330d = map;
            this.f331e = str3;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge checkNetworkAndRequest onAvailable");
            try {
                if (this.f327a.getNetworkCapabilities(network).hasTransport(0)) {
                    C0087a.this.m473a(network, this.f328b, this.f329c, this.f330d, this.f331e, new a(this));
                } else {
                    C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge sendNetworkByWifiBridge net error ");
                }
            } catch (Throwable th) {
                C0244g.m1199a(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.b0.a$c */
    /* JADX INFO: compiled from: N673 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Network f335a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f336b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f337c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Map f338d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f339e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Runnable f340f;

        public c(Network network, String str, String str2, Map map, String str3, Runnable runnable) {
            this.f335a = network;
            this.f336b = str;
            this.f337c = str2;
            this.f338d = map;
            this.f339e = str3;
            this.f340f = runnable;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #8 {all -> 0x00ec, blocks: (B:37:0x00b2, B:39:0x00c1), top: B:87:0x00b2 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:71:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // java.lang.Runnable
        public void run() {
            ?? r2;
            BufferedReader bufferedReader;
            C0233a c0233a;
            HttpURLConnection httpURLConnection;
            Runnable runnable;
            OutputStream outputStream;
            StringBuilder sb = new StringBuilder();
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = (HttpsURLConnection) this.f335a.openConnection(new URL(this.f336b));
                try {
                    httpURLConnection.setRequestMethod(this.f337c.toUpperCase());
                    httpURLConnection.setConnectTimeout(OpenAuthTask.Duplex);
                    httpURLConnection.setReadTimeout(OpenAuthTask.Duplex);
                    for (String str : this.f338d.keySet()) {
                        httpURLConnection.setRequestProperty(str, (String) this.f338d.get(str));
                    }
                    if (TextUtils.equals("POST", this.f337c.toUpperCase())) {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(this.f339e.getBytes(StandardCharsets.UTF_8));
                            outputStream.flush();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = null;
                            httpURLConnection2 = outputStream;
                            r2 = httpURLConnection2;
                            httpURLConnection2 = httpURLConnection;
                            try {
                                C0244g.m1199a(th);
                                c0233a = (C0233a) C0087a.this.f321c.get();
                                if (c0233a != null) {
                                    C0167a.m755b(c0233a, C0168b.f618l, "AlipayChinaMobileBridge", "sendNetworkAsyncError");
                                }
                                if (r2 != 0) {
                                    try {
                                        r2.close();
                                    } catch (IOException e) {
                                        C0244g.m1199a(e);
                                    }
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e2) {
                                        C0244g.m1199a(e2);
                                    }
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection = httpURLConnection2;
                                    httpURLConnection.disconnect();
                                }
                                runnable = this.f340f;
                                if (runnable != null) {
                                    runnable.run();
                                }
                            } catch (Throwable th2) {
                                if (r2 != 0) {
                                    try {
                                        r2.close();
                                    } catch (IOException e3) {
                                        C0244g.m1199a(e3);
                                    }
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        C0244g.m1199a(e4);
                                    }
                                }
                                if (httpURLConnection2 == null) {
                                    throw th2;
                                }
                                httpURLConnection2.disconnect();
                                throw th2;
                            }
                        }
                    } else {
                        outputStream = null;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                            sb.append("\n");
                        } catch (Throwable th3) {
                            th = th3;
                            httpURLConnection2 = outputStream;
                            r2 = httpURLConnection2;
                            httpURLConnection2 = httpURLConnection;
                            C0244g.m1199a(th);
                            c0233a = (C0233a) C0087a.this.f321c.get();
                            if (c0233a != null) {
                                C0167a.m755b(c0233a, C0168b.f618l, "AlipayChinaMobileBridge", "sendNetworkAsyncError");
                            }
                            if (r2 != 0) {
                                r2.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection = httpURLConnection2;
                            }
                            runnable = this.f340f;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    }
                    C0087a.this.m476b(sb.toString());
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e5) {
                            C0244g.m1199a(e5);
                        }
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e6) {
                        C0244g.m1199a(e6);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                }
            } catch (Throwable th5) {
                th = th5;
                r2 = 0;
                bufferedReader = null;
            }
            httpURLConnection.disconnect();
            runnable = this.f340f;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C0087a(Context context, WebView webView, C0233a c0233a) {
        this.f319a = null;
        this.f320b = null;
        this.f321c = null;
        this.f319a = new WeakReference(context);
        this.f320b = new WeakReference(webView);
        this.f321c = new WeakReference(c0233a);
    }

    /* JADX INFO: renamed from: b */
    public final void m476b(String str) {
        C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge sendCallbackForSendNetwork:" + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0213e.f989m, str);
            jSONObject.put("netType", this.f322d);
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
        m477c("window.receiveNetworkSwitch(" + jSONObject + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: c */
    public final void m477c(String str) {
        C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge sendWebCallback: " + str);
        WebView webView = (WebView) this.f320b.get();
        if (webView == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a(webView, str));
    }

    @JavascriptInterface
    public int getMobileOperator(String str) {
        C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge getMobileOperator params: " + str);
        Context context = (Context) this.f319a.get();
        if (context == null) {
            return -3;
        }
        try {
            String strM472a = m472a(context);
            if (!TextUtils.equals(strM472a, "46000") && !TextUtils.equals(strM472a, "46002") && !TextUtils.equals(strM472a, "46007") && !TextUtils.equals(strM472a, "46004")) {
                if (!TextUtils.equals(strM472a, "46003") && !TextUtils.equals(strM472a, "46005") && !TextUtils.equals(strM472a, "46011")) {
                    return (TextUtils.equals(strM472a, "46001") || TextUtils.equals(strM472a, "46006") || TextUtils.equals(strM472a, "46009")) ? 3 : -3;
                }
                return 2;
            }
            return 1;
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return -3;
        }
    }

    @JavascriptInterface
    public void sendNetworkByWifiBridge(String str) {
        C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge sendNetworkSwitch params: " + str);
        if (TextUtils.isEmpty(str) || ((Context) this.f319a.get()) == null) {
            return;
        }
        this.f322d = C0247j.a.f1171a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(AbstractC0213e.f995s);
            String string2 = jSONObject.getString("url");
            String string3 = jSONObject.getString("headers");
            String string4 = jSONObject.getString("params");
            HashMap map = new HashMap();
            JSONObject jSONObject2 = new JSONObject(string3);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.optString(next, ""));
            }
            m475a(map);
            m474a(string2, string, map, string4);
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m472a(Context context) {
        if (context == null) {
            return "";
        }
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge getMobileOperator: " + simOperator);
        return simOperator;
    }

    /* JADX INFO: renamed from: a */
    public final void m474a(String str, String str2, Map map, String str3) {
        C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge checkNetworkAndRequest");
        Context context = (Context) this.f319a.get();
        if (context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new b(connectivityManager, str, str2, map, str3));
    }

    /* JADX INFO: renamed from: b */
    public static String m471b() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return sb.toString();
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if ((inetAddressNextElement instanceof Inet6Address) && !inetAddressNextElement.isLoopbackAddress()) {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            int iIndexOf = hostAddress.indexOf(37);
                            if (iIndexOf > 0) {
                                hostAddress = hostAddress.substring(0, iIndexOf);
                            }
                            arrayList.add(hostAddress);
                        }
                    }
                    for (String str : arrayList) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str);
                    }
                }
            }
            return sb.toString();
        } catch (Exception e) {
            C0244g.m1199a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m473a(Network network, String str, String str2, Map map, String str3, Runnable runnable) {
        C0244g.m1201b(C0170a.f659B, "AlipayChinaMobileBridge sendNetworkAsync");
        C0190a.m920a(new c(network, str, str2, map, str3, runnable));
    }

    /* JADX INFO: renamed from: a */
    public final void m475a(Map map) {
        C0244g.m1201b(C0170a.f659B, "attachParamsToHeader");
        Context context = (Context) this.f319a.get();
        if (context == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ipv4List", m464a());
            jSONObject.put("ipv6List", m471b());
            String strM1209a = C0247j.m1209a(context);
            this.f322d = strM1209a;
            jSONObject.put("networkType", strM1209a);
            jSONObject.put("packageName", context.getPackageName());
            String string = jSONObject.toString();
            C0244g.m1201b(C0170a.f659B, "AlipayJsBridge attachParamsToHeader sdkDataStr：" + string);
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String strM465a = m465a(bArr, f318g);
            String strM466a = m466a(string.getBytes(), bArr);
            map.put("sdkSecret", strM465a);
            map.put("sdkData", strM466a);
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m464a() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return sb.toString();
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if ((inetAddressNextElement instanceof Inet4Address) && !inetAddressNextElement.isLoopbackAddress()) {
                            arrayList.add(inetAddressNextElement.getHostAddress());
                        }
                    }
                }
            }
            for (String str : arrayList) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
            return sb.toString();
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m466a(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(f317f);
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, Arrays.copyOf(bArr2, 12)));
        return C0184a.m900a(cipher.doFinal(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static String m465a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || TextUtils.isEmpty(str)) {
            return null;
        }
        RSAPublicKey rSAPublicKeyM467a = m467a(str);
        Cipher cipher = Cipher.getInstance(f316e);
        cipher.init(1, rSAPublicKeyM467a);
        return C0184a.m900a(m470a(bArr, cipher, (rSAPublicKeyM467a.getModulus().bitLength() / 8) - 66));
    }

    /* JADX INFO: renamed from: a */
    public static RSAPublicKey m467a(String str) {
        return (RSAPublicKey) KeyFactory.getInstance(C0187d.f883a).generatePublic(new X509EncodedKeySpec(C0184a.m902a(str)));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m470a(byte[] bArr, Cipher cipher, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int length = bArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = length - i2;
                if (i4 > 0) {
                    byte[] bArrDoFinal = cipher.doFinal(bArr, i2, Math.min(i4, i));
                    byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                    i3++;
                    i2 = i3 * i;
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
