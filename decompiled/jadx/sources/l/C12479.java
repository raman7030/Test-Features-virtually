package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12479 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((C13184) obj).m32009().f38050.f16032;
        int i2 = ((C13184) obj2).m32009().f38050.f16032;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
