package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܺܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16001 implements InterfaceC11064, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49369;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f49370;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        byte bByteValue = ((Byte) obj).byteValue();
        byte[] bArr = this.f49370.f16903;
        int i = this.f49369;
        byte b = bArr[i];
        bArr[i] = bByteValue;
        return Byte.valueOf(b);
    }

    public C16001(C5419 c5419, int i) {
        this.f49370 = c5419;
        this.f49369 = i;
    }

    public C16001(C5419 c5419) {
        this.f49370 = c5419;
    }

    @Override // l.InterfaceC11064
    /* JADX INFO: renamed from: ֫ */
    public final int mo27447() {
        return this.f49370.f16906[this.f49369];
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Integer.valueOf(this.f49370.f16906[this.f49369]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Integer.valueOf(this.f49370.f16906[this.f49369]);
    }

    @Override // l.InterfaceC11064
    /* JADX INFO: renamed from: ܶ */
    public final byte mo27448() {
        return this.f49370.f16903[this.f49369];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Byte.valueOf(this.f49370.f16903[this.f49369]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Byte.valueOf(this.f49370.f16903[this.f49369]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f49370.f16906[this.f49369]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Byte.valueOf(this.f49370.f16903[this.f49369]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C5419 c5419 = this.f49370;
        return c5419.f16906[this.f49369] == ((Integer) entry.getKey()).intValue() && c5419.f16903[this.f49369] == ((Byte) entry.getValue()).byteValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C5419 c5419 = this.f49370;
        int[] iArr = c5419.f16906;
        int i = this.f49369;
        return c5419.f16903[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C5419 c5419 = this.f49370;
        sb.append(c5419.f16906[this.f49369]);
        sb.append("=>");
        sb.append((int) c5419.f16903[this.f49369]);
        return sb.toString();
    }
}
