package l;

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
import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes4.dex */
public class C19712 extends View {

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63677 = 0;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static boolean f63678 = true;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public EnumC19006 f63679;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f63680;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C13064 f63681;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C2778 f63682;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f63683;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f63684;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f63685;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public long f63686;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f63687;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f63688;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public View f63689;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final int f63690;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f63691;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f63692;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63693;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public View f63694;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f63695;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f63696;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7011 f63697;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f63698;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final Rect f63699;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f63700;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f63701;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public Drawable f63702;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f63703;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public AbstractC9128 f63704;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f63705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14771 f63706;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f63707;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HandlerC0912 f63708;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Activity f63709;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f63710;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f63711;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45407(C19712 c19712, float f) {
        if (c19712.f63683 != f) {
            c19712.f63683 = f;
            c19712.invalidate();
        }
        C13064 c13064 = c19712.f63681;
        if (c13064 != null) {
            int iM31644 = c13064.m31644(c19712.f63694);
            int i = c19712.f63683 == 0.0f ? 0 : 1;
            if (iM31644 != i) {
                c19712.f63681.m31658(i, c19712.f63694);
            }
        }
    }

    public C19712(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [l.ۜ᩷ۡ] */
    public C19712(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f63693 = new ArrayList(5);
        this.f63682 = new C2778();
        this.f63679 = EnumC19006.STATE_1;
        this.f63701 = VelocityTracker.obtain();
        this.f63696 = VelocityTracker.obtain();
        this.f63697 = new InterfaceC23944() { // from class: l.ۜ᩷ۡ
            @Override // l.InterfaceC23944
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo18946(float f) {
                C19712.m45407(this.f21631, f);
            }
        };
        this.f63700 = true;
        this.f63708 = new HandlerC0912(this, new C7166());
        this.f63699 = new Rect();
        this.f63690 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (!isInEditMode()) {
            m45417();
            if (f63678) {
                f63678 = false;
                postDelayed(new RunnableC21123(), 62124L);
            }
        }
        this.f63709 = C5350.m15313(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45416(boolean z) {
        if (this.f63700 != z) {
            this.f63700 = z;
            if (getPaddingBottom() != 0) {
                requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m45424() {
        return Math.max(getHeight() - (this.f63700 ? getPaddingBottom() : 0), 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45421(int i) {
        if (i != getPaddingBottom()) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m45418() {
        Activity activity;
        String string = ApplicationC20075.f65010.getString("bottom_toolbar_padding_type", "0");
        string.getClass();
        switch (string) {
            case "0":
                if (Build.VERSION.SDK_INT >= 24 && (activity = this.f63709) != null && activity.isInMultiWindowMode()) {
                    m45421(0);
                    break;
                } else {
                    if (C7405.m19928(getContext())) {
                        m45421(C11266.m27878(ApplicationC20075.f65010.getInt("bottom_toolbar_padding_bottom", 12)));
                    } else {
                        m45421(0);
                    }
                    break;
                }
                break;
            case "1":
                m45421(C11266.m27878(ApplicationC20075.f65010.getInt("bottom_toolbar_padding_bottom", 12)));
                break;
            case "2":
                m45421(0);
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
            iMin = Math.min((int) getContext().getResources().getDimension(R.dimen.MT_Protector), size - (this.f63700 ? getPaddingBottom() : 0));
            if (this.f63700) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        } else if (mode != 1073741824) {
            iMin = (int) getContext().getResources().getDimension(R.dimen.MT_Protector);
            if (this.f63700) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        }
        setMeasuredDimension(defaultSize, size);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m45417() {
        Context context = getContext();
        PorterDuffColorFilter porterDuffColorFilterM33704 = C14096.m33704(C4369.m13089(context.getResources(), R.color.MT_Protector, context.getTheme()));
        this.f63680 = porterDuffColorFilterM33704;
        Drawable drawable = this.f63702;
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilterM33704);
        }
        this.f63682.m8579(C21943.m49424(-12566464, -2697514));
        Iterator it = this.f63693.iterator();
        while (it.hasNext()) {
            ((AbstractC9128) it.next()).mo12638();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m45423() {
        return this.f63679 == EnumC19006.STATE_1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m45429() {
        return this.f63679 == EnumC19006.STATE_2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45428() {
        EnumC19006 enumC19006 = this.f63679;
        if (enumC19006 == EnumC19006.STATE_2 || enumC19006 == EnumC19006.STATE_1_2) {
            this.f63679 = EnumC19006.STATE_2_1;
            this.f63686 = System.currentTimeMillis();
            int i = C17648.f53953;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m45419() {
        EnumC19006 enumC19006 = this.f63679;
        if (enumC19006 == EnumC19006.STATE_1 || enumC19006 == EnumC19006.STATE_2_1) {
            this.f63679 = EnumC19006.STATE_1_2;
            this.f63686 = System.currentTimeMillis();
            int i = C17648.f53953;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45425(int i, int i2) {
        String string = getContext().getString(i2);
        C2937 c2937 = new C2937(getContext());
        float width = getWidth() / this.f63693.size();
        c2937.mo4386(this, (int) ((width * i) + (width / 2.0f)), m45424() / 2, true, string);
        C4925.m14316(new RunnableC22934(2, c2937), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m45427() {
        return this.f63705;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9128 m45410(int i) {
        return (AbstractC9128) this.f63693.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45413() {
        this.f63693.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16182 m45411(int i, int i2) {
        C16182 c16182 = new C16182(this, C0881.m3234(getContext(), i), C0881.m3234(getContext(), i2));
        this.f63693.add(c16182);
        return c16182;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16182 m45412(C18682 c18682) {
        C16182 c16182 = new C16182(this, c18682, C0881.m3234(getContext(), R.drawable.MT_Protector));
        this.f63693.add(c16182);
        return c16182;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45422(int i, int i2) {
        this.f63693.add(new C4189(this, C0881.m3234(getContext(), i), i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45414(C13064 c13064) {
        if (c13064 == null) {
            this.f63681 = null;
            this.f63694 = null;
            this.f63689 = null;
            return;
        }
        View viewM29988 = C12359.m29988(c13064, 8388611);
        View viewM29989 = C12359.m29988(c13064, 8388613);
        if (viewM29988 == null && viewM29989 == null) {
            throw new RuntimeException();
        }
        this.f63681 = c13064;
        this.f63694 = viewM29988;
        this.f63689 = viewM29989;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45415(C14771 c14771) {
        C14771 c14772 = this.f63706;
        if (c14772 == c14771) {
            this.f63685 = c14771.findViewById(R.id.MT_Protector);
            return;
        }
        C7011 c7011 = this.f63697;
        if (c14772 != null) {
            c14772.m35115(c7011);
        }
        this.f63706 = c14771;
        this.f63683 = 0.0f;
        if (c14771 != null) {
            this.f63685 = c14771.findViewById(R.id.MT_Protector);
            c14771.m35117((InterfaceC23944) c7011);
            if (this.f63702 == null) {
                Drawable drawableM3234 = C0881.m3234(getContext(), R.drawable.MT_Protector);
                this.f63702 = drawableM3234;
                drawableM3234.setColorFilter(this.f63680);
                return;
            }
            return;
        }
        this.f63685 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14771 m45420() {
        return this.f63706;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45406(C19712 c19712) {
        if (c19712.f63707) {
            return;
        }
        c19712.f63707 = true;
        if (c19712.performLongClick()) {
            c19712.performHapticFeedback(0);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m45426() {
        return this.f63691;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C13064 c13064;
        View view;
        C13064 c13065;
        View view2;
        AbstractC9128 abstractC9128;
        if (motionEvent.getAction() == 0) {
            this.f63687 = motionEvent.getY() > ((float) m45424());
        }
        if (!this.f63687) {
            int action = motionEvent.getAction();
            HandlerC0912 handlerC0912 = this.f63708;
            C2778 c2778 = this.f63682;
            float f = 0.0f;
            if (action == 0) {
                this.f63710 = motionEvent.getX();
                this.f63698 = motionEvent.getY();
                if (this.f63683 != 0.0f) {
                    this.f63707 = false;
                    this.f63695 = true;
                    this.f63704 = null;
                    c2778.m8581();
                } else {
                    this.f63695 = false;
                    ArrayList arrayList = this.f63693;
                    if (!arrayList.isEmpty()) {
                        int width = (int) (this.f63710 / (getWidth() / arrayList.size()));
                        this.f63705 = width;
                        if (width >= 0 && width < arrayList.size()) {
                            this.f63707 = false;
                            AbstractC9128 abstractC9129 = (AbstractC9128) arrayList.get(this.f63705);
                            this.f63704 = abstractC9129;
                            boolean zMo12637 = abstractC9129.mo12637();
                            boolean zMo12639 = this.f63704.mo12639();
                            if (zMo12637 || zMo12639) {
                                c2778.m8581();
                                this.f63684 = this.f63705;
                            }
                            if (zMo12639) {
                                handlerC0912.sendEmptyMessageDelayed(0, ViewConfiguration.getLongPressTimeout());
                            }
                        } else {
                            this.f63704 = null;
                        }
                    } else {
                        this.f63704 = null;
                    }
                }
                invalidate();
                return true;
            }
            VelocityTracker velocityTracker = this.f63696;
            VelocityTracker velocityTracker2 = this.f63701;
            if (action == 1) {
                handlerC0912.removeMessages(0);
                if (this.f63692) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker2.getXVelocity();
                    if (xVelocity >= 1000.0f) {
                        c13065 = this.f63681;
                        view2 = this.f63694;
                    } else if (xVelocity > -1000.0f && this.f63703 > 0.4f) {
                        c13065 = this.f63681;
                        view2 = this.f63694;
                    } else {
                        c13064 = this.f63681;
                        view = this.f63694;
                        c13064.m31649(view, true);
                    }
                    c13065.m31663(view2);
                } else if (this.f63688) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float f2 = -velocityTracker2.getXVelocity();
                    if (f2 >= 1000.0f) {
                        c13065 = this.f63681;
                        view2 = this.f63689;
                    } else if (f2 > -1000.0f && this.f63703 > 0.4f) {
                        c13065 = this.f63681;
                        view2 = this.f63689;
                    } else {
                        c13064 = this.f63681;
                        view = this.f63689;
                        c13064.m31649(view, true);
                    }
                    c13065.m31663(view2);
                } else if (this.f63695) {
                    if (!this.f63707) {
                        this.f63706.m35122();
                    }
                    c2778.m8578();
                } else if (this.f63711) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float yVelocity = velocityTracker.getYVelocity();
                    if (yVelocity <= -1000.0f) {
                        this.f63706.m35118();
                    } else if (yVelocity < 1000.0f && this.f63683 > 0.4f) {
                        this.f63706.m35118();
                    } else {
                        this.f63706.m35122();
                    }
                }
                c2778.m8583();
                if (!this.f63707 && (abstractC9128 = this.f63704) != null && abstractC9128.mo12637()) {
                    performClick();
                }
                this.f63692 = false;
                this.f63688 = false;
                velocityTracker2.clear();
                this.f63703 = 0.0f;
                this.f63711 = false;
                velocityTracker.clear();
                invalidate();
                return true;
            }
            if (action == 2) {
                if (!this.f63707) {
                    float x = this.f63710 - motionEvent.getX();
                    float y = this.f63698 - motionEvent.getY();
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f3 = this.f63690;
                    if (fAbs > f3 || fAbs2 > f3) {
                        if (this.f63695) {
                            c2778.m8578();
                        } else if (this.f63681 != null && fAbs > fAbs2) {
                            View view3 = this.f63694;
                            if (view3 == null || this.f63689 == null) {
                                if (view3 != null) {
                                    this.f63692 = true;
                                } else if (this.f63689 != null) {
                                    this.f63688 = true;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else if (x < 0.0f) {
                                this.f63692 = true;
                            } else {
                                this.f63688 = true;
                            }
                            c2778.m8583();
                        } else if (this.f63706 != null && fAbs <= fAbs2) {
                            this.f63711 = true;
                            c2778.m8578();
                            this.f63691 = this.f63710 < ((float) getWidth()) / 2.0f;
                        }
                        this.f63707 = true;
                        handlerC0912.removeMessages(0);
                        invalidate();
                    }
                }
                float f4 = 1.0f;
                if (this.f63692) {
                    velocityTracker2.addMovement(motionEvent);
                    float x2 = (motionEvent.getX() - this.f63710) / (getWidth() / 2.0f);
                    if (x2 <= 1.0f) {
                        f4 = x2 < 0.0f ? 0.0f : x2;
                    }
                    if (f4 == 0.0f) {
                        if (this.f63694.getVisibility() == 0) {
                            this.f63694.setVisibility(4);
                        }
                    } else if (this.f63694.getVisibility() == 4) {
                        this.f63694.setVisibility(0);
                    }
                    this.f63703 = f4;
                    C12359.m29989(this.f63681, this.f63694, f4);
                    return true;
                }
                if (this.f63688) {
                    velocityTracker2.addMovement(motionEvent);
                    float x3 = (this.f63710 - motionEvent.getX()) / (getWidth() / 2.0f);
                    if (x3 <= 1.0f) {
                        f4 = x3 < 0.0f ? 0.0f : x3;
                    }
                    if (f4 == 0.0f) {
                        if (this.f63689.getVisibility() == 0) {
                            this.f63689.setVisibility(4);
                        }
                    } else if (this.f63689.getVisibility() == 4) {
                        this.f63689.setVisibility(0);
                    }
                    this.f63703 = f4;
                    C12359.m29989(this.f63681, this.f63689, f4);
                    return true;
                }
                if (this.f63711) {
                    velocityTracker.addMovement(motionEvent);
                    View view4 = this.f63685;
                    float height = view4 == null ? 0.0f : view4.getHeight() / 1.5f;
                    if (height == 0.0f) {
                        height = m45424() * 2.0f;
                    }
                    float y2 = (this.f63698 - motionEvent.getY()) / height;
                    if (y2 > 1.0f) {
                        f = 1.0f;
                    } else if (y2 >= 0.0f) {
                        f = y2;
                    }
                    this.f63706.m35120(f);
                }
            } else if (action == 3) {
                if (this.f63692) {
                    this.f63681.m31663(this.f63694);
                }
                if (this.f63688) {
                    this.f63681.m31663(this.f63689);
                }
                if (this.f63711) {
                    this.f63706.m35122();
                    c2778.m8578();
                }
                c2778.m8583();
                handlerC0912.removeMessages(0);
                this.f63692 = false;
                this.f63688 = false;
                velocityTracker2.clear();
                this.f63703 = 0.0f;
                this.f63711 = false;
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
        ArrayList<AbstractC9128> arrayList = this.f63693;
        if (arrayList.isEmpty()) {
            return;
        }
        int iM45424 = m45424();
        float width = getWidth() / arrayList.size();
        float f3 = width / 2.0f;
        float f4 = iM45424 / 2.0f;
        canvas.clipRect(0, 0, getWidth(), iM45424);
        int i = C9834.f29718[this.f63679.ordinal()];
        if (i != 1) {
            if (i == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f63686;
                if (jCurrentTimeMillis >= 250) {
                    this.f63679 = EnumC19006.STATE_2;
                    f2 = 1.0f;
                } else {
                    f2 = jCurrentTimeMillis / 250.0f;
                    int i2 = C17648.f53953;
                    postInvalidateOnAnimation();
                }
            } else if (i == 3) {
                f2 = 1.0f;
            } else if (i != 4) {
                f2 = 0.0f;
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f63686;
                if (jCurrentTimeMillis2 >= 250) {
                    this.f63679 = EnumC19006.STATE_1;
                    f2 = 0.0f;
                } else {
                    int i3 = C17648.f53953;
                    postInvalidateOnAnimation();
                    f2 = 1.0f - (jCurrentTimeMillis2 / 250.0f);
                }
            }
            f = 2.0f;
        } else {
            f = 2.0f;
            f2 = 0.0f;
        }
        C2778 c2778 = this.f63682;
        if (c2778.m8582()) {
            if (this.f63695) {
                float width2 = getWidth() / f;
                if (c2778.m8580(canvas, (int) Math.round(Math.sqrt((width2 * width2) + (f4 * f4))), width2, f4)) {
                    int i4 = C17648.f53953;
                    postInvalidateOnAnimation();
                }
            } else {
                if (c2778.m8580(canvas, (int) Math.round(Math.sqrt((f3 * f3) + (f4 * f4))), (this.f63684 * width) + f3, f4)) {
                    int i5 = C17648.f53953;
                    postInvalidateOnAnimation();
                }
            }
        }
        float f5 = this.f63683;
        Rect rect = this.f63699;
        if (f5 <= 0.5f) {
            float f6 = 1.0f - (f5 * f);
            for (AbstractC9128 abstractC9128 : arrayList) {
                int iMo12636 = abstractC9128.mo12636();
                int iMo12633 = abstractC9128.mo12633();
                if (f5 != 0.0f) {
                    iMo12633 = (int) (iMo12633 * f6);
                }
                int i6 = (int) (f3 - (iMo12636 / f));
                rect.left = i6;
                rect.right = i6 + iMo12636;
                int i7 = (int) (f4 - (iMo12633 / f));
                rect.top = i7;
                rect.bottom = i7 + iMo12633;
                abstractC9128.mo12634(canvas, rect, f2, f6);
                f3 += width;
            }
        }
        if (f5 >= 0.5f) {
            Drawable drawable = this.f63702;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = (int) (((f5 * f) - 1.0f) * drawable.getIntrinsicHeight());
            int width3 = (getWidth() - intrinsicWidth) / 2;
            rect.left = width3;
            rect.right = width3 + intrinsicWidth;
            int i8 = (iM45424 - intrinsicHeight) / 2;
            rect.top = i8;
            rect.bottom = i8 + intrinsicHeight;
            drawable.setBounds(rect);
            drawable.setAlpha((int) ((f5 - 0.5f) * 153.0f * f));
            drawable.draw(canvas);
        }
    }
}
