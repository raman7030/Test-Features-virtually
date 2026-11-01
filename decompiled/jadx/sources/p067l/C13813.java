package p067l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۨ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13813 extends AbstractC16355 {

    /* JADX INFO: renamed from: ᩸ */
    public final C18146 f39038 = new C18146(1);

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C4623 f39039;

    public C13813(C4623 c4623) {
        this.f39039 = c4623;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C11329) this.f39039.mo8084(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C11329) this.f39039.mo8082(((InterfaceC13340) obj).mo17550(), ((InterfaceC13340) obj2).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C11329) this.f39039.mo8081(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f39038;
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC16514 iterator() {
        return new C9789(this.f39039);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        return entry.equals(this.f39039.m9748(((Integer) entry.getKey()).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C4623 c4623 = this.f39039;
            C15823 c15823M9748 = c4623.m9748(iIntValue);
            if (c15823M9748 != null && C12826.equals(c15823M9748.f19897, entry.getValue())) {
                c4623.remove(c15823M9748.f19896);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39039.f10368;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39039.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f39039.f10362;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f39039.f10366;
    }
}
