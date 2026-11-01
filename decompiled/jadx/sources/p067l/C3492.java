package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1FH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3492 implements InterfaceC8186 {
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    @Override // p067l.InterfaceC8186
    /* JADX INFO: renamed from: ֫ */
    public final void mo6237(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        int i;
        c20337.m45913(true);
        String strM46644 = c20635.m46644();
        strM46644.getClass();
        char c = 0;
        switch (strM46644) {
            case "string-array":
                break;
            case "array":
                c = 2;
                break;
            case "integer-array":
                c = 1;
                break;
            default:
                throw new C3870(C6988.m16053("Unknown tag: <", strM46644, ">"), c20635);
        }
        Iterator itM46631 = C20635.m46631(c20635);
        int i2 = 16777217;
        while (itM46631.hasNext()) {
            C20635 c20636 = (C20635) itM46631.next();
            if (c != 2 && c20636.m46640()) {
                String strM5533 = c20636.m46641().m5533();
                if (strM5533.startsWith("@")) {
                    i = i2 + 1;
                    C13551.m30843(c20337, c20636, c12210, true).m15877(i2);
                } else if (strM5533.startsWith("?")) {
                    i = i2 + 1;
                    C13551.m30842(c20337, c12210, c20636).m15877(i2);
                } else if (c == 0) {
                    i = i2 + 1;
                    C13551.m30847(c20337, c12210, c20636).m15877(i2);
                } else if (c == 1) {
                    i = i2 + 1;
                    C13551.m30853(c20337, c12210, c20636).m15877(i2);
                } else {
                    i = i2 + 1;
                    C6845.m15680(c20337, c12210, c20636).m15877(i2);
                }
            } else if (c == 0) {
                i = i2 + 1;
                C13551.m30847(c20337, c12210, c20636).m15877(i2);
            } else if (c == 1) {
                i = i2 + 1;
                C13551.m30853(c20337, c12210, c20636).m15877(i2);
            } else {
                i = i2 + 1;
                C6845.m15680(c20337, c12210, c20636).m15877(i2);
            }
            i2 = i;
        }
    }
}
