package com.alipay.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.q */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class CallableC0031q implements Callable {

    /* JADX INFO: renamed from: e */
    public static final HttpRequestRetryHandler f137e = new C0015af();

    /* JADX INFO: renamed from: a */
    public C0026l f138a;

    /* JADX INFO: renamed from: b */
    public Context f139b;

    /* JADX INFO: renamed from: c */
    public C0029o f140c;

    /* JADX INFO: renamed from: d */
    public String f141d;

    /* JADX INFO: renamed from: f */
    public HttpUriRequest f142f;

    /* JADX INFO: renamed from: i */
    public CookieManager f145i;

    /* JADX INFO: renamed from: j */
    public AbstractHttpEntity f146j;

    /* JADX INFO: renamed from: k */
    public HttpHost f147k;

    /* JADX INFO: renamed from: l */
    public URL f148l;

    /* JADX INFO: renamed from: q */
    public String f153q;

    /* JADX INFO: renamed from: g */
    public HttpContext f143g = new BasicHttpContext();

    /* JADX INFO: renamed from: h */
    public CookieStore f144h = new BasicCookieStore();

    /* JADX INFO: renamed from: m */
    public int f149m = 0;

    /* JADX INFO: renamed from: n */
    public boolean f150n = false;

    /* JADX INFO: renamed from: o */
    public boolean f151o = false;

    /* JADX INFO: renamed from: p */
    public String f152p = null;

    public CallableC0031q(C0026l c0026l, C0029o c0029o) {
        this.f138a = c0026l;
        this.f139b = c0026l.f115a;
        this.f140c = c0029o;
    }

    /* JADX INFO: renamed from: f */
    private HttpUriRequest m229f() {
        HttpUriRequest httpUriRequest = this.f142f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity abstractHttpEntityM252b = m252b();
        if (abstractHttpEntityM252b != null) {
            HttpPost httpPost = new HttpPost(m246a());
            httpPost.setEntity(abstractHttpEntityM252b);
            this.f142f = httpPost;
        } else {
            this.f142f = new HttpGet(m246a());
        }
        return this.f142f;
    }

    /* JADX INFO: renamed from: g */
    private void m230g() {
        HttpUriRequest httpUriRequest = this.f142f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC0014ae m231h() {
        return this.f140c.m261f();
    }

    /* JADX INFO: renamed from: i */
    private HttpResponse m232i() {
        return m233j();
    }

    /* JADX INFO: renamed from: j */
    private HttpResponse m233j() {
        m234k();
        this.f142f.getURI().toString();
        m235l().getParams().setParameter("http.route.default-proxy", m240q());
        HttpHost httpHostM237n = m237n();
        if (m238o() == 80) {
            httpHostM237n = new HttpHost(m239p().getHost());
        }
        return m235l().execute(httpHostM237n, this.f142f, this.f143g);
    }

    /* JADX INFO: renamed from: k */
    private String m234k() {
        if (!TextUtils.isEmpty(this.f153q)) {
            return this.f153q;
        }
        String strM220b = this.f140c.m220b("operationType");
        this.f153q = strM220b;
        return strM220b;
    }

    /* JADX INFO: renamed from: l */
    private C0016b m235l() {
        return this.f138a.m206a();
    }

    /* JADX INFO: renamed from: m */
    private void m236m() {
        ArrayList arrayListM253c = m253c();
        if (arrayListM253c != null && !arrayListM253c.isEmpty()) {
            Iterator it = arrayListM253c.iterator();
            while (it.hasNext()) {
                m229f().addHeader((Header) it.next());
            }
        }
        C0016b.m174a((HttpRequest) m229f());
        C0016b.m179b(m229f());
        m229f().addHeader("cookie", m241r().getCookie(this.f140c.m214a()));
    }

    /* JADX INFO: renamed from: n */
    private HttpHost m237n() {
        HttpHost httpHost = this.f147k;
        if (httpHost != null) {
            return httpHost;
        }
        URL urlM239p = m239p();
        HttpHost httpHost2 = new HttpHost(urlM239p.getHost(), m238o(), urlM239p.getProtocol());
        this.f147k = httpHost2;
        return httpHost2;
    }

    /* JADX INFO: renamed from: o */
    private int m238o() {
        URL urlM239p = m239p();
        return urlM239p.getPort() == -1 ? urlM239p.getDefaultPort() : urlM239p.getPort();
    }

    /* JADX INFO: renamed from: p */
    private URL m239p() {
        URL url = this.f148l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f140c.m214a());
        this.f148l = url2;
        return url2;
    }

    /* JADX INFO: renamed from: q */
    private HttpHost m240q() {
        HttpHost httpHostM258a = C0034t.m258a(this.f139b);
        if (httpHostM258a != null && TextUtils.equals(httpHostM258a.getHostName(), "127.0.0.1") && httpHostM258a.getPort() == 8087) {
            return null;
        }
        return httpHostM258a;
    }

    /* JADX INFO: renamed from: r */
    private CookieManager m241r() {
        CookieManager cookieManager = this.f145i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f145i = cookieManager2;
        return cookieManager2;
    }

    /* JADX INFO: renamed from: a */
    public long m242a(String[] strArr) {
        String str;
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && (str = strArr[i + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public HttpUrlHeader m243a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    /* JADX INFO: renamed from: a */
    public C0036v m244a(HttpResponse httpResponse, int i, String str) throws Throwable {
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
            }
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                m249a(entity, 0L, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.f151o = false;
                this.f138a.m212c(System.currentTimeMillis() - jCurrentTimeMillis);
                this.f138a.m208a(byteArray.length);
                C0030p c0030p = new C0030p(m243a(httpResponse), i, str, byteArray);
                m248a(c0030p, httpResponse);
                try {
                    byteArrayOutputStream2.close();
                    return c0030p;
                } catch (IOException e) {
                    throw new RuntimeException("ArrayOutputStream close error!", e.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0036v m245a(HttpResponse httpResponse, C0029o c0029o) throws HttpException {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode == 200 || m250a(statusCode, reasonPhrase)) {
            return m244a(httpResponse, statusCode, reasonPhrase);
        }
        throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
    }

    /* JADX INFO: renamed from: a */
    public URI m246a() {
        String strM214a = this.f140c.m214a();
        String str = this.f141d;
        if (str != null) {
            strM214a = str;
        }
        if (strM214a != null) {
            return new URI(strM214a);
        }
        throw new RuntimeException("url should not be null");
    }

    /* JADX INFO: renamed from: a */
    public HashMap m247a(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split(C0249l.f1196b)) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public void m248a(C0030p c0030p, HttpResponse httpResponse) {
        String str;
        String str2;
        long jM251b = m251b(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        if (contentType != null) {
            HashMap mapM247a = m247a(contentType.getValue());
            str = (String) mapM247a.get("charset");
            str2 = (String) mapM247a.get("Content-Type");
        } else {
            str = null;
            str2 = null;
        }
        c0030p.m264b(str2);
        c0030p.m227a(str);
        c0030p.m226a(System.currentTimeMillis());
        c0030p.m228b(jM251b);
    }

    /* JADX INFO: renamed from: a */
    public void m249a(HttpEntity httpEntity, long j, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            httpEntity.consumeContent();
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream inputStreamM170a = C0016b.m170a(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i = inputStreamM170a.read(bArr);
                    if (i == -1 || this.f140c.m263h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                    j += (long) i;
                    if (m231h() != null && contentLength > 0) {
                        m231h().m162a(this.f140c, j / contentLength);
                    }
                }
                outputStream.flush();
                C0032r.m256a(inputStreamM170a);
            } catch (Exception e) {
                e.getCause();
                throw new IOException("HttpWorker Request Error!" + e.getLocalizedMessage());
            }
        } catch (Throwable th) {
            C0032r.m256a(inputStreamM170a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m250a(int i, String str) {
        return i == 304;
    }

    /* JADX INFO: renamed from: b */
    public long m251b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split("=");
            if (strArrSplit.length >= 2) {
                try {
                    return m242a(strArrSplit);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return C0016b.m176b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public AbstractHttpEntity m252b() {
        AbstractHttpEntity abstractHttpEntity = this.f146j;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] bArrM221b = this.f140c.m221b();
        String strM220b = this.f140c.m220b("gzip");
        if (bArrM221b != null) {
            if (TextUtils.equals(strM220b, "true")) {
                this.f146j = C0016b.m173a(bArrM221b, (ContentResolver) null);
            } else {
                this.f146j = new ByteArrayEntity(bArrM221b);
            }
            this.f146j.setContentType(this.f140c.m222c());
        }
        return this.f146j;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList m253c() {
        return this.f140c.m223d();
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0036v call() throws HttpException {
        try {
            if (!C0034t.m260c(this.f139b)) {
                throw new HttpException(1, "The network is not available");
            }
            if (m231h() != null) {
                m231h().m165b(this.f140c);
            }
            m236m();
            this.f143g.setAttribute("http.cookie-store", this.f144h);
            m235l().m180a(f137e);
            long jCurrentTimeMillis = System.currentTimeMillis();
            HttpResponse httpResponseM232i = m232i();
            this.f138a.m210b(System.currentTimeMillis() - jCurrentTimeMillis);
            List<Cookie> cookies = this.f144h.getCookies();
            if (this.f140c.m224e()) {
                m241r().removeAllCookie();
            }
            if (!cookies.isEmpty()) {
                for (Cookie cookie : cookies) {
                    if (cookie.getDomain() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(cookie.getName());
                        sb.append("=");
                        sb.append(cookie.getValue());
                        sb.append("; domain=");
                        sb.append(cookie.getDomain());
                        sb.append(cookie.isSecure() ? "; Secure" : "");
                        m241r().setCookie(this.f140c.m214a(), sb.toString());
                        CookieSyncManager.getInstance().sync();
                    }
                }
            }
            C0036v c0036vM245a = m245a(httpResponseM232i, this.f140c);
            if (((c0036vM245a == null || c0036vM245a.m265b() == null) ? -1L : c0036vM245a.m265b().length) == -1 && (c0036vM245a instanceof C0030p)) {
                try {
                    Long.parseLong(((C0030p) c0036vM245a).m225a().getHead("Content-Length"));
                } catch (Exception unused) {
                }
            }
            if (this.f140c.m214a() != null && !TextUtils.isEmpty(m234k())) {
                m234k();
            }
            return c0036vM245a;
        } catch (HttpException e) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, e.getCode(), e.getMsg());
            }
            e.toString();
            throw e;
        } catch (NullPointerException e2) {
            m230g();
            int i = this.f149m;
            if (i < 1) {
                this.f149m = i + 1;
                return call();
            }
            e2.toString();
            throw new HttpException(0, e2 + "");
        } catch (SocketTimeoutException e3) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 4, e3 + "");
            }
            e3.toString();
            throw new HttpException(4, e3 + "");
        } catch (URISyntaxException e4) {
            throw new RuntimeException("Url parser error!", e4.getCause());
        } catch (UnknownHostException e5) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 9, e5 + "");
            }
            e5.toString();
            throw new HttpException(9, e5 + "");
        } catch (SSLHandshakeException e6) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 2, e6 + "");
            }
            e6.toString();
            throw new HttpException(2, e6 + "");
        } catch (SSLPeerUnverifiedException e7) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 2, e7 + "");
            }
            e7.toString();
            throw new HttpException(2, e7 + "");
        } catch (SSLException e8) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 6, e8 + "");
            }
            e8.toString();
            throw new HttpException(6, e8 + "");
        } catch (NoHttpResponseException e9) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 5, e9 + "");
            }
            e9.toString();
            throw new HttpException(5, e9 + "");
        } catch (ConnectionPoolTimeoutException e10) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 3, e10 + "");
            }
            e10.toString();
            throw new HttpException(3, e10 + "");
        } catch (ConnectTimeoutException e11) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 3, e11 + "");
            }
            e11.toString();
            throw new HttpException(3, e11 + "");
        } catch (HttpHostConnectException e12) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 8, e12 + "");
            }
            throw new HttpException(8, e12 + "");
        } catch (IOException e13) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 6, e13 + "");
            }
            e13.toString();
            throw new HttpException(6, e13 + "");
        } catch (Exception e14) {
            m230g();
            if (m231h() != null) {
                m231h().m163a(this.f140c, 0, e14 + "");
            }
            throw new HttpException(0, e14 + "");
        }
    }

    /* JADX INFO: renamed from: e */
    public C0029o m255e() {
        return this.f140c;
    }
}
