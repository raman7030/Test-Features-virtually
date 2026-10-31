package l;

/* JADX INFO: renamed from: l.ᩴۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18564 extends AbstractC21427 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0924 f57614;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18564(C0924 c0924, C12918 c12918, int i, int i2) {
        super(c12918, i, i2);
        this.f57614 = c0924;
    }

    @Override // l.AbstractC21427
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1467(C18729 c18729, int i) {
        return Integer.valueOf(c18729.m43368());
    }

    @Override // l.AbstractC21427, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int iNextIndex = nextIndex();
        C0924 c0924 = this.f57614;
        if (iNextIndex == c0924.f3552.f24642) {
            c0924.f3549 = m48544();
        }
        return (Integer) super.next();
    }
}
