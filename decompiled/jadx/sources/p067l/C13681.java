package p067l;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13681 implements Map {

    /* JADX INFO: renamed from: ᩸ */
    public final LinkedHashMap f38586;

    /* JADX INFO: renamed from: ᩹ */
    public final C15691 f38587;

    public C13681(C15691 c15691, LinkedHashMap linkedHashMap) {
        this.f38587 = c15691;
        this.f38586 = linkedHashMap;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f38586.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f38586.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f38586.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f38586.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f38586.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f38587.m35738();
        byte[] bArr = C15671.f44805;
        obj.getClass();
        obj2.getClass();
        return this.f38586.put(obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f38587.m35738();
        return this.f38586.remove(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f38587.m35738();
        for (Object obj : map.keySet()) {
            byte[] bArr = C15671.f44805;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f38586.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f38587.m35738();
        this.f38586.clear();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C8316(this.f38587, this.f38586.keySet());
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C14351(this.f38587, this.f38586.values());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C8316(this.f38587, this.f38586.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f38586.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f38586.hashCode();
    }

    public final String toString() {
        return this.f38586.toString();
    }
}
