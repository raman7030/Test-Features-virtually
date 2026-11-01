package p067l;

/* JADX INFO: renamed from: l.۫۠ */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C1451 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean[] f39578 = new boolean[3];

    /* JADX INFO: renamed from: ֫ */
    public static final boolean m31868(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31867(C1906 c1906, C1696 c1696, C1591 c1591) {
        c1591.f49288 = -1;
        C1101 c1101 = c1591.f49246;
        C1101 c1102 = c1591.f49253;
        C1101 c1103 = c1591.f49281;
        C1101 c1104 = c1591.f49279;
        C1101 c1105 = c1591.f49261;
        c1591.f49250 = -1;
        EnumC1241 enumC1241 = c1906.f49244[0];
        EnumC1241 enumC1242 = EnumC1241.WRAP_CONTENT;
        if (enumC1241 != enumC1242 && c1591.f49244[0] == EnumC1241.MATCH_PARENT) {
            int i = c1105.f19183;
            int iM37911 = c1906.m37911() - c1104.f19183;
            c1105.f19186 = c1696.m42742(c1105);
            c1104.f19186 = c1696.m42742(c1104);
            c1696.m42745(c1105.f19186, i);
            c1696.m42745(c1104.f19186, iM37911);
            c1591.f49288 = 2;
            c1591.f49283 = i;
            int i2 = iM37911 - i;
            c1591.f49289 = i2;
            int i3 = c1591.f49285;
            if (i2 < i3) {
                c1591.f49289 = i3;
            }
        }
        if (c1906.f49244[1] == enumC1242 || c1591.f49244[1] != EnumC1241.MATCH_PARENT) {
            return;
        }
        int i4 = c1103.f19183;
        int iM37890 = c1906.m37890() - c1102.f19183;
        c1103.f19186 = c1696.m42742(c1103);
        c1102.f19186 = c1696.m42742(c1102);
        c1696.m42745(c1103.f19186, i4);
        c1696.m42745(c1102.f19186, iM37890);
        if (c1591.f49284 > 0 || c1591.m37893() == 8) {
            C1626 c1626M42742 = c1696.m42742(c1101);
            c1101.f19186 = c1626M42742;
            c1696.m42745(c1626M42742, c1591.f49284 + i4);
        }
        c1591.f49250 = 2;
        c1591.f49241 = i4;
        int i5 = iM37890 - i4;
        c1591.f49230 = i5;
        int i6 = c1591.f49247;
        if (i5 < i6) {
            c1591.f49230 = i6;
        }
    }
}
