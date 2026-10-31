package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C13098 implements Map, Serializable, InterfaceC1830 {
    public static final long serialVersionUID = -1034234728574286014L;
    public final Map a;
    public transient Set b;
    public transient C4632 c;
    public transient Collection d;

    public C13098(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.b == null) {
            this.b = C20195.unmodifiableSet(this.a.keySet());
        }
        return this.b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.c == null) {
            this.c = new C4632(this.a.entrySet());
        }
        return this.c;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.d == null) {
            this.d = C20195.unmodifiableCollection(this.a.values());
        }
        return this.d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        return C13843.getOrDefault(this.a, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C13843.forEach(this.a, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
