package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public abstract class AbstractC6258 extends AbstractC4917 implements InterfaceC5507, InterfaceC4108 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Float) C24243.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Float) C24243.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Float) C24243.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Float) C24243.$default$getOrDefault(this, obj, (Float) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Float) C24243.$default$merge(this, (Integer) obj, (Float) obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C3495.m6247(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Float) C24243.$default$putIfAbsent(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return (Float) C24243.$default$replace(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, (Integer) obj, (Float) obj2, (Float) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C22531) this).mo12134();
    }

    @Override // p067l.AbstractC4917, p067l.InterfaceC10201, p067l.InterfaceC11771
    public final Float get(Object obj) {
        return C3495.m6248(this, obj);
    }

    @Override // p067l.AbstractC4917, p067l.InterfaceC11771
    public final Object get(Object obj) {
        return C3495.m6248(this, obj);
    }

    @Override // p067l.AbstractC4917, p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo23794(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C3495.m6249(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C22531) this).m50490(((Float) obj).floatValue());
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC5507) {
            InterfaceC20007 interfaceC20007Mo12134 = ((InterfaceC5507) map).mo12134();
            InterfaceC13833 interfaceC13833Mo15689 = interfaceC20007Mo12134 instanceof InterfaceC6848 ? ((InterfaceC6848) interfaceC20007Mo12134).mo15689() : interfaceC20007Mo12134.iterator();
            while (interfaceC13833Mo15689.hasNext()) {
                InterfaceC21601 interfaceC21601 = (InterfaceC21601) interfaceC13833Mo15689.next();
                mo10447(interfaceC21601.mo42055(), interfaceC21601.mo42054());
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
            C3495.m6247(this, (Integer) entry.getKey(), (Float) entry.getValue());
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
        C22531 c22531 = (C22531) this;
        if (map.size() != c22531.f71030) {
            return false;
        }
        return ((AbstractCollection) c22531.mo12134()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C22531 c22531 = (C22531) this;
        InterfaceC20007 interfaceC20007Mo12134 = c22531.mo12134();
        InterfaceC13833 interfaceC13833Mo15689 = C14110.m32033(interfaceC20007Mo12134) ? ((InterfaceC6848) interfaceC20007Mo12134).mo15689() : ((C19848) interfaceC20007Mo12134).iterator();
        int i = c22531.f71030;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC21601 interfaceC21601 = (InterfaceC21601) interfaceC13833Mo15689.next();
                sb.append(String.valueOf(interfaceC21601.mo42054()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC21601.mo42055()));
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
