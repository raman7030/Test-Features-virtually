package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17078 implements InterfaceC20028 {

    /* JADX INFO: renamed from: ֫ */
    public C11996 f50485 = new C11996();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C8362 f50486;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14146 f50487;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C12828 f50488;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C17143 f50489;

    public C17078(C8362 c8362, C14146 c14146, C17143 c17143, C12828 c12828) {
        this.f50486 = c8362;
        this.f50487 = c14146;
        this.f50489 = c17143;
        this.f50488 = c12828;
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ۧ */
    public final void mo11541() {
        C11996 c11996 = this.f50485;
        c11996.writeInt(1382253409);
        C8362 c8362 = this.f50486;
        c11996.writeInt(c8362.f22385.m32123(c8362.m19360()));
        c11996.writeInt(1382253409);
        this.f50487.m32395(c11996, true);
        c11996.writeInt(1382253409);
        C17143 c17143 = this.f50489;
        c17143.m38849(c11996);
        c11996.writeInt(1382253409);
        c17143.m38842(c11996);
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ֫ */
    public final void mo11540() {
        try {
            this.f50488.m29400();
            byte[] bArrM13641 = C6054.m13641(this.f50485.size(), this.f50485.m27458());
            synchronized (this.f50486) {
                this.f50488.m29394(bArrM13641);
            }
        } catch (IOException e) {
            this.f50486.f22371.m13320((Throwable) e);
        }
    }
}
