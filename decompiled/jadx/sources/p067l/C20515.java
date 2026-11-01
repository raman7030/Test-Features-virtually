package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20515 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iM39358 = ((C21186) obj).f66587.m39358();
        int iM39359 = ((C21186) obj2).f66587.m39358();
        if (iM39358 < iM39359) {
            return -1;
        }
        return iM39358 > iM39359 ? 1 : 0;
    }
}
