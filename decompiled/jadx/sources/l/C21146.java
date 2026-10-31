package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.᩷᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21146 extends AbstractC7201 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f68185 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Drawable f68186;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68187;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractFragmentC2801 f68188;

    public C21146(AbstractFragmentC2801 abstractFragmentC2801) {
        this.f68188 = abstractFragmentC2801;
    }

    @Override // l.AbstractC7201
    public final void onDrawOver(Canvas canvas, C13132 c13132, C21600 c21600) {
        if (this.f68186 == null) {
            return;
        }
        int childCount = c13132.getChildCount();
        int width = c13132.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = c13132.getChildAt(i);
            if (m48097(c13132, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f68186.setBounds(0, height, width, this.f68187 + height);
                this.f68186.draw(canvas);
            }
        }
    }

    @Override // l.AbstractC7201
    public final void getItemOffsets(Rect rect, View view, C13132 c13132, C21600 c21600) {
        if (m48097(c13132, view)) {
            rect.bottom = this.f68187;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m48097(C13132 c13132, View view) {
        AbstractC3255 childViewHolder = c13132.getChildViewHolder(view);
        if (!(childViewHolder instanceof C21167) || !((C21167) childViewHolder).m48109()) {
            return false;
        }
        boolean z = this.f68185;
        int iIndexOfChild = c13132.indexOfChild(view);
        if (iIndexOfChild >= c13132.getChildCount() - 1) {
            return z;
        }
        AbstractC3255 childViewHolder2 = c13132.getChildViewHolder(c13132.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof C21167) && ((C21167) childViewHolder2).m48106();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48099(Drawable drawable) {
        if (drawable != null) {
            this.f68187 = drawable.getIntrinsicHeight();
        } else {
            this.f68187 = 0;
        }
        this.f68186 = drawable;
        this.f68188.f8743.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48098(int i) {
        this.f68187 = i;
        this.f68188.f8743.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48100(boolean z) {
        this.f68185 = z;
    }
}
