package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: PC84 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16029 extends C9499 implements InterfaceC18712, InterfaceC4108 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // p067l.C9499, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // p067l.C9499
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C24243.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C24243.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C24243.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C24243.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C12678.m29155(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C24243.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return (Character) C24243.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // p067l.InterfaceC18712
    /* JADX INFO: renamed from: ۨ֫ */
    public final InterfaceC20007 mo30689() {
        return C7266.f18937;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C9434.f25764;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C9434.f25764;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
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
        return mo30689();
    }

    @Override // p067l.C9499
    public final Object clone() {
        return C24747.f78348;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return null;
    }

    @Override // p067l.C9499, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // p067l.AbstractC12853, p067l.InterfaceC15533, p067l.InterfaceC11771
    public final Character get(Object obj) {
        return C24251.m53559(this, obj);
    }

    @Override // p067l.AbstractC12853, p067l.InterfaceC11771
    public final Object get(Object obj) {
        return C24251.m53559(this, obj);
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

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean remove(Object obj, Object obj2) {
        return C24243.$default$remove(this, obj, obj2);
    }
}
