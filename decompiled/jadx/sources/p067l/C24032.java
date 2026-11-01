package p067l;

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
public final class C24032 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ۤ */
    public static final Pattern f76329 = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+)");

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f76330;

    /* JADX INFO: renamed from: ۙ */
    public volatile C20066 f76331;

    /* JADX INFO: renamed from: ۫ */
    public final C7939 f76332;

    /* JADX INFO: renamed from: ۬ */
    public long f76333;

    /* JADX INFO: renamed from: ᩶ */
    public volatile InputStream f76334;

    /* JADX INFO: renamed from: ᩸ */
    public volatile InterfaceC18228 f76335;

    /* JADX INFO: renamed from: ᩹ */
    public long f76336;

    /* JADX INFO: renamed from: ᩳ */
    private synchronized void m53271() {
        C23914 c23914;
        if (this.f76331 != null) {
            this.f76331.close();
            this.f76331 = null;
            this.f76334 = null;
        }
        InterfaceC18228 interfaceC18228 = this.f76335;
        this.f76335 = null;
        if (interfaceC18228 != null && (c23914 = this.f76332.f20835) != null) {
            c23914.m52987(interfaceC18228);
        }
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo9518() {
        return null;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC4502 mo9520(long j, long j2) {
        return C17241.m39006(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC4502 mo9522(long j, long j2) {
        return C17241.m39005(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo9523() {
        return false;
    }

    public C24032(C7939 c7939) {
        this.f76332 = c7939;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13304 m53273() {
        return this.f76332.f20841;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10678 m53264(C13535 c13535, long j, long j2, String str, String str2) {
        C11349 c11349 = new C11349();
        c11349.m26290(c13535);
        c11349.m26293("Range", "bytes=" + j + '-' + j2);
        c11349.m26293("Accept-Encoding", "identity");
        c11349.m26293("User-Agent", str2);
        if (str != null) {
            c11349.m26293("If-Range", str);
        }
        return c11349.m26284();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24032(C18724 c18724, String str, final String str2, C13304 c13304, C23914 c23914) throws Throwable {
        C13535 c13535M30810;
        InterfaceC18228 interfaceC18228M42716;
        if (str2 == null) {
            throw new IOException("HTTP User-Agent is null");
        }
        if (!m53272(str2)) {
            throw new IOException("HTTP User-Agent contains an invalid character");
        }
        C19395 c19395M42717 = c18724.m42717();
        c19395M42717.m44154(new InterfaceC24263() { // from class: l.۫ۚ᩻
            @Override // p067l.InterfaceC24263
            /* JADX INFO: renamed from: ֫ */
            public final C20066 mo9467(C9833 c9833) {
                C11349 c11349M24587 = c9833.m23010().m24587();
                c11349M24587.m26293("User-Agent", str2);
                return c9833.m23001(c11349M24587.m26284());
            }
        });
        C18724 c18724M44143 = c19395M42717.m44143();
        if (c23914 != null) {
            c23914.m52986();
        }
        try {
            c13535M30810 = C13535.m30810(str);
        } catch (IllegalArgumentException unused) {
            c13535M30810 = null;
        }
        if (c13535M30810 == null) {
            throw new IOException(C21466.m48631("Invalid HTTP URL: ", str));
        }
        interfaceC18228M42716 = c18724M44143.m42716(m53264(c13535M30810, 0L, 0L, null, str2));
        if (c23914 != null) {
            c23914.m52985(interfaceC18228M42716);
        }
        try {
            C20066 c20066Execute = interfaceC18228M42716.execute();
            try {
                C11963 c11963M53265 = m53265(c20066Execute, 0L, 0L, -1L);
                AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
                try {
                    if (abstractC2630M45436 == null) {
                        throw new IOException("HTTP Range response has no body");
                    }
                    InputStream inputStreamM4011 = abstractC2630M45436.m4011();
                    try {
                        if (inputStreamM4011.read() == -1 || inputStreamM4011.read() != -1) {
                            try {
                                throw new IOException("HTTP Range probe returned an incorrect body length");
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    inputStreamM4011.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        inputStreamM4011.close();
                        String strM45435 = c20066Execute.m45435("ETag");
                        String strM45436 = c20066Execute.m45435("Last-Modified");
                        C13304 c13305 = new C13304(c11963M53265.f33356, strM45435, strM45436, null);
                        if (c13304 != null) {
                            C13304.m30374(c13304, c13305);
                        }
                        C7939 c7939 = new C7939(c18724M44143, c20066Execute.m45434().m24591(), c11963M53265.f33356, strM45435, strM45436, m53269(strM45435) ? strM45435 : strM45436, str2, c13305, c23914);
                        c20066Execute.close();
                        if (c23914 != null) {
                            c23914.m52987(interfaceC18228M42716);
                        }
                        this(c7939);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    Throwable th5 = th;
                    try {
                        c20066Execute.close();
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
        if (c23914 != null) {
            c23914.m52987(interfaceC18228M42716);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m53272(String str) {
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

    /* JADX INFO: renamed from: ۧ */
    public static boolean m53269(String str) {
        return (str == null || str.regionMatches(true, 0, "W/", 0, 2)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11963 m53265(C20066 c20066, long j, long j2, long j3) throws IOException {
        if (c20066.m45443() != 206) {
            throw new IOException("HTTP server did not return a partial response: " + c20066.m45443());
        }
        String strM45435 = c20066.m45435("Content-Encoding");
        if (strM45435 != null) {
            String lowerCase = strM45435.trim().toLowerCase(Locale.ROOT);
            if (!lowerCase.isEmpty() && !lowerCase.equals("identity") && !lowerCase.equals("utf-8") && !lowerCase.equals("utf8")) {
                throw new IOException("Unsupported HTTP content encoding: ".concat(strM45435));
            }
        }
        String strM45436 = c20066.m45435("Content-Range");
        Matcher matcher = strM45436 == null ? null : f76329.matcher(strM45436.trim());
        if (matcher == null || !matcher.matches()) {
            throw new IOException("Missing or invalid HTTP Content-Range");
        }
        try {
            long j4 = Long.parseLong(matcher.group(1));
            long j5 = Long.parseLong(matcher.group(2));
            long j6 = Long.parseLong(matcher.group(3));
            if (j4 != j || j5 != j2 || j6 <= j5 || (j3 >= 0 && j6 != j3)) {
                throw new IOException(C21466.m48631("Unexpected HTTP Content-Range: ", strM45436));
            }
            long j7 = (j5 - j4) + 1;
            AbstractC2630 abstractC2630M45436 = c20066.m45436();
            if (abstractC2630M45436 == null) {
                throw new IOException("HTTP Range response has no body");
            }
            long jMo4015 = abstractC2630M45436.mo4015();
            if (jMo4015 < 0 || jMo4015 == j7) {
                return new C11963(j6);
            }
            throw new IOException("HTTP Range response length mismatch");
        } catch (NumberFormatException e) {
            throw new IOException("Invalid HTTP Content-Range", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53267(C20066 c20066) throws IOException {
        String strM45435;
        C7939 c7939 = this.f76332;
        String str = c7939.f20839;
        String str2 = c7939.f20838;
        String str3 = c7939.f20839;
        if (m53269(str)) {
            String strM45436 = c20066.m45435("ETag");
            if (strM45436 != null && !str3.equals(strM45436)) {
                throw new IOException("Remote resource ETag changed during reading");
            }
            return;
        }
        if (str2 != null) {
            String strM45437 = c20066.m45435("Last-Modified");
            if (strM45437 != null && !str2.equals(strM45437)) {
                throw new IOException("Remote resource changed during reading");
            }
            return;
        }
        if (str3 != null && (strM45435 = c20066.m45435("ETag")) != null && !str3.equals(strM45435)) {
            throw new IOException("Remote resource ETag changed during reading");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m53270() throws IOException {
        if (this.f76330) {
            throw new IOException("Random access data is closed");
        }
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) throws IOException {
        m53270();
        if (j < 0 || j > this.f76332.f20843) {
            throw new IOException(C17588.m40051(j, "Seek position is outside the remote file: "));
        }
        if (j != this.f76333) {
            m53271();
            this.f76333 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.᩺ۚ᩻] */
    /* JADX WARN: Type inference failed for: r6v5, types: [long] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [l.ܽܰ᩵] */
    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        m53270();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f76333 >= this.f76332.f20843) {
            return -1;
        }
        InputStream inputStream = this.f76334;
        if (inputStream == null) {
            long j = this.f76332.f20843;
            long j2 = this.f76333;
            long jMin = Math.min(j - j2, 524288L) + j2;
            ?? r6 = jMin - 1;
            C7939 c7939 = this.f76332;
            InterfaceC18228 interfaceC18228M42716 = this.f76332.f20837.m42716(m53264(c7939.f20836, this.f76333, r6, c7939.f20840, c7939.f20842));
            this.f76335 = interfaceC18228M42716;
            C23914 c23914 = this.f76332.f20835;
            if (c23914 != null) {
                try {
                    c23914.m52985(interfaceC18228M42716);
                } catch (IOException e) {
                    this.f76335 = null;
                    throw e;
                }
            }
            if (this.f76330) {
                interfaceC18228M42716.cancel();
                m53266(interfaceC18228M42716);
                throw new IOException("Random access data is closed");
            }
            try {
                C20066 c20066Execute = interfaceC18228M42716.execute();
                try {
                    try {
                        if (this.f76330) {
                            throw new IOException("Random access data is closed");
                        }
                        m53265(c20066Execute, this.f76333, r6, this.f76332.f20843);
                        m53267(c20066Execute);
                        this.f76334 = c20066Execute.m45436().m4011();
                        this.f76331 = c20066Execute;
                        this.f76336 = jMin;
                        if (this.f76330) {
                            m53271();
                            throw new IOException("Random access data is closed");
                        }
                        inputStream = this.f76334;
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
                    r6 = interfaceC18228M42716;
                }
                c20066Execute.close();
                m53266(r6);
                throw e;
            } catch (IOException | RuntimeException e5) {
                m53266(interfaceC18228M42716);
                throw e5;
            }
        }
        int iMin = (int) Math.min(i2, this.f76336 - this.f76333);
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
                m53271();
                throw e6;
            }
        }
        long j3 = this.f76333 + ((long) i3);
        this.f76333 = j3;
        if (j3 == this.f76336) {
            m53271();
        }
        return i3;
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // p067l.InterfaceC4502
    public final long length() throws IOException {
        m53270();
        return this.f76332.f20843;
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // p067l.InterfaceC4502
    public final long position() throws IOException {
        m53270();
        return this.f76333;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() throws IOException {
        m53270();
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        return this.f76332.f20836.toString();
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() throws IOException {
        m53270();
        return new C24032(this.f76332);
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f76330;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f76330) {
            return;
        }
        this.f76330 = true;
        InterfaceC18228 interfaceC18228 = this.f76335;
        if (interfaceC18228 != null) {
            interfaceC18228.cancel();
        }
        m53271();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53266(InterfaceC18228 interfaceC18228) {
        if (this.f76335 == interfaceC18228) {
            this.f76335 = null;
        }
        C23914 c23914 = this.f76332.f20835;
        if (c23914 != null) {
            c23914.m52987(interfaceC18228);
        }
    }
}
