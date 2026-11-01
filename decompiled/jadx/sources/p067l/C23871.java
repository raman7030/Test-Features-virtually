package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23871 implements InterfaceC5096, Map.Entry, InterfaceC19434 {

    /* JADX INFO: renamed from: ᩸ */
    public int f75803;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C12472 f75804;

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Integer.valueOf(mo41150());
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ֡ */
    public final int mo41147() {
        return mo41150();
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Integer.valueOf(mo41147());
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Integer.valueOf(mo41149());
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ֨ */
    public final int mo41148() {
        return mo41149();
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Integer.valueOf(mo41148());
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f75804.f34914;
        int i = this.f75803;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C23871(C12472 c12472, int i) {
        this.f75804 = c12472;
        this.f75803 = i;
    }

    public C23871(C12472 c12472) {
        this.f75804 = c12472;
    }

    @Override // p067l.InterfaceC5096
    /* JADX INFO: renamed from: ֫ */
    public final int mo10858() {
        return this.f75804.f34906[this.f75803];
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ۠ */
    public final int mo41150() {
        return this.f75804.f34906[this.f75803];
    }

    @Override // p067l.InterfaceC5096
    /* JADX INFO: renamed from: ᩷ */
    public final int mo10859() {
        return this.f75804.f34914[this.f75803];
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ۚ */
    public final int mo41149() {
        return this.f75804.f34914[this.f75803];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f75804.f34906[this.f75803]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f75804.f34914[this.f75803]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C12472 c12472 = this.f75804;
        return c12472.f34906[this.f75803] == ((Integer) entry.getKey()).intValue() && c12472.f34914[this.f75803] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C12472 c12472 = this.f75804;
        int[] iArr = c12472.f34906;
        int i = this.f75803;
        return c12472.f34914[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C12472 c12472 = this.f75804;
        sb.append(c12472.f34906[this.f75803]);
        sb.append("=>");
        sb.append(c12472.f34914[this.f75803]);
        return sb.toString();
    }
}
