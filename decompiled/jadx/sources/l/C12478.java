package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1AT */
/* JADX INFO: loaded from: classes3.dex */
public class C12478 extends View {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Paint f37495;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f37496;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f37497;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f37498;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Rect f37499;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Paint f37500;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Paint f37501;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37502;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f37503;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f37504;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f37505;

    public C12478(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37495 = new Paint();
        this.f37501 = new Paint();
        this.f37500 = new Paint();
        this.f37504 = true;
        this.f37502 = true;
        this.f37498 = null;
        this.f37499 = new Rect();
        this.f37503 = Color.argb(255, 0, 0, 0);
        this.f37505 = Color.argb(255, 200, 200, 200);
        this.f37497 = Color.argb(255, 50, 50, 50);
        this.f37496 = 4;
        m30635(context, attributeSet);
    }

    public C12478(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37495 = new Paint();
        this.f37501 = new Paint();
        this.f37500 = new Paint();
        this.f37504 = true;
        this.f37502 = true;
        this.f37498 = null;
        this.f37499 = new Rect();
        this.f37503 = Color.argb(255, 0, 0, 0);
        this.f37505 = Color.argb(255, 200, 200, 200);
        this.f37497 = Color.argb(255, 50, 50, 50);
        this.f37496 = 4;
        m30635(context, attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30635(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69971);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f37498 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f37504 = typedArrayObtainStyledAttributes.getBoolean(index, this.f37504);
                } else if (index == 0) {
                    this.f37503 = typedArrayObtainStyledAttributes.getColor(index, this.f37503);
                } else if (index == 2) {
                    this.f37497 = typedArrayObtainStyledAttributes.getColor(index, this.f37497);
                } else if (index == 3) {
                    this.f37505 = typedArrayObtainStyledAttributes.getColor(index, this.f37505);
                } else if (index == 5) {
                    this.f37502 = typedArrayObtainStyledAttributes.getBoolean(index, this.f37502);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f37498 == null) {
            try {
                this.f37498 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.f37503;
        Paint paint = this.f37495;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.f37505;
        Paint paint2 = this.f37501;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.f37500.setColor(this.f37497);
        this.f37496 = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f37496);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f37504) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f37495);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f37495);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f37495);
            canvas.drawLine(f, 0.0f, f, f2, this.f37495);
            canvas.drawLine(f, f2, 0.0f, f2, this.f37495);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f37495);
        }
        String str = this.f37498;
        if (str == null || !this.f37502) {
            return;
        }
        int length = str.length();
        Paint paint = this.f37501;
        Rect rect = this.f37499;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.f37496;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(rect, this.f37500);
        canvas.drawText(this.f37498, fWidth, fHeight, paint);
    }
}
