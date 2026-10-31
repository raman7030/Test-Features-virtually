package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14779 extends AbstractC16190 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9842 f45143;

    public C14779(C19720 c19720) {
        super(c19720);
        this.f45143 = new C9842(c19720);
    }

    @Override // l.AbstractC16190
    /* JADX INFO: renamed from: ֫ */
    public final void mo12660(int i, Object obj) {
        C9842 c9842 = this.f45143;
        c9842.f29730 = i;
        ((Consumer) obj).accept(c9842);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM38125 = m38125();
        C9842 c9842 = this.f45143;
        c9842.f29730 = iM38125;
        return c9842;
    }
}
