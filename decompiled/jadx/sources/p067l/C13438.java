package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13438 implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f37734b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37735c;

    public /* synthetic */ C13438(Comparator comparator, Object obj, int i) {
        this.f37733a = i;
        this.f37734b = comparator;
        this.f37735c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f37733a) {
            case 0:
                Comparator comparator = this.f37734b;
                Comparator comparator2 = (Comparator) this.f37735c;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.f37734b;
                Function function = (Function) this.f37735c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
