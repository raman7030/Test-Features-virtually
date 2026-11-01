package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۫᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6PH */
/* JADX INFO: loaded from: classes3.dex */
public final class C14377 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C14377 f41090 = new C14377("", "");

    /* JADX INFO: renamed from: ֫ */
    public final String f41091;

    /* JADX INFO: renamed from: ۧ */
    public final String f41092;

    /* JADX INFO: renamed from: ܽ */
    public final int f41093;

    public C14377(String str, String str2) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                throw new IllegalArgumentException("Base indent must contain only spaces or tabs");
            }
        }
        if (!str2.isEmpty() && !str2.equals("\n") && !str2.equals("\r\n") && !str2.equals("\r")) {
            throw new IllegalArgumentException("Unsupported line ending");
        }
        this.f41093 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
        this.f41091 = str;
        this.f41092 = str2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m32976() {
        return this.f41093;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m32974() {
        return this.f41091;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m32975() {
        return this.f41092;
    }
}
