package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩷ */
/* JADX INFO: compiled from: M5HH */
/* JADX INFO: loaded from: classes4.dex */
public class C1609 extends FrameLayout {

    /* JADX INFO: renamed from: ۗ */
    public boolean f50461;

    /* JADX INFO: renamed from: ۙ */
    public int f50462;

    /* JADX INFO: renamed from: ۛ */
    public Drawable f50463;

    /* JADX INFO: renamed from: ۤ */
    public Drawable f50464;

    /* JADX INFO: renamed from: ۫ */
    public boolean f50465;

    /* JADX INFO: renamed from: ۬ */
    public boolean f50466;

    /* JADX INFO: renamed from: ᩶ */
    public View f50467;

    /* JADX INFO: renamed from: ᩸ */
    public View f50468;

    /* JADX INFO: renamed from: ᩹ */
    public Drawable f50469;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public C1609(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1259(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1010.f13503);
        boolean z = false;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f50469 = drawable;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f50463 = drawable2;
        this.f50462 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.MT_Protector) {
            this.f50461 = true;
            this.f50464 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f50461 ? !(drawable != null || drawable2 != null) : this.f50464 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f50468 = findViewById(R.id.MT_Protector);
        this.f50467 = findViewById(R.id.MT_Protector);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f50469;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f50463;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f50464;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f50469;
        boolean z = this.f50461;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f50463 && this.f50466) {
            return true;
        }
        return (drawable == this.f50464 && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f50469;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
        Drawable drawable2 = this.f50463;
        if (drawable2 != null && drawable2.isStateful()) {
            drawable2.setState(getDrawableState());
        }
        Drawable drawable3 = this.f50464;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        drawable3.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f50469;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f50463;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f50464;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38708(boolean z) {
        this.f50465 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f50465 || super.onInterceptTouchEvent(motionEvent);
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
        if (this.f50468 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f50462) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f50468 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f50461) {
            Drawable drawable = this.f50464;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            Drawable drawable2 = this.f50469;
            if (drawable2 == null) {
                z2 = false;
            } else if (this.f50468.getVisibility() == 0) {
                drawable2.setBounds(this.f50468.getLeft(), this.f50468.getTop(), this.f50468.getRight(), this.f50468.getBottom());
            } else {
                View view = this.f50467;
                if (view != null && view.getVisibility() == 0) {
                    drawable2.setBounds(this.f50467.getLeft(), this.f50467.getTop(), this.f50467.getRight(), this.f50467.getBottom());
                } else {
                    drawable2.setBounds(0, 0, 0, 0);
                }
            }
            this.f50466 = false;
        }
        if (z2) {
            invalidate();
        }
    }
}
