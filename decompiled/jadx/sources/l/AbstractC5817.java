package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: YC5H */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5817 extends AbstractC10051 implements InterfaceC12621, InterfaceC1830 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C4860.m14171(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C23016.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C4860.m14175(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C4860.m14170(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo23689();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return (obj3 != null || containsKey(obj)) ? obj3 : obj2;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null || containsKey(obj)) {
            return obj3;
        }
        put(obj, obj2);
        return null;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public boolean remove(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (!C11003.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !containsKey(obj)) {
            return false;
        }
        remove(obj);
        return true;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public boolean replace(Object obj, Object obj2, Object obj3) {
        Object obj4 = get(obj);
        if (!C11003.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !containsKey(obj)) {
            return false;
        }
        put(obj, obj3);
        return true;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public Object replace(Object obj, Object obj2) {
        if (containsKey(obj)) {
            return put(obj, obj2);
        }
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC12621) {
            InterfaceC12063 interfaceC12063M17278 = C6271.m17278((InterfaceC12621) map);
            while (interfaceC12063M17278.hasNext()) {
                InterfaceC3449 interfaceC3449 = (InterfaceC3449) interfaceC12063M17278.next();
                put(interfaceC3449.getKey(), interfaceC3449.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator it = map.entrySet().iterator();
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            put(entry.getKey(), entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        InterfaceC12063 interfaceC12063M17278 = C6271.m17278(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC3449) interfaceC12063M17278.next()).hashCode();
            size = i;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        return mo23689().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12063 interfaceC12063M17278 = C6271.m17278(this);
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC3449 interfaceC3449 = (InterfaceC3449) interfaceC12063M17278.next();
                if (this == interfaceC3449.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC3449.getKey()));
                }
                sb.append("=>");
                if (this == interfaceC3449.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC3449.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
