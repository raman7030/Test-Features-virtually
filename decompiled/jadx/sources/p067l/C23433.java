package p067l;

/* JADX INFO: renamed from: l.᩹۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes2.dex */
public final class C23433 extends AbstractC22763 {

    /* JADX INFO: renamed from: ᩸ */
    public final char f74657;

    @Override // p067l.AbstractC22763, p067l.AbstractC13375
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13375 mo15182() {
        throw null;
    }

    public C23433(char c) {
        this.f74657 = c;
    }

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15183(char c) {
        return c == this.f74657;
    }

    public final String toString() {
        return C10965.m25286(new StringBuilder("CharMatcher.is('"), AbstractC13375.m30515(this.f74657), "')");
    }
}
