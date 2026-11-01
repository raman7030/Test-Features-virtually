package p067l;

import android.graphics.Insets;

/* JADX INFO: renamed from: l.ۧ۬ */
/* JADX INFO: compiled from: R1B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1388 {

    /* JADX INFO: renamed from: ܿ */
    public static final C1388 f36101 = new C1388(0, 0, 0, 0);

    /* JADX INFO: renamed from: ֫ */
    public final int f36102;

    /* JADX INFO: renamed from: ۧ */
    public final int f36103;

    /* JADX INFO: renamed from: ܽ */
    public final int f36104;

    /* JADX INFO: renamed from: ᩳ */
    public final int f36105;

    public C1388(int i, int i2, int i3, int i4) {
        this.f36103 = i;
        this.f36105 = i2;
        this.f36104 = i3;
        this.f36102 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1388 m29403(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f36101;
        }
        return new C1388(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1388 m29405(C1388 c1388, C1388 c1389) {
        return m29403(Math.max(c1388.f36103, c1389.f36103), Math.max(c1388.f36105, c1389.f36105), Math.max(c1388.f36104, c1389.f36104), Math.max(c1388.f36102, c1389.f36102));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1388.class != obj.getClass()) {
            return false;
        }
        C1388 c1388 = (C1388) obj;
        return this.f36102 == c1388.f36102 && this.f36103 == c1388.f36103 && this.f36104 == c1388.f36104 && this.f36105 == c1388.f36105;
    }

    public final int hashCode() {
        return (((((this.f36103 * 31) + this.f36105) * 31) + this.f36104) * 31) + this.f36102;
    }

    public final String toString() {
        return "Insets{left=" + this.f36103 + ", top=" + this.f36105 + ", right=" + this.f36104 + ", bottom=" + this.f36102 + '}';
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1388 m29404(Insets insets) {
        return m29403(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Insets m29406() {
        return C0933.m8279(this.f36103, this.f36105, this.f36104, this.f36102);
    }
}
