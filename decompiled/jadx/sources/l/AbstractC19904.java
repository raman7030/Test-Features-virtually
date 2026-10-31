package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5PA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19904 extends AbstractC4381 implements Map {
    @Override // l.AbstractC4381
    /* JADX INFO: renamed from: ܿ */
    public abstract Map mo13120();

    @Override // java.util.Map
    public int size() {
        return mo13120().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo13120().isEmpty();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo13120().remove(obj);
    }

    @Override // java.util.Map
    public final void clear() {
        mo13120().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo13120().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo13120().containsValue(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return mo13120().get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo13120().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo13120().putAll(map);
    }

    public Set keySet() {
        return mo13120().keySet();
    }

    public Collection values() {
        return mo13120().values();
    }

    public Set entrySet() {
        return mo13120().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo13120().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo13120().hashCode();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45801(Object obj) {
        return C19405.m44689(this, obj);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m45802() {
        return C15045.m35584(entrySet());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45800(Object obj) {
        C10938 c10938 = new C10938(entrySet().iterator());
        if (obj == null) {
            while (c10938.hasNext()) {
                if (c10938.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c10938.hasNext()) {
            if (obj.equals(c10938.next())) {
                return true;
            }
        }
        return false;
    }
}
