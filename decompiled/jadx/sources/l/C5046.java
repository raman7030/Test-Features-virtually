package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۚ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAMZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5046 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f15872;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f15873;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f15874;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f15875;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m14567() {
        return this.f15873;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m14568() {
        return this.f15875;
    }

    public C5046(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f15873 = i;
        this.f15875 = i2;
        this.f15874 = i3;
        this.f15872 = i4;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Rect m14569() {
        return new Rect(this.f15873, this.f15875, this.f15874, this.f15872);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m14570() {
        return this.f15874 - this.f15873;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14566() {
        return this.f15872 - this.f15875;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.f15873);
        sb.append(',');
        sb.append(this.f15875);
        sb.append(',');
        sb.append(this.f15874);
        sb.append(',');
        return C3200.m9831(this.f15872, "] }", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5046.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C5046 c5046 = (C5046) obj;
            return this.f15873 == c5046.f15873 && this.f15875 == c5046.f15875 && this.f15874 == c5046.f15874 && this.f15872 == c5046.f15872;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    public final int hashCode() {
        return (((((this.f15873 * 31) + this.f15875) * 31) + this.f15874) * 31) + this.f15872;
    }
}
