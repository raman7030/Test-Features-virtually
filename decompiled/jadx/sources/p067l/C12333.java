package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12333 extends C23732 implements InterfaceC14344, InterfaceC4108 {
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
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // p067l.C23732, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        return null;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // p067l.C23732
    public final String toString() {
        return "{}";
    }

    @Override // p067l.InterfaceC14344
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int mo26853(String str, C16102 c16102) {
        return C6968.m15962(this, str, c16102);
    }

    @Override // p067l.InterfaceC14344
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo23940(int i) {
        return false;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C24243.$default$merge(this, obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C6968.m15963(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C24243.$default$putIfAbsent(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C24243.$default$replace(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C7266.f18937;
    }

    @Override // p067l.InterfaceC14344
    /* JADX INFO: renamed from: ֫֫ */
    public final InterfaceC20007 mo23938() {
        return C7266.f18937;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C9375.f25556;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) obj2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo23938();
    }

    @Override // p067l.C23732
    public final Object clone() {
        return C8309.f22204;
    }

    @Override // p067l.C23732, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC11771
    public final Integer get(Object obj) {
        return C17025.m38624(this, obj);
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
