package p067l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13140 implements InterfaceC8186 {
    @Override // p067l.InterfaceC8186
    /* JADX INFO: renamed from: ֫ */
    public final void mo6237(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        c20337.m45913(true);
        Iterator itM46632 = C20635.m46632(c20635, "item");
        while (itM46632.hasNext()) {
            C20635 c20636 = (C20635) itM46632.next();
            C19964 c19964M46642 = c20636.m46642("quantity");
            String strM45304 = c19964M46642.m45304();
            int iIndexOf = Arrays.asList(InterfaceC3751.f7973).indexOf(strM45304);
            if (iIndexOf == -1) {
                throw new C3870(C21466.m48631("Unknown quantity: ", strM45304), c19964M46642);
            }
            int i = iIndexOf + 16777220;
            if (c20636.m46640()) {
                String strM5533 = c20636.m46641().m5533();
                if (strM5533.startsWith("@")) {
                    C13551.m30843(c20337, c20636, c12210, true).m15877(i);
                } else if (strM5533.startsWith("?")) {
                    C13551.m30842(c20337, c12210, c20636).m15877(i);
                }
            }
            C13551.m30847(c20337, c12210, c20636).m15877(i);
        }
    }
}
