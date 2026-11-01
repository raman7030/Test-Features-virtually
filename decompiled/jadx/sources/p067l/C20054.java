package p067l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ᩴ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20054 extends AbstractC16355 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22736 f60931;

    public C20054(C22736 c22736) {
        this.f60931 = c22736;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C22736) this.f60931.mo3495(((InterfaceC13348) obj).mo25825())).mo3493();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C22736) this.f60931.mo3490(((InterfaceC13348) obj).mo25825(), ((InterfaceC13348) obj2).mo25825())).mo3493();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C22736) this.f60931.mo3492(((InterfaceC13348) obj).mo25825())).mo3493();
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC16514 iterator() {
        return new C7313(this.f60931);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C22066) this.f60931.f71697.mo3493()).f69421;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character)) {
            C22736 c22736 = this.f60931;
            C10666 c10666M15133 = c22736.f71697.m15133(((Character) entry.getKey()).charValue());
            if (c10666M15133 != null && c22736.m50882(c10666M15133.f56387) && entry.equals(c10666M15133)) {
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
        if (entry.getKey() != null && (entry.getKey() instanceof Character)) {
            C22736 c22736 = this.f60931;
            C10666 c10666M15133 = c22736.f71697.m15133(((Character) entry.getKey()).charValue());
            if (c10666M15133 != null && c22736.m50882(c10666M15133.f56387)) {
                c22736.mo15134(c10666M15133.f56387);
            }
            if (c10666M15133 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C23406) it).hasNext()) {
            i++;
            ((C7313) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f60931.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f60931.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f60931.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C22736 c22736 = this.f60931;
        C10666 c10666 = c22736.f71697.f17133;
        return !(c22736.firstEntry() != null);
    }
}
