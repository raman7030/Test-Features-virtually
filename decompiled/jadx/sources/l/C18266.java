package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18266 implements InterfaceC3428, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56800;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f56801;

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Integer.valueOf(m42598());
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Integer.valueOf(m42598());
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return mo15808();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f56801.f29636;
        int i = this.f56800;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C18266(C9800 c9800, int i) {
        this.f56801 = c9800;
        this.f56800 = i;
    }

    public C18266(C9800 c9800) {
        this.f56801 = c9800;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f56801.f29626[this.f56800];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return this.f56801.f29626[this.f56800];
    }

    @Override // l.InterfaceC3428
    /* JADX INFO: renamed from: ᩷ */
    public final int mo10427() {
        return this.f56801.f29636[this.f56800];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m42598() {
        return this.f56801.f29636[this.f56800];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f56801.f29636[this.f56800]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C9800 c9800 = this.f56801;
        return C11003.equals(c9800.f29626[this.f56800], entry.getKey()) && c9800.f29636[this.f56800] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C9800 c9800 = this.f56801;
        Object obj = c9800.f29626[this.f56800];
        return c9800.f29636[this.f56800] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C9800 c9800 = this.f56801;
        sb.append(c9800.f29626[this.f56800]);
        sb.append("=>");
        sb.append(c9800.f29636[this.f56800]);
        return sb.toString();
    }
}
