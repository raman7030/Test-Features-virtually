package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S737 */
/* JADX INFO: loaded from: classes.dex */
public final class C22794 implements InterfaceC2245 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f73599 = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+)");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73600;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C18621 f73601;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5861 f73602;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f73603;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InputStream f73604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC16687 f73605;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f73606;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m50881() {
        C22670 c22670;
        if (this.f73601 != null) {
            this.f73601.close();
            this.f73601 = null;
            this.f73604 = null;
        }
        InterfaceC16687 interfaceC16687 = this.f73605;
        this.f73605 = null;
        if (interfaceC16687 != null && (c22670 = this.f73602.f17982) != null) {
            c22670.m50661(interfaceC16687);
        }
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo7436() {
        return null;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC2245 mo7438(long j, long j2) {
        return C15649.m36840(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC2245 mo7440(long j, long j2) {
        return C15649.m36839(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo7441() {
        return false;
    }

    public C22794(C5861 c5861) {
        this.f73602 = c5861;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11506 m50883() {
        return this.f73602.f17988;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8743 m50874(C11749 c11749, long j, long j2, String str, String str2) {
        C9449 c9449 = new C9449();
        c9449.m24280(c11749);
        c9449.m24283("Range", "bytes=" + j + '-' + j2);
        c9449.m24283("Accept-Encoding", "identity");
        c9449.m24283("User-Agent", str2);
        if (str != null) {
            c9449.m24283("If-Range", str);
        }
        return c9449.m24274();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C22794(C17209 c17209, String str, final String str2, C11506 c11506, C22670 c22670) throws Throwable {
        C11749 c11749M28763;
        InterfaceC16687 interfaceC16687M40469;
        if (str2 == null) {
            throw new IOException("HTTP User-Agent is null");
        }
        if (!m50882(str2)) {
            throw new IOException("HTTP User-Agent contains an invalid character");
        }
        C17915 c17915M40470 = c17209.m40470();
        c17915M40470.m41905(new InterfaceC23037() { // from class: l.۫ۚ᩻
            @Override // l.InterfaceC23037
            /* JADX INFO: renamed from: ֫ */
            public final C18621 mo7384(C7855 c7855) {
                C9449 c9449M22618 = c7855.m21045().m22618();
                c9449M22618.m24283("User-Agent", str2);
                return c7855.m21036(c9449M22618.m24274());
            }
        });
        C17209 c17209M41894 = c17915M40470.m41894();
        if (c22670 != null) {
            c22670.m50660();
        }
        try {
            c11749M28763 = C11749.m28763(str);
        } catch (IllegalArgumentException unused) {
            c11749M28763 = null;
        }
        if (c11749M28763 == null) {
            throw new IOException(C20094.m46315("Invalid HTTP URL: ", str));
        }
        interfaceC16687M40469 = c17209M41894.m40469(m50874(c11749M28763, 0L, 0L, null, str2));
        if (c22670 != null) {
            c22670.m50659(interfaceC16687M40469);
        }
        try {
            C18621 c18621Execute = interfaceC16687M40469.execute();
            try {
                C10095 c10095M50875 = m50875(c18621Execute, 0L, 0L, -1L);
                AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
                try {
                    if (abstractC0275M43170 == null) {
                        throw new IOException("HTTP Range response has no body");
                    }
                    InputStream inputStreamM1611 = abstractC0275M43170.m1611();
                    try {
                        if (inputStreamM1611.read() == -1 || inputStreamM1611.read() != -1) {
                            try {
                                throw new IOException("HTTP Range probe returned an incorrect body length");
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    inputStreamM1611.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        inputStreamM1611.close();
                        String strM43169 = c18621Execute.m43169("ETag");
                        String strM431610 = c18621Execute.m43169("Last-Modified");
                        C11506 c11507 = new C11506(c10095M50875.f30397, strM43169, strM431610, null);
                        if (c11506 != null) {
                            C11506.m28330(c11506, c11507);
                        }
                        C5861 c5861 = new C5861(c17209M41894, c18621Execute.m43168().m22622(), c10095M50875.f30397, strM43169, strM431610, m50879(strM43169) ? strM43169 : strM431610, str2, c11507, c22670);
                        c18621Execute.close();
                        if (c22670 != null) {
                            c22670.m50661(interfaceC16687M40469);
                        }
                        this(c5861);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    Throwable th5 = th;
                    try {
                        c18621Execute.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
        if (c22670 != null) {
            c22670.m50661(interfaceC16687M40469);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m50882(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m50879(String str) {
        return (str == null || str.regionMatches(true, 0, "W/", 0, 2)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10095 m50875(C18621 c18621, long j, long j2, long j3) throws IOException {
        if (c18621.m43177() != 206) {
            throw new IOException("HTTP server did not return a partial response: " + c18621.m43177());
        }
        String strM43169 = c18621.m43169("Content-Encoding");
        if (strM43169 != null) {
            String lowerCase = strM43169.trim().toLowerCase(Locale.ROOT);
            if (!lowerCase.isEmpty() && !lowerCase.equals("identity") && !lowerCase.equals("utf-8") && !lowerCase.equals("utf8")) {
                throw new IOException("Unsupported HTTP content encoding: ".concat(strM43169));
            }
        }
        String strM431610 = c18621.m43169("Content-Range");
        Matcher matcher = strM431610 == null ? null : f73599.matcher(strM431610.trim());
        if (matcher == null || !matcher.matches()) {
            throw new IOException("Missing or invalid HTTP Content-Range");
        }
        try {
            long j4 = Long.parseLong(matcher.group(1));
            long j5 = Long.parseLong(matcher.group(2));
            long j6 = Long.parseLong(matcher.group(3));
            if (j4 != j || j5 != j2 || j6 <= j5 || (j3 >= 0 && j6 != j3)) {
                throw new IOException(C20094.m46315("Unexpected HTTP Content-Range: ", strM431610));
            }
            long j7 = (j5 - j4) + 1;
            AbstractC0275 abstractC0275M43170 = c18621.m43170();
            if (abstractC0275M43170 == null) {
                throw new IOException("HTTP Range response has no body");
            }
            long jMo1615 = abstractC0275M43170.mo1615();
            if (jMo1615 < 0 || jMo1615 == j7) {
                return new C10095(j6);
            }
            throw new IOException("HTTP Range response length mismatch");
        } catch (NumberFormatException e) {
            throw new IOException("Invalid HTTP Content-Range", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50877(C18621 c18621) throws IOException {
        String strM43169;
        C5861 c5861 = this.f73602;
        String str = c5861.f17986;
        String str2 = c5861.f17985;
        String str3 = c5861.f17986;
        if (m50879(str)) {
            String strM431610 = c18621.m43169("ETag");
            if (strM431610 != null && !str3.equals(strM431610)) {
                throw new IOException("Remote resource ETag changed during reading");
            }
            return;
        }
        if (str2 != null) {
            String strM431611 = c18621.m43169("Last-Modified");
            if (strM431611 != null && !str2.equals(strM431611)) {
                throw new IOException("Remote resource changed during reading");
            }
            return;
        }
        if (str3 != null && (strM43169 = c18621.m43169("ETag")) != null && !str3.equals(strM43169)) {
            throw new IOException("Remote resource ETag changed during reading");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m50880() throws IOException {
        if (this.f73600) {
            throw new IOException("Random access data is closed");
        }
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) throws IOException {
        m50880();
        if (j < 0 || j > this.f73602.f17990) {
            throw new IOException(C16014.m37865(j, "Seek position is outside the remote file: "));
        }
        if (j != this.f73603) {
            m50881();
            this.f73603 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.᩺ۚ᩻] */
    /* JADX WARN: Type inference failed for: r6v5, types: [long] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [l.ܽܰ᩵] */
    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        m50880();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f73603 >= this.f73602.f17990) {
            return -1;
        }
        InputStream inputStream = this.f73604;
        if (inputStream == null) {
            long j = this.f73602.f17990;
            long j2 = this.f73603;
            long jMin = Math.min(j - j2, 524288L) + j2;
            ?? r6 = jMin - 1;
            C5861 c5861 = this.f73602;
            InterfaceC16687 interfaceC16687M40469 = this.f73602.f17984.m40469(m50874(c5861.f17983, this.f73603, r6, c5861.f17987, c5861.f17989));
            this.f73605 = interfaceC16687M40469;
            C22670 c22670 = this.f73602.f17982;
            if (c22670 != null) {
                try {
                    c22670.m50659(interfaceC16687M40469);
                } catch (IOException e) {
                    this.f73605 = null;
                    throw e;
                }
            }
            if (this.f73600) {
                interfaceC16687M40469.cancel();
                m50876(interfaceC16687M40469);
                throw new IOException("Random access data is closed");
            }
            try {
                C18621 c18621Execute = interfaceC16687M40469.execute();
                try {
                    try {
                        if (this.f73600) {
                            throw new IOException("Random access data is closed");
                        }
                        m50875(c18621Execute, this.f73603, r6, this.f73602.f17990);
                        m50877(c18621Execute);
                        this.f73604 = c18621Execute.m43170().m1611();
                        this.f73601 = c18621Execute;
                        this.f73606 = jMin;
                        if (this.f73600) {
                            m50881();
                            throw new IOException("Random access data is closed");
                        }
                        inputStream = this.f73604;
                        if (inputStream == null) {
                            throw new IOException("HTTP Range response was closed");
                        }
                    } catch (IOException e2) {
                        e = e2;
                    } catch (RuntimeException e3) {
                        e = e3;
                    }
                } catch (IOException | RuntimeException e4) {
                    e = e4;
                    r6 = interfaceC16687M40469;
                }
                c18621Execute.close();
                m50876(r6);
                throw e;
            } catch (IOException | RuntimeException e5) {
                m50876(interfaceC16687M40469);
                throw e5;
            }
        }
        int iMin = (int) Math.min(i2, this.f73606 - this.f73603);
        int i3 = 0;
        while (i3 < iMin) {
            try {
                int i4 = inputStream.read(bArr, i + i3, iMin - i3);
                if (i4 == -1) {
                    throw new EOFException("HTTP Range response body is truncated");
                }
                if (i4 != 0) {
                    i3 += i4;
                }
            } catch (IOException | RuntimeException e6) {
                m50881();
                throw e6;
            }
        }
        long j3 = this.f73603 + ((long) i3);
        this.f73603 = j3;
        if (j3 == this.f73606) {
            m50881();
        }
        return i3;
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC2245
    public final long length() throws IOException {
        m50880();
        return this.f73602.f17990;
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC2245
    public final long position() throws IOException {
        m50880();
        return this.f73603;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܺ */
    public final void mo7439() throws IOException {
        m50880();
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return this.f73602.f17983.toString();
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2245 mo7437() throws IOException {
        m50880();
        return new C22794(this.f73602);
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f73600;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f73600) {
            return;
        }
        this.f73600 = true;
        InterfaceC16687 interfaceC16687 = this.f73605;
        if (interfaceC16687 != null) {
            interfaceC16687.cancel();
        }
        m50881();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50876(InterfaceC16687 interfaceC16687) {
        if (this.f73605 == interfaceC16687) {
            this.f73605 = null;
        }
        C22670 c22670 = this.f73602.f17982;
        if (c22670 != null) {
            c22670.m50661(interfaceC16687);
        }
    }
}
