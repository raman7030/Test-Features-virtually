package p067l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.᩷᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes5.dex */
public final class C22466 extends AbstractC9212 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f70867 = true;

    /* JADX INFO: renamed from: ۧ */
    public Drawable f70868;

    /* JADX INFO: renamed from: ܽ */
    public int f70869;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractFragmentC5031 f70870;

    public C22466(AbstractFragmentC5031 abstractFragmentC5031) {
        this.f70870 = abstractFragmentC5031;
    }

    @Override // p067l.AbstractC9212
    public final void onDrawOver(Canvas canvas, C14849 c14849, C22897 c22897) {
        if (this.f70868 == null) {
            return;
        }
        int childCount = c14849.getChildCount();
        int width = c14849.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = c14849.getChildAt(i);
            if (m50427(c14849, childAt)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f70868.setBounds(0, height, width, this.f70869 + height);
                this.f70868.draw(canvas);
            }
        }
    }

    @Override // p067l.AbstractC9212
    public final void getItemOffsets(Rect rect, View view, C14849 c14849, C22897 c22897) {
        if (m50427(c14849, view)) {
            rect.bottom = this.f70869;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m50427(C14849 c14849, View view) {
        AbstractC5462 childViewHolder = c14849.getChildViewHolder(view);
        if (!(childViewHolder instanceof C22486) || !((C22486) childViewHolder).m50439()) {
            return false;
        }
        boolean z = this.f70867;
        int iIndexOfChild = c14849.indexOfChild(view);
        if (iIndexOfChild >= c14849.getChildCount() - 1) {
            return z;
        }
        AbstractC5462 childViewHolder2 = c14849.getChildViewHolder(c14849.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof C22486) && ((C22486) childViewHolder2).m50436();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50429(Drawable drawable) {
        if (drawable != null) {
            this.f70869 = drawable.getIntrinsicHeight();
        } else {
            this.f70869 = 0;
        }
        this.f70868 = drawable;
        this.f70870.f11537.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50428(int i) {
        this.f70869 = i;
        this.f70870.f11537.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50430(boolean z) {
        this.f70867 = z;
    }
}
