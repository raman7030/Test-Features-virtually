package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10764 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC1591 f32408;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC1591 f32409;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16407 f32410;

    public C10764(C16407 c16407, AbstractC1591 abstractC1591) {
        this.f32410 = c16407;
        this.f32408 = abstractC1591;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32408 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC1591 abstractC1591 = this.f32408;
        this.f32409 = abstractC1591;
        if (abstractC1591 != null) {
            this.f32408 = abstractC1591.f5639;
            return abstractC1591;
        }
        this.f32408 = null;
        return abstractC1591;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1591 abstractC1591 = this.f32409;
        if (abstractC1591 != null) {
            this.f32410.m38667(abstractC1591);
            this.f32409 = null;
        }
    }
}
