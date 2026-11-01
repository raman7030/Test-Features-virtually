package p067l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨᩷ */
/* JADX INFO: compiled from: 64NR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0909 extends ViewGroup {

    /* JADX INFO: renamed from: ۗ */
    public C1278 f7688;

    /* JADX INFO: renamed from: ۙ */
    public boolean f7689;

    /* JADX INFO: renamed from: ۤ */
    public C1612 f7690;

    /* JADX INFO: renamed from: ۫ */
    public final C1119 f7691;

    /* JADX INFO: renamed from: ۬ */
    public final Context f7692;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f7693;

    /* JADX INFO: renamed from: ᩸ */
    public C1698 f7694;

    /* JADX INFO: renamed from: ᩹ */
    public int f7695;

    public AbstractC0909(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0909(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7691 = new C1119(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true) && typedValue.resourceId != 0) {
            this.f7692 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f7692 = context;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C1010.f13503, R.attr.MT_Protector, 0);
        mo6960(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1698 c1698 = this.f7694;
        if (c1698 != null) {
            c1698.m42800();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7689 = false;
        }
        if (!this.f7689) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f7689 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f7689 = false;
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7693 = false;
        }
        if (!this.f7693) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f7693 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f7693 = false;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6960(int i) {
        this.f7695 = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1612 c1612 = this.f7690;
            if (c1612 != null) {
                c1612.m38758();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m6957(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m6956(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iM21912 = C9417.m21912(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iM21912, i, measuredHeight + iM21912);
        } else {
            view.layout(i, iM21912, i + measuredWidth, measuredHeight + iM21912);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
