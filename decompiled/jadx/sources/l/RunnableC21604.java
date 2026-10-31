package l;

/* JADX INFO: renamed from: l.᩸۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21604 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69366;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69367;

    public /* synthetic */ RunnableC21604(int i, Object obj) {
        this.f69366 = i;
        this.f69367 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69366) {
            case 0:
                C13136.m31854((C13136) this.f69367);
                break;
            case 1:
                DialogC6876.m18617((DialogC6876) this.f69367);
                break;
            case 2:
                ServiceC3219.m9890((ServiceC3219) this.f69367);
                break;
            default:
                C14159.m33778((C14159) this.f69367);
                break;
        }
    }
}
