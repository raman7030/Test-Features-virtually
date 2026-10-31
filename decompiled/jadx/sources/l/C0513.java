package l;

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
public class C0513 extends FrameLayout {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f2143 = new DecelerateInterpolator(10.0f);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f2144;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f2145;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f2146;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f2147;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f2148;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FrameLayout f2149;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f2150;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23797 f2151;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f2152;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f2153;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f2154;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22587 f2155;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f2156;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2157;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DecelerateInterpolator f2158;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C6864 f2159;

    public C0513(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2158 = new DecelerateInterpolator();
        this.f2155 = new InterfaceC22587() { // from class: l.ܺܺۡ
            @Override // l.InterfaceC22587
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo37904(View view) {
                C0513.m2217(this.f49456);
            }
        };
        this.f2157 = true;
        this.f2150 = this.f2147 / 100.0f;
        this.f2146 = System.currentTimeMillis();
        m2218();
    }

    public C0513(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2158 = new DecelerateInterpolator();
        this.f2155 = new InterfaceC22587() { // from class: l.ܺܺۡ
            @Override // l.InterfaceC22587
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo37904(View view) {
                C0513.m2217(this.f49456);
            }
        };
        this.f2157 = true;
        this.f2150 = this.f2147 / 100.0f;
        this.f2146 = System.currentTimeMillis();
        m2218();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m2218() {
        if (isInEditMode()) {
            return;
        }
        if (getChildCount() > 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f2154 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f2147 = TypedValue.applyDimension(1, 150.0f, getContext().getResources().getDisplayMetrics());
        post(new Runnable() { // from class: l.ۖܺۡ
            @Override // java.lang.Runnable
            public final void run() {
                C0513.m2215(this.f8300);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2215(C0513 c0513) {
        c0513.f2153 = c0513.getChildAt(0);
        FrameLayout frameLayout = new FrameLayout(c0513.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 48;
        frameLayout.setLayoutParams(layoutParams);
        c0513.f2149 = frameLayout;
        super.addView(frameLayout);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m2217(C0513 c0513) {
        int translationY = (int) c0513.f2153.getTranslationY();
        c0513.f2149.getLayoutParams().height = translationY;
        c0513.f2149.requestLayout();
        C6864 c6864 = c0513.f2159;
        if (c6864 != null) {
            C9687 c9687 = c6864.f21220;
            c9687.f29293.m23212(translationY * 2);
            c9687.f29293.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m2219() {
        C15530 c15530M41298 = C17648.m41298(this.f2153);
        c15530M41298.m36605(0.0f);
        c15530M41298.m36601(this.f2158);
        c15530M41298.m36603(this.f2155);
        c15530M41298.m36607();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() >= 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f2153 = view;
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zCanScrollVertically;
        if (this.f2156) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2148 = motionEvent.getX();
            float y = motionEvent.getY();
            this.f2144 = y;
            this.f2152 = y;
            this.f2157 = false;
        } else if (action == 2) {
            if (this.f2157) {
                return true;
            }
            float x = motionEvent.getX();
            float y2 = motionEvent.getY() - this.f2144;
            float fAbs = Math.abs(x - this.f2148);
            if (y2 > this.f2154 && y2 > fAbs) {
                View view = this.f2153;
                if (view == null) {
                    zCanScrollVertically = false;
                } else {
                    zCanScrollVertically = ((view instanceof C9503) && ((C9503) view).m24357()) ? true : this.f2153.canScrollVertically(-1);
                }
                if (!zCanScrollVertically) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2221(float f) {
        this.f2147 = f;
        this.f2150 = f / 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2156 || this.f2157) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (this.f2153 != null) {
                m2219();
            }
        } else if (action == 2) {
            float y = motionEvent.getY();
            this.f2152 = y;
            float f = y - this.f2145;
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.f2146) * this.f2150;
            if (f > 0.0f) {
                if (f > fCurrentTimeMillis) {
                    this.f2152 = this.f2145 + fCurrentTimeMillis;
                }
            } else if ((-f) > fCurrentTimeMillis) {
                this.f2152 = this.f2145 - fCurrentTimeMillis;
            }
            this.f2145 = this.f2152;
            this.f2146 = System.currentTimeMillis();
            float f2 = this.f2147 * 2.0f;
            float f3 = this.f2152 - this.f2144;
            float fMin = Math.min(f2, f3);
            float fMax = Math.max(f2, f3);
            float f4 = 0.0f <= fMin ? fMin : 0.0f;
            if (f4 < fMax) {
                fMax = f4;
            }
            if (this.f2153 != null) {
                float interpolation = (f2143.getInterpolation((fMax / this.f2147) / 2.0f) * fMax) / 2.0f;
                this.f2153.setTranslationY(interpolation);
                this.f2149.getLayoutParams().height = (int) interpolation;
                this.f2149.requestLayout();
                C6864 c6864 = this.f2159;
                if (c6864 != null) {
                    C9687 c9687 = c6864.f21220;
                    c9687.f29293.f27291 = true;
                    c9687.f29293.m23212((int) (interpolation * 2.0f));
                    c9687.f29293.invalidate();
                }
            }
            if (fMax == this.f2147 * 2.0f) {
                if (this.f2153 != null) {
                    m2219();
                    this.f2156 = true;
                    C23797 c23797 = this.f2151;
                    if (c23797 != null) {
                        C9687.m24629(c23797.f77003);
                    }
                } else {
                    m2219();
                }
                this.f2157 = true;
                return true;
            }
        } else {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f2153 != null) {
                m2219();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2220() {
        if (this.f2157) {
            return;
        }
        if (this.f2153 != null) {
            m2219();
        }
        this.f2157 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2222(InterfaceC18859 interfaceC18859) {
        this.f2151 = (C23797) interfaceC18859;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2223(InterfaceC19565 interfaceC19565) {
        this.f2159 = (C6864) interfaceC19565;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m2224() {
        if (this.f2153 != null) {
            m2219();
        }
        this.f2156 = false;
    }
}
