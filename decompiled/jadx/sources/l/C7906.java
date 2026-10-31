package l;

import android.view.View;

/* JADX INFO: renamed from: l.۠ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7906 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f24490;

    public C7906(C13132 c13132) {
        this.f24490 = c13132;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21196(int i) {
        C13132 c13132 = this.f24490;
        View childAt = c13132.getChildAt(i);
        if (childAt != null) {
            c13132.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c13132.removeViewAt(i);
    }
}
