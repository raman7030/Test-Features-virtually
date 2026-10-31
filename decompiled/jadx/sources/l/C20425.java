package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩶᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes5.dex */
public final class C20425 extends AbstractC14716 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11958 f65891;

    public C20425(C11958 c11958) {
        this.f65891 = c11958;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C11958) this.f65891.mo5874(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C11958) this.f65891.mo5872(((InterfaceC11544) obj).mo15639(), ((InterfaceC11544) obj2).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C11958) this.f65891.mo5871(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC14884 iterator() {
        return new C13368(this.f65891);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C5608) this.f65891.f35811.mo5869()).f17366;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C11958 c11958 = this.f65891;
            C8430 c8430M20679 = c11958.f35811.m20679(((Integer) entry.getKey()).intValue());
            if (c8430M20679 != null && c11958.m29235(c8430M20679.f17057) && entry.equals(c8430M20679)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C11958 c11958 = this.f65891;
            C8430 c8430M20679 = c11958.f35811.m20679(((Integer) entry.getKey()).intValue());
            if (c8430M20679 != null && c11958.m29235(c8430M20679.f17057)) {
                c11958.remove(c8430M20679.f17057);
            }
            if (c8430M20679 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C23246) it).hasNext()) {
            i++;
            ((C13368) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f65891.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f65891.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f65891.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C11958 c11958 = this.f65891;
        C8430 c8430 = c11958.f35811.f23896;
        return !(c11958.firstEntry() != null);
    }
}
