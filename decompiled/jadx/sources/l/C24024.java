package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes.dex */
public final class C24024 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9208 f77844;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f77845;

    public C24024(C9208 c9208, Iterator it) {
        this.f77844 = c9208;
        this.f77845 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77845.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C21908.m49309(this.f77844.f27893, this.f77845.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f77845.remove();
    }
}
