package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VXN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4092 extends AbstractC2681 implements InterfaceC3302, InterfaceC1830 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Float) C23016.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Float) C23016.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Float) C23016.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Float) C23016.$default$getOrDefault(this, obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Float) C23016.$default$merge(this, (Integer) obj, (Float) obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C1185.m4005(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Float) C23016.$default$putIfAbsent(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Float) C23016.$default$replace(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, (Integer) obj, (Float) obj2, (Float) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C21214) this).mo10099();
    }

    @Override // l.AbstractC2681, l.InterfaceC8241, l.InterfaceC9893
    public final Float get(Object obj) {
        return C1185.m4006(this, obj);
    }

    @Override // l.AbstractC2681, l.InterfaceC9893
    public final Object get(Object obj) {
        return C1185.m4006(this, obj);
    }

    @Override // l.AbstractC2681, l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo21825(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C1185.m4007(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C21214) this).m48159(((Float) obj).floatValue());
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC3302) {
            InterfaceC18559 interfaceC18559Mo10099 = ((InterfaceC3302) map).mo10099();
            InterfaceC12063 interfaceC12063Mo13813 = interfaceC18559Mo10099 instanceof InterfaceC4713 ? ((InterfaceC4713) interfaceC18559Mo10099).mo13813() : interfaceC18559Mo10099.iterator();
            while (interfaceC12063Mo13813.hasNext()) {
                InterfaceC20236 interfaceC20236 = (InterfaceC20236) interfaceC12063Mo13813.next();
                mo8401(interfaceC20236.mo39812(), interfaceC20236.mo39811());
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
            C1185.m4005(this, (Integer) entry.getKey(), (Float) entry.getValue());
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
        C21214 c21214 = (C21214) this;
        if (map.size() != c21214.f68347) {
            return false;
        }
        return ((AbstractCollection) c21214.mo10099()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C21214 c21214 = (C21214) this;
        InterfaceC18559 interfaceC18559Mo10099 = c21214.mo10099();
        InterfaceC12063 interfaceC12063Mo13813 = C12354.m29972(interfaceC18559Mo10099) ? ((InterfaceC4713) interfaceC18559Mo10099).mo13813() : ((C18391) interfaceC18559Mo10099).iterator();
        int i = c21214.f68347;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC20236 interfaceC20236 = (InterfaceC20236) interfaceC12063Mo13813.next();
                sb.append(String.valueOf(interfaceC20236.mo39811()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC20236.mo39812()));
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
