package p067l;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12567 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17930 f35303;

    public C12567(C17930 c17930) {
        this.f35303 = c17930;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f35303.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f35303.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C17930 c17930 = this.f35303;
        Map mapM40779 = c17930.m40779();
        if (mapM40779 != null) {
            return mapM40779.values().iterator();
        }
        return new C13277(c17930);
    }
}
