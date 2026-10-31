package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16634 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) throws IOException {
        C18046 c18046 = (C18046) abstractC5366;
        if (c18046.f56243 == null) {
            m39167(c18046);
        }
        return c18046.f56243.length;
    }

    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) throws IOException {
        C18046 c18046 = (C18046) abstractC5366;
        if (c18046.f56243 != null) {
            c15948.write(c18046.f56243);
            return;
        }
        Iterator it = c18046.iterator();
        while (it.hasNext()) {
            c15948.m37722((AbstractC5366) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39167(C18046 c18046) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(this.f59283, byteArrayOutputStream);
        Iterator it = c18046.iterator();
        while (it.hasNext()) {
            c15948.m37722((AbstractC5366) it.next());
        }
        c18046.f56243 = byteArrayOutputStream.toByteArray();
    }
}
