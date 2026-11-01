package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7211 implements Iterable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Set f18814;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Iterable f18815;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9794 f18816;

    public /* synthetic */ C7211(C21294 c21294, Iterable iterable, C9794 c9794, Set set) {
        this.f18815 = iterable;
        this.f18816 = c9794;
        this.f18814 = set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3187(this.f18815, this.f18816, this.f18814);
    }
}
