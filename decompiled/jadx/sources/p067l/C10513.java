package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10513 implements InterfaceC20028 {

    /* JADX INFO: renamed from: ֫ */
    public C11996 f29083 = new C11996();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9842 f29084;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14146 f29085;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C12828 f29086;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C17143 f29087;

    public C10513(C9842 c9842, C14146 c14146, C17143 c17143, C12828 c12828) {
        this.f29084 = c9842;
        this.f29085 = c14146;
        this.f29087 = c17143;
        this.f29086 = c12828;
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ۧ */
    public final void mo11541() {
        C11996 c11996 = this.f29083;
        c11996.writeInt(1382253410);
        C9842 c9842 = this.f29084;
        c11996.writeInt(c9842.f27284.m47131(c9842.m23088()));
        c11996.writeInt(1382253410);
        this.f29085.m32395(c11996, true);
        c11996.writeInt(1382253410);
        C17143 c17143 = this.f29087;
        c17143.m38849(c11996);
        c11996.writeInt(1382253410);
        c17143.m38842(c11996);
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ֫ */
    public final void mo11540() {
        try {
            this.f29086.m29400();
            byte[] bArrM13641 = C6054.m13641(this.f29083.size(), this.f29083.m27458());
            synchronized (this.f29084) {
                this.f29086.m29394(bArrM13641);
            }
        } catch (IOException e) {
            this.f29084.f27302.m13320((Throwable) e);
        }
    }
}
