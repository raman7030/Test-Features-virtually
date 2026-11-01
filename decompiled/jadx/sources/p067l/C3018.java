package p067l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.֡᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3018 extends AbstractC9212 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f5392 = true;

    /* JADX INFO: renamed from: ۧ */
    public Drawable f5393;

    /* JADX INFO: renamed from: ܽ */
    public int f5394;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractC23136 f5395;

    public C3018(AbstractC23136 abstractC23136) {
        this.f5395 = abstractC23136;
    }

    @Override // p067l.AbstractC9212
    public final void onDrawOver(Canvas canvas, C14849 c14849, C22897 c22897) {
        if (this.f5393 == null) {
            return;
        }
        int childCount = c14849.getChildCount();
        int width = c14849.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = c14849.getChildAt(i);
            if (m5107(c14849, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f5393.setBounds(0, height, width, this.f5394 + height);
                this.f5393.draw(canvas);
            }
        }
    }

    @Override // p067l.AbstractC9212
    public final void getItemOffsets(Rect rect, View view, C14849 c14849, C22897 c22897) {
        if (m5107(c14849, view)) {
            rect.bottom = this.f5394;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m5107(C14849 c14849, View view) {
        AbstractC5462 childViewHolder = c14849.getChildViewHolder(view);
        if (!(childViewHolder instanceof C22486) || !((C22486) childViewHolder).m50439()) {
            return false;
        }
        boolean z = this.f5392;
        int iIndexOfChild = c14849.indexOfChild(view);
        if (iIndexOfChild >= c14849.getChildCount() - 1) {
            return z;
        }
        AbstractC5462 childViewHolder2 = c14849.getChildViewHolder(c14849.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof C22486) && ((C22486) childViewHolder2).m50436();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5109(Drawable drawable) {
        if (drawable != null) {
            this.f5394 = drawable.getIntrinsicHeight();
        } else {
            this.f5394 = 0;
        }
        this.f5393 = drawable;
        this.f5395.f72721.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5108(int i) {
        this.f5394 = i;
        this.f5395.f72721.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5110(boolean z) {
        this.f5392 = z;
    }
}
