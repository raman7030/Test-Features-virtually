package p067l;

/* JADX INFO: renamed from: l.ۢۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public final class C11330 extends AbstractFutureC10659 {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۤ */
    public final Runnable f31559;

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ Object mo14731() {
        return null;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ֫ */
    public final void mo24522(Throwable th) throws Throwable {
        C15824 c15824 = C18705.f55874;
        throw th;
    }

    public C11330(Runnable runnable) {
        this.f31559 = runnable;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14730() {
        this.f31559.run();
        return true;
    }
}
