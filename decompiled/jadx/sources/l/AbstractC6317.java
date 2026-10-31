package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6317 {
    public boolean getInsetDodgeRect(C18333 c18333, View view, Rect rect) {
        return false;
    }

    public int getScrimColor(C18333 c18333, View view) {
        return -16777216;
    }

    public float getScrimOpacity(C18333 c18333, View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(C18333 c18333, View view, View view2) {
        return false;
    }

    public C21610 onApplyWindowInsets(C18333 c18333, View view, C21610 c21610) {
        return c21610;
    }

    public void onAttachedToLayoutParams(C14077 c14077) {
    }

    public boolean onDependentViewChanged(C18333 c18333, View view, View view2) {
        return false;
    }

    public void onDependentViewRemoved(C18333 c18333, View view, View view2) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(C18333 c18333, View view, int i) {
        return false;
    }

    public boolean onMeasureChild(C18333 c18333, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(C18333 c18333, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(C18333 c18333, View view, View view2, float f, float f2) {
        return false;
    }

    @Deprecated
    public void onNestedPreScroll(C18333 c18333, View view, View view2, int i, int i2, int[] iArr) {
    }

    @Deprecated
    public void onNestedScroll(C18333 c18333, View view, View view2, int i, int i2, int i3, int i4) {
    }

    @Deprecated
    public void onNestedScrollAccepted(C18333 c18333, View view, View view2, View view3, int i) {
    }

    public boolean onRequestChildRectangleOnScreen(C18333 c18333, View view, Rect rect, boolean z) {
        return false;
    }

    public void onRestoreInstanceState(C18333 c18333, View view, Parcelable parcelable) {
    }

    @Deprecated
    public boolean onStartNestedScroll(C18333 c18333, View view, View view2, View view3, int i) {
        return false;
    }

    @Deprecated
    public void onStopNestedScroll(C18333 c18333, View view, View view2) {
    }

    public boolean onTouchEvent(C18333 c18333, View view, MotionEvent motionEvent) {
        return false;
    }

    public AbstractC6317() {
    }

    public AbstractC6317(Context context, AttributeSet attributeSet) {
    }

    public boolean blocksInteractionBelow(C18333 c18333, View view) {
        return getScrimOpacity(c18333, view) > 0.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17451(View view, Object obj) {
        ((C14077) view.getLayoutParams()).f42513 = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m17450(View view) {
        return ((C14077) view.getLayoutParams()).f42513;
    }

    public boolean onStartNestedScroll(C18333 c18333, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(c18333, view, view2, view3, i);
        }
        return false;
    }

    public void onNestedScrollAccepted(C18333 c18333, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(c18333, view, view2, view3, i);
        }
    }

    public void onStopNestedScroll(C18333 c18333, View view, View view2, int i) {
        if (i == 0) {
            onStopNestedScroll(c18333, view, view2);
        }
    }

    @Deprecated
    public void onNestedScroll(C18333 c18333, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(c18333, view, view2, i, i2, i3, i4);
        }
    }

    public void onNestedScroll(C18333 c18333, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(c18333, view, view2, i, i2, i3, i4, i5);
    }

    public void onNestedPreScroll(C18333 c18333, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(c18333, view, view2, i, i2, iArr);
        }
    }

    public Parcelable onSaveInstanceState(C18333 c18333, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }
}
