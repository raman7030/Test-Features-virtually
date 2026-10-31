package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18038 implements Map, Serializable, InterfaceC1830 {
    public static final long serialVersionUID = 1978198479659022715L;
    public final Map a;
    public final C18038 b = this;
    public transient C9572 c;
    public transient C9572 d;
    public transient C22811 e;

    public C18038(Map map) {
        this.a = (Map) C11003.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = this.a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = this.a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.b) {
            zContainsValue = this.a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.b) {
            objPut = this.a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.b) {
            objRemove = this.a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.b) {
            this.a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C9572 c9572;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new C9572(this.a.keySet(), this.b);
            }
            c9572 = this.c;
        }
        return c9572;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C9572 c9572;
        synchronized (this.b) {
            if (this.d == null) {
                this.d = new C9572(this.a.entrySet(), this.b);
            }
            c9572 = this.d;
        }
        return c9572;
    }

    @Override // java.util.Map
    public final Collection values() {
        C22811 c22811;
        synchronized (this.b) {
            if (this.e == null) {
                this.e = new C22811(this.a.values(), this.b);
            }
            c22811 = this.e;
        }
        return c22811;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = this.a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = this.a.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.b) {
            orDefault = C13843.getOrDefault(this.a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.b) {
            C13843.forEach(this.a, biConsumer);
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.b) {
            C13843.replaceAll(this.a, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        synchronized (this.b) {
            objPutIfAbsent = C13843.putIfAbsent(this.a, obj, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.b) {
            zRemove = C13843.remove(this.a, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.b) {
            zReplace = C13843.replace(this.a, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.b) {
            objReplace = C13843.replace(this.a, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.b) {
            objComputeIfAbsent = C13843.computeIfAbsent(this.a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        synchronized (this.b) {
            objComputeIfPresent = C13843.computeIfPresent(this.a, obj, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        synchronized (this.b) {
            objCompute = C13843.compute(this.a, obj, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        synchronized (this.b) {
            objMerge = C13843.merge(this.a, obj, obj2, biFunction);
        }
        return objMerge;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
