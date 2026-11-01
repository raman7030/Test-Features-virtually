package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20118 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C17434 c17434 = (C17434) obj;
        C17434 c17435 = (C17434) obj2;
        boolean z = c17434.f52109;
        String str = c17434.f52107;
        boolean z2 = c17435.f52109;
        String str2 = c17435.f52107;
        if (z != z2) {
            return z ? -1 : 1;
        }
        if (str.equals("..")) {
            return -1;
        }
        if (str2.equals("..")) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}
