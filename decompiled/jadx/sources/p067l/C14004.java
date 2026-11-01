package p067l;

/* JADX INFO: renamed from: l.۫ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C14004 {

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f39513 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f39512 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: ֫ */
    public static C14674 m31803(C17861 c17861, boolean z) {
        int iM40558 = c17861.m40558(5);
        if (iM40558 == 31) {
            iM40558 = c17861.m40558(6) + 32;
        }
        int iM31802 = m31802(c17861);
        int iM40559 = c17861.m40558(4);
        String strM46922 = C20778.m46922(iM40558, "mp4a.40.");
        if (iM40558 == 5 || iM40558 == 29) {
            iM31802 = m31802(c17861);
            int iM405510 = c17861.m40558(5);
            if (iM405510 == 31) {
                iM405510 = c17861.m40558(6) + 32;
            }
            iM40558 = iM405510;
            if (iM40558 == 22) {
                iM40559 = c17861.m40558(4);
            }
        }
        if (z) {
            if (iM40558 != 1 && iM40558 != 2 && iM40558 != 3 && iM40558 != 4 && iM40558 != 6 && iM40558 != 7 && iM40558 != 17) {
                switch (iM40558) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C10998.m25388("Unsupported audio object type: " + iM40558);
                }
            }
            if (c17861.m40567()) {
                C21334.m48351("Unexpected frameLengthFlag = 1");
            }
            if (c17861.m40567()) {
                c17861.m40566(14);
            }
            boolean zM40567 = c17861.m40567();
            if (iM40559 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM40558 == 6 || iM40558 == 20) {
                c17861.m40566(3);
            }
            if (zM40567) {
                if (iM40558 == 22) {
                    c17861.m40566(16);
                }
                if (iM40558 == 17 || iM40558 == 19 || iM40558 == 20 || iM40558 == 23) {
                    c17861.m40566(3);
                }
                c17861.m40566(1);
            }
            switch (iM40558) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM405511 = c17861.m40558(2);
                    if (iM405511 == 2 || iM405511 == 3) {
                        throw C10998.m25388("Unsupported epConfig: " + iM405511);
                    }
                    break;
            }
        }
        int i = f39512[iM40559];
        if (i != -1) {
            return new C14674(iM31802, i, strM46922);
        }
        throw C10998.m25387((String) null, (Throwable) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31802(C17861 c17861) throws C10998 {
        int iM40558 = c17861.m40558(4);
        if (iM40558 == 15) {
            if (c17861.m40554() < 24) {
                throw C10998.m25387("AAC header insufficient data", (Throwable) null);
            }
            return c17861.m40558(24);
        }
        if (iM40558 < 13) {
            return f39513[iM40558];
        }
        throw C10998.m25387("AAC header wrong Sampling Frequency Index", (Throwable) null);
    }
}
