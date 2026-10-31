package l;

/* JADX INFO: renamed from: l.᩻ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05TK */
/* JADX INFO: loaded from: classes.dex */
public final class C23463 extends AbstractC23212 {
    @Override // l.AbstractC1591
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1591 mo5437(C1403 c1403) {
        return new C23463(this.f5638, this.f74596.mo6718(c1403));
    }

    public final String toString() {
        int i = C14290.f43077[this.f5638.ordinal()];
        if (i == 1) {
            return "lock " + this.f74596;
        }
        if (i == 2) {
            return "unlock " + this.f74596;
        }
        if (i == 3) {
            return "throw " + this.f74596;
        }
        if (i == 4) {
            return "return " + this.f74596;
        }
        if (i == 5) {
            return this.f74596 + " ::END";
        }
        return super.toString();
    }
}
