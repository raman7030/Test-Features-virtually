package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۠ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9882 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14849 f27406;

    public C9882(C14849 c14849) {
        this.f27406 = c14849;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23162(int i) {
        C14849 c14849 = this.f27406;
        View childAt = c14849.getChildAt(i);
        if (childAt != null) {
            c14849.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c14849.removeViewAt(i);
    }
}
