package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16979 implements InterfaceC20236, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f52092;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f52093;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        float[] fArr = this.f52093.f68349;
        int i = this.f52092;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public C16979(C21214 c21214, int i) {
        this.f52093 = c21214;
        this.f52092 = i;
    }

    public C16979(C21214 c21214) {
        this.f52093 = c21214;
    }

    @Override // l.InterfaceC20236
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo39811() {
        return this.f52093.f68352[this.f52092];
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Integer.valueOf(this.f52093.f68352[this.f52092]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Integer.valueOf(this.f52093.f68352[this.f52092]);
    }

    @Override // l.InterfaceC20236
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float mo39812() {
        return this.f52093.f68349[this.f52092];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Float.valueOf(this.f52093.f68349[this.f52092]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Float.valueOf(this.f52093.f68349[this.f52092]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f52093.f68352[this.f52092]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Float.valueOf(this.f52093.f68349[this.f52092]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C21214 c21214 = this.f52093;
        return c21214.f68352[this.f52092] == ((Integer) entry.getKey()).intValue() && Float.floatToRawIntBits(c21214.f68349[this.f52092]) == Float.floatToRawIntBits(((Float) entry.getValue()).floatValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C21214 c21214 = this.f52093;
        int[] iArr = c21214.f68352;
        int i = this.f52092;
        return Float.floatToRawIntBits(c21214.f68349[i]) ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21214 c21214 = this.f52093;
        sb.append(c21214.f68352[this.f52092]);
        sb.append("=>");
        sb.append(c21214.f68349[this.f52092]);
        return sb.toString();
    }
}
