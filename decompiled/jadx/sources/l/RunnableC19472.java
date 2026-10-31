package l;

/* JADX INFO: renamed from: l.᩵۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19472 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62963;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62964;

    public /* synthetic */ RunnableC19472(int i, Object obj) {
        this.f62963 = i;
        this.f62964 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f62963;
        Object obj = this.f62964;
        switch (i) {
            case 0:
                InterfaceC18581 interfaceC18581 = (InterfaceC18581) obj;
                int i2 = ActivityC17169.f52595;
                interfaceC18581.mo9498();
                interfaceC18581.mo9497();
                break;
            case 1:
                ((C9762) obj).invalidateMenu();
                break;
            case 2:
                ServiceC3219.m9876((ServiceC3219) obj);
                break;
            case 3:
                C20478 c20478 = (C20478) obj;
                c20478.f66013.post(new RunnableC19009(3, c20478));
                break;
            case 4:
                ((C7864) obj).m34227(new C22854());
                break;
            default:
                ((AbstractC22366) obj).cancel();
                break;
        }
    }
}
