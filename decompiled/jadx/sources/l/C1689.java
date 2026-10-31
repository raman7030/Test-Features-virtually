package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes2.dex */
public final class C1689 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f5856;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5857;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f5858;

    public C1689(ArrayList arrayList, HashMap map, HashSet hashSet) {
        this.f5857 = arrayList;
        this.f5858 = map;
        this.f5856 = hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m5688() {
        return this.f5857;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5690(C17667 c17667) {
        return this.f5856.contains(c17667.f54033);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m5689(String str) {
        return (AbstractC15440) this.f5858.get(str);
    }
}
