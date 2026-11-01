package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAKT */
/* JADX INFO: loaded from: classes4.dex */
public class C18699 extends ViewGroup {

    /* JADX INFO: renamed from: ֫֫ */
    public int f55839;

    /* JADX INFO: renamed from: ۗ */
    public boolean f55840;

    /* JADX INFO: renamed from: ۙ */
    public ViewGroup f55841;

    /* JADX INFO: renamed from: ۛ */
    public int f55842;

    /* JADX INFO: renamed from: ۟ */
    public C1567 f55843;

    /* JADX INFO: renamed from: ۤ */
    public C1732 f55844;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f55845;

    /* JADX INFO: renamed from: ۨ */
    public int f55846;

    /* JADX INFO: renamed from: ۫ */
    public int f55847;

    /* JADX INFO: renamed from: ۬ */
    public TextView f55848;

    /* JADX INFO: renamed from: ܰ */
    public C1567 f55849;

    /* JADX INFO: renamed from: ᩶ */
    public int f55850;

    /* JADX INFO: renamed from: ᩸ */
    public View f55851;

    /* JADX INFO: renamed from: ᩹ */
    public C1567 f55852;

    /* JADX INFO: renamed from: ᩺ */
    public C1567 f55853;

    public C18699(Context context) {
        super(context);
        this.f55840 = false;
        m42658();
    }

    public C18699(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55840 = false;
        m42658();
    }

    public C18699(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55840 = false;
        m42658();
    }

