package p067l;

/* JADX INFO: renamed from: l.᩻ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05TK */
/* JADX INFO: loaded from: classes.dex */
public final class C24667 extends AbstractC24429 {
    @Override // p067l.AbstractC3880
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3880 mo7667(C3702 c3702) {
        return new C24667(this.f8417, this.f77339.mo8844(c3702));
    }

    public final String toString() {
        int i = C15949.f46169[this.f8417.ordinal()];
        if (i == 1) {
            return "lock " + this.f77339;
        }
        if (i == 2) {
            return "unlock " + this.f77339;
        }
        if (i == 3) {
            return "throw " + this.f77339;
        }
        if (i == 4) {
            return "return " + this.f77339;
        }
        if (i == 5) {
            return this.f77339 + " ::END";
        }
        return super.toString();
    }
}
