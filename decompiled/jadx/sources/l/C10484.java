package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10484 extends C22478 implements InterfaceC12600, InterfaceC1830 {
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
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C22478, java.util.Map
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

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // l.C22478
    public final String toString() {
        return "{}";
    }

    @Override // l.InterfaceC12600
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int mo24838(String str, C14450 c14450) {
        return C4839.m14082(this, str, c14450);
    }

    @Override // l.InterfaceC12600
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo21969(int i) {
        return false;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C23016.$default$merge(this, obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C4839.m14083(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C23016.$default$putIfAbsent(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C23016.$default$replace(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C5153.f16098;
    }

    @Override // l.InterfaceC12600
    /* JADX INFO: renamed from: ֫֫ */
    public final InterfaceC18559 mo21967() {
        return C5153.f16098;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C7372.f22644;
    }

    @Override // java.util.Map, l.InterfaceC1830
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
        return mo21967();
    }

    @Override // l.C22478
    public final Object clone() {
        return C6250.f19340;
    }

    @Override // l.C22478, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC12872, l.InterfaceC9893
    public final Integer get(Object obj) {
        return C15421.m36466(this, obj);
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
