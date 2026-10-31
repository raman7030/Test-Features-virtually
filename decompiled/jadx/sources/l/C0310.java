package l;

/* JADX INFO: renamed from: l.֡ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8II */
/* JADX INFO: loaded from: classes3.dex */
public final class C0310 extends C23240 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5250 f1684;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9505 f1685;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310(C5250 c5250, InterfaceC9505 interfaceC9505, InterfaceC9505 interfaceC9506) {
        super(interfaceC9505);
        this.f1684 = c5250;
        this.f1685 = interfaceC9506;
    }

    @Override // l.C23240, l.InterfaceC9505
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6682 mo1721(long j) {
        C6682 c6682Mo1721 = this.f1685.mo1721(j);
        C8799 c8799 = c6682Mo1721.f20766;
        long j2 = c8799.f26804;
        long j3 = c8799.f26803;
        C5250 c5250 = this.f1684;
        C8799 c87910 = new C8799(j2, j3 + c5250.f16445);
        C8799 c87911 = c6682Mo1721.f20767;
        return new C6682(c87910, new C8799(c87911.f26804, c87911.f26803 + c5250.f16445));
    }
}
