package p067l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܺۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes4.dex */
public final class C17257 extends AbstractC4518 {
    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ۧ */
    public final int mo9558() {
        AbstractC18873 abstractC18873 = this.f10137;
        return abstractC18873.getHeight() - abstractC18873.getPaddingBottom();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ֫ */
    public final int mo9554() {
        return this.f10137.getHeight();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ֫ */
    public final void mo9556(int i) {
        this.f10137.offsetChildrenVertical(i);
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܳ */
    public final int mo9560() {
        return this.f10137.getPaddingTop();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ۧ */
    public final int mo9559(View view) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        return this.f10137.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c16190).topMargin + ((ViewGroup.MarginLayoutParams) c16190).bottomMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܽ */
    public final int mo9563(View view) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        return this.f10137.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c16190).leftMargin + ((ViewGroup.MarginLayoutParams) c16190).rightMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ֫ */
    public final int mo9555(View view) {
        return this.f10137.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).bottomMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9567(View view) {
        return this.f10137.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).topMargin;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܿ */
    public final int mo9565(View view) {
        AbstractC18873 abstractC18873 = this.f10137;
        Rect rect = this.f10138;
        abstractC18873.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܳ */
    public final int mo9561(View view) {
        AbstractC18873 abstractC18873 = this.f10137;
        Rect rect = this.f10138;
        abstractC18873.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ᩻ */
    public final int mo9569() {
        AbstractC18873 abstractC18873 = this.f10137;
        return (abstractC18873.getHeight() - abstractC18873.getPaddingTop()) - abstractC18873.getPaddingBottom();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܽ */
    public final int mo9562() {
        return this.f10137.getPaddingBottom();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9566() {
        return this.f10137.getHeightMode();
    }

    @Override // p067l.AbstractC4518
    /* JADX INFO: renamed from: ܿ */
    public final int mo9564() {
        return this.f10137.getWidthMode();
    }
}
