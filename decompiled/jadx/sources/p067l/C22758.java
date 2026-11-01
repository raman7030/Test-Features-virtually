package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C22758 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final Iterator f71773;

    /* JADX INFO: renamed from: ᩸ */
    public final Function f71774;

    /* JADX INFO: renamed from: ᩹ */
    public Iterator f71775 = C23428.f74633;

    public C22758(Iterable iterable, Function function) {
        this.f71773 = iterable.iterator();
        this.f71774 = function;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        Iterator it2 = this.f71775;
        if (it2 != null && !it2.hasNext()) {
            do {
                Iterator it3 = this.f71773;
                if (it3.hasNext()) {
                    it = (Iterator) this.f71774.apply(it3.next());
                    this.f71775 = it;
                } else {
                    this.f71775 = null;
                    break;
                }
            } while (!it.hasNext());
        }
        return this.f71775 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f71775 == C23428.f74633 && !hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f71775.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
