package l;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19656 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f63447;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f63448;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f63449;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Point f63450;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Point f63451;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12392 f63452;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15545 f63453;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C18950 f63454;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11915 f63455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bundle f63456;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f63457;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23077 f63458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f63459;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f63460;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View.OnAttachStateChangeListener f63461;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21565 f63462;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f63463;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Handler f63464 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C22372 f63465;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18950 m45188() {
        return this.f63454;
    }

    public C19656(C22372 c22372, C11915 c11915, int i, C23077 c23077, boolean z) {
        this.f63465 = c22372;
        this.f63455 = c11915;
        this.f63447 = i;
        this.f63460 = z;
        C12392 c12392 = c22372.f72517;
        this.f63452 = c12392;
        this.f63453 = c22372.f72504;
        this.f63451 = c12392.m30472(c12392.m30444());
        this.f63450 = new Point(c12392.getScrollX(), c12392.m30408());
        this.f63456 = new Bundle(c22372.f5606);
        this.f63458 = c23077 == null ? null : c23077.m51238();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m45187() {
        FutureC3575 futureC3575 = this.f63449;
        if (futureC3575 != null && !futureC3575.m10931()) {
            return m45186();
        }
        this.f63449 = new FutureC3575();
        C21565 c21565 = this.f63462;
        C11915 c11915 = this.f63455;
        if (c21565 == null) {
            this.f63462 = this.f63452.m30307(c11915.f35630);
        }
        c11915.m29079().m10910((InterfaceC8017) new C6955(0, this));
        return m45186();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45180(C19656 c19656, Throwable th) {
        if (th == null) {
            c19656.m45184();
        } else {
            c19656.m45171(th);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Point m45189() {
        return new Point(this.f63451);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Point m45190() {
        return new Point(this.f63450);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m45186() {
        return this.f63449.m10921((InterfaceC21423) new C5368());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45185() {
        this.f63448 = true;
        if (this.f63459) {
            this.f63453.m36695();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m45184() {
        C15545 c15545 = this.f63453;
        try {
            boolean z = this.f63459;
            C11915 c11915 = this.f63455;
            if (!z) {
                if (!this.f63463) {
                    if (!this.f63452.m30356(c11915.f35630, this.f63462)) {
                        this.f63464.postDelayed(new RunnableC9778(this), 10L);
                        return;
                    }
                    this.f63463 = true;
                }
                C10130 c10130 = new C10130();
                C10130 c10131 = new C10130();
                c15545.m36688(c10130);
                c15545.m36681(c10131);
                this.f63456.putBoolean("changed", this.f63465.m50236(c11915.f35630.isChanged()));
                byte[] bArrM25444 = c10130.m25444();
                byte[] bArrM25445 = c10131.m25444();
                C13304 c13304M32268 = C13304.m32268(this.f63452, this.f63456, this.f63458, bArrM25444, bArrM25445, this.f63447, -1L, null);
                this.f63454 = new C18950(c13304M32268.m32278(), bArrM25444, bArrM25445);
                FutureC3575 futureC3575M52631 = c11915.f35622.m52631(c13304M32268);
                C23721 c23721Mo1601 = c11915.f35630.mo1601();
                C11003.requireNonNull(c23721Mo1601);
                futureC3575M52631.m10927((InterfaceC21423) new C12620(1, c23721Mo1601)).m10910((InterfaceC8017) new C10504(this));
                return;
            }
            c11915.m29069(this.f63457).m10910((InterfaceC8017) new C6270(this));
        } catch (Throwable th) {
            m45171(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45173(C19656 c19656, Long l2, Throwable th) {
        if (th != null) {
            c19656.m45171(th);
        } else if (c19656.f63455.f35630.mo1601().m52371() != l2.longValue()) {
            c19656.f63464.post(new RunnableC9778(c19656));
        } else {
            c19656.f63457 = l2.longValue();
            c19656.m45175();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m45175() {
        C11915 c11915 = this.f63455;
        boolean z = this.f63460;
        C12392 c12392 = this.f63452;
        if (z && c12392.isAttachedToWindow()) {
            if (this.f63461 == null) {
                ViewOnAttachStateChangeListenerC4133 viewOnAttachStateChangeListenerC4133 = new ViewOnAttachStateChangeListenerC4133(this);
                this.f63461 = viewOnAttachStateChangeListenerC4133;
                c12392.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4133);
                return;
            }
            return;
        }
        try {
            if (c11915.f35630.mo1601().m52371() != this.f63457) {
                m45184();
                return;
            }
            if (!c12392.m30399()) {
                this.f63464.postDelayed(new Runnable() { // from class: l.ۖᩴᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8494.m45175();
                    }
                }, 10L);
                return;
            }
            c12392.m30329((InterfaceC7785) c11915.f35630);
            this.f63459 = true;
            if (this.f63448) {
                this.f63453.m36695();
            }
            c11915.m29069(this.f63457).m10910((InterfaceC8017) new C6270(this));
        } catch (Throwable th) {
            m45171(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45174(C19656 c19656, Throwable th) {
        C12392 c12392 = c19656.f63452;
        if (th != null) {
            c19656.m45171(th);
            return;
        }
        c12392.m30412(false);
        c12392.m30342(c19656.f63462);
        c19656.f63465.m50224(c19656);
        c19656.f63449.m10912((Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45171(Throwable th) {
        if ((th instanceof C13452) && th.getCause() != null) {
            th = th.getCause();
        }
        this.f63449.m10914(th);
        this.f63465.m50225(this, th);
    }
}
