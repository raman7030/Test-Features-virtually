package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19378 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5266 f62722;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f62723;

    public C19378(AbstractC5266 abstractC5266, Iterator it) {
        this.f62722 = abstractC5266;
        this.f62723 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62723.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0326 c0326 = new C0326(this.f62722);
        c0326.f1716 = this.f62723.next();
        return c0326;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
