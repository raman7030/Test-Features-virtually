package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܽۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAOL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16544 implements InterfaceC17956, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f50836;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f50837;

    public C16544(int i, int i2) {
        this.f50836 = i;
        this.f50837 = i2;
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Integer.valueOf(mo38924());
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int mo38924() {
        return this.f50836;
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo38923() {
        return this.f50837;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof InterfaceC17956;
        int i = this.f50837;
        int i2 = this.f50836;
        if (z) {
            InterfaceC17956 interfaceC17956 = (InterfaceC17956) obj;
            return i2 == interfaceC17956.mo38924() && i == interfaceC17956.mo38923();
        }
        if (!(obj instanceof InterfaceC16241)) {
            return false;
        }
        InterfaceC16241 interfaceC16241 = (InterfaceC16241) obj;
        return Integer.valueOf(i2).equals(interfaceC16241.mo15808()) && Integer.valueOf(i).equals(interfaceC16241.mo15807());
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int mo38921() {
        return mo38924();
    }

    public final int hashCode() {
        return (this.f50836 * 19) + this.f50837;
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Integer.valueOf(mo38921());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f50836);
        sb.append(",");
        return C3200.m9831(this.f50837, ">", sb);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Integer.valueOf(mo38923());
    }

    @Override // l.InterfaceC17956
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo38922() {
        return mo38923();
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Integer.valueOf(mo38922());
    }
}
