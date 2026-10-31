package l;

import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۠ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8141 extends AbstractC7081 {
    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        C11003.requireNonNull(interfaceC0585);
        if (EnumC7330.SORTED.s(i)) {
            return interfaceC0585;
        }
        return EnumC7330.SIZED.s(i) ? new C23869(interfaceC0585) : new C14927(interfaceC0585);
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        if (EnumC7330.SORTED.s(((AbstractC12725) abstractC9198).m)) {
            return abstractC9198.Q(interfaceC15234, false, intFunction);
        }
        int[] iArr = (int[]) ((InterfaceC6809) abstractC9198.Q(interfaceC15234, true, intFunction)).b();
        Arrays.sort(iArr);
        return new C23308(iArr);
    }
}
