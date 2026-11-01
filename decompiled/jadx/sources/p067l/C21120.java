package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21120 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final String f66383;

    public final String toString() {
        return C6988.m16053(":containsWholeOwnText(", this.f66383, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C21120(String str) {
        this.f66383 = str;
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return c211910.m47877().contains(this.f66383);
    }
}
