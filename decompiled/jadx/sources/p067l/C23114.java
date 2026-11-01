package p067l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩸᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5ZZ */
/* JADX INFO: loaded from: classes.dex */
public class C23114 extends C1732 {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final ImageView.ScaleType f72631 = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final Bitmap.Config f72632 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final /* synthetic */ int f72633 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public long f72634;

    /* JADX INFO: renamed from: ۗ */
    public final RectF f72635;

    /* JADX INFO: renamed from: ۙ */
    public float f72636;

    /* JADX INFO: renamed from: ۛ */
    public final RectF f72637;

    /* JADX INFO: renamed from: ۟ */
    public final Matrix f72638;

    /* JADX INFO: renamed from: ۤ */
    public float f72639;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f72640;

    /* JADX INFO: renamed from: ۨ */
    public int f72641;

    /* JADX INFO: renamed from: ۫ */
    public boolean f72642;

    /* JADX INFO: renamed from: ۬ */
    public ColorFilter f72643;

    /* JADX INFO: renamed from: ܰ */
    public boolean f72644;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f72645;

    /* JADX INFO: renamed from: ᩶ */
    public final Paint f72646;

    /* JADX INFO: renamed from: ᩸ */
    public Bitmap f72647;

    /* JADX INFO: renamed from: ᩹ */
    public Canvas f72648;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f72649;

    public C23114(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C23114(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72637 = new RectF();
        this.f72635 = new RectF();
        this.f72638 = new Matrix();
        Paint paint = new Paint();
        this.f72646 = paint;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.f72641 = 255;
        this.f72640 = false;
        this.f72645 = 0.0f;
        this.f72649 = true;
        super.setScaleType(f72631);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAlpha(this.f72641);
        paint.setColorFilter(this.f72643);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(0);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(0);
        setOutlineProvider(new C17077(this));
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f72631) {
            return;
        }
        throw new IllegalArgumentException("ScaleType " + scaleType + " not supported.");
    }

    @Override // android.widget.ImageView
    public final void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        C3014 c3014 = drawable instanceof C3014 ? (C3014) drawable : null;
        float f = this.f72645;
        if (this.f72640) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.f72634;
            if (jUptimeMillis >= j) {
                f += c3014 == null ? 0.5f : 1.25f;
                if (f >= 360.0f) {
                    f -= 360.0f;
                }
                this.f72645 = f;
                this.f72634 = jUptimeMillis + 15;
                postInvalidateDelayed(15L);
            } else {
                postInvalidateDelayed(j - jUptimeMillis);
            }
        }
        float f2 = f;
        if (c3014 != null) {
            c3014.m5095(canvas, getWidth(), getHeight(), f2, true, C23223.m51768());
            return;
        }
        if (f2 != 0.0f) {
            canvas.rotate(f2, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (this.f72647 != null) {
            if (this.f72642 && this.f72648 != null) {
                this.f72642 = false;
                Drawable drawable2 = getDrawable();
                drawable2.setBounds(0, 0, this.f72648.getWidth(), this.f72648.getHeight());
                drawable2.draw(this.f72648);
            }
            boolean z = this.f72644;
            Paint paint = this.f72646;
            if (z) {
                this.f72644 = false;
                Bitmap bitmap = this.f72647;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.f72638);
                paint.setShader(bitmapShader);
            }
            RectF rectF = this.f72637;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f72639, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f72642 = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m51544();
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m51544();
        invalidate();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m51544();
        invalidate();
    }

    @Override // p067l.C1732, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m51545();
        invalidate();
    }

    @Override // p067l.C1732, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m51545();
        invalidate();
    }

    @Override // p067l.C1732, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        m51545();
        invalidate();
    }

    @Override // p067l.C1732, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m51545();
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.f72641) {
            return;
        }
        this.f72641 = i2;
        if (this.f72649) {
            this.f72646.setAlpha(i2);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final int getImageAlpha() {
        return this.f72641;
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f72643) {
            return;
        }
        this.f72643 = colorFilter;
        if (this.f72649) {
            this.f72646.setColorFilter(colorFilter);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final ColorFilter getColorFilter() {
        return this.f72643;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m51545() {
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            bitmap = null;
        } else if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            try {
                boolean z = drawable instanceof ColorDrawable;
                Bitmap.Config config = f72632;
                if (z) {
                    bitmapCreateBitmap = Bitmap.createBitmap(2, 2, config);
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmap = bitmapCreateBitmap;
            } catch (Exception unused) {
                bitmap = null;
            }
        }
        this.f72647 = bitmap;
        if (bitmap != null && bitmap.isMutable()) {
            this.f72648 = new Canvas(this.f72647);
        } else {
            this.f72648 = null;
        }
        if (this.f72649) {
            if (this.f72647 != null) {
                m51543();
            } else {
                this.f72646.setShader(null);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m51544() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = ((width - iMin) / 2.0f) + getPaddingLeft();
        float paddingTop = ((height - iMin) / 2.0f) + getPaddingTop();
        float f = iMin;
        RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
        RectF rectF2 = this.f72635;
        rectF2.set(rectF);
        float f2 = 0;
        this.f72636 = Math.min((rectF2.height() - f2) / 2.0f, (rectF2.width() - f2) / 2.0f);
        RectF rectF3 = this.f72637;
        rectF3.set(rectF2);
        this.f72639 = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
        m51543();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m51543() {
        float fWidth;
        float fHeight;
        if (this.f72647 == null) {
            return;
        }
        Matrix matrix = this.f72638;
        matrix.set(null);
        int height = this.f72647.getHeight();
        float width = this.f72647.getWidth();
        RectF rectF = this.f72637;
        float f = height;
        float fWidth2 = 0.0f;
        if (rectF.height() * width > rectF.width() * f) {
            fWidth = rectF.height() / f;
            fWidth2 = (rectF.width() - (width * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = rectF.width() / width;
            fHeight = (rectF.height() - (f * fWidth)) * 0.5f;
        }
        matrix.setScale(fWidth, fWidth);
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.f72644 = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.f72635;
        if (!rectF.isEmpty()) {
            if (Math.pow(y - rectF.centerY(), 2.0d) + Math.pow(x - rectF.centerX(), 2.0d) > Math.pow(this.f72636, 2.0d)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51547() {
        this.f72645 = 0.0f;
        this.f72634 = SystemClock.uptimeMillis() + 200;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51546(boolean z) {
        this.f72640 = z;
        if (z) {
            invalidate();
        }
    }
}
