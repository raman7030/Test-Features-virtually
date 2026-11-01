package p067l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ThreadPoolExecutor;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۙ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q759 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6998 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ֫֫ */
    public final Uri f18224;

    /* JADX INFO: renamed from: ۗ */
    public final String f18225;

    /* JADX INFO: renamed from: ۙ */
    public volatile RunnableC21751 f18226;

    /* JADX INFO: renamed from: ۛ */
    public final String f18227;

    /* JADX INFO: renamed from: ۟ */
    public final long f18228;

    /* JADX INFO: renamed from: ۤ */
    public final int f18229;

    /* JADX INFO: renamed from: ۨ */
    public final ThreadPoolExecutor f18230;

    /* JADX INFO: renamed from: ۫ */
    public final Object f18231;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC16716 f18232;

    /* JADX INFO: renamed from: ܰ */
    public final long f18233;

    /* JADX INFO: renamed from: ᩶ */
    public final Object f18234;

    /* JADX INFO: renamed from: ᩸ */
    public volatile RunnableC21751 f18235;

    /* JADX INFO: renamed from: ᩹ */
    public volatile Thread f18236;

    /* JADX INFO: renamed from: ᩺ */
    public volatile boolean f18237;

    public C6998(C18596 c18596, Uri uri, String str, long j) {
        this(0L, j, uri, c18596, str);
    }

    public C6998(long j, long j2, Uri uri, InterfaceC16716 interfaceC16716, String str) {
        ThreadPoolExecutor threadPoolExecutorM29024 = C12601.m29024();
        this.f18231 = new Object();
        this.f18234 = new Object();
        if (j < 0) {
            throw new IllegalArgumentException("Resource offset must be non-negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("Resource length must be known");
        }
        if (j > C14849.FOREVER_NS - j2) {
            throw new IllegalArgumentException("Resource range overflows");
        }
        this.f18232 = interfaceC16716;
        this.f18224 = uri;
        this.f18225 = str;
        this.f18227 = str + "@" + j + ":" + j2;
        this.f18228 = j;
        this.f18233 = j2;
        this.f18229 = 262144;
        this.f18230 = threadPoolExecutorM29024;
    }

    @Override // p067l.InterfaceC9501
    public final long length() {
        return this.f18233;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16109(int i, long j) {
        int iMin = (int) Math.min(X931RNG.BLOCK64_RESEED_MAX, this.f18233 - (j * X931RNG.BLOCK64_RESEED_MAX));
        return iMin > 0 && i == iMin;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16107(int i, long j, C9680 c9680, byte[] bArr) {
        synchronized (this.f18234) {
            m16106();
            int i2 = 0;
            while (i2 < i) {
                int iMin = Math.min(32768, i - i2);
                byte[] bArr2 = new byte[iMin];
                System.arraycopy(bArr, i2, bArr2, 0, iMin);
                C3883.m7679().m7685(new C24432(j, this.f18227), bArr2, c9680).close();
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
    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) throws IOException {
        long j2;
        long j3;
        int iMin;
        long j4;
        long j5;
        C9680 c9680M7683;
        byte[] bArr2;
        InterfaceC22753 interfaceC22753Mo8449;
        RunnableC21751 runnableC21751M16105;
        long jM49035;
        int iMin2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC22753 interfaceC22753;
        long j6 = 0;
        if (j < 0 || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (j > this.f18233 - ((long) i2)) {
            throw new EOFException("Preview read exceeds resource length");
        }
        long j7 = j;
        int i8 = i;
        int i9 = i2;
        while (i9 > 0) {
            m16106();
            long j8 = j7 / X931RNG.BLOCK64_RESEED_MAX;
            int i10 = (int) (j7 % X931RNG.BLOCK64_RESEED_MAX);
            C24432 c24432 = new C24432(j8, this.f18227);
            C15714 c15714M7684 = C3883.m7679().m7684(c24432);
            if (c15714M7684 != null && !m16109(c15714M7684.m35772().length, j8)) {
                c15714M7684.close();
                c15714M7684 = null;
            }
            if (c15714M7684 == null) {
                synchronized (this.f18231) {
                    m16106();
                    C15714 c15714M7685 = C3883.m7679().m7684(new C24432(j8, this.f18227));
                    if (c15714M7685 != null) {
                        try {
                            if (m16109(c15714M7685.m35772().length, j8)) {
                                c15714M7685.close();
                            } else {
                                if (c15714M7685 != null) {
                                    c15714M7685.close();
                                }
                                j2 = X931RNG.BLOCK64_RESEED_MAX * j8;
                                if (j2 >= j6) {
                                    j3 = this.f18233;
                                    if (j2 < j3) {
                                        iMin = (int) Math.min(this.f18229, j3 - j2);
                                        if (iMin > 0) {
                                            throw new EOFException("Preview read is past end of resource");
                                        }
                                        j4 = iMin;
                                        j5 = j4 * 2;
                                        if (j5 <= 2147483647L) {
                                            throw new IOException("Preview fill is too large");
                                        }
                                        c9680M7683 = C3883.m7679().m7683((int) j5);
                                        if (c9680M7683 != null) {
                                            throw new IOException("Preview page memory budget is exhausted");
                                        }
                                        try {
                                            bArr2 = new byte[iMin];
                                            interfaceC22753Mo8449 = this.f18232.mo8449();
                                            try {
                                                C6659 c6659 = new C6659();
                                                c6659.m15164(this.f18224);
                                                c6659.m15169(this.f18228 + j2);
                                                c6659.m15163(j4);
                                                c6659.m15165(this.f18225);
                                                runnableC21751M16105 = m16105(interfaceC22753Mo8449, c6659.m15161());
                                                try {
                                                    jM49035 = runnableC21751M16105.m49035();
                                                    if (jM49035 >= -1) {
                                                        throw new IOException("Preview data source returned an invalid length");
                                                    }
                                                    if (jM49035 == -1) {
                                                        iMin2 = iMin;
                                                    } else {
                                                        iMin2 = (int) Math.min(j4, jM49035);
                                                    }
                                                    i3 = 0;
                                                    while (true) {
                                                        i4 = 0;
                                                        while (true) {
                                                            if (i3 < iMin2) {
                                                                break;
                                                            }
                                                            m16106();
                                                            i7 = interfaceC22753Mo8449.read(bArr2, i3, iMin2 - i3);
                                                            interfaceC22753 = interfaceC22753Mo8449;
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
                                                                interfaceC22753Mo8449 = interfaceC22753;
                                                            }
                                                        }
                                                        i3 += i7;
                                                        interfaceC22753Mo8449 = interfaceC22753;
                                                    }
                                                    try {
                                                        runnableC21751M16105.m49034();
                                                        m16108(runnableC21751M16105);
                                                        if (i3 != 0) {
                                                            throw new EOFException("Preview resource ended before requested page");
                                                        }
                                                        i5 = (i3 / 32768) * 32768;
                                                        if (j2 + ((long) i3) == this.f18233) {
                                                            i6 = i3;
                                                        } else {
                                                            i6 = i5;
                                                        }
                                                        if (i6 != 0) {
                                                            throw new EOFException("Preview resource ended before a complete page");
                                                        }
                                                        m16107(i6, j8, c9680M7683, bArr2);
                                                        c9680M7683.close();
                                                    } catch (Throwable th) {
                                                        m16108(runnableC21751M16105);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (runnableC21751M16105 != null) {
                                                        try {
                                                            runnableC21751M16105.m49034();
                                                        } finally {
                                                            m16108(runnableC21751M16105);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                runnableC21751M16105 = null;
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                c9680M7683.close();
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
                            c15714M7684 = C3883.m7679().m7684(c24432);
                            if (c15714M7684 != null || !m16109(c15714M7684.m35772().length, j8)) {
                                if (c15714M7684 != null) {
                                    c15714M7684.close();
                                }
                                throw new IOException("Preview page memory budget is exhausted");
                            }
                        } catch (Throwable th6) {
                            try {
                                c15714M7685.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        }
                    } else {
                        if (c15714M7685 != null) {
                            c15714M7685.close();
                        }
                        j2 = X931RNG.BLOCK64_RESEED_MAX * j8;
                        if (j2 >= j6) {
                            j3 = this.f18233;
                            if (j2 < j3) {
                                iMin = (int) Math.min(this.f18229, j3 - j2);
                                if (iMin > 0) {
                                    throw new EOFException("Preview read is past end of resource");
                                }
                                j4 = iMin;
                                j5 = j4 * 2;
                                if (j5 <= 2147483647L) {
                                    throw new IOException("Preview fill is too large");
                                }
                                c9680M7683 = C3883.m7679().m7683((int) j5);
                                if (c9680M7683 != null) {
                                    throw new IOException("Preview page memory budget is exhausted");
                                }
                                bArr2 = new byte[iMin];
                                interfaceC22753Mo8449 = this.f18232.mo8449();
                                C6659 c66510 = new C6659();
                                c66510.m15164(this.f18224);
                                c66510.m15169(this.f18228 + j2);
                                c66510.m15163(j4);
                                c66510.m15165(this.f18225);
                                runnableC21751M16105 = m16105(interfaceC22753Mo8449, c66510.m15161());
                                jM49035 = runnableC21751M16105.m49035();
                                if (jM49035 >= -1) {
                                    throw new IOException("Preview data source returned an invalid length");
                                }
                                if (jM49035 == -1) {
                                    iMin2 = iMin;
                                } else {
                                    iMin2 = (int) Math.min(j4, jM49035);
                                }
                                i3 = 0;
                                while (true) {
                                    i4 = 0;
                                    while (true) {
                                        if (i3 < iMin2) {
                                            break;
                                        }
                                        m16106();
                                        i7 = interfaceC22753Mo8449.read(bArr2, i3, iMin2 - i3);
                                        interfaceC22753 = interfaceC22753Mo8449;
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
                                                interfaceC22753Mo8449 = interfaceC22753;
                                            }
                                        }
                                    }
                                    i3 += i7;
                                    interfaceC22753Mo8449 = interfaceC22753;
                                }
                                runnableC21751M16105.m49034();
                                m16108(runnableC21751M16105);
                                if (i3 != 0) {
                                    throw new EOFException("Preview resource ended before requested page");
                                }
                                i5 = (i3 / 32768) * 32768;
                                if (j2 + ((long) i3) == this.f18233) {
                                    i6 = i3;
                                } else {
                                    i6 = i5;
                                }
                                if (i6 != 0) {
                                    throw new EOFException("Preview resource ended before a complete page");
                                }
                                m16107(i6, j8, c9680M7683, bArr2);
                                c9680M7683.close();
                                c15714M7684 = C3883.m7679().m7684(c24432);
                                if (c15714M7684 != null) {
                                }
                                if (c15714M7684 != null) {
                                    c15714M7684.close();
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
                byte[] bArrM35772 = c15714M7684.m35772();
                if (i10 >= bArrM35772.length) {
                    throw new EOFException("Preview page ended before requested position");
                }
                int i11 = i9;
                int iMin3 = Math.min(i11, bArrM35772.length - i10);
                System.arraycopy(bArrM35772, i10, bArr, i8, iMin3);
                i9 = i11 - iMin3;
                i8 += iMin3;
                j7 += (long) iMin3;
                c15714M7684.close();
                j6 = 0;
            } catch (Throwable th8) {
                try {
                    c15714M7684.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16106() throws InterruptedIOException {
        if (this.f18237 || Thread.currentThread().isInterrupted()) {
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
    
        if (r6.f18237 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r6.f18226 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r1.m49036() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r6.f18226 = null;
        r6.f18235 = r1;
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
    
        r1.m49032();
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
    
        r1.m49031();
        r0 = r6.f18234;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private RunnableC21751 m16105(InterfaceC22753 interfaceC22753, C5318 c5318) throws Throwable {
        RunnableC21751 runnableC21751;
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        RunnableC21751 runnableC21752 = new RunnableC21751(interfaceC22753, c5318, this.f18230);
        boolean z4 = false;
        try {
            synchronized (this.f18234) {
                try {
                    m16106();
                    this.f18226 = runnableC21752;
                    this.f18236 = Thread.currentThread();
                    z3 = true;
                    try {
                        runnableC21752.m49033();
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
                synchronized (this.f18234) {
                    if (this.f18226 == runnableC21752) {
                        this.f18226 = null;
                    }
                    if (this.f18235 == null && this.f18236 == Thread.currentThread()) {
                        this.f18236 = null;
                    }
                }
                return runnableC21752;
            } catch (Throwable th4) {
                th = th4;
                z3 = z2;
                th = th;
                z = z3;
                runnableC21751 = runnableC21752;
                if (!z4) {
                    try {
                        if (z) {
                            runnableC21751.m49032();
                        } else {
                            runnableC21751.m49034();
                        }
                    } catch (Throwable unused) {
                    }
                    synchronized (this.f18234) {
                        if (this.f18226 == runnableC21751) {
                            this.f18226 = null;
                        }
                        if (this.f18235 == null && this.f18236 == Thread.currentThread()) {
                            this.f18236 = null;
                        }
                    }
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th5) {
            this = this;
            runnableC21751 = runnableC21752;
            th = th5;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16108(RunnableC21751 runnableC21751) {
        synchronized (this.f18234) {
            if (this.f18235 == runnableC21751) {
                this.f18235 = null;
            }
            if (this.f18226 == null && this.f18235 == null && this.f18236 == Thread.currentThread()) {
                this.f18236 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RunnableC21751 runnableC21751;
        RunnableC21751 runnableC21752;
        Thread thread;
        synchronized (this.f18234) {
            this.f18237 = true;
            runnableC21751 = this.f18226;
            runnableC21752 = this.f18235;
            thread = this.f18236;
        }
        if (runnableC21751 != null) {
            try {
                runnableC21751.m49032();
            } catch (Throwable th) {
                th = th;
            }
        }
        th = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (runnableC21752 != null) {
            try {
                runnableC21752.m49034();
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    if (th != th) {
                        th.addSuppressed(th);
                    }
                }
                synchronized (this.f18231) {
                    this.f18231.notifyAll();
                    RunnableC21751.m49030(th);
                }
            }
        }
        th = th;
        synchronized (this.f18231) {
            this.f18231.notifyAll();
        }
        RunnableC21751.m49030(th);
    }
}
