package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۬֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14534 implements InterfaceC2719 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C23663 f41470;

    public C14534(C23663 c23663) {
        this.f41470 = c23663;
    }

    @Override // p067l.InterfaceC2719
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4224(AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        if (abstractC6462.mo14812() || AbstractC6462.m14769(c4848)) {
            return false;
        }
        return c4849 == null || !AbstractC6462.m14769(c4849);
    }

    @Override // p067l.InterfaceC2719
    /* JADX INFO: renamed from: ֫ */
    public final C4848 mo4223(AbstractC7783 abstractC7783, C4848 c4848) {
        EnumC15511 enumC15511 = EnumC15511.SPECULATIVE;
        C23663 c23663 = this.f41470;
        EnumC18298 enumC18298 = c23663.f75305.f40077;
        C14152 c14152 = c23663.f75332;
        C12826.requireNonNull(c14152);
        return c4848.m10287((Function) new C2875(c14152, enumC15511, abstractC7783, enumC18298));
    }
}
