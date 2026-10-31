package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۫᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6PH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12635 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12635 f38064 = new C12635("", "");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f38065;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f38066;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38067;

    public C12635(String str, String str2) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                throw new IllegalArgumentException("Base indent must contain only spaces or tabs");
            }
        }
        if (!str2.isEmpty() && !str2.equals("\n") && !str2.equals("\r\n") && !str2.equals("\r")) {
            throw new IllegalArgumentException("Unsupported line ending");
        }
        this.f38067 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
        this.f38065 = str;
        this.f38066 = str2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m30898() {
        return this.f38067;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30896() {
        return this.f38065;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m30897() {
        return this.f38066;
    }
}
