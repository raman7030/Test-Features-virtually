package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۗۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5397 extends AbstractC10762 {

    /* JADX INFO: renamed from: ֫ */
    public final int f12859;

    /* JADX INFO: renamed from: ۧ */
    public C17466 f12860;

    /* JADX INFO: renamed from: ܽ */
    public final Runnable f12861 = new RunnableC6738(this);

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C14784 f12862;

    @Override // p067l.AbstractC10762
    public final boolean onEdgeLock(int i) {
        return false;
    }

    public C5397(C14784 c14784, int i) {
        this.f12862 = c14784;
        this.f12859 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11848(C17466 c17466) {
        this.f12860 = c17466;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11849() {
        this.f12862.removeCallbacks(this.f12861);
    }

    @Override // p067l.AbstractC10762
    public final boolean tryCaptureView(View view, int i) {
        if (!C14784.m33730(view)) {
            return false;
        }
        int i2 = this.f12859;
        C14784 c14784 = this.f12862;
        return c14784.m33740(i2, view) && c14784.m33731(view) == 0;
    }

    @Override // p067l.AbstractC10762
    public final void onViewDragStateChanged(int i) {
        this.f12862.m33749(i, this.f12860.m39821());
    }

    @Override // p067l.AbstractC10762
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        C14784 c14784 = this.f12862;
        float width2 = (c14784.m33740(3, view) ? i + width : c14784.getWidth() - i) / width;
        c14784.m33744(width2, view);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        c14784.invalidate();
    }

    @Override // p067l.AbstractC10762
    public final void onViewCaptured(View view, int i) {
        ((C16795) view.getLayoutParams()).f49497 = false;
        int i2 = this.f12859 == 3 ? 5 : 3;
        C14784 c14784 = this.f12862;
        View viewM33743 = c14784.m33743(i2);
        if (viewM33743 != null) {
            c14784.m33736(viewM33743, true);
        }
    }

    @Override // p067l.AbstractC10762
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int[] iArr = C14784.f42151;
        float f3 = ((C16795) view.getLayoutParams()).f49498;
        int width = view.getWidth();
        C14784 c14784 = this.f12862;
        if (c14784.m33740(3, view)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = c14784.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f12860.m39815(i, view.getTop());
        c14784.invalidate();
    }

    @Override // p067l.AbstractC10762
    public final void onEdgeTouched(int i, int i2) {
        this.f12862.postDelayed(this.f12861, 160L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11847() {
        View viewM33743;
        int width;
        int iM39824 = this.f12860.m39824();
        int i = this.f12859;
        boolean z = i == 3;
        C14784 c14784 = this.f12862;
        if (z) {
            viewM33743 = c14784.m33743(3);
            width = (viewM33743 != null ? -viewM33743.getWidth() : 0) + iM39824;
        } else {
            viewM33743 = c14784.m33743(5);
            width = c14784.getWidth() - iM39824;
        }
        if (viewM33743 != null) {
            if (((!z || viewM33743.getLeft() >= width) && (z || viewM33743.getLeft() <= width)) || c14784.m33731(viewM33743) != 0) {
                return;
            }
            C16795 c16795 = (C16795) viewM33743.getLayoutParams();
            this.f12860.m39811(viewM33743, width, viewM33743.getTop());
            c16795.f49497 = true;
            c14784.invalidate();
            View viewM33744 = c14784.m33743(i == 3 ? 5 : 3);
            if (viewM33744 != null) {
                c14784.m33736(viewM33744, true);
            }
            c14784.m33732();
        }
    }

    @Override // p067l.AbstractC10762
    public final void onEdgeDragStarted(int i, int i2) {
        View viewM33743;
        int i3 = i & 1;
        C14784 c14784 = this.f12862;
        if (i3 == 1) {
            viewM33743 = c14784.m33743(3);
        } else {
            viewM33743 = c14784.m33743(5);
        }
        if (viewM33743 == null || c14784.m33731(viewM33743) != 0) {
            return;
        }
        this.f12860.m39809(i2, viewM33743);
    }

    @Override // p067l.AbstractC10762
    public final int getViewHorizontalDragRange(View view) {
        if (C14784.m33730(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // p067l.AbstractC10762
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C14784 c14784 = this.f12862;
        if (c14784.m33740(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = c14784.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // p067l.AbstractC10762
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }
}
