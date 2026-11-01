package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: WCM1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18216 extends AbstractC12853 implements InterfaceC18712, InterfaceC4108 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, p067l.InterfaceC4108
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C24243.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C24243.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C24243.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C24243.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Character) C24243.$default$getOrDefault(this, obj, (Character) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C24243.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C12678.m29155(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C24243.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        return (Character) C24243.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C24243.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C13523) this).mo30689();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        C13523 c13523 = (C13523) this;
        if (c13523.mo22105(cCharValue)) {
            return Character.valueOf(c13523.m30690(cCharValue));
        }
        return null;
    }

    @Override // p067l.AbstractC12853, p067l.InterfaceC15533, p067l.InterfaceC11771
    public final Character get(Object obj) {
        return C24251.m53559(this, obj);
    }

    @Override // p067l.AbstractC12853, p067l.InterfaceC11771
    public final Object get(Object obj) {
        return C24251.m53559(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C13523) this).mo22105(((Character) obj).charValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        char cCharValue = ((Character) obj).charValue();
        C13523 c13523 = (C13523) this;
        char[] cArr = c13523.f38005;
        int i = c13523.f38006;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] == cCharValue) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        if (map instanceof InterfaceC18712) {
            InterfaceC13833 interfaceC13833M54408 = C24747.m54408((InterfaceC18712) map);
            while (interfaceC13833M54408.hasNext()) {
                InterfaceC18041 interfaceC18041 = (InterfaceC18041) interfaceC13833M54408.next();
                mo29435(interfaceC18041.mo33969(), interfaceC18041.mo33968());
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
            C12678.m29155(this, (Character) entry.getKey(), (Character) entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C13523) this).f38006;
        InterfaceC13833 interfaceC13833M54408 = C24747.m54408(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC18041) interfaceC13833M54408.next()).hashCode();
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
        C13523 c13523 = (C13523) this;
        if (map.size() != c13523.f38006) {
            return false;
        }
        return ((AbstractCollection) c13523.mo30689()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC13833 interfaceC13833M54408 = C24747.m54408(this);
        int i = ((C13523) this).f38006;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC18041 interfaceC18041 = (InterfaceC18041) interfaceC13833M54408.next();
                sb.append(String.valueOf(interfaceC18041.mo33969()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC18041.mo33968()));
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
