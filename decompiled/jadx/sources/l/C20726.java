package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩷۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20726 extends AbstractC14716 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6614 f66740 = new C6614();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4497 f66741;

    public C20726(C4497 c4497) {
        this.f66741 = c4497;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C21431) this.f66741.mo1099(((InterfaceC11553) obj).mo23816())).mo1097();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C21431) this.f66741.mo1094(((InterfaceC11553) obj).mo23816(), ((InterfaceC11553) obj2).mo23816())).mo1097();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C21431) this.f66741.mo1096(((InterfaceC11553) obj).mo23816())).mo1097();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f66740;
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC14884 iterator() {
        return new C15785(this.f66741);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        return entry.equals(this.f66741.m13250(((Character) entry.getKey()).charValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C4497 c4497 = this.f66741;
            C8731 c8731M13250 = c4497.m13250(cCharValue);
            if (c8731M13250 != null && C11003.equals(c8731M13250.f53202, entry.getValue())) {
                c4497.mo13251(c8731M13250.f53201);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f66741.f14312;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f66741.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f66741.f14306;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f66741.f14310;
    }
}
