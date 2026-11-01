package p067l;

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
public class C14817 implements Map, Serializable, InterfaceC4108 {
    public static final long serialVersionUID = -1034234728574286014L;

    /* JADX INFO: renamed from: a */
    public final Map f42270a;

    /* JADX INFO: renamed from: b */
    public transient Set f42271b;

    /* JADX INFO: renamed from: c */
    public transient C6771 f42272c;

    /* JADX INFO: renamed from: d */
    public transient Collection f42273d;

    public C14817(Map map) {
        map.getClass();
        this.f42270a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f42270a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f42270a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f42270a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f42270a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f42270a.get(obj);
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
        if (this.f42271b == null) {
            this.f42271b = C21562.unmodifiableSet(this.f42270a.keySet());
        }
        return this.f42271b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f42272c == null) {
            this.f42272c = new C6771(this.f42270a.entrySet());
        }
        return this.f42272c;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f42273d == null) {
            this.f42273d = C21562.unmodifiableCollection(this.f42270a.values());
        }
        return this.f42273d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f42270a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f42270a.hashCode();
    }

    public final String toString() {
        return this.f42270a.toString();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        return C15525.getOrDefault(this.f42270a, obj, obj2);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C15525.forEach(this.f42270a, biConsumer);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
