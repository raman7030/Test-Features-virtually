package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۢ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9842 implements InterfaceC11544, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29730;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f29731;

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Integer.valueOf(m24913());
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Integer.valueOf(m24913());
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return mo15807();
    }

    public C9842(C19720 c19720, int i) {
        this.f29731 = c19720;
        this.f29730 = i;
    }

    public C9842(C19720 c19720) {
        this.f29731 = c19720;
    }

    @Override // l.InterfaceC11544
    /* JADX INFO: renamed from: ֫ */
    public final int mo15639() {
        return this.f29731.f63729[this.f29730];
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m24913() {
        return this.f29731.f63729[this.f29730];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29731.f63739[this.f29730];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return this.f29731.f63739[this.f29730];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f29731.f63739;
        int i = this.f29730;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f29731.f63729[this.f29730]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19720 c19720 = this.f29731;
        return c19720.f63729[this.f29730] == ((Integer) entry.getKey()).intValue() && C11003.equals(c19720.f63739[this.f29730], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C19720 c19720 = this.f29731;
        int[] iArr = c19720.f63729;
        int i = this.f29730;
        int i2 = iArr[i];
        Object obj = c19720.f63739[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C19720 c19720 = this.f29731;
        sb.append(c19720.f63729[this.f29730]);
        sb.append("=>");
        sb.append(c19720.f63739[this.f29730]);
        return sb.toString();
    }
}
