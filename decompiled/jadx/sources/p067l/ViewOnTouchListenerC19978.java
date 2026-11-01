package p067l;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC19978 implements InterfaceC21990, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ۡ֫ */
    public static final AccelerateDecelerateInterpolator f60628 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ֫֫ */
    public View.OnLongClickListener f60629;

    /* JADX INFO: renamed from: ۗ */
    public RunnableC5896 f60630;

    /* JADX INFO: renamed from: ۛ */
    public WeakReference f60632;

    /* JADX INFO: renamed from: ۟ */
    public int f60634;

    /* JADX INFO: renamed from: ۤ */
    public GestureDetector f60636;

    /* JADX INFO: renamed from: ۨ */
    public int f60638;

    /* JADX INFO: renamed from: ܰ */
    public int f60641;

    /* JADX INFO: renamed from: ܿ֫ */
    public InterfaceC2542 f60644;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f60647;

    /* JADX INFO: renamed from: ᩸ */
    public float f60648;

    /* JADX INFO: renamed from: ᩹ */
    public float f60649;

    /* JADX INFO: renamed from: ᩺ */
    public int f60650;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f60645 = 1.0f;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f60643 = 3.0f;

    /* JADX INFO: renamed from: ۙ */
    public boolean f60631 = false;

    /* JADX INFO: renamed from: ᩶ */
    public final Matrix f60646 = new Matrix();

    /* JADX INFO: renamed from: ۫ */
    public final Matrix f60639 = new Matrix();

    /* JADX INFO: renamed from: ۜ֫ */
    public final Matrix f60633 = new Matrix();

    /* JADX INFO: renamed from: ۬ */
    public final RectF f60640 = new RectF();

    /* JADX INFO: renamed from: ۧ֫ */
    public final float[] f60637 = new float[9];

    /* JADX INFO: renamed from: ᩻֫ */
    public int f60651 = 2;

    /* JADX INFO: renamed from: ܳ֫ */
    public ImageView.ScaleType f60642 = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: ۢ֫ */
    public final float[] f60635 = new float[9];

    /* JADX INFO: renamed from: ֫ */
    public final void m45343(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
        }
        if (scaleType == null || scaleType == this.f60642) {
            return;
        }
        this.f60642 = scaleType;
        m45352();
    }

    public ViewOnTouchListenerC19978(C11261 c11261) {
        this.f60632 = new WeakReference(c11261);
        c11261.setDrawingCacheEnabled(true);
        c11261.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = c11261.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (c11261.isInEditMode()) {
            return;
        }
        this.f60644 = C20649.m46663(c11261.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(c11261.getContext(), new C10590(this));
        this.f60636 = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC8578(this));
        this.f60647 = true;
        m45352();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45338() {
        WeakReference weakReference = this.f60632;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            RunnableC5896 runnableC5896 = this.f60630;
            if (runnableC5896 != null) {
                runnableC5896.m13243();
                this.f60630 = null;
            }
        }
        GestureDetector gestureDetector = this.f60636;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f60632 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final RectF m45345() {
        m45333();
        return m45329(m45348());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ImageView m45351() {
        WeakReference weakReference = this.f60632;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m45338();
        }
        return imageView;
    }

    /* JADX INFO: renamed from: ܳ */
    public final float m45347() {
        return this.f60645;
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m45350() {
        return this.f60643;
    }

    /* JADX INFO: renamed from: ۜ */
    public final ImageView.ScaleType m45344() {
        return this.f60642;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45339(float f, float f2) {
        InterfaceC2542 interfaceC2542 = this.f60644;
        if (interfaceC2542.mo3731()) {
            return;
        }
        ImageView imageViewM45351 = m45351();
        boolean z = this.f60631;
        Matrix matrix = this.f60633;
        if (!z) {
            float[] fArr = this.f60635;
            matrix.getValues(fArr);
            float fRound = Math.round(fArr[2]);
            float fRound2 = Math.round(fArr[5]);
            matrix.postTranslate(f, f2);
            m45334();
            matrix.getValues(fArr);
            float fRound3 = Math.round(fArr[2]);
            float fRound4 = Math.round(fArr[5]);
            if (fRound != fRound3 || fRound2 != fRound4) {
                this.f60631 = true;
            }
        } else {
            matrix.postTranslate(f, f2);
            m45334();
        }
        ViewParent parent = imageViewM45351.getParent();
        if (interfaceC2542.mo3731() || this.f60631) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i = this.f60651;
        if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45346(float f, float f2) {
        ImageView imageViewM45351 = m45351();
        RunnableC5896 runnableC5896 = new RunnableC5896(imageViewM45351.getContext(), this);
        this.f60630 = runnableC5896;
        runnableC5896.m13244(m45335(imageViewM45351), m45328(imageViewM45351), (int) f, (int) f2);
        imageViewM45351.post(this.f60630);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView imageViewM45351 = m45351();
        if (imageViewM45351 != null) {
            if (this.f60647) {
                int top = imageViewM45351.getTop();
                int right = imageViewM45351.getRight();
                int bottom = imageViewM45351.getBottom();
                int left = imageViewM45351.getLeft();
                if (top == this.f60634 && bottom == this.f60638 && left == this.f60650 && right == this.f60641) {
                    return;
                }
                m45331(imageViewM45351.getDrawable());
                this.f60634 = top;
                this.f60641 = right;
                this.f60638 = bottom;
                this.f60650 = left;
                return;
            }
            m45331(imageViewM45351.getDrawable());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45340(float f, float f2, float f3) {
        if (m45353() > this.f60645 / 2.0f || f > 1.0f) {
            this.f60648 = f2;
            this.f60649 = f3;
            this.f60633.postScale(f, f, f2, f3);
            m45334();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView;
        boolean z = false;
        if (this.f60647 && (imageView = (ImageView) view) != null && imageView.getDrawable() != null) {
            ViewParent parent = view.getParent();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                RunnableC5896 runnableC5896 = this.f60630;
                if (runnableC5896 != null) {
                    runnableC5896.m13243();
                    this.f60630 = null;
                }
                this.f60631 = false;
            } else if (actionMasked == 1 || actionMasked == 3) {
                float fM45353 = m45353();
                float f = this.f60645;
                if (fM45353 < f) {
                    view.post(new RunnableC4555(this, fM45353, f, this.f60648, this.f60649));
                } else {
                    float f2 = this.f60643;
                    if (fM45353 > f2) {
                        view.post(new RunnableC4555(this, fM45353, f2, this.f60648, this.f60649));
                    }
                }
                z = true;
            } else if (actionMasked == 5) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f60631 = true;
            }
            InterfaceC2542 interfaceC2542 = this.f60644;
            if (interfaceC2542 != null) {
                interfaceC2542.mo3730(motionEvent);
                z = true;
            }
            GestureDetector gestureDetector = this.f60636;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45349(float f, float f2) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MaxZoom");
        }
        this.f60645 = f;
        this.f60643 = f2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45342(View.OnLongClickListener onLongClickListener) {
        this.f60629 = onLongClickListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45341(float f, float f2, float f3, boolean z) {
        ImageView imageViewM45351 = m45351();
        if (imageViewM45351 == null || f < this.f60645 || f > this.f60643) {
            return;
        }
        if (z) {
            imageViewM45351.post(new RunnableC4555(this, m45353(), f, f2, f3));
        } else {
            this.f60633.setScale(f, f, f2, f3);
            m45334();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m45352() {
        ImageView imageViewM45351 = m45351();
        if (imageViewM45351 != null) {
            if (this.f60647) {
                if (!(imageViewM45351 instanceof InterfaceC21990)) {
                    ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
                    if (!scaleType.equals(imageViewM45351.getScaleType())) {
                        imageViewM45351.setScaleType(scaleType);
                    }
                }
                m45331(imageViewM45351.getDrawable());
                return;
            }
            Matrix matrix = this.f60633;
            matrix.reset();
            matrix.postRotate(0.0f);
            m45334();
            m45337(m45348());
            m45333();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final Matrix m45348() {
        Matrix matrix = this.f60646;
        Matrix matrix2 = this.f60639;
        matrix2.set(matrix);
        matrix2.postConcat(this.f60633);
        return matrix2;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m45334() {
        if (m45333()) {
            m45337(m45348());
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private boolean m45333() {
        RectF rectFM45329;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ImageView imageViewM45351 = m45351();
        if (imageViewM45351 == null || (rectFM45329 = m45329(m45348())) == null) {
            return false;
        }
        float fHeight = rectFM45329.height();
        float fWidth = rectFM45329.width();
        float fM45328 = m45328(imageViewM45351);
        float f7 = 0.0f;
        if (fHeight <= fM45328) {
            int i = C17294.f51595[this.f60642.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    fM45328 -= fHeight;
                    f2 = rectFM45329.top;
                } else {
                    fM45328 = (fM45328 - fHeight) / 2.0f;
                    f2 = rectFM45329.top;
                }
            } else {
                f = rectFM45329.top;
                f3 = -f;
            }
        } else {
            f = rectFM45329.top;
            if (f > 0.0f) {
                f3 = -f;
            } else {
                f2 = rectFM45329.bottom;
                f3 = f2 < fM45328 ? fM45328 - f2 : 0.0f;
            }
        }
        float fM45335 = m45335(imageViewM45351);
        if (fWidth <= fM45335) {
            int i2 = C17294.f51595[this.f60642.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    f5 = fM45335 - fWidth;
                    f6 = rectFM45329.left;
                } else {
                    f5 = (fM45335 - fWidth) / 2.0f;
                    f6 = rectFM45329.left;
                }
                f4 = f5 - f6;
            } else {
                f4 = -rectFM45329.left;
            }
            f7 = f4;
            this.f60651 = 2;
        } else {
            float f8 = rectFM45329.left;
            if (f8 > 0.0f) {
                this.f60651 = 0;
                f7 = -f8;
            } else {
                float f9 = rectFM45329.right;
                if (f9 < fM45335) {
                    f7 = fM45335 - f9;
                    this.f60651 = 1;
                } else {
                    this.f60651 = -1;
                }
            }
        }
        this.f60633.postTranslate(f7, f3);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private RectF m45329(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM45351 = m45351();
        if (imageViewM45351 == null || (drawable = imageViewM45351.getDrawable()) == null) {
            return null;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f60640;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        matrix.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final float m45353() {
        Matrix matrix = this.f60633;
        float[] fArr = this.f60637;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m45337(Matrix matrix) {
        ImageView imageViewM45351 = m45351();
        if (imageViewM45351 != null) {
            ImageView imageViewM45352 = m45351();
            if (imageViewM45352 != null && !(imageViewM45352 instanceof InterfaceC21990) && !ImageView.ScaleType.MATRIX.equals(imageViewM45352.getScaleType())) {
                throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
            }
            imageViewM45351.setImageMatrix(matrix);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45331(Drawable drawable) {
        ImageView imageViewM45351 = m45351();
        if (imageViewM45351 == null || drawable == null) {
            return;
        }
        float fM45335 = m45335(imageViewM45351);
        float fM45328 = m45328(imageViewM45351);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f60646;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = fM45335 / f;
        float f3 = intrinsicHeight;
        float f4 = fM45328 / f3;
        ImageView.ScaleType scaleType = this.f60642;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((fM45335 - f) / 2.0f, (fM45328 - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((fM45335 - (f * fMax)) / 2.0f, (fM45328 - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((fM45335 - (f * fMin)) / 2.0f, (fM45328 - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM45335, fM45328);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C17294.f51595[this.f60642.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f60633;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        m45334();
        m45337(m45348());
        m45333();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m45335(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m45328(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }
}
