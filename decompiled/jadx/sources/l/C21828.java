package l;

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
public class C21828 extends C17939 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final ImageView.ScaleType f69922 = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final Bitmap.Config f69923 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69924 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f69925;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final RectF f69926;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f69927;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final RectF f69928;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Matrix f69929;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f69930;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f69931;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f69932;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69933;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ColorFilter f69934;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69935;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f69936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f69937;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f69938;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Canvas f69939;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f69940;

    public C21828(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21828(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69928 = new RectF();
        this.f69926 = new RectF();
        this.f69929 = new Matrix();
        Paint paint = new Paint();
        this.f69937 = paint;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.f69932 = 255;
        this.f69931 = false;
        this.f69936 = 0.0f;
        this.f69940 = true;
        super.setScaleType(f69922);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAlpha(this.f69932);
        paint.setColorFilter(this.f69934);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(0);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(0);
        setOutlineProvider(new C15476(this));
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f69922) {
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
        C0679 c0679 = drawable instanceof C0679 ? (C0679) drawable : null;
        float f = this.f69936;
        if (this.f69931) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.f69925;
            if (jUptimeMillis >= j) {
                f += c0679 == null ? 0.5f : 1.25f;
                if (f >= 360.0f) {
                    f -= 360.0f;
                }
                this.f69936 = f;
                this.f69925 = jUptimeMillis + 15;
                postInvalidateDelayed(15L);
            } else {
                postInvalidateDelayed(j - jUptimeMillis);
            }
        }
        float f2 = f;
        if (c0679 != null) {
            c0679.m2756(canvas, getWidth(), getHeight(), f2, true, C21943.m49431());
            return;
        }
        if (f2 != 0.0f) {
            canvas.rotate(f2, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (this.f69938 != null) {
            if (this.f69933 && this.f69939 != null) {
                this.f69933 = false;
                Drawable drawable2 = getDrawable();
                drawable2.setBounds(0, 0, this.f69939.getWidth(), this.f69939.getHeight());
                drawable2.draw(this.f69939);
            }
            boolean z = this.f69935;
            Paint paint = this.f69937;
            if (z) {
                this.f69935 = false;
                Bitmap bitmap = this.f69938;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.f69929);
                paint.setShader(bitmapShader);
            }
            RectF rectF = this.f69928;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f69930, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f69933 = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m49194();
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m49194();
        invalidate();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m49194();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m49195();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m49195();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        m49195();
        invalidate();
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m49195();
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.f69932) {
            return;
        }
        this.f69932 = i2;
        if (this.f69940) {
            this.f69937.setAlpha(i2);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final int getImageAlpha() {
        return this.f69932;
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f69934) {
            return;
        }
        this.f69934 = colorFilter;
        if (this.f69940) {
            this.f69937.setColorFilter(colorFilter);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final ColorFilter getColorFilter() {
        return this.f69934;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m49195() {
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
                Bitmap.Config config = f69923;
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
        this.f69938 = bitmap;
        if (bitmap != null && bitmap.isMutable()) {
            this.f69939 = new Canvas(this.f69938);
        } else {
            this.f69939 = null;
        }
        if (this.f69940) {
            if (this.f69938 != null) {
                m49193();
            } else {
                this.f69937.setShader(null);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49194() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = ((width - iMin) / 2.0f) + getPaddingLeft();
        float paddingTop = ((height - iMin) / 2.0f) + getPaddingTop();
        float f = iMin;
        RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
        RectF rectF2 = this.f69926;
        rectF2.set(rectF);
        float f2 = 0;
        this.f69927 = Math.min((rectF2.height() - f2) / 2.0f, (rectF2.width() - f2) / 2.0f);
        RectF rectF3 = this.f69928;
        rectF3.set(rectF2);
        this.f69930 = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
        m49193();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m49193() {
        float fWidth;
        float fHeight;
        if (this.f69938 == null) {
            return;
        }
        Matrix matrix = this.f69929;
        matrix.set(null);
        int height = this.f69938.getHeight();
        float width = this.f69938.getWidth();
        RectF rectF = this.f69928;
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
        this.f69935 = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.f69926;
        if (!rectF.isEmpty()) {
            if (Math.pow(y - rectF.centerY(), 2.0d) + Math.pow(x - rectF.centerX(), 2.0d) > Math.pow(this.f69927, 2.0d)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49197() {
        this.f69936 = 0.0f;
        this.f69925 = SystemClock.uptimeMillis() + 200;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49196(boolean z) {
        this.f69931 = z;
        if (z) {
            invalidate();
        }
    }
}
