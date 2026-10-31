package l;

/* JADX INFO: renamed from: l.֫ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IA21 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1934 extends Thread implements InterfaceC18663 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f6473 = C11321.m27961(AbstractC1934.class);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f6474;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public abstract C18560 mo6356();

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo6360() {
        return false;
    }

    public AbstractC1934() {
        Runtime.getRuntime().addShutdownHook(this);
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18663 mo6358() {
        return new C16750(this, new C18560());
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18663 m6359() {
        return new C16750(this, new C18560(null, null, null, EnumC3743.GUEST));
    }

    @Override // l.InterfaceC18663
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5714 mo6355() {
        return mo6356();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public void mo6357() {
        if (this.f6474) {
            return;
        }
        Runtime.getRuntime().removeShutdownHook(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f6474 = true;
            mo6357();
        } catch (C19369 e) {
            f6473.mo7083("Failed to close context on shutdown", (Throwable) e);
        }
    }
}
