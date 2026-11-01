package p067l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12814 extends AbstractC6127 {
    @Override // p067l.AbstractC6127
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC7468 mo4315(AbstractC13503 abstractC13503, byte[] bArr) {
        return m29366(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19519 m29366(byte[] bArr) {
        HashSet hashSet = new HashSet();
        try {
            C10821 c10821 = new C10821(this.f15388, bArr);
            try {
                Iterator it = c10821.iterator();
                while (it.hasNext()) {
                    hashSet.add((AbstractC7468) it.next());
                }
                c10821.close();
                return new C19519(hashSet, bArr);
            } catch (Throwable th) {
                try {
                    c10821.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C4786(e, "Could not parse ASN.1 SET contents.", new Object[0]);
        }
    }
}
