package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GAXP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15818 implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f48899;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f48900;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15818)) {
            return false;
        }
        C15818 c15818 = (C15818) obj;
        return C11233.m27802(this.f48899, c15818.f48899) && C11233.m27802(this.f48900, c15818.f48900);
    }

    public final int hashCode() {
        Object obj = this.f48899;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f48900;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m37450() {
        return this.f48899;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m37451() {
        return this.f48900;
    }

    public C15818(Object obj, Object obj2) {
        this.f48899 = obj;
        this.f48900 = obj2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m37452() {
        return this.f48899;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m37453() {
        return this.f48900;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f48899 + ", " + this.f48900 + ')';
    }
}
