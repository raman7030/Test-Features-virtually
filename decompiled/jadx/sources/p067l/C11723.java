package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۢ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11723 implements InterfaceC13340, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f32683;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C21111 f32684;

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Integer.valueOf(m26928());
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Integer.valueOf(m26928());
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return mo17722();
    }

    public C11723(C21111 c21111, int i) {
        this.f32684 = c21111;
        this.f32683 = i;
    }

    public C11723(C21111 c21111) {
        this.f32684 = c21111;
    }

    @Override // p067l.InterfaceC13340
    /* JADX INFO: renamed from: ֫ */
    public final int mo17550() {
        return this.f32684.f66360[this.f32683];
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m26928() {
        return this.f32684.f66360[this.f32683];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f32684.f66370[this.f32683];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return this.f32684.f66370[this.f32683];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f32684.f66370;
        int i = this.f32683;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f32684.f66360[this.f32683]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C21111 c21111 = this.f32684;
        return c21111.f66360[this.f32683] == ((Integer) entry.getKey()).intValue() && C12826.equals(c21111.f66370[this.f32683], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C21111 c21111 = this.f32684;
        int[] iArr = c21111.f66360;
        int i = this.f32683;
        int i2 = iArr[i];
        Object obj = c21111.f66370[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21111 c21111 = this.f32684;
        sb.append(c21111.f66360[this.f32683]);
        sb.append("=>");
        sb.append(c21111.f66370[this.f32683]);
        return sb.toString();
    }
}
