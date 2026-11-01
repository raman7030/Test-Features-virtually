package p067l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۚ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAMZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7164 {

    /* JADX INFO: renamed from: ֫ */
    public final int f18704;

    /* JADX INFO: renamed from: ۧ */
    public final int f18705;

    /* JADX INFO: renamed from: ܽ */
    public final int f18706;

    /* JADX INFO: renamed from: ᩳ */
    public final int f18707;

    /* JADX INFO: renamed from: ۧ */
    public final int m16471() {
        return this.f18705;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m16472() {
        return this.f18707;
    }

    public C7164(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f18705 = i;
        this.f18707 = i2;
        this.f18706 = i3;
        this.f18704 = i4;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Rect m16473() {
        return new Rect(this.f18705, this.f18707, this.f18706, this.f18704);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m16474() {
        return this.f18706 - this.f18705;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16470() {
        return this.f18704 - this.f18707;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.f18705);
        sb.append(',');
        sb.append(this.f18707);
        sb.append(',');
        sb.append(this.f18706);
        sb.append(',');
        return C5410.m11876(this.f18704, "] }", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7164.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C7164 c7164 = (C7164) obj;
            return this.f18705 == c7164.f18705 && this.f18707 == c7164.f18707 && this.f18706 == c7164.f18706 && this.f18704 == c7164.f18704;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    public final int hashCode() {
        return (((((this.f18705 * 31) + this.f18707) * 31) + this.f18706) * 31) + this.f18704;
    }
}
