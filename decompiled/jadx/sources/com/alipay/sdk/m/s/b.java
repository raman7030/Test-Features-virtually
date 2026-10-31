package com.alipay.sdk.m.s;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.l;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String a = "msp";
    public static final String b = "application/octet-stream;binary/octet-stream";
    public static final CookieManager c = new CookieManager();

    /* JADX INFO: compiled from: N673 */
    public final class a {
        public final String a;
        public final byte[] b;
        public final Map c;

        public a(String str, Map map, byte[] bArr) {
            this.a = str;
            this.b = bArr;
            this.c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.a, this.c);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.s.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: N673 */
    public final class C0025b {
        public final Map a;
        public final String b;
        public final byte[] c;

        public C0025b(Map map, String str, byte[] bArr) {
            this.a = map;
            this.b = str;
            this.c = bArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0192 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0199 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static C0025b a(Context context, a aVar) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        if (context == null) {
            return null;
        }
        try {
            g.d(com.alipay.sdk.m.n.a.B, "conn config: " + aVar);
            URL url = new URL(aVar.a);
            Proxy proxyB = b(context);
            g.d(com.alipay.sdk.m.n.a.B, "conn proxy: " + proxyB);
            httpURLConnection = proxyB != null ? (HttpURLConnection) url.openConnection(proxyB) : (HttpURLConnection) url.openConnection();
            try {
                System.setProperty("http.keepAlive", "false");
                CookieManager cookieManager = c;
                if (cookieManager.getCookieStore().getCookies().size() > 0) {
                    httpURLConnection.setRequestProperty("Cookie", TextUtils.join(l.b, cookieManager.getCookieStore().getCookies()));
                }
                httpURLConnection.setConnectTimeout(com.alipay.sdk.m.o.b.j0);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("User-Agent", a);
                byte[] bArr = aVar.b;
                if (bArr == null || bArr.length <= 0) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", b);
                    httpURLConnection.setRequestProperty("Accept-Charset", com.alipay.sdk.m.w.a.D);
                    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Keep-Alive", "timeout=180, max=100");
                }
                Map map = aVar.c;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                }
                httpURLConnection.setDoInput(true);
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    httpURLConnection.setDoOutput(true);
                }
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream.write(aVar.b);
                        bufferedOutputStream.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = null;
                        try {
                            g.a(th);
                            return null;
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable unused) {
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                    }
                } else {
                    bufferedOutputStream = null;
                }
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    byte[] bArrA = a(bufferedInputStream);
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    String strJoin = (headerFields == null || headerFields.get(null) == null) ? null : TextUtils.join(",", headerFields.get(null));
                    List<String> list = headerFields.get("Set-Cookie");
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            List<HttpCookie> list2 = HttpCookie.parse(it.next());
                            if (list2 != null && !list2.isEmpty()) {
                                c.getCookieStore().add(url.toURI(), list2.get(0));
                            }
                        }
                    }
                    C0025b c0025b = new C0025b(headerFields, strJoin, bArrA);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused4) {
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused5) {
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    return c0025b;
                } catch (Throwable th3) {
                    th = th3;
                    g.a(th);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
                bufferedOutputStream = null;
                g.a(th);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
    }

    public static Proxy b(Context context) {
        String strA = a(context);
        if (strA != null && !strA.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a(Context context) {
        try {
            NetworkInfo networkInfoA = com.alipay.sdk.m.a0.b.a(null, context);
            if (networkInfoA != null && networkInfoA.isAvailable()) {
                return networkInfoA.getType() == 1 ? "wifi" : networkInfoA.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr, 0, 1024);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
