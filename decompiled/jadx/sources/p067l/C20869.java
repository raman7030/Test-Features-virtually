package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20869 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f65556;

    /* JADX INFO: renamed from: ᩸ */
    public int f65557;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f65558;

    public C20869(int i, Iterator it) {
        this.f65556 = i;
        this.f65558 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65557 < this.f65556 && this.f65558.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f65557++;
        return this.f65558.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f65558.remove();
    }
}
