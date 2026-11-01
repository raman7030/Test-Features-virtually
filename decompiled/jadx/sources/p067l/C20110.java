package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ᩴۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D5IX */
/* JADX INFO: loaded from: classes4.dex */
public class C20110 extends TextureView {

    /* JADX INFO: renamed from: ۫ */
    public static final ImageView.ScaleType[] f62207 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: ۗ */
    public final Matrix f62208;

    /* JADX INFO: renamed from: ۙ */
    public float f62209;

    /* JADX INFO: renamed from: ۬ */
    public C3345 f62210;

    /* JADX INFO: renamed from: ᩶ */
    public ImageView.ScaleType f62211;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC6698 f62212;

    /* JADX INFO: renamed from: ᩹ */
    public TextureViewSurfaceTextureListenerC6028 f62213;

    @Override // android.view.TextureView
    public final TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m45542(AbstractC6698 abstractC6698) {
        this.f62213.m13535(this);
        try {
            this.f62213.join();
        } catch (InterruptedException unused) {
        }
        this.f62212 = abstractC6698;
        TextureViewSurfaceTextureListenerC6028 textureViewSurfaceTextureListenerC6028 = new TextureViewSurfaceTextureListenerC6028(this);
        this.f62213 = textureViewSurfaceTextureListenerC6028;
        if (abstractC6698 != null) {
            textureViewSurfaceTextureListenerC6028.start();
        } else {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                Surface surface = new Surface(surfaceTexture);
                try {
                    surface.unlockCanvasAndPost(surface.lockCanvas(null));
                    surface.release();
                } catch (Throwable th) {
                    surface.release();
                    throw th;
                }
            }
        }
    }

    public C20110(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62211 = ImageView.ScaleType.FIT_CENTER;
        this.f62208 = new Matrix();
        this.f62209 = 1.0f;
        m45536(attributeSet, 0);
    }

    public C20110(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62211 = ImageView.ScaleType.FIT_CENTER;
        this.f62208 = new Matrix();
        this.f62209 = 1.0f;
        m45536(attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45536(AttributeSet attributeSet, int i) {
        AbstractC6698 c16755;
        AbstractC6698 abstractC6698;
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue(Chip.NAMESPACE_ANDROID, "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f62207;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f62211 = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14074.f39884, i, 0);
            TypedValue typedValue = new TypedValue();
            if (typedArrayObtainStyledAttributes.getValue(0, typedValue)) {
                if (typedValue.resourceId != 0) {
                    String resourceTypeName = typedArrayObtainStyledAttributes.getResources().getResourceTypeName(typedValue.resourceId);
                    if (C10051.f27811.contains(resourceTypeName)) {
                        c16755 = new C21451(typedArrayObtainStyledAttributes.getResources(), typedValue.resourceId);
                    } else {
                        if (!"string".equals(resourceTypeName)) {
                            throw new IllegalArgumentException(C6988.m16053("Expected string, drawable, mipmap or raw resource type. '", resourceTypeName, "' is not supported"));
                        }
                        c16755 = new C16755(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                    }
                } else {
                    c16755 = new C16755(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                }
                abstractC6698 = c16755;
            } else {
                abstractC6698 = null;
            }
            this.f62212 = abstractC6698;
            super.setOpaque(typedArrayObtainStyledAttributes.getBoolean(1, false));
            typedArrayObtainStyledAttributes.recycle();
            this.f62210 = new C3345(this, attributeSet, i);
        } else {
            super.setOpaque(false);
            this.f62210 = new C3345();
        }
        if (isInEditMode()) {
            return;
        }
        TextureViewSurfaceTextureListenerC6028 textureViewSurfaceTextureListenerC6028 = new TextureViewSurfaceTextureListenerC6028(this);
        this.f62213 = textureViewSurfaceTextureListenerC6028;
        if (this.f62212 != null) {
            textureViewSurfaceTextureListenerC6028.start();
        }
    }

    @Override // android.view.TextureView
    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    @Override // android.view.TextureView
    public final void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45537(C20110 c20110, TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    @Override // android.view.TextureView
    public final void setOpaque(boolean z) {
        if (z != isOpaque()) {
            super.setOpaque(z);
            AbstractC6698 abstractC6698 = this.f62212;
            synchronized (this) {
                m45542(abstractC6698);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f62213.m13535(this);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m45539(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float fM55482 = gifInfoHandle.m55482() / width;
        float fM55481 = gifInfoHandle.m55481() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.m55482(), gifInfoHandle.m55481());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        switch (C17426.f52086[this.f62211.ordinal()]) {
            case 1:
                matrix.setScale(fM55482, fM55481, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float fMin = 1.0f / Math.min(fM55482, fM55481);
                matrix.setScale(fM55482 * fMin, fMin * fM55481, width / 2.0f, height / 2.0f);
                break;
            case 3:
                float fMin2 = (((float) gifInfoHandle.m55482()) > width || ((float) gifInfoHandle.m55481()) > height) ? Math.min(1.0f / fM55482, 1.0f / fM55481) : 1.0f;
                matrix.setScale(fM55482 * fMin2, fMin2 * fM55481, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(fM55482, fM55481);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(fM55482, fM55481);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(fM55482, fM55481);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f62208);
                matrix.preScale(fM55482, fM55481);
                break;
        }
        super.setTransform(matrix);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        this.f62208.set(matrix);
        m45539(this.f62213.f15095);
    }

    @Override // android.view.TextureView
    public final Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f62208);
        return matrix;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        TextureViewSurfaceTextureListenerC6028 textureViewSurfaceTextureListenerC6028 = this.f62213;
        textureViewSurfaceTextureListenerC6028.f15092 = textureViewSurfaceTextureListenerC6028.f15095.m55478();
        return new C2674(super.onSaveInstanceState(), this.f62210.f6529 ? this.f62213.f15092 : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2674)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2674 c2674 = (C2674) parcelable;
        super.onRestoreInstanceState(c2674.getSuperState());
        this.f62213.f15092 = c2674.f4480[0];
    }
}
