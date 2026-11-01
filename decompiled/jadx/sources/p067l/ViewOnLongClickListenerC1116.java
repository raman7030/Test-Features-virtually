package p067l;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.alipay.sdk.p010m.p058y.C0240c;

/* JADX INFO: renamed from: l.ۚᩴ */
/* JADX INFO: compiled from: 95DO */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnLongClickListenerC1116 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ */
    public static ViewOnLongClickListenerC1116 f19949;

    /* JADX INFO: renamed from: ᩺ */
    public static ViewOnLongClickListenerC1116 f19950;

    /* JADX INFO: renamed from: ۗ */
    public boolean f19951;

    /* JADX INFO: renamed from: ۤ */
    public C0906 f19954;

    /* JADX INFO: renamed from: ۨ */
    public final CharSequence f19955;

    /* JADX INFO: renamed from: ۫ */
    public final int f19956;

    /* JADX INFO: renamed from: ᩶ */
    public int f19958;

    /* JADX INFO: renamed from: ᩸ */
    public final View f19959;

    /* JADX INFO: renamed from: ᩹ */
    public int f19960;

    /* JADX INFO: renamed from: ۛ */
    public final RunnableC1816 f19953 = new Runnable() { // from class: l.᩵ᩴ
        @Override // java.lang.Runnable
        public final void run() {
            this.f66006.m17587(false);
        }
    };

    /* JADX INFO: renamed from: ۬ */
    public final RunnableC0871 f19957 = new RunnableC0871(this);

    /* JADX INFO: renamed from: ۙ */
    public boolean f19952 = true;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17584(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC1116 viewOnLongClickListenerC1116 = f19949;
        if (viewOnLongClickListenerC1116 != null && viewOnLongClickListenerC1116.f19959 == view) {
            m17585((ViewOnLongClickListenerC1116) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC1116 viewOnLongClickListenerC1117 = f19950;
            if (viewOnLongClickListenerC1117 != null && viewOnLongClickListenerC1117.f19959 == view) {
                viewOnLongClickListenerC1117.m17586();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC1116(view, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩵ᩴ] */
    public ViewOnLongClickListenerC1116(View view, CharSequence charSequence) {
        this.f19959 = view;
        this.f19955 = charSequence;
        this.f19956 = C1892.m50453(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f19960 = view.getWidth() / 2;
        this.f19958 = view.getHeight() / 2;
        m17587(true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f19954 == null || !this.f19951) {
            View view2 = this.f19959;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f19952 = true;
                        m17586();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f19954 == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.f19952) {
                        int iAbs = Math.abs(x - this.f19960);
                        int i = this.f19956;
                        if (iAbs > i || Math.abs(y - this.f19958) > i) {
                            this.f19960 = x;
                            this.f19958 = y;
                            this.f19952 = false;
                            m17585(this);
                        }
                    } else {
                        this.f19960 = x;
                        this.f19958 = y;
                        this.f19952 = false;
                        m17585(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m17586();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17587(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f19959;
        if (view.isAttachedToWindow()) {
            m17585((ViewOnLongClickListenerC1116) null);
            ViewOnLongClickListenerC1116 viewOnLongClickListenerC1116 = f19950;
            if (viewOnLongClickListenerC1116 != null) {
                viewOnLongClickListenerC1116.m17586();
            }
            f19950 = this;
            this.f19951 = z;
            C0906 c0906 = new C0906(view.getContext());
            this.f19954 = c0906;
            c0906.mo6618(this.f19959, this.f19960, this.f19958, this.f19951, this.f19955);
            view.addOnAttachStateChangeListener(this);
            if (this.f19951) {
                j2 = 2500;
            } else {
                int i = C1717.f57146;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = C0240c.f1145a;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC0871 runnableC0871 = this.f19957;
            view.removeCallbacks(runnableC0871);
            view.postDelayed(runnableC0871, j2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17586() {
        ViewOnLongClickListenerC1116 viewOnLongClickListenerC1116 = f19950;
        View view = this.f19959;
        if (viewOnLongClickListenerC1116 == this) {
            f19950 = null;
            C0906 c0906 = this.f19954;
            if (c0906 != null) {
                c0906.mo6617();
                this.f19954 = null;
                this.f19952 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f19949 == this) {
            m17585((ViewOnLongClickListenerC1116) null);
        }
        view.removeCallbacks(this.f19957);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17585(ViewOnLongClickListenerC1116 viewOnLongClickListenerC1116) {
        ViewOnLongClickListenerC1116 viewOnLongClickListenerC1117 = f19949;
        if (viewOnLongClickListenerC1117 != null) {
            viewOnLongClickListenerC1117.f19959.removeCallbacks(viewOnLongClickListenerC1117.f19953);
        }
        f19949 = viewOnLongClickListenerC1116;
        if (viewOnLongClickListenerC1116 != null) {
            viewOnLongClickListenerC1116.f19959.postDelayed(viewOnLongClickListenerC1116.f19953, ViewConfiguration.getLongPressTimeout());
        }
    }
}
