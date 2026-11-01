package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܳۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15903 implements InterfaceC19928, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f46008;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C11211 f46009;

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return mo17722();
    }

    public C15903(C11211 c11211) {
        this.f46009 = c11211;
    }

    public C15903(C11211 c11211, int i) {
        this.f46009 = c11211;
        this.f46008 = i;
    }

    @Override // p067l.InterfaceC19928
    /* JADX INFO: renamed from: ܺ */
    public final long mo36021() {
        return this.f46009.f31145[this.f46008];
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Long.valueOf(this.f46009.f31145[this.f46008]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Long.valueOf(this.f46009.f31145[this.f46008]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f46009.f31140[this.f46008];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return this.f46009.f31140[this.f46008];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f46009.f31140;
        int i = this.f46008;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Long.valueOf(this.f46009.f31145[this.f46008]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C11211 c11211 = this.f46009;
        return c11211.f31145[this.f46008] == ((Long) entry.getKey()).longValue() && C12826.equals(c11211.f31140[this.f46008], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C11211 c11211 = this.f46009;
        long[] jArr = c11211.f31145;
        int i = this.f46008;
        long j = jArr[i];
        int i2 = (int) (j ^ (j >>> 32));
        Object obj = c11211.f31140[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C11211 c11211 = this.f46009;
        sb.append(c11211.f31145[this.f46008]);
        sb.append("=>");
        sb.append(c11211.f31140[this.f46008]);
        return sb.toString();
    }
}
