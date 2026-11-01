package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩷۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22199 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f70213 = null;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo26469();

    /* JADX INFO: renamed from: ֫ */
    public static List m50009(AbstractC22199 abstractC22199) {
        ArrayList arrayList = abstractC22199.f70213;
        return arrayList == null ? AbstractC16192.m36872of() : arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50010(AbstractC22199 abstractC22199, AbstractC19516 abstractC19516) {
        if (abstractC22199.f70213 == null) {
            abstractC22199.f70213 = new ArrayList(1);
        }
        abstractC22199.f70213.add(abstractC19516);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50011(AbstractC22199 abstractC22199, C17503 c17503) {
        ArrayList arrayList;
        if (abstractC22199 == this || (arrayList = this.f70213) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC19516) it.next()).f59438 = c17503;
        }
        ArrayList arrayList2 = this.f70213;
        RandomAccess randomAccessM36872of = abstractC22199.f70213;
        if (randomAccessM36872of == null) {
            randomAccessM36872of = AbstractC16192.m36872of();
        }
        arrayList2.addAll(randomAccessM36872of);
        abstractC22199.f70213 = arrayList2;
        this.f70213 = null;
    }
}
