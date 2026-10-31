package l;

/* JADX INFO: renamed from: l.᩶۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes5.dex */
public final class C20048 extends AbstractC21459 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char f64959;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final char f64960;

    public C20048(char c, char c2) {
        this.f64959 = c;
        this.f64960 = c2;
    }

    @Override // l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13300(char c) {
        return c == this.f64959 || c == this.f64960;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        sb.append(AbstractC11581.m28469(this.f64959));
        return C9045.m23341(sb, AbstractC11581.m28469(this.f64960), "\")");
    }
}
