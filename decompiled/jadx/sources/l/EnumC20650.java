package l;

import bin.mt.plus.R;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.᩷ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73J */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20650 {
    ANY(-1, -1),
    ZERO(0, 1),
    ZERO_TO_TEN_KB(0, 10240),
    TEN_KB_TO_ONE_MB(10240, 1048576),
    ONE_TO_TEN_MB(1048576, 10485760),
    TEN_TO_ONE_HUNDRED_MB(10485760, 104857600),
    ONE_HUNDRED_MB_TO_ONE_GB(104857600, 1073741824),
    AT_LEAST_ONE_GB(1073741824, -1);


    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f66418 = {"B", "KB", "MB", "GB", "TB"};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f66425;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f66426;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m47236(long j, long j2) {
        if (j != -1 || j2 == -1) {
            return j;
        }
        return 0L;
    }

    EnumC20650(long j, long j2) {
        this.f66426 = j;
        this.f66425 = j2;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long m47240() {
        return this.f66426;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long m47239() {
        return this.f66425;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m47238() {
        switch (C6538.f20187[ordinal()]) {
            case 1:
                return C4925.m14327(R.string.MT_Protector);
            case 2:
                return m47233(0L);
            case 3:
                return "0 - " + m47233(10240L);
            case 4:
                return m47234(10240L, 1048576L);
            case 5:
                return m47234(1048576L, 10485760L);
            case 6:
                return m47234(10485760L, 104857600L);
            case 7:
                return m47234(104857600L, 1073741824L);
            case 8:
                return "≥ " + m47233(1073741824L);
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20650 m47231(long j, long j2) {
        for (EnumC20650 enumC20650 : values()) {
            if (enumC20650.f66426 == j && enumC20650.f66425 == j2) {
                return enumC20650;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m47232(long j, long j2) {
        EnumC20650 enumC20650M47231 = m47231(j, j2);
        if (enumC20650M47231 != null) {
            return enumC20650M47231.m47238();
        }
        if (j == -1) {
            return "< " + m47229(j2);
        }
        if (j2 == -1) {
            return "≥ " + m47229(j);
        }
        return m47234(j, j2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m47234(long j, long j2) {
        int iM47235 = m47235(j);
        int iM47236 = m47235(j2);
        StringBuilder sbM19190 = C7166.m19190(iM47235 > iM47236 ? m47230(j, iM47236) : m47229(j), " - ");
        sbM19190.append(m47229(j2));
        return sbM19190.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47229(long j) {
        return j == 0 ? "0" : m47233(j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m47233(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j % 1073741824 == 0) {
            return C15942.m37718(new StringBuilder(), j >> 30, "GB");
        }
        if (j % 1048576 == 0) {
            return C15942.m37718(new StringBuilder(), j >> 20, "MB");
        }
        return j % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS == 0 ? C15942.m37718(new StringBuilder(), j >> 10, "KB") : C22927.m51028(j).replace(" ", "");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m47235(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return 0;
        }
        if (j % 1073741824 == 0) {
            return 3;
        }
        if (j % 1048576 == 0) {
            return 2;
        }
        if (j % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS == 0 || j < 1048576) {
            return 1;
        }
        if (j < 1073741824) {
            return 2;
        }
        return j < 1099511627776L ? 3 : 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47230(long j, int i) {
        while (i > 0) {
            long j2 = 1 << (i * 10);
            if (j % j2 == 0) {
                return (j / j2) + f66418[i];
            }
            i--;
        }
        return j + f66418[0];
    }
}
