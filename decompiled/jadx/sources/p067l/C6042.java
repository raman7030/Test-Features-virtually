package p067l;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6042 extends LayerDrawable {

    /* JADX INFO: renamed from: ᩸ */
    public int f15169;

    /* JADX INFO: renamed from: ᩹ */
    public Drawable[] f15170;

    /* JADX INFO: renamed from: ֫ */
    public static C6042 m13614(Resources resources, Resources.Theme theme) {
        Drawable drawableM14961 = C1059.m14961(resources, R.drawable.MT_Protector, theme);
        C12826.requireNonNull(drawableM14961);
        Drawable drawableMutate = drawableM14961.mutate();
        Drawable drawableM14962 = C1059.m14961(resources, R.drawable.MT_Protector, theme);
        C12826.requireNonNull(drawableM14962);
        Drawable drawableMutate2 = drawableM14962.mutate();
        Drawable drawableM14963 = C1059.m14961(resources, R.drawable.MT_Protector, theme);
        C12826.requireNonNull(drawableM14963);
        Drawable drawableMutate3 = drawableM14963.mutate();
        Drawable drawableM14964 = C1059.m14961(resources, R.drawable.MT_Protector, theme);
        C12826.requireNonNull(drawableM14964);
        Drawable[] drawableArr = {drawableMutate, drawableMutate2, drawableMutate3, drawableM14964.mutate()};
        C6042 c6042 = new C6042(drawableArr);
        c6042.f15169 = 0;
        c6042.f15170 = drawableArr;
        c6042.setColorFilter(new PorterDuffColorFilter(C23223.f72998, PorterDuff.Mode.SRC_IN));
        for (int i = 0; i < 4; i++) {
            drawableArr[i].setAlpha(0);
        }
        return c6042;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13615(int i) {
        Drawable[] drawableArr = this.f15170;
        if (this.f15169 != i) {
            this.f15169 = i;
            if (i == -1) {
                for (Drawable drawable : drawableArr) {
                    drawable.setAlpha(0);
                }
            } else {
                int length = drawableArr.length;
                int i2 = 0;
                while (i2 < length) {
                    drawableArr[i2].setAlpha(i2 == i ? 255 : 0);
                    i2++;
                }
            }
            invalidateSelf();
        }
    }
}
