package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3661 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC5673 f7725;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C17071 f7726;

    public RunnableC3661(AbstractC5673 abstractC5673, C17071 c17071) {
        this.f7725 = abstractC5673;
        this.f7726 = c17071;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5673 abstractC5673 = this.f7725;
        ArrayList arrayList = abstractC5673.f13804;
        C17071 c17071 = this.f7726;
        arrayList.remove(c17071);
        abstractC5673.f13803.remove(c17071);
    }
}
