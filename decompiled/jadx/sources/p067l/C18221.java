package p067l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC8834
public class C18221 extends ViewGroup {

    /* JADX INFO: renamed from: ֫֫ */
    public static final int[] f54378 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: ۧ֫ */
    public static final int[] f54379 = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: ۗ */
    public TextView f54380;

    /* JADX INFO: renamed from: ۙ */
    public float f54381;

    /* JADX INFO: renamed from: ۛ */
    public int f54382;

    /* JADX INFO: renamed from: ۟ */
    public WeakReference f54383;

    /* JADX INFO: renamed from: ۤ */
    public TextView f54384;

    /* JADX INFO: renamed from: ۨ */
    public int f54385;

    /* JADX INFO: renamed from: ۫ */
    public C2798 f54386;

    /* JADX INFO: renamed from: ۬ */
    public final C4140 f54387;

    /* JADX INFO: renamed from: ܰ */
    public boolean f54388;

    /* JADX INFO: renamed from: ᩶ */
    public int f54389;

    /* JADX INFO: renamed from: ᩸ */
    public TextView f54390;

    /* JADX INFO: renamed from: ᩹ */
    public int f54391;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f54392;

    public C18221(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54389 = -1;
        this.f54381 = -1.0f;
        this.f54387 = new C4140(this);
        TextView textView = new TextView(context);
        this.f54384 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f54390 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f54380 = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f54378);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C6483.m14861(textView, resourceId);
            C6483.m14861(textView2, resourceId);
            C6483.m14861(textView3, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            textView.setTextSize(0, f);
            textView2.setTextSize(0, f);
            textView3.setTextSize(0, f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f54391 = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        int defaultColor = textView2.getTextColors().getDefaultColor();
        this.f54385 = defaultColor;
        int i = (defaultColor & 16777215) | ((((int) 153.0f) & 255) << 24);
        textView.setTextColor(i);
        textView3.setTextColor(i);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f54379);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            textView.setTransformationMethod(new C12858(textView.getContext()));
            textView2.setTransformationMethod(new C12858(textView2.getContext()));
            textView3.setTransformationMethod(new C12858(textView3.getContext()));
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f54382 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m41443(int i) {
        this.f54382 = i;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m41446() {
        return this.f54382;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof C2798)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        C2798 c2798 = (C2798) parent;
        AbstractC13787 abstractC13787 = c2798.f4783;
        C4140 c4140 = this.f54387;
        c2798.m4417(c4140);
        c2798.m4407((InterfaceC17550) c4140);
        this.f54386 = c2798;
        WeakReference weakReference = this.f54383;
        m41445(weakReference != null ? (AbstractC13787) weakReference.get() : null, abstractC13787);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2798 c2798 = this.f54386;
        if (c2798 != null) {
            m41445(c2798.f4783, (AbstractC13787) null);
            this.f54386.m4417((InterfaceC4811) null);
            this.f54386.m4412((InterfaceC17550) this.f54387);
            this.f54386 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41444(int i, AbstractC13787 abstractC13787) {
        int iMo13852 = abstractC13787 != null ? abstractC13787.mo13852() : 0;
        this.f54388 = true;
        CharSequence charSequenceMo13848 = null;
        CharSequence charSequenceMo13849 = (i < 1 || abstractC13787 == null) ? null : abstractC13787.mo13848(i - 1);
        TextView textView = this.f54384;
        textView.setText(charSequenceMo13849);
        CharSequence charSequenceMo138410 = (abstractC13787 == null || i >= iMo13852) ? null : abstractC13787.mo13848(i);
        TextView textView2 = this.f54390;
        textView2.setText(charSequenceMo138410);
        int i2 = i + 1;
        if (i2 < iMo13852 && abstractC13787 != null) {
            charSequenceMo13848 = abstractC13787.mo13848(i2);
        }
        TextView textView3 = this.f54380;
        textView3.setText(charSequenceMo13848);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f54389 = i;
        if (!this.f54392) {
            mo22787(this.f54381, false, i);
        }
        this.f54388 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f54388) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41445(AbstractC13787 abstractC13787, AbstractC13787 abstractC13788) {
        C4140 c4140 = this.f54387;
        if (abstractC13787 != null) {
            abstractC13787.m31442(c4140);
            this.f54383 = null;
        }
        if (abstractC13788 != null) {
            abstractC13788.m31439((DataSetObserver) c4140);
            this.f54383 = new WeakReference(abstractC13788);
        }
        C2798 c2798 = this.f54386;
        if (c2798 != null) {
            this.f54389 = -1;
            this.f54381 = -1.0f;
            m41444(c2798.f4765, abstractC13788);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22787(float f, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f54389) {
            m41444(i, this.f54386.f4783);
        } else if (!z && f == this.f54381) {
            return;
        }
        this.f54392 = true;
        TextView textView = this.f54384;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f54390;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f54380;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i11, textView2.getMeasuredHeight() + i12), textView3.getMeasuredHeight() + i13);
        int i14 = this.f54391 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
            } else {
                i2 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
            int iMin = Math.min(paddingLeft, (i9 - this.f54382) - measuredWidth);
            textView.layout(iMin, i3, measuredWidth + iMin, textView.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f54382);
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f54381 = f;
            this.f54392 = false;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f54382) - measuredWidth);
        textView.layout(iMin2, i3, measuredWidth + iMin2, textView.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f54382);
        textView3.layout(iMax4, i5, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.f54381 = f;
        this.f54392 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f54384.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f54390;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f54380.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(mo22786(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f54386 != null) {
            float f = this.f54381;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo22787(f, true, this.f54389);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo22786() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }
}
