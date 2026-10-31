package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R32H */
/* JADX INFO: loaded from: classes3.dex */
public final class C5436 extends AbstractC2614 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f16937;

    public C5436(Object obj) {
        this.f16937 = obj;
    }

    @Override // l.AbstractC2614
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8254(AbstractC21315 abstractC21315) {
        return this.f16937;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5436) {
            return this.f16937.equals(((C5436) obj).f16937);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16937.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f16937 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
