package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: NC7Z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16085 extends AbstractC9031 implements InterfaceC18119, InterfaceC1830 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Byte) C23016.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Byte) C23016.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Byte) C23016.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Byte) C23016.$default$getOrDefault(this, obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Byte) C23016.$default$merge(this, (Integer) obj, (Byte) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C1891.m6234(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Byte) C23016.$default$putIfAbsent(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Byte) C23016.$default$replace(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, (Integer) obj, (Byte) obj2, (Byte) obj3);
    }

    @Override // l.InterfaceC9893
    public final Object get(Object obj) {
        int iIntValue;
        byte b;
        if (obj != null && ((b = get((iIntValue = ((Integer) obj).intValue()))) != 0 || mo15510(iIntValue))) {
            return Byte.valueOf(b);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C5419) this).mo15511();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C5419 c5419 = (C5419) this;
        if (c5419.mo15510(iIntValue)) {
            return Byte.valueOf(c5419.remove(iIntValue));
        }
        return null;
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C5419) this).mo15510(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C5419) this).m15509(((Byte) obj).byteValue());
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC18119) {
            InterfaceC18559 interfaceC18559Mo15511 = ((InterfaceC18119) map).mo15511();
            InterfaceC12063 interfaceC12063Mo8224 = interfaceC18559Mo15511 instanceof InterfaceC16707 ? ((InterfaceC16707) interfaceC18559Mo15511).mo8224() : interfaceC18559Mo15511.iterator();
            while (interfaceC12063Mo8224.hasNext()) {
                InterfaceC11064 interfaceC11064 = (InterfaceC11064) interfaceC12063Mo8224.next();
                mo15508(interfaceC11064.mo27448(), interfaceC11064.mo27447());
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
            C1891.m6234(this, (Integer) entry.getKey(), (Byte) entry.getValue());
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
        C5419 c5419 = (C5419) this;
        if (map.size() != c5419.f16901) {
            return false;
        }
        return ((AbstractCollection) c5419.mo15511()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C5419 c5419 = (C5419) this;
        InterfaceC18559 interfaceC18559Mo15511 = c5419.mo15511();
        InterfaceC12063 interfaceC12063Mo8224 = C12354.m29972(interfaceC18559Mo15511) ? ((InterfaceC16707) interfaceC18559Mo15511).mo8224() : ((C2597) interfaceC18559Mo15511).iterator();
        int i = c5419.f16901;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC11064 interfaceC11064 = (InterfaceC11064) interfaceC12063Mo8224.next();
                sb.append(String.valueOf(interfaceC11064.mo27447()));
                sb.append("=>");
                sb.append(String.valueOf((int) interfaceC11064.mo27448()));
                i = i2;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        return C23016.$default$remove(this, obj, obj2);
    }
}
