package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ᩴ */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1221 extends AbstractC0942 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public C1991 f26523;

    /* JADX INFO: renamed from: ᩹ */
    public C1991 f26524;

    /* JADX INFO: renamed from: ۧ */
    public abstract C1991 mo19097(C1991 c1991);

    /* JADX INFO: renamed from: ܽ */
    public abstract C1991 mo19098(C1991 c1991);

    public AbstractC1221(C1991 c1991, C1991 c1992) {
        this.f26523 = c1992;
        this.f26524 = c1991;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26524 != null;
    }

    @Override // p067l.AbstractC0942
    /* JADX INFO: renamed from: ֫ */
    public final void mo8701(C1991 c1991) {
        C1991 c1991Mo19098 = null;
        if (this.f26523 == c1991 && c1991 == this.f26524) {
            this.f26524 = null;
            this.f26523 = null;
        }
        C1991 c1992 = this.f26523;
        if (c1992 == c1991) {
            this.f26523 = mo19097(c1992);
        }
        C1991 c1993 = this.f26524;
        if (c1993 == c1991) {
            C1991 c1994 = this.f26523;
            if (c1993 != c1994 && c1994 != null) {
                c1991Mo19098 = mo19098(c1993);
            }
            this.f26524 = c1991Mo19098;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1991 c1991 = this.f26524;
        C1991 c1992 = this.f26523;
        this.f26524 = (c1991 == c1992 || c1992 == null) ? null : mo19098(c1991);
        return c1991;
    }
}
