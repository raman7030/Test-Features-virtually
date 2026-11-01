package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19197 implements InterfaceC5647, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f57376;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C11151 f57377;

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return mo17723();
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return mo17722();
    }

    public C19197(C11151 c11151, int i) {
        this.f57377 = c11151;
        this.f57376 = i;
    }

    public C19197(C11151 c11151) {
        this.f57377 = c11151;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f57377.f30922[this.f57376];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return this.f57377.f30922[this.f57376];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f57377.f30929[this.f57376];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return this.f57377.f30929[this.f57376];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f57377.f30929;
        int i = this.f57376;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C11151 c11151 = this.f57377;
        return c11151.f30933.mo10801(c11151.f30922[this.f57376], entry.getKey()) && C12826.equals(c11151.f30929[this.f57376], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C11151 c11151 = this.f57377;
        int iMo10800 = c11151.f30933.mo10800(c11151.f30922[this.f57376]);
        Object obj = c11151.f30929[this.f57376];
        return (obj == null ? 0 : obj.hashCode()) ^ iMo10800;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C11151 c11151 = this.f57377;
        sb.append(c11151.f30922[this.f57376]);
        sb.append("=>");
        sb.append(c11151.f30929[this.f57376]);
        return sb.toString();
    }
}
