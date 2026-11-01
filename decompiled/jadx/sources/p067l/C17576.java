package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܺܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17576 implements InterfaceC12884, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f52532;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7519 f52533;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        byte bByteValue = ((Byte) obj).byteValue();
        byte[] bArr = this.f52533.f19741;
        int i = this.f52532;
        byte b = bArr[i];
        bArr[i] = bByteValue;
        return Byte.valueOf(b);
    }

    public C17576(C7519 c7519, int i) {
        this.f52533 = c7519;
        this.f52532 = i;
    }

    public C17576(C7519 c7519) {
        this.f52533 = c7519;
    }

    @Override // p067l.InterfaceC12884
    /* JADX INFO: renamed from: ֫ */
    public final int mo29509() {
        return this.f52533.f19744[this.f52532];
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Integer.valueOf(this.f52533.f19744[this.f52532]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Integer.valueOf(this.f52533.f19744[this.f52532]);
    }

    @Override // p067l.InterfaceC12884
    /* JADX INFO: renamed from: ܶ */
    public final byte mo29510() {
        return this.f52533.f19741[this.f52532];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Byte.valueOf(this.f52533.f19741[this.f52532]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Byte.valueOf(this.f52533.f19741[this.f52532]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f52533.f19744[this.f52532]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Byte.valueOf(this.f52533.f19741[this.f52532]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C7519 c7519 = this.f52533;
        return c7519.f19744[this.f52532] == ((Integer) entry.getKey()).intValue() && c7519.f19741[this.f52532] == ((Byte) entry.getValue()).byteValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C7519 c7519 = this.f52533;
        int[] iArr = c7519.f19744;
        int i = this.f52532;
        return c7519.f19741[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C7519 c7519 = this.f52533;
        sb.append(c7519.f19744[this.f52532]);
        sb.append("=>");
        sb.append((int) c7519.f19741[this.f52532]);
        return sb.toString();
    }
}
