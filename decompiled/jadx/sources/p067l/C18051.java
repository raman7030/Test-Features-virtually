package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18051 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f53889;

    /* JADX INFO: renamed from: ۧ */
    public int f53890;

    /* JADX INFO: renamed from: ܿ */
    public final C12273 f53893;

    /* JADX INFO: renamed from: ܽ */
    public int f53892 = 1;

    /* JADX INFO: renamed from: ܳ */
    public int[] f53891 = {-1, -1};

    /* JADX INFO: renamed from: ᩳ */
    public float[] f53894 = new float[2];

    public C18051(C12273 c12273) {
        this.f53893 = c12273;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18051 m41091(C12273 c12273) {
        C18051 c18051 = new C18051(c12273);
        c18051.f53889 = true;
        c18051.m41097(0);
        return c18051;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41096(int i) {
        int i2 = i / 64;
        if (!m41094(i2)) {
            throw new IllegalStateException("Unmeasured line width");
        }
        m41092(i2, i2 + 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m41097(int i) {
        boolean z;
        int size = (int) ((((long) this.f53893.size()) + 63) / 64);
        int i2 = this.f53892;
        if (size <= i2) {
            z = false;
        } else {
            while (i2 < size) {
                i2 <<= 1;
            }
            int i3 = i2 * 2;
            int[] iArr = new int[i3];
            float[] fArr = new float[i3];
            Arrays.fill(iArr, -1);
            System.arraycopy(this.f53891, this.f53892, iArr, i2, this.f53890);
            System.arraycopy(this.f53894, this.f53892, fArr, i2, this.f53890);
            this.f53891 = iArr;
            this.f53894 = fArr;
            this.f53892 = i2;
            z = true;
        }
        int i4 = i / 64;
        int iMax = Math.max(this.f53890, size);
        for (int i5 = i4; i5 < iMax; i5++) {
            if (i5 < size) {
                if (!m41094(i5)) {
                    return false;
                }
            } else {
                int[] iArr2 = this.f53891;
                int i6 = this.f53892;
                iArr2[i6 + i5] = -1;
                this.f53894[i6 + i5] = 0.0f;
            }
        }
        this.f53890 = size;
        if (z) {
            for (int i7 = this.f53892 - 1; i7 > 0; i7--) {
                m41093(i7);
            }
        } else if (i4 < iMax) {
            m41092(i4, iMax);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41095() {
        return Math.max(0, this.f53891[1]);
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m41094(int i) {
        int i2 = i * 64;
        C12273 c12273 = this.f53893;
        int iMin = Math.min(64, c12273.size() - i2) + i2;
        int i3 = i2;
        float f = -1.0f;
        while (i2 < iMin) {
            float f2 = c12273.getFloat(i2);
            if (f2 < 0.0f) {
                if (!this.f53889) {
                    return false;
                }
            } else if (f2 > f) {
                i3 = i2;
                f = f2;
            }
            i2++;
        }
        int[] iArr = this.f53891;
        int i4 = this.f53892 + i;
        iArr[i4] = i3;
        this.f53894[i4] = f;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41092(int i, int i2) {
        int i3 = this.f53892;
        int i4 = (i + i3) >> 1;
        int i5 = ((i3 + i2) - 1) >> 1;
        while (i4 > 0) {
            for (int i6 = i4; i6 <= i5; i6++) {
                m41093(i6);
            }
            i4 >>= 1;
            i5 >>= 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX INFO: renamed from: ܽ */
    private void m41093(int i) {
        int i2 = i * 2;
        int i3 = i2 + 1;
        int[] iArr = this.f53891;
        if (iArr[i2] < 0) {
            i2 = i3;
        } else if (iArr[i3] >= 0) {
            float[] fArr = this.f53894;
            if (fArr[i2] < fArr[i3]) {
                i2 = i3;
            }
        }
        iArr[i] = iArr[i2];
        float[] fArr2 = this.f53894;
        fArr2[i] = fArr2[i2];
    }
}
