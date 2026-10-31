package l;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes2.dex */
public class C2978 extends CompoundButton {
    public static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    public static final int MONOSPACE = 3;
    public static final int SANS = 1;
    public static final int SERIF = 2;
    public static final int THUMB_ANIMATION_DURATION = 250;
    public static final int TOUCH_MODE_DOWN = 1;
    public static final int TOUCH_MODE_DRAGGING = 2;
    public static final int TOUCH_MODE_IDLE = 0;
    public C7376 mAppCompatEmojiTextHelper;
    public C4389 mEmojiCompatInitCallback;
    public boolean mEnforceSwitchWidth;
    public boolean mHasThumbTint;
    public boolean mHasThumbTintMode;
    public boolean mHasTrackTint;
    public boolean mHasTrackTintMode;
    public int mMinFlingVelocity;
    public Layout mOffLayout;
    public Layout mOnLayout;
    public ObjectAnimator mPositionAnimator;
    public boolean mShowText;
    public boolean mSplitTrack;
    public int mSwitchBottom;
    public int mSwitchHeight;
    public int mSwitchLeft;
    public int mSwitchMinWidth;
    public int mSwitchPadding;
    public int mSwitchRight;
    public int mSwitchTop;
    public TransformationMethod mSwitchTransformationMethod;
    public int mSwitchWidth;
    public final Rect mTempRect;
    public ColorStateList mTextColors;
    public final C1916 mTextHelper;
    public CharSequence mTextOff;
    public CharSequence mTextOffTransformed;
    public CharSequence mTextOn;
    public CharSequence mTextOnTransformed;
    public final TextPaint mTextPaint;
    public Drawable mThumbDrawable;
    public float mThumbPosition;
    public int mThumbTextPadding;
    public ColorStateList mThumbTintList;
    public PorterDuff.Mode mThumbTintMode;
    public int mThumbWidth;
    public int mTouchMode;
    public int mTouchSlop;
    public float mTouchX;
    public float mTouchY;
    public Drawable mTrackDrawable;
    public ColorStateList mTrackTintList;
    public PorterDuff.Mode mTrackTintMode;
    public VelocityTracker mVelocityTracker;
    public static final Property THUMB_POS = new C19912(Float.class, "thumbPos");
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m9086(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public C2978(Context context) {
        this(context, null);
    }

    public C2978(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C2978(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        C12855.m31289(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C3390.f10700;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, c22733M50796.m50810(), i);
        Drawable drawableM50815 = c22733M50796.m50815(2);
        this.mThumbDrawable = drawableM50815;
        if (drawableM50815 != null) {
            drawableM50815.setCallback(this);
        }
        Drawable drawableM50816 = c22733M50796.m50815(11);
        this.mTrackDrawable = drawableM50816;
        if (drawableM50816 != null) {
            drawableM50816.setCallback(this);
        }
        m9103(c22733M50796.m50817(0));
        m9100(c22733M50796.m50817(1));
        this.mShowText = c22733M50796.m50801(3, true);
        this.mThumbTextPadding = c22733M50796.m50803(8, 0);
        this.mSwitchMinWidth = c22733M50796.m50803(5, 0);
        this.mSwitchPadding = c22733M50796.m50803(6, 0);
        this.mSplitTrack = c22733M50796.m50801(4, false);
        ColorStateList colorStateListM50804 = c22733M50796.m50804(9);
        if (colorStateListM50804 != null) {
            this.mThumbTintList = colorStateListM50804;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode modeM36346 = C15320.m36346(c22733M50796.m50809(10, -1), null);
        if (this.mThumbTintMode != modeM36346) {
            this.mThumbTintMode = modeM36346;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            m9088();
        }
        ColorStateList colorStateListM50805 = c22733M50796.m50804(12);
        if (colorStateListM50805 != null) {
            this.mTrackTintList = colorStateListM50805;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode modeM36347 = C15320.m36346(c22733M50796.m50809(13, -1), null);
        if (this.mTrackTintMode != modeM36347) {
            this.mTrackTintMode = modeM36347;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            m9096();
        }
        int iM50806 = c22733M50796.m50806(7, 0);
        if (iM50806 != 0) {
            setSwitchTextAppearance(context, iM50806);
        }
        C1916 c1916 = new C1916(this);
        this.mTextHelper = c1916;
        c1916.m6321(attributeSet, i);
        c22733M50796.m50813();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        m9102().m19826(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(Context context, int i) {
        C22733 c22733M50794 = C22733.m50794(context, i, C3390.f10698);
        ColorStateList colorStateListM50804 = c22733M50794.m50804(3);
        if (colorStateListM50804 != null) {
            this.mTextColors = colorStateListM50804;
        } else {
            this.mTextColors = getTextColors();
        }
        int iM50803 = c22733M50794.m50803(0, 0);
        if (iM50803 != 0) {
            float f = iM50803;
            if (f != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f);
                requestLayout();
            }
        }
        m9089(c22733M50794.m50809(1, -1), c22733M50794.m50809(2, -1));
        if (c22733M50794.m50801(14, false)) {
            this.mSwitchTransformationMethod = new C22607(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        m9103(this.mTextOn);
        m9100(this.mTextOff);
        c22733M50794.m50813();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9089(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i2);
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (i > 0) {
            if (typeface == null) {
                typefaceCreate = Typeface.defaultFromStyle(i);
            } else {
                typefaceCreate = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typefaceCreate);
            int i2 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i;
            this.mTextPaint.setFakeBoldText((i2 & 1) != 0);
            this.mTextPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C21311.m48345(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        m9096();
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        m9096();
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9096() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable drawableMutate = C8184.m21684(drawable).mutate();
                this.mTrackDrawable = drawableMutate;
                if (this.mHasTrackTint) {
                    C8184.m21676(drawableMutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    C8184.m21679(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C21311.m48345(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        m9088();
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        m9088();
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9088() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable drawableMutate = C8184.m21684(drawable).mutate();
                this.mThumbDrawable = drawableMutate;
                if (this.mHasThumbTint) {
                    C8184.m21676(drawableMutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    C8184.m21679(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m9103(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = m9087(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            m9094();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        m9103(charSequence);
        requestLayout();
        if (isChecked()) {
            m9104();
        }
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9100(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = m9087(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            m9094();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        m9100(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m9093();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private CharSequence m9087(CharSequence charSequence) {
        TransformationMethod transformationMethodM19825 = m9102().m19825(this.mSwitchTransformationMethod);
        return transformationMethodM19825 != null ? transformationMethodM19825.getTransformation(charSequence, this) : charSequence;
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
            if (z) {
                m9094();
            }
        }
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int iMax2;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = m9095(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = m9095(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.mShowText) {
            iMax = (this.mThumbTextPadding * 2) + Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth());
        } else {
            iMax = 0;
        }
        this.mThumbWidth = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax3 = rect.left;
        int iMax4 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect rectM36348 = C15320.m36348(drawable3);
            iMax3 = Math.max(iMax3, rectM36348.left);
            iMax4 = Math.max(iMax4, rectM36348.right);
        }
        if (this.mEnforceSwitchWidth) {
            iMax2 = Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + iMax3 + iMax4);
        } else {
            iMax2 = this.mSwitchMinWidth;
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax2;
        this.mSwitchHeight = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Layout m9095(CharSequence charSequence) {
        TextPaint textPaint = this.mTextPaint;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m9092(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int iM9098 = m9098();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop;
        int i2 = this.mTouchSlop;
        int i3 = i - i2;
        int i4 = (this.mSwitchLeft + iM9098) - i2;
        int i5 = this.mThumbWidth + i4;
        Rect rect = this.mTempRect;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.mSwitchBottom + i2));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (isEnabled() && m9092(x, y)) {
                this.mTouchMode = 1;
                this.mTouchX = x;
                this.mTouchY = y;
            }
        } else if (actionMasked == 1) {
            if (this.mTouchMode == 2) {
                m9097(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        } else if (actionMasked == 2) {
            int i = this.mTouchMode;
            if (i == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.mTouchX) > this.mTouchSlop || Math.abs(y2 - this.mTouchY) > this.mTouchSlop) {
                    this.mTouchMode = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.mTouchX = x2;
                    this.mTouchY = y2;
                    return true;
                }
            } else if (i == 2) {
                float x3 = motionEvent.getX();
                int iM9105 = m9105();
                float f2 = x3 - this.mTouchX;
                if (iM9105 != 0) {
                    f = f2 / iM9105;
                } else {
                    f = f2 > 0.0f ? 1.0f : -1.0f;
                }
                int i2 = C22461.f72738;
                if (getLayoutDirection() == 1) {
                    f = -f;
                }
                float fM9086 = m9086(this.mThumbPosition + f, 0.0f, 1.0f);
                if (fM9086 != this.mThumbPosition) {
                    this.mTouchX = x3;
                    setThumbPosition(fM9086);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.mTouchMode == 2) {
                m9097(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9090(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9097(MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean zM9101 = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) > this.mMinFlingVelocity) {
                int i = C22461.f72738;
                if (getLayoutDirection() != 1 ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    zM9101 = false;
                }
            } else {
                zM9101 = m9101();
            }
        } else {
            zM9101 = zIsChecked;
        }
        if (zM9101 != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(zM9101);
        m9090(motionEvent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9091(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C2978, Float>) THUMB_POS, z ? 1.0f : 0.0f);
        this.mPositionAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9099() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m9101() {
        return this.mThumbPosition > 0.5f;
    }

    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m9104();
        } else {
            m9093();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m9091(zIsChecked);
        } else {
            m9099();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM36348 = C15320.m36348(this.mThumbDrawable);
            iMax = Math.max(0, rectM36348.left - rect.left);
            iMax2 = Math.max(0, rectM36348.right - rect.right);
        } else {
            iMax = 0;
        }
        int i5 = C22461.f72738;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.mSwitchWidth + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.mSwitchWidth) + iMax + iMax2;
        }
        int gravity = getGravity() & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i6 = this.mSwitchHeight;
            int i7 = height2 - (i6 / 2);
            height = i6 + i7;
            paddingTop = i7;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.mSwitchHeight + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.mSwitchHeight;
        }
        this.mSwitchLeft = paddingLeft;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = height;
        this.mSwitchRight = width;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rectM36348;
        int i;
        int i2;
        Rect rect = this.mTempRect;
        int i3 = this.mSwitchLeft;
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchRight;
        int i6 = this.mSwitchBottom;
        int iM9098 = m9098() + i3;
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            rectM36348 = C15320.m36348(drawable);
        } else {
            rectM36348 = C15320.f46973;
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            iM9098 += i7;
            if (rectM36348 != null) {
                int i8 = rectM36348.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM36348.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM36348.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM36348.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.mTrackDrawable.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.mTrackDrawable.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = iM9098 - rect.left;
            int i16 = iM9098 + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C8184.m21675(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop;
        int i2 = this.mSwitchBottom;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mSplitTrack && drawable2 != null) {
                Rect rectM36348 = C15320.m36348(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM36348.left;
                rect.right -= rectM36348.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = m9101() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int i = C22461.f72738;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        int i = C22461.f72738;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m9098() {
        float f;
        int i = C22461.f72738;
        if (getLayoutDirection() == 1) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return (int) ((f * m9105()) + 0.5f);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m9105() {
        Rect rectM36348;
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            rectM36348 = C15320.m36348(drawable2);
        } else {
            rectM36348 = C15320.f46973;
        }
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - rectM36348.left) - rectM36348.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            C8184.m21674(drawable, f, f2);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            C8184.m21674(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4330.m12987(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4330.m12986(super.getCustomSelectionActionModeCallback());
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.mEnforceSwitchWidth = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m9104() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOn;
            if (string == null) {
                string = getResources().getString(bin.mt.plus.R.string.MT_Protector);
            }
            C17648.m41316(this, string);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m9093() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOff;
            if (string == null) {
                string = getResources().getString(bin.mt.plus.R.string.MT_Protector);
            }
            C17648.m41316(this, string);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m9102().m19827(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m9102().m19829(inputFilterArr));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C7376 m9102() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C7376(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    public void setEmojiCompatEnabled(boolean z) {
        m9102().m19830(z);
        m9103(this.mTextOn);
        m9100(this.mTextOff);
        requestLayout();
    }

    public boolean isEmojiCompatEnabled() {
        return m9102().m19828();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m9094() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.m19828() && C6921.m18716()) {
            C6921 c6921M18717 = C6921.m18717();
            int iM18718 = c6921M18717.m18718();
            if (iM18718 == 3 || iM18718 == 0) {
                C4389 c4389 = new C4389(this);
                this.mEmojiCompatInitCallback = c4389;
                c6921M18717.m18722(c4389);
            }
        }
    }

    public void onEmojiCompatInitializedForSwitchText() {
        m9103(this.mTextOn);
        m9100(this.mTextOff);
        requestLayout();
    }
}
