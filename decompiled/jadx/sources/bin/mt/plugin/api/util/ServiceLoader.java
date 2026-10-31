package bin.mt.plugin.api.util;

import java.util.HashMap;
import java.util.Map;
import l.C11003;

/* JADX INFO: loaded from: classes.dex */
public class ServiceLoader {
    public static final Map IMPL_MAP = new HashMap();

    public static void register(Class cls, Object obj) {
        if (obj != null && cls.isInstance(obj) && obj.getClass().getClassLoader() == ServiceLoader.class.getClassLoader()) {
            Map map = IMPL_MAP;
            if (!map.containsKey(cls)) {
                map.put(cls, obj);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static Object get(Class cls) {
        Object obj = IMPL_MAP.get(cls);
        C11003.requireNonNull(obj);
        return obj;
    }
}
