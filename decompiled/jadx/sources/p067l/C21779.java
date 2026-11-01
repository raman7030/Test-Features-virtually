package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N97D */
/* JADX INFO: loaded from: classes4.dex */
public final class C21779 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f68562 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f68563 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final void m49152(C23120 c23120) {
        HashMap map = this.f68563;
        if (map.containsKey(c23120)) {
            return;
        }
        map.put(c23120, Integer.valueOf(map.size()));
        this.f68562.add(c23120);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49148(C23120 c23120) {
        Integer num = (Integer) this.f68563.get(c23120);
        C12826.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49150(C11996 c11996) {
        ArrayList arrayList = this.f68562;
        c11996.m27461(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C23120) it.next()).m51555(c11996);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49151(C14677 c14677) {
        int iM33580 = c14677.m33580();
        ArrayList arrayList = this.f68562;
        arrayList.ensureCapacity(iM33580);
        for (int i = 0; i < iM33580; i++) {
            arrayList.add(C23120.m51550(c14677));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m49149(int i) {
        return (C23120) this.f68562.get(i);
    }
}
