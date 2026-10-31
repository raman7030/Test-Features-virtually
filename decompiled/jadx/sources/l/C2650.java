package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2650 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String strM8426 = C2692.m8426((InterfaceC7099) obj);
        String strM8427 = C2692.m8426((InterfaceC7099) obj2);
        if (strM8426.equals(strM8427)) {
            return 0;
        }
        if ("default".equals(strM8426)) {
            return -1;
        }
        if ("default".equals(strM8427)) {
            return 1;
        }
        return strM8426.compareTo(strM8427);
    }
}
