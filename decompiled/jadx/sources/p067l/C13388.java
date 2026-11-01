package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 151T */
/* JADX INFO: loaded from: classes4.dex */
public final class C13388 extends AbstractC2953 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C24116 f37572;

    public C13388(C24116 c24116) {
        this.f37572 = c24116;
    }

    @Override // p067l.AbstractC2953, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C24116 c24116 = this.f37572;
        return AbstractC22626.m50683(c24116.f76532).m50684(c24116.f76531 + 1).m50685(C15398.f43998).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37572.f76531 + 1;
    }
}
