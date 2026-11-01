package p067l;

/* JADX INFO: renamed from: l.֡ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8II */
/* JADX INFO: loaded from: classes3.dex */
public final class C2663 extends C24456 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C7358 f4461;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC11402 f4462;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2663(C7358 c7358, InterfaceC11402 interfaceC11402, InterfaceC11402 interfaceC11403) {
        super(interfaceC11402);
        this.f4461 = c7358;
        this.f4462 = interfaceC11403;
    }

    @Override // p067l.C24456, p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        C8719 c8719Mo4119 = this.f4462.mo4119(j);
        C10731 c10731 = c8719Mo4119.f23641;
        long j2 = c10731.f29729;
        long j3 = c10731.f29728;
        C7358 c7358 = this.f4461;
        C10731 c10732 = new C10731(j2, j3 + c7358.f19284);
        C10731 c10733 = c8719Mo4119.f23642;
        return new C8719(c10732, new C10731(c10733.f29729, c10733.f29728 + c7358.f19284));
    }
}
