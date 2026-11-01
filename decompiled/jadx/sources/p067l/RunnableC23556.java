package p067l;

/* JADX INFO: renamed from: l.᩹۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23556 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f75024;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75025;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f75026;

    public /* synthetic */ RunnableC23556(int i, Object obj, Object obj2) {
        this.f75025 = i;
        this.f75026 = obj;
        this.f75024 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f75025;
        Object obj = this.f75024;
        Object obj2 = this.f75026;
        switch (i) {
            case 0:
                ActivityC18686 activityC18686 = (ActivityC18686) obj2;
                ((C14121) obj).m32098(activityC18686, activityC18686.f55783);
                break;
            case 1:
                ((C23631) obj2).m52572();
                ((ActivityC17874) obj).m40664(false);
                break;
            default:
                int i2 = C16988.f50226;
                ((AbstractC17043) obj2).mo20486(((AbstractC3451) obj).m6128());
                break;
        }
    }
}
