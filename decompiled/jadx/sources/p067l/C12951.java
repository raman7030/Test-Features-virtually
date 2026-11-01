package p067l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12951 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C25020 f36416;

    public C12951(C25020 c25020) {
        this.f36416 = c25020;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36416.f79871;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4233(this.f36416);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C16302 c16302M54938;
        if (obj instanceof Map.Entry) {
            C25020 c25020 = this.f36416;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C16302 c16302 = null;
            if (key != null) {
                try {
                    c16302M54938 = c25020.m54938(key, false);
                } catch (ClassCastException unused) {
                    c16302M54938 = null;
                }
            } else {
                c16302M54938 = null;
            }
            if (c16302M54938 != null && C12826.equals(c16302M54938.f47916, entry.getValue())) {
                c16302 = c16302M54938;
            }
            if (c16302 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C16302 c16302M54938;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C25020 c25020 = this.f36416;
            C16302 c16302 = null;
            if (key != null) {
                try {
                    c16302M54938 = c25020.m54938(key, false);
                } catch (ClassCastException unused) {
                    c16302M54938 = null;
                }
            } else {
                c16302M54938 = null;
            }
            if (c16302M54938 != null && C12826.equals(c16302M54938.f47916, entry.getValue())) {
                c16302 = c16302M54938;
            }
            if (c16302 != null) {
                c25020.m54939(c16302, true);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f36416.clear();
    }
}
