package l;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NR */
/* JADX INFO: loaded from: classes.dex */
public final class C22859 extends AbstractC19904 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map f73757;

    public C22859(Map map) {
        this.f73757 = map;
    }

    @Override // l.AbstractC4381
    /* JADX INFO: renamed from: ܿ */
    public final Object mo13120() {
        return this.f73757;
    }

    @Override // l.AbstractC19904, l.AbstractC4381
    /* JADX INFO: renamed from: ܿ */
    public final Map mo13120() {
        return this.f73757;
    }

    @Override // l.AbstractC19904, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // l.AbstractC19904, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // l.AbstractC19904, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return C15045.m35586(super.keySet(), (InterfaceC18842) new C11571());
    }

    @Override // l.AbstractC19904, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return C15045.m35586(super.entrySet(), (InterfaceC18842) new C5926());
    }

    @Override // l.AbstractC19904, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // l.AbstractC19904, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // l.AbstractC19904, java.util.Map
    public final boolean containsValue(Object obj) {
        return m45800(obj);
    }

    @Override // l.AbstractC19904, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && m45801(obj);
    }

    @Override // l.AbstractC19904, java.util.Map
    public final int hashCode() {
        return m45802();
    }
}
