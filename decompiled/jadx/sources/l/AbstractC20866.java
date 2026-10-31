package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩷۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20866 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f67527 = null;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo24457();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m47680(AbstractC20866 abstractC20866) {
        ArrayList arrayList = abstractC20866.f67527;
        return arrayList == null ? AbstractC14545.of() : arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47681(AbstractC20866 abstractC20866, AbstractC18043 abstractC18043) {
        if (abstractC20866.f67527 == null) {
            abstractC20866.f67527 = new ArrayList(1);
        }
        abstractC20866.f67527.add(abstractC18043);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47682(AbstractC20866 abstractC20866, C15925 c15925) {
        ArrayList arrayList;
        if (abstractC20866 == this || (arrayList = this.f67527) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC18043) it.next()).f56236 = c15925;
        }
        ArrayList arrayList2 = this.f67527;
        RandomAccess randomAccessOf = abstractC20866.f67527;
        if (randomAccessOf == null) {
            randomAccessOf = AbstractC14545.of();
        }
        arrayList2.addAll(randomAccessOf);
        abstractC20866.f67527 = arrayList2;
        this.f67527 = null;
    }
}
