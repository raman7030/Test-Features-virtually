package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14349 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Predicate f41034;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ EnumC3620 f41035;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C12338 f41036;

    /* JADX INFO: renamed from: ᩸ */
    public C16360 f41037;

    /* JADX INFO: renamed from: ᩹ */
    public int f41038;

    public C14349(C12338 c12338, AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620) {
        this.f41036 = c12338;
        this.f41034 = predicate;
        this.f41035 = enumC3620;
        C16360 c16360M28411 = c12338.m28411(abstractC12224, predicate);
        this.f41037 = c16360M28411;
        C12338 c12339 = c16360M28411.f48075;
        this.f41038 = c12339 != null ? c12339.f34436 : -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C16360 c16360 = this.f41037;
        C12338 c12338 = c16360.f48075;
        if (c12338 != null && this.f41038 != c12338.f34436 && !c12338.mo22462(c16360.f48076)) {
            this.f41037 = this.f41037.m37176(this.f41034);
        }
        C12338 c12339 = this.f41037.f48075;
        if (c12339 != null) {
            return this.f41035 == EnumC3620.RECURSIVE || c12339 == this.f41036;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C16360 c16360 = this.f41037;
        this.f41037 = c16360.m37176(this.f41034);
        return c16360.f48076;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
