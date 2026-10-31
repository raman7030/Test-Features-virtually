package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۧۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10958 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5313 c5313 = (C5313) obj;
        C5313 c5314 = (C5313) obj2;
        int iCompare = Long.compare(c5314.m15230(), c5313.m15230());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(c5314.m15230() + ((long) c5314.m15228()), c5313.m15230() + ((long) c5313.m15228()));
        return iCompare2 != 0 ? iCompare2 : Integer.compare(c5313.m15228(), c5314.m15228());
    }
}
