package p067l;

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
public final class C5899 extends AbstractC9212 implements InterfaceC22227 {

    /* JADX INFO: renamed from: ۛ */
    public static final int[] f14518 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۤ */
    public static final int[] f14519 = new int[0];

    /* JADX INFO: renamed from: ֨ */
    public final ValueAnimator f14521;

    /* JADX INFO: renamed from: ֫ */
    public int f14522;

    /* JADX INFO: renamed from: ۗ */
    public final int f14524;

    /* JADX INFO: renamed from: ۙ */
    public int f14526;

    /* JADX INFO: renamed from: ۚ */
    public final int f14527;

    /* JADX INFO: renamed from: ۜ */
    public final int f14528;

    /* JADX INFO: renamed from: ۡ */
    public final int f14530;

    /* JADX INFO: renamed from: ۢ */
    public final Drawable f14531;

    /* JADX INFO: renamed from: ۫ */
    public final int f14533;

    /* JADX INFO: renamed from: ۬ */
    public final Drawable f14534;

    /* JADX INFO: renamed from: ܳ */
    public int f14535;

    /* JADX INFO: renamed from: ܶ */
    public float f14536;

    /* JADX INFO: renamed from: ܺ */
    public final int f14537;

    /* JADX INFO: renamed from: ܽ */
    public final Runnable f14538;

    /* JADX INFO: renamed from: ᩳ */
    public float f14540;

    /* JADX INFO: renamed from: ᩴ */
    public C14849 f14541;

    /* JADX INFO: renamed from: ᩶ */
    public final StateListDrawable f14543;

    /* JADX INFO: renamed from: ᩷ */
    public int f14544;

    /* JADX INFO: renamed from: ᩹ */
    public int f14546;

    /* JADX INFO: renamed from: ᩻ */
    public final StateListDrawable f14547;

    /* JADX INFO: renamed from: ֡ */
    public int f14520 = 0;

    /* JADX INFO: renamed from: ᩵ */
    public int f14542 = 0;

    /* JADX INFO: renamed from: ۘ */
    public boolean f14525 = false;

    /* JADX INFO: renamed from: ۖ */
    public boolean f14523 = false;

    /* JADX INFO: renamed from: ۠ */
    public int f14529 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f14532 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int[] f14545 = new int[2];

    /* JADX INFO: renamed from: ܿ */
    public final int[] f14539 = new int[2];

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ֫ */
    public final void mo13251(boolean z) {
    }

