package p067l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7356 extends C7474 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f19274;

    /* JADX INFO: renamed from: ۧ */
    public final C2661 f19275;

    /* JADX INFO: renamed from: ܳ */
    public final C14849 f19276;

    /* JADX INFO: renamed from: ܽ */
    public View f19277;

    /* JADX INFO: renamed from: ܿ */
    public boolean f19278;

    /* JADX INFO: renamed from: ᩳ */
    public final BooleanSupplier f19279;

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13255(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C14849 c14849 = this.f19276;
        BooleanSupplier booleanSupplier = this.f19279;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f19274) {
                        if (motionEvent.getPointerCount() != 1 || booleanSupplier.getAsBoolean()) {
                            m17047();
                            return false;
                        }
                        View viewM17048 = m17048(motionEvent);
                        EnumC20768 enumC20768M17046 = m17046(viewM17048, motionEvent);
                        if (!enumC20768M17046.m46914()) {
                            if (enumC20768M17046.m46913()) {
                                c14849.requestDisallowInterceptTouchEvent(true);
                                this.f19277 = viewM17048;
                                return true;
                            }
                        } else if (viewM17048 != null && !this.f19278) {
                            this.f19278 = true;
                            this.f19274 = true;
                            viewM17048.performLongClick();
                            this.f19277 = null;
                            this.f19275.m4117();
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if ((actionMasked == 5 || actionMasked == 6) && !this.f19274) {
                        m17047();
                        return false;
                    }
                }
                return false;
            }
            m17047();
            return false;
        }
        View viewM17049 = m17048(motionEvent);
        boolean z = c14849.getScrollState() == 0 && !booleanSupplier.getAsBoolean() && motionEvent.getPointerCount() == 1 && viewM17049 != null;
        this.f19277 = null;
        this.f19278 = false;
        this.f19274 = false;
        this.f19275.m4118(viewM17049, motionEvent.getPointerId(0), motionEvent.getX(), motionEvent.getY(), z);
        return false;
    }

    @Override // p067l.InterfaceC22227
    /* JADX INFO: renamed from: ֫ */
    public final void mo13250(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f19274) {
                    return;
                }
                if (motionEvent.getPointerCount() != 1 || this.f19279.getAsBoolean()) {
                    m17047();
                    return;
                }
                View viewM17048 = m17048(motionEvent);
                EnumC20768 enumC20768M17046 = m17046(viewM17048, motionEvent);
                if (!enumC20768M17046.m46914()) {
                    if (enumC20768M17046.m46913()) {
                        this.f19276.requestDisallowInterceptTouchEvent(true);
                        this.f19277 = viewM17048;
                        return;
                    }
                    return;
                }
                if (viewM17048 == null || this.f19278) {
                    return;
                }
                this.f19278 = true;
                this.f19274 = true;
                viewM17048.performLongClick();
                this.f19277 = null;
                this.f19275.m4117();
                return;
            }
            if (actionMasked != 3) {
                if ((actionMasked == 5 || actionMasked == 6) && !this.f19274) {
                    m17047();
                    return;
                }
                return;
            }
        }
        m17047();
    }

    /* JADX INFO: renamed from: ֫ */
    private EnumC20768 m17046(View view, MotionEvent motionEvent) {
        int i = 0;
        int pointerId = motionEvent.getPointerId(0);
        EnumC20768 enumC20768 = EnumC20768.NONE;
        while (true) {
            int historySize = motionEvent.getHistorySize();
            C2661 c2661 = this.f19275;
            if (i < historySize) {
                EnumC20768 enumC20768M4116 = c2661.m4116(view, motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), pointerId);
                if (enumC20768M4116.m46914()) {
                    return enumC20768M4116;
                }
                if (enumC20768M4116.m46913()) {
                    enumC20768 = enumC20768M4116;
                }
                i++;
            } else {
                EnumC20768 enumC20768M4117 = c2661.m4116(view, motionEvent.getX(), motionEvent.getY(), pointerId);
                return (enumC20768M4117.m46914() || enumC20768M4117.m46913()) ? enumC20768M4117 : enumC20768;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17047() {
        this.f19277 = null;
        this.f19278 = false;
        this.f19274 = false;
        this.f19275.m4117();
    }

    /* JADX INFO: renamed from: ܽ */
    private View m17048(MotionEvent motionEvent) {
        View view = this.f19277;
        C14849 c14849 = this.f19276;
        if (view != null) {
            if (view.getParent() == c14849) {
                return this.f19277;
            }
            return null;
        }
        View viewFindChildViewUnder = c14849.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (viewFindChildViewUnder == null || c14849.getChildAdapterPosition(viewFindChildViewUnder) == -1) {
            return null;
        }
        return viewFindChildViewUnder;
    }

    public C7356(C14849 c14849, BooleanSupplier booleanSupplier) {
        this.f19276 = c14849;
        this.f19279 = booleanSupplier;
        int scaledTouchSlop = ViewConfiguration.get(c14849.getContext()).getScaledTouchSlop();
        this.f19275 = new C2661(scaledTouchSlop, Math.max(scaledTouchSlop * 2, C13076.m29939(33.0f)));
    }
}
