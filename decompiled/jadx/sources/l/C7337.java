package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
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
public final class C7337 extends AbstractC2399 implements InterfaceC20949 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13686 f22538;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6837 f22539;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HttpURLConnection f22540;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InputStream f22541;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C6837 f22542;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f22543;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f22544;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f22545;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f22546;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f22547;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3104 f22548;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f22549;

    public C7337(int i, int i2, C6837 c6837, C13895 c13895) {
        super(true);
        this.f22549 = i;
        this.f22544 = i2;
        this.f22542 = c6837;
        this.f22539 = new C6837();
        this.f22538 = c13895;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        HttpURLConnection httpURLConnection = this.f22540;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C3104 c3104 = this.f22548;
        if (c3104 != null) {
            return c3104.f9711;
        }
        return null;
    }

    @Override // l.InterfaceC20949
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo19698() {
        int i;
        if (this.f22540 == null || (i = this.f22546) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // l.AbstractC2399, l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        HttpURLConnection httpURLConnection = this.f22540;
        if (httpURLConnection == null) {
            return AbstractC9608.of();
        }
        return new C22859(httpURLConnection.getHeaderFields());
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws C17420 {
        byte[] bArrM42796;
        this.f22548 = c3104;
        long j = 0;
        this.f22545 = 0L;
        this.f22543 = 0L;
        m7774(c3104);
        try {
            HttpURLConnection httpURLConnectionM19696 = m19696(c3104);
            long j2 = c3104.f9718;
            long j3 = c3104.f9713;
            this.f22540 = httpURLConnectionM19696;
            this.f22546 = httpURLConnectionM19696.getResponseCode();
            httpURLConnectionM19696.getResponseMessage();
            int i = this.f22546;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM19696.getHeaderFields();
                if (this.f22546 == 416 && j2 == C9660.m24596(httpURLConnectionM19696.getHeaderField("Content-Range"))) {
                    this.f22547 = true;
                    m7776(c3104);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionM19696.getErrorStream();
                try {
                    bArrM42796 = errorStream != null ? C18366.m42796(errorStream) : C3603.f11423;
                } catch (IOException unused) {
                    bArrM42796 = C3603.f11423;
                }
                Uri uri = Uri.parse(httpURLConnectionM19696.getURL().toString());
                C23770 c23770 = new C23770(this.f22546, this.f22546 == 416 ? new C22154(2008) : null, headerFields, bArrM42796, uri);
                m19697();
                throw c23770;
            }
            httpURLConnectionM19696.getContentType();
            if (this.f22546 == 200 && j2 != 0) {
                j = j2;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM19696.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.f22543 = j3;
            } else {
                long jM24597 = C9660.m24597(httpURLConnectionM19696.getHeaderField("Content-Length"), httpURLConnectionM19696.getHeaderField("Content-Range"));
                this.f22543 = jM24597 != -1 ? jM24597 - j : -1L;
            }
            try {
                this.f22541 = httpURLConnectionM19696.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f22541 = new GZIPInputStream(this.f22541);
                }
                this.f22547 = true;
                m7776(c3104);
                try {
                    m19695(j);
                    return this.f22543;
                } catch (IOException e) {
                    m19697();
                    if (e instanceof C17420) {
                        throw ((C17420) e);
                    }
                    throw new C17420(e, 2000, 1);
                }
            } catch (IOException e2) {
                m19697();
                throw new C17420(e2, 2000, 1);
            }
        } catch (IOException e3) {
            m19697();
            throw C17420.m40765(e3, 1);
        }
    }

    @Override // l.InterfaceC21449
    public final void close() {
        try {
            InputStream inputStream = this.f22541;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = C3603.f11424;
                    throw new C17420(e, 2000, 3);
                }
            }
            this.f22541 = null;
            m19697();
            if (this.f22547) {
                this.f22547 = false;
                m7775();
            }
            this.f22540 = null;
            this.f22548 = null;
        } catch (Throwable th) {
            this.f22541 = null;
            m19697();
            if (this.f22547) {
                this.f22547 = false;
                m7775();
            }
            this.f22540 = null;
            this.f22548 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private HttpURLConnection m19696(C3104 c3104) throws IOException {
        C3104 c3105 = c3104;
        URL url = new URL(c3105.f9711.toString());
        int i = c3105.f9714;
        byte[] bArr = c3105.f9712;
        long j = c3105.f9718;
        long j2 = c3105.f9713;
        int i2 = 0;
        boolean z = (c3105.f9710 & 1) == 1;
        if (this.f22538 == null) {
            return m19693(url, i, bArr, j, j2, z, true, c3105.f9716);
        }
        URL urlM19694 = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        int i4 = 1;
        while (true) {
            int i5 = i2 + 1;
            if (i2 > 20) {
                throw new C17420(new NoRouteToHostException(C19370.m44628(i5, "Too many redirects: ")), 2001, 1);
            }
            Map map = c3105.f9716;
            long j3 = j;
            long j4 = j;
            int i6 = i3;
            int i7 = i4;
            URL url2 = urlM19694;
            long j5 = j2;
            HttpURLConnection httpURLConnectionM19693 = m19693(urlM19694, i3, bArr2, j3, j2, z, false, map);
            int responseCode = httpURLConnectionM19693.getResponseCode();
            String headerField = httpURLConnectionM19693.getHeaderField("Location");
            if ((i6 == i7 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM19693.disconnect();
                urlM19694 = m19694(url2, headerField);
                i3 = i6;
            } else {
                if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM19693;
                }
                httpURLConnectionM19693.disconnect();
                urlM19694 = m19694(url2, headerField);
                bArr2 = null;
                i3 = 1;
            }
            i4 = 1;
            c3105 = c3104;
            j = j4;
            i2 = i5;
            j2 = j5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HttpURLConnection m19693(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f22549);
        httpURLConnection.setReadTimeout(this.f22544);
        InterfaceC13686 interfaceC13686 = this.f22538;
        AbstractMap map2 = interfaceC13686 == null ? new HashMap() : new TreeMap(String.CASE_INSENSITIVE_ORDER);
        C6837 c6837 = this.f22542;
        if (c6837 != null) {
            map2.putAll(c6837.m18521());
        }
        map2.putAll(this.f22539.m18521());
        map2.putAll(map);
        Map mapM33304 = map2;
        if (interfaceC13686 != null) {
            mapM33304 = ((C13895) interfaceC13686).m33304(url, map2);
        }
        for (Map.Entry entry : mapM33304.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i2 = C9660.f29255;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbM31106 = C12803.m31106("bytes=", "-", j);
            if (j2 != -1) {
                sbM31106.append((j + j2) - 1);
            }
            string = sbM31106.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i3 = C3104.f9709;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private URL m19694(URL url, String str) throws C17420 {
        if (str == null) {
            throw new C17420("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!b.a.equals(protocol) && !a.s.equals(protocol)) {
                throw new C17420(C20094.m46315("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C17420("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + MotionUtils.EASING_TYPE_FORMAT_END, 2001);
        } catch (MalformedURLException e) {
            throw new C17420(e, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19695(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.f22541;
            String str = C3603.f11424;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C17420(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new C17420();
            }
            j -= (long) i;
            m7777(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws C17420 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f22543;
            if (j != -1) {
                long j2 = j - this.f22545;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f22541;
                    String str = C3603.f11424;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f22545 += (long) i3;
                        m7777(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f22541;
                String str2 = C3603.f11424;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f22545 += (long) i3;
                    m7777(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = C3603.f11424;
            throw C17420.m40765(e, 2);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m19697() {
        HttpURLConnection httpURLConnection = this.f22540;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C19956.m46034("Unexpected error while disconnecting", e);
            }
        }
    }
}
