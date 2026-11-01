package p067l;

/* JADX INFO: renamed from: l.᩺ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24338 extends C19034 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C24338 f77101 = new C24338(0);

    /* JADX INFO: renamed from: ֫ */
    public static C24338 m53699(C24338 c24338, C24338 c24339) {
        if (c24338 == f77101) {
            return c24339;
        }
        int size = c24338.size();
        int size2 = c24339.size();
        C24338 c243310 = new C24338(size + size2);
        for (int i = 0; i < size; i++) {
            c243310.m43241(i, (C13610) c24338.m43238(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c243310.m43241(size + i2, (C13610) c24339.m43238(i2));
        }
        c243310.mo22326();
        return c243310;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C24338 m53700(C24338 c24338, C24338 c24339) {
        C13610 c13610;
        int size = c24338.size();
        C24338 c243310 = new C24338(size);
        for (int i = 0; i < size; i++) {
            C13610 c13610M30962 = (C13610) c24338.m43238(i);
            int size2 = c24339.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    c13610 = null;
                    break;
                }
                c13610 = (C13610) c24339.m43238(i2);
                if (c13610.m30965(c13610M30962)) {
                    break;
                }
                i2++;
            }
            if (c13610 != null) {
                c13610M30962 = c13610M30962.m30962(C13610.m30961(c13610));
            }
            c243310.m43241(i, c13610M30962);
        }
        c243310.mo22326();
        return c243310;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53701(int i, int i2, int i3, C14930 c14930, C14930 c14931, C14930 c14932, int i4) {
        m43241(i, new C13610(i2, i3, c14930, c14931, c14932, i4));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13610 m53702(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C13610 c13610 = (C13610) m43238(i3);
            if (c13610.m30964(i, i2)) {
                return c13610;
            }
        }
        return null;
    }
}
