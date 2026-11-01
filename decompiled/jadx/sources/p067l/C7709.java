package p067l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8FX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7709 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22606 f20230;

    /* JADX INFO: renamed from: ۧ */
    public final Drawable f20231 = C7050.m16202(R.drawable.MT_Protector);

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 512;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 512;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C7709(AbstractC22606 abstractC22606) {
        this.f20230 = abstractC22606;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Drawable m17844() {
        return new C7709(C21265.f66836);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Drawable m17845() {
        return new C7709(C21265.f66854);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC22606 abstractC22606 = this.f20230;
        canvas.drawColor(abstractC22606.mo9511());
        Rect dirtyBounds = getDirtyBounds();
        int iWidth = (dirtyBounds.width() * 3) / 10;
        int iHeight = (dirtyBounds.height() * 3) / 10;
        int i = dirtyBounds.left + iWidth;
        int i2 = dirtyBounds.top + iHeight;
        int i3 = dirtyBounds.right - iWidth;
        int i4 = dirtyBounds.bottom - iHeight;
        Drawable drawable = this.f20231;
        drawable.setBounds(i, i2, i3, i4);
        drawable.setTint(abstractC22606.mo9512());
        drawable.draw(canvas);
    }
}
