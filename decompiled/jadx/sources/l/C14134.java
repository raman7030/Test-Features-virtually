package l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܰ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C14134 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f42626;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f42627;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f42628;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f42629;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f42630;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f42631;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12392 f42632;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13136 f42633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f42634;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42635;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9170 f42636;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Runnable f42637;

    public C14134(C12392 c12392, AbstractActivityC3346 abstractActivityC3346, int i, BooleanSupplier booleanSupplier) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f42634 = handler;
        RunnableC23307 runnableC23307 = new RunnableC23307(this);
        this.f42637 = runnableC23307;
        this.f42632 = c12392;
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        this.f42629 = interfaceC7785M30436;
        this.f42628 = interfaceC7785M30436.mo26548();
        this.f42631 = c12392.f37227;
        this.f42636 = C9170.m23578(c12392);
        this.f42627 = booleanSupplier;
        C13136 c13136 = abstractActivityC3346 == null ? null : new C13136(abstractActivityC3346, i);
        this.f42633 = c13136;
        if (c13136 != null) {
            c13136.m31860(new RunnableC21400(2, this));
            handler.postDelayed(new Runnable() { // from class: l.ۨ᩺ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14134.m33734(this.f35973);
                }
            }, 300L);
        }
        handler.postDelayed(runnableC23307, 200L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33734(C14134 c14134) {
        if (c14134.f42635 || !c14134.m33743()) {
            return;
        }
        c14134.f42633.m31864();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m33743() {
        if (this.f42626 || !this.f42636.m23581()) {
            return false;
        }
        InterfaceC7785 interfaceC7785M30436 = this.f42632.m30436();
        InterfaceC7785 interfaceC7785 = this.f42629;
        return interfaceC7785M30436 == interfaceC7785 && interfaceC7785.mo26548() == this.f42628 && this.f42632.f37227 == this.f42631 && this.f42627.getAsBoolean();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33738() {
        if (this.f42626 || !this.f42636.m23581()) {
            return false;
        }
        return this.f42630 || m33743();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m33739() {
        return this.f42626;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33742() {
        if (this.f42626 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Editor search canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33740() {
        if (this.f42630) {
            return;
        }
        this.f42626 = true;
        m33741();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33737() {
        if (!m33743()) {
            return false;
        }
        this.f42630 = true;
        m33741();
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33741() {
        this.f42635 = true;
        this.f42634.removeCallbacksAndMessages(null);
        C13136 c13136 = this.f42633;
        if (c13136 != null) {
            c13136.m31857();
        }
    }
}
