package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4732 extends AbstractC21087 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13198 f15018;

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ֫ */
    public final long mo7023() {
        return -1L;
    }

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ֫ */
    public final void mo7025(long j) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4732(C13198 c13198, C13198 c13199, InterfaceC6975 interfaceC6975) {
        super(c13199, interfaceC6975);
        this.f15018 = c13198;
    }

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ۧ */
    public final int mo7026() throws IOException {
        C13198 c13198 = this.f15018;
        if (!c13198.m32033()) {
            throw new IOException("load mt extras failed");
        }
        return c13198.f39466.f10405;
    }

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ֫ */
    public final void mo7024(int i) {
        this.f15018.m32030(i);
    }
}
