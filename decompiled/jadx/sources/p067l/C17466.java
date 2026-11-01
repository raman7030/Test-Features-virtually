package p067l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 651C */
/* JADX INFO: loaded from: classes4.dex */
public final class C17466 {

    /* JADX INFO: renamed from: ᩶ */
    public static final Interpolator f52213 = new InterpolatorC22162();

    /* JADX INFO: renamed from: ֡ */
    public int f52214;

    /* JADX INFO: renamed from: ֨ */
    public OverScroller f52215;

    /* JADX INFO: renamed from: ۖ */
    public float[] f52217;

    /* JADX INFO: renamed from: ۘ */
    public float f52218;

    /* JADX INFO: renamed from: ۚ */
    public boolean f52219;

    /* JADX INFO: renamed from: ۜ */
    public int f52220;

    /* JADX INFO: renamed from: ۡ */
    public float[] f52222;

    /* JADX INFO: renamed from: ۢ */
    public float[] f52223;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10762 f52224;

    /* JADX INFO: renamed from: ܳ */
    public int[] f52225;

    /* JADX INFO: renamed from: ܶ */
    public int f52226;

    /* JADX INFO: renamed from: ܺ */
    public float[] f52227;

    /* JADX INFO: renamed from: ܽ */
    public View f52228;

    /* JADX INFO: renamed from: ܿ */
    public int f52229;

    /* JADX INFO: renamed from: ᩳ */
    public final int f52230;

    /* JADX INFO: renamed from: ᩴ */
    public float f52231;

    /* JADX INFO: renamed from: ᩵ */
    public final ViewGroup f52232;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f52233;

    /* JADX INFO: renamed from: ᩸ */
    public int f52234;

    /* JADX INFO: renamed from: ᩹ */
    public VelocityTracker f52235;

    /* JADX INFO: renamed from: ᩻ */
    public int[] f52236;

    /* JADX INFO: renamed from: ֫ */
    public int f52216 = -1;

    /* JADX INFO: renamed from: ۠ */
    public final Runnable f52221 = new RunnableC11433(this);

