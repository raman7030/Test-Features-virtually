package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֨ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1198 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C8254 c8254 = (C8254) obj;
        C8254 c8255 = (C8254) obj2;
        if (c8254.m21839() != c8255.m21839()) {
            return c8254.m21839() ? -1 : 1;
        }
        return c8254.m21840().compareTo(c8255.m21840());
    }
}
