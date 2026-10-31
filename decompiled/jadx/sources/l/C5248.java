package l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5248 extends C5372 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16435;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0308 f16436;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13132 f16437;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public View f16438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f16439;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f16440;

    @Override // l.InterfaceC20895
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11308(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C13132 c13132 = this.f16437;
        BooleanSupplier booleanSupplier = this.f16440;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f16435) {
                        if (motionEvent.getPointerCount() != 1 || booleanSupplier.getAsBoolean()) {
                            m15144();
                            return false;
                        }
                        View viewM15145 = m15145(motionEvent);
                        EnumC19360 enumC19360M15143 = m15143(viewM15145, motionEvent);
                        if (!enumC19360M15143.m44620()) {
                            if (enumC19360M15143.m44619()) {
                                c13132.requestDisallowInterceptTouchEvent(true);
                                this.f16438 = viewM15145;
                                return true;
                            }
                        } else if (viewM15145 != null && !this.f16439) {
                            this.f16439 = true;
                            this.f16435 = true;
                            viewM15145.performLongClick();
                            this.f16438 = null;
                            this.f16436.m1719();
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if ((actionMasked == 5 || actionMasked == 6) && !this.f16435) {
                        m15144();
                        return false;
                    }
                }
                return false;
            }
            m15144();
            return false;
        }
        View viewM15146 = m15145(motionEvent);
        boolean z = c13132.getScrollState() == 0 && !booleanSupplier.getAsBoolean() && motionEvent.getPointerCount() == 1 && viewM15146 != null;
        this.f16438 = null;
        this.f16439 = false;
        this.f16435 = false;
        this.f16436.m1720(viewM15146, motionEvent.getPointerId(0), motionEvent.getX(), motionEvent.getY(), z);
        return false;
    }

    @Override // l.InterfaceC20895
    /* JADX INFO: renamed from: ֫ */
    public final void mo11303(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f16435) {
                    return;
                }
                if (motionEvent.getPointerCount() != 1 || this.f16440.getAsBoolean()) {
                    m15144();
                    return;
                }
                View viewM15145 = m15145(motionEvent);
                EnumC19360 enumC19360M15143 = m15143(viewM15145, motionEvent);
                if (!enumC19360M15143.m44620()) {
                    if (enumC19360M15143.m44619()) {
                        this.f16437.requestDisallowInterceptTouchEvent(true);
                        this.f16438 = viewM15145;
                        return;
                    }
                    return;
                }
                if (viewM15145 == null || this.f16439) {
                    return;
                }
                this.f16439 = true;
                this.f16435 = true;
                viewM15145.performLongClick();
                this.f16438 = null;
                this.f16436.m1719();
                return;
            }
            if (actionMasked != 3) {
                if ((actionMasked == 5 || actionMasked == 6) && !this.f16435) {
                    m15144();
                    return;
                }
                return;
            }
        }
        m15144();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private EnumC19360 m15143(View view, MotionEvent motionEvent) {
        int i = 0;
        int pointerId = motionEvent.getPointerId(0);
        EnumC19360 enumC19360 = EnumC19360.NONE;
        while (true) {
            int historySize = motionEvent.getHistorySize();
            C0308 c0308 = this.f16436;
            if (i < historySize) {
                EnumC19360 enumC19360M1718 = c0308.m1718(view, motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), pointerId);
                if (enumC19360M1718.m44620()) {
                    return enumC19360M1718;
                }
                if (enumC19360M1718.m44619()) {
                    enumC19360 = enumC19360M1718;
                }
                i++;
            } else {
                EnumC19360 enumC19360M1719 = c0308.m1718(view, motionEvent.getX(), motionEvent.getY(), pointerId);
                return (enumC19360M1719.m44620() || enumC19360M1719.m44619()) ? enumC19360M1719 : enumC19360;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15144() {
        this.f16438 = null;
        this.f16439 = false;
        this.f16435 = false;
        this.f16436.m1719();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private View m15145(MotionEvent motionEvent) {
        View view = this.f16438;
        C13132 c13132 = this.f16437;
        if (view != null) {
            if (view.getParent() == c13132) {
                return this.f16438;
            }
            return null;
        }
        View viewFindChildViewUnder = c13132.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder == null || c13132.getChildAdapterPosition(viewFindChildViewUnder) == -1) {
            return null;
        }
        return viewFindChildViewUnder;
    }

    public C5248(C13132 c13132, BooleanSupplier booleanSupplier) {
        this.f16437 = c13132;
        this.f16440 = booleanSupplier;
        int scaledTouchSlop = ViewConfiguration.get(c13132.getContext()).getScaledTouchSlop();
        this.f16436 = new C0308(scaledTouchSlop, Math.max(scaledTouchSlop * 2, C11266.m27878(33.0f)));
    }
}
