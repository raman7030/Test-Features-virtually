package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAKT */
/* JADX INFO: loaded from: classes4.dex */
public class C17183 extends ViewGroup {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f52658;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f52659;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ViewGroup f52660;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f52661;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14615 f52662;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17939 f52663;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f52664;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f52665;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f52666;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f52667;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14615 f52668;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52669;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f52670;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14615 f52671;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14615 f52672;

    public C17183(Context context) {
        super(context);
        this.f52659 = false;
        m40413();
    }

    public C17183(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52659 = false;
        m40413();
    }

    public C17183(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52659 = false;
        m40413();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m40413() {
        ColorStateList colorStateListValueOf;
        ColorStateList colorStateListValueOf2;
        Context context = getContext();
        float f = context.getResources().getDisplayMetrics().density;
        this.f52665 = (int) ((32.0f * f) + 0.5f);
        this.f52666 = (int) ((3.0f * f) + 0.5f);
        this.f52664 = (int) ((4.0f * f) + 0.5f);
        this.f52661 = (int) ((2.0f * f) + 0.5f);
        this.f52669 = (int) ((f * 5.0f) + 0.5f);
        this.f52670 = new View(context);
        this.f52663 = new C17939(context);
        this.f52668 = new C14615(context);
        this.f52672 = new C14615(context);
        this.f52671 = new C14615(context);
        this.f52662 = new C14615(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f52660 = viewGroup;
        this.f52667 = (TextView) viewGroup.getChildAt(1);
        this.f52660.setVisibility(8);
        this.f52670.setId(R.id.MT_Protector);
        this.f52663.setId(R.id.MT_Protector);
        this.f52668.setId(R.id.file_name);
        this.f52672.setId(R.id.MT_Protector);
        this.f52671.setId(R.id.MT_Protector);
        this.f52662.setId(R.id.MT_Protector);
        this.f52668.setEllipsize(TextUtils.TruncateAt.END);
        this.f52668.setMaxLines(2);
        this.f52672.setText("->");
        this.f52668.setTextSize(13.0f);
        this.f52672.setTextSize(10.0f);
        this.f52671.setTextSize(10.0f);
        this.f52662.setTextSize(10.0f);
        if (isInEditMode()) {
            colorStateListValueOf = ColorStateList.valueOf(-288304944);
            colorStateListValueOf2 = ColorStateList.valueOf(-1715157820);
            this.f52663.setImageResource(R.drawable.MT_Protector);
            this.f52668.setText("文件名");
            this.f52671.setText("2020-11-11 20:30");
            this.f52662.setText("16.9MB");
        } else {
            colorStateListValueOf = C21943.f70275;
            colorStateListValueOf2 = C21943.f70273;
        }
        this.f52668.setTextColor(colorStateListValueOf);
        this.f52672.setTextColor(colorStateListValueOf2);
        this.f52671.setTextColor(colorStateListValueOf2);
        this.f52662.setTextColor(colorStateListValueOf2);
        this.f52658 = C21943.f70295;
        addView(this.f52670);
        addView(this.f52663);
        addView(this.f52668);
        addView(this.f52672);
        addView(this.f52671);
        addView(this.f52662);
        addView(this.f52660);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40415(boolean z) {
        if (this.f52659 != z) {
            this.f52659 = z;
            if (z) {
                this.f52670.setVisibility(8);
                this.f52663.setVisibility(8);
                this.f52668.setVisibility(8);
                this.f52672.setVisibility(8);
                this.f52671.setVisibility(8);
                this.f52662.setVisibility(8);
                this.f52660.setVisibility(0);
            } else {
                this.f52670.setVisibility(0);
                this.f52663.setVisibility(0);
                this.f52668.setVisibility(0);
                this.f52672.setVisibility(0);
                this.f52671.setVisibility(0);
                this.f52662.setVisibility(0);
                this.f52660.setVisibility(8);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40414() {
        if (this.f52658 != C21943.f70295) {
            ColorStateList colorStateList = C21943.f70275;
            ColorStateList colorStateList2 = C21943.f70273;
            this.f52668.setTextColor(colorStateList);
            this.f52672.setTextColor(colorStateList2);
            this.f52671.setTextColor(colorStateList2);
            this.f52662.setTextColor(colorStateList2);
            this.f52667.setTextColor(colorStateList2);
            this.f52660.getChildAt(0).setBackgroundColor(C21943.f70283);
            this.f52660.getChildAt(2).setBackgroundColor(C21943.f70283);
            this.f52658 = C21943.f70295;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f52659) {
            this.f52660.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            setMeasuredDimension(size, this.f52660.getMeasuredHeight());
            return;
        }
        int i3 = this.f52666;
        int i4 = this.f52665;
        int i5 = size - (((i3 + i4) + this.f52661) + i3);
        int i6 = size2 - (this.f52664 * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        this.f52663.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.f52672.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f52671.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f52662.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f52668.measure(View.MeasureSpec.makeMeasureSpec(i5 - this.f52672.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        setMeasuredDimension(size, Math.max(this.f52665, this.f52671.getMeasuredHeight() + this.f52668.getMeasuredHeight()) + (this.f52664 * 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f52659) {
            this.f52660.layout(0, 0, i5, i6);
            return;
        }
        int i7 = this.f52665;
        int i8 = this.f52666;
        C14615 c14615 = this.f52668;
        C14615 c14616 = this.f52671;
        C14615 c14617 = this.f52662;
        C14615 c14618 = this.f52672;
        this.f52670.layout(0, 0, i5, i6);
        int i9 = (i6 - i7) / 2;
        int i10 = i8 + i7;
        this.f52663.layout(i8, i9, i10, i7 + i9);
        if (c14616.getVisibility() == 8) {
            measuredHeight = (i6 - c14615.getMeasuredHeight()) / 2;
        } else {
            measuredHeight = ((i6 - c14615.getMeasuredHeight()) - c14616.getMeasuredHeight()) / 2;
        }
        int measuredWidth = i10 + this.f52661;
        c14615.layout(measuredWidth, measuredHeight, c14615.getMeasuredWidth() + measuredWidth, c14615.getMeasuredHeight() + measuredHeight);
        int measuredHeight2 = c14615.getMeasuredHeight() + measuredHeight;
        c14616.layout(measuredWidth, measuredHeight2, c14616.getMeasuredWidth() + measuredWidth, c14616.getMeasuredHeight() + measuredHeight2);
        if (c14616.getMeasuredWidth() != 0) {
            measuredWidth = c14616.getMeasuredWidth() + measuredWidth + this.f52669;
        }
        c14617.layout(measuredWidth, measuredHeight2, c14617.getMeasuredWidth() + measuredWidth, c14616.getMeasuredHeight() + measuredHeight2);
        int i11 = i5 - i8;
        int baseline = (c14615.getBaseline() + measuredHeight) - c14618.getBaseline();
        c14618.layout(i11 - c14618.getMeasuredWidth(), baseline, i11, c14618.getMeasuredHeight() + baseline);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m40417() {
        return this.f52670;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17939 m40420() {
        return this.f52663;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14615 m40423() {
        return this.f52668;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14615 m40418() {
        return this.f52672;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14615 m40419() {
        return this.f52671;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14615 m40416() {
        return this.f52662;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView m40421() {
        return this.f52667;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40422() {
        this.f52666 = 0;
        requestLayout();
    }
}
