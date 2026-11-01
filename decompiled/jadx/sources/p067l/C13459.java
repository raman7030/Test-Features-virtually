package p067l;

import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۨۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13459 extends AbstractC14029 {
    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        C12826.requireNonNull(interfaceC2925);
        if (EnumC9335.SORTED.m21660s(i)) {
            return interfaceC2925;
        }
        return EnumC9335.SIZED.m21660s(i) ? new C7620(interfaceC2925) : new C23932(interfaceC2925);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        if (EnumC9335.SORTED.m21660s(((AbstractC14463) abstractC11111).f41316m)) {
            return abstractC11111.mo25627Q(interfaceC16847, false, intFunction);
        }
        long[] jArr = (long[]) ((InterfaceC8169) abstractC11111.mo25627Q(interfaceC16847, true, intFunction)).mo4230b();
        Arrays.sort(jArr);
        return new C11863(jArr);
    }
}
