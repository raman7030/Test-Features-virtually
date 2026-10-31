package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1L7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19615 extends AbstractC18909 implements InterfaceC19097, InterfaceC1830 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Integer) C23016.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Integer) C23016.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Integer) C23016.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C23016.$default$getOrDefault(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C23016.$default$merge(this, (Integer) obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C16273.m38283(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C23016.$default$putIfAbsent(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C23016.$default$replace(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, (Integer) obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // l.InterfaceC9893
    public final Object get(Object obj) {
        int iIntValue;
        int i;
        if (obj != null && ((i = get((iIntValue = ((Integer) obj).intValue()))) != mo23660() || mo23659(iIntValue))) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C10630) this).mo26663();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C10630 c10630 = (C10630) this;
        if (c10630.mo23659(iIntValue)) {
            return Integer.valueOf(c10630.remove(iIntValue));
        }
        return null;
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C10630) this).mo23659(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C10630) this).m26667(((Integer) obj).intValue());
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC19097) {
            InterfaceC18559 interfaceC18559Mo26663 = ((InterfaceC19097) map).mo26663();
            InterfaceC12063 interfaceC12063Mo12865 = interfaceC18559Mo26663 instanceof InterfaceC4280 ? ((InterfaceC4280) interfaceC18559Mo26663).mo12865() : interfaceC18559Mo26663.iterator();
            while (interfaceC12063Mo12865.hasNext()) {
                InterfaceC2869 interfaceC2869 = (InterfaceC2869) interfaceC12063Mo12865.next();
                mo23658(interfaceC2869.mo8791(), interfaceC2869.mo8792());
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
            C16273.m38283(this, (Integer) entry.getKey(), (Integer) entry.getValue());
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
        C10630 c10630 = (C10630) this;
        if (map.size() != c10630.f31945) {
            return false;
        }
        return ((AbstractCollection) c10630.mo26663()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C10630 c10630 = (C10630) this;
        InterfaceC18559 interfaceC18559Mo26663 = c10630.mo26663();
        InterfaceC12063 interfaceC12063Mo12865 = C12354.m29972(interfaceC18559Mo26663) ? ((InterfaceC4280) interfaceC18559Mo26663).mo12865() : ((C20508) interfaceC18559Mo26663).iterator();
        int i = c10630.f31945;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC2869 interfaceC2869 = (InterfaceC2869) interfaceC12063Mo12865.next();
                sb.append(String.valueOf(interfaceC2869.mo8791()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC2869.mo8792()));
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
