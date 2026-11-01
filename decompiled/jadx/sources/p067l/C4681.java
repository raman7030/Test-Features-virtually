package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81WQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4681 extends AbstractC19433 {
    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final String mo4127() {
        return "ParameterEmpty";
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9923(C2993 c2993) {
        return this.f79251.f56061.contains(c2993.getType());
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4128(C3349 c3349, InterfaceC20568 interfaceC20568) {
        boolean z;
        Iterator it = interfaceC20568.mo6074().iterator();
        while (it.hasNext()) {
            switch (((InterfaceC23920) it.next()).mo6217().f6092) {
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
