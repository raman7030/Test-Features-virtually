package l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩻۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C23688 extends AbstractC0286 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f76719;

    @Override // l.AbstractC9460
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8754[] mo5713() {
        return new InterfaceC8754[]{EnumC9393.STUCK};
    }

    @Override // l.AbstractC9460
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo5710(InterfaceC8754 interfaceC8754) {
        if (interfaceC8754 == EnumC9393.STUCK) {
            return this.f76719;
        }
        throw new IllegalStateException();
    }

    @Override // l.AbstractC0286
    /* JADX INFO: renamed from: ܿ */
    public final Iterable mo1628() {
        return this.f76719;
    }
}
