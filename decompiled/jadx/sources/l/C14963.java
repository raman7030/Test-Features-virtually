package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14963 extends AbstractC21315 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable[] f45618;

    public C14963(Iterable[] iterableArr) {
        this.f45618 = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable[] iterableArr = this.f45618;
        return new C5354(new C7908(iterableArr.length, iterableArr));
    }
}
