package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19466 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62939;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62940;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f62941;

    public C19466(int i, Iterator it) {
        this.f62939 = i;
        this.f62941 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62940 < this.f62939 && this.f62941.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f62940++;
        return this.f62941.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f62941.remove();
    }
}
