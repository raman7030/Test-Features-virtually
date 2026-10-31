package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18398 {
    OPEN(32),
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f57129;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42829(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC18398) it.next()).f57129;
        }
        return i;
    }

    EnumC18398(int i) {
        this.f57129 = i;
    }
}
