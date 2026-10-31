package l;

/* JADX INFO: renamed from: l.ۖۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2480 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7906;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f7907;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480(C22235 c22235, Object[] objArr, int i, EnumC13499 enumC13499) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f7907 = c22235;
        this.f7906 = i;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        this.f7907.f72157.getClass();
        synchronized (this.f7907) {
            this.f7907.f72142.remove(Integer.valueOf(this.f7906));
        }
    }
}
