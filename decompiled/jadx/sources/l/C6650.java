package l;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;

/* JADX INFO: renamed from: l.ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X2 */
/* JADX INFO: loaded from: classes2.dex */
public class C6650 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f20623 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f20624;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbsSeekBar f20625;

    public C6650(AbsSeekBar absSeekBar) {
        this.f20625 = absSeekBar;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo7844(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = this.f20625;
        C22733 c22733M50796 = C22733.m50796(absSeekBar.getContext(), attributeSet, f20623, i, 0);
        Drawable drawableM50812 = c22733M50796.m50812(0);
        if (drawableM50812 != null) {
            if (drawableM50812 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM50812;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM18170 = m18170(animationDrawable.getFrame(i2), true);
                    drawableM18170.setLevel(10000);
                    animationDrawable2.addFrame(drawableM18170, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM50812 = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableM50812);
        }
        Drawable drawableM50813 = c22733M50796.m50812(1);
        if (drawableM50813 != null) {
            absSeekBar.setProgressDrawable(m18170(drawableM50813, false));
        }
        c22733M50796.m50813();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable m18170(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC12417) {
            InterfaceC12417 interfaceC12417 = (InterfaceC12417) drawable;
            Drawable drawableMo26058 = interfaceC12417.mo26058();
            if (drawableMo26058 != null) {
                interfaceC12417.mo26059(m18170(drawableMo26058, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m18170(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        C23583.m52040(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f20624 == null) {
                    this.f20624 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m18169() {
        return this.f20624;
    }
}
