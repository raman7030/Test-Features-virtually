package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MA3Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C18665 implements InterfaceC17804, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f55733;

    /* JADX INFO: renamed from: ᩹ */
    public final C8268 f55734;

    public C18665(String str, C8268 c8268) {
        this.f55733 = str;
        this.f55734 = c8268;
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return this.f55733;
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return this.f55734;
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return this.f55734;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC17804)) {
            return false;
        }
        InterfaceC17804 interfaceC17804 = (InterfaceC17804) obj;
        return C12826.equals(this.f55733, interfaceC17804.mo17723()) && this.f55734.equals(interfaceC17804.mo17722());
    }

    public final int hashCode() {
        Object obj = this.f55733;
        return this.f55734.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 19);
    }

    public final String toString() {
        return "<" + this.f55733 + "," + this.f55734 + ">";
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return mo17723();
    }
}
