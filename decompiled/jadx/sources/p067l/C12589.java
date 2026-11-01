package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۧۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12589 {

    /* JADX INFO: renamed from: ֫ */
    public final C17952 f35364;

    /* JADX INFO: renamed from: ۜ */
    public int[] f35365;

    /* JADX INFO: renamed from: ۢ */
    public final int f35366;

    /* JADX INFO: renamed from: ۧ */
    public final int f35367;

    /* JADX INFO: renamed from: ܳ */
    public final C24320 f35368;

    /* JADX INFO: renamed from: ܽ */
    public int[] f35369;

    /* JADX INFO: renamed from: ܿ */
    public C21307[] f35370;

    /* JADX INFO: renamed from: ᩳ */
    public long f35371;

    /* JADX INFO: renamed from: ᩷ */
    public final int f35372;

    /* JADX INFO: renamed from: ᩻ */
    public C21307[] f35373;

    public C12589(C24320 c24320, int i, int i2, C17952 c17952) {
        int i3;
        C12826.requireNonNull(c24320, "program");
        this.f35368 = c24320;
        if (i < 0 || i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("Invalid syntax window restart recorder");
        }
        this.f35366 = i;
        long j = i;
        int iMax = (int) Math.max(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, (1023 + j) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        this.f35372 = iMax;
        if (i <= 1) {
            i3 = 0;
        } else {
            long j2 = iMax;
            i3 = (int) ((((j - 1) + j2) - 1) / j2);
        }
        this.f35367 = i3;
        if (c17952 != null && (c17952.f53629 != c24320 || c17952.f53628 != i)) {
            throw new IllegalArgumentException("Restart index and syntax window differ");
        }
        this.f35364 = c17952;
        if (i2 > 0 && i2 < i) {
            m28998(i2, c17952 == null ? null : c17952.m40864(i2), i2, null);
        }
        this.f35371 = ((long) i2) + ((long) iMax);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29001(int i, C3832 c3832) {
        if (i <= 0 || i >= this.f35366) {
            return;
        }
        long j = i;
        if (j < this.f35371) {
            return;
        }
        m28998(i, c3832.m7506(i), c3832.m7511(), c3832.m7508(i));
        this.f35371 = j + ((long) this.f35372);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m28998(int i, C21307 c21307, int i2, C21307 c21308) {
        int i3;
        int i4 = this.f35372;
        int i5 = (i - 1) / i4;
        if (this.f35369 == null) {
            C17952 c17952 = this.f35364;
            if (c17952 == null) {
                i3 = 0;
                break;
            }
            int length = c17952.f53626.length - 1;
            int i6 = 0;
            while (true) {
                if (i6 > length) {
                    i3 = 0;
                    break;
                }
                int i7 = (i6 + length) >>> 1;
                int i8 = (c17952.f53626[i7] - 1) / i4;
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        i3 = c17952.f53626[i7];
                        break;
                    }
                    length = i7 - 1;
                } else {
                    i6 = i7 + 1;
                }
            }
            if (i3 >= i) {
                return;
            }
            int i9 = this.f35367;
            this.f35369 = new int[i9];
            this.f35370 = new C21307[i9];
            this.f35365 = new int[i9];
            this.f35373 = new C21307[i9];
            if (c17952 != null) {
                for (int i10 = 0; i10 < c17952.f53626.length; i10++) {
                    int i11 = (c17952.f53626[i10] - 1) / i4;
                    this.f35369[i11] = c17952.f53626[i10];
                    this.f35370[i11] = c17952.f53627[i10];
                    this.f35365[i11] = c17952.f53631[i10];
                    this.f35373[i11] = c17952.f53630[i10];
                }
            }
        }
        int i12 = this.f35369[i5];
        if (i >= i12) {
            if (c21308 != null && this.f35373[i5] != null && this.f35365[i5] < i2 && i2 <= i12) {
                C23318 c23318 = new C23318(this.f35366);
                c23318.m51937(this.f35373[i5]);
                c23318.m51937(c21308);
                c21308 = c23318.m51939();
                i2 = this.f35365[i5];
            }
            this.f35369[i5] = i;
            this.f35370[i5] = c21307;
            this.f35365[i5] = i2;
            this.f35373[i5] = c21308;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17952 m29002() {
        int[] iArr = this.f35369;
        int i = this.f35366;
        C24320 c24320 = this.f35368;
        if (iArr == null) {
            C17952 c17952 = this.f35364;
            return c17952 == null ? C17952.m40854(c24320, i) : c17952;
        }
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != 0) {
                i2++;
            }
        }
        if (i2 == 0) {
            this.f35369 = null;
            this.f35370 = null;
            this.f35365 = null;
            this.f35373 = null;
            return C17952.m40854(c24320, i);
        }
        int i4 = 0;
        int[] iArr2 = new int[i2];
        C21307[] c21307Arr = new C21307[i2];
        int[] iArr3 = new int[i2];
        C21307[] c21307Arr2 = new C21307[i2];
        int i5 = 0;
        while (true) {
            int[] iArr4 = this.f35369;
            if (i4 < iArr4.length) {
                int i6 = iArr4[i4];
                if (i6 != 0) {
                    iArr2[i5] = i6;
                    c21307Arr[i5] = this.f35370[i4];
                    iArr3[i5] = this.f35365[i4];
                    c21307Arr2[i5] = this.f35373[i4];
                    i5++;
                }
                i4++;
            } else {
                this.f35369 = null;
                this.f35370 = null;
                this.f35365 = null;
                this.f35373 = null;
                return new C17952(this.f35368, this.f35366, iArr2, c21307Arr, iArr3, c21307Arr2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29000() {
        this.f35369 = null;
        this.f35370 = null;
        this.f35365 = null;
        this.f35373 = null;
    }
}
