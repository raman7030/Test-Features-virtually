package l;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23016 {
    public static Object $default$getOrDefault(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
    }

    public static void $default$forEach(Map map, BiConsumer biConsumer) {
        C11003.requireNonNull(biConsumer);
        for (Map.Entry entry : map.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException e) {
                throw new ConcurrentModificationException(e);
            }
        }
    }

    public static void $default$replaceAll(Map map, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        for (Map.Entry entry : map.entrySet()) {
            try {
                try {
                    entry.setValue(biFunction.apply(entry.getKey(), entry.getValue()));
                } catch (IllegalStateException e) {
                    throw new ConcurrentModificationException(e);
                }
            } catch (IllegalStateException e2) {
                throw new ConcurrentModificationException(e2);
            }
        }
    }

    public static Object $default$putIfAbsent(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return obj3 == null ? map.put(obj, obj2) : obj3;
    }

    public static boolean $default$remove(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        if (!C11003.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !map.containsKey(obj)) {
            return false;
        }
        map.remove(obj);
        return true;
    }

    public static boolean $default$replace(Map map, Object obj, Object obj2, Object obj3) {
        Object obj4 = map.get(obj);
        if (!C11003.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !map.containsKey(obj)) {
            return false;
        }
        map.put(obj, obj3);
        return true;
    }

    public static Object $default$replace(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
    }

    public static Object $default$computeIfAbsent(Map map, Object obj, Function function) {
        Object objApply;
        C11003.requireNonNull(function);
        Object obj2 = map.get(obj);
        if (obj2 != null || (objApply = function.apply(obj)) == null) {
            return obj2;
        }
        map.put(obj, objApply);
        return objApply;
    }

    public static Object $default$computeIfPresent(Map map, Object obj, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            Object objApply = biFunction.apply(obj, obj2);
            if (objApply != null) {
                map.put(obj, objApply);
                return objApply;
            }
            map.remove(obj);
        }
        return null;
    }

    public static Object $default$compute(Map map, Object obj, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        Object obj2 = map.get(obj);
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            if (obj2 == null && !map.containsKey(obj)) {
                return null;
            }
            map.remove(obj);
            return null;
        }
        map.put(obj, objApply);
        return objApply;
    }

    public static Object $default$merge(Map map, Object obj, Object obj2, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        C11003.requireNonNull(obj2);
        Object obj3 = map.get(obj);
        if (obj3 != null) {
            obj2 = biFunction.apply(obj3, obj2);
        }
        if (obj2 == null) {
            map.remove(obj);
            return obj2;
        }
        map.put(obj, obj2);
        return obj2;
    }
}
