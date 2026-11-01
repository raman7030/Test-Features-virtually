package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩳۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1KK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19486 {

    /* JADX INFO: renamed from: ۜ */
    public static final Comparator f59362 = C10162.comparing(new C23787(3));

    /* JADX INFO: renamed from: ᩻ */
    public static final Comparator f59363 = C16866.thenComparing(C10162.comparing(new C19073(2)), new C18144(0));

    /* JADX INFO: renamed from: ֫ */
    public int f59364;

    /* JADX INFO: renamed from: ۧ */
    public C12828 f59365;

    /* JADX INFO: renamed from: ܳ */
    public final String f59366;

    /* JADX INFO: renamed from: ܽ */
    public String f59367;

    /* JADX INFO: renamed from: ܿ */
    public C12828 f59368;

    /* JADX INFO: renamed from: ᩳ */
    public int f59369;

    public C19486(String str) {
        C12826.requireNonNull(str);
        this.f59366 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19486.class != obj.getClass()) {
            return false;
        }
        return this.f59366.equals(((C19486) obj).f59366);
    }

    public final int hashCode() {
        return this.f59366.hashCode();
    }
}
