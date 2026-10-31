package l;

import android.graphics.Insets;

/* JADX INFO: renamed from: l.ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R1B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11007 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C11007 f33107 = new C11007(0, 0, 0, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f33108;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33109;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33110;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f33111;

    public C11007(int i, int i2, int i3, int i4) {
        this.f33109 = i;
        this.f33111 = i2;
        this.f33110 = i3;
        this.f33108 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11007 m27341(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f33107;
        }
        return new C11007(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11007 m27343(C11007 c11007, C11007 c11008) {
        return m27341(Math.max(c11007.f33109, c11008.f33109), Math.max(c11007.f33111, c11008.f33111), Math.max(c11007.f33110, c11008.f33110), Math.max(c11007.f33108, c11008.f33108));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11007.class != obj.getClass()) {
            return false;
        }
        C11007 c11007 = (C11007) obj;
        return this.f33108 == c11007.f33108 && this.f33109 == c11007.f33109 && this.f33110 == c11007.f33110 && this.f33111 == c11007.f33111;
    }

    public final int hashCode() {
        return (((((this.f33109 * 31) + this.f33111) * 31) + this.f33110) * 31) + this.f33108;
    }

    public final String toString() {
        return "Insets{left=" + this.f33109 + ", top=" + this.f33111 + ", right=" + this.f33110 + ", bottom=" + this.f33108 + '}';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11007 m27342(Insets insets) {
        return m27341(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Insets m27344() {
        return C1834.m6081(this.f33109, this.f33111, this.f33110, this.f33108);
    }
}
