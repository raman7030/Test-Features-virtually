package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC13909 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float f41450;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41451;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Runnable f41452;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f41453 = new int[2];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f41454;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f41455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f41456;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f41457;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f41458;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC9825 mo11585();

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo11586();

    public AbstractViewOnTouchListenerC13909(View view) {
        this.f41455 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f41450 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f41454 = tapTimeout;
        this.f41451 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C12499 c12499;
        boolean z2 = this.f41456;
        View view2 = this.f41455;
        if (!z2) {
            if (view2.isEnabled()) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.f41457 = motionEvent.getPointerId(0);
                    if (this.f41458 == null) {
                        this.f41458 = new RunnableC11794(this);
                    }
                    view2.postDelayed(this.f41458, this.f41454);
                    if (this.f41452 == null) {
                        this.f41452 = new RunnableC23082(this);
                    }
                    view2.postDelayed(this.f41452, this.f41451);
                } else if (actionMasked == 1) {
                    m33313();
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f41457);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f41450;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m33313();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = mo11586();
                        }
                    }
                } else if (actionMasked == 3) {
                    m33313();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        } else {
            InterfaceC9825 interfaceC9825Mo11585 = mo11585();
            if (interfaceC9825Mo11585 == null || !interfaceC9825Mo11585.isShowing() || (c12499 = (C12499) interfaceC9825Mo11585.mo8540()) == null || !c12499.isShown()) {
                if (mo33314()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f41453;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c12499.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM30671 = c12499.m30671(motionEventObtainNoHistory, this.f41457);
                motionEventObtainNoHistory.recycle();
                int actionMasked2 = motionEvent.getActionMasked();
                boolean z3 = (actionMasked2 == 1 || actionMasked2 == 3) ? false : true;
                if (zM30671 && z3) {
                    z = true;
                } else if (mo33314()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        this.f41456 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f41456 = false;
        this.f41457 = -1;
        Runnable runnable = this.f41458;
        if (runnable != null) {
            this.f41455.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo33314() {
        InterfaceC9825 interfaceC9825Mo11585 = mo11585();
        if (interfaceC9825Mo11585 == null || !interfaceC9825Mo11585.isShowing()) {
            return true;
        }
        interfaceC9825Mo11585.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m33313() {
        Runnable runnable = this.f41452;
        View view = this.f41455;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f41458;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33315() {
        m33313();
        View view = this.f41455;
        if (view.isEnabled() && !view.isLongClickable() && mo11586()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f41456 = true;
        }
    }
}
