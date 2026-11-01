package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۘ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6367 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public final String f16488;

    public final String toString() {
        return C6988.m16053(":containsOwn(", this.f16488, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C6367(String str) {
        StringBuilder sbM49323 = C21869.m49323();
        C21869.m49325(str, sbM49323, false);
        this.f16488 = C24550.m54147(C21869.m49321(sbM49323));
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        return C24550.m54147(c211910.m47897()).contains(this.f16488);
    }
}
