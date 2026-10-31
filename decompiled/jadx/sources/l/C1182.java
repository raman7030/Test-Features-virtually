package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1FH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1182 implements InterfaceC6121 {
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    @Override // l.InterfaceC6121
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        int i;
        c18906.m43647(true);
        String strM44350 = c19220.m44350();
        strM44350.getClass();
        char c = 0;
        switch (strM44350) {
            case "string-array":
                break;
            case "array":
                c = 2;
                break;
            case "integer-array":
                c = 1;
                break;
            default:
                throw new C1580(C4860.m14172("Unknown tag: <", strM44350, ">"), c19220);
        }
        Iterator itM44337 = C19220.m44337(c19220);
        int i2 = 16777217;
        while (itM44337.hasNext()) {
            C19220 c19221 = (C19220) itM44337.next();
            if (c != 2 && c19221.m44346()) {
                String strM3219 = c19221.m44347().m3219();
                if (strM3219.startsWith("@")) {
                    i = i2 + 1;
                    C11766.m28796(c18906, c19221, c10355, true).m13997(i2);
                } else if (strM3219.startsWith("?")) {
                    i = i2 + 1;
                    C11766.m28795(c18906, c10355, c19221).m13997(i2);
                } else if (c == 0) {
                    i = i2 + 1;
                    C11766.m28800(c18906, c10355, c19221).m13997(i2);
                } else if (c == 1) {
                    i = i2 + 1;
                    C11766.m28806(c18906, c10355, c19221).m13997(i2);
                } else {
                    i = i2 + 1;
                    C4710.m13804(c18906, c10355, c19221).m13997(i2);
                }
            } else if (c == 0) {
                i = i2 + 1;
                C11766.m28800(c18906, c10355, c19221).m13997(i2);
            } else if (c == 1) {
                i = i2 + 1;
                C11766.m28806(c18906, c10355, c19221).m13997(i2);
            } else {
                i = i2 + 1;
                C4710.m13804(c18906, c10355, c19221).m13997(i2);
            }
            i2 = i;
        }
    }
}
