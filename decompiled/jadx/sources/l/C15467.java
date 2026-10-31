package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M5HH */
/* JADX INFO: loaded from: classes4.dex */
public class C15467 extends FrameLayout {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f47330;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47331;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Drawable f47332;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Drawable f47333;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f47334;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f47335;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f47336;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f47337;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f47338;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public C15467(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C8413(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10696);
        boolean z = false;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f47338 = drawable;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f47332 = drawable2;
        this.f47331 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.MT_Protector) {
            this.f47330 = true;
            this.f47333 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f47330 ? !(drawable != null || drawable2 != null) : this.f47333 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f47337 = findViewById(R.id.MT_Protector);
        this.f47336 = findViewById(R.id.MT_Protector);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f47338;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f47332;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f47333;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f47338;
        boolean z = this.f47330;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f47332 && this.f47335) {
            return true;
        }
        return (drawable == this.f47333 && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f47338;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
        Drawable drawable2 = this.f47332;
        if (drawable2 != null && drawable2.isStateful()) {
            drawable2.setState(getDrawableState());
        }
        Drawable drawable3 = this.f47333;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        drawable3.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f47338;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f47332;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f47333;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36549(boolean z) {
        this.f47334 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f47334 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f47337 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f47331) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f47337 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f47330) {
            Drawable drawable = this.f47333;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            Drawable drawable2 = this.f47338;
            if (drawable2 == null) {
                z2 = false;
            } else if (this.f47337.getVisibility() == 0) {
                drawable2.setBounds(this.f47337.getLeft(), this.f47337.getTop(), this.f47337.getRight(), this.f47337.getBottom());
            } else {
                View view = this.f47336;
                if (view != null && view.getVisibility() == 0) {
                    drawable2.setBounds(this.f47336.getLeft(), this.f47336.getTop(), this.f47336.getRight(), this.f47336.getBottom());
                } else {
                    drawable2.setBounds(0, 0, 0, 0);
                }
            }
            this.f47335 = false;
        }
        if (z2) {
            invalidate();
        }
    }
}
