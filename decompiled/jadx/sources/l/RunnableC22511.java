package l;

/* JADX INFO: renamed from: l.᩹᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22511 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72834;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72835;

    public /* synthetic */ RunnableC22511(int i, Object obj) {
        this.f72834 = i;
        this.f72835 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72834) {
            case 0:
                ((InterfaceC12633) this.f72835).m30893();
                break;
            case 1:
                ServiceC3219.m9884((ServiceC3219) this.f72835);
                break;
            case 2:
                ((C0684) this.f72835).m2775();
                break;
            case 3:
                C13421.m32440(((C3544) this.f72835).f11255);
                break;
            default:
                C12230.m29732((C12230) this.f72835);
                break;
        }
    }
}
