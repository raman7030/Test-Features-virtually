package l;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3865 extends LayerDrawable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12362;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable[] f12363;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3865 m11678(Resources resources, Resources.Theme theme) {
        Drawable drawableM13097 = C4369.m13097(resources, R.drawable.MT_Protector, theme);
        C11003.requireNonNull(drawableM13097);
        Drawable drawableMutate = drawableM13097.mutate();
        Drawable drawableM13098 = C4369.m13097(resources, R.drawable.MT_Protector, theme);
        C11003.requireNonNull(drawableM13098);
        Drawable drawableMutate2 = drawableM13098.mutate();
        Drawable drawableM13099 = C4369.m13097(resources, R.drawable.MT_Protector, theme);
        C11003.requireNonNull(drawableM13099);
        Drawable drawableMutate3 = drawableM13099.mutate();
        Drawable drawableM130910 = C4369.m13097(resources, R.drawable.MT_Protector, theme);
        C11003.requireNonNull(drawableM130910);
        Drawable[] drawableArr = {drawableMutate, drawableMutate2, drawableMutate3, drawableM130910.mutate()};
        C3865 c3865 = new C3865(drawableArr);
        c3865.f12362 = 0;
        c3865.f12363 = drawableArr;
        c3865.setColorFilter(new PorterDuffColorFilter(C21943.f70287, PorterDuff.Mode.SRC_IN));
        for (int i = 0; i < 4; i++) {
            drawableArr[i].setAlpha(0);
        }
        return c3865;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11679(int i) {
        Drawable[] drawableArr = this.f12363;
        if (this.f12362 != i) {
            this.f12362 = i;
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
