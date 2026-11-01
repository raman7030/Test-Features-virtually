package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7940 extends AbstractC2953 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18155 f20844;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ List f20845;

    public C7940(C18155 c18155, List list) {
        this.f20844 = c18155;
        this.f20845 = list;
    }

    @Override // p067l.AbstractC2953, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        Iterator it;
        C18155 c18155 = this.f20844;
        List listM41355 = c18155.m41355();
        C22180 c22180Mo5857 = c18155.mo5857();
        if (c22180Mo5857 != null) {
            it = c22180Mo5857.m49998();
        } else {
            it = AbstractC8146.m18915of().iterator();
        }
        return new C2614(this.f20845, listM41355, it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20845.size();
    }
}
