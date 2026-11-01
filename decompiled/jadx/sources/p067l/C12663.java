package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12663 implements InterfaceC20028 {

    /* JADX INFO: renamed from: ֫ */
    public C11996 f35552 = new C11996();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18026 f35553;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14146 f35554;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C12828 f35555;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C17143 f35556;

    public C12663(C18026 c18026, C14146 c14146, C17143 c17143, C12828 c12828) {
        this.f35553 = c18026;
        this.f35554 = c14146;
        this.f35556 = c17143;
        this.f35555 = c12828;
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ۧ */
    public final void mo11541() {
        C11996 c11996 = this.f35552;
        c11996.writeInt(1382253410);
        C18026 c18026 = this.f35553;
        c11996.writeByte(c18026.f53818);
        c11996.m27445(c18026.f53825);
        c11996.writeInt(1382253410);
        this.f35554.m32395(c11996, true);
        c11996.writeInt(1382253410);
        C17143 c17143 = this.f35556;
        c17143.m38849(c11996);
        c11996.writeInt(1382253410);
        c17143.m38842(c11996);
        AbstractC4734 abstractC4734M39840 = c18026.f53828.m39840();
        if (abstractC4734M39840 instanceof C8953) {
            c11996.writeInt(1382256833);
            c11996.m27443((CharSequence) ((C8953) abstractC4734M39840).m20684().mo16897());
        }
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ֫ */
    public final void mo11540() {
        try {
            this.f35555.m29400();
            byte[] bArrM13641 = C6054.m13641(this.f35552.size(), this.f35552.m27458());
            synchronized (this.f35553) {
                this.f35555.m29394(bArrM13641);
            }
        } catch (IOException e) {
            this.f35553.f53830.m13320((Throwable) e);
        }
    }
}
