package l;

/* JADX INFO: renamed from: l.᩹۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes2.dex */
public final class C22164 extends AbstractC21459 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char f71935;

    @Override // l.AbstractC21459, l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo13299() {
        throw null;
    }

    public C22164(char c) {
        this.f71935 = c;
    }

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13300(char c) {
        return c == this.f71935;
    }

    public final String toString() {
        return C9045.m23341(new StringBuilder("CharMatcher.is('"), AbstractC11581.m28469(this.f71935), "')");
    }
}
