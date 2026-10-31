package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;
import l.C0881;
import l.C13847;
import l.C14369;
import l.C14402;
import l.C15813;
import l.C16445;
import l.C16486;
import l.C17648;
import l.C17898;
import l.C17931;
import l.C18637;
import l.C19343;
import l.C20754;
import l.C23575;

/* JADX INFO: loaded from: classes.dex */
public class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    public static final float EPSILON = 0.001f;
    public static final int INITIAL_CAPACITY = 12;
    public static final String VALUE_PLACEHOLDER = "";
    public final int clockHandPadding;
    public final ClockHandView clockHandView;
    public final int clockSize;
    public float currentHandRotation;
    public final int[] gradientColors;
    public final float[] gradientPositions;
    public final int minimumHeight;
    public final int minimumWidth;
    public final RectF scratch;
    public final Rect scratchLineBounds;
    public final ColorStateList textColor;
    public final SparseArray textViewPool;
    public final Rect textViewRect;
    public final C16445 valueAccessibilityDelegate;
    public String[] values;

    public ClockFaceView(Context context) {
        this(context, null);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55868);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19343.f61450, i, C18637.f58053);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f62462);
        this.textColor = colorStateList;
        LayoutInflater.from(context).inflate(C15813.f48876, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C20754.f66843);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(C23575.f76366);
        int colorForState = colorStateList.getColorForState(new int[]{R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = C0881.m3233(context, C14402.f43467).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f61982);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.clockHandView.getSelectorRadius()) - ClockFaceView.this.clockHandPadding);
                return true;
            }
        });
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.valueAccessibilityDelegate = new C16445() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // l.C16445
            public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
                super.onInitializeAccessibilityNodeInfo(view, c14369);
                int iIntValue = ((Integer) view.getTag(C20754.f67064)).intValue();
                if (iIntValue > 0) {
                    c14369.m34322((View) ClockFaceView.this.textViewPool.get(iIntValue - 1));
                }
                c14369.m34286(C17898.m41877(0, 1, iIntValue, 1, false, view.isSelected()));
                c14369.m34329(true);
                c14369.m34283(C13847.f41301);
            }

            @Override // l.C16445
            public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
                if (i2 == 16) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(ClockFaceView.this.textViewRect);
                    float fCenterX = ClockFaceView.this.textViewRect.centerX();
                    float fCenterY = ClockFaceView.this.textViewRect.centerY();
                    ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                    ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                    return true;
                }
                return super.performAccessibilityAction(view, i2, bundle);
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(C23575.f76205);
        this.minimumWidth = resources.getDimensionPixelSize(C23575.f76253);
        this.clockSize = resources.getDimensionPixelSize(C23575.f76319);
    }

    public void setValues(String[] strArr, int i) {
        this.values = strArr;
        updateTextViews(i);
    }

    private void updateTextViews(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.values.length, size); i2++) {
            TextView textView = (TextView) this.textViewPool.get(i2);
            if (i2 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C15813.f48885, (ViewGroup) this, false);
                    this.textViewPool.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.values[i2]);
                textView.setTag(C20754.f67064, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(C20754.f66927, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                C17648.m41309(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.values[i2]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i = 0; i < this.textViewPool.size(); i++) {
            ((TextView) this.textViewPool.get(i)).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C14369.m34264(accessibilityNodeInfo).m34284(C16486.m38850(1, this.values.length, 1, false));
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i) {
        if (i != getRadius()) {
            super.setRadius(i);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    @Override // l.C17606, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        findIntersectingTextView();
    }

    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
        findIntersectingTextView();
    }

    private void findIntersectingTextView() {
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i = 0; i < this.textViewPool.size(); i++) {
            TextView textView = (TextView) this.textViewPool.get(i);
            if (textView != null) {
                textView.setSelected(textView == selectedTextView);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    private TextView getSelectedTextView(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.textViewPool.size(); i++) {
            TextView textView2 = (TextView) this.textViewPool.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float fHeight = this.scratch.height() * this.scratch.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
        }
        return textView;
    }

    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        RectF rectF2 = this.scratch;
        Rect rect = this.scratchLineBounds;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.scratch)) {
            return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
        if (Math.abs(this.currentHandRotation - f) > 0.001f) {
            this.currentHandRotation = f;
            findIntersectingTextView();
        }
    }

    @Override // l.C17606, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824);
        setMeasuredDimension(iMax3, iMax3);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public static float max3(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    public void setCurrentLevel(int i) {
        this.clockHandView.setCurrentLevel(i);
    }
}
