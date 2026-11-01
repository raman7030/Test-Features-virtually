package p067l;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۤܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5VI */
/* JADX INFO: loaded from: classes3.dex */
public class C12220 extends C3502 {
    @Override // p067l.C3502
    /* JADX INFO: renamed from: ֫ */
    public void mo6280(C21118 c21118, AbstractC17054 abstractC17054, C7526 c7526) {
        AbstractC17054 abstractC17054M8848 = C4315.m8848(abstractC17054);
        int i = c21118.f66380;
        C9342 c9342 = c21118.f66378;
        C13271 c13271 = new C13271(i, c9342.m21673(), c9342.m21672());
        try {
            super.mo6280(c21118, c13271, c7526);
            c13271.m30331(abstractC17054);
            if (abstractC17054M8848 != null) {
                try {
                    C4315.m8851(abstractC17054M8848);
                } catch (Exception e) {
                    c13271.f37261.clear();
                    c13271.f37256.clear();
                    StringWriter stringWriter = new StringWriter();
                    stringWriter.append((CharSequence) "d2j fail translate: ");
                    e.printStackTrace(new PrintWriter(stringWriter));
                    String string = stringWriter.toString();
                    c13271.mo29023(187, "java/lang/RuntimeException");
                    c13271.mo30323(89);
                    c13271.mo29016(string);
                    c13271.m38704("java/lang/RuntimeException", 183, "<init>", "(Ljava/lang/String;)V");
                    c13271.mo30323(191);
                    C4315.m8849(abstractC17054M8848, c13271);
                }
            }
        } catch (Exception e2) {
            throw new C8001(e2, "Failed to convert code for %s", c9342);
        }
    }
}
