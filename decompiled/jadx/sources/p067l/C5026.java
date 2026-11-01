package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۖ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5026 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final String f11521;

    public final String toString() {
        return C6988.m16053(":containsData(", this.f11521, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C5026(String str) {
        this.f11521 = C24550.m54147(str);
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return C24550.m54147(c211910.m47888()).contains(this.f11521);
    }
}