    public C5899(C14849 c14849, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14521 = valueAnimatorOfFloat;
        this.f14522 = 0;
        RunnableC11264 runnableC11264 = new RunnableC11264(this);
        this.f14538 = runnableC11264;
        C10593 c10593 = new C10593(this);
        this.f14543 = stateListDrawable;
        this.f14534 = drawable;
        this.f14547 = stateListDrawable2;
        this.f14531 = drawable2;
        this.f14524 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f14533 = Math.max(i, drawable.getIntrinsicWidth());
        this.f14528 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f14530 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f14527 = i2;
        this.f14537 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C17297(this));
        valueAnimatorOfFloat.addUpdateListener(new C4558(this));
        C14849 c148410 = this.f14541;
        if (c148410 == c14849) {
            return;
        }
        if (c148410 != null) {
            c148410.removeItemDecoration(this);
            this.f14541.removeOnItemTouchListener(this);
            this.f14541.removeOnScrollListener(c10593);
            this.f14541.removeCallbacks(runnableC11264);
        }
        this.f14541 = c14849;
        c14849.addItemDecoration(this);
        this.f14541.addOnItemTouchListener(this);
        this.f14541.addOnScrollListener(c10593);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13247() {
        this.f14541.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13248(int i) {
        C14849 c14849;
        int i2;
        Runnable runnable = this.f14538;
        StateListDrawable stateListDrawable = this.f14543;
        if (i == 2 && this.f14529 != 2) {
            stateListDrawable.setState(f14518);
            this.f14541.removeCallbacks(runnable);
        }
        if (i == 0) {
            m13247();
        } else {
            m13253();
        }
        if (this.f14529 == 2 && i != 2) {
            stateListDrawable.setState(f14519);
            this.f14541.removeCallbacks(runnable);
            c14849 = this.f14541;
            i2 = 1200;
        } else {
            if (i == 1) {
                this.f14541.removeCallbacks(runnable);
                c14849 = this.f14541;
                i2 = SnackbarManager.SHORT_DURATION_MS;
            }
            this.f14529 = i;
        }
        c14849.postDelayed(runnable, i2);
        this.f14529 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13254(float f, float f2) {
        int i = C1717.f57146;
        int layoutDirection = this.f14541.getLayoutDirection();
        int i2 = this.f14524;
        if (layoutDirection == 1) {
            if (f > i2) {
                return false;
            }
        } else if (f < this.f14520 - i2) {
            return false;
        }
        int i3 = this.f14546;
        int i4 = this.f14526 / 2;
        return f2 >= ((float) (i3 - i4)) && f2 <= ((float) (i4 + i3));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13253() {
        int i = this.f14522;
        ValueAnimator valueAnimator = this.f14521;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f14522 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // p067l.AbstractC9212
    public final void onDrawOver(Canvas canvas, C14849 c14849, C22897 c22897) {
        int i = this.f14520;
        C14849 c148410 = this.f14541;
        if (i != c148410.getWidth() || this.f14542 != c148410.getHeight()) {
            this.f14520 = c148410.getWidth();
            this.f14542 = c148410.getHeight();
            m13248(0);
            return;
        }
        if (this.f14522 != 0) {
            if (this.f14525) {
                int i2 = this.f14520;
                int i3 = this.f14524;
                int i4 = i2 - i3;
                int i5 = this.f14546;
                int i6 = this.f14526;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f14543;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f14533;
                int i9 = this.f14542;
                Drawable drawable = this.f14534;
                drawable.setBounds(0, 0, i8, i9);
                int i10 = C1717.f57146;
                if (c148410.getLayoutDirection() == 1) {
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
            if (this.f14523) {
                int i11 = this.f14542;
                int i12 = this.f14528;
                int i13 = i11 - i12;
                int i14 = this.f14535;
                int i15 = this.f14544;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f14547;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f14520;
                int i18 = this.f14530;
                Drawable drawable2 = this.f14531;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13249(int i, int i2) {
        int iComputeVerticalScrollRange = this.f14541.computeVerticalScrollRange();
        int i3 = this.f14542;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = this.f14527;
        this.f14525 = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = this.f14541.computeHorizontalScrollRange();
        int i6 = this.f14520;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        this.f14523 = z;
        boolean z2 = this.f14525;
        if (!z2 && !z) {
            if (this.f14529 != 0) {
                m13248(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f14546 = (int) ((((f / 2.0f) + i2) * f) / iComputeVerticalScrollRange);
            this.f14526 = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f14523) {
            float f2 = i6;
            this.f14535 = (int) ((((f2 / 2.0f) + i) * f2) / iComputeHorizontalScrollRange);
            this.f14544 = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = this.f14529;
        if (i7 == 0 || i7 == 1) {
            m13248(1);
        }
    }

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13255(MotionEvent motionEvent) {
        int i = this.f14529;
        if (i != 1) {
            return i == 2;
        }
        boolean zM13254 = m13254(motionEvent.getX(), motionEvent.getY());
        boolean zM13252 = m13252(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM13254 && !zM13252) {
            return false;
        }
        if (zM13252) {
            this.f14532 = 1;
            this.f14540 = (int) motionEvent.getX();
        } else if (zM13254) {
            this.f14532 = 2;
            this.f14536 = (int) motionEvent.getY();
        }
        m13248(2);
        return true;
    }

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ֫ */
    public final void mo13250(MotionEvent motionEvent) {
        if (this.f14529 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM13254 = m13254(motionEvent.getX(), motionEvent.getY());
            boolean zM13252 = m13252(motionEvent.getX(), motionEvent.getY());
            if (zM13254 || zM13252) {
                if (zM13252) {
                    this.f14532 = 1;
                    this.f14540 = (int) motionEvent.getX();
                } else if (zM13254) {
                    this.f14532 = 2;
                    this.f14536 = (int) motionEvent.getY();
                }
                m13248(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f14529 == 2) {
            this.f14536 = 0.0f;
            this.f14540 = 0.0f;
            m13248(1);
            this.f14532 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f14529 == 2) {
            m13253();
            int i = this.f14532;
            int i2 = this.f14537;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f14539;
                iArr[0] = i2;
                int i3 = this.f14520 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f14535 - fMax) >= 2.0f) {
                    int iM13246 = m13246(this.f14540, fMax, iArr, this.f14541.computeHorizontalScrollRange(), this.f14541.computeHorizontalScrollOffset(), this.f14520);
                    if (iM13246 != 0) {
                        this.f14541.scrollBy(iM13246, 0);
                    }
                    this.f14540 = fMax;
                }
            }
            if (this.f14532 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f14545;
                iArr2[0] = i2;
                int i4 = this.f14542 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f14546 - fMax2) < 2.0f) {
                    return;
                }
                int iM13247 = m13246(this.f14536, fMax2, iArr2, this.f14541.computeVerticalScrollRange(), this.f14541.computeVerticalScrollOffset(), this.f14542);
                if (iM13247 != 0) {
                    this.f14541.scrollBy(0, iM13247);
                }
                this.f14536 = fMax2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m13246(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13252(float f, float f2) {
        if (f2 < this.f14542 - this.f14528) {
            return false;
        }
        int i = this.f14535;
        int i2 = this.f14544;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }
}
