package p067l;

import java.util.HashSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩵ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20610 implements InterfaceC10825 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1209 f63677;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C2503 f63678;

    public C20610(C2503 c2503, InterfaceC1209 interfaceC1209) {
        this.f63678 = c2503;
        this.f63677 = interfaceC1209;
    }

    @Override // p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3627(C5187 c5187) {
        InterfaceC1209 interfaceC1209 = this.f63677;
        if (interfaceC1209 == null || interfaceC1209.mo14675(c5187.m48106().replace('/', '.'))) {
            String strM22565 = C9682.m22565(c5187);
            if (strM22565 == null) {
                throw new IllegalStateException();
            }
            String strM3624 = C2503.m3624(strM22565);
            C2503 c2503 = this.f63678;
            if (((HashSet) c2503.f4042).contains(strM3624) || ((TreeSet) c2503.f4044).contains(strM3624)) {
                return;
            }
            if (c2503.f4041.m16543(strM3624)) {
                ((TreeSet) c2503.f4044).add(strM3624);
                return;
            }
            while (!strM3624.isEmpty() && !((HashSet) c2503.f4042).contains(strM3624)) {
                ((HashSet) c2503.f4042).add(strM3624);
                strM3624 = C2503.m3624(strM3624);
            }
        }
    }
}
