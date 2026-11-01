package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20815 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f65408a;

    /* JADX INFO: renamed from: b */
    public Object f65409b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentMapC12768 f65410c;

    public C20815(Object obj, Object obj2, ConcurrentMapC12768 concurrentMapC12768) {
        this.f65408a = obj;
        this.f65409b = obj2;
        this.f65410c = concurrentMapC12768;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f65408a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f65409b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f65408a.hashCode() ^ this.f65409b.hashCode();
    }

    public final String toString() {
        return AbstractC17736.m40317s(this.f65408a, this.f65409b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f65408a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f65409b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f65409b;
        this.f65409b = obj;
        this.f65410c.put(this.f65408a, obj);
        return obj2;
    }
}
