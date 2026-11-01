package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GAXP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17402 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final Object f52037;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f52038;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17402)) {
            return false;
        }
        C17402 c17402 = (C17402) obj;
        return C13045.m29864(this.f52037, c17402.f52037) && C13045.m29864(this.f52038, c17402.f52038);
    }

    public final int hashCode() {
        Object obj = this.f52037;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f52038;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m39622() {
        return this.f52037;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m39623() {
        return this.f52038;
    }

    public C17402(Object obj, Object obj2) {
        this.f52037 = obj;
        this.f52038 = obj2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m39624() {
        return this.f52037;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m39625() {
        return this.f52038;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f52037 + ", " + this.f52038 + ')';
    }
}
