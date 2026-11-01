package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12598 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC3880 f35383;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC3880 f35384;

    /* JADX INFO: renamed from: ᩹ */
    public final C17961 f35385;

    public C12598(C17961 c17961, AbstractC3880 abstractC3880) {
        this.f35385 = c17961;
        this.f35383 = abstractC3880;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35383 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC3880 abstractC3880 = this.f35383;
        this.f35384 = abstractC3880;
        if (abstractC3880 != null) {
            this.f35383 = abstractC3880.f8418;
            return abstractC3880;
        }
        this.f35383 = null;
        return abstractC3880;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC3880 abstractC3880 = this.f35384;
        if (abstractC3880 != null) {
            this.f35385.m40883(abstractC3880);
            this.f35384 = null;
        }
    }
}
