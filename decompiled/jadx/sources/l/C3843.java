package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3843 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12277 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f12276 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11596(C21834 c21834) {
        HashMap map = this.f12276;
        if (map.containsKey(c21834)) {
            return;
        }
        ArrayList arrayList = this.f12277;
        map.put(c21834, Integer.valueOf(arrayList.size()));
        arrayList.add(c21834);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11593() {
        return this.f12277.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m11595(int i) {
        return (C21834) this.f12277.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11594(C21834 c21834) {
        Integer num = (Integer) this.f12276.get(c21834);
        C11003.requireNonNull(num);
        return num.intValue();
    }
}
