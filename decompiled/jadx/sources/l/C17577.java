package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17577 implements Map.Entry {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f53723;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f53724;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC14754 f53725;

    public C17577(ConcurrentMapC14754 concurrentMapC14754, Object obj, Object obj2) {
        this.f53725 = concurrentMapC14754;
        this.f53724 = obj;
        this.f53723 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f53724;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f53723;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f53724.equals(entry.getKey()) && this.f53723.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f53724.hashCode() ^ this.f53723.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f53725.put(this.f53724, obj);
        this.f53723 = obj;
        return objPut;
    }

    public final String toString() {
        return this.f53724 + "=" + this.f53723;
    }
}
