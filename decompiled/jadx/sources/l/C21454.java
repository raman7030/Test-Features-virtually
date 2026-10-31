package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C21454 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f69075;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Function f69076;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Iterator f69077 = C22159.f71911;

    public C21454(Iterable iterable, Function function) {
        this.f69075 = iterable.iterator();
        this.f69076 = function;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        Iterator it2 = this.f69077;
        if (it2 != null && !it2.hasNext()) {
            do {
                Iterator it3 = this.f69075;
                if (it3.hasNext()) {
                    it = (Iterator) this.f69076.apply(it3.next());
                    this.f69077 = it;
                } else {
                    this.f69077 = null;
                    break;
                }
            } while (!it.hasNext());
        }
        return this.f69077 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f69077 == C22159.f71911 && !hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f69077.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
