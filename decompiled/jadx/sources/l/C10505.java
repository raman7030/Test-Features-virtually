package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QIY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10505 extends C22499 implements InterfaceC12621, InterfaceC1830 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map, l.InterfaceC1830
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C4860.m14171(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C23016.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C4860.m14175(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // l.C22499, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C4860.m14170(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return null;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // l.C22499
    public final String toString() {
        return "{}";
    }

    @Override // l.InterfaceC12621, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C5153.f16098;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C5153.f16098;
    }

    @Override // l.InterfaceC12621
    /* JADX INFO: renamed from: ۢۧ */
    public final InterfaceC18559 mo23689() {
        return C5153.f16098;
    }

    @Override // l.InterfaceC12621, java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C22499
    public final Object clone() {
        return C6271.f19414;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo23689();
    }

    @Override // l.C22499, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        put(obj, obj2);
        throw null;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        C11003.equals(null, obj2);
        return false;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        C11003.equals(null, obj2);
        return false;
    }
}
