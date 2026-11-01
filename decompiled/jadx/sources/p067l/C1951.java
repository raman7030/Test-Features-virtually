package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩹ܶ */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes.dex */
public class C1951 extends C1382 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f75151;

    /* JADX INFO: renamed from: ۙ */
    public Drawable[] f75152;

    /* JADX INFO: renamed from: ۛ */
    public float f75153;

    /* JADX INFO: renamed from: ۤ */
    public float f75154;

    /* JADX INFO: renamed from: ۨ */
    public ViewOutlineProvider f75155;

    /* JADX INFO: renamed from: ۫ */
    public RectF f75156;

    /* JADX INFO: renamed from: ۬ */
    public Path f75157;

    /* JADX INFO: renamed from: ᩶ */
    public LayerDrawable f75158;

    /* JADX INFO: renamed from: ᩸ */
    public float f75159;

    /* JADX INFO: renamed from: ᩹ */
    public C1006 f75160;

    public C1951(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75160 = new C1006();
        this.f75159 = 0.0f;
        this.f75153 = 0.0f;
        this.f75154 = Float.NaN;
        this.f75151 = true;
        m52433(attributeSet);
    }

    public C1951(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75160 = new C1006();
        this.f75159 = 0.0f;
        this.f75153 = 0.0f;
        this.f75154 = Float.NaN;
        this.f75151 = true;
        m52433(attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52433(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72690);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f75159 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C1006 c1006 = this.f75160;
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
                            this.f75154 = dimension;
                            float f = this.f75153;
                            this.f75153 = -1.0f;
                            m52435(f);
                        } else {
                            boolean z = this.f75154 != dimension;
                            this.f75154 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f75157 == null) {
                                    this.f75157 = new Path();
                                }
                                if (this.f75156 == null) {
                                    this.f75156 = new RectF();
                                }
                                if (this.f75155 == null) {
                                    C1916 c1916 = new C1916(this);
                                    this.f75155 = c1916;
                                    setOutlineProvider(c1916);
                                }
                                setClipToOutline(true);
                                this.f75156.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f75157.reset();
                                Path path = this.f75157;
                                RectF rectF = this.f75156;
                                float f2 = this.f75154;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m52435(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f75151 = typedArrayObtainStyledAttributes.getBoolean(index, this.f75151);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f75152 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f75152[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f75152);
                this.f75158 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f75159 * 255.0f));
                super.setImageDrawable(this.f75158);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52435(float f) {
        boolean z = this.f75153 != f;
        this.f75153 = f;
        if (f != 0.0f) {
            if (this.f75157 == null) {
                this.f75157 = new Path();
            }
            if (this.f75156 == null) {
                this.f75156 = new RectF();
            }
            if (this.f75155 == null) {
                C1601 c1601 = new C1601(this);
                this.f75155 = c1601;
                setOutlineProvider(c1601);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f75153) / 2.0f;
            this.f75156.set(0.0f, 0.0f, width, height);
            this.f75157.reset();
            this.f75157.addRoundRect(this.f75156, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
