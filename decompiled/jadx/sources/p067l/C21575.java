package p067l;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1PL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21575 {

    /* JADX INFO: renamed from: ۧ */
    public static final ViewGroup.MarginLayoutParams f68029;

    /* JADX INFO: renamed from: ֫ */
    public C8541 f68030;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f68029 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C21575(C8541 c8541) {
        this.f68030 = c8541;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[LOOP:2: B:42:0x00a4->B:46:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m48761() {
        int childCount;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i2;
        int bottom;
        int i3;
        C8541 c8541 = this.f68030;
        int childCount2 = c8541.getChildCount();
        if (childCount2 == 0) {
            if (c8541.getChildCount() <= 1) {
                childCount = c8541.getChildCount();
                for (i = 0; i < childCount; i++) {
                    if (m48760(c8541.getChildAt(i))) {
                        return true;
                    }
                }
            }
        } else {
            boolean z = c8541.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount2, 2);
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt = c8541.getChildAt(i4);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f68029;
                }
                int[] iArr2 = iArr[i4];
                if (z) {
                    top = childAt.getLeft();
                    i2 = marginLayoutParams.leftMargin;
                } else {
                    top = childAt.getTop();
                    i2 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i2;
                int[] iArr3 = iArr[i4];
                if (z) {
                    bottom = childAt.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i3;
            }
            Arrays.sort(iArr, new C23586());
            int i5 = 1;
            while (true) {
                if (i5 < childCount2) {
                    if (iArr[i5 - 1][1] == iArr[i5][0]) {
                        i5++;
                    }
                } else {
                    int[] iArr4 = iArr[0];
                    int i6 = iArr4[1];
                    int i7 = iArr4[0];
                    int i8 = i6 - i7;
                    if (i7 <= 0 && iArr[childCount2 - 1][1] >= i8) {
                        if (c8541.getChildCount() <= 1) {
                        }
                    }
                }
                childCount = c8541.getChildCount();
                while (i < childCount) {
                    if (m48760(c8541.getChildAt(i))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48760(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m48760(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
