package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܶۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15070 implements InterfaceC11544, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f46047;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4488 f46048;

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Integer.valueOf(m35671());
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Integer.valueOf(m35671());
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return mo15807();
    }

    public C15070(C4488 c4488) {
        this.f46048 = c4488;
    }

    public C15070(C4488 c4488, int i) {
        this.f46048 = c4488;
        this.f46047 = i;
    }

    @Override // l.InterfaceC11544
    /* JADX INFO: renamed from: ֫ */
    public final int mo15639() {
        return this.f46048.f14284[this.f46047];
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m35671() {
        return this.f46048.f14284[this.f46047];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f46048.f14279[this.f46047];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return this.f46048.f14279[this.f46047];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f46048.f14279;
        int i = this.f46047;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f46048.f14284[this.f46047]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C4488 c4488 = this.f46048;
        return c4488.f14284[this.f46047] == ((Integer) entry.getKey()).intValue() && C11003.equals(c4488.f14279[this.f46047], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C4488 c4488 = this.f46048;
        int[] iArr = c4488.f14284;
        int i = this.f46047;
        int i2 = iArr[i];
        Object obj = c4488.f14279[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C4488 c4488 = this.f46048;
        sb.append(c4488.f14284[this.f46047]);
        sb.append("=>");
        sb.append(c4488.f14279[this.f46047]);
        return sb.toString();
    }
}
