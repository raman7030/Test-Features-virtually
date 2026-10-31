package l;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.alipay.sdk.m.y.c;

/* JADX INFO: renamed from: l.ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95DO */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnLongClickListenerC5528 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC5528 f17107;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC5528 f17108;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f17109;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1294 f17112;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f17113;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f17114;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17116;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f17117;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17118;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final RunnableC19640 f17111 = new Runnable() { // from class: l.᩵ᩴ
        @Override // java.lang.Runnable
        public final void run() {
            this.f63383.m15672(false);
        }
    };

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RunnableC0588 f17115 = new RunnableC0588(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17110 = true;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15669(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528 = f17107;
        if (viewOnLongClickListenerC5528 != null && viewOnLongClickListenerC5528.f17117 == view) {
            m15670((ViewOnLongClickListenerC5528) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC5528 viewOnLongClickListenerC5529 = f17108;
            if (viewOnLongClickListenerC5529 != null && viewOnLongClickListenerC5529.f17117 == view) {
                viewOnLongClickListenerC5529.m15671();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC5528(view, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩵ᩴ] */
    public ViewOnLongClickListenerC5528(View view, CharSequence charSequence) {
        this.f17117 = view;
        this.f17113 = charSequence;
        this.f17114 = C21177.m48123(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f17118 = view.getWidth() / 2;
        this.f17116 = view.getHeight() / 2;
        m15672(true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f17112 == null || !this.f17109) {
            View view2 = this.f17117;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f17110 = true;
                        m15671();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f17112 == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.f17110) {
                        int iAbs = Math.abs(x - this.f17118);
                        int i = this.f17114;
                        if (iAbs > i || Math.abs(y - this.f17116) > i) {
                            this.f17118 = x;
                            this.f17116 = y;
                            this.f17110 = false;
                            m15670(this);
                        }
                    } else {
                        this.f17118 = x;
                        this.f17116 = y;
                        this.f17110 = false;
                        m15670(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m15671();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15672(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f17117;
        if (view.isAttachedToWindow()) {
            m15670((ViewOnLongClickListenerC5528) null);
            ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528 = f17108;
            if (viewOnLongClickListenerC5528 != null) {
                viewOnLongClickListenerC5528.m15671();
            }
            f17108 = this;
            this.f17109 = z;
            C1294 c1294 = new C1294(view.getContext());
            this.f17112 = c1294;
            c1294.mo4386(this.f17117, this.f17118, this.f17116, this.f17109, this.f17113);
            view.addOnAttachStateChangeListener(this);
            if (this.f17109) {
                j2 = 2500;
            } else {
                int i = C17648.f53953;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = c.a;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC0588 runnableC0588 = this.f17115;
            view.removeCallbacks(runnableC0588);
            view.postDelayed(runnableC0588, j2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15671() {
        ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528 = f17108;
        View view = this.f17117;
        if (viewOnLongClickListenerC5528 == this) {
            f17108 = null;
            C1294 c1294 = this.f17112;
            if (c1294 != null) {
                c1294.mo4385();
                this.f17112 = null;
                this.f17110 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f17107 == this) {
            m15670((ViewOnLongClickListenerC5528) null);
        }
        view.removeCallbacks(this.f17115);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15670(ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528) {
        ViewOnLongClickListenerC5528 viewOnLongClickListenerC5529 = f17107;
        if (viewOnLongClickListenerC5529 != null) {
            viewOnLongClickListenerC5529.f17117.removeCallbacks(viewOnLongClickListenerC5529.f17111);
        }
        f17107 = viewOnLongClickListenerC5528;
        if (viewOnLongClickListenerC5528 != null) {
            viewOnLongClickListenerC5528.f17117.postDelayed(viewOnLongClickListenerC5528.f17111, ViewConfiguration.getLongPressTimeout());
        }
    }
}
