package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 03CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7883 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC7667 f24429;

    public C7883(AbstractC7667 abstractC7667) {
        this.f24429 = abstractC7667;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Iterator it = this.f24429.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!m21165((AbstractC5698) it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        for (AbstractC5698 abstractC5698 : this.f24429.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (!m21165(abstractC5698)) {
                int i2 = i - 1;
                if (i == 0) {
                    return abstractC5698;
                }
                i = i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m21164(AbstractC5698 abstractC5698) {
        return !m21165(abstractC5698);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return this.f24429.mo20475(new C9239(2), EnumC1317.NON_RECURSIVE).iterator();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m21165(AbstractC5698 abstractC5698) {
        return abstractC5698 == null || (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0;
    }
}
