package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3226 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC2555 f6250;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC2555 f6251;

    public C3226(AbstractC2555 abstractC2555, AbstractC2555 abstractC2556) {
        this.f6251 = abstractC2555;
        this.f6250 = abstractC2556;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC2555 abstractC2555 = this.f6251;
        return (abstractC2555 == null || abstractC2555 == this.f6250) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC2555 abstractC2555 = this.f6251;
        this.f6251 = abstractC2555.m3765();
        return abstractC2555;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
