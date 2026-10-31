package l;

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
public class C7780 extends C16680 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f24032;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final Paint f24033;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public float f24034;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f24035;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f24036;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f24037;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f24038;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f24039;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f24040;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f24041;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final Rect f24042;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f24043;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public float f24044;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f24045;

    public C7780(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f24033 = paint;
        this.f24042 = new Rect();
        this.f24038 = 255;
        this.f24039 = false;
        int i = this.f51200;
        this.f24037 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f24045 = (int) ((3.0f * f) + 0.5f);
        this.f24036 = (int) ((6.0f * f) + 0.5f);
        int i2 = (int) (64.0f * f);
        this.f24032 = (int) ((16.0f * f) + 0.5f);
        this.f24041 = (int) ((1.0f * f) + 0.5f);
        this.f24035 = (int) ((f * 32.0f) + 0.5f);
        this.f24043 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int iM39211 = m39211();
        super.m39208(iM39211 >= i2 ? iM39211 : i2);
        setWillNotDraw(false);
        this.f51199.setFocusable(true);
        this.f51199.setOnClickListener(new ViewOnClickListenerC23302(this));
        this.f51195.setFocusable(true);
        this.f51195.setOnClickListener(new ViewOnClickListenerC14129(this));
        if (getBackground() == null) {
            this.f24039 = true;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f24036;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.f24039 = drawable == null;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.f24039 = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        this.f24039 = i == 0;
    }

    @Override // l.C16680
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo20805() {
        return Math.max(super.mo20805(), this.f24035);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f24040) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f24034 = x;
            this.f24044 = y;
            this.f24040 = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f51205;
            int left = textView.getLeft();
            int i = this.f24032;
            if (x < left - i) {
                C0452 c0452 = this.f51201;
                c0452.m2043(c0452.f1989 - 1);
                return true;
            }
            if (x > textView.getRight() + i) {
                C0452 c0453 = this.f51201;
                c0453.m2043(c0453.f1989 + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x - this.f24034);
            float f = this.f24043;
            if (fAbs > f || Math.abs(y - this.f24044) > f) {
                this.f24040 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f51205;
        int left = textView.getLeft();
        int i = this.f24032;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.f24045;
        int i4 = this.f24038 << 24;
        int i5 = this.f24037;
        Paint paint = this.f24033;
        paint.setColor(i4 | (i5 & 16777215));
        float f = right;
        float f2 = height;
        canvas.drawRect(i2, i3, f, f2, paint);
        if (this.f24039) {
            paint.setColor((-16777216) | (i5 & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f24041, getWidth() - getPaddingRight(), f2, paint);
        }
    }

    @Override // l.C16680
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20806(float f, boolean z, int i) {
        int height = getHeight();
        TextView textView = this.f51205;
        int left = textView.getLeft();
        int i2 = this.f24032;
        int right = textView.getRight() + i2;
        int i3 = height - this.f24045;
        Rect rect = this.f24042;
        rect.set(left - i2, i3, right, height);
        super.mo20806(f, z, i);
        this.f24038 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
        invalidate(rect);
    }
}
