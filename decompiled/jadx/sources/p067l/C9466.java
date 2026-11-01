package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۟۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9466 extends AbstractC10762 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16113 f25906;

    @Override // p067l.AbstractC10762
    public final void onViewCaptured(View view, int i) {
        C16113 c16113 = this.f25906;
        int childCount = c16113.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c16113.getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public C9466(C16113 c16113) {
        this.f25906 = c16113;
    }

    @Override // p067l.AbstractC10762
    public final boolean tryCaptureView(View view, int i) {
        if (m21987()) {
            return ((C4044) view.getLayoutParams()).f8891;
        }
        return false;
    }

    @Override // p067l.AbstractC10762
    public final void onViewDragStateChanged(int i) {
        C16113 c16113 = this.f25906;
        if (c16113.f47422.m39823() == 0) {
            if (c16113.f47412 == 1.0f) {
                c16113.m36682(c16113.f47414);
                c16113.m36673(c16113.f47414);
                c16113.f47418 = false;
            } else {
                c16113.m36677(c16113.f47414);
                c16113.f47418 = true;
            }
        }
    }

    @Override // p067l.AbstractC10762
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        C16113 c16113 = this.f25906;
        c16113.m36672(i);
        c16113.invalidate();
    }

    @Override // p067l.AbstractC10762
    public final void onViewReleased(View view, float f, float f2) {
        int paddingLeft;
        C4044 c4044 = (C4044) view.getLayoutParams();
        C16113 c16113 = this.f25906;
        if (c16113.m36679()) {
            int paddingRight = c16113.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c4044).rightMargin;
            if (f < 0.0f || (f == 0.0f && c16113.f47412 > 0.5f)) {
                paddingRight += c16113.f47408;
            }
            paddingLeft = (c16113.getWidth() - paddingRight) - c16113.f47414.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) c4044).leftMargin + c16113.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && c16113.f47412 > 0.5f)) {
                paddingLeft += c16113.f47408;
            }
        }
        c16113.f47422.m39815(paddingLeft, view.getTop());
        c16113.invalidate();
    }

    @Override // p067l.AbstractC10762
    public final int getViewHorizontalDragRange(View view) {
        return this.f25906.f47408;
    }

    @Override // p067l.AbstractC10762
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C16113 c16113 = this.f25906;
        C4044 c4044 = (C4044) c16113.f47414.getLayoutParams();
        if (c16113.m36679()) {
            int width = c16113.getWidth() - (c16113.f47414.getWidth() + (c16113.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c4044).rightMargin));
            return Math.max(Math.min(i, width), width - c16113.f47408);
        }
        int paddingLeft = c16113.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c4044).leftMargin;
        return Math.min(Math.max(i, paddingLeft), c16113.f47408 + paddingLeft);
    }

    @Override // p067l.AbstractC10762
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // p067l.AbstractC10762
    public final void onEdgeTouched(int i, int i2) {
        if (m21987()) {
            C16113 c16113 = this.f25906;
            c16113.f47422.m39809(i2, c16113.f47414);
        }
    }

    @Override // p067l.AbstractC10762
    public final void onEdgeDragStarted(int i, int i2) {
        if (m21987()) {
            C16113 c16113 = this.f25906;
            c16113.f47422.m39809(i2, c16113.f47414);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m21987() {
        C16113 c16113 = this.f25906;
        if (c16113.f47413 || c16113.m36676() == 3) {
            return false;
        }
        if (c16113.m36683() && c16113.m36676() == 1) {
            return false;
        }
        return c16113.m36683() || c16113.m36676() != 2;
    }
}
