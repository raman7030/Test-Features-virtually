package p067l;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.۟᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 046D */
/* JADX INFO: loaded from: classes.dex */
public class C9702 extends C14784 {

    /* JADX INFO: renamed from: ۧܿᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82065;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final /* synthetic */ int f26760 = 0;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f26761;

    /* JADX INFO: renamed from: ܿ */
    public static native void m22647();

    /* JADX INFO: renamed from: ᩷ */
    public static void m22649(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C9702) {
                ((C9702) parent).f26761 = true;
                return;
            }
        }
    }

    static {
        ApplicationC14266.m56479(75);
        f82065 = new short[]{3996, -16356, -16365, -16359, -16369, -16366, -16364, -16359, -16301, -16354, -16366, -16365, -16375, -16360, -16365, -16375, -16301, -16371, -16368, -16301, -16339, -16356, -16354, -16362, -16356, -16358, -16360, -16332, -16365, -16357, -16366, -16295, -16308, -16356, -16365, -16359, -16369, -16366, -16364, -16359, -16301, -16354, -16366, -16365, -16375, -16360, -16365, -16375, -16301, -16371, -16368, -16301, -16339, -16356, -16354, -16362, -16356, -16358, -16360, -16332, -16365, -16357, -16366, -16322, -16337, -16328, -16324, -16343, -16334, -16337, -16370, -16339, -16356, -16354, -16362, -16356, -16358, -16360, -16332, -16365, -16357, -16366, -16322, -16356, -16354, -16363, -16360, -16368, -16322, -16369, -16360, -16356, -16375, -16366, -16369, -16370, -16370, -16339, -16356, -16364, -16369, -16360, -16359, -16322, -16369, -16360, -16356, -16375, -16366, -16369, -16370, -16354, -16367, -16360, -16356, -16369, -16353, -16364, -16365, -16301, -16368, -16375, -16301, -16371, -16367, -16376, -16370};
        C4081.f8987.execute(new RunnableC24454());
        new Matrix();
    }

    public C9702(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C9702(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j) {
        if (j == 160) {
            return false;
        }
        return super.postDelayed(runnable, j);
    }

    @Override // p067l.C14784, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                mode = 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE) {
                mode2 = 1073741824;
            }
            i = View.MeasureSpec.makeMeasureSpec(size, mode);
            i2 = View.MeasureSpec.makeMeasureSpec(size2, mode2);
        }
        super.onMeasure(i, i2);
    }

    @Override // p067l.C14784, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26761) {
            if (motionEvent.getActionMasked() != 0) {
                return true;
            }
            this.f26761 = false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Override // p067l.C14784, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f26761) {
            if (motionEvent.getActionMasked() != 0) {
                return true;
            }
            this.f26761 = false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
