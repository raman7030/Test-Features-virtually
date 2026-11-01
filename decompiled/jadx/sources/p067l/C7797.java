package p067l;

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
import bin.p000mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۛ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2APP */
/* JADX INFO: loaded from: classes2.dex */
public class C7797 extends ViewGroup {

    /* JADX INFO: renamed from: ۢ֫ */
    public static final WeakHashMap f20440 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩷֫ */
    public static final /* synthetic */ int f20441 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public float f20442;

    /* JADX INFO: renamed from: ۗ */
    public final int[] f20443;

    /* JADX INFO: renamed from: ۙ */
    public boolean f20444;

    /* JADX INFO: renamed from: ۛ */
    public int f20445;

    /* JADX INFO: renamed from: ۜ֫ */
    public VelocityTracker f20446;

    /* JADX INFO: renamed from: ۟ */
    public int f20447;

    /* JADX INFO: renamed from: ۤ */
    public int f20448;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C12630 f20449;

    /* JADX INFO: renamed from: ۨ */
    public int f20450;

    /* JADX INFO: renamed from: ۫ */
    public int f20451;

    /* JADX INFO: renamed from: ۬ */
    public int f20452;

    /* JADX INFO: renamed from: ܰ */
    public final Paint f20453;

    /* JADX INFO: renamed from: ܳ֫ */
    public float f20454;

    /* JADX INFO: renamed from: ܽ֫ */
    public final ViewOnLongClickListenerC11555 f20455;

    /* JADX INFO: renamed from: ܿ֫ */
    public final float f20456;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final TabLayout f20457;

    /* JADX INFO: renamed from: ᩶ */
    public final Context f20458;

    /* JADX INFO: renamed from: ᩸ */
    public final C11830 f20459;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f20460;

    /* JADX INFO: renamed from: ᩺ */
    public int f20461;

    /* JADX INFO: renamed from: ᩻֫ */
    public float f20462;

