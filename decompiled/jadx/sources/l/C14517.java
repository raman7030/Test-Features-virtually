package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14517 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) throws IOException {
        C23690 c23690 = (C23690) abstractC5366;
        if (c23690.f76726 == null) {
            m34667(c23690);
        }
        return c23690.f76726.length;
    }

    @Override // l.AbstractC18772
    /* JADX INFO: renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) throws IOException {
        C23690 c23690 = (C23690) abstractC5366;
        if (c23690.f76726 == null) {
            m34667(c23690);
        }
        c15948.write(c23690.f76726);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34667(C23690 c23690) throws IOException {
        AbstractC5366 abstractC5366 = c23690.f76723;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C8377 c8377 = this.f59283;
        C15948 c15948 = new C15948(c8377, byteArrayOutputStream);
        try {
            if (c23690.f76724) {
                c15948.m37722(abstractC5366);
            } else {
                abstractC5366.m15330().mo3870(c8377).mo13607(abstractC5366, c15948);
            }
            c23690.f76726 = byteArrayOutputStream.toByteArray();
            c15948.close();
        } catch (Throwable th) {
            try {
                c15948.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
