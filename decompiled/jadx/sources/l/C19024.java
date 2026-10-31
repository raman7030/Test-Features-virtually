package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩴ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19024 extends AbstractC21162 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f59935;

    public final String toString() {
        return C4860.m14172(":contains(", this.f59935, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C19024(String str) {
        StringBuilder sbM47000 = C20519.m47000();
        C20519.m47002(str, sbM47000, false);
        this.f59935 = C23340.m51750(C20519.m46998(sbM47000));
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        return C23340.m51750(c19815.m45576()).contains(this.f59935);
    }
}
