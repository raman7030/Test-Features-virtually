package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0678 extends AbstractC21162 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f2608;

    public final String toString() {
        return C4860.m14172(":containsWholeText(", this.f2608, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C0678(String str) {
        this.f2608 = str;
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        return c19815.m45568().contains(this.f2608);
    }
}
