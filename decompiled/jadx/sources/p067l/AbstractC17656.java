package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public abstract class AbstractC17656 extends AbstractC10952 implements InterfaceC19589, InterfaceC4108 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Byte) C24243.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Byte) C24243.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Byte) C24243.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Byte) C24243.$default$getOrDefault(this, obj, (Byte) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Byte) C24243.$default$merge(this, (Integer) obj, (Byte) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C4166.m8436(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Byte) C24243.$default$putIfAbsent(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return (Byte) C24243.$default$replace(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, (Integer) obj, (Byte) obj2, (Byte) obj3);
    }

    @Override // p067l.InterfaceC11771
    public final Object get(Object obj) {
        int iIntValue;
        byte b;
        if (obj != null && ((b = get((iIntValue = ((Integer) obj).intValue()))) != 0 || mo17421(iIntValue))) {
            return Byte.valueOf(b);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C7519) this).mo17422();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C7519 c7519 = (C7519) this;
        if (c7519.mo17421(iIntValue)) {
            return Byte.valueOf(c7519.remove(iIntValue));
        }
        return null;
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C7519) this).mo17421(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C7519) this).m17420(((Byte) obj).byteValue());
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC19589) {
            InterfaceC20007 interfaceC20007Mo17422 = ((InterfaceC19589) map).mo17422();
            InterfaceC13833 interfaceC13833Mo10263 = interfaceC20007Mo17422 instanceof InterfaceC18247 ? ((InterfaceC18247) interfaceC20007Mo17422).mo10263() : interfaceC20007Mo17422.iterator();
            while (interfaceC13833Mo10263.hasNext()) {
                InterfaceC12884 interfaceC12884 = (InterfaceC12884) interfaceC13833Mo10263.next();
                mo17419(interfaceC12884.mo29510(), interfaceC12884.mo29509());
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
            C4166.m8436(this, (Integer) entry.getKey(), (Byte) entry.getValue());
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
        C7519 c7519 = (C7519) this;
        if (map.size() != c7519.f19739) {
            return false;
        }
        return ((AbstractCollection) c7519.mo17422()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C7519 c7519 = (C7519) this;
        InterfaceC20007 interfaceC20007Mo17422 = c7519.mo17422();
        InterfaceC13833 interfaceC13833Mo10263 = C14110.m32033(interfaceC20007Mo17422) ? ((InterfaceC18247) interfaceC20007Mo17422).mo10263() : ((C4837) interfaceC20007Mo17422).iterator();
        int i = c7519.f19739;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC12884 interfaceC12884 = (InterfaceC12884) interfaceC13833Mo10263.next();
                sb.append(String.valueOf(interfaceC12884.mo29509()));
                sb.append("=>");
                sb.append(String.valueOf((int) interfaceC12884.mo29510()));
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
