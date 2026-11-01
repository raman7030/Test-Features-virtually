package p067l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۡۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes3.dex */
public final class C10553 extends AbstractC4518 {
    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ۧ */
    public final int mo9558() {
        AbstractC18873 abstractC18873 = this.f10137;
        return abstractC18873.getWidth() - abstractC18873.getPaddingRight();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ֫ */
    public final int mo9554() {
        return this.f10137.getWidth();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ֫ */
    public final void mo9556(int i) {
        this.f10137.offsetChildrenHorizontal(i);
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܳ */
    public final int mo9560() {
        return this.f10137.getPaddingLeft();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ۧ */
    public final int mo9559(View view) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        return this.f10137.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c16190).leftMargin + ((ViewGroup.MarginLayoutParams) c16190).rightMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܽ */
    public final int mo9563(View view) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        return this.f10137.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c16190).topMargin + ((ViewGroup.MarginLayoutParams) c16190).bottomMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ֫ */
    public final int mo9555(View view) {
        return this.f10137.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).rightMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9567(View view) {
        return this.f10137.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).leftMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܿ */
    public final int mo9565(View view) {
        AbstractC18873 abstractC18873 = this.f10137;
        Rect rect = this.f10138;
        abstractC18873.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܳ */
    public final int mo9561(View view) {
        AbstractC18873 abstractC18873 = this.f10137;
        Rect rect = this.f10138;
        abstractC18873.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ᩻ */
    public final int mo9569() {
        AbstractC18873 abstractC18873 = this.f10137;
        return (abstractC18873.getWidth() - abstractC18873.getPaddingLeft()) - abstractC18873.getPaddingRight();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܽ */
    public final int mo9562() {
        return this.f10137.getPaddingRight();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9566() {
        return this.f10137.getWidthMode();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܿ */
    public final int mo9564() {
        return this.f10137.getHeightMode();
    }
}
