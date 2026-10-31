package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5BA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0352 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f1763;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f1764;

    public C0352(int i, boolean z) {
        this.f1764 = z;
        this.f1763 = new HashSet(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1796(String str) {
        if (!this.f1764) {
            str = str.toLowerCase();
        }
        this.f1763.add(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1797(String str, String str2) {
        if (str2.isEmpty() || str2.contains("\\") || str2.contains("/")) {
            return false;
        }
        if (!this.f1764) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
        }
        if (str.equals(str2)) {
            return true;
        }
        HashSet hashSet = this.f1763;
        if (hashSet.contains(str2)) {
            return false;
        }
        hashSet.remove(str);
        hashSet.add(str2);
        return true;
    }
}
