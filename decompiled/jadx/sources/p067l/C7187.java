package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WCA8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7187 extends C4505 implements InterfaceC2492, InterfaceC4108 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C24243.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C24243.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C24243.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // p067l.C4505, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C24243.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C24243.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C24243.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C24243.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // p067l.C4505
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        mo25899(((Long) obj).longValue(), obj2);
        throw null;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C7266.f18937;
    }

    @Override // p067l.InterfaceC2492
    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC20007 mo3604() {
        return C7266.f18937;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C2531.f4163;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.C4505
    public final Object clone() {
        return C3163.f5789;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo3604();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return null;
    }

    @Override // p067l.C4505, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // p067l.AbstractC16945, p067l.InterfaceC11771
    public final Object get(Object obj) {
        return C10540.m24296(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return false;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }
}
