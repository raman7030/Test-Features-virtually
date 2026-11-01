package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۤۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C7AH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12100 {

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f33823;

    /* JADX INFO: renamed from: ֫ */
    public static C12100 m27951(String... strArr) {
        HashSet hashSet = new HashSet();
        hashSet.add("2025-11-25");
        for (String str : strArr) {
            C12826.requireNonNull(str, "supportedProtocolVersion");
            hashSet.add(str);
        }
        return new C12100(hashSet);
    }

    public C12100(HashSet hashSet) {
        this.f33823 = hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27952(String str) {
        return this.f33823.contains(str) ? str : "2025-11-25";
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m27953(String str) {
        return this.f33823.contains(str);
    }
}
