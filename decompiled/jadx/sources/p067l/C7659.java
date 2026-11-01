package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۚ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7659 implements InterfaceC5647, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f20086;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23082 f20087;

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return mo17723();
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return mo17722();
    }

    public C7659(C23082 c23082) {
        this.f20087 = c23082;
    }

    public C7659(C23082 c23082, int i) {
        this.f20087 = c23082;
        this.f20086 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20087.f72524[this.f20086];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return this.f20087.f72524[this.f20086];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20087.f72519[this.f20086];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return this.f20087.f72519[this.f20086];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f20087.f72519;
        int i = this.f20086;
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
        C23082 c23082 = this.f20087;
        return C12826.equals(c23082.f72524[this.f20086], entry.getKey()) && C12826.equals(c23082.f72519[this.f20086], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C23082 c23082 = this.f20087;
        Object obj = c23082.f72524[this.f20086];
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = c23082.f72519[this.f20086];
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C23082 c23082 = this.f20087;
        sb.append(c23082.f72524[this.f20086]);
        sb.append("=>");
        sb.append(c23082.f72519[this.f20086]);
        return sb.toString();
    }
}
