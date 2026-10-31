package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2858 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4269 f9117;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f9118;

    public C2858(C4269 c4269, Iterator it) {
        this.f9117 = c4269;
        this.f9118 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9118.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C21908.m49309(this.f9117.f13813, this.f9118.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9118.remove();
    }
}
