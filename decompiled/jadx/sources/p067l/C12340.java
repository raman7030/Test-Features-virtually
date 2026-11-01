package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12340 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f34438;

    /* JADX INFO: renamed from: ᩹ */
    public final C15691 f34439;

    public C12340(C15691 c15691, Iterator it) {
        this.f34439 = c15691;
        this.f34438 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34438.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f34438.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34439.m35738();
        this.f34438.remove();
    }

    public final boolean equals(Object obj) {
        return this.f34438.equals(obj);
    }

    public final int hashCode() {
        return this.f34438.hashCode();
    }

    public final String toString() {
        return this.f34438.toString();
    }
}
