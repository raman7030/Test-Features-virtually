package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAP9 */
/* JADX INFO: loaded from: classes3.dex */
public class C13162 extends ViewGroup {

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f36989;

    /* JADX INFO: renamed from: ۙ */
    public final EdgeEffect f36990;

    /* JADX INFO: renamed from: ᩶ */
    public final OverScroller f36991;

    /* JADX INFO: renamed from: ᩸ */
    public final EdgeEffect f36992;

    /* JADX INFO: renamed from: ᩹ */
    public int f36993;

    public C13162(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C13162(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36989 = new ArrayList();
        this.f36990 = new EdgeEffect(context);
        this.f36992 = new EdgeEffect(context);
        this.f36991 = new OverScroller(context);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList<View> arrayList;
        int iMin;
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE);
        int childCount = getChildCount();
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int iMax = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f36989;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                childAt.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                int measuredWidth = childAt.getMeasuredWidth();
                if (i8 <= 0 || i8 + measuredWidth <= paddingLeft) {
                    i3 = iMakeMeasureSpec;
                    i4 = iMakeMeasureSpec2;
                    i5 = childCount;
                } else {
                    int size2 = (paddingLeft - i8) / arrayList.size();
                    i10 += size2;
                    i9++;
                    if (size2 > 0) {
                        for (View view : arrayList) {
                            int i11 = iMakeMeasureSpec;
                            int i12 = iMakeMeasureSpec2;
                            int i13 = childCount;
                            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth() + size2, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                            iMakeMeasureSpec = i11;
                            iMakeMeasureSpec2 = i12;
                            childCount = i13;
                            size2 = size2;
                        }
                    }
                    i3 = iMakeMeasureSpec;
                    i4 = iMakeMeasureSpec2;
                    i5 = childCount;
                    arrayList.clear();
                    i6++;
                    i8 = 0;
                }
                i8 += measuredWidth;
                arrayList.add(childAt);
            } else {
                i3 = iMakeMeasureSpec;
                i4 = iMakeMeasureSpec2;
                i5 = childCount;
            }
            i7++;
            iMakeMeasureSpec = i3;
            iMakeMeasureSpec2 = i4;
            childCount = i5;
        }
        if (!arrayList.isEmpty()) {
            int size3 = (paddingLeft - i8) / arrayList.size();
            if (i9 > 0) {
                iMin = Math.min(size3, i10 / i9);
            } else {
                iMin = Math.min(size3, C13076.m29939(12.0f));
            }
            if (iMin > 0) {
                for (View view2 : arrayList) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth() + iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 1073741824));
                }
            }
            arrayList.clear();
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f36993 = iMax;
        setMeasuredDimension(size, paddingBottom + paddingTop + (i6 * iMax));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m30155() {
        return this.f36993;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i5 = paddingLeft;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i5 != paddingLeft && i5 + measuredWidth > paddingRight) {
                    paddingTop += this.f36993;
                    i5 = paddingLeft;
                }
                int i7 = measuredWidth + i5;
                childAt.layout(i5, paddingTop, i7, measuredHeight + paddingTop);
                i5 = i7;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean zDraw;
        super.dispatchDraw(canvas);
        EdgeEffect edgeEffect = this.f36990;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            edgeEffect.setSize(getWidth(), getHeight());
            zDraw = edgeEffect.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f36992;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate((-getWidth()) - getScrollX(), -getHeight());
            edgeEffect2.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30157() {
        boolean z;
        EdgeEffect edgeEffect = this.f36990;
        boolean z2 = true;
        if (edgeEffect.isFinished()) {
            z = false;
        } else {
            edgeEffect.onRelease();
            z = true;
        }
        EdgeEffect edgeEffect2 = this.f36992;
        if (edgeEffect2.isFinished()) {
            z2 = z;
        } else {
            edgeEffect2.onRelease();
        }
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30156(float f, float f2) {
        C24587.m54228(this.f36990, f, f2);
        EdgeEffect edgeEffect = this.f36992;
        if (!edgeEffect.isFinished()) {
            edgeEffect.onRelease();
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30153(float f, float f2) {
        C24587.m54228(this.f36992, f, f2);
        EdgeEffect edgeEffect = this.f36990;
        if (!edgeEffect.isFinished()) {
            edgeEffect.onRelease();
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30154(int i, int i2) {
        this.f36991.fling(0, getScrollY(), 0, i, 0, 0, 0, i2);
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30152() {
        OverScroller overScroller = this.f36991;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.abortAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f36991;
        if (overScroller.computeScrollOffset()) {
            int scrollY = getScrollY();
            int currY = overScroller.getCurrY();
            if (scrollY != currY) {
                setScrollY(currY);
                if (scrollY > 0 && currY <= 0) {
                    this.f36990.onAbsorb((int) overScroller.getCurrVelocity());
                    overScroller.abortAnimation();
                } else {
                    int finalY = overScroller.getFinalY();
                    if (scrollY < finalY && currY >= finalY) {
                        this.f36992.onAbsorb((int) overScroller.getCurrVelocity());
                        overScroller.abortAnimation();
                    }
                }
            }
            invalidate();
        }
    }
}
