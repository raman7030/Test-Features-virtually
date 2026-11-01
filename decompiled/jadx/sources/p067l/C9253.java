package p067l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۟ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C9253 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17930 f25082;

    public C9253(C17930 c17930) {
        this.f25082 = c17930;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25082.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25082.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C17930 c17930 = this.f25082;
        Map mapM40779 = c17930.m40779();
        if (mapM40779 != null) {
            return mapM40779.keySet().remove(obj);
        }
        return c17930.m40766(obj) != C17930.f53543;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f25082.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C17930 c17930 = this.f25082;
        Map mapM40779 = c17930.m40779();
        if (mapM40779 != null) {
            return mapM40779.keySet().iterator();
        }
        return new C11936(c17930);
    }
}
