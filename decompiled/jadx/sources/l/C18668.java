package l;

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
public class C18668 extends TextureView {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ImageView.ScaleType[] f58984 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Matrix f58985;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f58986;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1028 f58987;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f58988;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4556 f58989;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextureViewSurfaceTextureListenerC3851 f58990;

    @Override // android.view.TextureView
    public final TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m43276(AbstractC4556 abstractC4556) {
        this.f58990.m11599(this);
        try {
            this.f58990.join();
        } catch (InterruptedException unused) {
        }
        this.f58989 = abstractC4556;
        TextureViewSurfaceTextureListenerC3851 textureViewSurfaceTextureListenerC3851 = new TextureViewSurfaceTextureListenerC3851(this);
        this.f58990 = textureViewSurfaceTextureListenerC3851;
        if (abstractC4556 != null) {
            textureViewSurfaceTextureListenerC3851.start();
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

    public C18668(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58988 = ImageView.ScaleType.FIT_CENTER;
        this.f58985 = new Matrix();
        this.f58986 = 1.0f;
        m43270(attributeSet, 0);
    }

    public C18668(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58988 = ImageView.ScaleType.FIT_CENTER;
        this.f58985 = new Matrix();
        this.f58986 = 1.0f;
        m43270(attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43270(AttributeSet attributeSet, int i) {
        AbstractC4556 c15138;
        AbstractC4556 abstractC4556;
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue(Chip.NAMESPACE_ANDROID, "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f58984;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f58988 = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C12317.f36870, i, 0);
            TypedValue typedValue = new TypedValue();
            if (typedArrayObtainStyledAttributes.getValue(0, typedValue)) {
                if (typedValue.resourceId != 0) {
                    String resourceTypeName = typedArrayObtainStyledAttributes.getResources().getResourceTypeName(typedValue.resourceId);
                    if (C8084.f24900.contains(resourceTypeName)) {
                        c15138 = new C20079(typedArrayObtainStyledAttributes.getResources(), typedValue.resourceId);
                    } else {
                        if (!"string".equals(resourceTypeName)) {
                            throw new IllegalArgumentException(C4860.m14172("Expected string, drawable, mipmap or raw resource type. '", resourceTypeName, "' is not supported"));
                        }
                        c15138 = new C15138(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                    }
                } else {
                    c15138 = new C15138(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                }
                abstractC4556 = c15138;
            } else {
                abstractC4556 = null;
            }
            this.f58989 = abstractC4556;
            super.setOpaque(typedArrayObtainStyledAttributes.getBoolean(1, false));
            typedArrayObtainStyledAttributes.recycle();
            this.f58987 = new C1028(this, attributeSet, i);
        } else {
            super.setOpaque(false);
            this.f58987 = new C1028();
        }
        if (isInEditMode()) {
            return;
        }
        TextureViewSurfaceTextureListenerC3851 textureViewSurfaceTextureListenerC3851 = new TextureViewSurfaceTextureListenerC3851(this);
        this.f58990 = textureViewSurfaceTextureListenerC3851;
        if (this.f58989 != null) {
            textureViewSurfaceTextureListenerC3851.start();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43271(C18668 c18668, TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    @Override // android.view.TextureView
    public final void setOpaque(boolean z) {
        if (z != isOpaque()) {
            super.setOpaque(z);
            AbstractC4556 abstractC4556 = this.f58989;
            synchronized (this) {
                m43276(abstractC4556);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f58990.m11599(this);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m43273(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float fM52918 = gifInfoHandle.m52918() / width;
        float fM52917 = gifInfoHandle.m52917() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.m52918(), gifInfoHandle.m52917());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        switch (C15844.f48948[this.f58988.ordinal()]) {
            case 1:
                matrix.setScale(fM52918, fM52917, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float fMin = 1.0f / Math.min(fM52918, fM52917);
                matrix.setScale(fM52918 * fMin, fMin * fM52917, width / 2.0f, height / 2.0f);
                break;
            case 3:
                float fMin2 = (((float) gifInfoHandle.m52918()) > width || ((float) gifInfoHandle.m52917()) > height) ? Math.min(1.0f / fM52918, 1.0f / fM52917) : 1.0f;
                matrix.setScale(fM52918 * fMin2, fMin2 * fM52917, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(fM52918, fM52917);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(fM52918, fM52917);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(fM52918, fM52917);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f58985);
                matrix.preScale(fM52918, fM52917);
                break;
        }
        super.setTransform(matrix);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        this.f58985.set(matrix);
        m43273(this.f58990.f12288);
    }

    @Override // android.view.TextureView
    public final Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f58985);
        return matrix;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        TextureViewSurfaceTextureListenerC3851 textureViewSurfaceTextureListenerC3851 = this.f58990;
        textureViewSurfaceTextureListenerC3851.f12285 = textureViewSurfaceTextureListenerC3851.f12288.m52914();
        return new C0322(super.onSaveInstanceState(), this.f58987.f3757 ? this.f58990.f12285 : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0322)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0322 c0322 = (C0322) parcelable;
        super.onRestoreInstanceState(c0322.getSuperState());
        this.f58990.f12285 = c0322.f1704[0];
    }
}
