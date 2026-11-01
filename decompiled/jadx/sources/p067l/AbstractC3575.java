package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3575 extends AbstractC2904 implements InterfaceC15350, InterfaceC4108 {
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

    @Override // p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo4793(int i);

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C5293.m11446(this, (Integer) obj, obj2);
    }

    @Override // p067l.InterfaceC15350, java.util.Map
    public InterfaceC20007 entrySet() {
        return mo8079();
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final Object get(Object obj) {
        return C5293.m11448(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C5293.m11449(this, obj);
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        return C5293.m11447(this, obj);
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
    public void putAll(Map map) {
        if (map instanceof InterfaceC15350) {
            InterfaceC13833 interfaceC13833M29904 = C13064.m29904((InterfaceC15350) map);
            while (interfaceC13833M29904.hasNext()) {
                InterfaceC13340 interfaceC13340 = (InterfaceC13340) interfaceC13833M29904.next();
                mo4686(interfaceC13340.mo17550(), interfaceC13340.getValue());
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
            C5293.m11446(this, (Integer) entry.getKey(), entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        InterfaceC13833 interfaceC13833M29904 = C13064.m29904(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC13340) interfaceC13833M29904.next()).hashCode();
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
        return mo8079().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC13833 interfaceC13833M29904 = C13064.m29904(this);
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
                InterfaceC13340 interfaceC13340 = (InterfaceC13340) interfaceC13833M29904.next();
                sb.append(String.valueOf(interfaceC13340.mo17550()));
                sb.append("=>");
                if (this == interfaceC13340.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC13340.getValue()));
                }
                size = i;
            } else {
                sb.append(C0249l.f1198d);
                return sb.toString();
            }
        }
    }
}
