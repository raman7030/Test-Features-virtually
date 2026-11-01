package p067l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ܰܺ */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC1532 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ */
    public final float f44531;

    /* JADX INFO: renamed from: ۙ */
    public final int f44532;

    /* JADX INFO: renamed from: ۛ */
    public Runnable f44533;

    /* JADX INFO: renamed from: ۤ */
    public final int[] f44534 = new int[2];

    /* JADX INFO: renamed from: ۫ */
    public final int f44535;

    /* JADX INFO: renamed from: ۬ */
    public final View f44536;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f44537;

    /* JADX INFO: renamed from: ᩸ */
    public int f44538;

    /* JADX INFO: renamed from: ᩹ */
    public Runnable f44539;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC1329 mo13521();

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo13522();

    public AbstractViewOnTouchListenerC1532(View view) {
        this.f44536 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f44531 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f44535 = tapTimeout;
        this.f44532 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C1462 c1462;
        boolean z2 = this.f44537;
        View view2 = this.f44536;
        if (!z2) {
            if (view2.isEnabled()) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.f44538 = motionEvent.getPointerId(0);
                    if (this.f44539 == null) {
                        this.f44539 = new RunnableC1427(this);
                    }
                    view2.postDelayed(this.f44539, this.f44535);
                    if (this.f44533 == null) {
                        this.f44533 = new RunnableC1987(this);
                    }
                    view2.postDelayed(this.f44533, this.f44532);
                } else if (actionMasked == 1) {
                    m35432();
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f44538);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f44531;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m35432();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = mo13522();
                        }
                    }
                } else if (actionMasked == 3) {
                    m35432();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        } else {
            InterfaceC1329 interfaceC1329Mo13521 = mo13521();
            if (interfaceC1329Mo13521 == null || !interfaceC1329Mo13521.isShowing() || (c1462 = (C1462) interfaceC1329Mo13521.mo10603()) == null || !c1462.isShown()) {
                if (mo35433()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f44534;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c1462.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM32746 = c1462.m32746(motionEventObtainNoHistory, this.f44538);
                motionEventObtainNoHistory.recycle();
                int actionMasked2 = motionEvent.getActionMasked();
                boolean z3 = (actionMasked2 == 1 || actionMasked2 == 3) ? false : true;
                if (zM32746 && z3) {
                    z = true;
                } else if (mo35433()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        this.f44537 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f44537 = false;
        this.f44538 = -1;
        Runnable runnable = this.f44539;
        if (runnable != null) {
            this.f44536.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo35433() {
        InterfaceC1329 interfaceC1329Mo13521 = mo13521();
        if (interfaceC1329Mo13521 == null || !interfaceC1329Mo13521.isShowing()) {
            return true;
        }
        interfaceC1329Mo13521.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m35432() {
        Runnable runnable = this.f44533;
        View view = this.f44536;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f44539;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35434() {
        m35432();
        View view = this.f44536;
        if (view.isEnabled() && !view.isLongClickable() && mo13522()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f44537 = true;
        }
    }
}
