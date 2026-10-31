package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19093 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iM37188 = ((C19799) obj).f63950.m37188();
        int iM37189 = ((C19799) obj2).f63950.m37188();
        if (iM37188 < iM37189) {
            return -1;
        }
        return iM37188 > iM37189 ? 1 : 0;
    }
}
