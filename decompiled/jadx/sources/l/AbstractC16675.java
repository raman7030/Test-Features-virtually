package l;

import com.alipay.sdk.m.y.l;
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
public abstract class AbstractC16675 extends AbstractC11032 implements InterfaceC17197, InterfaceC1830 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC1830
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C23016.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C23016.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C23016.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C23016.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Character) C23016.$default$getOrDefault(this, obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C23016.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C10848.m27110(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C23016.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        return (Character) C23016.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C23016.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C11737) this).mo28641();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        C11737 c11737 = (C11737) this;
        if (c11737.mo20129(cCharValue)) {
            return Character.valueOf(c11737.m28642(cCharValue));
        }
        return null;
    }

    @Override // l.AbstractC11032, l.InterfaceC13852, l.InterfaceC9893
    public final Character get(Object obj) {
        return C23025.m51166(this, obj);
    }

    @Override // l.AbstractC11032, l.InterfaceC9893
    public final Object get(Object obj) {
        return C23025.m51166(this, obj);
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C11737) this).mo20129(((Character) obj).charValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        char cCharValue = ((Character) obj).charValue();
        C11737 c11737 = (C11737) this;
        char[] cArr = c11737.f35005;
        int i = c11737.f35006;
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

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        if (map instanceof InterfaceC17197) {
            InterfaceC12063 interfaceC12063M52006 = C23547.m52006((InterfaceC17197) map);
            while (interfaceC12063M52006.hasNext()) {
                InterfaceC16491 interfaceC16491 = (InterfaceC16491) interfaceC12063M52006.next();
                mo27373(interfaceC16491.mo31876(), interfaceC16491.mo31875());
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
            C10848.m27110(this, (Character) entry.getKey(), (Character) entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C11737) this).f35006;
        InterfaceC12063 interfaceC12063M52006 = C23547.m52006(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC16491) interfaceC12063M52006.next()).hashCode();
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
        C11737 c11737 = (C11737) this;
        if (map.size() != c11737.f35006) {
            return false;
        }
        return ((AbstractCollection) c11737.mo28641()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC12063 interfaceC12063M52006 = C23547.m52006(this);
        int i = ((C11737) this).f35006;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC16491 interfaceC16491 = (InterfaceC16491) interfaceC12063M52006.next();
                sb.append(String.valueOf(interfaceC16491.mo31876()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC16491.mo31875()));
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
