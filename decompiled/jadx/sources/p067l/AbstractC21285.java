package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5PA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21285 extends AbstractC6532 implements Map {
    @Override // p067l.AbstractC6532
    /* JADX INFO: renamed from: ܿ */
    public abstract Map mo14984();

    @Override // java.util.Map
    public int size() {
        return mo14984().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo14984().isEmpty();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo14984().remove(obj);
    }

    @Override // java.util.Map
    public final void clear() {
        mo14984().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo14984().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo14984().containsValue(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return mo14984().get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo14984().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo14984().putAll(map);
    }

    public Set keySet() {
        return mo14984().keySet();
    }

    public Collection values() {
        return mo14984().values();
    }

    public Set entrySet() {
        return mo14984().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo14984().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo14984().hashCode();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m48113(Object obj) {
        return C20811.m46983(this, obj);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m48114() {
        return C16667.m37742(entrySet());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48112(Object obj) {
        C12764 c12764 = new C12764(entrySet().iterator());
        if (obj == null) {
            while (c12764.hasNext()) {
                if (c12764.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c12764.hasNext()) {
            if (obj.equals(c12764.next())) {
                return true;
            }
        }
        return false;
    }
}
