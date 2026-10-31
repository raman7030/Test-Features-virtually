package l;

import android.content.Context;

/* JADX INFO: renamed from: l.۠ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8301 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25496;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25497;

    public /* synthetic */ RunnableC8301(int i, Object obj) {
        this.f25496 = i;
        this.f25497 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25496) {
            case 0:
                C15355.m36392((C15355) this.f25497);
                break;
            case 1:
                C16869.m39644((Context) this.f25497);
                break;
            case 2:
                C10797.m26992((C10797) this.f25497);
                break;
            case 3:
                C6058.m16908((C6058) this.f25497);
                break;
            default:
                ((AbstractC6138) this.f25497).cancel();
                break;
        }
    }
}
