package p067l;

/* JADX INFO: renamed from: l.᩵۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20875 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f65580;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f65581;

    public /* synthetic */ RunnableC20875(int i, Object obj) {
        this.f65580 = i;
        this.f65581 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f65580;
        Object obj = this.f65581;
        switch (i) {
            case 0:
                InterfaceC20028 interfaceC20028 = (InterfaceC20028) obj;
                int i2 = ActivityC18686.f55776;
                interfaceC20028.mo11541();
                interfaceC20028.mo11540();
                break;
            case 1:
                ((C1326) obj).invalidateMenu();
                break;
            case 2:
                ServiceC5428.m11923((ServiceC5428) obj);
                break;
            case 3:
                C21831 c21831 = (C21831) obj;
                c21831.f68690.post(new RunnableC20435(3, c21831));
                break;
            case 4:
                ((C9842) obj).m36360(new C24089());
                break;
            default:
                ((AbstractC23625) obj).cancel();
                break;
        }
    }
}
