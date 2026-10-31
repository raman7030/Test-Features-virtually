package l;

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
public final class C8236 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f25352;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f25353;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f25354;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC5414 f25355;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f25357;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25358;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC4003 f25360;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f25361;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f25362;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25363;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f25364 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map f25359 = new C19526(this);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f25356 = new HashMap();

    public C8236(InterfaceC5414 interfaceC5414, String str, InputStream inputStream, long j) {
        this.f25355 = interfaceC5414;
        this.f25354 = str;
        this.f25353 = inputStream;
        this.f25361 = j;
        this.f25362 = j < 0;
        this.f25363 = true;
        this.f25357 = "HTTP/1.1";
        this.f25358 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f25353;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21805(String str, String str2) {
        m21800(str, str2);
        if ("set-cookie".equalsIgnoreCase(str)) {
            this.f25364.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            this.f25356.put(str.toLowerCase(Locale.US), str2);
            return;
        }
        ((C19526) this.f25359).put(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21803() {
        ((C19526) this.f25359).put("connection", "close");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21812() {
        return "close".equals(m21802("connection"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21802(String str) {
        return (String) this.f25356.get(str.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m21810() {
        return this.f25354;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21808(String str) {
        this.f25357 = "HTTP/1.0".equals(str) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21809(boolean z) {
        this.f25352 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21807(boolean z) {
        this.f25363 = z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21811(boolean z) {
        this.f25358 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21804(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
        InterfaceC5414 interfaceC5414 = this.f25355;
        try {
            if (interfaceC5414 == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            boolean z = false;
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(LocalizedMessage.DEFAULT_ENCODING))), false);
            printWriter.append(this.f25357).append(" ").append(interfaceC5414.getDescription()).append(" \r\n");
            String str = this.f25354;
            if (str != null) {
                m21798(printWriter, "Content-Type", str);
            }
            if (m21802("date") == null) {
                m21798(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : ((HashMap) this.f25359).entrySet()) {
                m21798(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            for (Map.Entry entry2 : this.f25364) {
                m21798(printWriter, (String) entry2.getKey(), (String) entry2.getValue());
            }
            if (m21802("connection") == null) {
                m21798(printWriter, "Connection", this.f25358 ? "keep-alive" : "close");
            }
            int iMo3992 = interfaceC5414.mo3992();
            boolean z2 = this.f25360 == EnumC4003.HEAD;
            boolean z3 = (iMo3992 >= 100 && iMo3992 < 200) || iMo3992 == EnumC1180.NO_CONTENT.mo3992() || iMo3992 == EnumC1180.NOT_MODIFIED.mo3992();
            boolean z4 = z2 || z3;
            boolean z5 = iMo3992 == EnumC1180.PARTIAL_CONTENT.mo3992() || m21802("content-range") != null;
            boolean z6 = m21802("content-length") != null;
            boolean z7 = this.f25352 && this.f25363 && !z4 && !z5 && !z6 && m21802("content-encoding") == null;
            if (this.f25363 && !z4 && !z6 && (this.f25362 || z7)) {
                z = true;
            }
            if (z7) {
                m21798(printWriter, "Content-Encoding", "gzip");
            }
            InputStream inputStream = this.f25353;
            long jM21801 = inputStream != null ? this.f25361 : 0L;
            if (z) {
                m21798(printWriter, "Transfer-Encoding", "chunked");
            } else if (!z3 && (jM21801 >= 0 || z6)) {
                jM21801 = m21801(printWriter, jM21801);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (!z4) {
                if (z) {
                    C0474 c0474 = new C0474(outputStream);
                    if (z7) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c0474);
                        m21797(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        m21797(c0474, -1L);
                    }
                    c0474.finish();
                } else if (z7) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    m21797(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    m21797(outputStream, jM21801);
                }
            }
            outputStream.flush();
            AbstractC4708.m13790(inputStream);
        } catch (IOException e) {
            AbstractC4708.f14944.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21798(PrintWriter printWriter, String str, String str2) {
        m21800(str, str2);
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21800(String str, String str2) {
        if (str == null || !AbstractC4708.f14946.matcher(str).matches()) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m21801(PrintWriter printWriter, long j) {
        String strM21802 = m21802("content-length");
        if (strM21802 != null) {
            try {
                return Long.parseLong(strM21802);
            } catch (NumberFormatException unused) {
                AbstractC4708.f14944.severe("content-length was no number ".concat(strM21802));
                return j;
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21797(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int i = this.f25353.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (i <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i);
            if (!z) {
                j -= (long) i;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21806(EnumC4003 enumC4003) {
        this.f25360 = enumC4003;
    }
}
