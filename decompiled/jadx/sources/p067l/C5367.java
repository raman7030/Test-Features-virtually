package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۗۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5367 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f12656;

    /* JADX INFO: renamed from: ۧ */
    public boolean f12657;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14084 f12658;

    public C5367(C14084 c14084) {
        this.f12658 = c14084;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11628(int i) {
        if (!this.f12657) {
            C14084 c14084 = this.f12658;
            int paddingTop = c14084.f39912.getPaddingTop();
            int height = (c14084.f39912.getHeight() - paddingTop) - c14084.f39912.getPaddingBottom();
            if (height <= 0) {
                return false;
            }
            View childAt = c14084.f39912.getChildAt(i - c14084.f39912.getFirstVisiblePosition());
            if (!this.f12656 && (childAt == null || childAt.getBottom() <= paddingTop || childAt.getTop() >= paddingTop + height)) {
                this.f12656 = true;
                c14084.f39912.setSelection(i);
                return false;
            }
            this.f12657 = true;
            if (childAt != null) {
                if (this.f12656) {
                    c14084.f39912.setSelectionFromTop(i, Math.max(0, (height - childAt.getHeight()) / 2));
                    return false;
                }
                if (childAt.getTop() < paddingTop || childAt.getBottom() > paddingTop + height) {
                    c14084.f39912.setSelectionFromTop(i, childAt.getTop() < paddingTop ? 0 : Math.max(0, height - childAt.getHeight()));
                    return false;
                }
            }
        }
        return true;
    }
}
