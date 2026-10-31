package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C17749 extends AbstractC15631 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f54303;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9283 f54304;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17749(C19161 c19161) {
        super(c19161);
        this.f54303 = c19161;
    }

    @Override // l.AbstractC15631
    /* JADX INFO: renamed from: ֫ */
    public final void mo11128(int i, Object obj) {
        C9283 c9283 = new C9283(this.f54303, i);
        this.f54304 = c9283;
        ((Consumer) obj).accept(c9283);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C9283 c9283 = new C9283(this.f54303, m36829());
        this.f54304 = c9283;
        return c9283;
    }

    @Override // l.AbstractC15631, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f54304.f28123 = -1;
    }
}
