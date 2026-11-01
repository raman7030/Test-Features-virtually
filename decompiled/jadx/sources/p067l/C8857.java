package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۜܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1ES */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8857 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C23198 c23198 = (C23198) obj;
        C23198 c23199 = (C23198) obj2;
        int iCompare = Integer.compare(c23198.f72882, c23199.f72882);
        return iCompare != 0 ? iCompare : Integer.compare(c23199.f72881, c23198.f72881);
    }
}
