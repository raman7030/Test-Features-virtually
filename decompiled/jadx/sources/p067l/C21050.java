package p067l;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21050 {

    /* JADX INFO: renamed from: ֡ */
    public final int f66070;

    /* JADX INFO: renamed from: ֨ */
    public boolean f66071;

    /* JADX INFO: renamed from: ֫ */
    public FutureC5767 f66072;

    /* JADX INFO: renamed from: ۖ */
    public final Point f66073;

    /* JADX INFO: renamed from: ۘ */
    public final Point f66074;

    /* JADX INFO: renamed from: ۚ */
    public final C14146 f66075;

    /* JADX INFO: renamed from: ۜ */
    public final C17143 f66076;

    /* JADX INFO: renamed from: ۡ */
    public C20379 f66077;

    /* JADX INFO: renamed from: ۢ */
    public final C13693 f66078;

    /* JADX INFO: renamed from: ۧ */
    public final Bundle f66079;

    /* JADX INFO: renamed from: ܳ */
    public long f66080;

    /* JADX INFO: renamed from: ܺ */
    public final C24301 f66081;

    /* JADX INFO: renamed from: ܽ */
    public boolean f66082;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f66083;

    /* JADX INFO: renamed from: ᩳ */
    public View.OnAttachStateChangeListener f66084;

    /* JADX INFO: renamed from: ᩴ */
    public C22864 f66085;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f66086;

    /* JADX INFO: renamed from: ᩷ */
    public final Handler f66087 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩻ */
    public final C23631 f66088;

    /* JADX INFO: renamed from: ܽ */
    public final C20379 m47485() {
        return this.f66077;
    }

    public C21050(C23631 c23631, C13693 c13693, int i, C24301 c24301, boolean z) {
        this.f66088 = c23631;
        this.f66078 = c13693;
        this.f66070 = i;
        this.f66083 = z;
        C14146 c14146 = c23631.f75242;
        this.f66075 = c14146;
        this.f66076 = c23631.f75229;
        this.f66074 = c14146.m32536(c14146.m32508());
        this.f66073 = new Point(c14146.getScrollX(), c14146.m32472());
        this.f66079 = new Bundle(c23631.f8386);
        this.f66081 = c24301 == null ? null : c24301.m53631();
    }

    /* JADX INFO: renamed from: ܳ */
    public final FutureC5767 m47484() {
        FutureC5767 futureC5767 = this.f66072;
        if (futureC5767 != null && !futureC5767.m12908()) {
            return m47483();
        }
        this.f66072 = new FutureC5767();
        C22864 c22864 = this.f66085;
        C13693 c13693 = this.f66078;
        if (c22864 == null) {
            this.f66085 = this.f66075.m32371(c13693.f38639);
        }
        c13693.m31131().m12887((InterfaceC9988) new C8979(0, this));
        return m47483();
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m47477(C21050 c21050, Throwable th) {
        if (th == null) {
            c21050.m47481();
        } else {
            c21050.m47468(th);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final Point m47486() {
        return new Point(this.f66074);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Point m47487() {
        return new Point(this.f66073);
    }

    /* JADX INFO: renamed from: ۧ */
    public final FutureC5767 m47483() {
        return this.f66072.m12898((InterfaceC22729) new C7470());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47482() {
        this.f66071 = true;
        if (this.f66082) {
            this.f66076.m38856();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m47481() {
        C17143 c17143 = this.f66076;
        try {
            boolean z = this.f66082;
            C13693 c13693 = this.f66078;
            if (!z) {
                if (!this.f66086) {
                    if (!this.f66075.m32420(c13693.f38639, this.f66085)) {
                        this.f66087.postDelayed(new RunnableC11662(this), 10L);
                        return;
                    }
                    this.f66086 = true;
                }
                C11996 c11996 = new C11996();
                C11996 c11997 = new C11996();
                c17143.m38849(c11996);
                c17143.m38842(c11997);
                this.f66079.putBoolean("changed", this.f66088.m52576(c13693.f38639.isChanged()));
                byte[] bArrM27464 = c11996.m27464();
                byte[] bArrM27465 = c11997.m27464();
                C15013 c15013M34369 = C15013.m34369(this.f66075, this.f66079, this.f66081, bArrM27464, bArrM27465, this.f66070, -1L, null);
                this.f66077 = new C20379(c15013M34369.m34379(), bArrM27464, bArrM27465);
                FutureC5767 futureC5767M55040 = c13693.f38631.m55040(c15013M34369);
                C24913 c24913Mo3999 = c13693.f38639.mo3999();
                C12826.requireNonNull(c24913Mo3999);
                futureC5767M55040.m12904((InterfaceC22729) new C14363(1, c24913Mo3999)).m12887((InterfaceC9988) new C12352(this));
                return;
            }
            c13693.m31121(this.f66080).m12887((InterfaceC9988) new C8328(this));
        } catch (Throwable th) {
            m47468(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47470(C21050 c21050, Long l2, Throwable th) {
        if (th != null) {
            c21050.m47468(th);
        } else if (c21050.f66078.f38639.mo3999().m54774() != l2.longValue()) {
            c21050.f66087.post(new RunnableC11662(c21050));
        } else {
            c21050.f66080 = l2.longValue();
            c21050.m47472();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public void m47472() {
        C13693 c13693 = this.f66078;
        boolean z = this.f66083;
        C14146 c14146 = this.f66075;
        if (z && c14146.isAttachedToWindow()) {
            if (this.f66084 == null) {
                ViewOnAttachStateChangeListenerC6297 viewOnAttachStateChangeListenerC6297 = new ViewOnAttachStateChangeListenerC6297(this);
                this.f66084 = viewOnAttachStateChangeListenerC6297;
                c14146.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC6297);
                return;
            }
            return;
        }
        try {
            if (c13693.f38639.mo3999().m54774() != this.f66080) {
                m47481();
                return;
            }
            if (!c14146.m32463()) {
                this.f66087.postDelayed(new Runnable() { // from class: l.ۖᩴᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11289.m47472();
                    }
                }, 10L);
                return;
            }
            c14146.m32393((InterfaceC9768) c13693.f38639);
            this.f66082 = true;
            if (this.f66071) {
                this.f66076.m38856();
            }
            c13693.m31121(this.f66080).m12887((InterfaceC9988) new C8328(this));
        } catch (Throwable th) {
            m47468(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47471(C21050 c21050, Throwable th) {
        C14146 c14146 = c21050.f66075;
        if (th != null) {
            c21050.m47468(th);
            return;
        }
        c14146.m32476(false);
        c14146.m32406(c21050.f66085);
        c21050.f66088.m52564(c21050);
        c21050.f66072.m12889((Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47468(Throwable th) {
        if ((th instanceof C15154) && th.getCause() != null) {
            th = th.getCause();
        }
        this.f66072.m12891(th);
        this.f66088.m52565(this, th);
    }
}
