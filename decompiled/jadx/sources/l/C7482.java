package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7482 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) throws IOException {
        C1818 c1818 = (C1818) abstractC5366;
        if (c1818.f6245 == null) {
            m20104(c1818);
        }
        return c1818.f6245.length;
    }

    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) throws IOException {
        C1818 c1818 = (C1818) abstractC5366;
        if (c1818.f6245 != null) {
            c15948.write(c1818.f6245);
            return;
        }
        Iterator it = c1818.iterator();
        while (it.hasNext()) {
            c15948.m37722((AbstractC5366) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20104(C1818 c1818) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(this.f59283, byteArrayOutputStream);
        Iterator it = c1818.iterator();
        while (it.hasNext()) {
            c15948.m37722((AbstractC5366) it.next());
        }
        c1818.f6245 = byteArrayOutputStream.toByteArray();
    }
}
