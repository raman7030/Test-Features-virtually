package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24408 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f77290;

    /* JADX INFO: renamed from: ۧ */
    public final int f77291;

    /* JADX INFO: renamed from: ܽ */
    public final C15020 f77292;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f77293;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean[] f77294;

    public C24408(C15020 c15020, boolean z, int[] iArr, boolean[] zArr) {
        int i = c15020.f42921;
        this.f77291 = i;
        boolean z2 = false;
        C23877.m52957(i == iArr.length && i == zArr.length);
        this.f77292 = c15020;
        if (z && i > 1) {
            z2 = true;
        }
        this.f77290 = z2;
        this.f77293 = (int[]) iArr.clone();
        this.f77294 = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15020 m53834() {
        return this.f77292;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10307 m53833(int i) {
        return this.f77292.m34395(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53835(int i, boolean z) {
        int i2 = this.f77293[i];
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m53838() {
        for (boolean z : this.f77294) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m53839() {
        for (int i = 0; i < this.f77293.length; i++) {
            if (m53835(i, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53837(int i) {
        return this.f77294[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m53836() {
        return this.f77292.f42920;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24408.class == obj.getClass()) {
            C24408 c24408 = (C24408) obj;
            if (this.f77290 == c24408.f77290 && this.f77292.equals(c24408.f77292) && Arrays.equals(this.f77293, c24408.f77293) && Arrays.equals(this.f77294, c24408.f77294)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f77294) + ((Arrays.hashCode(this.f77293) + (((this.f77292.hashCode() * 31) + (this.f77290 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(3);
        C5792.m13032(4);
    }
}
