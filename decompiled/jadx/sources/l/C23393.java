package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes.dex */
public final class C23393 extends AbstractC15631 implements InterfaceC15900, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f75151;

    @Override // l.AbstractC15631, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8846.m22855(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo7691());
    }

    @Override // l.AbstractC15631
    /* JADX INFO: renamed from: ֫ */
    public final void mo11128(int i, Object obj) {
        ((InterfaceC23662) obj).mo18328(this.f75151.f60376[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23393(C19161 c19161) {
        super(c19161);
        this.f75151 = c19161;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        return this.f75151.f60376[m36829()];
    }
}
