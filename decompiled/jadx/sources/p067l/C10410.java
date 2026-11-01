package p067l;

/* JADX INFO: renamed from: l.۠᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10410 extends AbstractC23151 {
    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        if (c21199 == c211910) {
            return false;
        }
        for (C21199 c21199M47894 = c211910.m47894(); c21199M47894 != null; c21199M47894 = c21199M47894.m47894()) {
            if (this.f72742.mo5092(c21199, c21199M47894)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.f72742);
    }
}
