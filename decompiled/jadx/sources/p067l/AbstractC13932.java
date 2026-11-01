package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13932 extends AbstractC14602 implements InterfaceC14344, InterfaceC4108 {
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
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ int mo26853(String str, C16102 c16102) {
        return C6968.m15962(this, str, c16102);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C24243.$default$getOrDefault(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C24243.$default$merge(this, obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C6968.m15963(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C24243.$default$putIfAbsent(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C24243.$default$replace(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo23938();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return Integer.valueOf(mo23937(obj));
        }
        return null;
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC11771
    public final Integer get(Object obj) {
        return C17025.m38624(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo23940(((Integer) obj).intValue());
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo26852(int i, String str) {
        int iMo23939 = mo23939(str);
        return (iMo23939 != 0 || containsKey(str)) ? iMo23939 : i;
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC14344) {
            InterfaceC13833 interfaceC13833M19164 = C8309.m19164((InterfaceC14344) map);
            while (interfaceC13833M19164.hasNext()) {
                InterfaceC5627 interfaceC5627 = (InterfaceC5627) interfaceC13833M19164.next();
                mo23936(interfaceC5627.mo12466(), interfaceC5627.getKey());
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
            C6968.m15963(this, entry.getKey(), (Integer) entry.getValue());
            size = i;
        }
    }

    public int hashCode() {
        int size = size();
        InterfaceC13833 interfaceC13833M19164 = C8309.m19164(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC5627) interfaceC13833M19164.next()).hashCode();
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
        return mo23938().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC13833 interfaceC13833M19164 = C8309.m19164(this);
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
                InterfaceC5627 interfaceC5627 = (InterfaceC5627) interfaceC13833M19164.next();
                if (this == interfaceC5627.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC5627.getKey()));
                }
                sb.append("=>");
                sb.append(String.valueOf(interfaceC5627.mo12466()));
                size = i;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean remove(Object obj, Object obj2) {
        return C24243.$default$remove(this, obj, obj2);
    }
}
