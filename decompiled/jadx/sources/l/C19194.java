package l;

import java.util.HashSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩵ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19194 implements InterfaceC8898 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7397 f60447;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0142 f60448;

    public C19194(C0142 c0142, InterfaceC7397 interfaceC7397) {
        this.f60448 = c0142;
        this.f60447 = interfaceC7397;
    }

    @Override // l.InterfaceC8898
    /* JADX INFO: renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        InterfaceC7397 interfaceC7397 = this.f60447;
        if (interfaceC7397 == null || interfaceC7397.mo12795(c2966.m45794().replace('/', '.'))) {
            String strM20585 = C7695.m20585(c2966);
            if (strM20585 == null) {
                throw new IllegalStateException();
            }
            String strM1222 = C0142.m1222(strM20585);
            C0142 c0142 = this.f60448;
            if (((HashSet) c0142.f1267).contains(strM1222) || ((TreeSet) c0142.f1269).contains(strM1222)) {
                return;
            }
            if (c0142.f1266.m14635(strM1222)) {
                ((TreeSet) c0142.f1269).add(strM1222);
                return;
            }
            while (!strM1222.isEmpty() && !((HashSet) c0142.f1267).contains(strM1222)) {
                ((HashSet) c0142.f1267).add(strM1222);
                strM1222 = C0142.m1222(strM1222);
            }
        }
    }
}
