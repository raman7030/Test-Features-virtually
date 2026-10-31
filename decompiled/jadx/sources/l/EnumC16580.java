package l;

/* JADX INFO: renamed from: l.ܽۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z75W */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16580 {
    NONE,
    EXACT,
    TREE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC16580 m39083(boolean z) {
        return z ? TREE : EXACT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m39085(String str) {
        int i = C10937.f32957[ordinal()];
        if (i == 1) {
            C14463.m34560(str);
        } else {
            if (i != 2) {
                return;
            }
            C14463.m34559(str);
        }
    }
}
