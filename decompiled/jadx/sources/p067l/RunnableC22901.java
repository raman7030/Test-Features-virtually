package p067l;

/* JADX INFO: renamed from: l.᩸۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC22901 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72069;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f72070;

    public /* synthetic */ RunnableC22901(int i, Object obj) {
        this.f72069 = i;
        this.f72070 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72069) {
            case 0:
                C14853.m33946((C14853) this.f72070);
                break;
            case 1:
                DialogC1183.m20566((DialogC1183) this.f72070);
                break;
            case 2:
                ServiceC5428.m11937((ServiceC5428) this.f72070);
                break;
            default:
                C15826.m35910((C15826) this.f72070);
                break;
        }
    }
}
