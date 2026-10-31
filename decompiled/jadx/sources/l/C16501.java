package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16501 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f50712;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50713;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10421 f50716;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50715 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f50714 = {-1, -1};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float[] f50717 = new float[2];

    public C16501(C10421 c10421) {
        this.f50716 = c10421;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16501 m38865(C10421 c10421) {
        C16501 c16501 = new C16501(c10421);
        c16501.f50712 = true;
        c16501.m38871(0);
        return c16501;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38870(int i) {
        int i2 = i / 64;
        if (!m38868(i2)) {
            throw new IllegalStateException("Unmeasured line width");
        }
        m38866(i2, i2 + 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38871(int i) {
        boolean z;
        int size = (int) ((((long) this.f50716.size()) + 63) / 64);
        int i2 = this.f50715;
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
            System.arraycopy(this.f50714, this.f50715, iArr, i2, this.f50713);
            System.arraycopy(this.f50717, this.f50715, fArr, i2, this.f50713);
            this.f50714 = iArr;
            this.f50717 = fArr;
            this.f50715 = i2;
            z = true;
        }
        int i4 = i / 64;
        int iMax = Math.max(this.f50713, size);
        for (int i5 = i4; i5 < iMax; i5++) {
            if (i5 < size) {
                if (!m38868(i5)) {
                    return false;
                }
            } else {
                int[] iArr2 = this.f50714;
                int i6 = this.f50715;
                iArr2[i6 + i5] = -1;
                this.f50717[i6 + i5] = 0.0f;
            }
        }
        this.f50713 = size;
        if (z) {
            for (int i7 = this.f50715 - 1; i7 > 0; i7--) {
                m38867(i7);
            }
        } else if (i4 < iMax) {
            m38866(i4, iMax);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38869() {
        return Math.max(0, this.f50714[1]);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m38868(int i) {
        int i2 = i * 64;
        C10421 c10421 = this.f50716;
        int iMin = Math.min(64, c10421.size() - i2) + i2;
        int i3 = i2;
        float f = -1.0f;
        while (i2 < iMin) {
            float f2 = c10421.getFloat(i2);
            if (f2 < 0.0f) {
                if (!this.f50712) {
                    return false;
                }
            } else if (f2 > f) {
                i3 = i2;
                f = f2;
            }
            i2++;
        }
        int[] iArr = this.f50714;
        int i4 = this.f50715 + i;
        iArr[i4] = i3;
        this.f50717[i4] = f;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38866(int i, int i2) {
        int i3 = this.f50715;
        int i4 = (i + i3) >> 1;
        int i5 = ((i3 + i2) - 1) >> 1;
        while (i4 > 0) {
            for (int i6 = i4; i6 <= i5; i6++) {
                m38867(i6);
            }
            i4 >>= 1;
            i5 >>= 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38867(int i) {
        int i2 = i * 2;
        int i3 = i2 + 1;
        int[] iArr = this.f50714;
        if (iArr[i2] < 0) {
            i2 = i3;
        } else if (iArr[i3] >= 0) {
            float[] fArr = this.f50717;
            if (fArr[i2] < fArr[i3]) {
                i2 = i3;
            }
        }
        iArr[i] = iArr[i2];
        float[] fArr2 = this.f50717;
        fArr2[i] = fArr2[i2];
    }
}
