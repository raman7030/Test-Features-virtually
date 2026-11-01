package p067l;

/* JADX INFO: renamed from: l.֨᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes3.dex */
public final class C3704 extends AbstractC23151 {
    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        if (c21199 == c211910) {
            return false;
        }
        for (C21199 c21199Mo30143 = c211910.mo30143(); c21199Mo30143 != null; c21199Mo30143 = c21199Mo30143.mo30143()) {
            if (this.f72742.mo5092(c21199, c21199Mo30143)) {
                return true;
            }
            if (c21199Mo30143 == c21199) {
                return false;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.f72742);
    }
}
