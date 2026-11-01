package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۟᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U5 */
/* JADX INFO: loaded from: classes3.dex */
public class C9763 extends C18221 {

    /* JADX INFO: renamed from: ۖ֫ */
    public int f26948;

    /* JADX INFO: renamed from: ۘ֫ */
    public final Paint f26949;

    /* JADX INFO: renamed from: ۜ֫ */
    public float f26950;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f26951;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f26952;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f26953;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f26954;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f26955;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f26956;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f26957;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final Rect f26958;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f26959;

    /* JADX INFO: renamed from: ᩷֫ */
    public float f26960;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f26961;

    public C9763(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f26949 = paint;
        this.f26958 = new Rect();
        this.f26954 = 255;
        this.f26955 = false;
        int i = this.f54385;
        this.f26953 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f26961 = (int) ((3.0f * f) + 0.5f);
        this.f26952 = (int) ((6.0f * f) + 0.5f);
        int i2 = (int) (64.0f * f);
        this.f26948 = (int) ((16.0f * f) + 0.5f);
        this.f26957 = (int) ((1.0f * f) + 0.5f);
        this.f26951 = (int) ((f * 32.0f) + 0.5f);
        this.f26959 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int iM41446 = m41446();
        super.m41443(iM41446 >= i2 ? iM41446 : i2);
        setWillNotDraw(false);
        this.f54384.setFocusable(true);
        this.f54384.setOnClickListener(new ViewOnClickListenerC24515(this));
        this.f54380.setFocusable(true);
        this.f54380.setOnClickListener(new ViewOnClickListenerC15797(this));
        if (getBackground() == null) {
            this.f26955 = true;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f26952;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.f26955 = drawable == null;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.f26955 = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        this.f26955 = i == 0;
    }

    @Override // p067l.C18221
    /* JADX INFO: renamed from: ֫ */
    public final int mo22786() {
        return Math.max(super.mo22786(), this.f26951);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f26956) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f26950 = x;
            this.f26960 = y;
            this.f26956 = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f54390;
            int left = textView.getLeft();
            int i = this.f26948;
            if (x < left - i) {
                C2798 c2798 = this.f54386;
                c2798.m4420(c2798.f4765 - 1);
                return true;
            }
            if (x > textView.getRight() + i) {
                C2798 c2799 = this.f54386;
                c2799.m4420(c2799.f4765 + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x - this.f26950);
            float f = this.f26959;
            if (fAbs > f || Math.abs(y - this.f26960) > f) {
                this.f26956 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f54390;
        int left = textView.getLeft();
        int i = this.f26948;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.f26961;
        int i4 = this.f26954 << 24;
        int i5 = this.f26953;
        Paint paint = this.f26949;
        paint.setColor(i4 | (i5 & 16777215));
        float f = right;
        float f2 = height;
        canvas.drawRect(i2, i3, f, f2, paint);
        if (this.f26955) {
            paint.setColor((-16777216) | (i5 & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f26957, getWidth() - getPaddingRight(), f2, paint);
        }
    }

    @Override // p067l.C18221
    /* JADX INFO: renamed from: ֫ */
    public final void mo22787(float f, boolean z, int i) {
        int height = getHeight();
        TextView textView = this.f54390;
        int left = textView.getLeft();
        int i2 = this.f26948;
        int right = textView.getRight() + i2;
        int i3 = height - this.f26961;
        Rect rect = this.f26958;
        rect.set(left - i2, i3, right, height);
        super.mo22787(f, z, i);
        this.f26954 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
        invalidate(rect);
    }
}
