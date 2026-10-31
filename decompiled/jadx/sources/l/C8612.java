package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۡۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8612 extends AbstractC2262 {
    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ۧ */
    public final int mo7476() {
        AbstractC17366 abstractC17366 = this.f7349;
        return abstractC17366.getWidth() - abstractC17366.getPaddingRight();
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ֫ */
    public final int mo7472() {
        return this.f7349.getWidth();
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ֫ */
    public final void mo7474(int i) {
        this.f7349.offsetChildrenHorizontal(i);
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ܳ */
    public final int mo7478() {
        return this.f7349.getPaddingLeft();
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ۧ */
    public final int mo7477(View view) {
        C14543 c14543 = (C14543) view.getLayoutParams();
        return this.f7349.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c14543).leftMargin + ((ViewGroup.MarginLayoutParams) c14543).rightMargin;
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ܽ */
    public final int mo7481(View view) {
        C14543 c14543 = (C14543) view.getLayoutParams();
        return this.f7349.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c14543).topMargin + ((ViewGroup.MarginLayoutParams) c14543).bottomMargin;
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ֫ */
    public final int mo7473(View view) {
        return this.f7349.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C14543) view.getLayoutParams())).rightMargin;
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7485(View view) {
        return this.f7349.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C14543) view.getLayoutParams())).leftMargin;
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ܿ */
    public final int mo7483(View view) {
        AbstractC17366 abstractC17366 = this.f7349;
        Rect rect = this.f7350;
        abstractC17366.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ܳ */
    public final int mo7479(View view) {
        AbstractC17366 abstractC17366 = this.f7349;
        Rect rect = this.f7350;
        abstractC17366.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ᩻ */
    public final int mo7487() {
        AbstractC17366 abstractC17366 = this.f7349;
        return (abstractC17366.getWidth() - abstractC17366.getPaddingLeft()) - abstractC17366.getPaddingRight();
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ܽ */
    public final int mo7480() {
        return this.f7349.getPaddingRight();
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ᩳ */
    public final int mo7484() {
        return this.f7349.getWidthMode();
    }

    @Override // l.AbstractC2262
    /* JADX INFO: renamed from: ܿ */
    public final int mo7482() {
        return this.f7349.getHeightMode();
    }
}
