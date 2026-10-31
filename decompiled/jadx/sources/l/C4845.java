package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4845 implements Iterable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1317 f15309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f15310;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10490 f15311;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10370 f15312;

    public /* synthetic */ C4845(C10490 c10490, AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        this.f15311 = c10490;
        this.f15312 = abstractC10370;
        this.f15310 = predicate;
        this.f15309 = enumC1317;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C12606(this.f15311, this.f15312, this.f15310, this.f15309);
    }
}
