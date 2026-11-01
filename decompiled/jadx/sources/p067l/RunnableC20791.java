package p067l;

/* JADX INFO: renamed from: l.᩵ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20791 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f65350;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f65351;

    public /* synthetic */ RunnableC20791(int i, Object obj) {
        this.f65350 = i;
        this.f65351 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f65350;
        Object obj = this.f65351;
        switch (i) {
            case 0:
                C14084.m31967((C14084) obj);
                break;
            case 1:
                ((C18154) obj).f54196.setVisibility(0);
                break;
            default:
                String str = ((String[]) obj)[1];
                C7350 c7350 = C9111.f24679;
                C13045.m29867(str, "orderId");
                new Thread(new RunnableC8368(5, str)).start();
                break;
        }
    }
}
