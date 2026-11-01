package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۡᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10995 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C6716 c6716 = (C6716) obj;
        C6716 c6717 = (C6716) obj2;
        int i = C20383.f63001;
        boolean zStartsWith = c6716.m15320().startsWith("_");
        if (zStartsWith == c6717.m15320().startsWith("_")) {
            return c6716.m15320().compareToIgnoreCase(c6717.m15320());
        }
        return zStartsWith ? 1 : -1;
    }
}
