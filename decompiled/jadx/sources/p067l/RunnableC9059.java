package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۜ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9059 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24565;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f24566;

    public /* synthetic */ RunnableC9059(int i, Object obj) {
        this.f24565 = i;
        this.f24566 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24565) {
            case 0:
                if (((C22471) this.f24566).f70878) {
                    throw new CancellationException("Text statistics canceled");
                }
                return;
            default:
                ((C3773) this.f24566).m7357();
                return;
        }
    }
}
