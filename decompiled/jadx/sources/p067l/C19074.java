package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19074 implements Map.Entry {

    /* JADX INFO: renamed from: ᩶ */
    public Object f56913;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f56914;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ConcurrentMapC16391 f56915;

    public C19074(ConcurrentMapC16391 concurrentMapC16391, Object obj, Object obj2) {
        this.f56915 = concurrentMapC16391;
        this.f56914 = obj;
        this.f56913 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f56914;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f56913;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f56914.equals(entry.getKey()) && this.f56913.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f56914.hashCode() ^ this.f56913.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f56915.put(this.f56914, obj);
        this.f56913 = obj;
        return objPut;
    }

    public final String toString() {
        return this.f56914 + "=" + this.f56913;
    }
}
