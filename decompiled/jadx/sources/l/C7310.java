package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7310 extends C12249 implements InterfaceC13659, InterfaceC1830 {
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

    @Override // l.C12249, java.util.Map
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

    @Override // l.C12249
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C3077.m9404(this, (Integer) obj, obj2);
    }

    @Override // java.util.Map
    public final Collection values() {
        return C5153.f16098;
    }

    @Override // l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC18559 mo5869() {
        return C5153.f16098;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C7372.f22644;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C12249
    public final Object clone() {
        return C11253.f33722;
    }

    @Override // java.util.Map
    public final InterfaceC18559 entrySet() {
        return mo5869();
    }

    @Override // l.C12249, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final Object get(Object obj) {
        return C3077.m9406(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C3077.m9407(this, obj);
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        return C3077.m9405(this, obj);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }
}
