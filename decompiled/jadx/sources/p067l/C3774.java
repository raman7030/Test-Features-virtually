package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3774 extends AbstractC15843 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11151 f8082;

    @Override // p067l.AbstractC15843
    /* JADX INFO: renamed from: ֫ */
    public final void mo7362(int i, Object obj) {
        ((Consumer) obj).accept(this.f8082.f30922[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3774(C11151 c11151) {
        super(c11151);
        this.f8082 = c11151;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f8082.f30922[m35958()];
    }
}