    /* JADX INFO: renamed from: ֫ */
    public static C17466 m39795(ViewGroup viewGroup, AbstractC10762 abstractC10762) {
        return new C17466(viewGroup.getContext(), viewGroup, abstractC10762);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17466 m39794(ViewGroup viewGroup, float f, AbstractC10762 abstractC10762) {
        C17466 c17466M39795 = m39795(viewGroup, abstractC10762);
        c17466M39795.f52226 = (int) ((1.0f / f) * c17466M39795.f52226);
        return c17466M39795;
    }

    public C17466(Context context, ViewGroup viewGroup, AbstractC10762 abstractC10762) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC10762 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f52232 = viewGroup;
        this.f52224 = abstractC10762;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f52230 = i;
        this.f52220 = i;
        this.f52226 = viewConfiguration.getScaledTouchSlop();
        this.f52218 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f52231 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f52215 = new OverScroller(context, f52213);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39807(float f) {
        this.f52231 = f;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m39823() {
        return this.f52229;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39819(int i) {
        this.f52234 = i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m39824() {
        return this.f52220;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39814(int i) {
        this.f52220 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m39818() {
        return this.f52230;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39809(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f52232;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f52228 = view;
        this.f52216 = i;
        this.f52224.onViewCaptured(view, i);
        m39808(1);
    }

    /* JADX INFO: renamed from: ܿ */
    public final View m39821() {
        return this.f52228;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m39812() {
        return this.f52226;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39813() {
        this.f52216 = -1;
        float[] fArr = this.f52223;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f52222, 0.0f);
            Arrays.fill(this.f52227, 0.0f);
            Arrays.fill(this.f52217, 0.0f);
            Arrays.fill(this.f52233, 0);
            Arrays.fill(this.f52225, 0);
            Arrays.fill(this.f52236, 0);
            this.f52214 = 0;
        }
        VelocityTracker velocityTracker = this.f52235;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f52235 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39806() {
        m39813();
        if (this.f52229 == 2) {
            OverScroller overScroller = this.f52215;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f52224.onViewPositionChanged(this.f52228, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m39808(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39811(View view, int i, int i2) {
        this.f52228 = view;
        this.f52216 = -1;
        boolean zM39799 = m39799(i, i2, 0, 0);
        if (!zM39799 && this.f52229 == 0 && this.f52228 != null) {
            this.f52228 = null;
        }
        return zM39799;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39815(int i, int i2) {
        if (!this.f52219) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m39799(i, i2, (int) this.f52235.getXVelocity(this.f52216), (int) this.f52235.getYVelocity(this.f52216));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m39799(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f52228.getLeft();
        int top = this.f52228.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f52215;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m39808(0);
            return false;
        }
        View view = this.f52228;
        int i7 = (int) this.f52231;
        int i8 = (int) this.f52218;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.f52231;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        AbstractC10762 abstractC10762 = this.f52224;
        overScroller.startScroll(left, top, i5, i6, (int) ((m39793(i6, i4, abstractC10762.getViewVerticalDragRange(view)) * f6) + (m39793(i5, i3, abstractC10762.getViewHorizontalDragRange(view)) * f5)));
        m39808(2);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m39793(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.f52232.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m39822() {
        if (this.f52229 == 2) {
            OverScroller overScroller = this.f52215;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f52228.getLeft();
            int top = currY - this.f52228.getTop();
            if (left != 0) {
                C1717.m43571(left, this.f52228);
            }
            if (top != 0) {
                C1717.m43578(top, this.f52228);
            }
            if (left != 0 || top != 0) {
                this.f52224.onViewPositionChanged(this.f52228, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f52232.post(this.f52221);
            }
        }
        return this.f52229 == 2;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m39804(int i) {
        float[] fArr = this.f52223;
        if (fArr != null) {
            int i2 = this.f52214;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f52222[i] = 0.0f;
                this.f52227[i] = 0.0f;
                this.f52217[i] = 0.0f;
                this.f52233[i] = 0;
                this.f52225[i] = 0;
                this.f52236[i] = 0;
                this.f52214 = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m39801(float f, float f2, int i) {
        float[] fArr = this.f52223;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f52222;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f52227;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f52217;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f52233;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f52225;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f52236;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f52223 = fArr2;
            this.f52222 = fArr3;
            this.f52227 = fArr4;
            this.f52217 = fArr5;
            this.f52233 = iArr;
            this.f52225 = iArr2;
            this.f52236 = iArr3;
        }
        float[] fArr9 = this.f52223;
        this.f52227[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f52222;
        this.f52217[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f52233;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f52232;
        int i5 = i3 < viewGroup.getLeft() + this.f52220 ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f52220) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f52220) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f52220) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f52214 |= 1 << i;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m39803(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f52214 & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f52227[pointerId] = x;
                this.f52217[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39808(int i) {
        this.f52232.removeCallbacks(this.f52221);
        if (this.f52229 != i) {
            this.f52229 = i;
            this.f52224.onViewDragStateChanged(i);
            if (this.f52229 == 0) {
                this.f52228 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39816(int i, View view) {
        if (view == this.f52228 && this.f52216 == i) {
            return true;
        }
        if (view == null || !this.f52224.tryCaptureView(view, i)) {
            return false;
        }
        this.f52216 = i;
        m39809(i, view);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX INFO: renamed from: ۧ */
    public final boolean m39817(MotionEvent motionEvent) {
        View viewM39805;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m39813();
        }
        if (this.f52235 == null) {
            this.f52235 = VelocityTracker.obtain();
        }
        this.f52235.addMovement(motionEvent);
        AbstractC10762 abstractC10762 = this.f52224;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m39801(x, y, pointerId);
            View viewM39806 = m39805((int) x, (int) y);
            if (viewM39806 == this.f52228 && this.f52229 == 2) {
                m39816(pointerId, viewM39806);
            }
            int i = this.f52233[pointerId] & this.f52234;
            if (i != 0) {
                abstractC10762.onEdgeTouched(i, pointerId);
            }
        } else if (actionMasked == 1) {
            m39813();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m39813();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m39801(x2, y2, pointerId2);
                int i2 = this.f52229;
                if (i2 == 0) {
                    int i3 = this.f52233[pointerId2] & this.f52234;
                    if (i3 != 0) {
                        abstractC10762.onEdgeTouched(i3, pointerId2);
                    }
                } else if (i2 == 2 && (viewM39805 = m39805((int) x2, (int) y2)) == this.f52228) {
                    m39816(pointerId2, viewM39805);
                }
            } else if (actionMasked == 6) {
                m39804(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f52223 != null && this.f52222 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if ((this.f52214 & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f52223[pointerId3];
                    float f2 = y3 - this.f52222[pointerId3];
                    View viewM39807 = m39805((int) x3, (int) y3);
                    boolean z = viewM39807 != null && m39798(f, f2, viewM39807);
                    if (z) {
                        int left = viewM39807.getLeft();
                        int i5 = (int) f;
                        int iClampViewPositionHorizontal = abstractC10762.clampViewPositionHorizontal(viewM39807, left + i5, i5);
                        int top = viewM39807.getTop();
                        int i6 = (int) f2;
                        int iClampViewPositionVertical = abstractC10762.clampViewPositionVertical(viewM39807, top + i6, i6);
                        int viewHorizontalDragRange = abstractC10762.getViewHorizontalDragRange(viewM39807);
                        int viewVerticalDragRange = abstractC10762.getViewVerticalDragRange(viewM39807);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        m39796(f, f2, pointerId3);
                        if (this.f52229 != 1 || (z && m39816(pointerId3, viewM39807))) {
                            break;
                        }
                    } else {
                        m39796(f, f2, pointerId3);
                        if (this.f52229 != 1) {
                            break;
                        }
                    }
                }
            }
            m39803(motionEvent);
        }
        return this.f52229 == 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39810(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m39813();
        }
        if (this.f52235 == null) {
            this.f52235 = VelocityTracker.obtain();
        }
        this.f52235.addMovement(motionEvent);
        AbstractC10762 abstractC10762 = this.f52224;
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM39805 = m39805((int) x, (int) y);
            m39801(x, y, pointerId);
            m39816(pointerId, viewM39805);
            int i3 = this.f52233[pointerId] & this.f52234;
            if (i3 != 0) {
                abstractC10762.onEdgeTouched(i3, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f52229 == 1) {
                m39800();
            }
            m39813();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f52229 == 1) {
                    this.f52219 = true;
                    abstractC10762.onViewReleased(this.f52228, 0.0f, 0.0f);
                    this.f52219 = false;
                    if (this.f52229 == 1) {
                        m39808(0);
                    }
                }
                m39813();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m39801(x2, y2, pointerId2);
                if (this.f52229 != 0) {
                    if (m39802(this.f52228, (int) x2, (int) y2)) {
                        m39816(pointerId2, this.f52228);
                        return;
                    }
                    return;
                } else {
                    m39816(pointerId2, m39805((int) x2, (int) y2));
                    int i4 = this.f52233[pointerId2] & this.f52234;
                    if (i4 != 0) {
                        abstractC10762.onEdgeTouched(i4, pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f52229 == 1 && pointerId3 == this.f52216) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f52216) {
                        View viewM39806 = m39805((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.f52228;
                        if (viewM39806 == view && m39816(pointerId4, view)) {
                            i = this.f52216;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m39800();
                }
            }
            m39804(pointerId3);
            return;
        }
        if (this.f52229 == 1) {
            int i5 = this.f52216;
            if (((this.f52214 & (1 << i5)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i5);
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f52227;
            int i6 = this.f52216;
            int i7 = (int) (x3 - fArr[i6]);
            int i8 = (int) (y3 - this.f52217[i6]);
            int left = this.f52228.getLeft() + i7;
            int top = this.f52228.getTop() + i8;
            int left2 = this.f52228.getLeft();
            int top2 = this.f52228.getTop();
            if (i7 != 0) {
                left = abstractC10762.clampViewPositionHorizontal(this.f52228, left, i7);
                C1717.m43571(left - left2, this.f52228);
            }
            int i9 = left;
            if (i8 != 0) {
                top = abstractC10762.clampViewPositionVertical(this.f52228, top, i8);
                C1717.m43578(top - top2, this.f52228);
            }
            int i10 = top;
            if (i7 != 0 || i8 != 0) {
                this.f52224.onViewPositionChanged(this.f52228, i9, i10, i9 - left2, i10 - top2);
            }
            m39803(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if ((this.f52214 & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i11);
                float y4 = motionEvent.getY(i11);
                float f = x4 - this.f52223[pointerId5];
                float f2 = y4 - this.f52222[pointerId5];
                m39796(f, f2, pointerId5);
                if (this.f52229 == 1) {
                    break;
                }
                View viewM39807 = m39805((int) x4, (int) y4);
                if (m39798(f, f2, viewM39807) && m39816(pointerId5, viewM39807)) {
                    break;
                }
            }
        }
        m39803(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ۡۧ֫] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    private void m39796(float f, float f2, int i) {
        int i2;
        boolean zM39797 = m39797(f, f2, i, 1);
        ?? r0 = zM39797;
        if (m39797(f2, f, i, 4)) {
            r0 = (zM39797 ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (m39797(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (m39797(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.f52225;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f52224.onEdgeDragStarted(r2, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m39797(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f52233[i] & i2) == i2 && (this.f52234 & i2) != 0 && (this.f52236[i] & i2) != i2 && (this.f52225[i] & i2) != i2) {
            float f3 = this.f52226;
            if (fAbs > f3 || fAbs2 > f3) {
                if (fAbs < fAbs2 * 0.5f && this.f52224.onEdgeLock(i2)) {
                    int[] iArr = this.f52236;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f52225[i] & i2) == 0 && fAbs > this.f52226) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m39798(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        AbstractC10762 abstractC10762 = this.f52224;
        boolean z = abstractC10762.getViewHorizontalDragRange(view) > 0;
        boolean z2 = abstractC10762.getViewVerticalDragRange(view) > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f52226;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f52226);
        }
        return z2 && Math.abs(f2) > ((float) this.f52226);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m39820() {
        int length = this.f52223.length;
        for (int i = 0; i < length; i++) {
            if ((this.f52214 & (1 << i)) != 0) {
                float f = this.f52227[i] - this.f52223[i];
                float f2 = this.f52217[i] - this.f52222[i];
                float f3 = (f2 * f2) + (f * f);
                int i2 = this.f52226;
                if (f3 > i2 * i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m39800() {
        VelocityTracker velocityTracker = this.f52235;
        float f = this.f52218;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f52235.getXVelocity(this.f52216);
        float f2 = this.f52231;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f52235.getYVelocity(this.f52216);
        float f3 = this.f52231;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f52219 = true;
        this.f52224.onViewReleased(this.f52228, xVelocity, f);
        this.f52219 = false;
        if (this.f52229 == 1) {
            m39808(0);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m39802(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m39805(int i, int i2) {
        ViewGroup viewGroup = this.f52232;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(this.f52224.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }
}
