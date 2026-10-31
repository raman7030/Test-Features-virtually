package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22624 implements InterfaceC2869, Map.Entry, InterfaceC17956 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73075;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f73076;

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Integer.valueOf(mo38924());
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ֡ */
    public final int mo38921() {
        return mo38924();
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Integer.valueOf(mo38921());
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Integer.valueOf(mo38923());
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ֨ */
    public final int mo38922() {
        return mo38923();
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Integer.valueOf(mo38922());
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f73076.f31942;
        int i = this.f73075;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C22624(C10630 c10630, int i) {
        this.f73076 = c10630;
        this.f73075 = i;
    }

    public C22624(C10630 c10630) {
        this.f73076 = c10630;
    }

    @Override // l.InterfaceC2869
    /* JADX INFO: renamed from: ֫ */
    public final int mo8791() {
        return this.f73076.f31934[this.f73075];
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ۠ */
    public final int mo38924() {
        return this.f73076.f31934[this.f73075];
    }

    @Override // l.InterfaceC2869
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8792() {
        return this.f73076.f31942[this.f73075];
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ۚ */
    public final int mo38923() {
        return this.f73076.f31942[this.f73075];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f73076.f31934[this.f73075]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f73076.f31942[this.f73075]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C10630 c10630 = this.f73076;
        return c10630.f31934[this.f73075] == ((Integer) entry.getKey()).intValue() && c10630.f31942[this.f73075] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C10630 c10630 = this.f73076;
        int[] iArr = c10630.f31934;
        int i = this.f73075;
        return c10630.f31942[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C10630 c10630 = this.f73076;
        sb.append(c10630.f31934[this.f73075]);
        sb.append("=>");
        sb.append(c10630.f31942[this.f73075]);
        return sb.toString();
    }
}
