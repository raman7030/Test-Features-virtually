package p067l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24005 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17930 f76242;

    public C24005(C17930 c17930) {
        this.f76242 = c17930;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f76242.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f76242.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C17930 c17930 = this.f76242;
        Map mapM40779 = c17930.m40779();
        if (mapM40779 != null) {
            return mapM40779.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iM40758 = c17930.m40758(entry.getKey());
        return iM40758 != -1 && C12826.equals(C17930.m40768(c17930, iM40758), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C17930 c17930 = this.f76242;
        Map mapM40779 = c17930.m40779();
        if (mapM40779 != null) {
            return mapM40779.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (c17930.m40784()) {
            return false;
        }
        int iM40776 = c17930.m40776();
        int iM43912 = C19272.m43912(entry.getKey(), entry.getValue(), iM40776, C17930.m40767(c17930), c17930.m40764(), c17930.m40770(), c17930.m40763());
        if (iM43912 == -1) {
            return false;
        }
        c17930.m40780(iM43912, iM40776);
        C17930.m40769(c17930);
        c17930.m40782();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C17930 c17930 = this.f76242;
        Map mapM40779 = c17930.m40779();
        if (mapM40779 != null) {
            return mapM40779.entrySet().iterator();
        }
        return new C7912(c17930);
    }
}
