package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۧۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12783 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C7418 c7418 = (C7418) obj;
        C7418 c7419 = (C7418) obj2;
        int iCompare = Long.compare(c7419.m17136(), c7418.m17136());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(c7419.m17136() + ((long) c7419.m17134()), c7418.m17136() + ((long) c7418.m17134()));
        return iCompare2 != 0 ? iCompare2 : Integer.compare(c7418.m17134(), c7419.m17134());
    }
}
