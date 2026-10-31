package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F7SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19954 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f64612;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f64613;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f64614;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f64615;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19954 m46022(int i, int i2, int i3, int i4) {
        return new C19954(i, i2, i3, i4);
    }

    public C19954(int i, int i2, int i3, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException(C18307.m42645(i, "lineIndex ", " must be >= 0"));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C18307.m42645(i2, "columnIndex ", " must be >= 0"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(C18307.m42645(i3, "inputIndex ", " must be >= 0"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(C18307.m42645(i4, "length ", " must be >= 0"));
        }
        this.f64615 = i;
        this.f64612 = i2;
        this.f64613 = i3;
        this.f64614 = i4;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m46028() {
        return this.f64615;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46023() {
        return this.f64612;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46026() {
        return this.f64613;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m46027() {
        return this.f64614;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19954 m46024(int i) {
        return m46025(i, this.f64614);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19954 m46025(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i, "beginIndex ", " + must be >= 0"));
        }
        int i3 = this.f64614;
        if (i > i3) {
            throw new IndexOutOfBoundsException(C18307.m42646("beginIndex ", i, i3, " must be <= length "));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i2, "endIndex ", " + must be >= 0"));
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(C18307.m42646("endIndex ", i2, i3, " must be <= length "));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(C18307.m42646("beginIndex ", i, i2, " must be <= endIndex "));
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new C19954(this.f64615, this.f64612 + i, this.f64613 + i, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19954.class == obj.getClass()) {
            C19954 c19954 = (C19954) obj;
            if (this.f64615 == c19954.f64615 && this.f64612 == c19954.f64612 && this.f64613 == c19954.f64613 && this.f64614 == c19954.f64614) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f64615), Integer.valueOf(this.f64612), Integer.valueOf(this.f64613), Integer.valueOf(this.f64614));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceSpan{line=");
        sb.append(this.f64615);
        sb.append(", column=");
        sb.append(this.f64612);
        sb.append(", input=");
        sb.append(this.f64613);
        sb.append(", length=");
        return C3200.m9831(this.f64614, l.d, sb);
    }
}
