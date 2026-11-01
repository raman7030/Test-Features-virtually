package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BFQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16231 {

    /* JADX INFO: renamed from: ֫ */
    public final C24949 f47770;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f47771;

    public C16231(C11619 c11619, int i, int i2, int i3, int i4) {
        this.f47770 = new C24949(c11619, i, i3, i4);
        this.f47771 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36989(AbstractC6924 abstractC6924) {
        this.f47770.m54826(abstractC6924);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 m36987(int i) {
        C24949 c24949 = this.f47770;
        if (i >= c24949.m54831() || i < 0) {
            return null;
        }
        return c24949.m54825(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m36991() {
        return this.f47770.m54831();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36990(C16981 c16981) {
        this.f47770.m54827(c16981);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36992(AbstractC6924 abstractC6924) {
        this.f47771.add(abstractC6924);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24949 m36988() {
        ArrayList arrayList = this.f47771;
        if (arrayList == null) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C24949 c24949 = this.f47770;
            if (i < size) {
                c24949.m54826((AbstractC6924) this.f47771.get(i));
                i++;
            } else {
                this.f47771 = null;
                return c24949;
            }
        }
    }
}
