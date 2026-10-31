package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12167 extends AbstractC12872 implements InterfaceC12600, InterfaceC1830 {
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
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ int mo24838(String str, C14450 c14450) {
        return C4839.m14082(this, str, c14450);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C23016.$default$getOrDefault(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C23016.$default$merge(this, obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C4839.m14083(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C23016.$default$putIfAbsent(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C23016.$default$replace(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo21967();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return Integer.valueOf(mo21966(obj));
        }
        return null;
    }

    @Override // l.AbstractC12872, l.InterfaceC9893
    public final Integer get(Object obj) {
        return C15421.m36466(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo21969(((Integer) obj).intValue());
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo24837(int i, String str) {
        int iMo21968 = mo21968(str);
        return (iMo21968 != 0 || containsKey(str)) ? iMo21968 : i;
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC12600) {
            InterfaceC12063 interfaceC12063M17226 = C6250.m17226((InterfaceC12600) map);
            while (interfaceC12063M17226.hasNext()) {
                InterfaceC3428 interfaceC3428 = (InterfaceC3428) interfaceC12063M17226.next();
                mo21965(interfaceC3428.mo10427(), interfaceC3428.getKey());
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
            C4839.m14083(this, entry.getKey(), (Integer) entry.getValue());
            size = i;
        }
    }

    public int hashCode() {
        int size = size();
        InterfaceC12063 interfaceC12063M17226 = C6250.m17226(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC3428) interfaceC12063M17226.next()).hashCode();
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
        return mo21967().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12063 interfaceC12063M17226 = C6250.m17226(this);
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
                InterfaceC3428 interfaceC3428 = (InterfaceC3428) interfaceC12063M17226.next();
                if (this == interfaceC3428.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC3428.getKey()));
                }
                sb.append("=>");
                sb.append(String.valueOf(interfaceC3428.mo10427()));
                size = i;
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
