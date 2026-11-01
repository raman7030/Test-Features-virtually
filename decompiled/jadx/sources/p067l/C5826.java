package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5826 extends AbstractC17224 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C20579 f14296;

    @Override // p067l.AbstractC17224
    /* JADX INFO: renamed from: ֫ */
    public final void mo13104(int i, Object obj) {
        ((Consumer) obj).accept(this.f14296.f63617[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5826(C20579 c20579) {
        super(c20579);
        this.f14296 = c20579;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f14296.f63617[m38995()];
    }
}