    public C7797(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7797(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20455 = new ViewOnLongClickListenerC11555(1);
        this.f20443 = new int[2];
        this.f20446 = VelocityTracker.obtain();
        this.f20456 = ViewConfiguration.get(context).getScaledTouchSlop();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TabLayout tabLayout = (TabLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f20457 = tabLayout;
        C11830 c11830 = (C11830) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f20459 = c11830;
        C12630 c12630 = new C12630(context, null);
        this.f20449 = c12630;
        addView(tabLayout);
        addView(c11830);
        addView(c12630, -1, -2);
        tabLayout.setupWithViewPager(c12630);
        c12630.m4407(new InterfaceC17550() { // from class: l.۬֡ᩳ
            @Override // p067l.InterfaceC17550
            public final void onAdapterChanged(C2798 c2798, AbstractC13787 abstractC13787, AbstractC13787 abstractC13788) {
                C7797.m18040(this.f41401, c2798);
            }
        });
        Activity activityM17221 = C7453.m17221(context);
        this.f20458 = activityM17221 != null ? activityM17221 : context;
        Paint paint = new Paint();
        this.f20453 = paint;
        paint.setStyle(Paint.Style.FILL);
        m18043();
        m18044();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18040(C7797 c7797, C2798 c2798) {
        C11830 c11830 = c7797.f20459;
        c11830.getClass();
        C13045.m29867(c2798, "viewPager");
        AbstractC24766.m54438(c11830, c2798);
    }

    /* JADX INFO: renamed from: ܳ */
    private void m18043() {
        int i;
        int i2;
        if (isInEditMode()) {
            i = 1;
        } else {
            int i3 = C10199.f28276;
            i = ApplicationC21448.f67649.getInt("text_function_min_line", 1);
        }
        if (isInEditMode()) {
            i2 = 1;
        } else {
            int i4 = C10199.f28276;
            i2 = ApplicationC21448.f67649.getInt("text_function_max_line", 4);
        }
        int i5 = i >= 1 ? i : 1;
        if (i2 < i5) {
            i2 = i5;
        }
        if (this.f20450 == i5 && this.f20451 == i2) {
            return;
        }
        this.f20450 = i5;
        this.f20451 = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m18044() {
        int i;
        if (isInEditMode()) {
            i = 0;
        } else {
            int i2 = C10199.f28276;
            i = ApplicationC21448.f67649.getInt("tfgi", 0);
        }
        C11830 c11830 = this.f20459;
        TabLayout tabLayout = this.f20457;
        if (i == 0) {
            tabLayout.setVisibility(0);
            c11830.setVisibility(8);
        } else if (i == 1) {
            tabLayout.setVisibility(8);
            c11830.setVisibility(0);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.setVisibility(8);
            c11830.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        boolean zM14751;
        if (this.f20444) {
            this.f20444 = false;
            if (this.f20447 == i && View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        this.f20447 = i;
        C12630 c12630 = this.f20449;
        c12630.measure(i, 0);
        View view = this.f20457;
        if (view.getVisibility() != 8) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, 1073741824));
        } else {
            view = this.f20459;
            if (view.getVisibility() != 8) {
                view.measure(View.MeasureSpec.makeMeasureSpec(c12630.getMeasuredWidth(), Integer.MIN_VALUE), 0);
            } else {
                view = null;
            }
        }
        C3912 c3912M29044 = c12630.m29044();
        if (isInEditMode()) {
            int iM29042 = c12630.m29042();
            measuredHeight = c12630.getMeasuredHeight();
            i3 = iM29042;
        } else {
            int i4 = C10199.f28276;
            if (ApplicationC21448.f67649.getBoolean("tfugh", true)) {
                int iM29043 = c12630.m29042();
                measuredHeight = c12630.getMeasuredHeight();
                i3 = iM29043;
            } else if (c3912M29044 != null) {
                i3 = c3912M29044.f8496;
                measuredHeight = c3912M29044.f8498;
            } else {
                i3 = 0;
                measuredHeight = 0;
            }
        }
        int measuredHeight2 = view != null ? view.getMeasuredHeight() : 0;
        int iMin = Math.min(measuredHeight, this.f20450 * i3);
        int iMin2 = Math.min(measuredHeight, i3 * this.f20451);
        this.f20448 = iMin2;
        this.f20452 = iMin2 + measuredHeight2;
        this.f20445 = iMin;
        if (C6456.m14750()) {
            zM14751 = C6456.m14751();
        } else {
            zM14751 = f20440.get(this.f20458) == Boolean.TRUE;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), zM14751 ? this.f20452 : this.f20445);
        if (c3912M29044 != null) {
            C13162 c13162 = c3912M29044.f8497;
            int iMax = Math.max(0, c3912M29044.f8498 - this.f20448);
            if (c13162.getScrollY() > iMax) {
                c13162.setScrollY(iMax);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TabLayout tabLayout = this.f20457;
        int visibility = tabLayout.getVisibility();
        C12630 c12630 = this.f20449;
        if (visibility != 8) {
            int i5 = i4 - i2;
            int i6 = this.f20445;
            float f = (i5 - i6) / (this.f20452 - i6);
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
                        tabView.setOnLongClickListener(this.f20455);
                    }
                }
            }
            int measuredHeight = (int) (tabLayout.getMeasuredHeight() * f);
            c12630.layout(0, measuredHeight, i7, this.f20448 + measuredHeight);
            return;
        }
        int i9 = i3 - i;
        c12630.layout(0, 0, i9, this.f20448);
        C11830 c11830 = this.f20459;
        if (c11830.getVisibility() != 8) {
            int measuredWidth = c11830.getMeasuredWidth();
            int i10 = (i9 - measuredWidth) / 2;
            c11830.layout(i10, this.f20448, measuredWidth + i10, this.f20452);
            int[] iArr = this.f20443;
            getLocationOnScreen(iArr);
            if (getHeight() + iArr[1] == C13076.f36763.y) {
                if (c11830.getPaddingTop() == 0) {
                    int iM29939 = C13076.m29939(4.0f);
                    c11830.setPadding(0, iM29939, 0, iM29939);
                    return;
                }
                return;
            }
            if (c11830.getPaddingTop() != 0) {
                c11830.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C3912 c3912M29044 = this.f20449.m29044();
        if (c3912M29044 != null) {
            C13162 c13162 = c3912M29044.f8497;
            int iMax = Math.max(0, c3912M29044.f8498 - this.f20448);
            if (this.f20445 == this.f20452 && iMax == 0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    m18038(motionEvent);
                    float fAbs = Math.abs(motionEvent.getRawX() - this.f20454);
                    float fAbs2 = Math.abs(motionEvent.getRawY() - this.f20462);
                    if (fAbs2 > this.f20456 && fAbs2 > fAbs) {
                        this.f20460 = true;
                        this.f20442 = motionEvent.getRawY();
                        return true;
                    }
                }
                return false;
            }
            this.f20460 = false;
            this.f20454 = motionEvent.getRawX();
            this.f20462 = motionEvent.getRawY();
            c13162.m30152();
            this.f20446.clear();
            m18038(motionEvent);
            if (m18045() == this.f20452 && iMax != 0) {
                if (c13162.getScrollY() != 0 || this.f20452 == this.f20445) {
                    this.f20461 = 2;
                    return false;
                }
                this.f20461 = 0;
                return false;
            }
            this.f20461 = 1;
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3912 c3912M29044 = this.f20449.m29044();
        int i = 0;
        if (c3912M29044 != null) {
            C13162 c13162 = c3912M29044.f8497;
            int iMax = Math.max(0, c3912M29044.f8498 - this.f20448);
            if (!this.f20460) {
                if (this.f20445 != this.f20452 || iMax != 0) {
                    onInterceptTouchEvent(motionEvent);
                    return true;
                }
            } else {
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 2) {
                        m18038(motionEvent);
                        float rawY = motionEvent.getRawY() - this.f20442;
                        if (this.f20461 == 0) {
                            if (rawY > 0.0f) {
                                this.f20461 = 1;
                            } else if (rawY < 0.0f) {
                                this.f20461 = 2;
                            }
                        }
                        int i2 = this.f20461;
                        if (i2 == 1) {
                            int iM18045 = (int) (m18045() - (rawY * 1.2f));
                            int i3 = this.f20452;
                            if (iM18045 > i3 || iM18045 < (i3 = this.f20445)) {
                                iM18045 = i3;
                            }
                            m18041(iM18045);
                        } else if (i2 == 2) {
                            int scrollY = (int) (c13162.getScrollY() - rawY);
                            if (scrollY > iMax) {
                                i = iMax;
                            } else if (scrollY >= 0) {
                                i = scrollY;
                            }
                            if (i != c13162.getScrollY()) {
                                c13162.setScrollY(i);
                            } else if (rawY > 0.0f && i == 0) {
                                c13162.m30156(rawY / getHeight(), motionEvent.getX() / getWidth());
                            } else if (rawY < 0.0f && i == iMax) {
                                c13162.m30153((-rawY) / getHeight(), 1.0f - (motionEvent.getX() / getWidth()));
                            }
                        }
                        this.f20442 = motionEvent.getRawY();
                        return true;
                    }
                    if (action != 3) {
                        return true;
                    }
                }
                this.f20460 = false;
                c13162.m30157();
                VelocityTracker velocityTracker = this.f20446;
                velocityTracker.computeCurrentVelocity(1000);
                float yVelocity = velocityTracker.getYVelocity();
                if (this.f20461 == 2) {
                    c13162.m30154((int) (-yVelocity), iMax);
                    return true;
                }
                if (yVelocity <= -800.0f) {
                    m18052();
                    return true;
                }
                if (yVelocity >= 800.0f) {
                    m18046();
                    return true;
                }
                if (m18051() > 0.4f) {
                    m18052();
                    return true;
                }
                m18046();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18038(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getMetaState());
        this.f20446.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m18041(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams.height != i) {
            int i2 = this.f20445;
            Context context = this.f20458;
            WeakHashMap weakHashMap = f20440;
            if (i == i2) {
                weakHashMap.put(context, Boolean.FALSE);
                C6456.m14747(false);
            } else if (i == this.f20452) {
                weakHashMap.put(context, Boolean.TRUE);
                C6456.m14747(true);
            }
            layoutParams.height = i;
            this.f20444 = true;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m18045() {
        int i = getLayoutParams().height;
        return i < 0 ? getHeight() : i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18050(InterfaceC4811 interfaceC4811) {
        this.f20449.m4405(interfaceC4811);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18047(int i) {
        this.f20449.m4420(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m18051() {
        int iM18045 = m18045();
        int i = this.f20445;
        float f = iM18045 - i;
        float f2 = this.f20452 - i;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18052() {
        int iM18045 = m18045();
        int i = this.f20452;
        if (iM18045 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM18045, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) ((1.0f - m18051()) * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۤ֡ᩳ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f32987.m18041(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f20449.m29043();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18046() {
        int iM18045 = m18045();
        int i = this.f20445;
        if (iM18045 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM18045, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) (m18051() * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.۫֡ᩳ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f39091.m18041(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f20449.m29043();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18049(ArrayList arrayList, InterfaceC4244 interfaceC4244, C12096 c12096, C12096 c12097) {
        this.f20449.m29041(arrayList, interfaceC4244, c12096, c12097);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18048(ArrayList arrayList) {
        this.f20449.m29040(arrayList);
        m18043();
        m18044();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = C23223.f72994;
        Paint paint = this.f20453;
        paint.setColor(i);
        float scrollX = getScrollX();
        float width = scrollX + getWidth();
        float scrollY = getScrollY();
        canvas.drawRect(scrollX, scrollY, width, scrollY + 1.0f, paint);
    }
}
