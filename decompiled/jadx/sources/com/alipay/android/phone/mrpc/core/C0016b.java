package com.alipay.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import android.util.Log;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import p067l.C7470;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0016b implements HttpClient {

    /* JADX INFO: renamed from: a */
    public static long f91a = 160;

    /* JADX INFO: renamed from: b */
    public static String[] f92b = {"text/", "application/xml", "application/json"};

    /* JADX INFO: renamed from: c */
    public static final HttpRequestInterceptor f93c = new C0017c();

    /* JADX INFO: renamed from: d */
    public final HttpClient f94d;

    /* JADX INFO: renamed from: e */
    public RuntimeException f95e = new IllegalStateException("AndroidHttpClient created and never closed");

    /* JADX INFO: renamed from: f */
    public volatile b f96f;

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements HttpRequestInterceptor {
        public a() {
        }

        public /* synthetic */ a(C0016b c0016b, C0017c c0017c) {
            this();
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            b bVar = C0016b.this.f96f;
            if (bVar != null && bVar.m183a() && (httpRequest instanceof HttpUriRequest)) {
                bVar.m182a(C0016b.m177b((HttpUriRequest) httpRequest, false));
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b$b */
    /* JADX INFO: compiled from: N673 */
    public class b {

        /* JADX INFO: renamed from: a */
        public final String f98a;

        /* JADX INFO: renamed from: b */
        public final int f99b;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m182a(String str) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public boolean m183a() {
            return Log.isLoggable(this.f98a, this.f99b);
        }
    }

    public C0016b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f94d = new C0018d(this, clientConnectionManager, httpParams);
    }

    /* JADX INFO: renamed from: a */
    public static long m166a(ContentResolver contentResolver) {
        return f91a;
    }

    /* JADX INFO: renamed from: a */
    public static C0016b m168a(String str) {
        return m169a(str, (Context) null);
    }

    /* JADX INFO: renamed from: a */
    public static C0016b m169a(String str, Context context) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, C0180b.f790j0);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(C0170a.f680s, PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(C0171b.f688a, SSLCertificateSocketFactory.getHttpSocketFactory(30000, context == null ? null : new SSLSessionCache(context)), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", String.valueOf(-1));
        m178b();
        return new C0016b(threadSafeClientConnManager, basicHttpParams);
    }

    /* JADX INFO: renamed from: a */
    public static InputStream m170a(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractHttpEntity m173a(byte[] bArr, ContentResolver contentResolver) throws IOException {
        if (bArr.length < m166a(contentResolver)) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        byteArrayEntity.getContentLength();
        return byteArrayEntity;
    }

    /* JADX INFO: renamed from: a */
    public static void m174a(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m175a(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders(AbstractC0213e.f982f);
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : f92b) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static long m176b(String str) {
        return C0025k.m197a(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m177b(HttpUriRequest httpUriRequest, boolean z) throws IOException {
        HttpEntity entity;
        String str;
        StringBuilder sbM17248 = C7470.m17248("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sbM17248.append("--header \"");
                sbM17248.append(header.toString().trim());
                sbM17248.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sbM17248.append("\"");
        sbM17248.append(uri);
        sbM17248.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (m175a(httpUriRequest)) {
                    sbM17248.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    str = " --data-binary @/tmp/$$.bin";
                } else {
                    String string = byteArrayOutputStream.toString();
                    sbM17248.append(" --data-ascii \"");
                    sbM17248.append(string);
                    sbM17248.append("\"");
                }
            } else {
                str = " [TOO MUCH DATA TO INCLUDE]";
            }
            sbM17248.append(str);
        }
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m178b() {
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
    }

    /* JADX INFO: renamed from: b */
    public static void m179b(HttpRequest httpRequest) {
        httpRequest.addHeader("Connection", "Keep-Alive");
    }

    /* JADX INFO: renamed from: a */
    public void m180a(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.f94d).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        return this.f94d.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.f94d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        return this.f94d.execute(httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.f94d.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f94d.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f94d.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f94d.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f94d.execute(httpUriRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.f94d.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.f94d.getParams();
    }
}
