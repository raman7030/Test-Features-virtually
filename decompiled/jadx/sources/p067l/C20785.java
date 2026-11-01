package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20785 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC7373 f65333;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f65334;

    public C20785(AbstractC7373 abstractC7373, Iterator it) {
        this.f65333 = abstractC7373;
        this.f65334 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65334.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2678 c2678 = new C2678(this.f65333);
        c2678.f4492 = this.f65334.next();
        return c2678;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
