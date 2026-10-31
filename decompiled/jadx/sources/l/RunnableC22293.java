package l;

/* JADX INFO: renamed from: l.᩹۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22293 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72297;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72298;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72299;

    public /* synthetic */ RunnableC22293(int i, Object obj, Object obj2) {
        this.f72298 = i;
        this.f72299 = obj;
        this.f72297 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f72298;
        Object obj = this.f72297;
        Object obj2 = this.f72299;
        switch (i) {
            case 0:
                ActivityC17169 activityC17169 = (ActivityC17169) obj2;
                ((C12366) obj).m30037(activityC17169, activityC17169.f52602);
                break;
            case 1:
                ((C22372) obj2).m50232();
                ((ActivityC16315) obj).m38449(false);
                break;
            default:
                int i2 = C15382.f47096;
                ((AbstractC15440) obj2).mo18537(((AbstractC1139) obj).m3887());
                break;
        }
    }
}
