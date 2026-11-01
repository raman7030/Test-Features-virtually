package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: YC5H */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7897 extends AbstractC11921 implements InterfaceC14364, InterfaceC4108 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C6988.m16052(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C24243.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C6988.m16056(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C6988.m16051(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo25689();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return (obj3 != null || containsKey(obj)) ? obj3 : obj2;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null || containsKey(obj)) {
            return obj3;
        }
        put(obj, obj2);
        return null;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public boolean remove(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (!C12826.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !containsKey(obj)) {
            return false;
        }
        remove(obj);
        return true;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public boolean replace(Object obj, Object obj2, Object obj3) {
        Object obj4 = get(obj);
        if (!C12826.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !containsKey(obj)) {
            return false;
        }
        put(obj, obj3);
        return true;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public Object replace(Object obj, Object obj2) {
        if (containsKey(obj)) {
            return put(obj, obj2);
        }
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC14364) {
            InterfaceC13833 interfaceC13833M19216 = C8329.m19216((InterfaceC14364) map);
            while (interfaceC13833M19216.hasNext()) {
                InterfaceC5647 interfaceC5647 = (InterfaceC5647) interfaceC13833M19216.next();
                put(interfaceC5647.getKey(), interfaceC5647.getValue());
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
        InterfaceC13833 interfaceC13833M19216 = C8329.m19216(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC5647) interfaceC13833M19216.next()).hashCode();
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
        return mo25689().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC13833 interfaceC13833M19216 = C8329.m19216(this);
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
                InterfaceC5647 interfaceC5647 = (InterfaceC5647) interfaceC13833M19216.next();
                if (this == interfaceC5647.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC5647.getKey()));
                }
                sb.append("=>");
                if (this == interfaceC5647.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC5647.getValue()));
                }
                size = i;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }
}
