package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: E92A */
/* JADX INFO: loaded from: classes5.dex */
public final class C22551 implements InterfaceC23221, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public DialogInterfaceC2564 f71134 = null;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f71135 = true;

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return this.f71134;
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return this.f71134;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50535(DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f71134 = dialogInterfaceC2564;
    }

    @Override // p067l.InterfaceC23221
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo50536() {
        return this.f71135;
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return Boolean.valueOf(this.f71135);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return Boolean.valueOf(this.f71135);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m50537() {
        this.f71135 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof InterfaceC23221) {
            InterfaceC23221 interfaceC23221 = (InterfaceC23221) obj;
            return C12826.equals(this.f71134, interfaceC23221.mo17723()) && this.f71135 == interfaceC23221.mo50536();
        }
        if (!(obj instanceof InterfaceC17804)) {
            return false;
        }
        InterfaceC17804 interfaceC17804 = (InterfaceC17804) obj;
        return C12826.equals(this.f71134, interfaceC17804.mo17723()) && Boolean.valueOf(this.f71135).equals(interfaceC17804.mo17722());
    }

    public final int hashCode() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f71134;
        return ((dialogInterfaceC2564 == null ? 0 : dialogInterfaceC2564.hashCode()) * 19) + (this.f71135 ? 1231 : 1237);
    }

    public final String toString() {
        return "<" + this.f71134 + "," + this.f71135 + ">";
    }
}
