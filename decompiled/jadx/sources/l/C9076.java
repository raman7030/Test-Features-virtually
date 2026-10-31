package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۡᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9076 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C4574 c4574 = (C4574) obj;
        C4574 c4575 = (C4574) obj2;
        int i = C18954.f59772;
        boolean zStartsWith = c4574.m13432().startsWith("_");
        if (zStartsWith == c4575.m13432().startsWith("_")) {
            return c4574.m13432().compareToIgnoreCase(c4575.m13432());
        }
        return zStartsWith ? 1 : -1;
    }
}
