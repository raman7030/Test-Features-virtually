package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4020 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2609 f12755;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f12755.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12755.isEmpty()) {
            throw new NoSuchElementException();
        }
        C2609 c2609 = this.f12755;
        Object obj = c2609.f8240;
        this.f12755 = c2609.f8241;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
