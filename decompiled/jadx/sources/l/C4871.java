package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ThreadPoolExecutor;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۙ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q759 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4871 implements InterfaceC7505 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Uri f15393;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f15394;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile RunnableC20394 f15395;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f15396;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f15397;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f15398;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f15399;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f15400;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f15401;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f15402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f15403;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile RunnableC20394 f15404;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Thread f15405;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile boolean f15406;

    public C4871(C17075 c17075, Uri uri, String str, long j) {
        this(0L, j, uri, c17075, str);
    }

    public C4871(long j, long j2, Uri uri, InterfaceC15097 interfaceC15097, String str) {
        ThreadPoolExecutor threadPoolExecutorM26979 = C10767.m26979();
        this.f15400 = new Object();
        this.f15403 = new Object();
        if (j < 0) {
            throw new IllegalArgumentException("Resource offset must be non-negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("Resource length must be known");
        }
        if (j > C13132.FOREVER_NS - j2) {
            throw new IllegalArgumentException("Resource range overflows");
        }
        this.f15401 = interfaceC15097;
        this.f15393 = uri;
        this.f15394 = str;
        this.f15396 = str + "@" + j + ":" + j2;
        this.f15397 = j;
        this.f15402 = j2;
        this.f15398 = 262144;
        this.f15399 = threadPoolExecutorM26979;
    }

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f15402;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m14228(int i, long j) {
        int iMin = (int) Math.min(X931RNG.BLOCK64_RESEED_MAX, this.f15402 - (j * X931RNG.BLOCK64_RESEED_MAX));
        return iMin > 0 && i == iMin;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14226(int i, long j, C7693 c7693, byte[] bArr) {
        synchronized (this.f15403) {
            m14225();
            int i2 = 0;
            while (i2 < i) {
                int iMin = Math.min(32768, i - i2);
                byte[] bArr2 = new byte[iMin];
                System.arraycopy(bArr, i2, bArr2, 0, iMin);
                C1594.m5449().m5455(new C23215(j, this.f15396), bArr2, c7693).close();
                i2 += iMin;
                j++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008e A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8 A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:50:0x00ee, B:58:0x0106, B:63:0x0119, B:66:0x0122, B:67:0x0129, B:68:0x012a, B:69:0x012e, B:70:0x0135, B:54:0x00fd, B:99:0x0198, B:100:0x019f), top: B:149:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0106 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:50:0x00ee, B:58:0x0106, B:63:0x0119, B:66:0x0122, B:67:0x0129, B:68:0x012a, B:69:0x012e, B:70:0x0135, B:54:0x00fd, B:99:0x0198, B:100:0x019f), top: B:149:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0117 A[DONT_INVERT, EDGE_INSN: B:62:0x0117->B:183:0x012a BREAK  A[LOOP:2: B:57:0x0104->B:65:0x011f]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0119 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:50:0x00ee, B:58:0x0106, B:63:0x0119, B:66:0x0122, B:67:0x0129, B:68:0x012a, B:69:0x012e, B:70:0x0135, B:54:0x00fd, B:99:0x0198, B:100:0x019f), top: B:149:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011f A[LOOP:2: B:57:0x0104->B:65:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x013e A[Catch: all -> 0x0190, TryCatch #1 {all -> 0x0190, blocks: (B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6), top: B:150:0x00c1, outer: #10, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #1 {all -> 0x0190, blocks: (B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6), top: B:150:0x00c1, outer: #10, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    @Override // l.InterfaceC7505
    /* JADX INFO: renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) throws IOException {
        long j2;
        long j3;
        int iMin;
        long j4;
        long j5;
        C7693 c7693M5453;
        byte[] bArr2;
        InterfaceC21449 interfaceC21449Mo6247;
        RunnableC20394 runnableC20394M14224;
        long jM46712;
        int iMin2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC21449 interfaceC21449;
        long j6 = 0;
        if (j < 0 || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (j > this.f15402 - ((long) i2)) {
            throw new EOFException("Preview read exceeds resource length");
        }
        long j7 = j;
        int i8 = i;
        int i9 = i2;
        while (i9 > 0) {
            m14225();
            long j8 = j7 / X931RNG.BLOCK64_RESEED_MAX;
            int i10 = (int) (j7 % X931RNG.BLOCK64_RESEED_MAX);
            C23215 c23215 = new C23215(j8, this.f15396);
            C14042 c14042M5454 = C1594.m5449().m5454(c23215);
            if (c14042M5454 != null && !m14228(c14042M5454.m33652().length, j8)) {
                c14042M5454.close();
                c14042M5454 = null;
            }
            if (c14042M5454 == null) {
                synchronized (this.f15400) {
                    m14225();
                    C14042 c14042M5455 = C1594.m5449().m5454(new C23215(j8, this.f15396));
                    if (c14042M5455 != null) {
                        try {
                            if (m14228(c14042M5455.m33652().length, j8)) {
                                c14042M5455.close();
                            } else {
                                if (c14042M5455 != null) {
                                    c14042M5455.close();
                                }
                                j2 = X931RNG.BLOCK64_RESEED_MAX * j8;
                                if (j2 >= j6) {
                                    j3 = this.f15402;
                                    if (j2 < j3) {
                                        iMin = (int) Math.min(this.f15398, j3 - j2);
                                        if (iMin > 0) {
                                            throw new EOFException("Preview read is past end of resource");
                                        }
                                        j4 = iMin;
                                        j5 = j4 * 2;
                                        if (j5 <= 2147483647L) {
                                            throw new IOException("Preview fill is too large");
                                        }
                                        c7693M5453 = C1594.m5449().m5453((int) j5);
                                        if (c7693M5453 != null) {
                                            throw new IOException("Preview page memory budget is exhausted");
                                        }
                                        try {
                                            bArr2 = new byte[iMin];
                                            interfaceC21449Mo6247 = this.f15401.mo6247();
                                            try {
                                                C4515 c4515 = new C4515();
                                                c4515.m13281(this.f15393);
                                                c4515.m13286(this.f15397 + j2);
                                                c4515.m13280(j4);
                                                c4515.m13282(this.f15394);
                                                runnableC20394M14224 = m14224(interfaceC21449Mo6247, c4515.m13278());
                                                try {
                                                    jM46712 = runnableC20394M14224.m46712();
                                                    if (jM46712 >= -1) {
                                                        throw new IOException("Preview data source returned an invalid length");
                                                    }
                                                    if (jM46712 == -1) {
                                                        iMin2 = iMin;
                                                    } else {
                                                        iMin2 = (int) Math.min(j4, jM46712);
                                                    }
                                                    i3 = 0;
                                                    while (true) {
                                                        i4 = 0;
                                                        while (true) {
                                                            if (i3 < iMin2) {
                                                                break;
                                                            }
                                                            m14225();
                                                            i7 = interfaceC21449Mo6247.read(bArr2, i3, iMin2 - i3);
                                                            interfaceC21449 = interfaceC21449Mo6247;
                                                            if (i7 == -1) {
                                                                break;
                                                            }
                                                            if (i7 >= 0) {
                                                                throw new IOException("Preview data source returned an invalid read result");
                                                            }
                                                            if (i7 == 0) {
                                                                i4++;
                                                                if (i4 < 16) {
                                                                    throw new IOException("Preview data source returned too many zero-byte reads");
                                                                }
                                                                interfaceC21449Mo6247 = interfaceC21449;
                                                            }
                                                        }
                                                        i3 += i7;
                                                        interfaceC21449Mo6247 = interfaceC21449;
                                                    }
                                                    try {
                                                        runnableC20394M14224.m46711();
                                                        m14227(runnableC20394M14224);
                                                        if (i3 != 0) {
                                                            throw new EOFException("Preview resource ended before requested page");
                                                        }
                                                        i5 = (i3 / 32768) * 32768;
                                                        if (j2 + ((long) i3) == this.f15402) {
                                                            i6 = i3;
                                                        } else {
                                                            i6 = i5;
                                                        }
                                                        if (i6 != 0) {
                                                            throw new EOFException("Preview resource ended before a complete page");
                                                        }
                                                        m14226(i6, j8, c7693M5453, bArr2);
                                                        c7693M5453.close();
                                                    } catch (Throwable th) {
                                                        m14227(runnableC20394M14224);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (runnableC20394M14224 != null) {
                                                        try {
                                                            runnableC20394M14224.m46711();
                                                        } finally {
                                                            m14227(runnableC20394M14224);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                runnableC20394M14224 = null;
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                c7693M5453.close();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                throw new EOFException("Preview read is past end of resource");
                            }
                            c14042M5454 = C1594.m5449().m5454(c23215);
                            if (c14042M5454 != null || !m14228(c14042M5454.m33652().length, j8)) {
                                if (c14042M5454 != null) {
                                    c14042M5454.close();
                                }
                                throw new IOException("Preview page memory budget is exhausted");
                            }
                        } catch (Throwable th6) {
                            try {
                                c14042M5455.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        }
                    } else {
                        if (c14042M5455 != null) {
                            c14042M5455.close();
                        }
                        j2 = X931RNG.BLOCK64_RESEED_MAX * j8;
                        if (j2 >= j6) {
                            j3 = this.f15402;
                            if (j2 < j3) {
                                iMin = (int) Math.min(this.f15398, j3 - j2);
                                if (iMin > 0) {
                                    throw new EOFException("Preview read is past end of resource");
                                }
                                j4 = iMin;
                                j5 = j4 * 2;
                                if (j5 <= 2147483647L) {
                                    throw new IOException("Preview fill is too large");
                                }
                                c7693M5453 = C1594.m5449().m5453((int) j5);
                                if (c7693M5453 != null) {
                                    throw new IOException("Preview page memory budget is exhausted");
                                }
                                bArr2 = new byte[iMin];
                                interfaceC21449Mo6247 = this.f15401.mo6247();
                                C4515 c4516 = new C4515();
                                c4516.m13281(this.f15393);
                                c4516.m13286(this.f15397 + j2);
                                c4516.m13280(j4);
                                c4516.m13282(this.f15394);
                                runnableC20394M14224 = m14224(interfaceC21449Mo6247, c4516.m13278());
                                jM46712 = runnableC20394M14224.m46712();
                                if (jM46712 >= -1) {
                                    throw new IOException("Preview data source returned an invalid length");
                                }
                                if (jM46712 == -1) {
                                    iMin2 = iMin;
                                } else {
                                    iMin2 = (int) Math.min(j4, jM46712);
                                }
                                i3 = 0;
                                while (true) {
                                    i4 = 0;
                                    while (true) {
                                        if (i3 < iMin2) {
                                            break;
                                        }
                                        m14225();
                                        i7 = interfaceC21449Mo6247.read(bArr2, i3, iMin2 - i3);
                                        interfaceC21449 = interfaceC21449Mo6247;
                                        if (i7 == -1) {
                                            break;
                                            break;
                                        } else {
                                            if (i7 >= 0) {
                                                throw new IOException("Preview data source returned an invalid read result");
                                            }
                                            if (i7 == 0) {
                                                i4++;
                                                if (i4 < 16) {
                                                    throw new IOException("Preview data source returned too many zero-byte reads");
                                                }
                                                interfaceC21449Mo6247 = interfaceC21449;
                                            }
                                        }
                                    }
                                    i3 += i7;
                                    interfaceC21449Mo6247 = interfaceC21449;
                                }
                                runnableC20394M14224.m46711();
                                m14227(runnableC20394M14224);
                                if (i3 != 0) {
                                    throw new EOFException("Preview resource ended before requested page");
                                }
                                i5 = (i3 / 32768) * 32768;
                                if (j2 + ((long) i3) == this.f15402) {
                                    i6 = i3;
                                } else {
                                    i6 = i5;
                                }
                                if (i6 != 0) {
                                    throw new EOFException("Preview resource ended before a complete page");
                                }
                                m14226(i6, j8, c7693M5453, bArr2);
                                c7693M5453.close();
                                c14042M5454 = C1594.m5449().m5454(c23215);
                                if (c14042M5454 != null) {
                                }
                                if (c14042M5454 != null) {
                                    c14042M5454.close();
                                }
                                throw new IOException("Preview page memory budget is exhausted");
                                throw th;
                            }
                        }
                        throw new EOFException("Preview read is past end of resource");
                    }
                }
            } else {
                j7 = j7;
                i8 = i8;
                i9 = i9;
            }
            try {
                byte[] bArrM33652 = c14042M5454.m33652();
                if (i10 >= bArrM33652.length) {
                    throw new EOFException("Preview page ended before requested position");
                }
                int i11 = i9;
                int iMin3 = Math.min(i11, bArrM33652.length - i10);
                System.arraycopy(bArrM33652, i10, bArr, i8, iMin3);
                i9 = i11 - iMin3;
                i8 += iMin3;
                j7 += (long) iMin3;
                c14042M5454.close();
                j6 = 0;
            } catch (Throwable th8) {
                try {
                    c14042M5454.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14225() throws InterruptedIOException {
        if (this.f15406 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Preview read was canceled");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007a */
    /* JADX WARN: Code duplicated, block: B:60:0x0086 A[Catch: all -> 0x008d, TRY_ENTER, TryCatch #8 {all -> 0x008d, blocks: (B:60:0x0086, B:61:0x008a), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x008a A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #8 {all -> 0x008d, blocks: (B:60:0x0086, B:61:0x008a), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0095 A[Catch: all -> 0x00a7, TryCatch #3 {, blocks: (B:64:0x0091, B:66:0x0095, B:67:0x0097, B:69:0x009b, B:71:0x00a3, B:72:0x00a5), top: B:85:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r6.f15406 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r6.f15395 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r1.m46713() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r6.f15395 = null;
        r6.f15404 = r1;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r8 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r8 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r1.m46709();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        throw new java.io.InterruptedIOException("Preview read was canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0066, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1.m46708();
        r0 = r6.f15403;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private RunnableC20394 m14224(InterfaceC21449 interfaceC21449, C3104 c3104) throws Throwable {
        RunnableC20394 runnableC20394;
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        RunnableC20394 runnableC20395 = new RunnableC20394(interfaceC21449, c3104, this.f15399);
        boolean z4 = false;
        try {
            synchronized (this.f15403) {
                try {
                    m14225();
                    this.f15395 = runnableC20395;
                    this.f15405 = Thread.currentThread();
                    z3 = true;
                    try {
                        runnableC20395.m46710();
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = true;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z2 = false;
                }
            }
            try {
                break;
                throw th;
                synchronized (this.f15403) {
                    if (this.f15395 == runnableC20395) {
                        this.f15395 = null;
                    }
                    if (this.f15404 == null && this.f15405 == Thread.currentThread()) {
                        this.f15405 = null;
                    }
                }
                return runnableC20395;
            } catch (Throwable th4) {
                th = th4;
                z3 = z2;
                th = th;
                z = z3;
                runnableC20394 = runnableC20395;
                if (!z4) {
                    try {
                        if (z) {
                            runnableC20394.m46709();
                        } else {
                            runnableC20394.m46711();
                        }
                    } catch (Throwable unused) {
                    }
                    synchronized (this.f15403) {
                        if (this.f15395 == runnableC20394) {
                            this.f15395 = null;
                        }
                        if (this.f15404 == null && this.f15405 == Thread.currentThread()) {
                            this.f15405 = null;
                        }
                    }
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th5) {
            this = this;
            runnableC20394 = runnableC20395;
            th = th5;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14227(RunnableC20394 runnableC20394) {
        synchronized (this.f15403) {
            if (this.f15404 == runnableC20394) {
                this.f15404 = null;
            }
            if (this.f15395 == null && this.f15404 == null && this.f15405 == Thread.currentThread()) {
                this.f15405 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RunnableC20394 runnableC20394;
        RunnableC20394 runnableC20395;
        Thread thread;
        synchronized (this.f15403) {
            this.f15406 = true;
            runnableC20394 = this.f15395;
            runnableC20395 = this.f15404;
            thread = this.f15405;
        }
        if (runnableC20394 != null) {
            try {
                runnableC20394.m46709();
            } catch (Throwable th) {
                th = th;
            }
        }
        th = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (runnableC20395 != null) {
            try {
                runnableC20395.m46711();
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    if (th != th) {
                        th.addSuppressed(th);
                    }
                }
                synchronized (this.f15400) {
                    this.f15400.notifyAll();
                    RunnableC20394.m46707(th);
                }
            }
        }
        th = th;
        synchronized (this.f15400) {
            this.f15400.notifyAll();
        }
        RunnableC20394.m46707(th);
    }
}
