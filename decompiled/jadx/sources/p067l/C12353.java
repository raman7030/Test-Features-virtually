package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QIY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12353 extends C23752 implements InterfaceC14364, InterfaceC4108 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C6988.m16052(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C24243.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C6988.m16056(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // p067l.C23752, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C6988.m16051(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return null;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // p067l.C23752
    public final String toString() {
        return "{}";
    }

    @Override // p067l.InterfaceC14364, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C7266.f18937;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C7266.f18937;
    }

    @Override // p067l.InterfaceC14364
    /* JADX INFO: renamed from: ۢۧ */
    public final InterfaceC20007 mo25689() {
        return C7266.f18937;
    }

    @Override // p067l.InterfaceC14364, java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.C23752
    public final Object clone() {
        return C8329.f22277;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo25689();
    }

    @Override // p067l.C23752, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        put(obj, obj2);
        throw null;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean remove(Object obj, Object obj2) {
        C12826.equals(null, obj2);
        return false;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        C12826.equals(null, obj2);
        return false;
    }
}
