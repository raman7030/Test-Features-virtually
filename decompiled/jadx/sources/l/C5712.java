package l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۛ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2APP */
/* JADX INFO: loaded from: classes2.dex */
public class C5712 extends ViewGroup {

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f17594 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17595 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f17596;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int[] f17597;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17598;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f17599;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f17600;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f17601;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f17602;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C10797 f17603;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f17604;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f17605;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17606;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f17607;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f17608;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC9666 f17609;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final float f17610;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final TabLayout f17611;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Context f17612;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9956 f17613;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f17614;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f17615;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public float f17616;

    public C5712(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5712(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17609 = new ViewOnLongClickListenerC9666(1);
        this.f17597 = new int[2];
        this.f17600 = VelocityTracker.obtain();
        this.f17610 = ViewConfiguration.get(context).getScaledTouchSlop();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TabLayout tabLayout = (TabLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f17611 = tabLayout;
        C9956 c9956 = (C9956) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f17613 = c9956;
        C10797 c10797 = new C10797(context, null);
        this.f17603 = c10797;
        addView(tabLayout);
        addView(c9956);
        addView(c10797, -1, -2);
        tabLayout.setupWithViewPager(c10797);
        c10797.m2030(new InterfaceC15974() { // from class: l.۬֡ᩳ
            @Override // l.InterfaceC15974
            public final void onAdapterChanged(C0452 c0452, AbstractC12014 abstractC12014, AbstractC12014 abstractC12015) {
                C5712.m16121(this.f38361, c0452);
            }
        });
        Activity activityM15313 = C5350.m15313(context);
        this.f17612 = activityM15313 != null ? activityM15313 : context;
        Paint paint = new Paint();
        this.f17607 = paint;
        paint.setStyle(Paint.Style.FILL);
        m16124();
        m16125();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16121(C5712 c5712, C0452 c0452) {
        C9956 c9956 = c5712.f17613;
        c9956.getClass();
        C11233.m27805(c0452, "viewPager");
        AbstractC23567.m52036(c9956, c0452);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m16124() {
        int i;
        int i2;
        if (isInEditMode()) {
            i = 1;
        } else {
            int i3 = C8239.f25366;
            i = ApplicationC20075.f65008.getInt("text_function_min_line", 1);
        }
        if (isInEditMode()) {
            i2 = 1;
        } else {
            int i4 = C8239.f25366;
            i2 = ApplicationC20075.f65008.getInt("text_function_max_line", 4);
        }
        int i5 = i >= 1 ? i : 1;
        if (i2 < i5) {
            i2 = i5;
        }
        if (this.f17604 == i5 && this.f17605 == i2) {
            return;
        }
        this.f17604 = i5;
        this.f17605 = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m16125() {
        int i;
        if (isInEditMode()) {
            i = 0;
        } else {
            int i2 = C8239.f25366;
            i = ApplicationC20075.f65008.getInt("tfgi", 0);
        }
        C9956 c9956 = this.f17613;
        TabLayout tabLayout = this.f17611;
        if (i == 0) {
            tabLayout.setVisibility(0);
            c9956.setVisibility(8);
        } else if (i == 1) {
            tabLayout.setVisibility(8);
            c9956.setVisibility(0);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.setVisibility(8);
            c9956.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        boolean zM12887;
        if (this.f17598) {
            this.f17598 = false;
            if (this.f17601 == i && View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        this.f17601 = i;
        C10797 c10797 = this.f17603;
        c10797.measure(i, 0);
        View view = this.f17611;
        if (view.getVisibility() != 8) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, 1073741824));
        } else {
            view = this.f17613;
            if (view.getVisibility() != 8) {
                view.measure(View.MeasureSpec.makeMeasureSpec(c10797.getMeasuredWidth(), Integer.MIN_VALUE), 0);
            } else {
                view = null;
            }
        }
        C1624 c1624M26999 = c10797.m26999();
        if (isInEditMode()) {
            int iM26997 = c10797.m26997();
            measuredHeight = c10797.getMeasuredHeight();
            i3 = iM26997;
        } else {
            int i4 = C8239.f25366;
            if (ApplicationC20075.f65008.getBoolean("tfugh", true)) {
                int iM26998 = c10797.m26997();
                measuredHeight = c10797.getMeasuredHeight();
                i3 = iM26998;
            } else if (c1624M26999 != null) {
                i3 = c1624M26999.f5716;
                measuredHeight = c1624M26999.f5718;
            } else {
                i3 = 0;
                measuredHeight = 0;
            }
        }
        int measuredHeight2 = view != null ? view.getMeasuredHeight() : 0;
        int iMin = Math.min(measuredHeight, this.f17604 * i3);
        int iMin2 = Math.min(measuredHeight, i3 * this.f17605);
        this.f17602 = iMin2;
        this.f17606 = iMin2 + measuredHeight2;
        this.f17599 = iMin;
        if (C4301.m12886()) {
            zM12887 = C4301.m12887();
        } else {
            zM12887 = f17594.get(this.f17612) == Boolean.TRUE;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), zM12887 ? this.f17606 : this.f17599);
        if (c1624M26999 != null) {
            C11357 c11357 = c1624M26999.f5717;
            int iMax = Math.max(0, c1624M26999.f5718 - this.f17602);
            if (c11357.getScrollY() > iMax) {
                c11357.setScrollY(iMax);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TabLayout tabLayout = this.f17611;
        int visibility = tabLayout.getVisibility();
        C10797 c10797 = this.f17603;
        if (visibility != 8) {
            int i5 = i4 - i2;
            int i6 = this.f17599;
            float f = (i5 - i6) / (this.f17606 - i6);
            int i7 = i3 - i;
            tabLayout.layout(0, 0, i7, tabLayout.getMeasuredHeight());
            tabLayout.setAlpha(Math.max(0.0f, (f - 0.5f) * 2.0f));
            if (f == 0.0f) {
                if (tabLayout.getVisibility() != 4) {
                    tabLayout.setVisibility(4);
                }
            } else if (tabLayout.getVisibility() != 0) {
                tabLayout.setVisibility(0);
            }
            if (f == 1.0f) {
                for (int i8 = 0; i8 < tabLayout.getTabCount(); i8++) {
                    TabLayout.Tab tabAt = tabLayout.getTabAt(i8);
                    if (tabAt != null) {
                        TabLayout.TabView tabView = tabAt.view;
                        tabView.setTag(R.id.tabLayout, Integer.valueOf(i8));
                        tabView.setOnLongClickListener(this.f17609);
                    }
                }
            }
            int measuredHeight = (int) (tabLayout.getMeasuredHeight() * f);
            c10797.layout(0, measuredHeight, i7, this.f17602 + measuredHeight);
            return;
        }
        int i9 = i3 - i;
        c10797.layout(0, 0, i9, this.f17602);
        C9956 c9956 = this.f17613;
        if (c9956.getVisibility() != 8) {
            int measuredWidth = c9956.getMeasuredWidth();
            int i10 = (i9 - measuredWidth) / 2;
            c9956.layout(i10, this.f17602, measuredWidth + i10, this.f17606);
            int[] iArr = this.f17597;
            getLocationOnScreen(iArr);
            if (getHeight() + iArr[1] == C11266.f33763.y) {
                if (c9956.getPaddingTop() == 0) {
                    int iM27878 = C11266.m27878(4.0f);
                    c9956.setPadding(0, iM27878, 0, iM27878);
                    return;
                }
                return;
            }
            if (c9956.getPaddingTop() != 0) {
                c9956.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1624 c1624M26999 = this.f17603.m26999();
        if (c1624M26999 != null) {
            C11357 c11357 = c1624M26999.f5717;
            int iMax = Math.max(0, c1624M26999.f5718 - this.f17602);
            if (this.f17599 == this.f17606 && iMax == 0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    m16119(motionEvent);
                    float fAbs = Math.abs(motionEvent.getRawX() - this.f17608);
                    float fAbs2 = Math.abs(motionEvent.getRawY() - this.f17616);
                    if (fAbs2 > this.f17610 && fAbs2 > fAbs) {
                        this.f17614 = true;
                        this.f17596 = motionEvent.getRawY();
                        return true;
                    }
                }
                return false;
            }
            this.f17614 = false;
            this.f17608 = motionEvent.getRawX();
            this.f17616 = motionEvent.getRawY();
            c11357.m28108();
            this.f17600.clear();
            m16119(motionEvent);
            if (m16126() == this.f17606 && iMax != 0) {
                if (c11357.getScrollY() != 0 || this.f17606 == this.f17599) {
                    this.f17615 = 2;
                    return false;
                }
                this.f17615 = 0;
                return false;
            }
            this.f17615 = 1;
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1624 c1624M26999 = this.f17603.m26999();
        int i = 0;
        if (c1624M26999 != null) {
            C11357 c11357 = c1624M26999.f5717;
            int iMax = Math.max(0, c1624M26999.f5718 - this.f17602);
            if (!this.f17614) {
                if (this.f17599 != this.f17606 || iMax != 0) {
                    onInterceptTouchEvent(motionEvent);
                    return true;
                }
            } else {
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 2) {
                        m16119(motionEvent);
                        float rawY = motionEvent.getRawY() - this.f17596;
                        if (this.f17615 == 0) {
                            if (rawY > 0.0f) {
                                this.f17615 = 1;
                            } else if (rawY < 0.0f) {
                                this.f17615 = 2;
                            }
                        }
                        int i2 = this.f17615;
                        if (i2 == 1) {
                            int iM16126 = (int) (m16126() - (rawY * 1.2f));
                            int i3 = this.f17606;
                            if (iM16126 > i3 || iM16126 < (i3 = this.f17599)) {
                                iM16126 = i3;
                            }
                            m16122(iM16126);
                        } else if (i2 == 2) {
                            int scrollY = (int) (c11357.getScrollY() - rawY);
                            if (scrollY > iMax) {
                                i = iMax;
                            } else if (scrollY >= 0) {
                                i = scrollY;
                            }
                            if (i != c11357.getScrollY()) {
                                c11357.setScrollY(i);
                            } else if (rawY > 0.0f && i == 0) {
                                c11357.m28112(rawY / getHeight(), motionEvent.getX() / getWidth());
                            } else if (rawY < 0.0f && i == iMax) {
                                c11357.m28109((-rawY) / getHeight(), 1.0f - (motionEvent.getX() / getWidth()));
                            }
                        }
                        this.f17596 = motionEvent.getRawY();
                        return true;
                    }
                    if (action != 3) {
                        return true;
                    }
                }
                this.f17614 = false;
                c11357.m28113();
                VelocityTracker velocityTracker = this.f17600;
                velocityTracker.computeCurrentVelocity(1000);
                float yVelocity = velocityTracker.getYVelocity();
                if (this.f17615 == 2) {
                    c11357.m28110((int) (-yVelocity), iMax);
                    return true;
                }
                if (yVelocity <= -800.0f) {
                    m16133();
                    return true;
                }
                if (yVelocity >= 800.0f) {
                    m16127();
                    return true;
                }
                if (m16132() > 0.4f) {
                    m16133();
                    return true;
                }
                m16127();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16119(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getMetaState());
        this.f17600.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m16122(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams.height != i) {
            int i2 = this.f17599;
            Context context = this.f17612;
            WeakHashMap weakHashMap = f17594;
            if (i == i2) {
                weakHashMap.put(context, Boolean.FALSE);
                C4301.m12883(false);
            } else if (i == this.f17606) {
                weakHashMap.put(context, Boolean.TRUE);
                C4301.m12883(true);
            }
            layoutParams.height = i;
            this.f17598 = true;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m16126() {
        int i = getLayoutParams().height;
        return i < 0 ? getHeight() : i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16131(InterfaceC2570 interfaceC2570) {
        this.f17603.m2028(interfaceC2570);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16128(int i) {
        this.f17603.m2043(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m16132() {
        int iM16126 = m16126();
        int i = this.f17599;
        float f = iM16126 - i;
        float f2 = this.f17606 - i;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16133() {
        int iM16126 = m16126();
        int i = this.f17606;
        if (iM16126 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM16126, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) ((1.0f - m16132()) * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۤ֡ᩳ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f30030.m16122(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f17603.m26998();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16127() {
        int iM16126 = m16126();
        int i = this.f17599;
        if (iM16126 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM16126, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) (m16132() * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.۫֡ᩳ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f36080.m16122(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f17603.m26998();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16130(ArrayList arrayList, InterfaceC1973 interfaceC1973, C10235 c10235, C10235 c10236) {
        this.f17603.m26996(arrayList, interfaceC1973, c10235, c10236);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16129(ArrayList arrayList) {
        this.f17603.m26995(arrayList);
        m16124();
        m16125();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = C21943.f70283;
        Paint paint = this.f17607;
        paint.setColor(i);
        float scrollX = getScrollX();
        float width = scrollX + getWidth();
        float scrollY = getScrollY();
        canvas.drawRect(scrollX, scrollY, width, scrollY + 1.0f, paint);
    }
}
