package p067l;

/* JADX INFO: renamed from: l.ۖۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4725 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f10694;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23500 f10695;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4725(C23500 c23500, Object[] objArr, int i, EnumC15197 enumC15197) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f10695 = c23500;
        this.f10694 = i;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        this.f10695.f74882.getClass();
        synchronized (this.f10695) {
            this.f10695.f74867.remove(Integer.valueOf(this.f10694));
        }
    }
}
