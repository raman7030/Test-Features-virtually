package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.֡᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0683 extends AbstractC7201 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f2619 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Drawable f2620;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f2621;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21851 f2622;

    public C0683(AbstractC21851 abstractC21851) {
        this.f2622 = abstractC21851;
    }

    @Override // l.AbstractC7201
    public final void onDrawOver(Canvas canvas, C13132 c13132, C21600 c21600) {
        if (this.f2620 == null) {
            return;
        }
        int childCount = c13132.getChildCount();
        int width = c13132.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = c13132.getChildAt(i);
            if (m2768(c13132, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f2620.setBounds(0, height, width, this.f2621 + height);
                this.f2620.draw(canvas);
            }
        }
    }

    @Override // l.AbstractC7201
    public final void getItemOffsets(Rect rect, View view, C13132 c13132, C21600 c21600) {
        if (m2768(c13132, view)) {
            rect.bottom = this.f2621;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2768(C13132 c13132, View view) {
        AbstractC3255 childViewHolder = c13132.getChildViewHolder(view);
        if (!(childViewHolder instanceof C21167) || !((C21167) childViewHolder).m48109()) {
            return false;
        }
        boolean z = this.f2619;
        int iIndexOfChild = c13132.indexOfChild(view);
        if (iIndexOfChild >= c13132.getChildCount() - 1) {
            return z;
        }
        AbstractC3255 childViewHolder2 = c13132.getChildViewHolder(c13132.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof C21167) && ((C21167) childViewHolder2).m48106();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2770(Drawable drawable) {
        if (drawable != null) {
            this.f2621 = drawable.getIntrinsicHeight();
        } else {
            this.f2621 = 0;
        }
        this.f2620 = drawable;
        this.f2622.f70012.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2769(int i) {
        this.f2621 = i;
        this.f2622.f70012.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2771(boolean z) {
        this.f2619 = z;
    }
}
