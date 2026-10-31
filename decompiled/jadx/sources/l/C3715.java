package l;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.google.android.material.snackbar.SnackbarManager;

/* JADX INFO: renamed from: l.ۘۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3715 extends AbstractC7201 implements InterfaceC20895 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f11717 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f11718 = new int[0];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f11720;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f11721;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f11723;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11725;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f11726;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f11727;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f11729;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Drawable f11730;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f11732;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Drawable f11733;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f11734;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f11735;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f11736;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f11737;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f11739;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13132 f11740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final StateListDrawable f11742;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f11743;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11745;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final StateListDrawable f11746;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f11719 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f11741 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f11724 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11722 = false;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f11728 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f11731 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f11744 = new int[2];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f11738 = new int[2];

    @Override // l.InterfaceC20895
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11304(boolean z) {
    }

    public C3715(C13132 c13132, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11720 = valueAnimatorOfFloat;
        this.f11721 = 0;
        RunnableC9360 runnableC9360 = new RunnableC9360(this);
        this.f11737 = runnableC9360;
        C8654 c8654 = new C8654(this);
        this.f11742 = stateListDrawable;
        this.f11733 = drawable;
        this.f11746 = stateListDrawable2;
        this.f11730 = drawable2;
        this.f11723 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f11732 = Math.max(i, drawable.getIntrinsicWidth());
        this.f11727 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f11729 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f11726 = i2;
        this.f11736 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C15708(this));
        valueAnimatorOfFloat.addUpdateListener(new C2304(this));
        C13132 c13133 = this.f11740;
        if (c13133 == c13132) {
            return;
        }
        if (c13133 != null) {
            c13133.removeItemDecoration(this);
            this.f11740.removeOnItemTouchListener(this);
            this.f11740.removeOnScrollListener(c8654);
            this.f11740.removeCallbacks(runnableC9360);
        }
        this.f11740 = c13132;
        c13132.addItemDecoration(this);
        this.f11740.addOnItemTouchListener(this);
        this.f11740.addOnScrollListener(c8654);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11300() {
        this.f11740.invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11301(int i) {
        C13132 c13132;
        int i2;
        Runnable runnable = this.f11737;
        StateListDrawable stateListDrawable = this.f11742;
        if (i == 2 && this.f11728 != 2) {
            stateListDrawable.setState(f11717);
            this.f11740.removeCallbacks(runnable);
        }
        if (i == 0) {
            m11300();
        } else {
            m11306();
        }
        if (this.f11728 == 2 && i != 2) {
            stateListDrawable.setState(f11718);
            this.f11740.removeCallbacks(runnable);
            c13132 = this.f11740;
            i2 = 1200;
        } else {
            if (i == 1) {
                this.f11740.removeCallbacks(runnable);
                c13132 = this.f11740;
                i2 = SnackbarManager.SHORT_DURATION_MS;
            }
            this.f11728 = i;
        }
        c13132.postDelayed(runnable, i2);
        this.f11728 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11307(float f, float f2) {
        int i = C17648.f53953;
        int layoutDirection = this.f11740.getLayoutDirection();
        int i2 = this.f11723;
        if (layoutDirection == 1) {
            if (f > i2) {
                return false;
            }
        } else if (f < this.f11719 - i2) {
            return false;
        }
        int i3 = this.f11745;
        int i4 = this.f11725 / 2;
        return f2 >= ((float) (i3 - i4)) && f2 <= ((float) (i4 + i3));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11306() {
        int i = this.f11721;
        ValueAnimator valueAnimator = this.f11720;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f11721 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // l.AbstractC7201
    public final void onDrawOver(Canvas canvas, C13132 c13132, C21600 c21600) {
        int i = this.f11719;
        C13132 c13133 = this.f11740;
        if (i != c13133.getWidth() || this.f11741 != c13133.getHeight()) {
            this.f11719 = c13133.getWidth();
            this.f11741 = c13133.getHeight();
            m11301(0);
            return;
        }
        if (this.f11721 != 0) {
            if (this.f11724) {
                int i2 = this.f11719;
                int i3 = this.f11723;
                int i4 = i2 - i3;
                int i5 = this.f11745;
                int i6 = this.f11725;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f11742;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f11732;
                int i9 = this.f11741;
                Drawable drawable = this.f11733;
                drawable.setBounds(0, 0, i8, i9);
                int i10 = C17648.f53953;
                if (c13133.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f11722) {
                int i11 = this.f11741;
                int i12 = this.f11727;
                int i13 = i11 - i12;
                int i14 = this.f11734;
                int i15 = this.f11743;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f11746;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f11719;
                int i18 = this.f11729;
                Drawable drawable2 = this.f11730;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11302(int i, int i2) {
        int iComputeVerticalScrollRange = this.f11740.computeVerticalScrollRange();
        int i3 = this.f11741;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = this.f11726;
        this.f11724 = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = this.f11740.computeHorizontalScrollRange();
        int i6 = this.f11719;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        this.f11722 = z;
        boolean z2 = this.f11724;
        if (!z2 && !z) {
            if (this.f11728 != 0) {
                m11301(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f11745 = (int) ((((f / 2.0f) + i2) * f) / iComputeVerticalScrollRange);
            this.f11725 = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f11722) {
            float f2 = i6;
            this.f11734 = (int) ((((f2 / 2.0f) + i) * f2) / iComputeHorizontalScrollRange);
            this.f11743 = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = this.f11728;
        if (i7 == 0 || i7 == 1) {
            m11301(1);
        }
    }

    @Override // l.InterfaceC20895
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo11308(MotionEvent motionEvent) {
        int i = this.f11728;
        if (i != 1) {
            return i == 2;
        }
        boolean zM11307 = m11307(motionEvent.getX(), motionEvent.getY());
        boolean zM11305 = m11305(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM11307 && !zM11305) {
            return false;
        }
        if (zM11305) {
            this.f11731 = 1;
            this.f11739 = (int) motionEvent.getX();
        } else if (zM11307) {
            this.f11731 = 2;
            this.f11735 = (int) motionEvent.getY();
        }
        m11301(2);
        return true;
    }

    @Override // l.InterfaceC20895
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11303(MotionEvent motionEvent) {
        if (this.f11728 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM11307 = m11307(motionEvent.getX(), motionEvent.getY());
            boolean zM11305 = m11305(motionEvent.getX(), motionEvent.getY());
            if (zM11307 || zM11305) {
                if (zM11305) {
                    this.f11731 = 1;
                    this.f11739 = (int) motionEvent.getX();
                } else if (zM11307) {
                    this.f11731 = 2;
                    this.f11735 = (int) motionEvent.getY();
                }
                m11301(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f11728 == 2) {
            this.f11735 = 0.0f;
            this.f11739 = 0.0f;
            m11301(1);
            this.f11731 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f11728 == 2) {
            m11306();
            int i = this.f11731;
            int i2 = this.f11736;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f11738;
                iArr[0] = i2;
                int i3 = this.f11719 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f11734 - fMax) >= 2.0f) {
                    int iM11299 = m11299(this.f11739, fMax, iArr, this.f11740.computeHorizontalScrollRange(), this.f11740.computeHorizontalScrollOffset(), this.f11719);
                    if (iM11299 != 0) {
                        this.f11740.scrollBy(iM11299, 0);
                    }
                    this.f11739 = fMax;
                }
            }
            if (this.f11731 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f11744;
                iArr2[0] = i2;
                int i4 = this.f11741 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f11745 - fMax2) < 2.0f) {
                    return;
                }
                int iM112910 = m11299(this.f11735, fMax2, iArr2, this.f11740.computeVerticalScrollRange(), this.f11740.computeVerticalScrollOffset(), this.f11741);
                if (iM112910 != 0) {
                    this.f11740.scrollBy(0, iM112910);
                }
                this.f11735 = fMax2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m11299(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11305(float f, float f2) {
        if (f2 < this.f11741 - this.f11727) {
            return false;
        }
        int i = this.f11734;
        int i2 = this.f11743;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }
}
