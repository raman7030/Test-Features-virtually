package p067l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import bin.p000mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes4.dex */
public class C21103 extends View {

    /* JADX INFO: renamed from: ܶ֫ */
    public static final /* synthetic */ int f66308 = 0;

    /* JADX INFO: renamed from: ᩸֫ */
    public static boolean f66309 = true;

    /* JADX INFO: renamed from: ֡֫ */
    public EnumC20432 f66310;

    /* JADX INFO: renamed from: ֨֫ */
    public PorterDuffColorFilter f66311;

    /* JADX INFO: renamed from: ֫֫ */
    public C14784 f66312;

    /* JADX INFO: renamed from: ۖ֫ */
    public final C5009 f66313;

    /* JADX INFO: renamed from: ۗ */
    public float f66314;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f66315;

    /* JADX INFO: renamed from: ۙ */
    public View f66316;

    /* JADX INFO: renamed from: ۚ֫ */
    public long f66317;

    /* JADX INFO: renamed from: ۛ */
    public boolean f66318;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f66319;

    /* JADX INFO: renamed from: ۟ */
    public View f66320;

    /* JADX INFO: renamed from: ۠֫ */
    public final int f66321;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f66322;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f66323;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f66324;

    /* JADX INFO: renamed from: ۧ֫ */
    public View f66325;

    /* JADX INFO: renamed from: ۨ */
    public boolean f66326;

    /* JADX INFO: renamed from: ۫ */
    public VelocityTracker f66327;

    /* JADX INFO: renamed from: ۬ */
    public C9032 f66328;

    /* JADX INFO: renamed from: ܰ */
    public float f66329;

    /* JADX INFO: renamed from: ܳ֫ */
    public final Rect f66330;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f66331;

    /* JADX INFO: renamed from: ܽ֫ */
    public VelocityTracker f66332;

    /* JADX INFO: renamed from: ܿ֫ */
    public Drawable f66333;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f66334;

    /* JADX INFO: renamed from: ᩴ֫ */
    public AbstractC11044 f66335;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f66336;

    /* JADX INFO: renamed from: ᩶ */
    public C16407 f66337;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f66338;

    /* JADX INFO: renamed from: ᩸ */
    public final HandlerC3235 f66339;

    /* JADX INFO: renamed from: ᩹ */
    public Activity f66340;

    /* JADX INFO: renamed from: ᩺ */
    public float f66341;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f66342;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47711(C21103 c21103, float f) {
        if (c21103.f66314 != f) {
            c21103.f66314 = f;
            c21103.invalidate();
        }
        C14784 c14784 = c21103.f66312;
        if (c14784 != null) {
            int iM33731 = c14784.m33731(c21103.f66325);
            int i = c21103.f66314 == 0.0f ? 0 : 1;
            if (iM33731 != i) {
                c21103.f66312.m33745(i, c21103.f66325);
            }
        }
    }

