package p067l;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15525 {
    public static /* synthetic */ Object compute(Map map, Object obj, BiFunction biFunction) {
        if (map instanceof InterfaceC4108) {
            return ((InterfaceC4108) map).compute(obj, biFunction);
        }
        return map instanceof ConcurrentMap ? C18131.$default$compute((ConcurrentMap) map, obj, biFunction) : C24243.$default$compute(map, obj, biFunction);
    }

    public static /* synthetic */ Object computeIfAbsent(Map map, Object obj, Function function) {
        if (map instanceof InterfaceC4108) {
            return ((InterfaceC4108) map).computeIfAbsent(obj, function);
        }
        return map instanceof ConcurrentMap ? C18131.$default$computeIfAbsent((ConcurrentMap) map, obj, function) : C24243.$default$computeIfAbsent(map, obj, function);
    }

    public static /* synthetic */ Object computeIfPresent(Map map, Object obj, BiFunction biFunction) {
        if (map instanceof InterfaceC4108) {
            return ((InterfaceC4108) map).computeIfPresent(obj, biFunction);
        }
        return map instanceof ConcurrentMap ? C18131.$default$computeIfPresent((ConcurrentMap) map, obj, biFunction) : C24243.$default$computeIfPresent(map, obj, biFunction);
    }

    public static /* synthetic */ void forEach(Map map, BiConsumer biConsumer) {
        if (map instanceof InterfaceC4108) {
            ((InterfaceC4108) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            C18131.$default$forEach((ConcurrentMap) map, biConsumer);
        } else {
            C24243.$default$forEach(map, biConsumer);
        }
    }

    public static /* synthetic */ Object merge(Map map, Object obj, Object obj2, BiFunction biFunction) {
        if (map instanceof InterfaceC4108) {
            return ((InterfaceC4108) map).merge(obj, obj2, biFunction);
        }
        return map instanceof ConcurrentMap ? C18131.$default$merge((ConcurrentMap) map, obj, obj2, biFunction) : C24243.$default$merge(map, obj, obj2, biFunction);
    }

    public static /* synthetic */ Object putIfAbsent(Map map, Object obj, Object obj2) {
        return map instanceof InterfaceC4108 ? ((InterfaceC4108) map).putIfAbsent(obj, obj2) : C24243.$default$putIfAbsent(map, obj, obj2);
    }

    public static /* synthetic */ boolean remove(Map map, Object obj, Object obj2) {
        return map instanceof InterfaceC4108 ? ((InterfaceC4108) map).remove(obj, obj2) : C24243.$default$remove(map, obj, obj2);
    }

    public static /* synthetic */ Object replace(Map map, Object obj, Object obj2) {
        return map instanceof InterfaceC4108 ? ((InterfaceC4108) map).replace(obj, obj2) : C24243.$default$replace(map, obj, obj2);
    }

    public static /* synthetic */ boolean replace(Map map, Object obj, Object obj2, Object obj3) {
        return map instanceof InterfaceC4108 ? ((InterfaceC4108) map).replace(obj, obj2, obj3) : C24243.$default$replace(map, obj, obj2, obj3);
    }

    public static /* synthetic */ void replaceAll(Map map, BiFunction biFunction) {
        if (map instanceof InterfaceC4108) {
            ((InterfaceC4108) map).replaceAll(biFunction);
        } else if (map instanceof ConcurrentMap) {
            C18131.$default$replaceAll((ConcurrentMap) map, biFunction);
        } else {
            C24243.$default$replaceAll(map, biFunction);
        }
    }

    public static Object getOrDefault(Map map, Object obj, Object obj2) {
        if (map instanceof InterfaceC4108) {
            return ((InterfaceC4108) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return C24243.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }
}
