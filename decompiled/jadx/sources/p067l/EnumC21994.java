package p067l;

import bin.p000mt.plus.R;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.᩷ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73J */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21994 {
    ANY(-1, -1),
    ZERO(0, 1),
    ZERO_TO_TEN_KB(0, 10240),
    TEN_KB_TO_ONE_MB(10240, 1048576),
    ONE_TO_TEN_MB(1048576, 10485760),
    TEN_TO_ONE_HUNDRED_MB(10485760, 104857600),
    ONE_HUNDRED_MB_TO_ONE_GB(104857600, 1073741824),
    AT_LEAST_ONE_GB(1073741824, -1);


    /* JADX INFO: renamed from: ۤ */
    public static final String[] f69098 = {"B", "KB", "MB", "GB", "TB"};

    /* JADX INFO: renamed from: ᩸ */
    public final long f69105;

    /* JADX INFO: renamed from: ᩹ */
    public final long f69106;

    /* JADX INFO: renamed from: ᩳ */
    public static long m49563(long j, long j2) {
        if (j != -1 || j2 == -1) {
            return j;
        }
        return 0L;
    }

    EnumC21994(long j, long j2) {
        this.f69106 = j;
        this.f69105 = j2;
    }

    /* JADX INFO: renamed from: ܿ */
    public long m49567() {
        return this.f69106;
    }

    /* JADX INFO: renamed from: ۧ */
    public long m49566() {
        return this.f69105;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m49565() {
        switch (C8582.f23065[ordinal()]) {
            case 1:
                return C7050.m16224(R.string.MT_Protector);
            case 2:
                return m49560(0L);
            case 3:
                return "0 - " + m49560(10240L);
            case 4:
                return m49561(10240L, 1048576L);
            case 5:
                return m49561(1048576L, 10485760L);
            case 6:
                return m49561(10485760L, 104857600L);
            case 7:
                return m49561(104857600L, 1073741824L);
            case 8:
                return "≥ " + m49560(1073741824L);
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC21994 m49558(long j, long j2) {
        for (EnumC21994 enumC21994 : values()) {
            if (enumC21994.f69106 == j && enumC21994.f69105 == j2) {
                return enumC21994;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m49559(long j, long j2) {
        EnumC21994 enumC21994M49558 = m49558(j, j2);
        if (enumC21994M49558 != null) {
            return enumC21994M49558.m49565();
        }
        if (j == -1) {
            return "< " + m49556(j2);
        }
        if (j2 == -1) {
            return "≥ " + m49556(j);
        }
        return m49561(j, j2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m49561(long j, long j2) {
        int iM49562 = m49562(j);
        int iM49563 = m49562(j2);
        StringBuilder sbM21133 = C9179.m21133(iM49562 > iM49563 ? m49557(j, iM49563) : m49556(j), " - ");
        sbM21133.append(m49556(j2));
        return sbM21133.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m49556(long j) {
        return j == 0 ? "0" : m49560(j);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m49560(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j % 1073741824 == 0) {
            return C17520.m39893(new StringBuilder(), j >> 30, "GB");
        }
        if (j % 1048576 == 0) {
            return C17520.m39893(new StringBuilder(), j >> 20, "MB");
        }
        return j % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS == 0 ? C17520.m39893(new StringBuilder(), j >> 10, "KB") : C24158.m53419(j).replace(" ", "");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m49562(long j) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m49557(long j, int i) {
        while (i > 0) {
            long j2 = 1 << (i * 10);
            if (j % j2 == 0) {
                return (j / j2) + f69098[i];
            }
            i--;
        }
        return j + f69098[0];
    }
}
