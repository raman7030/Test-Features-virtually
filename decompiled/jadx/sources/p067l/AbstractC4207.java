package p067l;

/* JADX INFO: renamed from: l.֫ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IA21 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4207 extends Thread implements InterfaceC20106 {

    /* JADX INFO: renamed from: ᩹ */
    public static final InterfaceC4410 f9253 = C13128.m30022(AbstractC4207.class);

    /* JADX INFO: renamed from: ᩸ */
    public boolean f9254;

    /* JADX INFO: renamed from: ۡ */
    public abstract C20008 mo8529();

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8533() {
        return false;
    }

    public AbstractC4207() {
        Runtime.getRuntime().addShutdownHook(this);
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20106 mo8531() {
        return new C18288(this, new C20008());
    }

    /* JADX INFO: renamed from: ܺ */
    public final InterfaceC20106 m8532() {
        return new C18288(this, new C20008(null, null, null, EnumC5926.GUEST));
    }

    @Override // p067l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7799 mo8528() {
        return mo8529();
    }

    /* JADX INFO: renamed from: ۢ */
    public void mo8530() {
        if (this.f9254) {
            return;
        }
        Runtime.getRuntime().removeShutdownHook(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f9254 = true;
            mo8530();
        } catch (C20777 e) {
            f9253.mo9178("Failed to close context on shutdown", (Throwable) e);
        }
    }
}
