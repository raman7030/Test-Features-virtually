package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WCA8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5070 extends C2248 implements InterfaceC0130, InterfaceC1830 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C23016.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C23016.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C23016.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // l.C2248, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C23016.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C23016.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C23016.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C23016.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // l.C2248
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        mo23890(((Long) obj).longValue(), obj2);
        throw null;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C5153.f16098;
    }

    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC18559 mo1202() {
        return C5153.f16098;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C0171.f1389;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C2248
    public final Object clone() {
        return C0836.f3015;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo1202();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return null;
    }

    @Override // l.C2248, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC15337, l.InterfaceC9893
    public final Object get(Object obj) {
        return C8598.m22327(this, obj);
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return false;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }
}
