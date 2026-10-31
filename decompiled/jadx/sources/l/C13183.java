package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes4.dex */
public class C13183 extends C17939 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f39408;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable[] f39409;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f39410;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f39411;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ViewOutlineProvider f39412;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public RectF f39413;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Path f39414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LayerDrawable f39415;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f39416;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3306 f39417;

    public C13183(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39417 = new C3306();
        this.f39408 = true;
        this.f39416 = 0.0f;
        this.f39410 = 0.0f;
        this.f39411 = Float.NaN;
        m32004(attributeSet);
    }

    public C13183(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39417 = new C3306();
        this.f39408 = true;
        this.f39416 = 0.0f;
        this.f39410 = 0.0f;
        this.f39411 = Float.NaN;
        m32004(attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32004(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69981);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f39416 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C3306 c3306 = this.f39417;
                    if (index == 8) {
                        c3306.f10359 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c3306.m10102(this);
                    } else if (index == 7) {
                        c3306.f10357 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c3306.m10102(this);
                    } else if (index == 2) {
                        c3306.f10358 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c3306.m10102(this);
                    } else if (index == 5) {
                        float dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                        if (Float.isNaN(dimension)) {
                            this.f39411 = dimension;
                            float f = this.f39410;
                            this.f39410 = -1.0f;
                            m32006(f);
                        } else {
                            boolean z = this.f39411 != dimension;
                            this.f39411 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f39414 == null) {
                                    this.f39414 = new Path();
                                }
                                if (this.f39413 == null) {
                                    this.f39413 = new RectF();
                                }
                                if (this.f39412 == null) {
                                    C4717 c4717 = new C4717(this);
                                    this.f39412 = c4717;
                                    setOutlineProvider(c4717);
                                }
                                setClipToOutline(true);
                                this.f39413.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f39414.reset();
                                Path path = this.f39414;
                                RectF rectF = this.f39413;
                                float f2 = this.f39411;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m32006(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f39408 = typedArrayObtainStyledAttributes.getBoolean(index, this.f39408);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f39409 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f39409[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f39409);
                this.f39415 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f39416 * 255.0f));
                super.setImageDrawable(this.f39415);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32006(float f) {
        boolean z = this.f39410 != f;
        this.f39410 = f;
        if (f != 0.0f) {
            if (this.f39414 == null) {
                this.f39414 = new Path();
            }
            if (this.f39413 == null) {
                this.f39413 = new RectF();
            }
            if (this.f39412 == null) {
                C20240 c20240 = new C20240(this);
                this.f39412 = c20240;
                setOutlineProvider(c20240);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f39410) / 2.0f;
            this.f39413.set(0.0f, 0.0f, width, height);
            this.f39414.reset();
            this.f39414.addRoundRect(this.f39413, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
