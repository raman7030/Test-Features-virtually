package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C19N */
/* JADX INFO: loaded from: classes3.dex */
public class C10362 extends C12478 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Paint f31180;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10075 f31181;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f31182;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Matrix f31183;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f31184;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float[] f31185;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f31186;

    public C10362(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31180 = new Paint();
        this.f31185 = new float[2];
        this.f31183 = new Matrix();
        this.f31186 = 0;
        this.f31182 = -65281;
        this.f31184 = 0.25f;
        m26167(context, attributeSet);
    }

    public C10362(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31180 = new Paint();
        this.f31185 = new float[2];
        this.f31183 = new Matrix();
        this.f31186 = 0;
        this.f31182 = -65281;
        this.f31184 = 0.25f;
        m26167(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26167(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69975);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f31182 = typedArrayObtainStyledAttributes.getColor(index, this.f31182);
                } else if (index == 2) {
                    this.f31186 = typedArrayObtainStyledAttributes.getInt(index, this.f31186);
                } else if (index == 1) {
                    this.f31184 = typedArrayObtainStyledAttributes.getFloat(index, this.f31184);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f31182;
        Paint paint = this.f31180;
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

    @Override // l.C12478, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = this.f31183;
        matrix.invert(matrix2);
        if (this.f31181 == null) {
            ViewParent parent = getParent();
            if (parent instanceof C10075) {
                this.f31181 = (C10075) parent;
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
                this.f31181.m25316(this, f2, f, this.f31185, this.f31186);
                float[] fArr2 = this.f31185;
                matrix2.mapVectors(fArr2);
                float f3 = width * f2;
                float f4 = height * f;
                float f5 = fArr2[0];
                float f6 = this.f31184;
                float f7 = f4 - (fArr2[1] * f6);
                matrix2.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f31180);
            }
        }
    }
}
