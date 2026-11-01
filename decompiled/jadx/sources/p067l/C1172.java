package p067l;

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

/* JADX INFO: renamed from: l.ۜۡ */
/* JADX INFO: compiled from: F5X2 */
/* JADX INFO: loaded from: classes2.dex */
public class C1172 {

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f23499 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: ֫ */
    public Bitmap f23500;

    /* JADX INFO: renamed from: ۧ */
    public final AbsSeekBar f23501;

    public C1172(AbsSeekBar absSeekBar) {
        this.f23501 = absSeekBar;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9892(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = this.f23501;
        C1970 c1970M53129 = C1970.m53129(absSeekBar.getContext(), attributeSet, f23499, i, 0);
        Drawable drawableM53145 = c1970M53129.m53145(0);
        if (drawableM53145 != null) {
            if (drawableM53145 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM53145;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM20118 = m20118(animationDrawable.getFrame(i2), true);
                    drawableM20118.setLevel(10000);
                    animationDrawable2.addFrame(drawableM20118, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM53145 = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableM53145);
        }
        Drawable drawableM53146 = c1970M53129.m53145(1);
        if (drawableM53146 != null) {
            absSeekBar.setProgressDrawable(m20118(drawableM53146, false));
        }
        c1970M53129.m53146();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final Drawable m20118(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC1458) {
            InterfaceC1458 interfaceC1458 = (InterfaceC1458) drawable;
            Drawable drawableMo28082 = interfaceC1458.mo28082();
            if (drawableMo28082 != null) {
                interfaceC1458.mo28083(m20118(drawableMo28082, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m20118(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        C2012.m54442(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f23500 == null) {
                    this.f23500 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap m20117() {
        return this.f23500;
    }
}
