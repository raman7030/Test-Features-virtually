package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10832 implements InterfaceC18581 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10130 f32576 = new C10130();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16475 f32577;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f32578;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11005 f32579;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f32580;

    public C10832(C16475 c16475, C12392 c12392, C15545 c15545, C11005 c11005) {
        this.f32577 = c16475;
        this.f32578 = c12392;
        this.f32580 = c15545;
        this.f32579 = c11005;
    }

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ۧ */
    public final void mo9498() {
        C10130 c10130 = this.f32576;
        c10130.writeInt(1382253410);
        C16475 c16475 = this.f32577;
        c10130.writeByte(c16475.f50641);
        c10130.m25425(c16475.f50648);
        c10130.writeInt(1382253410);
        this.f32578.m30331(c10130, true);
        c10130.writeInt(1382253410);
        C15545 c15545 = this.f32580;
        c15545.m36688(c10130);
        c10130.writeInt(1382253410);
        c15545.m36681(c10130);
        AbstractC2489 abstractC2489M37667 = c16475.f50651.m37667();
        if (abstractC2489M37667 instanceof C6928) {
            c10130.writeInt(1382256833);
            c10130.m25423((CharSequence) ((C6928) abstractC2489M37667).m18734().mo14987());
        }
    }

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ֫ */
    public final void mo9497() {
        try {
            this.f32579.m27338();
            byte[] bArrM11705 = C3878.m11705(this.f32576.size(), this.f32576.m25438());
            synchronized (this.f32577) {
                this.f32579.m27332(bArrM11705);
            }
        } catch (IOException e) {
            this.f32577.f50653.m11384((Throwable) e);
        }
    }
}
