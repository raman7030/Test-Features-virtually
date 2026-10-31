package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4624 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f14696;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14697;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f14698 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m13573() {
        if (this.f14698.isEmpty()) {
            return;
        }
        C10130 c10130 = new C10130();
        c10130.mo13231(this.f14698.size());
        Iterator it = this.f14698.iterator();
        while (it.hasNext()) {
            c10130.m25434(((C20147) it.next()).f65248);
        }
        byte[] bArrM25428 = c10130.m25428();
        C18237 c18237M42480 = C18237.m42480(4183);
        c18237M42480.m42487(bArrM25428);
        C23881 c23881M42495 = c18237M42480.m42495();
        if (!c23881M42495.m52607()) {
            throw new C19401(C1575.m5392(c23881M42495, R.string.MT_Protector));
        }
        byte[] bArr = new byte[c23881M42495.m52599()];
        c23881M42495.m52600(bArr);
        C12951 c12951M31486 = C12951.m31486(bArr);
        Iterator it2 = this.f14698.iterator();
        while (it2.hasNext()) {
            C20147 c20147 = (C20147) it2.next();
            if (c12951M31486.m31498()) {
                byte[] bArrM31496 = c12951M31486.m31496();
                byte[] bArrM11707 = C3878.m11707(bArrM31496, bArrM31496.length);
                C21558.m48711(c20147.f65247, bArrM11707);
                this.f14696.m36526(c20147.f65247).m36502(bArrM11707);
            }
            it2.remove();
            this.f14697 -= c20147.f65248.length;
        }
        this.f14698.clear();
        this.f14697 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m13574(byte[] bArr) {
        String strM34531 = C14460.m34531(C14460.m34532().digest(bArr));
        byte[] bArrM48712 = C21558.m48712(strM34531);
        if (bArrM48712 != null) {
            this.f14696.m36526(strM34531).m36503(bArrM48712, 0, bArrM48712.length);
            return;
        }
        if (this.f14697 >= 262144) {
            m13573();
        }
        this.f14698.add(new C20147(bArr, strM34531));
        int length = this.f14697 + bArr.length;
        this.f14697 = length;
        if (length >= 262144) {
            m13573();
        }
    }

    public C4624(AbstractC15440 abstractC15440) throws C19401 {
        if (!C23196.m51460()) {
            throw new C19401(C1575.m5392(new C23881(4), R.string.MT_Protector));
        }
        if (!C23196.m51454()) {
            throw new C19401(C1575.m5392(new C23881(5), R.string.MT_Protector));
        }
        abstractC15440.m36508();
        this.f14696 = abstractC15440;
    }
}
