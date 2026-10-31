package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10199 implements InterfaceC13519 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f30646 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f30647 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f30644 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f30643 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f30645 = {R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f30648 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ColorStateList m25599(Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return C0881.m3233(context, R.color.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return C0881.m3233(context, R.color.MT_Protector);
        }
        if (i != R.drawable.MT_Protector) {
            if (i == R.drawable.MT_Protector) {
                return m25597(context, C12855.m31290(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector) {
                return m25597(context, 0);
            }
            if (i == R.drawable.MT_Protector) {
                return m25597(context, C12855.m31290(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector || i == R.drawable.MT_Protector) {
                return C0881.m3233(context, R.color.MT_Protector);
            }
            if (m25596(i, this.f30647)) {
                return C12855.m31291(context, R.attr.MT_Protector);
            }
            if (m25596(i, this.f30645)) {
                return C0881.m3233(context, R.color.MT_Protector);
            }
            if (m25596(i, this.f30648)) {
                return C0881.m3233(context, R.color.MT_Protector);
            }
            if (i == R.drawable.MT_Protector) {
                return C0881.m3233(context, R.color.MT_Protector);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM31291 = C12855.m31291(context, R.attr.MT_Protector);
        if (colorStateListM31291 != null && colorStateListM31291.isStateful()) {
            int[] iArr3 = C12855.f38615;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM31291.getColorForState(iArr3, 0);
            iArr[1] = C12855.f38614;
            iArr2[1] = C12855.m31290(context, R.attr.MT_Protector);
            iArr[2] = C12855.f38617;
            iArr2[2] = colorStateListM31291.getDefaultColor();
        } else {
            iArr[0] = C12855.f38615;
            iArr2[0] = C12855.m31288(context, R.attr.MT_Protector);
            iArr[1] = C12855.f38614;
            iArr2[1] = C12855.m31290(context, R.attr.MT_Protector);
            iArr[2] = C12855.f38617;
            iArr2[2] = C12855.m31290(context, R.attr.MT_Protector);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m25597(Context context, int i) {
        int iM31290 = C12855.m31290(context, R.attr.MT_Protector);
        return new ColorStateList(new int[][]{C12855.f38615, C12855.f38618, C12855.f38619, C12855.f38617}, new int[]{C12855.m31288(context, R.attr.MT_Protector), C7191.m19274(iM31290, i), C7191.m19274(iM31290, i), i});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LayerDrawable m25600(C1566 c1566, Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return new LayerDrawable(new Drawable[]{c1566.m5356(context, R.drawable.MT_Protector), c1566.m5356(context, R.drawable.MT_Protector)});
        }
        if (i == R.drawable.MT_Protector) {
            return m25598(c1566, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m25598(c1566, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m25598(c1566, context, R.dimen.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LayerDrawable m25598(C1566 c1566, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM5356 = c1566.m5356(context, R.drawable.MT_Protector);
        Drawable drawableM5357 = c1566.m5356(context, R.drawable.MT_Protector);
        if ((drawableM5356 instanceof BitmapDrawable) && drawableM5356.getIntrinsicWidth() == dimensionPixelSize && drawableM5356.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM5356;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM5356.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM5356.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM5357 instanceof BitmapDrawable) && drawableM5357.getIntrinsicWidth() == dimensionPixelSize && drawableM5357.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM5357;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM5357.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM5357.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25595(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C5965.f18297;
        }
        drawableMutate.setColorFilter(C5965.m16699(i, mode));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25601(Context context, int i, Drawable drawable) {
        if (i == R.drawable.MT_Protector) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m25595(layerDrawable.findDrawableByLayerId(android.R.id.background), C12855.m31290(context, R.attr.MT_Protector), C5965.f18297);
            m25595(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C12855.m31290(context, R.attr.MT_Protector), C5965.f18297);
            m25595(layerDrawable.findDrawableByLayerId(android.R.id.progress), C12855.m31290(context, R.attr.MT_Protector), C5965.f18297);
            return true;
        }
        if (i != R.drawable.MT_Protector && i != R.drawable.MT_Protector && i != R.drawable.MT_Protector) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        m25595(layerDrawable2.findDrawableByLayerId(android.R.id.background), C12855.m31288(context, R.attr.MT_Protector), C5965.f18297);
        m25595(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C12855.m31290(context, R.attr.MT_Protector), C5965.f18297);
        m25595(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C12855.m31290(context, R.attr.MT_Protector), C5965.f18297);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25596(int i, int[] iArr) {
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m25602(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        boolean z;
        int i3;
        Drawable drawableMutate;
        PorterDuff.Mode mode = C5965.f18297;
        if (m25596(i, this.f30646)) {
            i3 = R.attr.MT_Protector;
        } else if (m25596(i, this.f30644)) {
            i3 = R.attr.MT_Protector;
        } else {
            if (!m25596(i, this.f30643)) {
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
                drawableMutate.setColorFilter(C5965.m16699(C12855.m31290(context, i2), mode));
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
        drawableMutate.setColorFilter(C5965.m16699(C12855.m31290(context, i2), mode));
        if (iRound != -1) {
            drawableMutate.setAlpha(iRound);
        }
        return true;
    }
}
