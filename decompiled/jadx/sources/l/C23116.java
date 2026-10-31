package l;

/* JADX INFO: renamed from: l.᩺ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23116 extends C17535 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C23116 f74357 = new C23116(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23116 m51305(C23116 c23116, C23116 c23117) {
        if (c23116 == f74357) {
            return c23117;
        }
        int size = c23116.size();
        int size2 = c23117.size();
        C23116 c23118 = new C23116(size + size2);
        for (int i = 0; i < size; i++) {
            c23118.m40981(i, (C11828) c23116.m40978(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c23118.m40981(size + i2, (C11828) c23117.m40978(i2));
        }
        c23118.mo20349();
        return c23118;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23116 m51306(C23116 c23116, C23116 c23117) {
        C11828 c11828;
        int size = c23116.size();
        C23116 c23118 = new C23116(size);
        for (int i = 0; i < size; i++) {
            C11828 c11828M28912 = (C11828) c23116.m40978(i);
            int size2 = c23117.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    c11828 = null;
                    break;
                }
                c11828 = (C11828) c23117.m40978(i2);
                if (c11828.m28915(c11828M28912)) {
                    break;
                }
                i2++;
            }
            if (c11828 != null) {
                c11828M28912 = c11828M28912.m28912(C11828.m28911(c11828));
            }
            c23118.m40981(i, c11828M28912);
        }
        c23118.mo20349();
        return c23118;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51307(int i, int i2, int i3, C13217 c13217, C13217 c13218, C13217 c13219, int i4) {
        m40981(i, new C11828(i2, i3, c13217, c13218, c13219, i4));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11828 m51308(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C11828 c11828 = (C11828) m40978(i3);
            if (c11828.m28914(i, i2)) {
                return c11828;
            }
        }
        return null;
    }
}
