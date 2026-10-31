package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes.dex */
public final class C22340 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f72395;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f72396;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f72397;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f72398;

    public C22340(int i, int i2, int i3, int i4) {
        this.f72397 = i;
        this.f72395 = i2;
        this.f72398 = i3;
        this.f72396 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22340.class == obj.getClass()) {
            C22340 c22340 = (C22340) obj;
            if (this.f72397 == c22340.f72397 && this.f72395 == c22340.f72395 && this.f72398 == c22340.f72398 && this.f72396 == c22340.f72396) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f72397 * 31) + this.f72395) * 31) + this.f72398) * 31) + this.f72396;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f72397);
        sb.append(", ");
        sb.append(this.f72395);
        sb.append(") - [");
        sb.append(this.f72398);
        sb.append(", ");
        return C3200.m9831(this.f72396, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50072() {
        return this.f72397 == this.f72395 && this.f72398 == this.f72396;
    }
}
