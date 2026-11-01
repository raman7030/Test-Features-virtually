package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public class C18674 extends AbstractC4711 {
    public C18674() {
        throw null;
    }

    @Override // p067l.AbstractC4711
    public final String toString() {
        return C21459.m48622("[", this.f10653.toString(), " ", ((C17450) this.f10654).toString(), "]");
    }

    @Override // p067l.AbstractC4711
    /* JADX INFO: renamed from: ֫ */
    public final void mo9987(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo9987(interfaceC2756);
        ((C17450) this.f10654).mo5157(interfaceC2756);
    }

    @Override // p067l.AbstractC4711
    public final int hashCode() {
        Object obj = this.f10654;
        return this.f10653.hashCode() + ((obj != null ? ((C17450) obj).hashCode() : 0) * 31);
    }

    @Override // p067l.AbstractC4711
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18674)) {
            return false;
        }
        C18674 c18674 = (C18674) obj;
        return C12826.equals(this.f10654, c18674.f10654) && this.f10653 == c18674.f10653;
    }
}
