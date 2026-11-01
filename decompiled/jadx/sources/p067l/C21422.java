package p067l;

/* JADX INFO: renamed from: l.᩶۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes5.dex */
public final class C21422 extends AbstractC22763 {

    /* JADX INFO: renamed from: ᩸ */
    public final char f67601;

    /* JADX INFO: renamed from: ᩹ */
    public final char f67602;

    public C21422(char c, char c2) {
        this.f67601 = c;
        this.f67602 = c2;
    }

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15183(char c) {
        return c == this.f67601 || c == this.f67602;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        sb.append(AbstractC13375.m30515(this.f67601));
        return C10965.m25286(sb, AbstractC13375.m30515(this.f67602), "\")");
    }
}
