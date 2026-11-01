package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3178 extends AbstractC22626 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterable f6108;

    public C3178(Iterable iterable) {
        this.f6108 = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7457(new C20198(((C22210) this.f6108).iterator(), new C17588(8)));
    }
}
