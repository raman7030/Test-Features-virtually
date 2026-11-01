package p067l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩷۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C22066 extends AbstractC16355 {

    /* JADX INFO: renamed from: ᩸ */
    public final C8654 f69421 = new C8654();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C6642 f69422;

    public C22066(C6642 c6642) {
        this.f69422 = c6642;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C22736) this.f69422.mo3495(((InterfaceC13348) obj).mo25825())).mo3493();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C22736) this.f69422.mo3490(((InterfaceC13348) obj).mo25825(), ((InterfaceC13348) obj2).mo25825())).mo3493();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C22736) this.f69422.mo3492(((InterfaceC13348) obj).mo25825())).mo3493();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f69421;
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC16514 iterator() {
        return new C17370(this.f69422);
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
        return entry.equals(this.f69422.m15133(((Character) entry.getKey()).charValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C6642 c6642 = this.f69422;
            C10666 c10666M15133 = c6642.m15133(cCharValue);
            if (c10666M15133 != null && C12826.equals(c10666M15133.f56388, entry.getValue())) {
                c6642.mo15134(c10666M15133.f56387);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f69422.f17139;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f69422.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f69422.f17133;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f69422.f17137;
    }
}
