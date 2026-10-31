package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8570 implements InterfaceC18581 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10130 f26167 = new C10130();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f26168;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f26169;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11005 f26170;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f26171;

    public C8570(C7864 c7864, C12392 c12392, C15545 c15545, C11005 c11005) {
        this.f26168 = c7864;
        this.f26169 = c12392;
        this.f26171 = c15545;
        this.f26170 = c11005;
    }

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ۧ */
    public final void mo9498() {
        C10130 c10130 = this.f26167;
        c10130.writeInt(1382253410);
        C7864 c7864 = this.f26168;
        c10130.writeInt(c7864.f24368.m44835(c7864.m21123()));
        c10130.writeInt(1382253410);
        this.f26169.m30331(c10130, true);
        c10130.writeInt(1382253410);
        C15545 c15545 = this.f26171;
        c15545.m36688(c10130);
        c10130.writeInt(1382253410);
        c15545.m36681(c10130);
    }

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ֫ */
    public final void mo9497() {
        try {
            this.f26170.m27338();
            byte[] bArrM11705 = C3878.m11705(this.f26167.size(), this.f26167.m25438());
            synchronized (this.f26168) {
                this.f26170.m27332(bArrM11705);
            }
        } catch (IOException e) {
            this.f26168.f24386.m11384((Throwable) e);
        }
    }
}
