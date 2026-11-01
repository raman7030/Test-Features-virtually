package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16165 extends AbstractC20209 {
    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final int mo15481(AbstractC7468 abstractC7468) throws IOException {
        C24883 c24883 = (C24883) abstractC7468;
        if (c24883.f79476 == null) {
            m36809(c24883);
        }
        return c24883.f79476.length;
    }

    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final void mo15482(AbstractC7468 abstractC7468, C17525 c17525) throws IOException {
        C24883 c24883 = (C24883) abstractC7468;
        if (c24883.f79476 == null) {
            m36809(c24883);
        }
        c17525.write(c24883.f79476);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36809(C24883 c24883) throws IOException {
        AbstractC7468 abstractC7468 = c24883.f79473;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C10330 c10330 = this.f62505;
        C17525 c17525 = new C17525(c10330, byteArrayOutputStream);
        try {
            if (c24883.f79474) {
                c17525.m39897(abstractC7468);
            } else {
                abstractC7468.m17239().mo6111(c10330).mo15482(abstractC7468, c17525);
            }
            c24883.f79476 = byteArrayOutputStream.toByteArray();
            c17525.close();
        } catch (Throwable th) {
            try {
                c17525.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
