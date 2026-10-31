package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֡۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E61U */
/* JADX INFO: loaded from: classes2.dex */
public final class C0259 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f1541;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f1542;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterator f1543;

    public C0259(List list, List list2, Iterator it) {
        this.f1541 = list.iterator();
        this.f1542 = list2.iterator();
        this.f1543 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1541.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Set setOf;
        String string = ((CharSequence) this.f1541.next()).toString();
        Iterator it = this.f1542;
        if (it.hasNext()) {
            setOf = (Set) it.next();
        } else {
            setOf = AbstractC6079.of();
        }
        Iterator it2 = this.f1543;
        return new C19311(it2.hasNext() ? (String) it2.next() : null, string, setOf);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
