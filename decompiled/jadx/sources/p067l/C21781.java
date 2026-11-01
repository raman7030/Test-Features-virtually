package p067l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩶᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes5.dex */
public final class C21781 extends AbstractC16355 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13734 f68566;

    public C21781(C13734 c13734) {
        this.f68566 = c13734;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C13734) this.f68566.mo8084(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C13734) this.f68566.mo8082(((InterfaceC13340) obj).mo17550(), ((InterfaceC13340) obj2).mo17550())).mo8079();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C13734) this.f68566.mo8081(((InterfaceC13340) obj).mo17550())).mo8079();
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC16514 iterator() {
        return new C15074(this.f68566);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C7699) this.f68566.f38821.mo8079()).f20210;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C13734 c13734 = this.f68566;
            C10381 c10381M22659 = c13734.f38821.m22659(((Integer) entry.getKey()).intValue());
            if (c10381M22659 != null && c13734.m31289(c10381M22659.f19896) && entry.equals(c10381M22659)) {
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
            C13734 c13734 = this.f68566;
            C10381 c10381M22659 = c13734.f38821.m22659(((Integer) entry.getKey()).intValue());
            if (c10381M22659 != null && c13734.m31289(c10381M22659.f19896)) {
                c13734.remove(c10381M22659.f19896);
            }
            if (c10381M22659 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C24462) it).hasNext()) {
            i++;
            ((C15074) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f68566.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f68566.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f68566.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C13734 c13734 = this.f68566;
        C10381 c10381 = c13734.f38821.f26809;
        return !(c13734.firstEntry() != null);
    }
}
