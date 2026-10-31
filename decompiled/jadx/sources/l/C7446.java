package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7446 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C17102 c17102 = (C17102) obj;
        C17102 c17103 = (C17102) obj2;
        C16809 c16809 = ((C14833) c17102.m40123()).f45243;
        C16809 c168010 = ((C14833) c17103.m40123()).f45243;
        if (c16809 == null || c168010 == null) {
            if (c16809 == null && c168010 == null) {
                return c17102.m40118().compareTo(c17103.m40118());
            }
            return c16809 != null ? -1 : 1;
        }
        int i = c16809.f51604;
        int i2 = c168010.f51604;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        if (i2 == 0) {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.compare(i, i2);
    }
}
