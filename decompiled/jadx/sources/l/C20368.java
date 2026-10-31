package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20368 implements Iterable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f65744;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10490 f65745;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1317 f65746;

    public /* synthetic */ C20368(C10490 c10490, EnumC1317 enumC1317, Predicate predicate) {
        this.f65745 = c10490;
        this.f65746 = enumC1317;
        this.f65744 = predicate;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C13311(this.f65745, this.f65746, this.f65744);
    }
}
