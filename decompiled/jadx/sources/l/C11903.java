package l;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11903 implements Map {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f35576;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14018 f35577;

    public C11903(C14018 c14018, LinkedHashMap linkedHashMap) {
        this.f35577 = c14018;
        this.f35576 = linkedHashMap;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f35576.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f35576.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f35576.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f35576.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f35576.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f35577.m33618();
        byte[] bArr = C13997.f41722;
        obj.getClass();
        obj2.getClass();
        return this.f35576.put(obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f35577.m33618();
        return this.f35576.remove(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f35577.m33618();
        for (Object obj : map.keySet()) {
            byte[] bArr = C13997.f41722;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f35576.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f35577.m33618();
        this.f35576.clear();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C6258(this.f35577, this.f35576.keySet());
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C12608(this.f35577, this.f35576.values());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C6258(this.f35577, this.f35576.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f35576.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f35576.hashCode();
    }

    public final String toString() {
        return this.f35576.toString();
    }
}
