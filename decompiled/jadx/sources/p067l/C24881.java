package p067l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩻۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C24881 extends AbstractC2640 {

    /* JADX INFO: renamed from: ۙ */
    public HashSet f79469;

    @Override // p067l.AbstractC11359
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10688[] mo7946() {
        return new InterfaceC10688[]{EnumC11295.STUCK};
    }

    @Override // p067l.AbstractC11359
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo7943(InterfaceC10688 interfaceC10688) {
        if (interfaceC10688 == EnumC11295.STUCK) {
            return this.f79469;
        }
        throw new IllegalStateException();
    }

    @Override // p067l.AbstractC2640
    /* JADX INFO: renamed from: ܿ */
    public final Iterable mo4028() {
        return this.f79469;
    }
}
