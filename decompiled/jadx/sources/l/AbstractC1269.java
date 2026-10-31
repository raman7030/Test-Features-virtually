package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1269 extends AbstractC0563 implements InterfaceC13659, InterfaceC1830 {
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

    @Override // l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo2422(int i);

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C3077.m9404(this, (Integer) obj, obj2);
    }

    @Override // l.InterfaceC13659, java.util.Map
    public InterfaceC18559 entrySet() {
        return mo5869();
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final Object get(Object obj) {
        return C3077.m9406(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C3077.m9407(this, obj);
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        return C3077.m9405(this, obj);
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
        if (map instanceof InterfaceC13659) {
            InterfaceC12063 interfaceC12063M27842 = C11253.m27842((InterfaceC13659) map);
            while (interfaceC12063M27842.hasNext()) {
                InterfaceC11544 interfaceC11544 = (InterfaceC11544) interfaceC12063M27842.next();
                mo2318(interfaceC11544.mo15639(), interfaceC11544.getValue());
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
            C3077.m9404(this, (Integer) entry.getKey(), entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        InterfaceC12063 interfaceC12063M27842 = C11253.m27842(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC11544) interfaceC12063M27842.next()).hashCode();
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
        return mo5869().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12063 interfaceC12063M27842 = C11253.m27842(this);
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
                InterfaceC11544 interfaceC11544 = (InterfaceC11544) interfaceC12063M27842.next();
                sb.append(String.valueOf(interfaceC11544.mo15639()));
                sb.append("=>");
                if (this == interfaceC11544.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC11544.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
