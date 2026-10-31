package com.alipay.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import android.util.Log;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import l.C5368;
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

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements HttpClient {
    public static long a = 160;
    public static String[] b = {"text/", "application/xml", "application/json"};
    public static final HttpRequestInterceptor c = new c();
    public final HttpClient d;
    public RuntimeException e = new IllegalStateException("AndroidHttpClient created and never closed");
    public volatile C0000b f;

    /* JADX INFO: compiled from: N673 */
    public class a implements HttpRequestInterceptor {
        public a() {
        }

        public /* synthetic */ a(b bVar, c cVar) {
            this();
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            C0000b c0000b = b.this.f;
            if (c0000b != null && c0000b.a() && (httpRequest instanceof HttpUriRequest)) {
                c0000b.a(b.b((HttpUriRequest) httpRequest, false));
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: N673 */
    public class C0000b {
        public final String a;
        public final int b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return Log.isLoggable(this.a, this.b);
        }
    }

    public b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.d = new d(this, clientConnectionManager, httpParams);
    }

    public static long a(ContentResolver contentResolver) {
        return a;
    }

    public static b a(String str) {
        return a(str, (Context) null);
    }

    public static b a(String str, Context context) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, com.alipay.sdk.m.o.b.j0);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(com.alipay.sdk.m.n.a.s, PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(com.alipay.sdk.m.n.b.a, SSLCertificateSocketFactory.getHttpSocketFactory(30000, context == null ? null : new SSLSessionCache(context)), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", String.valueOf(-1));
        b();
        return new b(threadSafeClientConnManager, basicHttpParams);
    }

    public static InputStream a(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    public static AbstractHttpEntity a(byte[] bArr, ContentResolver contentResolver) throws IOException {
        if (bArr.length < a(contentResolver)) {
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

    public static void a(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    public static boolean a(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders(com.alipay.sdk.m.t.e.f);
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : b) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static long b(String str) {
        return k.a(str);
    }

    public static String b(HttpUriRequest httpUriRequest, boolean z) throws IOException {
        HttpEntity entity;
        String str;
        StringBuilder sbM15339 = C5368.m15339("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sbM15339.append("--header \"");
                sbM15339.append(header.toString().trim());
                sbM15339.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sbM15339.append("\"");
        sbM15339.append(uri);
        sbM15339.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (a(httpUriRequest)) {
                    sbM15339.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    str = " --data-binary @/tmp/$$.bin";
                } else {
                    String string = byteArrayOutputStream.toString();
                    sbM15339.append(" --data-ascii \"");
                    sbM15339.append(string);
                    sbM15339.append("\"");
                }
            } else {
                str = " [TOO MUCH DATA TO INCLUDE]";
            }
            sbM15339.append(str);
        }
        return sbM15339.toString();
    }

    public static void b() {
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
    }

    public static void b(HttpRequest httpRequest) {
        httpRequest.addHeader("Connection", "Keep-Alive");
    }

    public void a(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.d).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        return this.d.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        return this.d.execute(httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.d.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.d.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.d.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.d.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.d.execute(httpUriRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.d.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.d.getParams();
    }
}
