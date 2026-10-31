package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes.dex */
public final class C22013 implements InterfaceC4869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12135 f70567;

    public C22013(C12135 c12135) {
        this.f70567 = c12135;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    @Override // l.InterfaceC4869
    /* JADX INFO: renamed from: ֫ */
    public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        C21757 c21757 = (C21757) abstractC0197;
        int length = interfaceC3458.length();
        interfaceC3458.mo10586(c21757);
        C12135 c12135 = this.f70567;
        int i = 2;
        if (c12135.f36234 == null) {
            c12135.f36234 = new ArrayList(2);
        }
        List list = c12135.f36234;
        EnumC15405 enumC15405M49075 = c21757.m49075();
        if (enumC15405M49075 == null) {
            i = 0;
        } else {
            int i2 = C21308.f68690[enumC15405M49075.ordinal()];
            if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                i = 0;
            }
        }
        ((ArrayList) list).add(new C13545(i, interfaceC3458.builder().m41752(length)));
        c12135.f36235 = c21757.m49074();
    }
}
