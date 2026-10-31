package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ᩴ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18609 extends AbstractC14716 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21431 f57709;

    public C18609(C21431 c21431) {
        this.f57709 = c21431;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C21431) this.f57709.mo1099(((InterfaceC11553) obj).mo23816())).mo1097();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C21431) this.f57709.mo1094(((InterfaceC11553) obj).mo23816(), ((InterfaceC11553) obj2).mo23816())).mo1097();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C21431) this.f57709.mo1096(((InterfaceC11553) obj).mo23816())).mo1097();
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC14884 iterator() {
        return new C5203(this.f57709);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C20726) this.f57709.f68999.mo1097()).f66740;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character)) {
            C21431 c21431 = this.f57709;
            C8731 c8731M13250 = c21431.f68999.m13250(((Character) entry.getKey()).charValue());
            if (c8731M13250 != null && c21431.m48545(c8731M13250.f53201) && entry.equals(c8731M13250)) {
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
            C21431 c21431 = this.f57709;
            C8731 c8731M13250 = c21431.f68999.m13250(((Character) entry.getKey()).charValue());
            if (c8731M13250 != null && c21431.m48545(c8731M13250.f53201)) {
                c21431.mo13251(c8731M13250.f53201);
            }
            if (c8731M13250 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C22136) it).hasNext()) {
            i++;
            ((C5203) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f57709.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f57709.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f57709.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C21431 c21431 = this.f57709;
        C8731 c8731 = c21431.f68999.f14306;
        return !(c21431.firstEntry() != null);
    }
}
