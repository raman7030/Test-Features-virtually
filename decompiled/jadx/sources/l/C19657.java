package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19657 implements InterfaceC3428, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63466;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8367 f63467;

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Integer.valueOf(m45191());
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Integer.valueOf(m45191());
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return mo15808();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f63467.f25673;
        int i = this.f63466;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C19657(C8367 c8367) {
        this.f63467 = c8367;
    }

    public C19657(C8367 c8367, int i) {
        this.f63467 = c8367;
        this.f63466 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f63467.f25678[this.f63466];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return this.f63467.f25678[this.f63466];
    }

    @Override // l.InterfaceC3428
    /* JADX INFO: renamed from: ᩷ */
    public final int mo10427() {
        return this.f63467.f25673[this.f63466];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m45191() {
        return this.f63467.f25673[this.f63466];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f63467.f25673[this.f63466]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C8367 c8367 = this.f63467;
        return C11003.equals(c8367.f25678[this.f63466], entry.getKey()) && c8367.f25673[this.f63466] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C8367 c8367 = this.f63467;
        Object obj = c8367.f25678[this.f63466];
        return c8367.f25673[this.f63466] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C8367 c8367 = this.f63467;
        sb.append(c8367.f25678[this.f63466]);
        sb.append("=>");
        sb.append(c8367.f25673[this.f63466]);
        return sb.toString();
    }
}
