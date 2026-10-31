package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 64NR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1357 extends ViewGroup {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8788 f4916;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f4917;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15530 f4918;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5591 f4919;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Context f4920;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f4921;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17254 f4922;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f4923;

    public AbstractC1357(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC1357(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4919 = new C5591(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true) && typedValue.resourceId != 0) {
            this.f4920 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f4920 = context;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C3390.f10696, R.attr.MT_Protector, 0);
        mo4722(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C17254 c17254 = this.f4922;
        if (c17254 != null) {
            c17254.m40551();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4917 = false;
        }
        if (!this.f4917) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4917 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4917 = false;
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4921 = false;
        }
        if (!this.f4921) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4921 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4921 = false;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4722(int i) {
        this.f4923 = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C15530 c15530 = this.f4918;
            if (c15530 != null) {
                c15530.m36598();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4719(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4718(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iM19938 = C7416.m19938(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iM19938, i, measuredHeight + iM19938);
        } else {
            view.layout(i, iM19938, i + measuredWidth, measuredHeight + iM19938);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
