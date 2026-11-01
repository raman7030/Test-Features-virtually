package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ۠ */
/* JADX INFO: compiled from: 31KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C1626 {

    /* JADX INFO: renamed from: ֫ */
    public float f51872;

    /* JADX INFO: renamed from: ܿ */
    public boolean f51880;

    /* JADX INFO: renamed from: ᩷ */
    public EnumC1276 f51882;

    /* JADX INFO: renamed from: ᩳ */
    public int f51881 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f51876 = -1;

    /* JADX INFO: renamed from: ۢ */
    public int f51875 = 0;

    /* JADX INFO: renamed from: ܳ */
    public boolean f51877 = false;

    /* JADX INFO: renamed from: ۡ */
    public float[] f51874 = new float[9];

    /* JADX INFO: renamed from: ܽ */
    public float[] f51879 = new float[9];

    /* JADX INFO: renamed from: ᩻ */
    public C1381[] f51883 = new C1381[16];

    /* JADX INFO: renamed from: ۜ */
    public int f51873 = 0;

    /* JADX INFO: renamed from: ܺ */
    public int f51878 = 0;

    public C1626(EnumC1276 enumC1276) {
        this.f51882 = enumC1276;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39608(C1381 c1381) {
        int i = 0;
        while (true) {
            int i2 = this.f51873;
            if (i < i2) {
                if (this.f51883[i] == c1381) {
                    return;
                } else {
                    i++;
                }
            } else {
                C1381[] c1381Arr = this.f51883;
                if (i2 >= c1381Arr.length) {
                    this.f51883 = (C1381[]) Arrays.copyOf(c1381Arr, c1381Arr.length * 2);
                }
                C1381[] c1381Arr2 = this.f51883;
                int i3 = this.f51873;
                c1381Arr2[i3] = c1381;
                this.f51873 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39611(C1381 c1381) {
        int i = this.f51873;
        int i2 = 0;
        while (i2 < i) {
            if (this.f51883[i2] == c1381) {
                while (i2 < i - 1) {
                    C1381[] c1381Arr = this.f51883;
                    int i3 = i2 + 1;
                    c1381Arr[i2] = c1381Arr[i3];
                    i2 = i3;
                }
                this.f51873--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39610(C1696 c1696, C1381 c1381) {
        int i = this.f51873;
        for (int i2 = 0; i2 < i; i2++) {
            this.f51883[i2].mo26297(c1696, c1381, false);
        }
        this.f51873 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39609(C1696 c1696, float f) {
        this.f51872 = f;
        this.f51877 = true;
        int i = this.f51873;
        this.f51876 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f51883[i2].m29207(c1696, this, false);
        }
        this.f51873 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39607() {
        this.f51882 = EnumC1276.UNKNOWN;
        this.f51875 = 0;
        this.f51881 = -1;
        this.f51876 = -1;
        this.f51872 = 0.0f;
        this.f51877 = false;
        int i = this.f51873;
        for (int i2 = 0; i2 < i; i2++) {
            this.f51883[i2] = null;
        }
        this.f51873 = 0;
        this.f51878 = 0;
        this.f51880 = false;
        Arrays.fill(this.f51879, 0.0f);
    }

    public final String toString() {
        return "" + this.f51881;
    }
}
