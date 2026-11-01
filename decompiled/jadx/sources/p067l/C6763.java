package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6763 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f17524;

    /* JADX INFO: renamed from: ۧ */
    public int f17525;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f17526 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m15448() {
        if (this.f17526.isEmpty()) {
            return;
        }
        C11996 c11996 = new C11996();
        c11996.mo15113(this.f17526.size());
        Iterator it = this.f17526.iterator();
        while (it.hasNext()) {
            c11996.m27454(((C21516) it.next()).f67890);
        }
        byte[] bArrM27448 = c11996.m27448();
        C19701 c19701M44739 = C19701.m44739(4183);
        c19701M44739.m44746(bArrM27448);
        C25065 c25065M44754 = c19701M44739.m44754();
        if (!c25065M44754.m55016()) {
            throw new C20807(C3865.m7621(c25065M44754, R.string.MT_Protector));
        }
        byte[] bArr = new byte[c25065M44754.m55008()];
        c25065M44754.m55009(bArr);
        C14677 c14677M33573 = C14677.m33573(bArr);
        Iterator it2 = this.f17526.iterator();
        while (it2.hasNext()) {
            C21516 c21516 = (C21516) it2.next();
            if (c14677M33573.m33585()) {
                byte[] bArrM33583 = c14677M33573.m33583();
                byte[] bArrM13643 = C6054.m13643(bArrM33583, bArrM33583.length);
                C22857.m51056(c21516.f67889, bArrM13643);
                this.f17524.m38684(c21516.f67889).m38660(bArrM13643);
            }
            it2.remove();
            this.f17525 -= c21516.f67890.length;
        }
        this.f17526.clear();
        this.f17525 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m15449(byte[] bArr) {
        String strM36665 = C16111.m36665(C16111.m36666().digest(bArr));
        byte[] bArrM51057 = C22857.m51057(strM36665);
        if (bArrM51057 != null) {
            this.f17524.m38684(strM36665).m38661(bArrM51057, 0, bArrM51057.length);
            return;
        }
        if (this.f17525 >= 262144) {
            m15448();
        }
        this.f17526.add(new C21516(bArr, strM36665));
        int length = this.f17525 + bArr.length;
        this.f17525 = length;
        if (length >= 262144) {
            m15448();
        }
    }

    public C6763(AbstractC17043 abstractC17043) throws C20807 {
        if (!C24414.m53856()) {
            throw new C20807(C3865.m7621(new C25065(4), R.string.MT_Protector));
        }
        if (!C24414.m53850()) {
            throw new C20807(C3865.m7621(new C25065(5), R.string.MT_Protector));
        }
        abstractC17043.m38666();
        this.f17524 = abstractC17043;
    }
}
