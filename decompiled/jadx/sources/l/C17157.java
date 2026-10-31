package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public class C17157 extends AbstractC2465 {
    public C17157() {
        throw null;
    }

    @Override // l.AbstractC2465
    public final String toString() {
        return C20087.m46306("[", this.f7865.toString(), " ", ((C15869) this.f7866).toString(), "]");
    }

    @Override // l.AbstractC2465
    /* JADX INFO: renamed from: ֫ */
    public final void mo7939(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo7939(interfaceC0408);
        ((C15869) this.f7866).mo2828(interfaceC0408);
    }

    @Override // l.AbstractC2465
    public final int hashCode() {
        Object obj = this.f7866;
        return this.f7865.hashCode() + ((obj != null ? ((C15869) obj).hashCode() : 0) * 31);
    }

    @Override // l.AbstractC2465
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17157)) {
            return false;
        }
        C17157 c17157 = (C17157) obj;
        return C11003.equals(this.f7866, c17157.f7866) && this.f7865 == c17157.f7865;
    }
}
