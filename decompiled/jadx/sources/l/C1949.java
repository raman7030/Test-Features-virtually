package l;

import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֫ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1949 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22683 f6500;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f6501;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12368 f6502;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f6503;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f6504;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f6505;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12532 f6507;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f6509;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f6510;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6511;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f6512;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11122 f6513;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f6514;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f6515;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6506 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6508 = -1;

    public C1949(C11122 c11122, int i, byte[] bArr) {
        this.f6513 = c11122;
        this.f6505 = i;
        this.f6512 = bArr;
        boolean z = i == bArr.length;
        this.f6509 = z;
        this.f6501 = c11122.f33377.m19966();
        if (z) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("Pattern replacement must not be empty");
            }
            this.f6507 = new C12532(bArr);
            this.f6510 = new int[256];
            this.f6500 = null;
            this.f6502 = null;
        } else {
            this.f6507 = null;
            this.f6510 = null;
            this.f6500 = new C22683(c11122.f33377.f22840);
            this.f6502 = new C12368();
            m6417(c11122.f33377.m19966());
        }
        if (z) {
            return;
        }
        C12100 c12100 = c11122.f33377.f22840;
        int i2 = C18177.f56532;
        m6413(c12100 == null ? 0L : c12100.f36168, c11122.f33377.m19966());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6419(int i, int[] iArr) {
        int i2;
        C11003.requireNonNull(iArr, "originalOffsets");
        int i3 = 0;
        C9005.m23245(iArr.length, 0, i);
        synchronized (this.f6513.f33366) {
            try {
                try {
                    C11122 c11122 = this.f6513;
                    c11122.m27577();
                    if (!this.f6503 && c11122.f33378 == this) {
                        if (this.f6509) {
                            while (i3 < i) {
                                m6415(iArr[i3]);
                                i3++;
                            }
                        } else {
                            while (i3 < i) {
                                int i4 = iArr[i3];
                                int i5 = 1;
                                while (true) {
                                    i2 = i3 + i5;
                                    if (i2 >= i || ((long) iArr[i2 - 1]) + ((long) this.f6505) != iArr[i2]) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                m6416(i4, i5);
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
                if (!this.f6513.f33367) {
                    this.f6513.m27552();
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6420(InterfaceC17066 interfaceC17066) {
        C9047 c9047 = null;
        InterfaceC17066 interfaceC17066M38504 = interfaceC17066 == null ? null : C16360.m38504(interfaceC17066);
        synchronized (this.f6513.f33366) {
            try {
                try {
                    C11122 c11122 = this.f6513;
                    c11122.m27577();
                    if (!this.f6503 && c11122.f33378 == this) {
                        if (interfaceC17066M38504 != null) {
                            C11122.m27558(this.f6513, interfaceC17066M38504);
                        }
                        if (this.f6514 != 0) {
                            if (this.f6509) {
                                m6414();
                            } else {
                                int i = this.f6504;
                                if (i != 0) {
                                    this.f6500.m50673(i);
                                    this.f6504 = 0;
                                }
                                this.f6500.m50674(this.f6513.f33377.m19966(), interfaceC17066M38504);
                                if (C18177.m42360(m6413(this.f6500.m50676(), this.f6501))) {
                                    C12100 c12100M50672 = this.f6500.m50672();
                                    if (this.f6501 != 0) {
                                        C13073 c13073M30082 = this.f6502.m30082(interfaceC17066M38504);
                                        if (C18177.m42360(C1005.m3495(this.f6500.m50676(), C1005.m3495(C1005.m3495(C1005.m3495(this.f6512.length, C1005.m3495(c13073M30082.m31678(), 88L)), C1005.m3495(this.f6513.f33374, C1005.m3495(C19631.m45118(this.f6513.f33377.f22836), C1005.m3495(C19631.m45128(this.f6513.f33377.f22836), C19631.m45142(this.f6513.f33377.f22836))))), C19631.m45094(1L))))) {
                                            C6018 c6018 = new C6018(this.f6513.f33377.f22836, this.f6513.f33377.m19966(), (int) this.f6501, this.f6505, this.f6512, c13073M30082);
                                            this.f6513.m27574(new InterfaceC18883[]{c6018});
                                            C9047 c9047M45107 = C19631.m45107(c6018);
                                            this.f6513.f33374 = c6018.f18473;
                                            this.f6513.f33371 = c6018.mo11897();
                                            c9047 = c9047M45107;
                                        } else {
                                            throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                                        }
                                    }
                                    long j = c9047 == null ? 0 : c9047.f27431;
                                    long j2 = this.f6501;
                                    if (j == j2) {
                                        if ((c12100M50672 == null ? 0 : c12100M50672.f36167) == j2) {
                                            this.f6513.f33375 = c9047;
                                            this.f6513.f33363 = c12100M50672;
                                            C4108 c4108M45129 = C19631.m45129(c9047);
                                            this.f6513.f33364 = c4108M45129.m12331();
                                            this.f6513.f33365 = c4108M45129.m12332();
                                            if (this.f6513.f33364 > X931RNG.BLOCK128_RESEED_MAX) {
                                                throw new IllegalStateException("Literal heap storage exceeds memory limit");
                                            }
                                            this.f6513.f33362 = 0L;
                                            C11122.m27590(this.f6513);
                                        }
                                    }
                                    throw new IllegalStateException("Batch replacement length mismatch");
                                }
                                throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                            }
                            if (interfaceC17066M38504 != null) {
                                C11122.m27558(this.f6513, interfaceC17066M38504);
                            }
                            this.f6513.f33380 = true;
                            this.f6513.f33372 = true;
                        }
                        this.f6503 = true;
                        this.f6513.f33378 = null;
                    } else {
                        throw new IllegalStateException("Batch replacement is not active");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (!this.f6513.f33367) {
                    this.f6513.m27552();
                    throw e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6414() {
        if (this.f6511 == 0) {
            return;
        }
        C11122 c11122 = this.f6513;
        C9047 c9047 = c11122.f33375;
        int[] iArr = this.f6510;
        int i = this.f6511;
        int i2 = this.f6505;
        long jM45098 = C19631.m45098(c9047, iArr, i, i2);
        long jM3495 = C1005.m3495(C1005.m3495(C1005.m3495(C1005.m3495(C19631.m45128(c11122.f33375), C1005.m3495(c11122.f33362, c11122.f33374)), C19631.m45118(c11122.f33375)), C13510.m32558(c11122.f33363)), C1005.m3495(jM45098 * 960, C1005.m3495(C18177.m42300(c11122.f33377.m19966(), this.f6511, i2, this.f6510), C18177.m42350(c11122.f33377.m19966(), this.f6511, i2, this.f6510))));
        boolean z = this.f6515;
        C12532 c12532 = this.f6507;
        if (!z) {
            jM3495 = C1005.m3495(jM3495, c12532.m30741());
        }
        if (!C18177.m42360(jM3495)) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
        c11122.f33375 = C19631.m45106(c11122.f33375, this.f6510, this.f6511, i2, c12532);
        if (!this.f6515) {
            c11122.f33362 = C1005.m3495(c11122.f33362, c12532.m30741());
            this.f6515 = true;
        }
        c11122.f33363 = C13510.m32545(c11122.f33363, this.f6510, this.f6511, i2);
        C11122.m27590(c11122);
        this.f6511 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6415(int i) {
        if (!this.f6509) {
            m6416(i, 1);
            return;
        }
        int i2 = this.f6505;
        long j = ((long) i) + ((long) i2);
        if (i < 0 || i < this.f6508 || j > this.f6513.f33377.m19966()) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Invalid batch match offset "));
        }
        long length = (this.f6501 + ((long) this.f6512.length)) - ((long) i2);
        if (length > 2147483647L) {
            throw new C7161();
        }
        int i3 = i >>> 16;
        if (this.f6511 != 0 && i3 != this.f6506) {
            m6414();
        }
        this.f6506 = i3;
        int i4 = this.f6511 + 1;
        int[] iArr = this.f6510;
        if (i4 > iArr.length) {
            this.f6510 = Arrays.copyOf(this.f6510, Math.min(65536, Math.max(i4, iArr.length << 1)));
        }
        int[] iArr2 = this.f6510;
        int i5 = this.f6511;
        this.f6511 = i5 + 1;
        iArr2[i5] = i;
        this.f6501 = length;
        this.f6508 = (int) j;
        this.f6514++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6416(int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Empty replacement run");
        }
        int i3 = this.f6505;
        long j = i2;
        long j2 = ((long) i3) * j;
        long j3 = ((long) i) + j2;
        if (i < 0 || i < this.f6508 || j3 > this.f6513.f33377.m19966()) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Invalid batch match run "));
        }
        long length = ((long) this.f6512.length) * j;
        long j4 = (this.f6501 + length) - j2;
        if (j4 > 2147483647L) {
            throw new C7161();
        }
        this.f6502.m30083(i, i3, i2);
        m6417(j4);
        C22683 c22683 = this.f6500;
        if (c22683.m50678() < i) {
            int i4 = this.f6504;
            if (i4 != 0) {
                c22683.m50673(i4);
                this.f6504 = 0;
            }
            c22683.m50677(i);
        }
        c22683.m50679((int) j2);
        long j5 = ((long) this.f6504) + ((long) ((int) length));
        int i5 = (int) j5;
        if (j5 != i5) {
            throw new ArithmeticException();
        }
        this.f6504 = i5;
        if (!C18177.m42360(m6413(c22683.m50676(), j4))) {
            throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
        }
        this.f6501 = j4;
        this.f6508 = (int) j3;
        this.f6514 += j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m6413(long j, long j2) {
        C11122 c11122 = this.f6513;
        return C1005.m3495(C1005.m3495(C1005.m3495(C1005.m3495(C1005.m3495(C1005.m3495(C1005.m3495(c11122.f33374, C1005.m3495(this.f6512.length, 88L)), this.f6502.m30081()), C19631.m45118(c11122.f33377.f22836)), C19631.m45128(c11122.f33377.f22836)), C19631.m45142(c11122.f33377.f22836)), j), C13510.m32535(j2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6417(long j) {
        C22683 c22683 = this.f6500;
        if (c22683 == null) {
            return;
        }
        C11122 c11122 = this.f6513;
        c22683.m50675(Math.max(0L, 67108864 - C1005.m3495(C1005.m3495(C1005.m3495(c11122.f33374, C1005.m3495(C1005.m3495(this.f6512.length, 88L), C1005.m3495(this.f6502.m30081(), C1005.m3495(C19631.m45118(c11122.f33377.f22836), C1005.m3495(C19631.m45128(c11122.f33377.f22836), C19631.m45142(c11122.f33377.f22836)))))), C13510.m32535(j)), 8272L)));
    }
}
