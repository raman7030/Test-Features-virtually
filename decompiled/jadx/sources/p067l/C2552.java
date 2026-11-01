package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2552 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f4208;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7247 f4209;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C2552(C7247 c7247) {
        this.f4209 = c7247;
        this.f4208 = c7247.f18911.iterator();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f4209.f18912.invoke(this.f4208.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4208.hasNext();
    }
}
