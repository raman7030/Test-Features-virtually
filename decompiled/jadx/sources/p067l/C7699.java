package p067l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۚ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public final class C7699 extends AbstractC16355 {

    /* JADX INFO: renamed from: ᩸ */
    public final C3004 f20210 = new C3004();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9710 f20211;

    public C7699(C9710 c9710) {
        this.f20211 = c9710;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C13734) this.f20211.mo8084(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C13734) this.f20211.mo8082(((InterfaceC13340) obj).mo17550(), ((InterfaceC13340) obj2).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C13734) this.f20211.mo8081(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f20210;
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC16514 iterator() {
        return new C17085(this.f20211);
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
        return entry.equals(this.f20211.m22659(((Integer) entry.getKey()).intValue()));
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
        C9710 c9710 = this.f20211;
        C10381 c10381M22659 = c9710.m22659(iIntValue);
        if (c10381M22659 == null || !C12826.equals(c10381M22659.f19897, entry.getValue())) {
            return false;
        }
        c9710.remove(c10381M22659.f19896);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20211.f26816;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20211.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f20211.f26809;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f20211.f26814;
    }
}