    public C21103(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [l.ۜ᩷ۡ] */
    public C21103(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66324 = new ArrayList(5);
        this.f66313 = new C5009();
        this.f66310 = EnumC20432.STATE_1;
        this.f66332 = VelocityTracker.obtain();
        this.f66327 = VelocityTracker.obtain();
        this.f66328 = new InterfaceC25125() { // from class: l.ۜ᩷ۡ
            @Override // p067l.InterfaceC25125
            /* JADX INFO: renamed from: ֫ */
            public final void mo20903(float f) {
                C21103.m47711(this.f24512, f);
            }
        };
        this.f66331 = true;
        this.f66339 = new HandlerC3235(this, new C9179());
        this.f66330 = new Rect();
        this.f66321 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (!isInEditMode()) {
            m47721();
            if (f66309) {
                f66309 = false;
                postDelayed(new RunnableC22444(), 62124L);
            }
        }
        this.f66340 = C7453.m17221(context);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47720(boolean z) {
        if (this.f66331 != z) {
            this.f66331 = z;
            if (getPaddingBottom() != 0) {
                requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m47728() {
        return Math.max(getHeight() - (this.f66331 ? getPaddingBottom() : 0), 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47725(int i) {
        if (i != getPaddingBottom()) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m47722() {
        Activity activity;
        String string = ApplicationC21448.f67650.getString("bottom_toolbar_padding_type", "0");
        string.getClass();
        switch (string) {
            case "0":
                if (Build.VERSION.SDK_INT >= 24 && (activity = this.f66340) != null && activity.isInMultiWindowMode()) {
                    m47725(0);
                    break;
                } else {
                    if (C9406.m21902(getContext())) {
                        m47725(C13076.m29939(ApplicationC21448.f67650.getInt("bottom_toolbar_padding_bottom", 12)));
                    } else {
                        m47725(0);
                    }
                    break;
                }
                break;
            case "1":
                m47725(C13076.m29939(ApplicationC21448.f67650.getInt("bottom_toolbar_padding_bottom", 12)));
                break;
            case "2":
                m47725(0);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d A[PHI: r6
      0x002d: PHI (r6v7 int) = (r6v3 int), (r6v11 int) binds: [B:14:0x0050, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min((int) getContext().getResources().getDimension(R.dimen.MT_Protector), size - (this.f66331 ? getPaddingBottom() : 0));
            if (this.f66331) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        } else if (mode != 1073741824) {
            iMin = (int) getContext().getResources().getDimension(R.dimen.MT_Protector);
            if (this.f66331) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        }
        setMeasuredDimension(defaultSize, size);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m47721() {
        Context context = getContext();
        PorterDuffColorFilter porterDuffColorFilterM35830 = C15766.m35830(C1059.m14953(context.getResources(), R.color.MT_Protector, context.getTheme()));
        this.f66311 = porterDuffColorFilterM35830;
        Drawable drawable = this.f66333;
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilterM35830);
        }
        this.f66313.m10642(C23223.m51761(-12566464, -2697514));
        Iterator it = this.f66324.iterator();
        while (it.hasNext()) {
            ((AbstractC11044) it.next()).mo14514();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m47727() {
        return this.f66310 == EnumC20432.STATE_1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m47733() {
        return this.f66310 == EnumC20432.STATE_2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m47732() {
        EnumC20432 enumC20432 = this.f66310;
        if (enumC20432 == EnumC20432.STATE_2 || enumC20432 == EnumC20432.STATE_1_2) {
            this.f66310 = EnumC20432.STATE_2_1;
            this.f66317 = System.currentTimeMillis();
            int i = C1717.f57146;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m47723() {
        EnumC20432 enumC20432 = this.f66310;
        if (enumC20432 == EnumC20432.STATE_1 || enumC20432 == EnumC20432.STATE_2_1) {
            this.f66310 = EnumC20432.STATE_1_2;
            this.f66317 = System.currentTimeMillis();
            int i = C1717.f57146;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47729(int i, int i2) {
        String string = getContext().getString(i2);
        C0988 c0988 = new C0988(getContext());
        float width = getWidth() / this.f66324.size();
        c0988.mo6618(this, (int) ((width * i) + (width / 2.0f)), m47728() / 2, true, string);
        C7050.m16213(new RunnableC24165(2, c0988), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m47731() {
        return this.f66336;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11044 m47714(int i) {
        return (AbstractC11044) this.f66324.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47717() {
        this.f66324.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17748 m47715(int i, int i2) {
        C17748 c17748 = new C17748(this, C0886.m5548(getContext(), i), C0886.m5548(getContext(), i2));
        this.f66324.add(c17748);
        return c17748;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17748 m47716(C20124 c20124) {
        C17748 c17748 = new C17748(this, c20124, C0886.m5548(getContext(), R.drawable.MT_Protector));
        this.f66324.add(c17748);
        return c17748;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47726(int i, int i2) {
        this.f66324.add(new C6350(this, C0886.m5548(getContext(), i), i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47718(C14784 c14784) {
        if (c14784 == null) {
            this.f66312 = null;
            this.f66325 = null;
            this.f66320 = null;
            return;
        }
        View viewM32049 = C14114.m32049(c14784, 8388611);
        View viewM320410 = C14114.m32049(c14784, 8388613);
        if (viewM32049 == null && viewM320410 == null) {
            throw new RuntimeException();
        }
        this.f66312 = c14784;
        this.f66325 = viewM32049;
        this.f66320 = viewM320410;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47719(C16407 c16407) {
        C16407 c16408 = this.f66337;
        if (c16408 == c16407) {
            this.f66316 = c16407.findViewById(R.id.MT_Protector);
            return;
        }
        C9032 c9032 = this.f66328;
        if (c16408 != null) {
            c16408.m37262(c9032);
        }
        this.f66337 = c16407;
        this.f66314 = 0.0f;
        if (c16407 != null) {
            this.f66316 = c16407.findViewById(R.id.MT_Protector);
            c16407.m37264((InterfaceC25125) c9032);
            if (this.f66333 == null) {
                Drawable drawableM5548 = C0886.m5548(getContext(), R.drawable.MT_Protector);
                this.f66333 = drawableM5548;
                drawableM5548.setColorFilter(this.f66311);
                return;
            }
            return;
        }
        this.f66316 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16407 m47724() {
        return this.f66337;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47710(C21103 c21103) {
        if (c21103.f66338) {
            return;
        }
        c21103.f66338 = true;
        if (c21103.performLongClick()) {
            c21103.performHapticFeedback(0);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m47730() {
        return this.f66322;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C14784 c14784;
        View view;
        C14784 c14785;
        View view2;
        AbstractC11044 abstractC11044;
        if (motionEvent.getAction() == 0) {
            this.f66318 = motionEvent.getY() > ((float) m47728());
        }
        if (!this.f66318) {
            int action = motionEvent.getAction();
            HandlerC3235 handlerC3235 = this.f66339;
            C5009 c5009 = this.f66313;
            float f = 0.0f;
            if (action == 0) {
                this.f66341 = motionEvent.getX();
                this.f66329 = motionEvent.getY();
                if (this.f66314 != 0.0f) {
                    this.f66338 = false;
                    this.f66326 = true;
                    this.f66335 = null;
                    c5009.m10644();
                } else {
                    this.f66326 = false;
                    ArrayList arrayList = this.f66324;
                    if (!arrayList.isEmpty()) {
                        int width = (int) (this.f66341 / (getWidth() / arrayList.size()));
                        this.f66336 = width;
                        if (width >= 0 && width < arrayList.size()) {
                            this.f66338 = false;
                            AbstractC11044 abstractC11045 = (AbstractC11044) arrayList.get(this.f66336);
                            this.f66335 = abstractC11045;
                            boolean zMo14513 = abstractC11045.mo14513();
                            boolean zMo14515 = this.f66335.mo14515();
                            if (zMo14513 || zMo14515) {
                                c5009.m10644();
                                this.f66315 = this.f66336;
                            }
                            if (zMo14515) {
                                handlerC3235.sendEmptyMessageDelayed(0, ViewConfiguration.getLongPressTimeout());
                            }
                        } else {
                            this.f66335 = null;
                        }
                    } else {
                        this.f66335 = null;
                    }
                }
                invalidate();
                return true;
            }
            VelocityTracker velocityTracker = this.f66327;
            VelocityTracker velocityTracker2 = this.f66332;
            if (action == 1) {
                handlerC3235.removeMessages(0);
                if (this.f66323) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker2.getXVelocity();
                    if (xVelocity >= 1000.0f) {
                        c14785 = this.f66312;
                        view2 = this.f66325;
                    } else if (xVelocity > -1000.0f && this.f66334 > 0.4f) {
                        c14785 = this.f66312;
                        view2 = this.f66325;
                    } else {
                        c14784 = this.f66312;
                        view = this.f66325;
                        c14784.m33736(view, true);
                    }
                    c14785.m33750(view2);
                } else if (this.f66319) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float f2 = -velocityTracker2.getXVelocity();
                    if (f2 >= 1000.0f) {
                        c14785 = this.f66312;
                        view2 = this.f66320;
                    } else if (f2 > -1000.0f && this.f66334 > 0.4f) {
                        c14785 = this.f66312;
                        view2 = this.f66320;
                    } else {
                        c14784 = this.f66312;
                        view = this.f66320;
                        c14784.m33736(view, true);
                    }
                    c14785.m33750(view2);
                } else if (this.f66326) {
                    if (!this.f66338) {
                        this.f66337.m37269();
                    }
                    c5009.m10641();
                } else if (this.f66342) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float yVelocity = velocityTracker.getYVelocity();
                    if (yVelocity <= -1000.0f) {
                        this.f66337.m37265();
                    } else if (yVelocity < 1000.0f && this.f66314 > 0.4f) {
                        this.f66337.m37265();
                    } else {
                        this.f66337.m37269();
                    }
                }
                c5009.m10646();
                if (!this.f66338 && (abstractC11044 = this.f66335) != null && abstractC11044.mo14513()) {
                    performClick();
                }
                this.f66323 = false;
                this.f66319 = false;
                velocityTracker2.clear();
                this.f66334 = 0.0f;
                this.f66342 = false;
                velocityTracker.clear();
                invalidate();
                return true;
            }
            if (action == 2) {
                if (!this.f66338) {
                    float x = this.f66341 - motionEvent.getX();
                    float y = this.f66329 - motionEvent.getY();
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f3 = this.f66321;
                    if (fAbs > f3 || fAbs2 > f3) {
                        if (this.f66326) {
                            c5009.m10641();
                        } else if (this.f66312 != null && fAbs > fAbs2) {
                            View view3 = this.f66325;
                            if (view3 == null || this.f66320 == null) {
                                if (view3 != null) {
                                    this.f66323 = true;
                                } else if (this.f66320 != null) {
                                    this.f66319 = true;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else if (x < 0.0f) {
                                this.f66323 = true;
                            } else {
                                this.f66319 = true;
                            }
                            c5009.m10646();
                        } else if (this.f66337 != null && fAbs <= fAbs2) {
                            this.f66342 = true;
                            c5009.m10641();
                            this.f66322 = this.f66341 < ((float) getWidth()) / 2.0f;
                        }
                        this.f66338 = true;
                        handlerC3235.removeMessages(0);
                        invalidate();
                    }
                }
                float f4 = 1.0f;
                if (this.f66323) {
                    velocityTracker2.addMovement(motionEvent);
                    float x2 = (motionEvent.getX() - this.f66341) / (getWidth() / 2.0f);
                    if (x2 <= 1.0f) {
                        f4 = x2 < 0.0f ? 0.0f : x2;
                    }
                    if (f4 == 0.0f) {
                        if (this.f66325.getVisibility() == 0) {
                            this.f66325.setVisibility(4);
                        }
                    } else if (this.f66325.getVisibility() == 4) {
                        this.f66325.setVisibility(0);
                    }
                    this.f66334 = f4;
                    C14114.m32050(this.f66312, this.f66325, f4);
                    return true;
                }
                if (this.f66319) {
                    velocityTracker2.addMovement(motionEvent);
                    float x3 = (this.f66341 - motionEvent.getX()) / (getWidth() / 2.0f);
                    if (x3 <= 1.0f) {
                        f4 = x3 < 0.0f ? 0.0f : x3;
                    }
                    if (f4 == 0.0f) {
                        if (this.f66320.getVisibility() == 0) {
                            this.f66320.setVisibility(4);
                        }
                    } else if (this.f66320.getVisibility() == 4) {
                        this.f66320.setVisibility(0);
                    }
                    this.f66334 = f4;
                    C14114.m32050(this.f66312, this.f66320, f4);
                    return true;
                }
                if (this.f66342) {
                    velocityTracker.addMovement(motionEvent);
                    View view4 = this.f66316;
                    float height = view4 == null ? 0.0f : view4.getHeight() / 1.5f;
                    if (height == 0.0f) {
                        height = m47728() * 2.0f;
                    }
                    float y2 = (this.f66329 - motionEvent.getY()) / height;
                    if (y2 > 1.0f) {
                        f = 1.0f;
                    } else if (y2 >= 0.0f) {
                        f = y2;
                    }
                    this.f66337.m37267(f);
                }
            } else if (action == 3) {
                if (this.f66323) {
                    this.f66312.m33750(this.f66325);
                }
                if (this.f66319) {
                    this.f66312.m33750(this.f66320);
                }
                if (this.f66342) {
                    this.f66337.m37269();
                    c5009.m10641();
                }
                c5009.m10646();
                handlerC3235.removeMessages(0);
                this.f66323 = false;
                this.f66319 = false;
                velocityTracker2.clear();
                this.f66334 = 0.0f;
                this.f66342 = false;
                velocityTracker.clear();
                invalidate();
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        ArrayList<AbstractC11044> arrayList = this.f66324;
        if (arrayList.isEmpty()) {
            return;
        }
        int iM47728 = m47728();
        float width = getWidth() / arrayList.size();
        float f3 = width / 2.0f;
        float f4 = iM47728 / 2.0f;
        canvas.clipRect(0, 0, getWidth(), iM47728);
        int i = C11715.f32671[this.f66310.ordinal()];
        if (i != 1) {
            if (i == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f66317;
                if (jCurrentTimeMillis >= 250) {
                    this.f66310 = EnumC20432.STATE_2;
                    f2 = 1.0f;
                } else {
                    f2 = jCurrentTimeMillis / 250.0f;
                    int i2 = C1717.f57146;
                    postInvalidateOnAnimation();
                }
            } else if (i == 3) {
                f2 = 1.0f;
            } else if (i != 4) {
                f2 = 0.0f;
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f66317;
                if (jCurrentTimeMillis2 >= 250) {
                    this.f66310 = EnumC20432.STATE_1;
                    f2 = 0.0f;
                } else {
                    int i3 = C1717.f57146;
                    postInvalidateOnAnimation();
                    f2 = 1.0f - (jCurrentTimeMillis2 / 250.0f);
                }
            }
            f = 2.0f;
        } else {
            f = 2.0f;
            f2 = 0.0f;
        }
        C5009 c5009 = this.f66313;
        if (c5009.m10645()) {
            if (this.f66326) {
                float width2 = getWidth() / f;
                if (c5009.m10643(canvas, (int) Math.round(Math.sqrt((width2 * width2) + (f4 * f4))), width2, f4)) {
                    int i4 = C1717.f57146;
                    postInvalidateOnAnimation();
                }
            } else {
                if (c5009.m10643(canvas, (int) Math.round(Math.sqrt((f3 * f3) + (f4 * f4))), (this.f66315 * width) + f3, f4)) {
                    int i5 = C1717.f57146;
                    postInvalidateOnAnimation();
                }
            }
        }
        float f5 = this.f66314;
        Rect rect = this.f66330;
        if (f5 <= 0.5f) {
            float f6 = 1.0f - (f5 * f);
            for (AbstractC11044 abstractC11044 : arrayList) {
                int iMo14512 = abstractC11044.mo14512();
                int iMo14509 = abstractC11044.mo14509();
                if (f5 != 0.0f) {
                    iMo14509 = (int) (iMo14509 * f6);
                }
                int i6 = (int) (f3 - (iMo14512 / f));
                rect.left = i6;
                rect.right = i6 + iMo14512;
                int i7 = (int) (f4 - (iMo14509 / f));
                rect.top = i7;
                rect.bottom = i7 + iMo14509;
                abstractC11044.mo14510(canvas, rect, f2, f6);
                f3 += width;
            }
        }
        if (f5 >= 0.5f) {
            Drawable drawable = this.f66333;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = (int) (((f5 * f) - 1.0f) * drawable.getIntrinsicHeight());
            int width3 = (getWidth() - intrinsicWidth) / 2;
            rect.left = width3;
            rect.right = width3 + intrinsicWidth;
            int i8 = (iM47728 - intrinsicHeight) / 2;
            rect.top = i8;
            rect.bottom = i8 + intrinsicHeight;
            drawable.setBounds(rect);
            drawable.setAlpha((int) ((f5 - 0.5f) * 153.0f * f));
            drawable.draw(canvas);
        }
    }
}
