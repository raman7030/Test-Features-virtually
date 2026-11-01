package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 151T */
/* JADX INFO: loaded from: classes3.dex */
public final class C15398 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC20276 f43999 = new C12047();

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC18263 f43998 = new C8023();

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC21650 m35081(AbstractC24891 abstractC24891) {
        Iterator<E> it = abstractC24891.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            if (((C12047) f43999).apply(it.next())) {
                i2 = i;
            }
            i++;
        }
        if (i2 > -1) {
            return new C24116(abstractC24891, i2);
        }
        return null;
    }
}
