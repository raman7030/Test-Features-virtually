package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܰ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C15802 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f45712;

    /* JADX INFO: renamed from: ۜ */
    public final BooleanSupplier f45713;

    /* JADX INFO: renamed from: ۡ */
    public final int f45714;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC9768 f45715;

    /* JADX INFO: renamed from: ۧ */
    public boolean f45716;

    /* JADX INFO: renamed from: ܳ */
    public final int f45717;

    /* JADX INFO: renamed from: ܺ */
    public final C14146 f45718;

    /* JADX INFO: renamed from: ܽ */
    public final C14853 f45719;

    /* JADX INFO: renamed from: ܿ */
    public final Handler f45720;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f45721;

    /* JADX INFO: renamed from: ᩷ */
    public final C11084 f45722;

    /* JADX INFO: renamed from: ᩻ */
    public final Runnable f45723;

    public C15802(C14146 c14146, AbstractActivityC5549 abstractActivityC5549, int i, BooleanSupplier booleanSupplier) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f45720 = handler;
        RunnableC24520 runnableC24520 = new RunnableC24520(this);
        this.f45723 = runnableC24520;
        this.f45718 = c14146;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        this.f45715 = interfaceC9768M32500;
        this.f45714 = interfaceC9768M32500.mo28581();
        this.f45717 = c14146.f40244;
        this.f45722 = C11084.m25529(c14146);
        this.f45713 = booleanSupplier;
        C14853 c14853 = abstractActivityC5549 == null ? null : new C14853(abstractActivityC5549, i);
        this.f45719 = c14853;
        if (c14853 != null) {
            c14853.m33952(new RunnableC22707(2, this));
            handler.postDelayed(new Runnable() { // from class: l.ۨ᩺ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C15802.m35866(this.f38983);
                }
            }, 300L);
        }
        handler.postDelayed(runnableC24520, 200L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m35866(C15802 c15802) {
        if (c15802.f45721 || !c15802.m35875()) {
            return;
        }
        c15802.f45719.m33956();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m35875() {
        if (this.f45712 || !this.f45722.m25532()) {
            return false;
        }
        InterfaceC9768 interfaceC9768M32500 = this.f45718.m32500();
        InterfaceC9768 interfaceC9768 = this.f45715;
        return interfaceC9768M32500 == interfaceC9768 && interfaceC9768.mo28581() == this.f45714 && this.f45718.f40244 == this.f45717 && this.f45713.getAsBoolean();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m35870() {
        if (this.f45712 || !this.f45722.m25532()) {
            return false;
        }
        return this.f45716 || m35875();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m35871() {
        return this.f45712;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35874() {
        if (this.f45712 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Editor search canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35872() {
        if (this.f45716) {
            return;
        }
        this.f45712 = true;
        m35873();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35869() {
        if (!m35875()) {
            return false;
        }
        this.f45716 = true;
        m35873();
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35873() {
        this.f45721 = true;
        this.f45720.removeCallbacksAndMessages(null);
        C14853 c14853 = this.f45719;
        if (c14853 != null) {
            c14853.m33949();
        }
    }
}
