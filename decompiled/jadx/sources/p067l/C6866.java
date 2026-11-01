package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6866 extends AbstractC22410 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14912 f17849;

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final long mo9134() {
        return -1L;
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final void mo9136(long j) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6866(C14912 c14912, C14912 c14913, InterfaceC8998 interfaceC8998) {
        super(c14913, interfaceC8998);
        this.f17849 = c14912;
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ۧ */
    public final int mo9137() throws IOException {
        C14912 c14912 = this.f17849;
        if (!c14912.m34131()) {
            throw new IOException("load mt extras failed");
        }
        return c14912.f42530.f13214;
    }

    @Override // p067l.AbstractC22410
    /* JADX INFO: renamed from: ֫ */
    public final void mo9135(int i) {
        this.f17849.m34128(i);
    }
}
