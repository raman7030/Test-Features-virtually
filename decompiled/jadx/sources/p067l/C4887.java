package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4887 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String strM10472 = C4927.m10472((InterfaceC9116) obj);
        String strM10473 = C4927.m10472((InterfaceC9116) obj2);
        if (strM10472.equals(strM10473)) {
            return 0;
        }
        if ("default".equals(strM10472)) {
            return -1;
        }
        if ("default".equals(strM10473)) {
            return 1;
        }
        return strM10472.compareTo(strM10473);
    }
}
