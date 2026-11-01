package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖܺ */
/* JADX INFO: compiled from: 34ZC */
/* JADX INFO: loaded from: classes2.dex */
public class C0972 extends LinearLayout {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f11048;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f11049;

    /* JADX INFO: renamed from: ᩹ */
    public int f11050;

    public C0972(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11050 = -1;
        int[] iArr = C1010.f13520;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C1717.m43548(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f11049 = z;
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            m10299(z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int iMakeMeasureSpec;
        int i3;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = 0;
        boolean z2 = this.f11049;
        if (z2) {
            if (size > this.f11050 && this.f11048) {
                m10299(false);
            }
            this.f11050 = size;
        }
        if (this.f11048 || View.MeasureSpec.getMode(i) != 1073741824) {
            z = false;
            iMakeMeasureSpec = i;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (z2 && !this.f11048 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            m10299(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (i4 >= childCount) {
                i4 = -1;
                break;
            } else if (getChildAt(i4).getVisibility() == 0) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            measuredHeight = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin;
            if (this.f11048) {
                int childCount2 = getChildCount();
                for (int i5 = i4 + 1; i5 < childCount2; i5++) {
                    if (getChildAt(i5).getVisibility() == 0) {
                        i3 = i5;
                        break;
                    }
                }
                if (i3 >= 0) {
                    paddingBottom = getChildAt(i3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            measuredHeight += paddingBottom;
        }
        int i6 = C1717.f57146;
        if (getMinimumHeight() != measuredHeight) {
            setMinimumHeight(measuredHeight);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10299(boolean z) {
        if (this.f11048 != z) {
            if (!z || this.f11049) {
                this.f11048 = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.MT_Protector);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }
}
