package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۜ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7039 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21684;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21685;

    public /* synthetic */ RunnableC7039(int i, Object obj) {
        this.f21684 = i;
        this.f21685 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21684) {
            case 0:
                if (((C21151) this.f21685).f68196) {
                    throw new CancellationException("Text statistics canceled");
                }
                return;
            default:
                ((C1478) this.f21685).m5115();
                return;
        }
    }
}
