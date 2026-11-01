package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9316 extends C14010 implements InterfaceC15350, InterfaceC4108 {
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

    @Override // p067l.C14010, java.util.Map
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

    @Override // p067l.C14010
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C5293.m11446(this, (Integer) obj, obj2);
    }

    @Override // java.util.Map
    public final Collection values() {
        return C7266.f18937;
    }

    @Override // p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20007 mo8079() {
        return C7266.f18937;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C9375.f25556;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.C14010
    public final Object clone() {
        return C13064.f36722;
    }

    @Override // java.util.Map
    public final InterfaceC20007 entrySet() {
        return mo8079();
    }

    @Override // p067l.C14010, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final Object get(Object obj) {
        return C5293.m11448(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C5293.m11449(this, obj);
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        return C5293.m11447(this, obj);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }
}
