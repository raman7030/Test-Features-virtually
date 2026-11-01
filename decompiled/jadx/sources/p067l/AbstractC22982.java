package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public abstract class AbstractC22982 extends AbstractC16945 implements InterfaceC2492, InterfaceC4108 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C24243.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C24243.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C24243.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C24243.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C24243.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C24243.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C24243.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        C11211 c11211 = (C11211) this;
        boolean zMo9531 = c11211.mo9531(jLongValue);
        Object objMo25899 = c11211.mo25899(jLongValue, obj2);
        if (zMo9531) {
            return objMo25899;
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C11211) this).mo3604();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        C11211 c11211 = (C11211) this;
        if (c11211.mo9531(jLongValue)) {
            return c11211.m25900(jLongValue);
        }
        return null;
    }

    @Override // p067l.AbstractC16945, p067l.InterfaceC11771
    public final Object get(Object obj) {
        return C10540.m24296(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C11211) this).mo9531(((Long) obj).longValue());
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return C24243.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        if (map instanceof InterfaceC2492) {
            InterfaceC13833 interfaceC13833M5424 = C3163.m5424((InterfaceC2492) map);
            while (interfaceC13833M5424.hasNext()) {
                InterfaceC19928 interfaceC19928 = (InterfaceC19928) interfaceC13833M5424.next();
                mo25899(interfaceC19928.mo36021(), interfaceC19928.getValue());
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
            C11211 c11211 = (C11211) this;
            c11211.mo9531(jLongValue);
            c11211.mo25899(jLongValue, value);
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C11211) this).f31141;
        InterfaceC13833 interfaceC13833M5424 = C3163.m5424(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC19928) interfaceC13833M5424.next()).hashCode();
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
        C11211 c11211 = (C11211) this;
        if (map.size() != c11211.f31141) {
            return false;
        }
        return ((AbstractCollection) c11211.mo3604()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC13833 interfaceC13833M5424 = C3163.m5424(this);
        int i = ((C11211) this).f31141;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC19928 interfaceC19928 = (InterfaceC19928) interfaceC13833M5424.next();
                sb.append(String.valueOf(interfaceC19928.mo36021()));
                sb.append("=>");
                if (this == interfaceC19928.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC19928.getValue()));
                }
                i = i2;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }
}
