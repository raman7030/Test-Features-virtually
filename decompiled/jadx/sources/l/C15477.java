package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15477 implements InterfaceC18581 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10130 f47354 = new C10130();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f47355;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f47356;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11005 f47357;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f47358;

    public C15477(C6306 c6306, C12392 c12392, C15545 c15545, C11005 c11005) {
        this.f47355 = c6306;
        this.f47356 = c12392;
        this.f47358 = c15545;
        this.f47357 = c11005;
    }

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ۧ */
    public final void mo9498() {
        C10130 c10130 = this.f47354;
        c10130.writeInt(1382253409);
        C6306 c6306 = this.f47355;
        c10130.writeInt(c6306.f19514.m30062(c6306.m17420()));
        c10130.writeInt(1382253409);
        this.f47356.m30331(c10130, true);
        c10130.writeInt(1382253409);
        C15545 c15545 = this.f47358;
        c15545.m36688(c10130);
        c10130.writeInt(1382253409);
        c15545.m36681(c10130);
    }

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ֫ */
    public final void mo9497() {
        try {
            this.f47357.m27338();
            byte[] bArrM11705 = C3878.m11705(this.f47354.size(), this.f47354.m25438());
            synchronized (this.f47355) {
                this.f47357.m27332(bArrM11705);
            }
        } catch (IOException e) {
            this.f47355.f19500.m11384((Throwable) e);
        }
    }
}
