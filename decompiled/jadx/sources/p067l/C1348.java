package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤۢ */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1348 implements InterfaceC1513 {

    /* JADX INFO: renamed from: ܽ */
    public final int[] f33607 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ܿ */
    public final int[] f33608 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۧ */
    public final int[] f33605 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ֫ */
    public final int[] f33604 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ܳ */
    public final int[] f33606 = {R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f33609 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ֫ */
    public final ColorStateList m27621(Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return C0886.m5547(context, R.color.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return C0886.m5547(context, R.color.MT_Protector);
        }
        if (i != R.drawable.MT_Protector) {
            if (i == R.drawable.MT_Protector) {
                return m27619(context, C1480.m33376(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector) {
                return m27619(context, 0);
            }
            if (i == R.drawable.MT_Protector) {
                return m27619(context, C1480.m33376(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector || i == R.drawable.MT_Protector) {
                return C0886.m5547(context, R.color.MT_Protector);
            }
            if (m27618(i, this.f33608)) {
                return C1480.m33377(context, R.attr.MT_Protector);
            }
            if (m27618(i, this.f33606)) {
                return C0886.m5547(context, R.color.MT_Protector);
            }
            if (m27618(i, this.f33609)) {
                return C0886.m5547(context, R.color.MT_Protector);
            }
            if (i == R.drawable.MT_Protector) {
                return C0886.m5547(context, R.color.MT_Protector);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM33377 = C1480.m33377(context, R.attr.MT_Protector);
        if (colorStateListM33377 != null && colorStateListM33377.isStateful()) {
            int[] iArr3 = C1480.f41659;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM33377.getColorForState(iArr3, 0);
            iArr[1] = C1480.f41658;
            iArr2[1] = C1480.m33376(context, R.attr.MT_Protector);
            iArr[2] = C1480.f41661;
            iArr2[2] = colorStateListM33377.getDefaultColor();
        } else {
            iArr[0] = C1480.f41659;
            iArr2[0] = C1480.m33374(context, R.attr.MT_Protector);
            iArr[1] = C1480.f41658;
            iArr2[1] = C1480.m33376(context, R.attr.MT_Protector);
            iArr[2] = C1480.f41661;
            iArr2[2] = C1480.m33376(context, R.attr.MT_Protector);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static ColorStateList m27619(Context context, int i) {
        int iM33376 = C1480.m33376(context, R.attr.MT_Protector);
        return new ColorStateList(new int[][]{C1480.f41659, C1480.f41662, C1480.f41663, C1480.f41661}, new int[]{C1480.m33374(context, R.attr.MT_Protector), C1199.m21221(iM33376, i), C1199.m21221(iM33376, i), i});
    }

    /* JADX INFO: renamed from: ֫ */
    public final LayerDrawable m27622(C0920 c0920, Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return new LayerDrawable(new Drawable[]{c0920.m7585(context, R.drawable.MT_Protector), c0920.m7585(context, R.drawable.MT_Protector)});
        }
        if (i == R.drawable.MT_Protector) {
            return m27620(c0920, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m27620(c0920, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m27620(c0920, context, R.dimen.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static LayerDrawable m27620(C0920 c0920, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM7585 = c0920.m7585(context, R.drawable.MT_Protector);
        Drawable drawableM7586 = c0920.m7585(context, R.drawable.MT_Protector);
        if ((drawableM7585 instanceof BitmapDrawable) && drawableM7585.getIntrinsicWidth() == dimensionPixelSize && drawableM7585.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM7585;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM7585.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM7585.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM7586 instanceof BitmapDrawable) && drawableM7586.getIntrinsicWidth() == dimensionPixelSize && drawableM7586.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM7586;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM7586.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM7586.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27617(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1138.f21150;
        }
        drawableMutate.setColorFilter(C1138.m18625(i, mode));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m27623(Context context, int i, Drawable drawable) {
        if (i == R.drawable.MT_Protector) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m27617(layerDrawable.findDrawableByLayerId(android.R.id.background), C1480.m33376(context, R.attr.MT_Protector), C1138.f21150);
            m27617(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C1480.m33376(context, R.attr.MT_Protector), C1138.f21150);
            m27617(layerDrawable.findDrawableByLayerId(android.R.id.progress), C1480.m33376(context, R.attr.MT_Protector), C1138.f21150);
            return true;
        }
        if (i != R.drawable.MT_Protector && i != R.drawable.MT_Protector && i != R.drawable.MT_Protector) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        m27617(layerDrawable2.findDrawableByLayerId(android.R.id.background), C1480.m33374(context, R.attr.MT_Protector), C1138.f21150);
        m27617(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C1480.m33376(context, R.attr.MT_Protector), C1138.f21150);
        m27617(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C1480.m33376(context, R.attr.MT_Protector), C1138.f21150);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27618(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[RETURN] */
    /* JADX INFO: renamed from: ۧ */
    public final boolean m27624(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        boolean z;
        int i3;
        Drawable drawableMutate;
        PorterDuff.Mode mode = C1138.f21150;
        if (m27618(i, this.f33607)) {
            i3 = R.attr.MT_Protector;
        } else if (m27618(i, this.f33605)) {
            i3 = R.attr.MT_Protector;
        } else {
            if (!m27618(i, this.f33604)) {
                if (i == R.drawable.MT_Protector) {
                    iRound = Math.round(40.8f);
                    z = true;
                    i2 = android.R.attr.colorForeground;
                } else if (i != R.drawable.MT_Protector) {
                    i2 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C1138.m18625(C1480.m33376(context, i2), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = android.R.attr.colorBackground;
        }
        i2 = i3;
        iRound = -1;
        z = true;
        if (z) {
            return false;
        }
        drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(C1138.m18625(C1480.m33376(context, i2), mode));
        if (iRound != -1) {
            drawableMutate.setAlpha(iRound);
        }
        return true;
    }
}
