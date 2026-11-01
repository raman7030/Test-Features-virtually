package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩵ۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6OE */
/* JADX INFO: loaded from: classes4.dex */
public final class C20651 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C20651 f63778 = new C20651("", "");

    /* JADX INFO: renamed from: ֫ */
    public final String f63779;

    /* JADX INFO: renamed from: ۧ */
    public final String f63780;

    /* JADX INFO: renamed from: ܽ */
    public final int f63781;

    public C20651(String str, String str2) {
        if (!str2.isEmpty() && !str2.equals("\n") && !str2.equals("\r\n") && !str2.equals("\r")) {
            throw new IllegalArgumentException("Unsupported line ending");
        }
        this.f63780 = str2;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                throw new IllegalArgumentException("Base indent must contain only spaces or tabs");
            }
        }
        this.f63781 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
        this.f63779 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m46665() {
        return this.f63780;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m46666() {
        return this.f63781;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m46664() {
        return this.f63779;
    }
}
