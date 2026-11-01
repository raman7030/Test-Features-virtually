package p067l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܽۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18033 extends AbstractC16355 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11329 f53847;

    public C18033(C11329 c11329) {
        this.f53847 = c11329;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C11329) this.f53847.mo8084(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C11329) this.f53847.mo8082(((InterfaceC13340) obj).mo17550(), ((InterfaceC13340) obj2).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C11329) this.f53847.mo8081(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC16514 iterator() {
        return new C16021(this.f53847);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C13813) this.f53847.f31551.mo8079()).f39038;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C11329 c11329 = this.f53847;
            C15823 c15823M9748 = c11329.f31551.m9748(((Integer) entry.getKey()).intValue());
            if (c15823M9748 != null && c11329.m26271(c15823M9748.f19896) && entry.equals(c15823M9748)) {
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
            C11329 c11329 = this.f53847;
            C15823 c15823M9748 = c11329.f31551.m9748(((Integer) entry.getKey()).intValue());
            if (c15823M9748 != null && c11329.m26271(c15823M9748.f19896)) {
                c11329.remove(c15823M9748.f19896);
            }
            if (c15823M9748 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C10658) it).hasNext()) {
            i++;
            ((C16021) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f53847.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f53847.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f53847.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C11329 c11329 = this.f53847;
        C15823 c15823 = c11329.f31551.f10362;
        return !(c11329.firstEntry() != null);
    }
}
