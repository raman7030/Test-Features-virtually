package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۤܶ */
/* JADX INFO: compiled from: C19N */
/* JADX INFO: loaded from: classes3.dex */
public class C1356 extends C1461 {

    /* JADX INFO: renamed from: ֫֫ */
    public Paint f34142;

    /* JADX INFO: renamed from: ۟ */
    public C1342 f34143;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f34144;

    /* JADX INFO: renamed from: ܰ */
    public Matrix f34145;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f34146;

    /* JADX INFO: renamed from: ܿ֫ */
    public float[] f34147;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f34148;

    public C1356(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34142 = new Paint();
        this.f34147 = new float[2];
        this.f34145 = new Matrix();
        this.f34148 = 0;
        this.f34144 = -65281;
        this.f34146 = 0.25f;
        m28195(context, attributeSet);
    }

    public C1356(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34142 = new Paint();
        this.f34147 = new float[2];
        this.f34145 = new Matrix();
        this.f34148 = 0;
        this.f34144 = -65281;
        this.f34146 = 0.25f;
        m28195(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28195(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72684);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f34144 = typedArrayObtainStyledAttributes.getColor(index, this.f34144);
                } else if (index == 2) {
                    this.f34148 = typedArrayObtainStyledAttributes.getInt(index, this.f34148);
                } else if (index == 1) {
                    this.f34146 = typedArrayObtainStyledAttributes.getFloat(index, this.f34146);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f34144;
        Paint paint = this.f34142;
        paint.setColor(i2);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    @Override // p067l.C1461, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = this.f34145;
        matrix.invert(matrix2);
        if (this.f34143 == null) {
            ViewParent parent = getParent();
            if (parent instanceof C1342) {
                this.f34143 = (C1342) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f34143.m27335(this, f2, f, this.f34147, this.f34148);
                float[] fArr2 = this.f34147;
                matrix2.mapVectors(fArr2);
                float f3 = width * f2;
                float f4 = height * f;
                float f5 = fArr2[0];
                float f6 = this.f34146;
                float f7 = f4 - (fArr2[1] * f6);
                matrix2.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f34142);
            }
        }
    }
}
