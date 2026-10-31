package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5T */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21689 extends AbstractC15337 implements InterfaceC0130, InterfaceC1830 {
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

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        C9304 c9304 = (C9304) this;
        boolean zMo7449 = c9304.mo7449(jLongValue);
        Object objMo23890 = c9304.mo23890(jLongValue, obj2);
        if (zMo7449) {
            return objMo23890;
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C9304) this).mo1202();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        C9304 c9304 = (C9304) this;
        if (c9304.mo7449(jLongValue)) {
            return c9304.m23891(jLongValue);
        }
        return null;
    }

    @Override // l.AbstractC15337, l.InterfaceC9893
    public final Object get(Object obj) {
        return C8598.m22327(this, obj);
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C9304) this).mo7449(((Long) obj).longValue());
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
    public final void putAll(Map map) {
        if (map instanceof InterfaceC0130) {
            InterfaceC12063 interfaceC12063M3110 = C0836.m3110((InterfaceC0130) map);
            while (interfaceC12063M3110.hasNext()) {
                InterfaceC18476 interfaceC18476 = (InterfaceC18476) interfaceC12063M3110.next();
                mo23890(interfaceC18476.mo33889(), interfaceC18476.getValue());
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
            Long l2 = (Long) entry.getKey();
            Object value = entry.getValue();
            long jLongValue = l2.longValue();
            C9304 c9304 = (C9304) this;
            c9304.mo7449(jLongValue);
            c9304.mo23890(jLongValue, value);
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C9304) this).f28192;
        InterfaceC12063 interfaceC12063M3110 = C0836.m3110(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC18476) interfaceC12063M3110.next()).hashCode();
            i = i2;
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
        C9304 c9304 = (C9304) this;
        if (map.size() != c9304.f28192) {
            return false;
        }
        return ((AbstractCollection) c9304.mo1202()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12063 interfaceC12063M3110 = C0836.m3110(this);
        int i = ((C9304) this).f28192;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC18476 interfaceC18476 = (InterfaceC18476) interfaceC12063M3110.next();
                sb.append(String.valueOf(interfaceC18476.mo33889()));
                sb.append("=>");
                if (this == interfaceC18476.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC18476.getValue()));
                }
                i = i2;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
