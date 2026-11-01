package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.۬ܶ */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes4.dex */
public class C1496 extends C1732 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f42472;

    /* JADX INFO: renamed from: ۙ */
    public Drawable[] f42473;

    /* JADX INFO: renamed from: ۛ */
    public float f42474;

    /* JADX INFO: renamed from: ۤ */
    public float f42475;

    /* JADX INFO: renamed from: ۨ */
    public ViewOutlineProvider f42476;

    /* JADX INFO: renamed from: ۫ */
    public RectF f42477;

    /* JADX INFO: renamed from: ۬ */
    public Path f42478;

    /* JADX INFO: renamed from: ᩶ */
    public LayerDrawable f42479;

    /* JADX INFO: renamed from: ᩸ */
    public float f42480;

    /* JADX INFO: renamed from: ᩹ */
    public C1006 f42481;

    public C1496(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42481 = new C1006();
        this.f42472 = true;
        this.f42480 = 0.0f;
        this.f42474 = 0.0f;
        this.f42475 = Float.NaN;
        m34102(attributeSet);
    }

    public C1496(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42481 = new C1006();
        this.f42472 = true;
        this.f42480 = 0.0f;
        this.f42474 = 0.0f;
        this.f42475 = Float.NaN;
        m34102(attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34102(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72690);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f42480 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C1006 c1006 = this.f42481;
                    if (index == 8) {
                        c1006.f13168 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c1006.m12138(this);
                    } else if (index == 7) {
                        c1006.f13166 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c1006.m12138(this);
                    } else if (index == 2) {
                        c1006.f13167 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c1006.m12138(this);
                    } else if (index == 5) {
                        float dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                        if (Float.isNaN(dimension)) {
                            this.f42475 = dimension;
                            float f = this.f42474;
                            this.f42474 = -1.0f;
                            m34104(f);
                        } else {
                            boolean z = this.f42475 != dimension;
                            this.f42475 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f42478 == null) {
                                    this.f42478 = new Path();
                                }
                                if (this.f42477 == null) {
                                    this.f42477 = new RectF();
                                }
                                if (this.f42476 == null) {
                                    C1076 c1076 = new C1076(this);
                                    this.f42476 = c1076;
                                    setOutlineProvider(c1076);
                                }
                                setClipToOutline(true);
                                this.f42477.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f42478.reset();
                                Path path = this.f42478;
                                RectF rectF = this.f42477;
                                float f2 = this.f42475;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m34104(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f42472 = typedArrayObtainStyledAttributes.getBoolean(index, this.f42472);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f42473 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f42473[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f42473);
                this.f42479 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f42480 * 255.0f));
                super.setImageDrawable(this.f42479);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34104(float f) {
        boolean z = this.f42474 != f;
        this.f42474 = f;
        if (f != 0.0f) {
            if (this.f42478 == null) {
                this.f42478 = new Path();
            }
            if (this.f42477 == null) {
                this.f42477 = new RectF();
            }
            if (this.f42476 == null) {
                C1846 c1846 = new C1846(this);
                this.f42476 = c1846;
                setOutlineProvider(c1846);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f42474) / 2.0f;
            this.f42477.set(0.0f, 0.0f, width, height);
            this.f42478.reset();
            this.f42478.addRoundRect(this.f42477, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
