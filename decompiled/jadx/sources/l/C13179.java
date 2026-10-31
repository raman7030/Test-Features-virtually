package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 246 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13179 extends C15295 implements InterfaceC3302, InterfaceC1830 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C15295, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // l.C15295
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Float) C23016.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Float) C23016.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Float) C23016.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Float) C23016.$default$merge(this, (Integer) obj, (Float) obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C1185.m4005(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Float) C23016.$default$putIfAbsent(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Float) C23016.$default$replace(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, (Integer) obj, (Float) obj2, (Float) obj3);
    }

    @Override // l.InterfaceC3302
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC18559 mo10099() {
        return C5153.f16098;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C7372.f22644;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C1975.f6628;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Float) obj2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo10099();
    }

    @Override // l.C15295
    public final Object clone() {
        return C10358.f31173;
    }

    @Override // l.AbstractC2681, l.InterfaceC8241, l.InterfaceC9893
    public final Float get(Object obj) {
        return C1185.m4006(this, obj);
    }

    @Override // l.AbstractC2681, l.InterfaceC9893
    public final Object get(Object obj) {
        return C1185.m4006(this, obj);
    }

    @Override // l.C15295, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC2681, l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C1185.m4007(this, obj);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        return C23016.$default$remove(this, obj, obj2);
    }
}
