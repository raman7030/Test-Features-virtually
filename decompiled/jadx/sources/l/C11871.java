package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89QF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11871 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f35404;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC12954 f35405;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35406;

    public C11871(int i, InterfaceC12954 interfaceC12954) {
        this.f35404 = i;
        this.f35405 = interfaceC12954;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f35406 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35406 < this.f35404;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f35406;
        this.f35406 = i + 1;
        return this.f35405.apply(i);
    }
}
