package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5863 extends AbstractC0615 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16611 f17991;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f17992;

    public C5863(C16611 c16611, List list) {
        this.f17991 = c16611;
        this.f17992 = list;
    }

    @Override // l.AbstractC0615, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        Iterator it;
        C16611 c16611 = this.f17991;
        List listM39128 = c16611.m39128();
        C20846 c20846Mo3570 = c16611.mo3570();
        if (c20846Mo3570 != null) {
            it = c20846Mo3570.m47670();
        } else {
            it = AbstractC6079.of().iterator();
        }
        return new C0259(this.f17992, listM39128, it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17992.size();
    }
}
