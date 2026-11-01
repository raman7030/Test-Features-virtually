package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩸ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1155 {
    public boolean getInsetDodgeRect(C1751 c1751, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(C1751 c1751, View view) {
        return -16777216;
    }

    public float getScrimOpacity(C1751 c1751, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(C1751 c1751, View view, View view2) {
        return false;
    }

    public C1914 onApplyWindowInsets(C1751 c1751, View view, C1914 c1914) {
        return c1914;
    }

    public void onAttachedToLayoutParams(C1540 c1540) {
    }

    public boolean onDependentViewChanged(C1751 c1751, View view, View view2) {
        return false;
    }

    public void onDependentViewRemoved(C1751 c1751, View view, View view2) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(C1751 c1751, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(C1751 c1751, View view, int i) {
        return false;
    }

    public boolean onMeasureChild(C1751 c1751, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(C1751 c1751, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(C1751 c1751, View view, View view2, float f, float f2) {
        return false;
    }

    @Deprecated
    public void onNestedPreScroll(C1751 c1751, View view, View view2, int i, int i2, int[] iArr) {
    }

    @Deprecated
    public void onNestedScroll(C1751 c1751, View view, View view2, int i, int i2, int i3, int i4) {
    }

    @Deprecated
    public void onNestedScrollAccepted(C1751 c1751, View view, View view2, View view3, int i) {
    }

    public boolean onRequestChildRectangleOnScreen(C1751 c1751, View view, Rect rect, boolean z) {
        return false;
    }

    public void onRestoreInstanceState(C1751 c1751, View view, Parcelable parcelable) {
    }

    @Deprecated
    public boolean onStartNestedScroll(C1751 c1751, View view, View view2, View view3, int i) {
        return false;
    }

    @Deprecated
    public void onStopNestedScroll(C1751 c1751, View view, View view2) {
    }

    public boolean onTouchEvent(C1751 c1751, View view, MotionEvent motionEvent) {
        return false;
    }

    public AbstractC1155() {
    }

    public AbstractC1155(Context context, AttributeSet attributeSet) {
    }

    public boolean blocksInteractionBelow(C1751 c1751, View view) {
        return getScrimOpacity(c1751, view) > 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19391(View view, Object obj) {
        ((C1540) view.getLayoutParams()).f45599 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m19390(View view) {
        return ((C1540) view.getLayoutParams()).f45599;
    }

    public boolean onStartNestedScroll(C1751 c1751, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(c1751, view, view2, view3, i);
        }
        return false;
    }

    public void onNestedScrollAccepted(C1751 c1751, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(c1751, view, view2, view3, i);
        }
    }

    public void onStopNestedScroll(C1751 c1751, View view, View view2, int i) {
        if (i == 0) {
            onStopNestedScroll(c1751, view, view2);
        }
    }

    @Deprecated
    public void onNestedScroll(C1751 c1751, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(c1751, view, view2, i, i2, i3, i4);
        }
    }

    public void onNestedScroll(C1751 c1751, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(c1751, view, view2, i, i2, i3, i4, i5);
    }

    public void onNestedPreScroll(C1751 c1751, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(c1751, view, view2, i, i2, iArr);
        }
    }

    public Parcelable onSaveInstanceState(C1751 c1751, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }
}
