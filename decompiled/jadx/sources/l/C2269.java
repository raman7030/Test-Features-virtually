package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۖۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2269 extends AbstractC11729 implements InterfaceC15673 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18059 f7361;

    @Override // l.InterfaceC16233
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo1250((Throwable) obj);
        return C8058.f24861;
    }

    public C2269(C18059 c18059) {
        this.f7361 = c18059;
    }

    @Override // l.AbstractC0151
    /* JADX INFO: renamed from: ۧ */
    public final void mo1250(Throwable th) {
        this.f7361.m42130(m20123());
    }

    @Override // l.InterfaceC15673
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo7498(Throwable th) {
        C18059 c18059M20123 = m20123();
        if (th instanceof CancellationException) {
            return true;
        }
        return c18059M20123.m42130(th) && c18059M20123.mo42129();
    }
}
