package p067l;

import android.content.Context;

/* JADX INFO: renamed from: l.۠ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10258 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f28406;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f28407;

    public /* synthetic */ RunnableC10258(int i, Object obj) {
        this.f28406 = i;
        this.f28407 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28406) {
            case 0:
                C16962.m38550((C16962) this.f28407);
                break;
            case 1:
                C18401.m41880((Context) this.f28407);
                break;
            case 2:
                C12630.m29037((C12630) this.f28407);
                break;
            case 3:
                C8126.m18837((C8126) this.f28407);
                break;
            default:
                ((AbstractC8202) this.f28407).cancel();
                break;
        }
    }
}
