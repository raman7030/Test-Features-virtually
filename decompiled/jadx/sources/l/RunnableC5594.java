package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5594 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3477 f17308;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15470 f17309;

    public RunnableC5594(AbstractC3477 abstractC3477, C15470 c15470) {
        this.f17308 = abstractC3477;
        this.f17309 = c15470;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f17308.f10999;
        C15470 c15470 = this.f17309;
        if (arrayList.contains(c15470)) {
            c15470.m14246().m46733(c15470.m14248().mView);
        }
    }
}
