package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;
import java.util.Arrays;
import java.util.UUID;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10558 {

    /* JADX INFO: renamed from: ֫ */
    public volatile long f29236;

    /* JADX INFO: renamed from: ۧ */
    public long f29237;

    /* JADX INFO: renamed from: ܳ */
    public final C16454 f29238;

    /* JADX INFO: renamed from: ܽ */
    public final C15921 f29239;

    /* JADX INFO: renamed from: ܿ */
    public final C22902 f29240;

    /* JADX INFO: renamed from: ᩳ */
    public long f29241;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m24341(C11229 c11229) {
        if (c11229.f31229 != this || c11229.f31230 == null || this.f29236 != -1) {
            throw new IllegalArgumentException("Invalid recovered journal state");
        }
        C24639 c24639 = c11229.f31232;
        this.f29240.m51147(c24639.f77982, c24639.f77994);
        this.f29241 = c24639.f77984;
        this.f29237 = c24639.f77983;
        this.f29236 = c24639.f77986;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m24342(C14443 c14443, byte[] bArr, C4563 c4563) {
        m24336(c14443, bArr, c4563, C7245.f18895, 0L, true);
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized C11229 m24340(C21958 c21958) throws C15524 {
        long jM51155;
        IOException iOException;
        IOException iOException2;
        IOException iOException3;
        String str;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        C4523 c4523M9577;
        C24639 c24639M24337;
        int i2;
        C13773 c13773M37373;
        C4563 c4563M36043;
        if (this.f29236 != -1) {
            throw new IllegalStateException("Journal already initialized");
        }
        jM51155 = this.f29240.m51155();
        c21958.getClass();
        int i3 = 0;
        iOException = null;
        iOException2 = null;
        int i4 = 0;
        long j5 = 64;
        long jMax = Math.max(64L, jM51155 - 67108864);
        while (true) {
            if (jM51155 < 48 + jMax) {
                iOException3 = iOException;
                jMax = jMax;
                j5 = j5;
                break;
            }
            int i5 = i3 + 1;
            if (i5 > 100000) {
                throw new C15524("Recovery record scan limit exceeded");
            }
            try {
                synchronized (this.f29240.f72073.f6922) {
                    try {
                        byte[] bArr = new byte[16];
                        long j6 = 16;
                        try {
                            this.f29240.f72074.mo16281(jM51155 - j6, bArr, 0, 16);
                            long jM8261 = C4107.m8261(jM51155, bArr);
                            try {
                                if (jM8261 < jMax) {
                                    throw new IOException("Recovery scan boundary reached");
                                }
                                j = jMax;
                                try {
                                    C9490 c9490M51153 = this.f29240.m51153(jM8261);
                                    j2 = j5;
                                    if (jM8261 + 32 + ((long) c9490M51153.f25994) + j6 != jM51155) {
                                        throw new IOException("Recovery footer size does not match header");
                                    }
                                    try {
                                        if (c9490M51153.f25995 == 3) {
                                            int i6 = i4 + 1;
                                            if (i6 > 32) {
                                                throw new C15524("Recovery commit scan limit exceeded");
                                            }
                                            try {
                                                try {
                                                    c24639M24337 = m24337(jM8261, jM51155);
                                                    m24338(c24639M24337);
                                                    synchronized (this.f29240.f72073.f6922) {
                                                        try {
                                                            C9490 c9490M51154 = this.f29240.m51153(c24639M24337.f77989);
                                                            if (c9490M51154.f25995 != 4 || c9490M51154.f25992 >= c24639M24337.f77994 || m24333(c24639M24337.f77989, c9490M51154) > jM8261) {
                                                                try {
                                                                    throw new IOException("Invalid recovery state reference");
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                }
                                                            } else {
                                                                c4523M9577 = C4523.m9577(this.f29240, c24639M24337.f77989, c9490M51154);
                                                                try {
                                                                    try {
                                                                        C19137 c19137 = new C19137(c24639M24337.f77994);
                                                                        i2 = i6;
                                                                        try {
                                                                            i5 = i5;
                                                                            try {
                                                                                iOException2 = iOException2;
                                                                                try {
                                                                                    c13773M37373 = this.f29238.m37373(c24639M24337.f77985, jM8261, c24639M24337.f77987, c24639M24337.f77992, c24639M24337.f77991, c19137);
                                                                                    long j7 = c24639M24337.f77990;
                                                                                    if (j7 != 0) {
                                                                                        try {
                                                                                            c4563M36043 = this.f29239.m36043(j7, jM8261, c24639M24337.f77992, c19137);
                                                                                        } catch (UncheckedIOException e) {
                                                                                            e = e;
                                                                                            throw new C8546("Recovery history validation failed", e);
                                                                                        } catch (C15524 e2) {
                                                                                            throw e2;
                                                                                        } catch (IOException e3) {
                                                                                            e = e3;
                                                                                            throw new C8546("Recovery history validation failed", e);
                                                                                        }
                                                                                    } else {
                                                                                        c4563M36043 = null;
                                                                                    }
                                                                                } catch (IOException e4) {
                                                                                    e = e4;
                                                                                    i4 = i2;
                                                                                    jMax = j;
                                                                                    j5 = j2;
                                                                                    i = i5;
                                                                                    iOException2 = iOException2;
                                                                                    try {
                                                                                        if (e instanceof C8546) {
                                                                                            iOException2 = e;
                                                                                        }
                                                                                        if (c4523M9577 != null) {
                                                                                            c4523M9577.close();
                                                                                        }
                                                                                        iOException = e;
                                                                                        i3 = i;
                                                                                        jM51155 = jM8261;
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        if (c4523M9577 != null) {
                                                                                            c4523M9577.close();
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
                                                                                    if (c4523M9577 != null) {
                                                                                        c4523M9577.close();
                                                                                    }
                                                                                    iOException = e;
                                                                                    i3 = i;
                                                                                    jM51155 = jM8261;
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
                                                                            if ((e instanceof C8546) && iOException2 == null) {
                                                                                iOException2 = e;
                                                                            }
                                                                            if (c4523M9577 != null) {
                                                                                c4523M9577.close();
                                                                            }
                                                                            iOException = e;
                                                                            i3 = i;
                                                                            jM51155 = jM8261;
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
                                                                            if (c4523M9577 != null) {
                                                                                c4523M9577.close();
                                                                            }
                                                                            iOException = e;
                                                                            i3 = i;
                                                                            jM51155 = jM8261;
                                                                        }
                                                                    } catch (C15524 e10) {
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
                                                                c4523M9577 = null;
                                                                if (e instanceof C8546) {
                                                                    iOException2 = e;
                                                                }
                                                                if (c4523M9577 != null) {
                                                                    c4523M9577.close();
                                                                }
                                                                iOException = e;
                                                                i3 = i;
                                                                jM51155 = jM8261;
                                                            } catch (UncheckedIOException e14) {
                                                                e = e14;
                                                                c4523M9577 = null;
                                                                e = e.getCause();
                                                                if (c4523M9577 != null) {
                                                                    c4523M9577.close();
                                                                }
                                                                iOException = e;
                                                                i3 = i;
                                                                jM51155 = jM8261;
                                                            }
                                                        }
                                                    }
                                                } catch (C15524 e15) {
                                                    throw e15;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    c4523M9577 = null;
                                                    if (c4523M9577 != null) {
                                                        c4523M9577.close();
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
                                            jM51155 = jM8261;
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
                                                jM51155 = m24332(jM51155 - 1, jMax);
                                                if (jM51155 < j4) {
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
        return new C11229(this, c13773M37373, c4523M9577, c4563M36043, m24334(c24639M24337), c24639M24337, jM51155 - jM51155, iOException, iOException2);
    }

    public C10558(C22902 c22902) {
        this(c22902, new RunnableC3043());
    }

    public C10558(C22902 c22902, Runnable runnable) {
        this.f29236 = -1L;
        this.f29237 = -1L;
        this.f29240 = c22902;
        C16454 c16454 = new C16454(c22902, runnable);
        this.f29238 = c16454;
        this.f29239 = new C15921(c22902, c16454, runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m24339() {
        return this.f29236;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m24343(C14443 c14443, byte[] bArr, C4563 c4563, C7245 c7245, long j) {
        m24336(c14443, bArr, c4563, c7245, j, false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0169 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m24336(C14443 c14443, byte[] bArr, C4563 c4563, C7245 c7245, long j, boolean z) throws Throwable {
        Throwable th;
        int i;
        int i2;
        C10558 c10558 = 8192;
        if (bArr.length <= 8192) {
            long jM51156 = 0;
            if (j >= 0 && j > this.f29236 && c14443.m33057() >= 0 && c14443.m33057() >= this.f29237) {
                C13773 c13773M34522 = c14443.m34522();
                C22902 c22902 = c13773M34522.f38940;
                C22902 c22903 = this.f29240;
                if (c22902 != c22903) {
                    throw new IllegalArgumentException("Snapshot belongs to another recovery store");
                }
                c22903.m51158();
                try {
                    try {
                        C16865 c16865M51146 = this.f29240.m51146();
                        try {
                            long jM37372 = this.f29238.m37372(c13773M34522);
                            long jM36042 = c4563 == null ? 0L : this.f29239.m36042(c4563);
                            if (z) {
                                try {
                                    C22902 c22904 = this.f29240;
                                    c22904.f72073.m6166(c22904);
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        c16865M51146.close();
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
                            synchronized (this.f29240.f72073.f6922) {
                                if (c7245 != null) {
                                    try {
                                        C22902 c22905 = this.f29240;
                                        long jM51157 = c22905.m51157();
                                        C11996 c11996M39045 = C17262.m39045(c7245);
                                        jM51156 = c22905.m51156(jM51157, c11996M39045.m27458(), 6, c11996M39045.size());
                                    } catch (Throwable th4) {
                                        th = th4;
                                        while (true) {
                                            try {
                                                break;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                c16865M51146.close();
                                                throw th;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                long j2 = jM51156;
                                C22902 c22906 = this.f29240;
                                long j3 = jM36042;
                                long jM51158 = c22906.m51156(c22906.m51157(), bArr, 4, bArr.length);
                                this.f29240.m51150();
                                long jM51159 = this.f29240.m51157();
                                long jM51154 = this.f29240.m51154();
                                if (jM51154 <= jM51159) {
                                    throw new IOException("Recovery record identity exhausted");
                                }
                                if (c7245 != null) {
                                    i = IShizukuService.Stub.TRANSACTION_isHidden;
                                } else {
                                    i = c4563 == null ? 88 : 96;
                                }
                                C11996 c11996 = new C11996(i);
                                c11996.m27451(this.f29240.f72077.getMostSignificantBits());
                                c11996.m27451(this.f29240.f72077.getLeastSignificantBits());
                                c11996.m27451(this.f29240.f72078);
                                c11996.m27451(j);
                                c11996.m27451(c14443.m33057());
                                c11996.m27451(jM37372);
                                c11996.m27451(jM51158);
                                c11996.m27451(this.f29241);
                                c11996.m27451(jM51154);
                                c11996.writeInt(c13773M34522.m31402());
                                c11996.writeInt(c13773M34522.m31404());
                                c11996.writeInt(c13773M34522.m31396());
                                if (c7245 != null) {
                                    i2 = 2;
                                } else {
                                    i2 = c4563 == null ? 0 : 1;
                                }
                                c11996.writeInt(i2);
                                if (c4563 != null || c7245 != null) {
                                    c11996.m27451(j3);
                                }
                                if (c7245 != null) {
                                    c11996.m27451(j2);
                                }
                                C22902 c22907 = this.f29240;
                                c22907.getClass();
                                long jM511510 = c22907.m51156(jM51159, c11996.m27458(), 3, c11996.size());
                                this.f29240.m51150();
                                c16865M51146.close();
                                this.f29241 = jM511510;
                                this.f29237 = c14443.m33057();
                                this.f29236 = j;
                                throw e.getCause();
                            }
                            c16865M51146.close();
                            this.f29240.m51159();
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        c10558.f29240.m51159();
                        throw th;
                    }
                } catch (UncheckedIOException e2) {
                    e = e2;
                } catch (Throwable th8) {
                    th = th8;
                    c10558 = this;
                    c10558.f29240.m51159();
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("Invalid recovery commit state");
    }

    /* JADX INFO: renamed from: ۧ */
    private C24639 m24337(long j, long j2) {
        int i;
        int i2;
        C24639 c24639;
        synchronized (this.f29240.f72073.f6922) {
            try {
                C9490 c9490M51153 = this.f29240.m51153(j);
                if (c9490M51153.f25995 != 3 || (((i = c9490M51153.f25994) != 88 && i != 96 && i != 104) || m24333(j, c9490M51153) != j2)) {
                    throw new IOException("Invalid recovery commit shape");
                }
                C14677 c14677 = new C14677(this.f29240.m51149(j, c9490M51153));
                UUID uuid = new UUID(c14677.readLong(), c14677.readLong());
                long j3 = c14677.readLong();
                long j4 = c14677.readLong();
                long j5 = c14677.readLong();
                long j6 = c14677.readLong();
                long j7 = c14677.readLong();
                long j8 = c14677.readLong();
                long j9 = c14677.readLong();
                int i3 = c14677.readInt();
                int i4 = c14677.readInt();
                int i5 = c14677.readInt();
                int i6 = c14677.readInt();
                int i7 = c9490M51153.f25994;
                if (i7 == 104) {
                    i2 = 2;
                } else {
                    i2 = i7 == 96 ? 1 : 0;
                }
                if (i6 != i2) {
                    throw new IOException("Invalid recovery commit extension");
                }
                long j10 = i6 >= 1 ? c14677.readLong() : 0L;
                long j11 = i6 == 2 ? c14677.readLong() : 0L;
                if (!uuid.equals(this.f29240.f72077) || j3 != this.f29240.f72078 || j4 < 0 || j5 < 0 || j6 < 0 || j6 >= j || j7 < 64 || j7 >= j || j8 < 0 || j8 >= j || j9 <= c9490M51153.f25992 || i3 < 0 || i4 < 0 || i4 > i3 || i5 < -1 || i5 > 32 || ((i6 == 1 && j10 == 0) || ((j10 != 0 && (j10 < 64 || j10 >= j)) || ((i6 == 2 && (j11 < 64 || j11 >= j)) || c14677.available() != 0)))) {
                    throw new IOException("Invalid recovery commit metadata");
                }
                c24639 = new C24639(j, j2, j4, j5, j6, j7, j10, j11, j8, j9, i3, i4, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c24639;
    }

    /* JADX INFO: renamed from: ֫ */
    private C7245 m24334(C24639 c24639) {
        C7245 c7245M39044;
        if (c24639.f77988 == 0) {
            return C7245.f18895;
        }
        synchronized (this.f29240.f72073.f6922) {
            C9490 c9490M51153 = this.f29240.m51153(c24639.f77988);
            if (c9490M51153.f25995 != 6 || c9490M51153.f25992 >= c24639.f77994 || c9490M51153.f25994 > 4096 || m24333(c24639.f77988, c9490M51153) > c24639.f77984) {
                throw new IOException("Invalid recovery load reference");
            }
            c7245M39044 = C17262.m39044(this.f29240.m51149(c24639.f77988, c9490M51153));
        }
        return c7245M39044;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m24338(C24639 c24639) throws IOException {
        C24639 c24639M24337;
        if (c24639.f77993 == 0) {
            return;
        }
        synchronized (this.f29240.f72073.f6922) {
            long jM24333 = m24333(c24639.f77993, this.f29240.m51153(c24639.f77993));
            if (jM24333 > c24639.f77984) {
                throw new IOException("Recovery parent overlaps commit");
            }
            c24639M24337 = m24337(c24639.f77993, jM24333);
        }
        if (c24639M24337.f77986 >= c24639.f77986 || c24639M24337.f77983 > c24639.f77983 || c24639M24337.f77994 >= c24639.f77994) {
            throw new IOException("Invalid recovery parent order");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m24333(long j, C9490 c9490) {
        return j + 32 + ((long) c9490.f25994) + 16;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m24332(long j, long j2) {
        synchronized (this.f29240.f72073.f6922) {
            byte[] bArrM6170 = this.f29240.f72073.m6170();
            long j3 = j;
            while (j3 - j2 >= 16) {
                long jMax = Math.max(j2, j3 - ((long) bArrM6170.length));
                int i = (int) (j3 - jMax);
                this.f29240.f72074.mo16281(jMax, bArrM6170, 0, i);
                for (int i2 = i - 16; i2 >= 0; i2--) {
                    if (bArrM6170[i2] == 77 && bArrM6170[i2 + 1] == 50 && bArrM6170[i2 + 2] == 69 && bArrM6170[i2 + 3] == 70) {
                        long j4 = ((long) i2) + jMax + 16;
                        try {
                            if (C4107.m8261(j4, Arrays.copyOfRange(bArrM6170, i2, i2 + 16)) >= j2) {
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
