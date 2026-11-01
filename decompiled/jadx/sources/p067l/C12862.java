package p067l;

import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۧܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12862 {

    /* JADX INFO: renamed from: ۖ */
    public static long f36179;

    /* JADX INFO: renamed from: ۡ */
    public static C11598 f36180;

    /* JADX INFO: renamed from: ۢ */
    public static RunnableC8426 f36181;

    /* JADX INFO: renamed from: ܺ */
    public static long f36182;

    /* JADX INFO: renamed from: ۜ */
    public volatile long f36184;

    /* JADX INFO: renamed from: ۧ */
    public volatile C19644 f36185;

    /* JADX INFO: renamed from: ܽ */
    public final C8838 f36187;

    /* JADX INFO: renamed from: ܿ */
    public int f36188;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f36189;

    /* JADX INFO: renamed from: ᩷ */
    public int f36190;

    /* JADX INFO: renamed from: ᩻ */
    public int f36191;

    /* JADX INFO: renamed from: ܳ */
    public boolean f36186 = true;

    /* JADX INFO: renamed from: ֫ */
    public int f36183 = 8;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m29438(RunnableC8426 runnableC8426) {
        if (f36181 == runnableC8426 && runnableC8426.f22587 == null) {
            f36181 = null;
            runnableC8426.f22586 = null;
        }
    }

    public C12862(C8838 c8838) {
        this.f36187 = c8838;
        this.f36185 = new C19644(EnumC9767.INSTANCE, c8838.getContext().getCacheDir());
        m29440();
        m29448();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19644 m29452(C19644 c19644) {
        C12826.requireNonNull(c19644, "document");
        this.f36184++;
        C19644 c19645 = this.f36185;
        this.f36185 = c19644;
        this.f36191 = 0;
        this.f36190 = 0;
        this.f36186 = true;
        this.f36189 = false;
        this.f36188 = Integer.toHexString(c19644.length()).length();
        m29440();
        this.f36187.m20426(this.f36190, this.f36191, false);
        this.f36187.m20424();
        C12450 c12450 = this.f36187.f23987;
        if (c12450 != null) {
            c12450.m28666();
        }
        return c19645;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C19644 m29476() {
        return this.f36185;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29450(int i, int i2, byte[] bArr, boolean[] zArr) {
        return this.f36185.m44639(i, i2, bArr, zArr);
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m29448() {
        int length = Integer.toHexString(this.f36185.length()).length();
        if (length != this.f36188) {
            this.f36188 = length;
            C12450 c12450 = this.f36187.f23987;
            if (c12450 != null) {
                c12450.m28666();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29471(int i, int i2) {
        int length = this.f36185.length();
        if (length == 0) {
            m29454(0, true);
            return;
        }
        this.f36184++;
        int iMin = i < 0 ? 0 : Math.min(i, length - 1);
        int iMin2 = i2 >= 0 ? Math.min(i2, length - 1) : 0;
        this.f36190 = Math.min(iMin, iMin2);
        this.f36191 = Math.max(iMin, iMin2);
        this.f36186 = true;
        this.f36189 = true;
        m29440();
        this.f36187.m20426(this.f36190, this.f36191, true);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m29473() {
        int length = this.f36185.length();
        if (length == 0) {
            return 1;
        }
        long j = this.f36183;
        long j2 = ((((long) length) + j) - 1) / j;
        int i = (int) j2;
        if (j2 == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m29477() {
        return this.f36185.length();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m29481() {
        return this.f36188;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29470(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        this.f36183 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m29475() {
        return this.f36183;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29449(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative position");
        }
        return (int) Math.min((((long) this.f36183) * ((long) i)) + ((long) i2), this.f36185.length());
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m29466() {
        return this.f36191;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m29480() {
        return this.f36190;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29454(int i, boolean z) {
        this.f36184++;
        int iMin = i < 0 ? 0 : Math.min(i, this.f36185.length());
        this.f36191 = iMin;
        this.f36190 = iMin;
        this.f36186 = iMin == this.f36185.length() || z;
        this.f36189 = false;
        m29440();
        this.f36187.m20426(iMin, iMin, false);
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m29474() {
        return this.f36186;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m29468() {
        return this.f36189;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29453(int i) {
        int i2;
        int i3;
        if (this.f36189) {
            throw new IllegalStateException("Cannot input into a range selection");
        }
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("Nibble is outside 0..15");
        }
        int i4 = this.f36190;
        boolean z = i4 == this.f36185.length();
        if (z) {
            i2 = 0;
        } else {
            byte[] bArr = new byte[1];
            this.f36185.m44653(i4, 1, bArr);
            i2 = bArr[0] & 255;
        }
        if (this.f36186) {
            i3 = 15 & i2;
            i <<= 4;
        } else {
            i3 = i2 & 240;
        }
        int i5 = i | i3;
        C12939 c12939M44652 = this.f36185.m44652();
        try {
            if (z) {
                c12939M44652.m29660(i4, i4, new byte[]{(byte) i5}, 1, null);
            } else {
                long j = ((long) i4) + 1;
                int i6 = (int) j;
                if (j != i6) {
                    throw new ArithmeticException();
                }
                c12939M44652.m29660(i4, i6, new byte[]{(byte) i5}, 1, null);
            }
            c12939M44652.m29662((InterfaceC18588) null);
            c12939M44652.close();
            if (this.f36186) {
                this.f36184++;
                this.f36186 = false;
                m29440();
                if (z) {
                    this.f36187.m20426(i4, i4, false);
                    m29448();
                }
            } else {
                long j2 = ((long) i4) + 1;
                int i7 = (int) j2;
                if (j2 != i7) {
                    throw new ArithmeticException();
                }
                m29454(i7, true);
            }
            this.f36187.m20424();
        } catch (Throwable th) {
            try {
                c12939M44652.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29455(byte[] bArr) {
        int i;
        int i2 = this.f36190;
        if (this.f36189) {
            long j = ((long) this.f36191) + 1;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        } else {
            i = i2;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f36185.m44649(i2, i, bArr);
        long length = ((long) i2) + ((long) bArr.length);
        int i3 = (int) length;
        if (length != i3) {
            throw new ArithmeticException();
        }
        m29454(i3, true);
        m29448();
        this.f36187.m20424();
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m29467() {
        if (!this.f36189) {
            throw new IllegalStateException("No range is selected");
        }
        long j = ((long) this.f36191) + 1;
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        C19644 c19644 = this.f36185;
        int i2 = this.f36190;
        C12939 c12939M44652 = c19644.m44652();
        try {
            c12939M44652.m29659(i2, i);
            c12939M44652.m29662((InterfaceC18588) null);
            c12939M44652.close();
            m29454(i, true);
            this.f36187.m20424();
        } catch (Throwable th) {
            try {
                c12939M44652.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m29465() {
        m29440();
        if (this.f36185.m44651()) {
            m29442();
            m29448();
            this.f36187.m20424();
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m29479() {
        m29440();
        if (this.f36185.m44638()) {
            m29442();
            m29448();
            this.f36187.m20424();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m29472() {
        return this.f36185.m44650();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29456() {
        return this.f36185.m44654();
    }

    /* JADX INFO: renamed from: ۘ */
    public final C15801 m29464() {
        long j;
        if (!this.f36189) {
            throw new IllegalStateException("No range is selected");
        }
        long j2 = (((long) this.f36191) - ((long) this.f36190)) + 1;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        if (i > 33554432) {
            throw new C23256();
        }
        C19644 c19644 = this.f36185;
        int i2 = this.f36190;
        int i3 = this.f36191;
        C18302 c18302M44658 = c19644.m44658();
        try {
            synchronized (C12862.class) {
                long j3 = f36182;
                j = j3 + 1;
                if (!((1 ^ j3) < 0) && !((j3 ^ j) >= 0)) {
                    throw new ArithmeticException();
                }
                f36182 = j;
                f36179 = j;
            }
            return new C15801(this, c19644, c18302M44658.m41677(), i2, i3, j, c18302M44658);
        } catch (Throwable th) {
            c18302M44658.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m29469() {
        if (!this.f36189) {
            return false;
        }
        long j = (((long) this.f36191) - ((long) this.f36190)) + 1;
        int i = (int) j;
        if (j == i) {
            return i > 33554432;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29460(C15801 c15801, C11598 c11598) {
        if (c15801.f45708 != this) {
            return false;
        }
        synchronized (c15801.f45711) {
            if (!m29459(c15801)) {
                return false;
            }
            synchronized (C12862.class) {
                if (c15801.f45707 != f36179) {
                    return false;
                }
                C11598 c11599 = f36180;
                f36180 = c11598;
                if (c11599 == null) {
                    return true;
                }
                try {
                    c11599.close();
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29459(C15801 c15801) {
        return c15801 != null && c15801.f45708 == this && this.f36185 == c15801.f45711 && c15801.f45711.m44646() == c15801.f45702 && this.f36189 && this.f36190 == c15801.f45705 && this.f36191 == c15801.f45709;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C4144 m29478() throws Throwable {
        int i;
        synchronized (C12862.class) {
            C11598 c11598 = f36180;
            C18302 c18302 = null;
            if (c11598 != null && c11598.length() != 0) {
                C22327 c22327M26694 = c11598.m26694();
                int length = c11598.length();
                try {
                    C19644 c19644 = this.f36185;
                    C18302 c18302M44658 = c19644.m44658();
                    try {
                        int i2 = this.f36190;
                        if (this.f36189) {
                            long j = ((long) this.f36191) + 1;
                            int i3 = (int) j;
                            if (j != i3) {
                                throw new ArithmeticException();
                            }
                            i = i3;
                        } else {
                            i = i2;
                        }
                        return new C4144(this, c11598, c22327M26694, c19644, c18302M44658, i2, i, length);
                    } catch (Error | RuntimeException e) {
                        c18302 = c18302M44658;
                        e = e;
                        if (c18302 != null) {
                            c18302.close();
                        }
                        try {
                            c22327M26694.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                        throw e;
                    }
                } catch (Error e3) {
                    e = e3;
                } catch (RuntimeException e4) {
                    e = e4;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m29451(C4144 c4144, C24756 c24756) throws IOException {
        if (c4144.f9147 != this) {
            throw new IllegalArgumentException("Paste request belongs to another HexData");
        }
        try {
            c4144.m8397(c24756);
            C12939 c12939M44640 = c4144.f9143.m44640(c4144.f9146);
            try {
                c12939M44640.m29660(c4144.f9153, c4144.f9142, new byte[0], 0, null);
                c12939M44640.m29661(c4144.f9153, c4144.f9145, c24756);
                long j = ((long) c4144.f9153) + ((long) c4144.f9144);
                int i = (int) j;
                if (j != i) {
                    throw new ArithmeticException();
                }
                long j2 = ((long) c4144.f9153) + ((long) c4144.f9144);
                int i2 = (int) j2;
                if (j2 != i2) {
                    throw new ArithmeticException();
                }
                c12939M44640.m29663(i, i2);
                if (C22075.m49670(c24756.f78364)) {
                    throw new C25008();
                }
                if (!c12939M44640.m29662(c24756)) {
                    throw new C25008();
                }
                long jM44646 = c4144.f9143.m44646();
                c12939M44640.close();
                return jM44646;
            } catch (Throwable th) {
                try {
                    c12939M44640.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C7614 e) {
            C11598 c11598 = c4144.f9151;
            try {
                this.f36185.m44657();
            } catch (RuntimeException e2) {
                e.addSuppressed(e2);
            } catch (C7614 e3) {
                e3.addSuppressed(e);
                throw e3;
            } catch (IOException e4) {
                e4.addSuppressed(e);
                throw e4;
            }
            synchronized (C12862.class) {
                C11598 c11599 = null;
                if (c11598 != null) {
                    C11598 c115910 = f36180;
                    if (c115910 == c11598) {
                        f36180 = null;
                        c11599 = c115910;
                    }
                }
                if (c11599 != null) {
                    try {
                        c11599.close();
                    } catch (IOException e5) {
                        e.addSuppressed(e5);
                    }
                }
                throw new IOException("Hex clipboard source changed", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29458(C4144 c4144, long j) {
        if (this.f36185 != c4144.f9143 || c4144.f9143.m44646() != j) {
            return false;
        }
        long j2 = ((long) c4144.f9153) + ((long) c4144.f9144);
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        m29454(i, true);
        m29448();
        this.f36187.m20424();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29461(C19644 c19644, long j, long j2) {
        return this.f36185 == c19644 && c19644.m44646() == j && this.f36184 == j2;
    }

    /* JADX INFO: renamed from: ֡ */
    public final long m29447() {
        return this.f36184;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29462(C19644 c19644, long j, long j2, int i, int i2) {
        if (this.f36185 != c19644 || c19644.m44646() != j || this.f36184 != j2) {
            return false;
        }
        long j3 = ((long) i) + ((long) i2);
        int i3 = (int) j3;
        if (j3 != i3) {
            throw new ArithmeticException();
        }
        m29454(i3, true);
        m29448();
        this.f36187.m20424();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29457(C4144 c4144) {
        return c4144 == null || this.f36185 == c4144.f9143;
    }

    /* JADX INFO: renamed from: ᩶ */
    public static boolean m29444() {
        boolean z;
        synchronized (C12862.class) {
            C11598 c11598 = f36180;
            z = (c11598 == null || c11598.length() == 0) ? false : true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29436(File file) {
        boolean z;
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        C12826.requireNonNull(file, "cacheDirectory");
        C12826.requireNonNull(executor, "executor");
        synchronized (C12862.class) {
            C11598 c11598 = f36180;
            if (c11598 != null && c11598.length() != 0) {
                RunnableC8426 runnableC8426 = f36181;
                if (runnableC8426 == null || !runnableC8426.m19619(c11598)) {
                    C13791 c13791 = new C13791(c11598, file);
                    if (runnableC8426 == null) {
                        runnableC8426 = new RunnableC8426(c13791);
                        f36181 = runnableC8426;
                        z = true;
                    } else {
                        runnableC8426.m19618(c13791);
                        z = false;
                    }
                    if (z) {
                        try {
                            executor.execute(runnableC8426);
                        } catch (RuntimeException unused) {
                            m29438(runnableC8426);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004a */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m29439(C24519 c24519) {
        C11598 c11598;
        C11598 c11599;
        C11598 c115910;
        Throwable th;
        C13791 c13791 = c24519.f77666;
        C11598 c115911 = null;
        try {
            C11598 c11598M50148 = c24519.f77667.m50148(null);
            try {
                if (C19644.m44600(c11598M50148)) {
                    C11598 c11598M44572 = C19644.m44572(c11598M50148, c13791.f38981);
                    try {
                        synchronized (C12862.class) {
                            try {
                                if (f36180 == c13791.f38982) {
                                    c11599 = f36180;
                                    try {
                                        f36180 = c11598M44572;
                                    } catch (Throwable th2) {
                                        c115911 = c11599;
                                        c115911 = c11598M44572;
                                        th = th2;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (Throwable unused) {
                                                c11598 = c115911;
                                                c115911 = c11598M50148;
                                                m29437(c115911);
                                                m29437(c115911);
                                                c11599 = c11598;
                                                m29437(c11599);
                                                m29437(c24519.f77667);
                                            }
                                        }
                                    }
                                } else {
                                    c11599 = null;
                                    c115911 = c11598M44572;
                                }
                                try {
                                    m29437(c11598M50148);
                                    m29437(c115911);
                                    m29437(c11599);
                                } catch (Throwable th3) {
                                    th = th3;
                                    c115910 = c115911;
                                    c115911 = c11599;
                                    c115911 = c115910;
                                    while (true) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                c115910 = c11598M44572;
                                th = th4;
                            }
                        }
                    } catch (Throwable unused2) {
                        c115911 = c11598M44572;
                    }
                } else {
                    m29437(c11598M50148);
                }
            } catch (Throwable unused3) {
                c115911 = c11598M50148;
                c11598 = c115911;
                m29437(c115911);
                m29437(c115911);
                c11599 = c11598;
                m29437(c11599);
                m29437(c24519.f77667);
            }
        } catch (Throwable unused4) {
        }
        m29437(c24519.f77667);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29437(AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            C7470.m17251(autoCloseable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m29463() {
        m29441();
        m29448();
        this.f36187.m20424();
    }

    /* JADX INFO: renamed from: ۙ */
    private void m29441() {
        this.f36184++;
        int length = this.f36185.length();
        boolean z = true;
        if (this.f36189 && length != 0) {
            int i = this.f36190;
            this.f36190 = i < 0 ? 0 : Math.min(i, length - 1);
            int i2 = this.f36191;
            int iMin = i2 >= 0 ? Math.min(i2, length - 1) : 0;
            this.f36191 = iMin;
            int i3 = this.f36190;
            if (i3 > iMin) {
                this.f36190 = iMin;
                this.f36191 = i3;
            }
        } else {
            int iMin2 = Math.min(this.f36190, length);
            this.f36191 = iMin2;
            this.f36190 = iMin2;
            if (iMin2 != length && !this.f36186) {
                z = false;
            }
            this.f36186 = z;
            this.f36189 = false;
        }
        m29440();
        this.f36187.m20426(this.f36190, this.f36191, this.f36189);
    }

    /* JADX INFO: renamed from: ۗ */
    private void m29440() {
        this.f36185.m44642(this.f36190, this.f36191, this.f36186, this.f36189);
    }

    /* JADX INFO: renamed from: ۬ */
    private void m29442() {
        C6747 c6747M44647 = this.f36185.m44647();
        if (c6747M44647 == null) {
            m29441();
            return;
        }
        this.f36184++;
        this.f36190 = c6747M44647.m15407();
        this.f36191 = c6747M44647.m15409();
        this.f36186 = c6747M44647.m15408();
        boolean zM15406 = c6747M44647.m15406();
        this.f36189 = zM15406;
        this.f36187.m20426(this.f36190, this.f36191, zM15406);
    }
}
