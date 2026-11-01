package p067l;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18131 {
    public static void $default$forEach(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        C12826.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static void $default$replaceAll(ConcurrentMap concurrentMap, BiFunction biFunction) {
        C12826.requireNonNull(biFunction);
        C19473.forEach(concurrentMap, new C12233(1, concurrentMap, biFunction));
    }

    public static Object $default$computeIfAbsent(ConcurrentMap concurrentMap, Object obj, Function function) {
        Object objApply;
        C12826.requireNonNull(function);
        Object obj2 = concurrentMap.get(obj);
        if (obj2 != null || (objApply = function.apply(obj)) == null) {
            return obj2;
        }
        Object objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
        return objPutIfAbsent == null ? objApply : objPutIfAbsent;
    }

    public static Object $default$computeIfPresent(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        C12826.requireNonNull(biFunction);
        while (true) {
            Object obj2 = concurrentMap.get(obj);
            if (obj2 == null) {
                return null;
            }
            Object objApply = biFunction.apply(obj, obj2);
            if (objApply == null) {
                if (concurrentMap.remove(obj, obj2)) {
                    return objApply;
                }
            } else if (concurrentMap.replace(obj, obj2, objApply)) {
                return objApply;
            }
        }
    }

    public static Object $default$compute(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        Object objApply;
        loop0: while (true) {
            Object objPutIfAbsent = concurrentMap.get(obj);
            do {
                objApply = biFunction.apply(obj, objPutIfAbsent);
                if (objApply != null) {
                    if (objPutIfAbsent != null) {
                        if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                            break;
                        }
                    } else {
                        objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                    }
                } else if (objPutIfAbsent == null || concurrentMap.remove(obj, objPutIfAbsent)) {
                    return null;
                }
            } while (objPutIfAbsent != null);
        }
        return objApply;
    }

    public static Object $default$merge(ConcurrentMap concurrentMap, Object obj, Object obj2, BiFunction biFunction) {
        C12826.requireNonNull(biFunction);
        C12826.requireNonNull(obj2);
        while (true) {
            Object objPutIfAbsent = concurrentMap.get(obj);
            while (objPutIfAbsent == null) {
                objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                if (objPutIfAbsent == null) {
                    return obj2;
                }
            }
            Object objApply = biFunction.apply(objPutIfAbsent, obj2);
            if (objApply != null) {
                if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                    return objApply;
                }
            } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                return null;
            }
        }
    }
}
