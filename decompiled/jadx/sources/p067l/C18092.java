package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܽۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAOL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18092 implements InterfaceC19434, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int f54014;

    /* JADX INFO: renamed from: ᩹ */
    public final int f54015;

    public C18092(int i, int i2) {
        this.f54014 = i;
        this.f54015 = i2;
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Integer.valueOf(mo41150());
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ۠ */
    public final int mo41150() {
        return this.f54014;
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ۚ */
    public final int mo41149() {
        return this.f54015;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof InterfaceC19434;
        int i = this.f54015;
        int i2 = this.f54014;
        if (z) {
            InterfaceC19434 interfaceC19434 = (InterfaceC19434) obj;
            return i2 == interfaceC19434.mo41150() && i == interfaceC19434.mo41149();
        }
        if (!(obj instanceof InterfaceC17804)) {
            return false;
        }
        InterfaceC17804 interfaceC17804 = (InterfaceC17804) obj;
        return Integer.valueOf(i2).equals(interfaceC17804.mo17723()) && Integer.valueOf(i).equals(interfaceC17804.mo17722());
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ֡ */
    public final int mo41147() {
        return mo41150();
    }

    public final int hashCode() {
        return (this.f54014 * 19) + this.f54015;
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Integer.valueOf(mo41147());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f54014);
        sb.append(",");
        return C5410.m11876(this.f54015, ">", sb);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Integer.valueOf(mo41149());
    }

    @Override // p067l.InterfaceC19434
    /* JADX INFO: renamed from: ֨ */
    public final int mo41148() {
        return mo41149();
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Integer.valueOf(mo41148());
    }
}
