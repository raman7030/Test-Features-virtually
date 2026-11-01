package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes4.dex */
public final class C18177 extends AbstractC20209 {
    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final int mo15481(AbstractC7468 abstractC7468) throws IOException {
        C19519 c19519 = (C19519) abstractC7468;
        if (c19519.f59445 == null) {
            m41395(c19519);
        }
        return c19519.f59445.length;
    }

    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final void mo15482(AbstractC7468 abstractC7468, C17525 c17525) throws IOException {
        C19519 c19519 = (C19519) abstractC7468;
        if (c19519.f59445 != null) {
            c17525.write(c19519.f59445);
            return;
        }
        Iterator it = c19519.iterator();
        while (it.hasNext()) {
            c17525.m39897((AbstractC7468) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41395(C19519 c19519) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17525 c17525 = new C17525(this.f62505, byteArrayOutputStream);
        Iterator it = c19519.iterator();
        while (it.hasNext()) {
            c17525.m39897((AbstractC7468) it.next());
        }
        c19519.f59445 = byteArrayOutputStream.toByteArray();
    }
}
