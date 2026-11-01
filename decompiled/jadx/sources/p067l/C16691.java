package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܶۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16691 implements InterfaceC13340, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f49165;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C6634 f49166;

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Integer.valueOf(m37829());
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Integer.valueOf(m37829());
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return mo17722();
    }

    public C16691(C6634 c6634) {
        this.f49166 = c6634;
    }

    public C16691(C6634 c6634, int i) {
        this.f49166 = c6634;
        this.f49165 = i;
    }

    @Override // p067l.InterfaceC13340
    /* JADX INFO: renamed from: ֫ */
    public final int mo17550() {
        return this.f49166.f17111[this.f49165];
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m37829() {
        return this.f49166.f17111[this.f49165];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f49166.f17106[this.f49165];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return this.f49166.f17106[this.f49165];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f49166.f17106;
        int i = this.f49165;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f49166.f17111[this.f49165]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C6634 c6634 = this.f49166;
        return c6634.f17111[this.f49165] == ((Integer) entry.getKey()).intValue() && C12826.equals(c6634.f17106[this.f49165], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C6634 c6634 = this.f49166;
        int[] iArr = c6634.f17111;
        int i = this.f49165;
        int i2 = iArr[i];
        Object obj = c6634.f17106[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C6634 c6634 = this.f49166;
        sb.append(c6634.f17111[this.f49165]);
        sb.append("=>");
        sb.append(c6634.f17106[this.f49165]);
        return sb.toString();
    }
}
