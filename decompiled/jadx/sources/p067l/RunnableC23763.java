package p067l;

/* JADX INFO: renamed from: l.᩹᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23763 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75560;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f75561;

    public /* synthetic */ RunnableC23763(int i, Object obj) {
        this.f75560 = i;
        this.f75561 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75560) {
            case 0:
                ((InterfaceC14375) this.f75561).m32971();
                break;
            case 1:
                ServiceC5428.m11931((ServiceC5428) this.f75561);
                break;
            case 2:
                ((C3019) this.f75561).m5114();
                break;
            case 3:
                C15124.m34542(((C5737) this.f75561).f14061);
                break;
            default:
                C13992.m31794((C13992) this.f75561);
                break;
        }
    }
}
