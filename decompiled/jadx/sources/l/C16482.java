package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܽۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16482 extends AbstractC14716 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9428 f50670;

    public C16482(C9428 c9428) {
        this.f50670 = c9428;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C9428) this.f50670.mo5874(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C9428) this.f50670.mo5872(((InterfaceC11544) obj).mo15639(), ((InterfaceC11544) obj2).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C9428) this.f50670.mo5871(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC14884 iterator() {
        return new C14365(this.f50670);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C12041) this.f50670.f28604.mo5869()).f36027;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C9428 c9428 = this.f50670;
            C14156 c14156M7687 = c9428.f28604.m7687(((Integer) entry.getKey()).intValue());
            if (c14156M7687 != null && c9428.m24261(c14156M7687.f17057) && entry.equals(c14156M7687)) {
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
            C9428 c9428 = this.f50670;
            C14156 c14156M7687 = c9428.f28604.m7687(((Integer) entry.getKey()).intValue());
            if (c14156M7687 != null && c9428.m24261(c14156M7687.f17057)) {
                c9428.remove(c14156M7687.f17057);
            }
            if (c14156M7687 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C8722) it).hasNext()) {
            i++;
            ((C14365) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f50670.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f50670.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f50670.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C9428 c9428 = this.f50670;
        C14156 c14156 = c9428.f28604.f7571;
        return !(c9428.firstEntry() != null);
    }
}
