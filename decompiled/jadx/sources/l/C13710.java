package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 151T */
/* JADX INFO: loaded from: classes3.dex */
public final class C13710 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18842 f40918 = new C10184();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16724 f40917 = new C5950();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20288 m32967(AbstractC23698 abstractC23698) {
        Iterator<E> it = abstractC23698.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            if (((C10184) f40918).apply(it.next())) {
                i2 = i;
            }
            i++;
        }
        if (i2 > -1) {
            return new C22883(abstractC23698, i2);
        }
        return null;
    }
}
