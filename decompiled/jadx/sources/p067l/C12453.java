package p067l;

/* JADX INFO: renamed from: l.ۤ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12453 extends AbstractC24326 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C15370 f34842;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8429 f34843;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12453(C8429 c8429, InterfaceC7603 interfaceC7603, C15370 c15370) {
        super(interfaceC7603);
        this.f34843 = c8429;
        this.f34842 = c15370;
    }

    @Override // p067l.AbstractC24326, p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34843.f22599) {
            C8429 c8429 = this.f34843;
            if (c8429.f22598) {
                return;
            }
            c8429.f22598 = true;
            c8429.f22599.getClass();
            super.close();
            this.f34842.m35034();
        }
    }
}
