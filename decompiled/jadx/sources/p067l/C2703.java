package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5BA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2703 {

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f4539;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f4540;

    public C2703(int i, boolean z) {
        this.f4540 = z;
        this.f4539 = new HashSet(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4195(String str) {
        if (!this.f4540) {
            str = str.toLowerCase();
        }
        this.f4539.add(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4196(String str, String str2) {
        if (str2.isEmpty() || str2.contains("\\") || str2.contains("/")) {
            return false;
        }
        if (!this.f4540) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
        }
        if (str.equals(str2)) {
            return true;
        }
        HashSet hashSet = this.f4539;
        if (hashSet.contains(str2)) {
            return false;
        }
        hashSet.remove(str);
        hashSet.add(str2);
        return true;
    }
}
