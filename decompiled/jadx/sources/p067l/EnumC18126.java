package p067l;

/* JADX INFO: renamed from: l.ܽۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75W */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18126 {
    NONE,
    EXACT,
    TREE;

    /* JADX INFO: renamed from: ֫ */
    public static EnumC18126 m41309(boolean z) {
        return z ? TREE : EXACT;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m41311(String str) {
        int i = C12763.f35935[ordinal()];
        if (i == 1) {
            C16114.m36694(str);
        } else {
            if (i != 2) {
                return;
            }
            C16114.m36693(str);
        }
    }
}
