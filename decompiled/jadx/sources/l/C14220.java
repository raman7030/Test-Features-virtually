package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14220 extends AbstractC15631 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9283 f42892;

    public C14220(C19161 c19161) {
        super(c19161);
        this.f42892 = new C9283(c19161);
    }

    @Override // l.AbstractC15631
    /* JADX INFO: renamed from: ֫ */
    public final void mo11128(int i, Object obj) {
        C9283 c9283 = this.f42892;
        c9283.f28123 = i;
        ((Consumer) obj).accept(c9283);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM36829 = m36829();
        C9283 c9283 = this.f42892;
        c9283.f28123 = iM36829;
        return c9283;
    }
}
