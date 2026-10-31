package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: PC84 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14374 extends C7503 implements InterfaceC17197, InterfaceC1830 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C7503, java.util.Map
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

    @Override // l.C7503
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C23016.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C23016.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C23016.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C23016.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C10848.m27110(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C23016.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Character) C23016.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // l.InterfaceC17197
    /* JADX INFO: renamed from: ۨ֫ */
    public final InterfaceC18559 mo28641() {
        return C5153.f16098;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C7434.f22851;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C7434.f22851;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Character) obj2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo28641();
    }

    @Override // l.C7503
    public final Object clone() {
        return C23547.f75602;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return null;
    }

    @Override // l.C7503, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC11032, l.InterfaceC13852, l.InterfaceC9893
    public final Character get(Object obj) {
        return C23025.m51166(this, obj);
    }

    @Override // l.AbstractC11032, l.InterfaceC9893
    public final Object get(Object obj) {
        return C23025.m51166(this, obj);
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

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        return C23016.$default$remove(this, obj, obj2);
    }
}
