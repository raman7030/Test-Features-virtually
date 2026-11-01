package p067l;

import android.widget.ListView;

/* JADX INFO: renamed from: l.ۘ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C5S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6344 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21097 f16443;

    public RunnableC6344(C21097 c21097) {
        this.f16443 = c21097;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.f16443.f66294;
        listView.focusableViewAvailable(listView);
    }
}
