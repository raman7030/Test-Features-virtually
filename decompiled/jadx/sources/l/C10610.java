package l;

/* JADX INFO: renamed from: l.ۤ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10610 extends AbstractC23104 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13680 f31870;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6376 f31871;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10610(C6376 c6376, InterfaceC5508 interfaceC5508, C13680 c13680) {
        super(interfaceC5508);
        this.f31871 = c6376;
        this.f31870 = c13680;
    }

    @Override // l.AbstractC23104, l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f31871.f19726) {
            C6376 c6376 = this.f31871;
            if (c6376.f19725) {
                return;
            }
            c6376.f19725 = true;
            c6376.f19726.getClass();
            super.close();
            this.f31870.m32919();
        }
    }
}
