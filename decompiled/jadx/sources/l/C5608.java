package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۚ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5608 extends AbstractC14716 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0668 f17366 = new C0668();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7724 f17367;

    public C5608(C7724 c7724) {
        this.f17367 = c7724;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C11958) this.f17367.mo5874(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C11958) this.f17367.mo5872(((InterfaceC11544) obj).mo15639(), ((InterfaceC11544) obj2).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C11958) this.f17367.mo5871(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f17366;
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC14884 iterator() {
        return new C15484(this.f17367);
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
        return entry.equals(this.f17367.m20679(((Integer) entry.getKey()).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        C7724 c7724 = this.f17367;
        C8430 c8430M20679 = c7724.m20679(iIntValue);
        if (c8430M20679 == null || !C11003.equals(c8430M20679.f17058, entry.getValue())) {
            return false;
        }
        c7724.remove(c8430M20679.f17057);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17367.f23903;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f17367.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f17367.f23896;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f17367.f23901;
    }
}
