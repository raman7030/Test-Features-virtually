package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 03CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9860 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC9655 f27345;

    public C9860(AbstractC9655 abstractC9655) {
        this.f27345 = abstractC9655;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Iterator it = this.f27345.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!m23130((AbstractC7783) it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        for (AbstractC7783 abstractC7783 : this.f27345.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            if (!m23130(abstractC7783)) {
                int i2 = i - 1;
                if (i == 0) {
                    return abstractC7783;
                }
                i = i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m23129(AbstractC7783 abstractC7783) {
        return !m23130(abstractC7783);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return this.f27345.mo22455(new C11149(2), EnumC3620.NON_RECURSIVE).iterator();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m23130(AbstractC7783 abstractC7783) {
        return abstractC7783 == null || (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0;
    }
}
