package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.۟۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9341 extends AbstractC4648 implements InterfaceC22278 {

    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC15375 f25451;

    /* JADX INFO: renamed from: ۘ */
    public final C8866 f25452;

    /* JADX INFO: renamed from: ۜ */
    public HttpURLConnection f25453;

    /* JADX INFO: renamed from: ۡ */
    public InputStream f25454;

    /* JADX INFO: renamed from: ۢ */
    public final C8866 f25455;

    /* JADX INFO: renamed from: ܳ */
    public long f25456;

    /* JADX INFO: renamed from: ܺ */
    public final int f25457;

    /* JADX INFO: renamed from: ܿ */
    public long f25458;

    /* JADX INFO: renamed from: ᩴ */
    public int f25459;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f25460;

    /* JADX INFO: renamed from: ᩷ */
    public C5318 f25461;

    /* JADX INFO: renamed from: ᩻ */
    public final int f25462;

    public C9341(int i, int i2, C8866 c8866, C15574 c15574) {
        super(true);
        this.f25462 = i;
        this.f25457 = i2;
        this.f25455 = c8866;
        this.f25452 = new C8866();
        this.f25451 = c15574;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        HttpURLConnection httpURLConnection = this.f25453;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C5318 c5318 = this.f25461;
        if (c5318 != null) {
            return c5318.f12514;
        }
        return null;
    }

    @Override // p067l.InterfaceC22278
    /* JADX INFO: renamed from: ᩳ */
    public final int mo21671() {
        int i;
        if (this.f25453 == null || (i = this.f25459) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // p067l.AbstractC4648, p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        HttpURLConnection httpURLConnection = this.f25453;
        if (httpURLConnection == null) {
            return AbstractC11500.m26548of();
        }
        return new C24093(httpURLConnection.getHeaderFields());
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C18924 {
        byte[] bArrM45068;
        this.f25461 = c5318;
        long j = 0;
        this.f25458 = 0L;
        this.f25456 = 0L;
        m9837(c5318);
        try {
            HttpURLConnection httpURLConnectionM21669 = m21669(c5318);
            long j2 = c5318.f12521;
            long j3 = c5318.f12516;
            this.f25453 = httpURLConnectionM21669;
            this.f25459 = httpURLConnectionM21669.getResponseCode();
            httpURLConnectionM21669.getResponseMessage();
            int i = this.f25459;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM21669.getHeaderFields();
                if (this.f25459 == 416 && j2 == C11549.m26610(httpURLConnectionM21669.getHeaderField("Content-Range"))) {
                    this.f25460 = true;
                    m9839(c5318);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionM21669.getErrorStream();
                try {
                    bArrM45068 = errorStream != null ? C19824.m45068(errorStream) : C5792.f14227;
                } catch (IOException unused) {
                    bArrM45068 = C5792.f14227;
                }
                Uri uri = Uri.parse(httpURLConnectionM21669.getURL().toString());
                C24959 c24959 = new C24959(this.f25459, this.f25459 == 416 ? new C23423(2008) : null, headerFields, bArrM45068, uri);
                m21670();
                throw c24959;
            }
            httpURLConnectionM21669.getContentType();
            if (this.f25459 == 200 && j2 != 0) {
                j = j2;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM21669.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.f25456 = j3;
            } else {
                long jM26611 = C11549.m26611(httpURLConnectionM21669.getHeaderField("Content-Length"), httpURLConnectionM21669.getHeaderField("Content-Range"));
                this.f25456 = jM26611 != -1 ? jM26611 - j : -1L;
            }
            try {
                this.f25454 = httpURLConnectionM21669.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f25454 = new GZIPInputStream(this.f25454);
                }
                this.f25460 = true;
                m9839(c5318);
                try {
                    m21668(j);
                    return this.f25456;
                } catch (IOException e) {
                    m21670();
                    if (e instanceof C18924) {
                        throw ((C18924) e);
                    }
                    throw new C18924(e, 2000, 1);
                }
            } catch (IOException e2) {
                m21670();
                throw new C18924(e2, 2000, 1);
            }
        } catch (IOException e3) {
            m21670();
            throw C18924.m43022(e3, 1);
        }
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        try {
            InputStream inputStream = this.f25454;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = C5792.f14228;
                    throw new C18924(e, 2000, 3);
                }
            }
            this.f25454 = null;
            m21670();
            if (this.f25460) {
                this.f25460 = false;
                m9838();
            }
            this.f25453 = null;
            this.f25461 = null;
        } catch (Throwable th) {
            this.f25454 = null;
            m21670();
            if (this.f25460) {
                this.f25460 = false;
                m9838();
            }
            this.f25453 = null;
            this.f25461 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private HttpURLConnection m21669(C5318 c5318) throws IOException {
        C5318 c5319 = c5318;
        URL url = new URL(c5319.f12514.toString());
        int i = c5319.f12517;
        byte[] bArr = c5319.f12515;
        long j = c5319.f12521;
        long j2 = c5319.f12516;
        int i2 = 0;
        boolean z = (c5319.f12513 & 1) == 1;
        if (this.f25451 == null) {
            return m21666(url, i, bArr, j, j2, z, true, c5319.f12519);
        }
        URL urlM21667 = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        int i4 = 1;
        while (true) {
            int i5 = i2 + 1;
            if (i2 > 20) {
                throw new C18924(new NoRouteToHostException(C20778.m46922(i5, "Too many redirects: ")), 2001, 1);
            }
            Map map = c5319.f12519;
            long j3 = j;
            long j4 = j;
            int i6 = i3;
            int i7 = i4;
            URL url2 = urlM21667;
            long j5 = j2;
            HttpURLConnection httpURLConnectionM21666 = m21666(urlM21667, i3, bArr2, j3, j2, z, false, map);
            int responseCode = httpURLConnectionM21666.getResponseCode();
            String headerField = httpURLConnectionM21666.getHeaderField("Location");
            if ((i6 == i7 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM21666.disconnect();
                urlM21667 = m21667(url2, headerField);
                i3 = i6;
            } else {
                if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM21666;
                }
                httpURLConnectionM21666.disconnect();
                urlM21667 = m21667(url2, headerField);
                bArr2 = null;
                i3 = 1;
            }
            i4 = 1;
            c5319 = c5318;
            j = j4;
            i2 = i5;
            j2 = j5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private HttpURLConnection m21666(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f25462);
        httpURLConnection.setReadTimeout(this.f25457);
        InterfaceC15375 interfaceC15375 = this.f25451;
        AbstractMap map2 = interfaceC15375 == null ? new HashMap() : new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C8866 c8866 = this.f25455;
        if (c8866 != null) {
            map2.putAll(c8866.m20470());
        }
        map2.putAll(this.f25452.m20470());
        map2.putAll(map);
        Map mapM35423 = map2;
        if (interfaceC15375 != null) {
            mapM35423 = ((C15574) interfaceC15375).m35423(url, map2);
        }
        for (Map.Entry entry : mapM35423.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i2 = C11549.f32204;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbM33191 = C14536.m33191("bytes=", "-", j);
            if (j2 != -1) {
                sbM33191.append((j + j2) - 1);
            }
            string = sbM33191.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i3 = C5318.f12512;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ֫ */
    private URL m21667(URL url, String str) throws C18924 {
        if (str == null) {
            throw new C18924("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!C0171b.f688a.equals(protocol) && !C0170a.f680s.equals(protocol)) {
                throw new C18924(C21466.m48631("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C18924("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + MotionUtils.EASING_TYPE_FORMAT_END, 2001);
        } catch (MalformedURLException e) {
            throw new C18924(e, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21668(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f25454;
            String str = C5792.f14228;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C18924(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new C18924();
            }
            j -= (long) i;
            m9840(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws C18924 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f25456;
            if (j != -1) {
                long j2 = j - this.f25458;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f25454;
                    String str = C5792.f14228;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f25458 += (long) i3;
                        m9840(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f25454;
                String str2 = C5792.f14228;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f25458 += (long) i3;
                    m9840(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = C5792.f14228;
            throw C18924.m43022(e, 2);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m21670() {
        HttpURLConnection httpURLConnection = this.f25453;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C21334.m48348("Unexpected error while disconnecting", e);
            }
        }
    }
}
