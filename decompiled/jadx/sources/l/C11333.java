package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11333 implements InterfaceC6121 {
    @Override // l.InterfaceC6121
    /* JADX INFO: renamed from: ֫ */
    public final void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        c18906.m43647(true);
        Iterator itM44338 = C19220.m44338(c19220, "item");
        while (itM44338.hasNext()) {
            C19220 c19221 = (C19220) itM44338.next();
            C18514 c18514M44348 = c19221.m44348("quantity");
            String strM43026 = c18514M44348.m43026();
            int iIndexOf = Arrays.asList(InterfaceC1454.f5200).indexOf(strM43026);
            if (iIndexOf == -1) {
                throw new C1580(C20094.m46315("Unknown quantity: ", strM43026), c18514M44348);
            }
            int i = iIndexOf + 16777220;
            if (c19221.m44346()) {
                String strM3219 = c19221.m44347().m3219();
                if (strM3219.startsWith("@")) {
                    C11766.m28796(c18906, c19221, c10355, true).m13997(i);
                } else if (strM3219.startsWith("?")) {
                    C11766.m28795(c18906, c10355, c19221).m13997(i);
                }
            }
            C11766.m28800(c18906, c10355, c19221).m13997(i);
        }
    }
}
