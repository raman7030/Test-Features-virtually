package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3013 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final String f5381;

    public final String toString() {
        return C6988.m16053(":containsWholeText(", this.f5381, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C3013(String str) {
        this.f5381 = str;
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return c211910.m47879().contains(this.f5381);
    }
}
