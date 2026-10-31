package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C13884 extends AbstractC17685 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16979 f41392;

    public C13884(C21214 c21214) {
        super(c21214);
        this.f41392 = new C16979(c21214);
    }

    @Override // l.AbstractC17685
    /* JADX INFO: renamed from: ֫ */
    public final void mo20219(int i, Object obj) {
        C16979 c16979 = this.f41392;
        c16979.f52092 = i;
        ((Consumer) obj).accept(c16979);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM41419 = m41419();
        C16979 c16979 = this.f41392;
        c16979.f52092 = iM41419;
        return c16979;
    }
}
