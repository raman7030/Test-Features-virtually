package l;

import android.widget.ListView;

/* JADX INFO: renamed from: l.ۘ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C5S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4183 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19706 f13630;

    public RunnableC4183(C19706 c19706) {
        this.f13630 = c19706;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.f13630.f63663;
        listView.focusableViewAvailable(listView);
    }
}
