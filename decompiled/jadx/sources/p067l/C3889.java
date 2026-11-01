package p067l;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.֫ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3889 extends C15720 implements ListIterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12607 f8431;

    /* JADX INFO: renamed from: ۧ */
    private ListIterator m7689() {
        m35776();
        return (ListIterator) this.f45545;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3889(C12607 c12607) {
        super(c12607);
        this.f8431 = c12607;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3889(C12607 c12607, int i) {
        super(c12607, ((List) c12607.f26700).listIterator(i));
        this.f8431 = c12607;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m7689().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m7689().previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m7689().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m7689().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m7689().set(obj);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C12607 c12607 = this.f8431;
        boolean zIsEmpty = c12607.isEmpty();
        m7689().add(obj);
        AbstractC17970.m40898(c12607.f35398);
        if (zIsEmpty) {
            c12607.m22580();
        }
    }
}
