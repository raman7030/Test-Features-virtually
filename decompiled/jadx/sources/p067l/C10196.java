package p067l;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.۠ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10196 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public boolean f28262;

    /* JADX INFO: renamed from: ۙ */
    public InputStream f28263;

    /* JADX INFO: renamed from: ۛ */
    public String f28264;

    /* JADX INFO: renamed from: ۟ */
    public InterfaceC7514 f28265;

    /* JADX INFO: renamed from: ۨ */
    public String f28267;

    /* JADX INFO: renamed from: ۫ */
    public boolean f28268;

    /* JADX INFO: renamed from: ܰ */
    public EnumC6173 f28270;

    /* JADX INFO: renamed from: ᩶ */
    public long f28271;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f28272;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f28273;

    /* JADX INFO: renamed from: ᩺ */
    public final ArrayList f28274 = new ArrayList();

    /* JADX INFO: renamed from: ۬ */
    public final Map f28269 = new C20926(this);

    /* JADX INFO: renamed from: ۤ */
    public final HashMap f28266 = new HashMap();

    public C10196(InterfaceC7514 interfaceC7514, String str, InputStream inputStream, long j) {
        this.f28265 = interfaceC7514;
        this.f28264 = str;
        this.f28263 = inputStream;
        this.f28271 = j;
        this.f28272 = j < 0;
        this.f28273 = true;
        this.f28267 = "HTTP/1.1";
        this.f28268 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f28263;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23774(String str, String str2) {
        m23769(str, str2);
        if ("set-cookie".equalsIgnoreCase(str)) {
            this.f28274.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            this.f28266.put(str.toLowerCase(Locale.US), str2);
            return;
        }
        ((C20926) this.f28269).put(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23772() {
        ((C20926) this.f28269).put("connection", "close");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m23781() {
        return "close".equals(m23771("connection"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m23771(String str) {
        return (String) this.f28266.get(str.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m23779() {
        return this.f28264;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23777(String str) {
        this.f28267 = "HTTP/1.0".equals(str) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23778(boolean z) {
        this.f28262 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23776(boolean z) {
        this.f28273 = z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23780(boolean z) {
        this.f28268 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23773(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C5468.getTimeZone("GMT"));
        InterfaceC7514 interfaceC7514 = this.f28265;
        try {
            if (interfaceC7514 == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            boolean z = false;
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(LocalizedMessage.DEFAULT_ENCODING))), false);
            printWriter.append(this.f28267).append(" ").append(interfaceC7514.getDescription()).append(" \r\n");
            String str = this.f28264;
            if (str != null) {
                m23767(printWriter, "Content-Type", str);
            }
            if (m23771("date") == null) {
                m23767(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : ((HashMap) this.f28269).entrySet()) {
                m23767(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            for (Map.Entry entry2 : this.f28274) {
                m23767(printWriter, (String) entry2.getKey(), (String) entry2.getValue());
            }
            if (m23771("connection") == null) {
                m23767(printWriter, "Connection", this.f28268 ? "keep-alive" : "close");
            }
            int iMo6234 = interfaceC7514.mo6234();
            boolean z2 = this.f28270 == EnumC6173.HEAD;
            boolean z3 = (iMo6234 >= 100 && iMo6234 < 200) || iMo6234 == EnumC3490.NO_CONTENT.mo6234() || iMo6234 == EnumC3490.NOT_MODIFIED.mo6234();
            boolean z4 = z2 || z3;
            boolean z5 = iMo6234 == EnumC3490.PARTIAL_CONTENT.mo6234() || m23771("content-range") != null;
            boolean z6 = m23771("content-length") != null;
            boolean z7 = this.f28262 && this.f28273 && !z4 && !z5 && !z6 && m23771("content-encoding") == null;
            if (this.f28273 && !z4 && !z6 && (this.f28272 || z7)) {
                z = true;
            }
            if (z7) {
                m23767(printWriter, "Content-Encoding", "gzip");
            }
            InputStream inputStream = this.f28263;
            long jM23770 = inputStream != null ? this.f28271 : 0L;
            if (z) {
                m23767(printWriter, "Transfer-Encoding", "chunked");
            } else if (!z3 && (jM23770 >= 0 || z6)) {
                jM23770 = m23770(printWriter, jM23770);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (!z4) {
                if (z) {
                    C2819 c2819 = new C2819(outputStream);
                    if (z7) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c2819);
                        m23766(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        m23766(c2819, -1L);
                    }
                    c2819.finish();
                } else if (z7) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    m23766(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    m23766(outputStream, jM23770);
                }
            }
            outputStream.flush();
            AbstractC6843.m15666(inputStream);
        } catch (IOException e) {
            AbstractC6843.f17774.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23767(PrintWriter printWriter, String str, String str2) {
        m23769(str, str2);
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23769(String str, String str2) {
        if (str == null || !AbstractC6843.f17776.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid HTTP header name");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Invalid HTTP header value");
        }
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if ((cCharAt < ' ' && cCharAt != '\t') || cCharAt == 127) {
                throw new IllegalArgumentException("Invalid HTTP header value");
            }
        }
        if ("content-length".equalsIgnoreCase(str)) {
            String strTrim = str2.trim();
            if (strTrim.isEmpty()) {
                throw new IllegalArgumentException("Invalid HTTP header value");
            }
            for (int i2 = 0; i2 < strTrim.length(); i2++) {
                char cCharAt2 = strTrim.charAt(i2);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    throw new IllegalArgumentException("Invalid HTTP header value");
                }
            }
            try {
                Long.parseLong(strTrim);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid HTTP header value", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m23770(PrintWriter printWriter, long j) {
        String strM23771 = m23771("content-length");
        if (strM23771 != null) {
            try {
                return Long.parseLong(strM23771);
            } catch (NumberFormatException unused) {
                AbstractC6843.f17774.severe("content-length was no number ".concat(strM23771));
                return j;
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23766(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int i = this.f28263.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (i <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i);
            if (!z) {
                j -= (long) i;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23775(EnumC6173 enumC6173) {
        this.f28270 = enumC6173;
    }
}
