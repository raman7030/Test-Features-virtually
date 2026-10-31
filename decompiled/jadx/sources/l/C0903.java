package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0903 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 f3475;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f3476;

    public C0903(AbstractC0197 abstractC0197, AbstractC0197 abstractC0198) {
        this.f3476 = abstractC0197;
        this.f3475 = abstractC0198;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC0197 abstractC0197 = this.f3476;
        return (abstractC0197 == null || abstractC0197 == this.f3475) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC0197 abstractC0197 = this.f3476;
        this.f3476 = abstractC0197.m1352();
        return abstractC0197;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
