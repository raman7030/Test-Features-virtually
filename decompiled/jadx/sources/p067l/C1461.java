package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.۫ܶ */
/* JADX INFO: compiled from: A1AT */
/* JADX INFO: loaded from: classes3.dex */
public class C1461 extends View {

    /* JADX INFO: renamed from: ۗ */
    public Paint f40518;

    /* JADX INFO: renamed from: ۙ */
    public int f40519;

    /* JADX INFO: renamed from: ۛ */
    public int f40520;

    /* JADX INFO: renamed from: ۤ */
    public String f40521;

    /* JADX INFO: renamed from: ۨ */
    public Rect f40522;

    /* JADX INFO: renamed from: ۫ */
    public Paint f40523;

    /* JADX INFO: renamed from: ۬ */
    public Paint f40524;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f40525;

    /* JADX INFO: renamed from: ᩸ */
    public int f40526;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f40527;

    /* JADX INFO: renamed from: ᩺ */
    public int f40528;

    public C1461(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40518 = new Paint();
        this.f40524 = new Paint();
        this.f40523 = new Paint();
        this.f40527 = true;
        this.f40525 = true;
        this.f40521 = null;
        this.f40522 = new Rect();
        this.f40526 = Color.argb(255, 0, 0, 0);
        this.f40528 = Color.argb(255, 200, 200, 200);
        this.f40520 = Color.argb(255, 50, 50, 50);
        this.f40519 = 4;
        m32700(context, attributeSet);
    }

    public C1461(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40518 = new Paint();
        this.f40524 = new Paint();
        this.f40523 = new Paint();
        this.f40527 = true;
        this.f40525 = true;
        this.f40521 = null;
        this.f40522 = new Rect();
        this.f40526 = Color.argb(255, 0, 0, 0);
        this.f40528 = Color.argb(255, 200, 200, 200);
        this.f40520 = Color.argb(255, 50, 50, 50);
        this.f40519 = 4;
        m32700(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32700(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72680);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f40521 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f40527 = typedArrayObtainStyledAttributes.getBoolean(index, this.f40527);
                } else if (index == 0) {
                    this.f40526 = typedArrayObtainStyledAttributes.getColor(index, this.f40526);
                } else if (index == 2) {
                    this.f40520 = typedArrayObtainStyledAttributes.getColor(index, this.f40520);
                } else if (index == 3) {
                    this.f40528 = typedArrayObtainStyledAttributes.getColor(index, this.f40528);
                } else if (index == 5) {
                    this.f40525 = typedArrayObtainStyledAttributes.getBoolean(index, this.f40525);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f40521 == null) {
            try {
                this.f40521 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.f40526;
        Paint paint = this.f40518;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.f40528;
        Paint paint2 = this.f40524;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.f40523.setColor(this.f40520);
        this.f40519 = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f40519);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f40527) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f40518);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f40518);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f40518);
            canvas.drawLine(f, 0.0f, f, f2, this.f40518);
            canvas.drawLine(f, f2, 0.0f, f2, this.f40518);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f40518);
        }
        String str = this.f40521;
        if (str == null || !this.f40525) {
            return;
        }
        int length = str.length();
        Paint paint = this.f40524;
        Rect rect = this.f40522;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.f40519;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(rect, this.f40523);
        canvas.drawText(this.f40521, fWidth, fHeight, paint);
    }
}
