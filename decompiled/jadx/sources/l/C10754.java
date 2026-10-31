package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۧۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10754 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16397 f32389;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f32390;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f32391;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f32392;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23097 f32393;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f32394;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19927[] f32395;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f32396;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f32397;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19927[] f32398;

    public C10754(C23097 c23097, int i, int i2, C16397 c16397) {
        int i3;
        C11003.requireNonNull(c23097, "program");
        this.f32393 = c23097;
        if (i < 0 || i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("Invalid syntax window restart recorder");
        }
        this.f32391 = i;
        long j = i;
        int iMax = (int) Math.max(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, (1023 + j) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        this.f32397 = iMax;
        if (i <= 1) {
            i3 = 0;
        } else {
            long j2 = iMax;
            i3 = (int) ((((j - 1) + j2) - 1) / j2);
        }
        this.f32392 = i3;
        if (c16397 != null && (c16397.f50457 != c23097 || c16397.f50456 != i)) {
            throw new IllegalArgumentException("Restart index and syntax window differ");
        }
        this.f32389 = c16397;
        if (i2 > 0 && i2 < i) {
            m26954(i2, c16397 == null ? null : c16397.m38648(i2), i2, null);
        }
        this.f32396 = ((long) i2) + ((long) iMax);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26957(int i, C1540 c1540) {
        if (i <= 0 || i >= this.f32391) {
            return;
        }
        long j = i;
        if (j < this.f32396) {
            return;
        }
        m26954(i, c1540.m5277(i), c1540.m5282(), c1540.m5279(i));
        this.f32396 = j + ((long) this.f32397);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26954(int i, C19927 c19927, int i2, C19927 c19928) {
        int i3;
        int i4 = this.f32397;
        int i5 = (i - 1) / i4;
        if (this.f32394 == null) {
            C16397 c16397 = this.f32389;
            if (c16397 == null) {
                i3 = 0;
                break;
            }
            int length = c16397.f50454.length - 1;
            int i6 = 0;
            while (true) {
                if (i6 > length) {
                    i3 = 0;
                    break;
                }
                int i7 = (i6 + length) >>> 1;
                int i8 = (c16397.f50454[i7] - 1) / i4;
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        i3 = c16397.f50454[i7];
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
            int i9 = this.f32392;
            this.f32394 = new int[i9];
            this.f32395 = new C19927[i9];
            this.f32390 = new int[i9];
            this.f32398 = new C19927[i9];
            if (c16397 != null) {
                for (int i10 = 0; i10 < c16397.f50454.length; i10++) {
                    int i11 = (c16397.f50454[i10] - 1) / i4;
                    this.f32394[i11] = c16397.f50454[i10];
                    this.f32395[i11] = c16397.f50455[i10];
                    this.f32390[i11] = c16397.f50459[i10];
                    this.f32398[i11] = c16397.f50458[i10];
                }
            }
        }
        int i12 = this.f32394[i5];
        if (i >= i12) {
            if (c19928 != null && this.f32398[i5] != null && this.f32390[i5] < i2 && i2 <= i12) {
                C22043 c22043 = new C22043(this.f32391);
                c22043.m49601(this.f32398[i5]);
                c22043.m49601(c19928);
                c19928 = c22043.m49603();
                i2 = this.f32390[i5];
            }
            this.f32394[i5] = i;
            this.f32395[i5] = c19927;
            this.f32390[i5] = i2;
            this.f32398[i5] = c19928;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16397 m26958() {
        int[] iArr = this.f32394;
        int i = this.f32391;
        C23097 c23097 = this.f32393;
        if (iArr == null) {
            C16397 c16397 = this.f32389;
            return c16397 == null ? C16397.m38638(c23097, i) : c16397;
        }
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != 0) {
                i2++;
            }
        }
        if (i2 == 0) {
            this.f32394 = null;
            this.f32395 = null;
            this.f32390 = null;
            this.f32398 = null;
            return C16397.m38638(c23097, i);
        }
        int i4 = 0;
        int[] iArr2 = new int[i2];
        C19927[] c19927Arr = new C19927[i2];
        int[] iArr3 = new int[i2];
        C19927[] c19927Arr2 = new C19927[i2];
        int i5 = 0;
        while (true) {
            int[] iArr4 = this.f32394;
            if (i4 < iArr4.length) {
                int i6 = iArr4[i4];
                if (i6 != 0) {
                    iArr2[i5] = i6;
                    c19927Arr[i5] = this.f32395[i4];
                    iArr3[i5] = this.f32390[i4];
                    c19927Arr2[i5] = this.f32398[i4];
                    i5++;
                }
                i4++;
            } else {
                this.f32394 = null;
                this.f32395 = null;
                this.f32390 = null;
                this.f32398 = null;
                return new C16397(this.f32393, this.f32391, iArr2, c19927Arr, iArr3, c19927Arr2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26956() {
        this.f32394 = null;
        this.f32395 = null;
        this.f32390 = null;
        this.f32398 = null;
    }
}
