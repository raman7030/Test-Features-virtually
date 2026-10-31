package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0852 extends AbstractC21315 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f3334;

    public C0852(Iterable iterable) {
        this.f3334 = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5354(new C18760(((C20877) this.f3334).iterator(), new C16014(8)));
    }
}
