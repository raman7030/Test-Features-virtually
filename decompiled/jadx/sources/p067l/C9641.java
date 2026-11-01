package p067l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7PB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9641 {

    /* JADX INFO: renamed from: ۧ */
    public static final C6468 f26542 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final Set f26543;

    /* JADX INFO: renamed from: ֫ */
    public static void m22438(C5127 c5127) {
        if (((C9641) c5127.m10905(f26542)) == null) {
            new C9641(c5127);
        }
    }

    public C9641(C5127 c5127) {
        c5127.m10908(f26542, this);
        C8005.m18541(c5127);
        C7843.m18127(c5127);
        C17274.m39125(c5127);
        Object[] objArr = {"H1", "H2", "H3", "H4", "H5", "H6", "PRE", "P"};
        HashSet hashSet = new HashSet(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        this.f26543 = C21562.unmodifiableSet(hashSet);
    }
}
