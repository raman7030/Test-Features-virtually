package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C6021 {

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f15085 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f15084 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final void m13532(C23120 c23120) {
        HashMap map = this.f15084;
        if (map.containsKey(c23120)) {
            return;
        }
        ArrayList arrayList = this.f15085;
        map.put(c23120, Integer.valueOf(arrayList.size()));
        arrayList.add(c23120);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m13529() {
        return this.f15085.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m13531(int i) {
        return (C23120) this.f15085.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m13530(C23120 c23120) {
        Integer num = (Integer) this.f15084.get(c23120);
        C12826.requireNonNull(num);
        return num.intValue();
    }
}
