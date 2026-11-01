package p067l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes4.dex */
public final class C19656 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C25020 f59780;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C25020 c25020 = this.f59780;
        C16302 c16302M54938 = null;
        if (obj != null) {
            try {
                c16302M54938 = c25020.m54938(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c16302M54938 != null) {
            c25020.m54939(c16302M54938, true);
        }
        return c16302M54938 != null;
    }

    public C19656(C25020 c25020) {
        this.f59780 = c25020;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f59780.f79871;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C18314(this.f59780);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f59780.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f59780.clear();
    }
}
