package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N97D */
/* JADX INFO: loaded from: classes4.dex */
public final class C20423 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65887 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f65888 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46829(C21834 c21834) {
        HashMap map = this.f65888;
        if (map.containsKey(c21834)) {
            return;
        }
        map.put(c21834, Integer.valueOf(map.size()));
        this.f65887.add(c21834);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46825(C21834 c21834) {
        Integer num = (Integer) this.f65888.get(c21834);
        C11003.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46827(C10130 c10130) {
        ArrayList arrayList = this.f65887;
        c10130.m25441(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C21834) it.next()).m49204(c10130);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46828(C12951 c12951) {
        int iM31493 = c12951.m31493();
        ArrayList arrayList = this.f65887;
        arrayList.ensureCapacity(iM31493);
        for (int i = 0; i < iM31493; i++) {
            arrayList.add(C21834.m49199(c12951));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m46826(int i) {
        return (C21834) this.f65887.get(i);
    }
}
