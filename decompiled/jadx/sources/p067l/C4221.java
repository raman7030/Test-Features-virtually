package p067l;

import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֫ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C4221 {

    /* JADX INFO: renamed from: ֫ */
    public final C23926 f9279;

    /* JADX INFO: renamed from: ۖ */
    public long f9280;

    /* JADX INFO: renamed from: ۘ */
    public final C14123 f9281;

    /* JADX INFO: renamed from: ۜ */
    public boolean f9282;

    /* JADX INFO: renamed from: ۡ */
    public int f9283;

    /* JADX INFO: renamed from: ۢ */
    public final int f9284;

    /* JADX INFO: renamed from: ܳ */
    public final C14279 f9286;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f9288;

    /* JADX INFO: renamed from: ܿ */
    public int[] f9289;

    /* JADX INFO: renamed from: ᩳ */
    public int f9290;

    /* JADX INFO: renamed from: ᩴ */
    public final byte[] f9291;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ C12939 f9292;

    /* JADX INFO: renamed from: ᩷ */
    public long f9293;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f9294;

    /* JADX INFO: renamed from: ۧ */
    public int f9285 = -1;

    /* JADX INFO: renamed from: ܺ */
    public int f9287 = -1;

    public C4221(C12939 c12939, int i, byte[] bArr) {
        this.f9292 = c12939;
        this.f9284 = i;
        this.f9291 = bArr;
        boolean z = i == bArr.length;
        this.f9288 = z;
        this.f9280 = c12939.f36377.m21940();
        if (z) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("Pattern replacement must not be empty");
            }
            this.f9286 = new C14279(bArr);
            this.f9289 = new int[256];
            this.f9279 = null;
            this.f9281 = null;
        } else {
            this.f9286 = null;
            this.f9289 = null;
            this.f9279 = new C23926(c12939.f36377.f25753);
            this.f9281 = new C14123();
            m8574(c12939.f36377.m21940());
        }
        if (z) {
            return;
        }
        C13868 c13868 = c12939.f36377.f25753;
        int i2 = C19644.f59746;
        m8570(c13868 == null ? 0L : c13868.f39179, c12939.f36377.m21940());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8576(int i, int[] iArr) {
        int i2;
        C12826.requireNonNull(iArr, "originalOffsets");
        int i3 = 0;
        C10927.m25189(iArr.length, 0, i);
        synchronized (this.f9292.f36366) {
            try {
                try {
                    C12939 c12939 = this.f9292;
                    c12939.m29639();
                    if (!this.f9282 && c12939.f36378 == this) {
                        if (this.f9288) {
                            while (i3 < i) {
                                m8572(iArr[i3]);
                                i3++;
                            }
                        } else {
                            while (i3 < i) {
                                int i4 = iArr[i3];
                                int i5 = 1;
                                while (true) {
                                    i2 = i3 + i5;
                                    if (i2 >= i || ((long) iArr[i2 - 1]) + ((long) this.f9284) != iArr[i2]) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                m8573(i4, i5);
                                i3 = i2;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Batch replacement is not active");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Error | RuntimeException e) {
                if (!this.f9292.f36367) {
                    this.f9292.m29614();
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8577(InterfaceC18588 interfaceC18588) {
        C10967 c10967 = null;
        InterfaceC18588 interfaceC18588M40721 = interfaceC18588 == null ? null : C17917.m40721(interfaceC18588);
        synchronized (this.f9292.f36366) {
            try {
                try {
                    C12939 c12939 = this.f9292;
                    c12939.m29639();
                    if (!this.f9282 && c12939.f36378 == this) {
                        if (interfaceC18588M40721 != null) {
                            C12939.m29620(this.f9292, interfaceC18588M40721);
                        }
                        if (this.f9293 != 0) {
                            if (this.f9288) {
                                m8571();
                            } else {
                                int i = this.f9283;
                                if (i != 0) {
                                    this.f9279.m52999(i);
                                    this.f9283 = 0;
                                }
                                this.f9279.m53000(this.f9292.f36377.m21940(), interfaceC18588M40721);
                                if (C19644.m44621(m8570(this.f9279.m53002(), this.f9280))) {
                                    C13868 c13868M52998 = this.f9279.m52998();
                                    if (this.f9280 != 0) {
                                        C14793 c14793M32143 = this.f9281.m32143(interfaceC18588M40721);
                                        if (C19644.m44621(C0892.m55743(this.f9279.m53002(), C0892.m55743(C0892.m55743(C0892.m55743(this.f9291.length, C0892.m55743(c14793M32143.m33766(), 88L)), C0892.m55743(this.f9292.f36374, C0892.m55743(C21026.m47414(this.f9292.f36377.f25749), C0892.m55743(C21026.m47424(this.f9292.f36377.f25749), C21026.m47438(this.f9292.f36377.f25749))))), C21026.m47390(1L))))) {
                                            C8088 c8088 = new C8088(this.f9292.f36377.f25749, this.f9292.f36377.m21940(), (int) this.f9280, this.f9284, this.f9291, c14793M32143);
                                            this.f9292.m29636(new InterfaceC20315[]{c8088});
                                            C10967 c10967M47403 = C21026.m47403(c8088);
                                            this.f9292.f36374 = c8088.f21328;
                                            this.f9292.f36371 = c8088.mo13833();
                                            c10967 = c10967M47403;
                                        } else {
                                            throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                                        }
                                    }
                                    long j = c10967 == null ? 0 : c10967.f30368;
                                    long j2 = this.f9280;
                                    if (j == j2) {
                                        if ((c13868M52998 == null ? 0 : c13868M52998.f39178) == j2) {
                                            this.f9292.f36375 = c10967;
                                            this.f9292.f36363 = c13868M52998;
                                            C6273 c6273M47425 = C21026.m47425(c10967);
                                            this.f9292.f36364 = c6273M47425.m14236();
                                            this.f9292.f36365 = c6273M47425.m14237();
                                            if (this.f9292.f36364 > X931RNG.BLOCK128_RESEED_MAX) {
                                                throw new IllegalStateException("Literal heap storage exceeds memory limit");
                                            }
                                            this.f9292.f36362 = 0L;
                                            C12939.m29652(this.f9292);
                                        }
                                    }
                                    throw new IllegalStateException("Batch replacement length mismatch");
                                }
                                throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                            }
                            if (interfaceC18588M40721 != null) {
                                C12939.m29620(this.f9292, interfaceC18588M40721);
                            }
                            this.f9292.f36380 = true;
                            this.f9292.f36372 = true;
                        }
                        this.f9282 = true;
                        this.f9292.f36378 = null;
                    } else {
                        throw new IllegalStateException("Batch replacement is not active");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (!this.f9292.f36367) {
                    this.f9292.m29614();
                    throw e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8571() {
        if (this.f9290 == 0) {
            return;
        }
        C12939 c12939 = this.f9292;
        C10967 c10967 = c12939.f36375;
        int[] iArr = this.f9289;
        int i = this.f9290;
        int i2 = this.f9284;
        long jM47394 = C21026.m47394(c10967, iArr, i, i2);
        long jM55743 = C0892.m55743(C0892.m55743(C0892.m55743(C0892.m55743(C21026.m47424(c12939.f36375), C0892.m55743(c12939.f36362, c12939.f36374)), C21026.m47414(c12939.f36375)), C15208.m34660(c12939.f36363)), C0892.m55743(jM47394 * 960, C0892.m55743(C19644.m44561(c12939.f36377.m21940(), this.f9290, i2, this.f9289), C19644.m44611(c12939.f36377.m21940(), this.f9290, i2, this.f9289))));
        boolean z = this.f9294;
        C14279 c14279 = this.f9286;
        if (!z) {
            jM55743 = C0892.m55743(jM55743, c14279.m32813());
        }
        if (!C19644.m44621(jM55743)) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
        c12939.f36375 = C21026.m47402(c12939.f36375, this.f9289, this.f9290, i2, c14279);
        if (!this.f9294) {
            c12939.f36362 = C0892.m55743(c12939.f36362, c14279.m32813());
            this.f9294 = true;
        }
        c12939.f36363 = C15208.m34647(c12939.f36363, this.f9289, this.f9290, i2);
        C12939.m29652(c12939);
        this.f9290 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8572(int i) {
        if (!this.f9288) {
            m8573(i, 1);
            return;
        }
        int i2 = this.f9284;
        long j = ((long) i) + ((long) i2);
        if (i < 0 || i < this.f9287 || j > this.f9292.f36377.m21940()) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Invalid batch match offset "));
        }
        long length = (this.f9280 + ((long) this.f9291.length)) - ((long) i2);
        if (length > 2147483647L) {
            throw new C9174();
        }
        int i3 = i >>> 16;
        if (this.f9290 != 0 && i3 != this.f9285) {
            m8571();
        }
        this.f9285 = i3;
        int i4 = this.f9290 + 1;
        int[] iArr = this.f9289;
        if (i4 > iArr.length) {
            this.f9289 = Arrays.copyOf(this.f9289, Math.min(65536, Math.max(i4, iArr.length << 1)));
        }
        int[] iArr2 = this.f9289;
        int i5 = this.f9290;
        this.f9290 = i5 + 1;
        iArr2[i5] = i;
        this.f9280 = length;
        this.f9287 = (int) j;
        this.f9293++;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8573(int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Empty replacement run");
        }
        int i3 = this.f9284;
        long j = i2;
        long j2 = ((long) i3) * j;
        long j3 = ((long) i) + j2;
        if (i < 0 || i < this.f9287 || j3 > this.f9292.f36377.m21940()) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Invalid batch match run "));
        }
        long length = ((long) this.f9291.length) * j;
        long j4 = (this.f9280 + length) - j2;
        if (j4 > 2147483647L) {
            throw new C9174();
        }
        this.f9281.m32144(i, i3, i2);
        m8574(j4);
        C23926 c23926 = this.f9279;
        if (c23926.m53004() < i) {
            int i4 = this.f9283;
            if (i4 != 0) {
                c23926.m52999(i4);
                this.f9283 = 0;
            }
            c23926.m53003(i);
        }
        c23926.m53005((int) j2);
        long j5 = ((long) this.f9283) + ((long) ((int) length));
        int i5 = (int) j5;
        if (j5 != i5) {
            throw new ArithmeticException();
        }
        this.f9283 = i5;
        if (!C19644.m44621(m8570(c23926.m53002(), j4))) {
            throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
        }
        this.f9280 = j4;
        this.f9287 = (int) j3;
        this.f9293 += j;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m8570(long j, long j2) {
        C12939 c12939 = this.f9292;
        return C0892.m55743(C0892.m55743(C0892.m55743(C0892.m55743(C0892.m55743(C0892.m55743(C0892.m55743(c12939.f36374, C0892.m55743(this.f9291.length, 88L)), this.f9281.m32142()), C21026.m47414(c12939.f36377.f25749)), C21026.m47424(c12939.f36377.f25749)), C21026.m47438(c12939.f36377.f25749)), j), C15208.m34637(j2));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8574(long j) {
        C23926 c23926 = this.f9279;
        if (c23926 == null) {
            return;
        }
        C12939 c12939 = this.f9292;
        c23926.m53001(Math.max(0L, 67108864 - C0892.m55743(C0892.m55743(C0892.m55743(c12939.f36374, C0892.m55743(C0892.m55743(this.f9291.length, 88L), C0892.m55743(this.f9281.m32142(), C0892.m55743(C21026.m47414(c12939.f36377.f25749), C0892.m55743(C21026.m47424(c12939.f36377.f25749), C21026.m47438(c12939.f36377.f25749)))))), C15208.m34637(j)), 8272L)));
    }
}
