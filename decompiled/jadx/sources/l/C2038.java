package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2038 extends AbstractC14737 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f6795;

    @Override // l.AbstractC14737
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6628(int i, Object obj) {
        ((Consumer) obj).accept(this.f6795.f29626[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2038(C9800 c9800) {
        super(c9800);
        this.f6795 = c9800;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f6795.f29626[m35041()];
    }
}
