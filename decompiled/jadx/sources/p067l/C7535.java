package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R32H */
/* JADX INFO: loaded from: classes3.dex */
public final class C7535 extends AbstractC4853 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f19777;

    public C7535(Object obj) {
        this.f19777 = obj;
    }

    @Override // p067l.AbstractC4853
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10298(AbstractC22626 abstractC22626) {
        return this.f19777;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7535) {
            return this.f19777.equals(((C7535) obj).f19777);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19777.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f19777 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
