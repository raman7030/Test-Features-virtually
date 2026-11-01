package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17353 implements InterfaceC10406 {

    /* JADX INFO: renamed from: ֫ */
    public C15828 f51746;

    /* JADX INFO: renamed from: ۧ */
    public C4614 f51747;

    /* JADX INFO: renamed from: ܽ */
    public C4614 f51748;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C21378 f51749;

    public C17353(C21378 c21378, C15828 c15828, C4614 c4614, C4614 c4615) {
        this.f51749 = c21378;
        this.f51746 = c15828;
        this.f51748 = c4614;
        this.f51747 = c4615;
    }

    @Override // p067l.InterfaceC10406
    /* JADX INFO: renamed from: ֫ */
    public final void mo7134(C15828 c15828) {
        C21378 c21378 = this.f51749;
        C15828 c15829 = this.f51746;
        C1446.m31704(c15829 == c15828);
        try {
            C4614 c4614 = this.f51748;
            C17939 c17939M36391 = c4614 != null ? new C16012(c21378, c15829).m36391(c4614) : null;
            C4614 c4615 = this.f51747;
            C17939 c17939M36392 = c4615 != null ? new C16012(c21378, c15829).m36391(c4615) : null;
            c15828.mo35948().m51604(c17939M36391);
            c15828.mo35948().m51603(c17939M36392);
        } catch (Exception e) {
            throw new C21865(c15828, new Supplier() { // from class: l.ۡۜ۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    C8005 c8005 = this.f29443.f51749.f67414;
                    String message = e.getMessage();
                    C13370 c13370 = C13665.f38450;
                    return c8005.m18543(new C13370("compiler", "exception.message", message));
                }
            }, c21378.f67401);
        }
    }
}
