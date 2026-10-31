package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1DS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14558 extends AbstractC18087 implements InterfaceC13668, InterfaceC1830 {
    public static final long serialVersionUID = -4940583368468432370L;

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

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C23016.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C23016.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C23016.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C23016.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo13247(char c);

    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C3086.m9433(this, (Character) obj, obj2);
    }

    public InterfaceC18559 entrySet() {
        return mo1097();
    }

    @Override // l.AbstractC18087, l.InterfaceC9893
    public final Object get(Object obj) {
        return C3086.m9434(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C3086.m9435(this, obj);
    }

    @Override // l.AbstractC18087, l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo13247(((Character) obj).charValue());
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return C23016.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC13668) {
            InterfaceC12063 interfaceC12063M26817 = C10694.m26817((InterfaceC13668) map);
            while (interfaceC12063M26817.hasNext()) {
                InterfaceC11553 interfaceC11553 = (InterfaceC11553) interfaceC12063M26817.next();
                mo13246(interfaceC11553.mo23816(), interfaceC11553.getValue());
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
            C3086.m9433(this, (Character) entry.getKey(), entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        InterfaceC12063 interfaceC12063M26817 = C10694.m26817(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC11553) interfaceC12063M26817.next()).hashCode();
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
        return mo1097().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12063 interfaceC12063M26817 = C10694.m26817(this);
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
                InterfaceC11553 interfaceC11553 = (InterfaceC11553) interfaceC12063M26817.next();
                sb.append(String.valueOf(interfaceC11553.mo23816()));
                sb.append("=>");
                if (this == interfaceC11553.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC11553.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
