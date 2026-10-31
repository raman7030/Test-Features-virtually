package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: E92A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21236 implements InterfaceC21941, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f68451 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f68452 = true;

    @Override // l.InterfaceC16241
    public final Object first() {
        return this.f68451;
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return this.f68451;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48204(DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f68451 = dialogInterfaceC0206;
    }

    @Override // l.InterfaceC21941
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo48205() {
        return this.f68452;
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return Boolean.valueOf(this.f68452);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return Boolean.valueOf(this.f68452);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48206() {
        this.f68452 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof InterfaceC21941) {
            InterfaceC21941 interfaceC21941 = (InterfaceC21941) obj;
            return C11003.equals(this.f68451, interfaceC21941.mo15808()) && this.f68452 == interfaceC21941.mo48205();
        }
        if (!(obj instanceof InterfaceC16241)) {
            return false;
        }
        InterfaceC16241 interfaceC16241 = (InterfaceC16241) obj;
        return C11003.equals(this.f68451, interfaceC16241.mo15808()) && Boolean.valueOf(this.f68452).equals(interfaceC16241.mo15807());
    }

    public final int hashCode() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f68451;
        return ((dialogInterfaceC0206 == null ? 0 : dialogInterfaceC0206.hashCode()) * 19) + (this.f68452 ? 1231 : 1237);
    }

    public final String toString() {
        return "<" + this.f68451 + "," + this.f68452 + ">";
    }
}
