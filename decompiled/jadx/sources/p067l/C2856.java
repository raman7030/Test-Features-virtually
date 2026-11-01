package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.֡ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5CA */
/* JADX INFO: loaded from: classes2.dex */
public class C2856 extends FrameLayout {

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final DecelerateInterpolator f4916 = new DecelerateInterpolator(10.0f);

    /* JADX INFO: renamed from: ֫֫ */
    public float f4917;

    /* JADX INFO: renamed from: ۗ */
    public float f4918;

    /* JADX INFO: renamed from: ۙ */
    public long f4919;

    /* JADX INFO: renamed from: ۛ */
    public float f4920;

    /* JADX INFO: renamed from: ۟ */
    public float f4921;

    /* JADX INFO: renamed from: ۤ */
    public FrameLayout f4922;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f4923;

    /* JADX INFO: renamed from: ۨ */
    public C24985 f4924;

    /* JADX INFO: renamed from: ۫ */
    public float f4925;

    /* JADX INFO: renamed from: ۬ */
    public View f4926;

    /* JADX INFO: renamed from: ܰ */
    public int f4927;

    /* JADX INFO: renamed from: ܽ֫ */
    public InterfaceC1962 f4928;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f4929;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f4930;

    /* JADX INFO: renamed from: ᩹ */
    public DecelerateInterpolator f4931;

    /* JADX INFO: renamed from: ᩺ */
    public C8892 f4932;

    public C2856(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4931 = new DecelerateInterpolator();
        this.f4928 = new InterfaceC1962() { // from class: l.ܺܺۡ
            @Override // p067l.InterfaceC1962
            /* JADX INFO: renamed from: ֫ */
            public final void mo40091(View view) {
                C2856.m4584(this.f52620);
            }
        };
        this.f4930 = true;
        this.f4923 = this.f4920 / 100.0f;
        this.f4919 = System.currentTimeMillis();
        m4585();
    }

    public C2856(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4931 = new DecelerateInterpolator();
        this.f4928 = new InterfaceC1962() { // from class: l.ܺܺۡ
            @Override // p067l.InterfaceC1962
            /* JADX INFO: renamed from: ֫ */
            public final void mo40091(View view) {
                C2856.m4584(this.f52620);
            }
        };
        this.f4930 = true;
        this.f4923 = this.f4920 / 100.0f;
        this.f4919 = System.currentTimeMillis();
        m4585();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m4585() {
        if (isInEditMode()) {
            return;
        }
        if (getChildCount() > 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f4927 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f4920 = TypedValue.applyDimension(1, 150.0f, getContext().getResources().getDisplayMetrics());
        post(new Runnable() { // from class: l.ۖܺۡ
            @Override // java.lang.Runnable
            public final void run() {
                C2856.m4582(this.f11095);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4582(C2856 c2856) {
        c2856.f4926 = c2856.getChildAt(0);
        FrameLayout frameLayout = new FrameLayout(c2856.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 48;
        frameLayout.setLayoutParams(layoutParams);
        c2856.f4922 = frameLayout;
        super.addView(frameLayout);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4584(C2856 c2856) {
        int translationY = (int) c2856.f4926.getTranslationY();
        c2856.f4922.getLayoutParams().height = translationY;
        c2856.f4922.requestLayout();
        C8892 c8892 = c2856.f4932;
        if (c8892 != null) {
            C11575 c11575 = c8892.f24099;
            c11575.f32243.m25156(translationY * 2);
            c11575.f32243.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m4586() {
        C1612 c1612M43544 = C1717.m43544(this.f4926);
        c1612M43544.m38765(0.0f);
        c1612M43544.m38761(this.f4931);
        c1612M43544.m38763(this.f4928);
        c1612M43544.m38767();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() >= 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f4926 = view;
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zCanScrollVertically;
        if (this.f4929) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4921 = motionEvent.getX();
            float y = motionEvent.getY();
            this.f4917 = y;
            this.f4925 = y;
            this.f4930 = false;
        } else if (action == 2) {
            if (this.f4930) {
                return true;
            }
            float x = motionEvent.getX();
            float y2 = motionEvent.getY() - this.f4917;
            float fAbs = Math.abs(x - this.f4921);
            if (y2 > this.f4927 && y2 > fAbs) {
                View view = this.f4926;
                if (view == null) {
                    zCanScrollVertically = false;
                } else {
                    zCanScrollVertically = ((view instanceof C11400) && ((C11400) view).m26367()) ? true : this.f4926.canScrollVertically(-1);
                }
                if (!zCanScrollVertically) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m4588(float f) {
        this.f4920 = f;
        this.f4923 = f / 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4929 || this.f4930) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (this.f4926 != null) {
                m4586();
            }
        } else if (action == 2) {
            float y = motionEvent.getY();
            this.f4925 = y;
            float f = y - this.f4918;
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.f4919) * this.f4923;
            if (f > 0.0f) {
                if (f > fCurrentTimeMillis) {
                    this.f4925 = this.f4918 + fCurrentTimeMillis;
                }
            } else if ((-f) > fCurrentTimeMillis) {
                this.f4925 = this.f4918 - fCurrentTimeMillis;
            }
            this.f4918 = this.f4925;
            this.f4919 = System.currentTimeMillis();
            float f2 = this.f4920 * 2.0f;
            float f3 = this.f4925 - this.f4917;
            float fMin = Math.min(f2, f3);
            float fMax = Math.max(f2, f3);
            float f4 = 0.0f <= fMin ? fMin : 0.0f;
            if (f4 < fMax) {
                fMax = f4;
            }
            if (this.f4926 != null) {
                float interpolation = (f4916.getInterpolation((fMax / this.f4920) / 2.0f) * fMax) / 2.0f;
                this.f4926.setTranslationY(interpolation);
                this.f4922.getLayoutParams().height = (int) interpolation;
                this.f4922.requestLayout();
                C8892 c8892 = this.f4932;
                if (c8892 != null) {
                    C11575 c11575 = c8892.f24099;
                    c11575.f32243.f30226 = true;
                    c11575.f32243.m25156((int) (interpolation * 2.0f));
                    c11575.f32243.invalidate();
                }
            }
            if (fMax == this.f4920 * 2.0f) {
                if (this.f4926 != null) {
                    m4586();
                    this.f4929 = true;
                    C24985 c24985 = this.f4924;
                    if (c24985 != null) {
                        C11575.m26643(c24985.f79756);
                    }
                } else {
                    m4586();
                }
                this.f4930 = true;
                return true;
            }
        } else {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f4926 != null) {
                m4586();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m4587() {
        if (this.f4930) {
            return;
        }
        if (this.f4926 != null) {
            m4586();
        }
        this.f4930 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m4589(InterfaceC20292 interfaceC20292) {
        this.f4924 = (C24985) interfaceC20292;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m4590(InterfaceC20963 interfaceC20963) {
        this.f4932 = (C8892) interfaceC20963;
    }

    /* JADX INFO: renamed from: ۧ */
    public void m4591() {
        if (this.f4926 != null) {
            m4586();
        }
        this.f4929 = false;
    }
}
