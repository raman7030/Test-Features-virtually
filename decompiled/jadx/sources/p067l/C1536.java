package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰᩴ */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1536 extends AbstractC0942 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C1397 f44800;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f44801 = true;

    /* JADX INFO: renamed from: ᩹ */
    public C1991 f44802;

    public C1536(C1397 c1397) {
        this.f44800 = c1397;
    }

    @Override // p067l.AbstractC0942
    /* JADX INFO: renamed from: ֫ */
    public final void mo8701(C1991 c1991) {
        C1991 c1992 = this.f44802;
        if (c1991 == c1992) {
            C1991 c1993 = c1992.f77197;
            this.f44802 = c1993;
            this.f44801 = c1993 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f44801) {
            return this.f44800.f36599 != null;
        }
        C1991 c1991 = this.f44802;
        return (c1991 == null || c1991.f77199 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f44801) {
            this.f44801 = false;
            this.f44802 = this.f44800.f36599;
        } else {
            C1991 c1991 = this.f44802;
            this.f44802 = c1991 != null ? c1991.f77199 : null;
        }
        return this.f44802;
    }
}
