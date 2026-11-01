package com.alipay.sdk.p010m.p047s;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p012a0.C0084b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0249l;
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

/* JADX INFO: renamed from: com.alipay.sdk.m.s.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0202b {

    /* JADX INFO: renamed from: a */
    public static final String f945a = "msp";

    /* JADX INFO: renamed from: b */
    public static final String f946b = "application/octet-stream;binary/octet-stream";

    /* JADX INFO: renamed from: c */
    public static final CookieManager f947c = new CookieManager();

    /* JADX INFO: renamed from: com.alipay.sdk.m.s.b$a */
    /* JADX INFO: compiled from: N673 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final String f948a;

        /* JADX INFO: renamed from: b */
        public final byte[] f949b;

        /* JADX INFO: renamed from: c */
        public final Map f950c;

        public a(String str, Map map, byte[] bArr) {
            this.f948a = str;
            this.f949b = bArr;
            this.f950c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f948a, this.f950c);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.s.b$b */
    /* JADX INFO: compiled from: N673 */
    public final class b {

        /* JADX INFO: renamed from: a */
        public final Map f951a;

        /* JADX INFO: renamed from: b */
        public final String f952b;

        /* JADX INFO: renamed from: c */
        public final byte[] f953c;

        public b(Map map, String str, byte[] bArr) {
            this.f951a = map;
            this.f952b = str;
            this.f953c = bArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0192 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0199 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static b m977a(Context context, a aVar) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        if (context == null) {
            return null;
        }
        try {
            C0244g.m1203d(C0170a.f659B, "conn config: " + aVar);
            URL url = new URL(aVar.f948a);
            Proxy proxyM980b = m980b(context);
            C0244g.m1203d(C0170a.f659B, "conn proxy: " + proxyM980b);
            httpURLConnection = proxyM980b != null ? (HttpURLConnection) url.openConnection(proxyM980b) : (HttpURLConnection) url.openConnection();
            try {
                System.setProperty("http.keepAlive", "false");
                CookieManager cookieManager = f947c;
                if (cookieManager.getCookieStore().getCookies().size() > 0) {
                    httpURLConnection.setRequestProperty("Cookie", TextUtils.join(C0249l.f1196b, cookieManager.getCookieStore().getCookies()));
                }
                httpURLConnection.setConnectTimeout(C0180b.f790j0);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("User-Agent", f945a);
                byte[] bArr = aVar.f949b;
                if (bArr == null || bArr.length <= 0) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", f946b);
                    httpURLConnection.setRequestProperty("Accept-Charset", C0233a.f1077D);
                    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Keep-Alive", "timeout=180, max=100");
                }
                Map map = aVar.f950c;
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
                        bufferedOutputStream.write(aVar.f949b);
                        bufferedOutputStream.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = null;
                        try {
                            C0244g.m1199a(th);
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
                    byte[] bArrM979a = m979a(bufferedInputStream);
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    String strJoin = (headerFields == null || headerFields.get(null) == null) ? null : TextUtils.join(",", headerFields.get(null));
                    List<String> list = headerFields.get("Set-Cookie");
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            List<HttpCookie> list2 = HttpCookie.parse(it.next());
                            if (list2 != null && !list2.isEmpty()) {
                                f947c.getCookieStore().add(url.toURI(), list2.get(0));
                            }
                        }
                    }
                    b bVar = new b(headerFields, strJoin, bArrM979a);
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
                    return bVar;
                } catch (Throwable th3) {
                    th = th3;
                    C0244g.m1199a(th);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
                bufferedOutputStream = null;
                C0244g.m1199a(th);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Proxy m980b(Context context) {
        String strM978a = m978a(context);
        if (strM978a != null && !strM978a.contains("wap")) {
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

    /* JADX INFO: renamed from: a */
    public static String m978a(Context context) {
        try {
            NetworkInfo networkInfoM449a = C0084b.m449a(null, context);
            if (networkInfoM449a != null && networkInfoM449a.isAvailable()) {
                return networkInfoM449a.getType() == 1 ? "wifi" : networkInfoM449a.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m979a(InputStream inputStream) throws IOException {
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
