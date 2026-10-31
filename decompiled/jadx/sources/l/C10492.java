package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10492 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f31475;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14018 f31476;

    public C10492(C14018 c14018, Iterator it) {
        this.f31476 = c14018;
        this.f31475 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31475.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f31475.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f31476.m33618();
        this.f31475.remove();
    }

    public final boolean equals(Object obj) {
        return this.f31475.equals(obj);
    }

    public final int hashCode() {
        return this.f31475.hashCode();
    }

    public final String toString() {
        return this.f31475.toString();
    }
}
