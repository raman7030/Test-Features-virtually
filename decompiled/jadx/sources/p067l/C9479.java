package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9479 extends AbstractC20209 {
    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final int mo15481(AbstractC7468 abstractC7468) throws IOException {
        C4096 c4096 = (C4096) abstractC7468;
        if (c4096.f9025 == null) {
            m22080(c4096);
        }
        return c4096.f9025.length;
    }

    @Override // p067l.AbstractC20209
    /* JADX INFO: renamed from: ֫ */
    public final void mo15482(AbstractC7468 abstractC7468, C17525 c17525) throws IOException {
        C4096 c4096 = (C4096) abstractC7468;
        if (c4096.f9025 != null) {
            c17525.write(c4096.f9025);
            return;
        }
        Iterator it = c4096.iterator();
        while (it.hasNext()) {
            c17525.m39897((AbstractC7468) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22080(C4096 c4096) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17525 c17525 = new C17525(this.f62505, byteArrayOutputStream);
        Iterator it = c4096.iterator();
        while (it.hasNext()) {
            c17525.m39897((AbstractC7468) it.next());
        }
        c4096.f9025 = byteArrayOutputStream.toByteArray();
    }
}
