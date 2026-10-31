package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1360 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3477 f4953;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15470 f4954;

    public RunnableC1360(AbstractC3477 abstractC3477, C15470 c15470) {
        this.f4953 = abstractC3477;
        this.f4954 = c15470;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3477 abstractC3477 = this.f4953;
        ArrayList arrayList = abstractC3477.f10999;
        C15470 c15470 = this.f4954;
        arrayList.remove(c15470);
        abstractC3477.f10998.remove(c15470);
    }
}
