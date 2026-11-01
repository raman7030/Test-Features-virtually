package p067l;

/* JADX INFO: renamed from: l.ۡܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10845 extends C4150 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C4810 f30054;

    /* JADX INFO: renamed from: ܿ */
    public int f30055;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10845(InterfaceC3479 interfaceC3479, C4810 c4810) {
        super((AbstractC24937) interfaceC3479);
        this.f30054 = c4810;
    }

    @Override // p067l.C4150
    /* JADX INFO: renamed from: ܳ */
    public final int mo8407(int i) {
        this.f30054.m10153();
        if (size() >= 200000) {
            throw C7492.m17268(EnumC2797.LIMIT, "Token count limit exceeded");
        }
        return super.mo8407(Math.min(i, 200000 - size()));
    }

    @Override // p067l.C4150
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC2808 mo8413(int i) {
        int i2 = this.f30055 + 1;
        this.f30055 = i2;
        if ((i2 & 1023) == 0) {
            this.f30054.m10153();
        }
        return super.mo8413(i);
    }
}
