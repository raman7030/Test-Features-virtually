package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19729 implements InterfaceC5627, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f60017;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C11683 f60018;

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Integer.valueOf(m44857());
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Integer.valueOf(m44857());
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return mo17723();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f60018.f32587;
        int i = this.f60017;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C19729(C11683 c11683, int i) {
        this.f60018 = c11683;
        this.f60017 = i;
    }

    public C19729(C11683 c11683) {
        this.f60018 = c11683;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f60018.f32577[this.f60017];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return this.f60018.f32577[this.f60017];
    }

    @Override // p067l.InterfaceC5627
    /* JADX INFO: renamed from: ᩷ */
    public final int mo12466() {
        return this.f60018.f32587[this.f60017];
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m44857() {
        return this.f60018.f32587[this.f60017];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f60018.f32587[this.f60017]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C11683 c11683 = this.f60018;
        return C12826.equals(c11683.f32577[this.f60017], entry.getKey()) && c11683.f32587[this.f60017] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C11683 c11683 = this.f60018;
        Object obj = c11683.f32577[this.f60017];
        return c11683.f32587[this.f60017] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C11683 c11683 = this.f60018;
        sb.append(c11683.f32577[this.f60017]);
        sb.append("=>");
        sb.append(c11683.f32587[this.f60017]);
        return sb.toString();
    }
}
