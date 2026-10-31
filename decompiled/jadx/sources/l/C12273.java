package l;

/* JADX INFO: renamed from: l.۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12273 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean[] f36562 = new boolean[3];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m29806(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29805(C21446 c21446, C17212 c17212, C15094 c15094) {
        c15094.f46168 = -1;
        C5218 c5218 = c15094.f46126;
        C5218 c5219 = c15094.f46133;
        C5218 c52110 = c15094.f46161;
        C5218 c52111 = c15094.f46159;
        C5218 c52112 = c15094.f46141;
        c15094.f46130 = -1;
        EnumC8040 enumC8040 = c21446.f46124[0];
        EnumC8040 enumC8041 = EnumC8040.WRAP_CONTENT;
        if (enumC8040 != enumC8041 && c15094.f46124[0] == EnumC8040.MATCH_PARENT) {
            int i = c52112.f16343;
            int iM35753 = c21446.m35753() - c52111.f16343;
            c52112.f16346 = c17212.m40495(c52112);
            c52111.f16346 = c17212.m40495(c52111);
            c17212.m40498(c52112.f16346, i);
            c17212.m40498(c52111.f16346, iM35753);
            c15094.f46168 = 2;
            c15094.f46163 = i;
            int i2 = iM35753 - i;
            c15094.f46169 = i2;
            int i3 = c15094.f46165;
            if (i2 < i3) {
                c15094.f46169 = i3;
            }
        }
        if (c21446.f46124[1] == enumC8041 || c15094.f46124[1] != EnumC8040.MATCH_PARENT) {
            return;
        }
        int i4 = c52110.f16343;
        int iM35732 = c21446.m35732() - c5219.f16343;
        c52110.f16346 = c17212.m40495(c52110);
        c5219.f16346 = c17212.m40495(c5219);
        c17212.m40498(c52110.f16346, i4);
        c17212.m40498(c5219.f16346, iM35732);
        if (c15094.f46164 > 0 || c15094.m35735() == 8) {
            C15800 c15800M40495 = c17212.m40495(c5218);
            c5218.f16346 = c15800M40495;
            c17212.m40498(c15800M40495, c15094.f46164 + i4);
        }
        c15094.f46130 = 2;
        c15094.f46121 = i4;
        int i5 = iM35732 - i4;
        c15094.f46110 = i5;
        int i6 = c15094.f46127;
        if (i5 < i6) {
            c15094.f46110 = i6;
        }
    }
}
