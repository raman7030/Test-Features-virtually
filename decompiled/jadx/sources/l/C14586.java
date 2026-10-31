package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BFQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14586 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23759 f44662;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f44663;

    public C14586(C9733 c9733, int i, int i2, int i3, int i4) {
        this.f44662 = new C23759(c9733, i, i3, i4);
        this.f44663 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34838(AbstractC4793 abstractC4793) {
        this.f44662.m52417(abstractC4793);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 m34836(int i) {
        C23759 c23759 = this.f44662;
        if (i >= c23759.m52422() || i < 0) {
            return null;
        }
        return c23759.m52416(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34840() {
        return this.f44662.m52422();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34839(C15375 c15375) {
        this.f44662.m52418(c15375);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34841(AbstractC4793 abstractC4793) {
        this.f44663.add(abstractC4793);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23759 m34837() {
        ArrayList arrayList = this.f44663;
        if (arrayList == null) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C23759 c23759 = this.f44662;
            if (i < size) {
                c23759.m52417((AbstractC4793) this.f44663.get(i));
                i++;
            } else {
                this.f44663 = null;
                return c23759;
            }
        }
    }
}
