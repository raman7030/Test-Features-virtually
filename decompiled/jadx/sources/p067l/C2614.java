package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֡۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E61U */
/* JADX INFO: loaded from: classes2.dex */
public final class C2614 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final Iterator f4319;

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f4320;

    /* JADX INFO: renamed from: ᩹ */
    public final Iterator f4321;

    public C2614(List list, List list2, Iterator it) {
        this.f4319 = list.iterator();
        this.f4320 = list2.iterator();
        this.f4321 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4319.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Set setM18915of;
        String string = ((CharSequence) this.f4319.next()).toString();
        Iterator it = this.f4320;
        if (it.hasNext()) {
            setM18915of = (Set) it.next();
        } else {
            setM18915of = AbstractC8146.m18915of();
        }
        Iterator it2 = this.f4321;
        return new C20721(it2.hasNext() ? (String) it2.next() : null, string, setM18915of);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
