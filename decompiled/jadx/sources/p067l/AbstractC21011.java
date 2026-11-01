package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public abstract class AbstractC21011 extends AbstractC20340 implements InterfaceC20519, InterfaceC4108 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Integer) C24243.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Integer) C24243.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Integer) C24243.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C24243.$default$getOrDefault(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C24243.$default$merge(this, (Integer) obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C17835.m40497(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C24243.$default$putIfAbsent(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C24243.$default$replace(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, (Integer) obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // p067l.InterfaceC11771
    public final Object get(Object obj) {
        int iIntValue;
        int i;
        if (obj != null && ((i = get((iIntValue = ((Integer) obj).intValue()))) != mo25659() || mo25658(iIntValue))) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C12472) this).mo28703();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C12472 c12472 = (C12472) this;
        if (c12472.mo25658(iIntValue)) {
            return Integer.valueOf(c12472.remove(iIntValue));
        }
        return null;
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C12472) this).mo25658(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C12472) this).m28707(((Integer) obj).intValue());
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC20519) {
            InterfaceC20007 interfaceC20007Mo28703 = ((InterfaceC20519) map).mo28703();
            InterfaceC13833 interfaceC13833Mo14729 = interfaceC20007Mo28703 instanceof InterfaceC6437 ? ((InterfaceC6437) interfaceC20007Mo28703).mo14729() : interfaceC20007Mo28703.iterator();
            while (interfaceC13833Mo14729.hasNext()) {
                InterfaceC5096 interfaceC5096 = (InterfaceC5096) interfaceC13833Mo14729.next();
                mo25657(interfaceC5096.mo10858(), interfaceC5096.mo10859());
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
            C17835.m40497(this, (Integer) entry.getKey(), (Integer) entry.getValue());
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
        C12472 c12472 = (C12472) this;
        if (map.size() != c12472.f34917) {
            return false;
        }
        return ((AbstractCollection) c12472.mo28703()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C12472 c12472 = (C12472) this;
        InterfaceC20007 interfaceC20007Mo28703 = c12472.mo28703();
        InterfaceC13833 interfaceC13833Mo14729 = C14110.m32033(interfaceC20007Mo28703) ? ((InterfaceC6437) interfaceC20007Mo28703).mo14729() : ((C21860) interfaceC20007Mo28703).iterator();
        int i = c12472.f34917;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC5096 interfaceC5096 = (InterfaceC5096) interfaceC13833Mo14729.next();
                sb.append(String.valueOf(interfaceC5096.mo10858()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC5096.mo10859()));
                i = i2;
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
