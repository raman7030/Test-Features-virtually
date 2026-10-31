package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MA3Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C17147 implements InterfaceC16241, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f52550;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6207 f52551;

    public C17147(String str, C6207 c6207) {
        this.f52550 = str;
        this.f52551 = c6207;
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return this.f52550;
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return this.f52551;
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return this.f52551;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC16241)) {
            return false;
        }
        InterfaceC16241 interfaceC16241 = (InterfaceC16241) obj;
        return C11003.equals(this.f52550, interfaceC16241.mo15808()) && this.f52551.equals(interfaceC16241.mo15807());
    }

    public final int hashCode() {
        Object obj = this.f52550;
        return this.f52551.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 19);
    }

    public final String toString() {
        return "<" + this.f52550 + "," + this.f52551 + ">";
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return mo15808();
    }
}
