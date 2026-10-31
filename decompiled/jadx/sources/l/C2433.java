package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81WQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2433 extends AbstractC17955 {
    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫ */
    public final String mo1729() {
        return "ParameterEmpty";
    }

    @Override // l.AbstractC17955
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo7875(C0657 c0657) {
        return this.f76507.f52879.contains(c0657.getType());
    }

    @Override // l.AbstractC17955
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1730(C1032 c1032, InterfaceC19150 interfaceC19150) {
        boolean z;
        Iterator it = interfaceC19150.mo3817().iterator();
        while (it.hasNext()) {
            switch (((InterfaceC22677) it.next()).mo3975().f3318) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    z = true;
                    break;
                default:
                    break;
            }
            return !z;
        }
        z = false;
        return !z;
    }
}
