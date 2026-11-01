package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21051 implements InterfaceC5627, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f66089;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C10321 f66090;

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Integer.valueOf(m47488());
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Integer.valueOf(m47488());
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return mo17723();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f66090.f28586;
        int i = this.f66089;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C21051(C10321 c10321) {
        this.f66090 = c10321;
    }

    public C21051(C10321 c10321, int i) {
        this.f66090 = c10321;
        this.f66089 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f66090.f28591[this.f66089];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return this.f66090.f28591[this.f66089];
    }

    @Override // p067l.InterfaceC5627
    /* JADX INFO: renamed from: ᩷ */
    public final int mo12466() {
        return this.f66090.f28586[this.f66089];
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m47488() {
        return this.f66090.f28586[this.f66089];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f66090.f28586[this.f66089]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C10321 c10321 = this.f66090;
        return C12826.equals(c10321.f28591[this.f66089], entry.getKey()) && c10321.f28586[this.f66089] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C10321 c10321 = this.f66090;
        Object obj = c10321.f28591[this.f66089];
        return c10321.f28586[this.f66089] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C10321 c10321 = this.f66090;
        sb.append(c10321.f28591[this.f66089]);
        sb.append("=>");
        sb.append(c10321.f28586[this.f66089]);
        return sb.toString();
    }
}
