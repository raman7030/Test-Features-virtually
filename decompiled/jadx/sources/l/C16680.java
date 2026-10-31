package l;

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
@InterfaceC6803
public class C16680 extends ViewGroup {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final int[] f51193 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f51194 = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f51195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f51196;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f51197;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public WeakReference f51198;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f51199;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51200;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0452 f51201;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1864 f51202;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f51203;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51204;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView f51205;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51206;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f51207;

    public C16680(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51204 = -1;
        this.f51196 = -1.0f;
        this.f51202 = new C1864(this);
        TextView textView = new TextView(context);
        this.f51199 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f51205 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f51195 = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f51193);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C4330.m12997(textView, resourceId);
            C4330.m12997(textView2, resourceId);
            C4330.m12997(textView3, resourceId);
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
        this.f51206 = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        int defaultColor = textView2.getTextColors().getDefaultColor();
        this.f51200 = defaultColor;
        int i = (defaultColor & 16777215) | ((((int) 153.0f) & 255) << 24);
        textView.setTextColor(i);
        textView3.setTextColor(i);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f51194);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            textView.setTransformationMethod(new C11037(textView.getContext()));
            textView2.setTransformationMethod(new C11037(textView2.getContext()));
            textView3.setTransformationMethod(new C11037(textView3.getContext()));
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f51197 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m39208(int i) {
        this.f51197 = i;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39211() {
        return this.f51197;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof C0452)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        C0452 c0452 = (C0452) parent;
        AbstractC12014 abstractC12014 = c0452.f2007;
        C1864 c1864 = this.f51202;
        c0452.m2040(c1864);
        c0452.m2030((InterfaceC15974) c1864);
        this.f51201 = c0452;
        WeakReference weakReference = this.f51198;
        m39210(weakReference != null ? (AbstractC12014) weakReference.get() : null, abstractC12014);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0452 c0452 = this.f51201;
        if (c0452 != null) {
            m39210(c0452.f2007, (AbstractC12014) null);
            this.f51201.m2040((InterfaceC2570) null);
            this.f51201.m2035((InterfaceC15974) this.f51202);
            this.f51201 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39209(int i, AbstractC12014 abstractC12014) {
        int iMo11916 = abstractC12014 != null ? abstractC12014.mo11916() : 0;
        this.f51203 = true;
        CharSequence charSequenceMo11912 = null;
        CharSequence charSequenceMo11913 = (i < 1 || abstractC12014 == null) ? null : abstractC12014.mo11912(i - 1);
        TextView textView = this.f51199;
        textView.setText(charSequenceMo11913);
        CharSequence charSequenceMo11914 = (abstractC12014 == null || i >= iMo11916) ? null : abstractC12014.mo11912(i);
        TextView textView2 = this.f51205;
        textView2.setText(charSequenceMo11914);
        int i2 = i + 1;
        if (i2 < iMo11916 && abstractC12014 != null) {
            charSequenceMo11912 = abstractC12014.mo11912(i2);
        }
        TextView textView3 = this.f51195;
        textView3.setText(charSequenceMo11912);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f51204 = i;
        if (!this.f51207) {
            mo20806(this.f51196, false, i);
        }
        this.f51203 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f51203) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39210(AbstractC12014 abstractC12014, AbstractC12014 abstractC12015) {
        C1864 c1864 = this.f51202;
        if (abstractC12014 != null) {
            abstractC12014.m29382(c1864);
            this.f51198 = null;
        }
        if (abstractC12015 != null) {
            abstractC12015.m29379((DataSetObserver) c1864);
            this.f51198 = new WeakReference(abstractC12015);
        }
        C0452 c0452 = this.f51201;
        if (c0452 != null) {
            this.f51204 = -1;
            this.f51196 = -1.0f;
            m39209(c0452.f1989, abstractC12015);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo20806(float f, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f51204) {
            m39209(i, this.f51201.f2007);
        } else if (!z && f == this.f51196) {
            return;
        }
        this.f51207 = true;
        TextView textView = this.f51199;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f51205;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f51195;
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
        int i14 = this.f51206 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
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
            int iMin = Math.min(paddingLeft, (i9 - this.f51197) - measuredWidth);
            textView.layout(iMin, i3, measuredWidth + iMin, textView.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f51197);
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f51196 = f;
            this.f51207 = false;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f51197) - measuredWidth);
        textView.layout(iMin2, i3, measuredWidth + iMin2, textView.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f51197);
        textView3.layout(iMax4, i5, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.f51196 = f;
        this.f51207 = false;
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
        this.f51199.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f51205;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f51195.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(mo20805(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f51201 != null) {
            float f = this.f51196;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo20806(f, true, this.f51204);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo20805() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }
}
