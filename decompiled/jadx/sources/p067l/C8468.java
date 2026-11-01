package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8468 extends AbstractC15843 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11151 f22726;

    @Override // p067l.AbstractC15843
    /* JADX INFO: renamed from: ֫ */
    public final void mo7362(int i, Object obj) {
        ((Consumer) obj).accept(this.f22726.f30929[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8468(C11151 c11151) {
        super(c11151);
        this.f22726 = c11151;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f22726.f30929[m35958()];
    }
}
