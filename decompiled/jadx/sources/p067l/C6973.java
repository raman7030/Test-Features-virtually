package p067l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6973 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ EnumC3620 f18141;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Predicate f18142;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12338 f18143;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC12224 f18144;

    public /* synthetic */ C6973(C12338 c12338, AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620) {
        this.f18143 = c12338;
        this.f18144 = abstractC12224;
        this.f18142 = predicate;
        this.f18141 = enumC3620;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C14349(this.f18143, this.f18144, this.f18142, this.f18141);
    }
}
