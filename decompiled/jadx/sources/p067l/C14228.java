package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۫ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14228 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((C14898) obj).m34107().f41076.f18866;
        int i2 = ((C14898) obj2).m34107().f41076.f18866;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
