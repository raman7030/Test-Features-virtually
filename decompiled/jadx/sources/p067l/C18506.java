package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18506 implements InterfaceC21601, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f55272;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22531 f55273;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        float[] fArr = this.f55273.f71032;
        int i = this.f55272;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public C18506(C22531 c22531, int i) {
        this.f55273 = c22531;
        this.f55272 = i;
    }

    public C18506(C22531 c22531) {
        this.f55273 = c22531;
    }

    @Override // p067l.InterfaceC21601
    /* JADX INFO: renamed from: ֫ */
    public final int mo42054() {
        return this.f55273.f71035[this.f55272];
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Integer.valueOf(this.f55273.f71035[this.f55272]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Integer.valueOf(this.f55273.f71035[this.f55272]);
    }

    @Override // p067l.InterfaceC21601
    /* JADX INFO: renamed from: ۢ */
    public final float mo42055() {
        return this.f55273.f71032[this.f55272];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Float.valueOf(this.f55273.f71032[this.f55272]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Float.valueOf(this.f55273.f71032[this.f55272]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f55273.f71035[this.f55272]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Float.valueOf(this.f55273.f71032[this.f55272]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C22531 c22531 = this.f55273;
        return c22531.f71035[this.f55272] == ((Integer) entry.getKey()).intValue() && Float.floatToRawIntBits(c22531.f71032[this.f55272]) == Float.floatToRawIntBits(((Float) entry.getValue()).floatValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C22531 c22531 = this.f55273;
        int[] iArr = c22531.f71035;
        int i = this.f55272;
        return Float.floatToRawIntBits(c22531.f71032[i]) ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C22531 c22531 = this.f55273;
        sb.append(c22531.f71035[this.f55272]);
        sb.append("=>");
        sb.append(c22531.f71032[this.f55272]);
        return sb.toString();
    }
}
