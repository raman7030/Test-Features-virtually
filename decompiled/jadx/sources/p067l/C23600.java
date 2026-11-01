package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes.dex */
public final class C23600 {

    /* JADX INFO: renamed from: ֫ */
    public final int f75121;

    /* JADX INFO: renamed from: ۧ */
    public final int f75122;

    /* JADX INFO: renamed from: ܽ */
    public final int f75123;

    /* JADX INFO: renamed from: ᩳ */
    public final int f75124;

    public C23600(int i, int i2, int i3, int i4) {
        this.f75123 = i;
        this.f75121 = i2;
        this.f75124 = i3;
        this.f75122 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23600.class == obj.getClass()) {
            C23600 c23600 = (C23600) obj;
            if (this.f75123 == c23600.f75123 && this.f75121 == c23600.f75121 && this.f75124 == c23600.f75124 && this.f75122 == c23600.f75122) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f75123 * 31) + this.f75121) * 31) + this.f75124) * 31) + this.f75122;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f75123);
        sb.append(", ");
        sb.append(this.f75121);
        sb.append(") - [");
        sb.append(this.f75124);
        sb.append(", ");
        return C5410.m11876(this.f75122, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52411() {
        return this.f75123 == this.f75121 && this.f75124 == this.f75122;
    }
}
