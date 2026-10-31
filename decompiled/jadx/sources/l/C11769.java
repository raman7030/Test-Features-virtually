package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C11769 extends AbstractC17685 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f35126;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16979 f35127;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11769(C21214 c21214) {
        super(c21214);
        this.f35126 = c21214;
    }

    @Override // l.AbstractC17685
    /* JADX INFO: renamed from: ֫ */
    public final void mo20219(int i, Object obj) {
        C16979 c16979 = new C16979(this.f35126, i);
        this.f35127 = c16979;
        ((Consumer) obj).accept(c16979);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C16979 c16979 = new C16979(this.f35126, m41419());
        this.f35127 = c16979;
        return c16979;
    }

    @Override // l.AbstractC17685, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f35127.f52092 = -1;
    }
}
