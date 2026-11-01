package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15513 extends AbstractC6127 {
    @Override // p067l.AbstractC6127
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC7468 mo4315(AbstractC13503 abstractC13503, byte[] bArr) {
        return m35304(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4096 m35304(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        try {
            C10821 c10821 = new C10821(this.f15388, bArr);
            try {
                Iterator it = c10821.iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC7468) it.next());
                }
                c10821.close();
                return new C4096(arrayList, bArr);
            } catch (Throwable th) {
                try {
                    c10821.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C4786(e, "Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]);
        }
    }
}