    /* JADX INFO: renamed from: ۢ */
    private void m42658() {
        ColorStateList colorStateListValueOf;
        ColorStateList colorStateListValueOf2;
        Context context = getContext();
        float f = context.getResources().getDisplayMetrics().density;
        this.f55846 = (int) ((32.0f * f) + 0.5f);
        this.f55847 = (int) ((3.0f * f) + 0.5f);
        this.f55845 = (int) ((4.0f * f) + 0.5f);
        this.f55842 = (int) ((2.0f * f) + 0.5f);
        this.f55850 = (int) ((f * 5.0f) + 0.5f);
        this.f55851 = new View(context);
        this.f55844 = new C1732(context);
        this.f55849 = new C1567(context);
        this.f55853 = new C1567(context);
        this.f55852 = new C1567(context);
        this.f55843 = new C1567(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f55841 = viewGroup;
        this.f55848 = (TextView) viewGroup.getChildAt(1);
        this.f55841.setVisibility(8);
        this.f55851.setId(R.id.MT_Protector);
        this.f55844.setId(R.id.MT_Protector);
        this.f55849.setId(R.id.file_name);
        this.f55853.setId(R.id.MT_Protector);
        this.f55852.setId(R.id.MT_Protector);
        this.f55843.setId(R.id.MT_Protector);
        this.f55849.setEllipsize(TextUtils.TruncateAt.END);
        this.f55849.setMaxLines(2);
        this.f55853.setText("->");
        this.f55849.setTextSize(13.0f);
        this.f55853.setTextSize(10.0f);
        this.f55852.setTextSize(10.0f);
        this.f55843.setTextSize(10.0f);
        if (isInEditMode()) {
            colorStateListValueOf = ColorStateList.valueOf(-288304944);
            colorStateListValueOf2 = ColorStateList.valueOf(-1715157820);
            this.f55844.setImageResource(R.drawable.MT_Protector);
            this.f55849.setText("文件名");
            this.f55852.setText("2020-11-11 20:30");
            this.f55843.setText("16.9MB");
        } else {
            colorStateListValueOf = C23223.f72986;
            colorStateListValueOf2 = C23223.f72984;
        }
        this.f55849.setTextColor(colorStateListValueOf);
        this.f55853.setTextColor(colorStateListValueOf2);
        this.f55852.setTextColor(colorStateListValueOf2);
        this.f55843.setTextColor(colorStateListValueOf2);
        this.f55839 = C23223.f73006;
        addView(this.f55851);
        addView(this.f55844);
        addView(this.f55849);
        addView(this.f55853);
        addView(this.f55852);
        addView(this.f55843);
        addView(this.f55841);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42660(boolean z) {
        if (this.f55840 != z) {
            this.f55840 = z;
            if (z) {
                this.f55851.setVisibility(8);
                this.f55844.setVisibility(8);
                this.f55849.setVisibility(8);
                this.f55853.setVisibility(8);
                this.f55852.setVisibility(8);
                this.f55843.setVisibility(8);
                this.f55841.setVisibility(0);
            } else {
                this.f55851.setVisibility(0);
                this.f55844.setVisibility(0);
                this.f55849.setVisibility(0);
                this.f55853.setVisibility(0);
                this.f55852.setVisibility(0);
                this.f55843.setVisibility(0);
                this.f55841.setVisibility(8);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42659() {
        if (this.f55839 != C23223.f73006) {
            ColorStateList colorStateList = C23223.f72986;
            ColorStateList colorStateList2 = C23223.f72984;
            this.f55849.setTextColor(colorStateList);
            this.f55853.setTextColor(colorStateList2);
            this.f55852.setTextColor(colorStateList2);
            this.f55843.setTextColor(colorStateList2);
            this.f55848.setTextColor(colorStateList2);
            this.f55841.getChildAt(0).setBackgroundColor(C23223.f72994);
            this.f55841.getChildAt(2).setBackgroundColor(C23223.f72994);
            this.f55839 = C23223.f73006;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f55840) {
            this.f55841.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            setMeasuredDimension(size, this.f55841.getMeasuredHeight());
            return;
        }
        int i3 = this.f55847;
        int i4 = this.f55846;
        int i5 = size - (((i3 + i4) + this.f55842) + i3);
        int i6 = size2 - (this.f55845 * 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        this.f55844.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.f55853.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f55852.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f55843.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        this.f55849.measure(View.MeasureSpec.makeMeasureSpec(i5 - this.f55853.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        setMeasuredDimension(size, Math.max(this.f55846, this.f55852.getMeasuredHeight() + this.f55849.getMeasuredHeight()) + (this.f55845 * 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f55840) {
            this.f55841.layout(0, 0, i5, i6);
            return;
        }
        int i7 = this.f55846;
        int i8 = this.f55847;
        C1567 c1567 = this.f55849;
        C1567 c1568 = this.f55852;
        C1567 c1569 = this.f55843;
        C1567 c15610 = this.f55853;
        this.f55851.layout(0, 0, i5, i6);
        int i9 = (i6 - i7) / 2;
        int i10 = i8 + i7;
        this.f55844.layout(i8, i9, i10, i7 + i9);
        if (c1568.getVisibility() == 8) {
            measuredHeight = (i6 - c1567.getMeasuredHeight()) / 2;
        } else {
            measuredHeight = ((i6 - c1567.getMeasuredHeight()) - c1568.getMeasuredHeight()) / 2;
        }
        int measuredWidth = i10 + this.f55842;
        c1567.layout(measuredWidth, measuredHeight, c1567.getMeasuredWidth() + measuredWidth, c1567.getMeasuredHeight() + measuredHeight);
        int measuredHeight2 = c1567.getMeasuredHeight() + measuredHeight;
        c1568.layout(measuredWidth, measuredHeight2, c1568.getMeasuredWidth() + measuredWidth, c1568.getMeasuredHeight() + measuredHeight2);
        if (c1568.getMeasuredWidth() != 0) {
            measuredWidth = c1568.getMeasuredWidth() + measuredWidth + this.f55850;
        }
        c1569.layout(measuredWidth, measuredHeight2, c1569.getMeasuredWidth() + measuredWidth, c1568.getMeasuredHeight() + measuredHeight2);
        int i11 = i5 - i8;
        int baseline = (c1567.getBaseline() + measuredHeight) - c15610.getBaseline();
        c15610.layout(i11 - c15610.getMeasuredWidth(), baseline, i11, c15610.getMeasuredHeight() + baseline);
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m42662() {
        return this.f55851;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C1732 m42665() {
        return this.f55844;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C1567 m42668() {
        return this.f55849;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C1567 m42663() {
        return this.f55853;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1567 m42664() {
        return this.f55852;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C1567 m42661() {
        return this.f55843;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final TextView m42666() {
        return this.f55848;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m42667() {
        this.f55847 = 0;
        requestLayout();
    }
}
