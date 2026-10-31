package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7PB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7652 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C4314 f23628 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f23629;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20458(C2903 c2903) {
        if (((C7652) c2903.m8838(f23628)) == null) {
            new C7652(c2903);
        }
    }

    public C7652(C2903 c2903) {
        c2903.m8841(f23628, this);
        C5931.m16615(c2903);
        C5761.m16208(c2903);
        C15684.m36959(c2903);
        Object[] objArr = {"H1", "H2", "H3", "H4", "H5", "H6", "PRE", "P"};
        HashSet hashSet = new HashSet(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        this.f23629 = C20195.unmodifiableSet(hashSet);
    }
}
