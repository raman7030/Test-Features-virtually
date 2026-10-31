package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18308 extends AbstractC16190 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f56914;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9842 f56915;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18308(C19720 c19720) {
        super(c19720);
        this.f56914 = c19720;
    }

    @Override // l.AbstractC16190
    /* JADX INFO: renamed from: ֫ */
    public final void mo12660(int i, Object obj) {
        C9842 c9842 = new C9842(this.f56914, i);
        this.f56915 = c9842;
        ((Consumer) obj).accept(c9842);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C9842 c9842 = new C9842(this.f56914, m38125());
        this.f56915 = c9842;
        return c9842;
    }

    @Override // l.AbstractC16190, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f56915.f29730 = -1;
    }
}
