package l;

/* JADX INFO: renamed from: l.ۨۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11542 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34464;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34465;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34466;

    public /* synthetic */ RunnableC11542(int i, int i2, Object obj) {
        this.f34465 = i2;
        this.f34466 = obj;
        this.f34464 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34465) {
            case 0:
                C7017.m18971((String[]) this.f34466, this.f34464);
                break;
            default:
                ActivityC16012.m37822((ActivityC16012) this.f34466, this.f34464);
                break;
        }
    }
}
