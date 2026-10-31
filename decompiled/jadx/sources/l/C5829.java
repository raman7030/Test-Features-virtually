package l;

/* JADX INFO: renamed from: l.ۛۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5829 extends C6197 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9316 f17883;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5829(C9316 c9316, C16696 c16696) {
        super(c16696);
        this.f17883 = c9316;
    }

    @Override // l.C6197, l.InterfaceC18380
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10431 mo4329(InterfaceC8566 interfaceC8566) {
        String type = interfaceC8566.getType();
        C9316 c9316 = this.f17883;
        c9316.f28266 = C9523.m24408(C9316.m23988(c9316, type));
        return new C10431(this, interfaceC8566);
    }
}
