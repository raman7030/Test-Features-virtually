package p067l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21726 implements Iterable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Predicate f68420;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12338 f68421;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ EnumC3620 f68422;

    public /* synthetic */ C21726(C12338 c12338, EnumC3620 enumC3620, Predicate predicate) {
        this.f68421 = c12338;
        this.f68422 = enumC3620;
        this.f68420 = predicate;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C15019(this.f68421, this.f68422, this.f68420);
    }
}
