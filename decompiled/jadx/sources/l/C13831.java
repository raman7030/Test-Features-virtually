package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13831 extends AbstractC3955 {
    @Override // l.AbstractC3955
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC5366 mo1923(AbstractC11716 abstractC11716, byte[] bArr) {
        return m33186(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1818 m33186(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        try {
            C8894 c8894 = new C8894(this.f12580, bArr);
            try {
                Iterator it = c8894.iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC5366) it.next());
                }
                c8894.close();
                return new C1818(arrayList, bArr);
            } catch (Throwable th) {
                try {
                    c8894.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C2544(e, "Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]);
        }
    }
}
