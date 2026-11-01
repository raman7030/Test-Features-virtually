package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7685 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC5673 f20152;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C17071 f20153;

    public RunnableC7685(AbstractC5673 abstractC5673, C17071 c17071) {
        this.f20152 = abstractC5673;
        this.f20153 = c17071;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f20152.f13804;
        C17071 c17071 = this.f20153;
        if (arrayList.contains(c17071)) {
            c17071.m16143().m49056(c17071.m16145().mView);
        }
    }
}
