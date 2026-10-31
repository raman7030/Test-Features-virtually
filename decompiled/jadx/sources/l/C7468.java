package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۟۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7468 extends AbstractC8832 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14462 f22993;

    @Override // l.AbstractC8832
    public final void onViewCaptured(View view, int i) {
        C14462 c14462 = this.f22993;
        int childCount = c14462.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c14462.getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public C7468(C14462 c14462) {
        this.f22993 = c14462;
    }

    @Override // l.AbstractC8832
    public final boolean tryCaptureView(View view, int i) {
        if (m20012()) {
            return ((C1763) view.getLayoutParams()).f6115;
        }
        return false;
    }

    @Override // l.AbstractC8832
    public final void onViewDragStateChanged(int i) {
        C14462 c14462 = this.f22993;
        if (c14462.f44328.m37651() == 0) {
            if (c14462.f44318 == 1.0f) {
                c14462.m34548(c14462.f44320);
                c14462.m34539(c14462.f44320);
                c14462.f44324 = false;
            } else {
                c14462.m34543(c14462.f44320);
                c14462.f44324 = true;
            }
        }
    }

    @Override // l.AbstractC8832
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        C14462 c14462 = this.f22993;
        c14462.m34538(i);
        c14462.invalidate();
    }

    @Override // l.AbstractC8832
    public final void onViewReleased(View view, float f, float f2) {
        int paddingLeft;
        C1763 c1763 = (C1763) view.getLayoutParams();
        C14462 c14462 = this.f22993;
        if (c14462.m34545()) {
            int paddingRight = c14462.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1763).rightMargin;
            if (f < 0.0f || (f == 0.0f && c14462.f44318 > 0.5f)) {
                paddingRight += c14462.f44314;
            }
            paddingLeft = (c14462.getWidth() - paddingRight) - c14462.f44320.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) c1763).leftMargin + c14462.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && c14462.f44318 > 0.5f)) {
                paddingLeft += c14462.f44314;
            }
        }
        c14462.f44328.m37643(paddingLeft, view.getTop());
        c14462.invalidate();
    }

    @Override // l.AbstractC8832
    public final int getViewHorizontalDragRange(View view) {
        return this.f22993.f44314;
    }

    @Override // l.AbstractC8832
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C14462 c14462 = this.f22993;
        C1763 c1763 = (C1763) c14462.f44320.getLayoutParams();
        if (c14462.m34545()) {
            int width = c14462.getWidth() - (c14462.f44320.getWidth() + (c14462.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1763).rightMargin));
            return Math.max(Math.min(i, width), width - c14462.f44314);
        }
        int paddingLeft = c14462.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1763).leftMargin;
        return Math.min(Math.max(i, paddingLeft), c14462.f44314 + paddingLeft);
    }

    @Override // l.AbstractC8832
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // l.AbstractC8832
    public final void onEdgeTouched(int i, int i2) {
        if (m20012()) {
            C14462 c14462 = this.f22993;
            c14462.f44328.m37637(i2, c14462.f44320);
        }
    }

    @Override // l.AbstractC8832
    public final void onEdgeDragStarted(int i, int i2) {
        if (m20012()) {
            C14462 c14462 = this.f22993;
            c14462.f44328.m37637(i2, c14462.f44320);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20012() {
        C14462 c14462 = this.f22993;
        if (c14462.f44319 || c14462.m34542() == 3) {
            return false;
        }
        if (c14462.m34549() && c14462.m34542() == 1) {
            return false;
        }
        return c14462.m34549() || c14462.m34542() != 2;
    }
}
