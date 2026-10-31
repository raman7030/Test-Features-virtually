package l;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۤܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5VI */
/* JADX INFO: loaded from: classes3.dex */
public class C10366 extends C1193 {
    @Override // l.C1193
    /* JADX INFO: renamed from: ֫ */
    public void mo4038(C19728 c19728, AbstractC15452 abstractC15452, C5427 c5427) {
        AbstractC15452 abstractC15452M6722 = C2048.m6722(abstractC15452);
        int i = c19728.f63749;
        C7338 c7338 = c19728.f63747;
        C11472 c11472 = new C11472(i, c7338.m19700(), c7338.m19699());
        try {
            super.mo4038(c19728, c11472, c5427);
            c11472.m28287(abstractC15452);
            if (abstractC15452M6722 != null) {
                try {
                    C2048.m6725(abstractC15452M6722);
                } catch (Exception e) {
                    c11472.f34265.clear();
                    c11472.f34260.clear();
                    StringWriter stringWriter = new StringWriter();
                    stringWriter.append((CharSequence) "d2j fail translate: ");
                    e.printStackTrace(new PrintWriter(stringWriter));
                    String string = stringWriter.toString();
                    c11472.mo26978(187, "java/lang/RuntimeException");
                    c11472.mo28279(89);
                    c11472.mo26971(string);
                    c11472.m36545("java/lang/RuntimeException", 183, "<init>", "(Ljava/lang/String;)V");
                    c11472.mo28279(191);
                    C2048.m6723(abstractC15452M6722, c11472);
                }
            }
        } catch (Exception e2) {
            throw new C5927(e2, "Failed to convert code for %s", c7338);
        }
    }
}
