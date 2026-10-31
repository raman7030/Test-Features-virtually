package l;

/* JADX INFO: renamed from: l.ܶ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC15454 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47312;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47313;

    public /* synthetic */ RunnableC15454(int i, Object obj) {
        this.f47312 = i;
        this.f47313 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47312) {
            case 0:
                ((InterfaceC10517) this.f47313).m26426();
                break;
            case 1:
                C13019.m31600(((C4758) this.f47313).f15108);
                break;
            default:
                ((AbstractC3316) this.f47313).cancel();
                break;
        }
    }
}
