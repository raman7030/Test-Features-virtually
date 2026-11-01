package p067l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.᩶ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 96WS */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC21350 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ */
    public final ViewGroup f67303;

    /* JADX INFO: renamed from: ۙ */
    public boolean f67304;

    /* JADX INFO: renamed from: ۛ */
    public float f67305;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f67306;

    /* JADX INFO: renamed from: ۟ */
    public boolean f67307;

    /* JADX INFO: renamed from: ۡ֫ */
    public final int f67308;

    /* JADX INFO: renamed from: ۤ */
    public float f67310;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f67311;

    /* JADX INFO: renamed from: ۨ */
    public float f67312;

    /* JADX INFO: renamed from: ۫ */
    public float f67313;

    /* JADX INFO: renamed from: ۬ */
    public float f67314;

    /* JADX INFO: renamed from: ܰ */
    public final int f67315;

    /* JADX INFO: renamed from: ܳ֫ */
    public float f67316;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f67317;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f67318;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f67319;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f67320;

    /* JADX INFO: renamed from: ᩶ */
    public float f67321;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f67322;

    /* JADX INFO: renamed from: ᩸ */
    public final View f67323;

    /* JADX INFO: renamed from: ᩹ */
    public float f67324;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f67325;

    /* JADX INFO: renamed from: ᩻֫ */
    public final InterfaceC14100 f67326;

    /* JADX INFO: renamed from: ۢ֫ */
    public C1388 f67309 = C1388.f36101;

    /* JADX INFO: renamed from: ֫֫ */
    public final RunnableC9950 f67302 = new Runnable() { // from class: l.۠ۚ᩷
        @Override // java.lang.Runnable
        public final void run() {
            this.f27545.m48362(true);
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [l.۠ۚ᩷] */
    public ViewOnTouchListenerC21350(View view, InterfaceC14100 interfaceC14100) {
        this.f67323 = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        this.f67303 = viewGroup;
        this.f67326 = interfaceC14100;
        this.f67315 = Math.round(view.getResources().getDisplayMetrics().density * 8.0f);
        this.f67319 = m48356(interfaceC14100.getFloat("hfpx", 0.0f));
        this.f67316 = m48356(interfaceC14100.getFloat("hfpy", 0.0f));
        this.f67308 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        int i = Build.VERSION.SDK_INT;
        int recommendedTimeoutMillis = EnumC4453.f9987;
        if (i >= 29 && accessibilityManager != null) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(EnumC4453.f9987, 5);
        }
        this.f67311 = recommendedTimeoutMillis;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.ܶۚ᩷
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ViewOnTouchListenerC21350.m48358(this.f48923, motionEvent);
            }
        });
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩸ۚ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f71576.m48360();
            }
        });
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩹ۚ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f74461.m48360();
            }
        });
        m48360();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48372(C1388 c1388) {
        this.f67309 = c1388;
        m48360();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48358(ViewOnTouchListenerC21350 viewOnTouchListenerC21350, MotionEvent motionEvent) {
        int i = viewOnTouchListenerC21350.f67308;
        View view = viewOnTouchListenerC21350.f67323;
        if (!viewOnTouchListenerC21350.f67307) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            viewOnTouchListenerC21350.f67304 = true;
            viewOnTouchListenerC21350.f67325 = false;
            viewOnTouchListenerC21350.f67324 = motionEvent.getRawX();
            viewOnTouchListenerC21350.f67321 = motionEvent.getRawY();
            viewOnTouchListenerC21350.f67305 = view.getX();
            viewOnTouchListenerC21350.f67312 = view.getY();
            viewOnTouchListenerC21350.m48369();
            return false;
        }
        if (!viewOnTouchListenerC21350.f67304) {
            return true;
        }
        if (actionMasked == 5) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            viewOnTouchListenerC21350.m48364();
            viewOnTouchListenerC21350.m48359();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z = viewOnTouchListenerC21350.f67325;
                viewOnTouchListenerC21350.m48364();
                viewOnTouchListenerC21350.m48359();
                return z;
            }
            return viewOnTouchListenerC21350.f67325;
        }
        float rawX = motionEvent.getRawX() - viewOnTouchListenerC21350.f67324;
        float rawY = motionEvent.getRawY() - viewOnTouchListenerC21350.f67321;
        if (!viewOnTouchListenerC21350.f67325) {
            float f = i;
            if (Math.abs(rawX) > f || Math.abs(rawY) > f) {
                viewOnTouchListenerC21350.f67325 = true;
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.setAction(3);
                view.onTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                viewOnTouchListenerC21350.f67303.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (viewOnTouchListenerC21350.f67325) {
            float fM48363 = viewOnTouchListenerC21350.m48363();
            float fM48370 = viewOnTouchListenerC21350.m48370();
            float fMax = Math.max(0.0f, viewOnTouchListenerC21350.m48367() - fM48363);
            float fMax2 = Math.max(0.0f, viewOnTouchListenerC21350.m48366() - fM48370);
            if (fMax > 0.0f) {
                viewOnTouchListenerC21350.f67319 = m48356(((viewOnTouchListenerC21350.f67305 + rawX) - fM48363) / fMax);
            }
            if (fMax2 > 0.0f) {
                viewOnTouchListenerC21350.f67316 = m48356(((viewOnTouchListenerC21350.f67312 + rawY) - fM48370) / fMax2);
            }
            viewOnTouchListenerC21350.f67320 = true;
            viewOnTouchListenerC21350.m48360();
        }
        return viewOnTouchListenerC21350.f67325;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48364() {
        this.f67304 = false;
        this.f67325 = false;
        this.f67303.requestDisallowInterceptTouchEvent(false);
        if (this.f67320) {
            this.f67326.edit().putFloat("hfpx", this.f67319).putFloat("hfpy", this.f67316).apply();
            this.f67320 = false;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private float m48363() {
        return Math.max(this.f67303.getPaddingLeft(), this.f67309.f36103) + this.f67315;
    }

    /* JADX INFO: renamed from: ᩻ */
    private float m48370() {
        return Math.max(this.f67303.getPaddingTop(), this.f67309.f36105) + this.f67315;
    }

    /* JADX INFO: renamed from: ᩳ */
    private float m48367() {
        ViewGroup viewGroup = this.f67303;
        return ((viewGroup.getWidth() - Math.max(viewGroup.getPaddingRight(), this.f67309.f36104)) - this.f67323.getLayoutParams().width) - this.f67315;
    }

    /* JADX INFO: renamed from: ܿ */
    private float m48366() {
        ViewGroup viewGroup = this.f67303;
        return ((viewGroup.getHeight() - Math.max(viewGroup.getPaddingBottom(), this.f67309.f36102)) - this.f67323.getLayoutParams().height) - this.f67315;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m48360() {
        ViewGroup viewGroup = this.f67303;
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            return;
        }
        float fMax = (Math.max(0.0f, m48367() - m48363()) * this.f67319) + m48363();
        View view = this.f67323;
        view.setX(fMax);
        view.setY((Math.max(0.0f, m48366() - m48370()) * this.f67316) + m48370());
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m48356(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48373(boolean z) {
        m48364();
        this.f67307 = z;
        this.f67317 = false;
        this.f67306 = false;
        if (z) {
            m48369();
        } else {
            m48362(false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f67307) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f67317 = true;
                this.f67318 = false;
                this.f67306 = false;
                this.f67313 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f67314 = y;
                this.f67310 = y;
                return false;
            }
            if (actionMasked == 1) {
                if (this.f67317 && !this.f67318 && motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
                    m48369();
                } else if (this.f67322) {
                    m48359();
                }
                this.f67317 = false;
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3 || actionMasked == 5) {
                    this.f67317 = false;
                    this.f67306 = false;
                    return false;
                }
            } else if (this.f67317) {
                float x = motionEvent.getX() - this.f67313;
                float y2 = motionEvent.getY() - this.f67310;
                float fAbs = Math.abs(x);
                float f = this.f67308;
                if (fAbs > f || Math.abs(y2) > f) {
                    this.f67318 = true;
                }
                if (this.f67318 && (this.f67306 || Math.abs(y2) > Math.abs(x))) {
                    this.f67306 = true;
                    float y3 = motionEvent.getY() - this.f67314;
                    if (Math.abs(y3) > f) {
                        this.f67314 = motionEvent.getY();
                        if (y3 > 0.0f) {
                            m48369();
                            return false;
                        }
                        m48362(true);
                        return false;
                    }
                    if (this.f67322) {
                        m48359();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48371() {
        if (this.f67307 && this.f67306 && this.f67322) {
            m48359();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m48369() {
        if (this.f67307) {
            if (!this.f67322) {
                View view = this.f67323;
                view.animate().withEndAction(null).cancel();
                view.setVisibility(0);
                m48360();
                view.animate().alpha(1.0f).setDuration(180L).start();
                this.f67322 = true;
            }
            m48359();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m48359() {
        View view = this.f67323;
        RunnableC9950 runnableC9950 = this.f67302;
        view.removeCallbacks(runnableC9950);
        if (this.f67307 && this.f67322 && !this.f67304) {
            view.postDelayed(runnableC9950, this.f67311);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m48362(boolean z) {
        RunnableC9950 runnableC9950 = this.f67302;
        View view = this.f67323;
        view.removeCallbacks(runnableC9950);
        if (!z || this.f67322) {
            this.f67322 = false;
            view.animate().withEndAction(null).cancel();
            if (z) {
                view.animate().alpha(0.0f).setDuration(180L).withEndAction(new RunnableC22474(1, this)).start();
            } else {
                view.setAlpha(0.0f);
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48357(ViewOnTouchListenerC21350 viewOnTouchListenerC21350) {
        if (viewOnTouchListenerC21350.f67322) {
            return;
        }
        viewOnTouchListenerC21350.f67323.setVisibility(8);
    }
}
