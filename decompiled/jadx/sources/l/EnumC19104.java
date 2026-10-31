package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19104 {
    DO_NOT_RESOLVE_BY_DEFAULT(1),
    WARN_DEPRECATED(2),
    WARN_DEPRECATED_REMOVAL(4),
    WARN_INCUBATING(8);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f60184;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44032(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC19104) it.next()).f60184;
        }
        return i;
    }

    EnumC19104(int i) {
        this.f60184 = i;
    }
}
