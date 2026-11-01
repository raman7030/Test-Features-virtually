package p067l;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NR */
/* JADX INFO: loaded from: classes.dex */
public final class C24093 extends AbstractC21285 {

    /* JADX INFO: renamed from: ᩸ */
    public final Map f76488;

    public C24093(Map map) {
        this.f76488 = map;
    }

    @Override // p067l.AbstractC6532
    /* JADX INFO: renamed from: ܿ */
    public final Object mo14984() {
        return this.f76488;
    }

    @Override // p067l.AbstractC21285, p067l.AbstractC6532
    /* JADX INFO: renamed from: ܿ */
    public final Map mo14984() {
        return this.f76488;
    }

    @Override // p067l.AbstractC21285, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // p067l.AbstractC21285, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // p067l.AbstractC21285, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return C16667.m37744(super.keySet(), (InterfaceC20276) new C13365());
    }

    @Override // p067l.AbstractC21285, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return C16667.m37744(super.entrySet(), (InterfaceC20276) new C8000());
    }

    @Override // p067l.AbstractC21285, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // p067l.AbstractC21285, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // p067l.AbstractC21285, java.util.Map
    public final boolean containsValue(Object obj) {
        return m48112(obj);
    }

    @Override // p067l.AbstractC21285, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && m48113(obj);
    }

    @Override // p067l.AbstractC21285, java.util.Map
    public final int hashCode() {
        return m48114();
    }
}
