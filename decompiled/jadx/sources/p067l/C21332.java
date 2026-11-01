package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩶ۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F7SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21332 {

    /* JADX INFO: renamed from: ֫ */
    public final int f67253;

    /* JADX INFO: renamed from: ۧ */
    public final int f67254;

    /* JADX INFO: renamed from: ܽ */
    public final int f67255;

    /* JADX INFO: renamed from: ᩳ */
    public final int f67256;

    /* JADX INFO: renamed from: ֫ */
    public static C21332 m48336(int i, int i2, int i3, int i4) {
        return new C21332(i, i2, i3, i4);
    }

    public C21332(int i, int i2, int i3, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(C19768.m44906(i, "lineIndex ", " must be >= 0"));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C19768.m44906(i2, "columnIndex ", " must be >= 0"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(C19768.m44906(i3, "inputIndex ", " must be >= 0"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(C19768.m44906(i4, "length ", " must be >= 0"));
        }
        this.f67256 = i;
        this.f67253 = i2;
        this.f67254 = i3;
        this.f67255 = i4;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m48342() {
        return this.f67256;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48337() {
        return this.f67253;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m48340() {
        return this.f67254;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m48341() {
        return this.f67255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21332 m48338(int i) {
        return m48339(i, this.f67255);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21332 m48339(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C19768.m44906(i, "beginIndex ", " + must be >= 0"));
        }
        int i3 = this.f67255;
        if (i > i3) {
            throw new IndexOutOfBoundsException(C19768.m44907("beginIndex ", i, i3, " must be <= length "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C19768.m44906(i2, "endIndex ", " + must be >= 0"));
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(C19768.m44907("endIndex ", i2, i3, " must be <= length "));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("beginIndex ", i, i2, " must be <= endIndex "));
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new C21332(this.f67256, this.f67253 + i, this.f67254 + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21332.class == obj.getClass()) {
            C21332 c21332 = (C21332) obj;
            if (this.f67256 == c21332.f67256 && this.f67253 == c21332.f67253 && this.f67254 == c21332.f67254 && this.f67255 == c21332.f67255) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f67256), Integer.valueOf(this.f67253), Integer.valueOf(this.f67254), Integer.valueOf(this.f67255));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceSpan{line=");
        sb.append(this.f67256);
        sb.append(", column=");
        sb.append(this.f67253);
        sb.append(", input=");
        sb.append(this.f67254);
        sb.append(", length=");
        return C5410.m11876(this.f67255, C0249l.f1198d, sb);
    }
}
