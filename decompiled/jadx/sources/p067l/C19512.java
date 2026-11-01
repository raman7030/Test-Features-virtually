package p067l;

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
public final class C19512 implements Map, Serializable, InterfaceC4108 {
    public static final long serialVersionUID = 1978198479659022715L;

    /* JADX INFO: renamed from: a */
    public final Map f59430a;

    /* JADX INFO: renamed from: b */
    public final C19512 f59431b = this;

    /* JADX INFO: renamed from: c */
    public transient C11466 f59432c;

    /* JADX INFO: renamed from: d */
    public transient C11466 f59433d;

    /* JADX INFO: renamed from: e */
    public transient C24048 f59434e;

    public C19512(Map map) {
        this.f59430a = (Map) C12826.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f59431b) {
            size = this.f59430a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f59431b) {
            zIsEmpty = this.f59430a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f59431b) {
            zContainsKey = this.f59430a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f59431b) {
            zContainsValue = this.f59430a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f59431b) {
            obj2 = this.f59430a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f59431b) {
            objPut = this.f59430a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f59431b) {
            objRemove = this.f59430a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f59431b) {
            this.f59430a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f59431b) {
            this.f59430a.clear();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C11466 c11466;
        synchronized (this.f59431b) {
            if (this.f59432c == null) {
                this.f59432c = new C11466(this.f59430a.keySet(), this.f59431b);
            }
            c11466 = this.f59432c;
        }
        return c11466;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C11466 c11466;
        synchronized (this.f59431b) {
            if (this.f59433d == null) {
                this.f59433d = new C11466(this.f59430a.entrySet(), this.f59431b);
            }
            c11466 = this.f59433d;
        }
        return c11466;
    }

    @Override // java.util.Map
    public final Collection values() {
        C24048 c24048;
        synchronized (this.f59431b) {
            if (this.f59434e == null) {
                this.f59434e = new C24048(this.f59430a.values(), this.f59431b);
            }
            c24048 = this.f59434e;
        }
        return c24048;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f59431b) {
            zEquals = this.f59430a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f59431b) {
            iHashCode = this.f59430a.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        String string;
        synchronized (this.f59431b) {
            string = this.f59430a.toString();
        }
        return string;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f59431b) {
            orDefault = C15525.getOrDefault(this.f59430a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f59431b) {
            C15525.forEach(this.f59430a, biConsumer);
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f59431b) {
            C15525.replaceAll(this.f59430a, biFunction);
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        synchronized (this.f59431b) {
            objPutIfAbsent = C15525.putIfAbsent(this.f59430a, obj, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f59431b) {
            zRemove = C15525.remove(this.f59430a, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.f59431b) {
            zReplace = C15525.replace(this.f59430a, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.f59431b) {
            objReplace = C15525.replace(this.f59430a, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.f59431b) {
            objComputeIfAbsent = C15525.computeIfAbsent(this.f59430a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        synchronized (this.f59431b) {
            objComputeIfPresent = C15525.computeIfPresent(this.f59430a, obj, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        synchronized (this.f59431b) {
            objCompute = C15525.compute(this.f59430a, obj, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        synchronized (this.f59431b) {
            objMerge = C15525.merge(this.f59430a, obj, obj2, biFunction);
        }
        return objMerge;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f59431b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
