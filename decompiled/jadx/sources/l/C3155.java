package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۗۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3155 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9853;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f9854;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12327 f9855;

    public C3155(C12327 c12327) {
        this.f9855 = c12327;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9584(int i) {
        if (!this.f9854) {
            C12327 c12327 = this.f9855;
            int paddingTop = c12327.f36898.getPaddingTop();
            int height = (c12327.f36898.getHeight() - paddingTop) - c12327.f36898.getPaddingBottom();
            if (height <= 0) {
                return false;
            }
            View childAt = c12327.f36898.getChildAt(i - c12327.f36898.getFirstVisiblePosition());
            if (!this.f9853 && (childAt == null || childAt.getBottom() <= paddingTop || childAt.getTop() >= paddingTop + height)) {
                this.f9853 = true;
                c12327.f36898.setSelection(i);
                return false;
            }
            this.f9854 = true;
            if (childAt != null) {
                if (this.f9853) {
                    c12327.f36898.setSelectionFromTop(i, Math.max(0, (height - childAt.getHeight()) / 2));
                    return false;
                }
                if (childAt.getTop() < paddingTop || childAt.getBottom() > paddingTop + height) {
                    c12327.f36898.setSelectionFromTop(i, childAt.getTop() < paddingTop ? 0 : Math.max(0, height - childAt.getHeight()));
                    return false;
                }
            }
        }
        return true;
    }
}
