package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.UUID;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8617 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile long f26321;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f26322;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14820 f26323;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14260 f26324;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21605 f26325;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f26326;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m22372(C9323 c9323) {
        if (c9323.f28281 != this || c9323.f28282 == null || this.f26321 != -1) {
            throw new IllegalArgumentException("Invalid recovered journal state");
        }
        C23433 c23433 = c9323.f28284;
        this.f26325.m48800(c23433.f75237, c23433.f75249);
        this.f26326 = c23433.f75239;
        this.f26322 = c23433.f75238;
        this.f26321 = c23433.f75241;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m22373(C12704 c12704, byte[] bArr, C2309 c2309) {
        m22367(c12704, bArr, c2309, C5131.f16061, 0L, true);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0189 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0234 */
    /* JADX WARN: Code duplicated, block: B:107:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2 A[Catch: all -> 0x0289, PHI: r0 r1 r6 r8 r10 r11 r13 r40 r41
      0x01c2: PHI (r0v50 'e' java.io.IOException) = (r0v46 'e' java.io.IOException), (r0v51 'e' java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r1v16 l.ۖۗᩳ) = (r1v14 l.ۖۗᩳ), (r1v17 l.ۖۗᩳ) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r6v18 long) = (r6v16 long), (r6v19 long) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r8v16 long) = (r8v14 long), (r8v17 long) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r10v11 int) = (r10v9 int), (r10v12 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r11v12 java.io.IOException) = (r11v10 java.io.IOException), (r11v14 java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r13v10 int) = (r13v8 int), (r13v11 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r40v15 int) = (r40v13 int), (r40v16 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r41v15 java.io.IOException) = (r41v13 java.io.IOException), (r41v16 java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #17 {, blocks: (B:4:0x0005, B:6:0x000d, B:12:0x003b, B:13:0x0043, B:25:0x007c, B:116:0x01c2, B:124:0x01d2, B:125:0x01d5, B:126:0x01d6, B:127:0x01dd, B:148:0x022e, B:156:0x0251, B:163:0x0272, B:167:0x027d, B:168:0x0280, B:160:0x0260, B:161:0x0267, B:169:0x0281, B:170:0x0288), top: B:190:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d2 A[Catch: all -> 0x0289, TRY_ENTER, TryCatch #17 {, blocks: (B:4:0x0005, B:6:0x000d, B:12:0x003b, B:13:0x0043, B:25:0x007c, B:116:0x01c2, B:124:0x01d2, B:125:0x01d5, B:126:0x01d6, B:127:0x01dd, B:148:0x022e, B:156:0x0251, B:163:0x0272, B:167:0x027d, B:168:0x0280, B:160:0x0260, B:161:0x0267, B:169:0x0281, B:170:0x0288), top: B:190:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0278  */
    /* JADX WARN: Code duplicated, block: B:166:0x027b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized C9323 m22371(C20612 c20612) throws C13842 {
        long jM48808;
        IOException iOException;
        IOException iOException2;
        IOException iOException3;
        String str;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        C2267 c2267M7495;
        C23433 c23433M22368;
        int i2;
        C11999 c11999M35225;
        C2309 c2309M33910;
        if (this.f26321 != -1) {
            throw new IllegalStateException("Journal already initialized");
        }
        jM48808 = this.f26325.m48808();
        c20612.getClass();
        int i3 = 0;
        iOException = null;
        iOException2 = null;
        int i4 = 0;
        long j5 = 64;
        long jMax = Math.max(64L, jM48808 - 67108864);
        while (true) {
            if (jM48808 < 48 + jMax) {
                iOException3 = iOException;
                jMax = jMax;
                j5 = j5;
                break;
            }
            int i5 = i3 + 1;
            if (i5 > 100000) {
                throw new C13842("Recovery record scan limit exceeded");
            }
            try {
                synchronized (this.f26325.f69370.f4153) {
                    try {
                        byte[] bArr = new byte[16];
                        long j6 = 16;
                        try {
                            this.f26325.f69371.mo14384(jM48808 - j6, bArr, 0, 16);
                            long jM6063 = C1829.m6063(jM48808, bArr);
                            try {
                                if (jM6063 < jMax) {
                                    throw new IOException("Recovery scan boundary reached");
                                }
                                j = jMax;
                                try {
                                    C7493 c7493M48806 = this.f26325.m48806(jM6063);
                                    j2 = j5;
                                    if (jM6063 + 32 + ((long) c7493M48806.f23082) + j6 != jM48808) {
                                        throw new IOException("Recovery footer size does not match header");
                                    }
                                    try {
                                        if (c7493M48806.f23083 == 3) {
                                            int i6 = i4 + 1;
                                            if (i6 > 32) {
                                                throw new C13842("Recovery commit scan limit exceeded");
                                            }
                                            try {
                                                try {
                                                    c23433M22368 = m22368(jM6063, jM48808);
                                                    m22369(c23433M22368);
                                                    synchronized (this.f26325.f69370.f4153) {
                                                        try {
                                                            C7493 c7493M48807 = this.f26325.m48806(c23433M22368.f75244);
                                                            if (c7493M48807.f23083 != 4 || c7493M48807.f23080 >= c23433M22368.f75249 || m22364(c23433M22368.f75244, c7493M48807) > jM6063) {
                                                                try {
                                                                    throw new IOException("Invalid recovery state reference");
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                }
                                                            } else {
                                                                c2267M7495 = C2267.m7495(this.f26325, c23433M22368.f75244, c7493M48807);
                                                                try {
                                                                    try {
                                                                        C17643 c17643 = new C17643(c23433M22368.f75249);
                                                                        i2 = i6;
                                                                        try {
                                                                            i5 = i5;
                                                                            try {
                                                                                iOException2 = iOException2;
                                                                                try {
                                                                                    c11999M35225 = this.f26323.m35225(c23433M22368.f75240, jM6063, c23433M22368.f75242, c23433M22368.f75247, c23433M22368.f75246, c17643);
                                                                                    long j7 = c23433M22368.f75245;
                                                                                    if (j7 != 0) {
                                                                                        try {
                                                                                            c2309M33910 = this.f26324.m33910(j7, jM6063, c23433M22368.f75247, c17643);
                                                                                        } catch (UncheckedIOException e) {
                                                                                            e = e;
                                                                                            throw new C6500("Recovery history validation failed", e);
                                                                                        } catch (C13842 e2) {
                                                                                            throw e2;
                                                                                        } catch (IOException e3) {
                                                                                            e = e3;
                                                                                            throw new C6500("Recovery history validation failed", e);
                                                                                        }
                                                                                    } else {
                                                                                        c2309M33910 = null;
                                                                                    }
                                                                                } catch (IOException e4) {
                                                                                    e = e4;
                                                                                    i4 = i2;
                                                                                    jMax = j;
                                                                                    j5 = j2;
                                                                                    i = i5;
                                                                                    iOException2 = iOException2;
                                                                                    try {
                                                                                        if (e instanceof C6500) {
                                                                                            iOException2 = e;
                                                                                        }
                                                                                        if (c2267M7495 != null) {
                                                                                            c2267M7495.close();
                                                                                        }
                                                                                        iOException = e;
                                                                                        i3 = i;
                                                                                        jM48808 = jM6063;
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        if (c2267M7495 != null) {
                                                                                            c2267M7495.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (UncheckedIOException e5) {
                                                                                    e = e5;
                                                                                    i4 = i2;
                                                                                    jMax = j;
                                                                                    j5 = j2;
                                                                                    i = i5;
                                                                                    iOException2 = iOException2;
                                                                                    e = e.getCause();
                                                                                    if (c2267M7495 != null) {
                                                                                        c2267M7495.close();
                                                                                    }
                                                                                    iOException = e;
                                                                                    i3 = i;
                                                                                    jM48808 = jM6063;
                                                                                }
                                                                            } catch (IOException e6) {
                                                                                e = e6;
                                                                                iOException2 = iOException2;
                                                                            } catch (UncheckedIOException e7) {
                                                                                e = e7;
                                                                                iOException2 = iOException2;
                                                                            }
                                                                        } catch (IOException e8) {
                                                                            e = e8;
                                                                            iOException2 = iOException2;
                                                                            i5 = i5;
                                                                            i4 = i2;
                                                                            jMax = j;
                                                                            j5 = j2;
                                                                            i = i5;
                                                                            iOException2 = iOException2;
                                                                            if ((e instanceof C6500) && iOException2 == null) {
                                                                                iOException2 = e;
                                                                            }
                                                                            if (c2267M7495 != null) {
                                                                                c2267M7495.close();
                                                                            }
                                                                            iOException = e;
                                                                            i3 = i;
                                                                            jM48808 = jM6063;
                                                                        } catch (UncheckedIOException e9) {
                                                                            e = e9;
                                                                            iOException2 = iOException2;
                                                                            i5 = i5;
                                                                            i4 = i2;
                                                                            jMax = j;
                                                                            j5 = j2;
                                                                            i = i5;
                                                                            iOException2 = iOException2;
                                                                            e = e.getCause();
                                                                            if (c2267M7495 != null) {
                                                                                c2267M7495.close();
                                                                            }
                                                                            iOException = e;
                                                                            i3 = i;
                                                                            jM48808 = jM6063;
                                                                        }
                                                                    } catch (C13842 e10) {
                                                                        throw e10;
                                                                    }
                                                                } catch (IOException e11) {
                                                                    e = e11;
                                                                    i2 = i6;
                                                                } catch (UncheckedIOException e12) {
                                                                    e = e12;
                                                                    i2 = i6;
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                        }
                                                        i4 = i6;
                                                        jMax = j;
                                                        j5 = j2;
                                                        i = i5;
                                                        iOException2 = iOException2;
                                                        while (true) {
                                                            try {
                                                                throw th;
                                                            } catch (IOException e13) {
                                                                e = e13;
                                                                c2267M7495 = null;
                                                                if (e instanceof C6500) {
                                                                    iOException2 = e;
                                                                }
                                                                if (c2267M7495 != null) {
                                                                    c2267M7495.close();
                                                                }
                                                                iOException = e;
                                                                i3 = i;
                                                                jM48808 = jM6063;
                                                            } catch (UncheckedIOException e14) {
                                                                e = e14;
                                                                c2267M7495 = null;
                                                                e = e.getCause();
                                                                if (c2267M7495 != null) {
                                                                    c2267M7495.close();
                                                                }
                                                                iOException = e;
                                                                i3 = i;
                                                                jM48808 = jM6063;
                                                            }
                                                        }
                                                    }
                                                } catch (C13842 e15) {
                                                    throw e15;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    c2267M7495 = null;
                                                    if (c2267M7495 != null) {
                                                        c2267M7495.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e16) {
                                                e = e16;
                                                iOException2 = iOException2;
                                                i5 = i5;
                                                i4 = i6;
                                                jMax = j;
                                                j5 = j2;
                                                i = i5;
                                                iOException2 = iOException2;
                                            } catch (UncheckedIOException e17) {
                                                e = e17;
                                                iOException2 = iOException2;
                                                i5 = i5;
                                                i4 = i6;
                                                jMax = j;
                                                j5 = j2;
                                                i = i5;
                                                iOException2 = iOException2;
                                            }
                                        } else {
                                            iOException2 = iOException2;
                                            i5 = i5;
                                            jM48808 = jM6063;
                                            jMax = j;
                                            j5 = j2;
                                            i3 = i5;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        iOException2 = iOException2;
                                        i5 = i5;
                                        j3 = 0;
                                        j4 = j3;
                                        jMax = j;
                                        j5 = j2;
                                        int i7 = i5;
                                        iOException2 = iOException2;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (IOException e18) {
                                                iOException = e18;
                                                i3 = i7;
                                                jM48808 = m22363(jM48808 - 1, jMax);
                                                if (jM48808 < j4) {
                                                    iOException3 = iOException;
                                                    if (jMax > j5) {
                                                        str = "No valid commit within recovery scan limit";
                                                    } else {
                                                        str = "No valid recovery commit";
                                                    }
                                                    throw new IOException(str, iOException3);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j2 = j5;
                                    iOException2 = iOException2;
                                    i5 = i5;
                                    j3 = 0;
                                    j4 = j3;
                                    jMax = j;
                                    j5 = j2;
                                    int i8 = i5;
                                    iOException2 = iOException2;
                                    while (true) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                j4 = j3;
                                jMax = j;
                                j5 = j2;
                                int i9 = i5;
                                iOException2 = iOException2;
                                while (true) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            j = jMax;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        j = jMax;
                        j2 = j5;
                    }
                }
            } catch (IOException e19) {
                j = jMax;
                j2 = j5;
                iOException2 = iOException2;
                i5 = i5;
                j3 = 0;
                iOException = e19;
                j4 = 0;
                jMax = j;
                j5 = j2;
                i3 = i5;
                iOException2 = iOException2;
            }
        }
        if (jMax > j5) {
            str = "No valid commit within recovery scan limit";
        } else {
            str = "No valid recovery commit";
        }
        throw new IOException(str, iOException3);
        return new C9323(this, c11999M35225, c2267M7495, c2309M33910, m22365(c23433M22368), c23433M22368, jM48808 - jM48808, iOException, iOException2);
    }

    public C8617(C21605 c21605) {
        this(c21605, new RunnableC0709());
    }

    public C8617(C21605 c21605, Runnable runnable) {
        this.f26321 = -1L;
        this.f26322 = -1L;
        this.f26325 = c21605;
        C14820 c14820 = new C14820(c21605, runnable);
        this.f26323 = c14820;
        this.f26324 = new C14260(c21605, c14820, runnable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22370() {
        return this.f26321;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m22374(C12704 c12704, byte[] bArr, C2309 c2309, C5131 c5131, long j) {
        m22367(c12704, bArr, c2309, c5131, j, false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0169 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m22367(C12704 c12704, byte[] bArr, C2309 c2309, C5131 c5131, long j, boolean z) throws Throwable {
        Throwable th;
        int i;
        int i2;
        C8617 c8617 = 8192;
        if (bArr.length <= 8192) {
            long jM48809 = 0;
            if (j >= 0 && j > this.f26321 && c12704.m30979() >= 0 && c12704.m30979() >= this.f26322) {
                C11999 c11999M32420 = c12704.m32420();
                C21605 c21605 = c11999M32420.f35930;
                C21605 c21606 = this.f26325;
                if (c21605 != c21606) {
                    throw new IllegalArgumentException("Snapshot belongs to another recovery store");
                }
                c21606.m48811();
                try {
                    try {
                        C15253 c15253M48799 = this.f26325.m48799();
                        try {
                            long jM35224 = this.f26323.m35224(c11999M32420);
                            long jM33909 = c2309 == null ? 0L : this.f26324.m33909(c2309);
                            if (z) {
                                try {
                                    C21605 c21607 = this.f26325;
                                    c21607.f69370.m3925(c21607);
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        c15253M48799.close();
                                        throw th;
                                    } catch (Throwable th3) {
                                        try {
                                            th.addSuppressed(th3);
                                            throw th;
                                        } catch (UncheckedIOException e) {
                                            e = e;
                                        }
                                    }
                                }
                            }
                            synchronized (this.f26325.f69370.f4153) {
                                if (c5131 != null) {
                                    try {
                                        C21605 c21608 = this.f26325;
                                        long jM48810 = c21608.m48810();
                                        C10130 c10130M36879 = C15671.m36879(c5131);
                                        jM48809 = c21608.m48809(jM48810, c10130M36879.m25438(), 6, c10130M36879.size());
                                    } catch (Throwable th4) {
                                        th = th4;
                                        while (true) {
                                            try {
                                                break;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                c15253M48799.close();
                                                throw th;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                long j2 = jM48809;
                                C21605 c21609 = this.f26325;
                                long j3 = jM33909;
                                long jM488010 = c21609.m48809(c21609.m48810(), bArr, 4, bArr.length);
                                this.f26325.m48803();
                                long jM48811 = this.f26325.m48810();
                                long jM48807 = this.f26325.m48807();
                                if (jM48807 <= jM48811) {
                                    throw new IOException("Recovery record identity exhausted");
                                }
                                if (c5131 != null) {
                                    i = IShizukuService.Stub.TRANSACTION_isHidden;
                                } else {
                                    i = c2309 == null ? 88 : 96;
                                }
                                C10130 c10130 = new C10130(i);
                                c10130.m25431(this.f26325.f69374.getMostSignificantBits());
                                c10130.m25431(this.f26325.f69374.getLeastSignificantBits());
                                c10130.m25431(this.f26325.f69375);
                                c10130.m25431(j);
                                c10130.m25431(c12704.m30979());
                                c10130.m25431(jM35224);
                                c10130.m25431(jM488010);
                                c10130.m25431(this.f26326);
                                c10130.m25431(jM48807);
                                c10130.writeInt(c11999M32420.m29347());
                                c10130.writeInt(c11999M32420.m29349());
                                c10130.writeInt(c11999M32420.m29341());
                                if (c5131 != null) {
                                    i2 = 2;
                                } else {
                                    i2 = c2309 == null ? 0 : 1;
                                }
                                c10130.writeInt(i2);
                                if (c2309 != null || c5131 != null) {
                                    c10130.m25431(j3);
                                }
                                if (c5131 != null) {
                                    c10130.m25431(j2);
                                }
                                C21605 c216010 = this.f26325;
                                c216010.getClass();
                                long jM488011 = c216010.m48809(jM48811, c10130.m25438(), 3, c10130.size());
                                this.f26325.m48803();
                                c15253M48799.close();
                                this.f26326 = jM488011;
                                this.f26322 = c12704.m30979();
                                this.f26321 = j;
                                throw e.getCause();
                            }
                            c15253M48799.close();
                            this.f26325.m48812();
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        c8617.f26325.m48812();
                        throw th;
                    }
                } catch (UncheckedIOException e2) {
                    e = e2;
                } catch (Throwable th8) {
                    th = th8;
                    c8617 = this;
                    c8617.f26325.m48812();
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("Invalid recovery commit state");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23433 m22368(long j, long j2) {
        int i;
        int i2;
        C23433 c23433;
        synchronized (this.f26325.f69370.f4153) {
            try {
                C7493 c7493M48806 = this.f26325.m48806(j);
                if (c7493M48806.f23083 != 3 || (((i = c7493M48806.f23082) != 88 && i != 96 && i != 104) || m22364(j, c7493M48806) != j2)) {
                    throw new IOException("Invalid recovery commit shape");
                }
                C12951 c12951 = new C12951(this.f26325.m48802(j, c7493M48806));
                UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
                long j3 = c12951.readLong();
                long j4 = c12951.readLong();
                long j5 = c12951.readLong();
                long j6 = c12951.readLong();
                long j7 = c12951.readLong();
                long j8 = c12951.readLong();
                long j9 = c12951.readLong();
                int i3 = c12951.readInt();
                int i4 = c12951.readInt();
                int i5 = c12951.readInt();
                int i6 = c12951.readInt();
                int i7 = c7493M48806.f23082;
                if (i7 == 104) {
                    i2 = 2;
                } else {
                    i2 = i7 == 96 ? 1 : 0;
                }
                if (i6 != i2) {
                    throw new IOException("Invalid recovery commit extension");
                }
                long j10 = i6 >= 1 ? c12951.readLong() : 0L;
                long j11 = i6 == 2 ? c12951.readLong() : 0L;
                if (!uuid.equals(this.f26325.f69374) || j3 != this.f26325.f69375 || j4 < 0 || j5 < 0 || j6 < 0 || j6 >= j || j7 < 64 || j7 >= j || j8 < 0 || j8 >= j || j9 <= c7493M48806.f23080 || i3 < 0 || i4 < 0 || i4 > i3 || i5 < -1 || i5 > 32 || ((i6 == 1 && j10 == 0) || ((j10 != 0 && (j10 < 64 || j10 >= j)) || ((i6 == 2 && (j11 < 64 || j11 >= j)) || c12951.available() != 0)))) {
                    throw new IOException("Invalid recovery commit metadata");
                }
                c23433 = new C23433(j, j2, j4, j5, j6, j7, j10, j11, j8, j9, i3, i4, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23433;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5131 m22365(C23433 c23433) {
        C5131 c5131M36878;
        if (c23433.f75243 == 0) {
            return C5131.f16061;
        }
        synchronized (this.f26325.f69370.f4153) {
            C7493 c7493M48806 = this.f26325.m48806(c23433.f75243);
            if (c7493M48806.f23083 != 6 || c7493M48806.f23080 >= c23433.f75249 || c7493M48806.f23082 > 4096 || m22364(c23433.f75243, c7493M48806) > c23433.f75239) {
                throw new IOException("Invalid recovery load reference");
            }
            c5131M36878 = C15671.m36878(this.f26325.m48802(c23433.f75243, c7493M48806));
        }
        return c5131M36878;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m22369(C23433 c23433) throws IOException {
        C23433 c23433M22368;
        if (c23433.f75248 == 0) {
            return;
        }
        synchronized (this.f26325.f69370.f4153) {
            long jM22364 = m22364(c23433.f75248, this.f26325.m48806(c23433.f75248));
            if (jM22364 > c23433.f75239) {
                throw new IOException("Recovery parent overlaps commit");
            }
            c23433M22368 = m22368(c23433.f75248, jM22364);
        }
        if (c23433M22368.f75241 >= c23433.f75241 || c23433M22368.f75238 > c23433.f75238 || c23433M22368.f75249 >= c23433.f75249) {
            throw new IOException("Invalid recovery parent order");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m22364(long j, C7493 c7493) {
        return j + 32 + ((long) c7493.f23082) + 16;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m22363(long j, long j2) {
        synchronized (this.f26325.f69370.f4153) {
            byte[] bArrM3929 = this.f26325.f69370.m3929();
            long j3 = j;
            while (j3 - j2 >= 16) {
                long jMax = Math.max(j2, j3 - ((long) bArrM3929.length));
                int i = (int) (j3 - jMax);
                this.f26325.f69371.mo14384(jMax, bArrM3929, 0, i);
                for (int i2 = i - 16; i2 >= 0; i2--) {
                    if (bArrM3929[i2] == 77 && bArrM3929[i2 + 1] == 50 && bArrM3929[i2 + 2] == 69 && bArrM3929[i2 + 3] == 70) {
                        long j4 = ((long) i2) + jMax + 16;
                        try {
                            if (C1829.m6063(j4, Arrays.copyOfRange(bArrM3929, i2, i2 + 16)) >= j2) {
                                return j4;
                            }
                        } catch (IOException unused) {
                            continue;
                        }
                    }
                }
                if (jMax == j2) {
                    break;
                }
                j3 = 15 + jMax;
            }
            return -1L;
        }
    }
}
